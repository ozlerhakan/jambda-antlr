package jambda.lang.ast;

import jambda.lang.builder.Builder;
import jambda.lang.def.JambdaBaseListener;
import jambda.lang.def.JambdaParser;
import jambda.lang.handler.Error;
import jambda.lang.handler.ExceptionTracker;
import jambda.lang.symbol.*;
import org.antlr.v4.runtime.misc.NotNull;

import java.util.Map;
import java.util.Objects;
import java.util.Optional;

/**
 * Created by Hakan on 11/01/2015.
 */
public class ASTNativeListener extends JambdaBaseListener {

    protected Builder builder;
    protected byte NESTED_DEPTH = 0;
    protected VariableSymbol varSymbol;
    protected MethodSymbol methodSymbol;
    protected Optional<Scope> currentScope = Optional.empty();

    public ASTNativeListener(Builder builder) {
        this.builder = builder;
    }

    @Override
    public void enterClassBody(@NotNull JambdaParser.ClassBodyContext ctx) {
        NESTED_DEPTH++;
        builder.enterClassBody();

        currentScope = Optional.of(currentScope.orElse(new GlobalScope())); // Push
    }

    @Override
    public void exitClassBody(@NotNull JambdaParser.ClassBodyContext ctx) {
        NESTED_DEPTH--;
        builder.exitClassBody();

        currentScope = currentScope.flatMap(Scope::getEnclosingScope); // Pop
        // currentScope will be empty
    }

    @Override
    public void enterClassDeclaration(@NotNull JambdaParser.ClassDeclarationContext ctx) {
        builder.enterClassDeclaration(ctx);
    }

    @Override
    public void enterExpressionStatement(@NotNull JambdaParser.ExpressionStatementContext ctx) {
        builder.appendTab(NESTED_DEPTH);
    }

    @Override
    public void enterIfStatement(@NotNull JambdaParser.IfStatementContext ctx) {
        builder.appendTab(NESTED_DEPTH).addIfStatement(ctx);
    }

    @Override
    public void enterFieldDeclaration(@NotNull JambdaParser.FieldDeclarationContext ctx) {
        varSymbol = new VariableSymbol();
        varSymbol.setNestingDepth(NESTED_DEPTH);
        currentScope.flatMap(scope -> scope.resolve(ctx.type().getText())).ifPresent(s -> {
            builder.enterFieldDeclaration(s.getSymbolType(),ctx);
            varSymbol.setSymbolType(s.getSymbolType());
        });
    }

    @Override
    public void exitFieldDeclaration(@NotNull JambdaParser.FieldDeclarationContext ctx) {
        currentScope.get().define(varSymbol);
    }

    @Override
    public void exitIfBody(@NotNull JambdaParser.IfBodyContext ctx) {
        NESTED_DEPTH--;
    }

    @Override
    public void enterIfBody(@NotNull JambdaParser.IfBodyContext ctx) {
        NESTED_DEPTH++;
    }

    @Override
    public void enterInterfaceTypeList(@NotNull JambdaParser.InterfaceTypeListContext ctx) {
        builder.enterInterfaceTypeList(ctx);
    }

    @Override
    public void enterMethodBody(@NotNull JambdaParser.MethodBodyContext ctx) {
        NESTED_DEPTH++;
        builder.enterMethodBody();

        currentScope.get().define(methodSymbol);
        currentScope = Optional.of(new LocalScope(currentScope.get()));
        methodSymbol.setMyScope(currentScope.get()); // this is my scope, ok?

        Optional<Map<String, Symbol>> args = Optional.ofNullable(methodSymbol.getArguments());
        args.ifPresent(arg -> {
            arg.forEach((key, symbol) -> {
                symbol.setNestingDepth(NESTED_DEPTH);
                currentScope.get().define(symbol); // method arguments also are members of the local scope
            });
        });
    }

    @Override
    public void exitMethodBody(@NotNull JambdaParser.MethodBodyContext ctx) {
        NESTED_DEPTH--;
        builder.exitMethodBody(NESTED_DEPTH);

        currentScope = currentScope.flatMap(Scope::getEnclosingScope); // back to the global scope
    }

