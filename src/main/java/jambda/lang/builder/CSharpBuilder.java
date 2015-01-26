package jambda.lang.builder;

import jambda.lang.def.JambdaParser;
import jambda.lang.symbol.MethodSymbol;
import jambda.lang.symbol.Scope;
import jambda.lang.symbol.VariableSymbol;

import java.util.List;
import java.util.Optional;

/**
 * Created by HAKAN on 1/17/2015.
 */
public class CSharpBuilder extends Builder  {

    // you can also convert the jambda language to C# as you want using this class
    // Note that you can convert jambda to other oop languages by extending the Builder class

    public CSharpBuilder(StringBuilder builder) {
        super(builder);
    }

    @Override
    public Builder enterClassBody() {
        return null;
    }

    @Override
    public Builder exitClassBody() {
        return null;
    }

    @Override
    public Builder enterMethodBody() {
        return null;
    }

    @Override
    public Builder exitMethodDeclarator() {
        return null;
    }

    @Override
    public Builder exitCollectionType(JambdaParser.CollectionTypeContext ctx) {
        return null;
    }

    @Override
    public Builder enterSuperInterfaces(String imp) {
        return null;
    }

    @Override
    public Builder enterVariableDeclarator(String name) {
        return null;
    }

    @Override
    public Builder enterMethodDeclarator(String id) {
        return null;
    }

    @Override
    public Builder exitMethodBody(int depth) {
        return null;
    }

    @Override
    public Builder exitFieldModifier(List<JambdaParser.FieldModifierContext> ctx) {
        return null;
    }

    @Override
    public Builder enterSuperClass(JambdaParser.SuperClassContext ctx) {
        return null;
    }

    @Override
    public Builder enterInterfaceTypeList(JambdaParser.InterfaceTypeListContext ctx) {
        return null;
    }

    @Override
    public Builder enterFieldDeclaration(String str, JambdaParser.FieldDeclarationContext ctx) {
        return null;
    }

    @Override
    public Builder enterMethodInvoke(JambdaParser.MethodInvokeContext ctx, int depth, Optional<Scope> currentScope) {
        return null;
    }

    @Override
    public Builder exitMethodDeclaration(MethodSymbol methodSymbol) {
        return null;
    }

    @Override
    public Builder exitTypeImportOnDemandDeclaration(JambdaParser.TypeImportOnDemandDeclarationContext ctx) {
        return null;
    }

    @Override
    public Builder exitPostIncrementExpression(JambdaParser.PostIncrementExpressionContext ctx, Optional<Scope> currentScope) {
        return null;
    }

    @Override
    public Builder exitPackageDeclaration(JambdaParser.PackageDeclarationContext ctx) {
        return null;
    }

    @Override
    public Builder exitObjectDeclaration(JambdaParser.ObjectDeclarationContext ctx) {
        return null;
    }

    @Override
    public Builder enterVariableAssignment(JambdaParser.VariableAssignmentContext ctx, Optional<Scope> currentScope, VariableSymbol varSymbol) {
        return null;
    }

    @Override
    public Builder enterReturnStatement(JambdaParser.ReturnStatementContext ctx, int depth, Optional<Scope> currentScope) {
        return null;
    }

    @Override
    public Builder enterClassDeclaration(JambdaParser.ClassDeclarationContext ctx) {
        return null;
    }

    @Override
    public Builder addIfStatement(JambdaParser.IfStatementContext ctx) {
        return null;
    }

    @Override
    public Builder enterFormalParameters(JambdaParser.FormalParametersContext ctx, Optional<Scope> currentScope, MethodSymbol methodSymbol) {
        return null;
    }
}
