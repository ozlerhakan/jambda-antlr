package jambda.lang.builder;

import jambda.lang.def.JambdaParser;
import jambda.lang.symbol.MethodSymbol;
import jambda.lang.symbol.Scope;
import jambda.lang.symbol.VariableSymbol;

import java.util.List;
import java.util.Optional;

/**
 * Created by Hakan on 1/17/2015.
 */
public interface Modifier {

    public Builder enterClassBody();

    public Builder exitClassBody();

    public Builder enterMethodBody();

    public Builder exitMethodDeclarator();

    public Builder exitCollectionType(JambdaParser.CollectionTypeContext ctx);

    public Builder enterSuperInterfaces(String imp);

    public Builder enterVariableDeclarator(String name);

    public Builder enterMethodDeclarator(String id);

    public Builder exitMethodBody(int depth);

    public Builder exitFieldModifier(List<JambdaParser.FieldModifierContext> ctx);

    public Builder enterSuperClass(JambdaParser.SuperClassContext ctx);

    public Builder enterInterfaceTypeList(JambdaParser.InterfaceTypeListContext ctx);

    public Builder enterFieldDeclaration(String str,JambdaParser.FieldDeclarationContext ctx);

    public Builder enterMethodInvoke(JambdaParser.MethodInvokeContext ctx, int depth, Optional<Scope> currentScope);

    public Builder exitMethodDeclaration(MethodSymbol methodSymbol);

    public Builder exitTypeImportOnDemandDeclaration(JambdaParser.TypeImportOnDemandDeclarationContext ctx);

    public Builder exitPostIncrementExpression(JambdaParser.PostIncrementExpressionContext ctx, Optional<Scope> currentScope);

    public Builder exitPackageDeclaration(JambdaParser.PackageDeclarationContext ctx);

    public Builder exitObjectDeclaration(JambdaParser.ObjectDeclarationContext ctx);

    public Builder enterVariableAssignment(JambdaParser.VariableAssignmentContext ctx, Optional<Scope> currentScope, VariableSymbol varSymbol);

    public Builder enterReturnStatement(JambdaParser.ReturnStatementContext ctx, int depth, Optional<Scope> currentScope);

    public Builder enterClassDeclaration(JambdaParser.ClassDeclarationContext ctx);

    public Builder addIfStatement(JambdaParser.IfStatementContext ctx);

    public Builder enterFormalParameters(JambdaParser.FormalParametersContext ctx, Optional<Scope> currentScope, MethodSymbol methodSymbol);

}