    @Override
    public void enterClassMemberDeclaration(@NotNull JambdaParser.ClassMemberDeclarationContext ctx) {
        builder.appendTab(NESTED_DEPTH);
    }

    @Override
    public void enterMethodDeclarator(@NotNull JambdaParser.MethodDeclaratorContext ctx) {
        methodSymbol = new MethodSymbol(ctx.methodName().getText(), "method");
        methodSymbol.setNestingDepth(NESTED_DEPTH);
        methodSymbol.setLineNumber(ctx.methodName().IDENTIFIER().getSymbol().getLine());

        builder.enterMethodDeclarator(methodSymbol.getAddress());
    }

    @Override
    public void enterFormalParameters(@NotNull JambdaParser.FormalParametersContext ctx) {
        builder.enterFormalParameters(ctx, currentScope, methodSymbol);
    }

    @Override
    public void enterMethodInvoke(@NotNull JambdaParser.MethodInvokeContext ctx) {
        builder.enterMethodInvoke(ctx, NESTED_DEPTH, currentScope);
    }

    @Override
    public void enterSuperClass(@NotNull JambdaParser.SuperClassContext ctx) {
        builder.enterSuperClass(ctx);
    }

    @Override
    public void enterSuperInterfaces(@NotNull JambdaParser.SuperInterfacesContext ctx) {
        builder.enterSuperInterfaces(ctx.IMPLEMENTS().getText());
    }

    @Override
    public void enterVariableDeclarator(@NotNull JambdaParser.VariableDeclaratorContext ctx) {
        // control whether the upcoming variable's name already defined in the current scope
        currentScope.flatMap(s -> s.resolve(ctx.IDENTIFIER().getText()))
                    .ifPresent(s -> ExceptionTracker.throwEx(s, currentScope.get(), Error.VARIABLE));

        builder.enterVariableDeclarator(ctx.IDENTIFIER().getText());
        varSymbol.setSymbolName(ctx.IDENTIFIER().getText());
        varSymbol.setLineNumber(ctx.IDENTIFIER().getSymbol().getLine());
    }

    @Override
    public void enterVariableAssignment(@NotNull JambdaParser.VariableAssignmentContext ctx) {
        builder.enterVariableAssignment(ctx, currentScope, varSymbol);
    }

    @Override
    public void exitObjectDeclaration(@NotNull JambdaParser.ObjectDeclarationContext ctx) {
        builder.exitObjectDeclaration(ctx);
    }

    @Override
    public void exitCollectionType(@NotNull JambdaParser.CollectionTypeContext ctx) {
        builder.exitCollectionType(ctx);
    }

    @Override
    public void exitMethodDeclaration(@NotNull JambdaParser.MethodDeclarationContext ctx) {
        builder.exitMethodDeclaration(methodSymbol);
    }

    @Override
    public void enterReturnStatement(@NotNull JambdaParser.ReturnStatementContext ctx) {
        builder.enterReturnStatement(ctx, NESTED_DEPTH, currentScope);
    }

    @Override
    public void exitMethodDeclarator(@NotNull JambdaParser.MethodDeclaratorContext ctx) {
        builder.exitMethodDeclarator();
    }

    @Override
    public void exitMethodModifier(@NotNull JambdaParser.MethodModifierContext ctx) {
        if (Objects.nonNull(ctx.PUBLIC()))
            builder.append(ctx.PUBLIC().getText()).appendSpace();
        else if (Objects.nonNull(ctx.PRIVATE()))
            builder.append(ctx.PRIVATE().getText()).appendSpace();
        else if (Objects.nonNull(ctx.STATIC()))
            builder.append(ctx.STATIC().getText()).appendSpace();
    }

    @Override
    public void exitPackageDeclaration(@NotNull JambdaParser.PackageDeclarationContext ctx) {
        builder.exitPackageDeclaration(ctx);
    }

    @Override
    public void exitPostIncrementExpression(@NotNull JambdaParser.PostIncrementExpressionContext ctx) {
        builder.exitPostIncrementExpression(ctx, currentScope);
    }

    @Override
    public void exitTypeImportOnDemandDeclaration(@NotNull JambdaParser.TypeImportOnDemandDeclarationContext ctx) {
        builder.exitTypeImportOnDemandDeclaration(ctx);
    }
}
