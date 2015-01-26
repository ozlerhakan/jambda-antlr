package jambda.lang.builder;

import jambda.lang.def.JambdaParser;
import jambda.lang.exception.NoSuchNameException;
import jambda.lang.symbol.MethodSymbol;
import jambda.lang.symbol.Scope;
import jambda.lang.symbol.Symbol;
import jambda.lang.symbol.VariableSymbol;

import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.StringJoiner;

/**
 * Created by Hakan on 1/12/2015.
 */
public class JavaBuilder extends Builder {

    private String returnExist = "";

    public JavaBuilder(StringBuilder builder) {
        super(builder);
    }

    @Override
    public Builder addIfStatement(JambdaParser.IfStatementContext ctx) {
        super.appendIF().appendLPAREN()          // if (
             .append(ctx.expression().getText())
             .appendRPAREN().appendNewLine();    // )\n
        return this;
    }

    public Builder enterClassBody() {
        super.appendLCBRACKET().appendNewLine();
        return this;
    }

    public Builder exitClassBody() {
        super.appendRCBRACKET().appendNewLine();
        return this;
    }

    public Builder enterMethodBody() {
        super.appendLCBRACKET().appendNewLine();
        return this;
    }

    public Builder exitMethodBody(int depth) {
        super.appendTab(depth).appendRCBRACKET().appendNewLine(); // }\n
        return this;
    }

    public Builder enterMethodDeclarator(String id) {
        // give an id for replacing the related type later on in the method called this.setReturnTypeOfMethodDec
        // same for the method ID will be replaced by its name
        super.append("<RETURN1>").appendSpace().append(id);
        super.appendLPAREN(); // i.e. <RETURN1> ID (
        return this;
    }

    public Builder exitMethodDeclarator(){
        super.appendRPAREN();
        return this;
    }

    public Builder enterSuperInterfaces(String imp) {
        super.append(imp).appendSpace();
        return this;
    }

    public Builder enterVariableDeclarator(String name) {
        super.appendSpace().append(name);
        return this;
    }

    public Builder exitCollectionType(JambdaParser.CollectionTypeContext ctx) {
        // we do not get the types of the declared arraylists
        // we set a name called <AR1LST> to replace it when obtaining its type afterwards
        if (Objects.nonNull(ctx.ARRAYLIST()))
            super.append("<AR1LST>");
        return this;
    }

    public Builder exitFieldModifier(List<JambdaParser.FieldModifierContext> ctx) {
        ctx.forEach(modifier -> {
            super.append(modifier.getText()).appendSpace();
        });
        return this;
    }

    public Builder exitObjectDeclaration(JambdaParser.ObjectDeclarationContext ctx){
        super.append(ctx.typeName().IDENTIFIER().getText())
             .appendSpace()
             .append(ctx.objName().IDENTIFIER().getText())
             .appendEqual().append("new").appendSpace()
             .append(ctx.typeName().IDENTIFIER().getText()).appendLPAREN().appendRPAREN().appendSemiColonAndNewLine();
        return this;
    }

    public Builder enterSuperClass(JambdaParser.SuperClassContext ctx) {
        StringJoiner joiner = new StringJoiner(" ");
        joiner.add(ctx.EXTENDS().getText());
        joiner.add(ctx.IDENTIFIER().getText());
        super.append(joiner).appendSpace();
        return this;
    }

    @Override
    public Builder enterFieldDeclaration(String type,JambdaParser.FieldDeclarationContext ctx) {
        this.exitFieldModifier(ctx.fieldModifier()).append(type);
        return this;
    }

    public Builder enterInterfaceTypeList(JambdaParser.InterfaceTypeListContext ctx) {
        StringJoiner joiner = new StringJoiner(", ");
        ctx.IDENTIFIER().forEach(item -> joiner.add(item.getText()));
        super.append(joiner).appendSpace();
        return this;
    }

    public Builder exitPackageDeclaration(JambdaParser.PackageDeclarationContext ctx) {
        StringBuilder importSb = new StringBuilder(ctx.PACKAGE().getText()).append(" ");
        StringJoiner joiner = new StringJoiner(".");
        ctx.IDENTIFIER().forEach(item -> joiner.add(item.getText()));
        super.append(importSb.append(joiner)).appendSemiColonAndNewLine();
        return this;
    }

    public Builder exitPostIncrementExpression(JambdaParser.PostIncrementExpressionContext ctx, Optional<Scope> currentScope) {
        try {
            Symbol sym = currentScope.flatMap(scope -> scope.resolve(ctx.IDENTIFIER().getText()))
                                     .orElseThrow(() -> new NoSuchNameException(ctx.IDENTIFIER()));
            super.append(sym.getSymbolName());
        } catch (NoSuchNameException ex) {
        }
        super.append("++").appendSemiColonAndNewLine();
        return this;
    }

    public Builder exitTypeImportOnDemandDeclaration(JambdaParser.TypeImportOnDemandDeclarationContext ctx) {
        StringBuilder importSb = new StringBuilder(ctx.IMPORT().getText()).append(" ");
        StringJoiner joiner = new StringJoiner(".");
        ctx.IDENTIFIER().forEach(item -> joiner.add(item.getText()));
        if (Objects.nonNull(ctx.STAR()))
            joiner.add("*");
        super.append(importSb.append(joiner)).appendSemiColonAndNewLine();
        return this;
    }

    public Builder enterClassDeclaration(JambdaParser.ClassDeclarationContext ctx) {
        StringJoiner joiner = new StringJoiner(" ");
        if (Objects.nonNull(ctx.PUBLIC()))
            joiner.add(ctx.PUBLIC().getText());
        joiner.add(ctx.CLASS().getText());
        joiner.add(ctx.IDENTIFIER().getText());
        super.append(joiner).appendSpace();
        return this;
    }

    public Builder enterVariableAssignment(JambdaParser.VariableAssignmentContext ctx, Optional<Scope> currentScope, VariableSymbol varSymbol) {
        super.appendEqual();
        JambdaParser.VariableInitializerContext variable = ctx.variableInitializer();

        if (Objects.nonNull(variable.IDENTIFIER())) {
            try {
                Symbol sym = currentScope.flatMap(scope -> scope.resolve(variable.IDENTIFIER().getText()))
                                         .orElseThrow(() -> new NoSuchNameException(variable.IDENTIFIER()));
                super.append(sym.getSymbolName());
            } catch (NoSuchNameException ex) {
            }
        } else if (Objects.nonNull(variable.collectionInitializer())) {
            JambdaParser.CollectionInitializerContext collection = variable.collectionInitializer();
            super.append("new ArrayList<>()");

            currentScope.flatMap(scope -> scope.resolve(collection.type().getText())).ifPresent(s -> {
                super.replace("AR1LST", s.getTypeClass());
                varSymbol.setSymbolType(s.getTypeClass());
            });
        } else {
            // number, string, boolean, char
            super.append(variable.getText());
        }
        super.appendSemiColonAndNewLine();
        return this;
    }

    public Builder exitMethodDeclaration(MethodSymbol methodSymbol) {
        if (!returnExist.equals("")) {
            if (methodSymbol.getSymbolName().equals("execution[String...]"))
                throw new RuntimeException("Cannot set a return type for the execution method");

            super.replace(methodSymbol.getAddress(), methodSymbol.getPrefixName())
                 .replace("<RETURN1>", returnExist);
            returnExist = "";
        } else {
            if (methodSymbol.getSymbolName().equals("execution[String...]"))
                super.replace(methodSymbol.getAddress(), "main")
                     .replace("<RETURN1>", "public static void");
            else
                super.replace(methodSymbol.getAddress(), methodSymbol.getPrefixName())
                     .replace("<RETURN1>", "void");
        }
        return this;
    }

    public Builder enterReturnStatement(JambdaParser.ReturnStatementContext ctx, int depth, Optional<Scope> currentScope) {
        super.appendTab(depth);

        super.append("return");
        if (Objects.nonNull(ctx.IDENTIFIER())) {
            try {
                Symbol sym = currentScope.flatMap(scope -> scope.resolve(ctx.IDENTIFIER().getText()))
                                         .orElseThrow(() -> new NoSuchNameException(ctx.IDENTIFIER()));
                super.appendSpace().append(sym.getSymbolName());
                returnExist = sym.getSymbolType();
            } catch (NoSuchNameException ex) {
            }
        }
        super.appendSemiColonAndNewLine();
        return this;
    }

    public Builder enterFormalParameters(JambdaParser.FormalParametersContext ctx, Optional<Scope> currentScope, MethodSymbol methodSymbol){
        StringJoiner joiner = new StringJoiner(", ");
        ctx.formalParameter().forEach(param -> {
            StringBuilder builder = new StringBuilder();
            String type = param.type().getText();

            if (currentScope.flatMap(scope -> scope.resolve(param.type().getText())).isPresent())
                type = currentScope.flatMap(scope -> scope.resolve(param.type().getText())).get().getSymbolType();

            if (Objects.nonNull(param.ELLIPSIS()))
                type += param.ELLIPSIS().getText();

            builder.append(type);

            methodSymbol.addParam(param.IDENTIFIER().getText(), type);
            builder.append(" ").append(param.IDENTIFIER().getText());
            joiner.add(builder);
        });
        super.append(joiner);
        return this;
    }

    public Builder enterMethodInvoke(JambdaParser.MethodInvokeContext ctx, int depth, Optional<Scope> currentScope) {
        StringJoiner outerJoiner = new StringJoiner(".");
        if (Objects.nonNull(ctx.methodTypeRef())) {
            outerJoiner.add(ctx.methodTypeRef().typeName().IDENTIFIER().getText());
            ctx.methodTypeRef().methodTypeRef().forEach(t->{
                outerJoiner.add(t.typeName().IDENTIFIER().getText());
            });
        }
        String methodName = ctx.methodName().IDENTIFIER().getText();
        declareMethodName(outerJoiner, methodName, currentScope);

        super.append(outerJoiner).appendLPAREN();
        if (Objects.nonNull(ctx.argumentList()))
            declareArgumentList(ctx.argumentList(), methodName);
        super.appendRPAREN().appendSemiColonAndNewLine();

        if (Objects.nonNull(ctx.methodCurrying()))
            ctx.methodCurrying().forEach(cry -> declareMethodCurrying(cry, outerJoiner, methodName, depth));
        return this;

    }

    private void declareMethodCurrying(JambdaParser.MethodCurryingContext ctx, StringJoiner outerJoiner, String methodName, int depth) {
        super.appendTab(depth);
        super.append(outerJoiner);
        super.appendLPAREN();
        if (Objects.nonNull(ctx.argumentList()))
            declareArgumentList(ctx.argumentList(), methodName);
        super.appendRPAREN().appendSemiColonAndNewLine();
    }

    private void declareMethodName(StringJoiner outerJoiner, String methodName, Optional<Scope> currentScope) {
        if (currentScope.flatMap(scope -> scope.resolve(methodName)).isPresent())
            outerJoiner.add(currentScope.flatMap(scope -> scope.resolve(methodName)).get().getSymbolType());
        else {
            if (methodName.equals("each") || methodName.equals("eachPrintln"))
                outerJoiner.add("forEach");
            else
                outerJoiner.add(methodName);
        }
    }

    private void declareArgumentList(JambdaParser.ArgumentListContext ctx, String methodName) {

        if (Objects.nonNull(ctx.methodCallParams())) {
            StringJoiner innerJoiner = new StringJoiner(", ");
            innerJoiner.add(ctx.methodCallParams().literalName().getText());
            ctx.methodCallParams().methodCallParams().forEach(param -> innerJoiner.add(param.getText()));
            super.append(innerJoiner);
        } else if (Objects.nonNull(ctx.methodReference())) {

            super.append("item -> {");
            if (methodName.equals("each"))
                super.append(ctx.methodReference().typeName().IDENTIFIER().getText()).appendDOT() // e.g. this.
                        .append(ctx.methodReference().methodName().IDENTIFIER().getText()) // e.g. myMethod
                        .appendLPAREN().append("item").appendRPAREN().appendSemiColon(); // e.g. (item);
            // result : this.myMethod(item);
            super.appendRCBRACKET();

        } else if (Objects.nonNull(ctx.lambdaExpression())) {
            super.append(ctx.lambdaExpression().prefixName().IDENTIFIER().getText()).append(" -> {"); // e.g. item -> {

            if (methodName.equals("eachPrintln"))
                super.append("System.out.println");
            else if (methodName.equals("eachPrint"))
                super.append("System.out.print");

            super.appendLPAREN().append(ctx.lambdaExpression().outputStream().getText())
                    .appendRPAREN().appendSemiColon().appendRCBRACKET(); // e.g. System.out.print(ln)(item+":"+name);}
        }

    }
}
