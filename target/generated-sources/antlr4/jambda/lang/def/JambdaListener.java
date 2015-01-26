// Generated from jambda\lang\def\Jambda.g4 by ANTLR 4.3
package jambda.lang.def;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link JambdaParser}.
 */
public interface JambdaListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link JambdaParser#classMemberDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassMemberDeclaration(@NotNull JambdaParser.ClassMemberDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JambdaParser#classMemberDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassMemberDeclaration(@NotNull JambdaParser.ClassMemberDeclarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link JambdaParser#argument}.
	 * @param ctx the parse tree
	 */
	void enterArgument(@NotNull JambdaParser.ArgumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link JambdaParser#argument}.
	 * @param ctx the parse tree
	 */
	void exitArgument(@NotNull JambdaParser.ArgumentContext ctx);

	/**
	 * Enter a parse tree produced by {@link JambdaParser#variableAssignment}.
	 * @param ctx the parse tree
	 */
	void enterVariableAssignment(@NotNull JambdaParser.VariableAssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link JambdaParser#variableAssignment}.
	 * @param ctx the parse tree
	 */
	void exitVariableAssignment(@NotNull JambdaParser.VariableAssignmentContext ctx);

	/**
	 * Enter a parse tree produced by {@link JambdaParser#methodDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterMethodDeclarator(@NotNull JambdaParser.MethodDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link JambdaParser#methodDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitMethodDeclarator(@NotNull JambdaParser.MethodDeclaratorContext ctx);

	/**
	 * Enter a parse tree produced by {@link JambdaParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(@NotNull JambdaParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JambdaParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(@NotNull JambdaParser.TypeContext ctx);

	/**
	 * Enter a parse tree produced by {@link JambdaParser#superInterfaces}.
	 * @param ctx the parse tree
	 */
	void enterSuperInterfaces(@NotNull JambdaParser.SuperInterfacesContext ctx);
	/**
	 * Exit a parse tree produced by {@link JambdaParser#superInterfaces}.
	 * @param ctx the parse tree
	 */
	void exitSuperInterfaces(@NotNull JambdaParser.SuperInterfacesContext ctx);

	/**
	 * Enter a parse tree produced by {@link JambdaParser#methodTypeRef}.
	 * @param ctx the parse tree
	 */
	void enterMethodTypeRef(@NotNull JambdaParser.MethodTypeRefContext ctx);
	/**
	 * Exit a parse tree produced by {@link JambdaParser#methodTypeRef}.
	 * @param ctx the parse tree
	 */
	void exitMethodTypeRef(@NotNull JambdaParser.MethodTypeRefContext ctx);

	/**
	 * Enter a parse tree produced by {@link JambdaParser#argumentList}.
	 * @param ctx the parse tree
	 */
	void enterArgumentList(@NotNull JambdaParser.ArgumentListContext ctx);
	/**
	 * Exit a parse tree produced by {@link JambdaParser#argumentList}.
	 * @param ctx the parse tree
	 */
	void exitArgumentList(@NotNull JambdaParser.ArgumentListContext ctx);

	/**
	 * Enter a parse tree produced by {@link JambdaParser#classBodyDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassBodyDeclaration(@NotNull JambdaParser.ClassBodyDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JambdaParser#classBodyDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassBodyDeclaration(@NotNull JambdaParser.ClassBodyDeclarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link JambdaParser#expressionStatement}.
	 * @param ctx the parse tree
	 */
	void enterExpressionStatement(@NotNull JambdaParser.ExpressionStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JambdaParser#expressionStatement}.
	 * @param ctx the parse tree
	 */
	void exitExpressionStatement(@NotNull JambdaParser.ExpressionStatementContext ctx);

	/**
	 * Enter a parse tree produced by {@link JambdaParser#methodModifier}.
	 * @param ctx the parse tree
	 */
	void enterMethodModifier(@NotNull JambdaParser.MethodModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link JambdaParser#methodModifier}.
	 * @param ctx the parse tree
	 */
	void exitMethodModifier(@NotNull JambdaParser.MethodModifierContext ctx);

	/**
	 * Enter a parse tree produced by {@link JambdaParser#floatingPointType}.
	 * @param ctx the parse tree
	 */
	void enterFloatingPointType(@NotNull JambdaParser.FloatingPointTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JambdaParser#floatingPointType}.
	 * @param ctx the parse tree
	 */
	void exitFloatingPointType(@NotNull JambdaParser.FloatingPointTypeContext ctx);

	/**
	 * Enter a parse tree produced by {@link JambdaParser#lambdaExpression}.
	 * @param ctx the parse tree
	 */
	void enterLambdaExpression(@NotNull JambdaParser.LambdaExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JambdaParser#lambdaExpression}.
	 * @param ctx the parse tree
	 */
	void exitLambdaExpression(@NotNull JambdaParser.LambdaExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link JambdaParser#booleanType}.
	 * @param ctx the parse tree
	 */
	void enterBooleanType(@NotNull JambdaParser.BooleanTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JambdaParser#booleanType}.
	 * @param ctx the parse tree
	 */
	void exitBooleanType(@NotNull JambdaParser.BooleanTypeContext ctx);

	/**
	 * Enter a parse tree produced by {@link JambdaParser#prefixName}.
	 * @param ctx the parse tree
	 */
	void enterPrefixName(@NotNull JambdaParser.PrefixNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link JambdaParser#prefixName}.
	 * @param ctx the parse tree
	 */
	void exitPrefixName(@NotNull JambdaParser.PrefixNameContext ctx);

	/**
	 * Enter a parse tree produced by {@link JambdaParser#objName}.
	 * @param ctx the parse tree
	 */
	void enterObjName(@NotNull JambdaParser.ObjNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link JambdaParser#objName}.
	 * @param ctx the parse tree
	 */
	void exitObjName(@NotNull JambdaParser.ObjNameContext ctx);

	/**
	 * Enter a parse tree produced by {@link JambdaParser#interfaceTypeList}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceTypeList(@NotNull JambdaParser.InterfaceTypeListContext ctx);
	/**
	 * Exit a parse tree produced by {@link JambdaParser#interfaceTypeList}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceTypeList(@NotNull JambdaParser.InterfaceTypeListContext ctx);

	/**
	 * Enter a parse tree produced by {@link JambdaParser#integralType}.
	 * @param ctx the parse tree
	 */
	void enterIntegralType(@NotNull JambdaParser.IntegralTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JambdaParser#integralType}.
	 * @param ctx the parse tree
	 */
	void exitIntegralType(@NotNull JambdaParser.IntegralTypeContext ctx);

	/**
	 * Enter a parse tree produced by {@link JambdaParser#formalParameterList}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameterList(@NotNull JambdaParser.FormalParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link JambdaParser#formalParameterList}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameterList(@NotNull JambdaParser.FormalParameterListContext ctx);

	/**
	 * Enter a parse tree produced by {@link JambdaParser#compilationUnit}.
	 * @param ctx the parse tree
	 */
	void enterCompilationUnit(@NotNull JambdaParser.CompilationUnitContext ctx);
	/**
	 * Exit a parse tree produced by {@link JambdaParser#compilationUnit}.
	 * @param ctx the parse tree
	 */
	void exitCompilationUnit(@NotNull JambdaParser.CompilationUnitContext ctx);

	/**
	 * Enter a parse tree produced by {@link JambdaParser#superClass}.
	 * @param ctx the parse tree
	 */
	void enterSuperClass(@NotNull JambdaParser.SuperClassContext ctx);
	/**
	 * Exit a parse tree produced by {@link JambdaParser#superClass}.
	 * @param ctx the parse tree
	 */
	void exitSuperClass(@NotNull JambdaParser.SuperClassContext ctx);

	/**
	 * Enter a parse tree produced by {@link JambdaParser#ifBody}.
	 * @param ctx the parse tree
	 */
	void enterIfBody(@NotNull JambdaParser.IfBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link JambdaParser#ifBody}.
	 * @param ctx the parse tree
	 */
	void exitIfBody(@NotNull JambdaParser.IfBodyContext ctx);

	/**
	 * Enter a parse tree produced by {@link JambdaParser#methodCurrying}.
	 * @param ctx the parse tree
	 */
	void enterMethodCurrying(@NotNull JambdaParser.MethodCurryingContext ctx);
	/**
	 * Exit a parse tree produced by {@link JambdaParser#methodCurrying}.
	 * @param ctx the parse tree
	 */
	void exitMethodCurrying(@NotNull JambdaParser.MethodCurryingContext ctx);

	/**
	 * Enter a parse tree produced by {@link JambdaParser#postIncrementExpression}.
	 * @param ctx the parse tree
	 */
	void enterPostIncrementExpression(@NotNull JambdaParser.PostIncrementExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JambdaParser#postIncrementExpression}.
	 * @param ctx the parse tree
	 */
	void exitPostIncrementExpression(@NotNull JambdaParser.PostIncrementExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link JambdaParser#objectDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterObjectDeclaration(@NotNull JambdaParser.ObjectDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JambdaParser#objectDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitObjectDeclaration(@NotNull JambdaParser.ObjectDeclarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link JambdaParser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterMethodDeclaration(@NotNull JambdaParser.MethodDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JambdaParser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitMethodDeclaration(@NotNull JambdaParser.MethodDeclarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link JambdaParser#methodBody}.
	 * @param ctx the parse tree
	 */
	void enterMethodBody(@NotNull JambdaParser.MethodBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link JambdaParser#methodBody}.
	 * @param ctx the parse tree
	 */
	void exitMethodBody(@NotNull JambdaParser.MethodBodyContext ctx);

	/**
	 * Enter a parse tree produced by {@link JambdaParser#collectionInitializer}.
	 * @param ctx the parse tree
	 */
	void enterCollectionInitializer(@NotNull JambdaParser.CollectionInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link JambdaParser#collectionInitializer}.
	 * @param ctx the parse tree
	 */
	void exitCollectionInitializer(@NotNull JambdaParser.CollectionInitializerContext ctx);

	/**
	 * Enter a parse tree produced by {@link JambdaParser#typeName}.
	 * @param ctx the parse tree
	 */
	void enterTypeName(@NotNull JambdaParser.TypeNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link JambdaParser#typeName}.
	 * @param ctx the parse tree
	 */
	void exitTypeName(@NotNull JambdaParser.TypeNameContext ctx);

	/**
	 * Enter a parse tree produced by {@link JambdaParser#typeDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterTypeDeclaration(@NotNull JambdaParser.TypeDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JambdaParser#typeDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitTypeDeclaration(@NotNull JambdaParser.TypeDeclarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link JambdaParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void enterReturnStatement(@NotNull JambdaParser.ReturnStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JambdaParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void exitReturnStatement(@NotNull JambdaParser.ReturnStatementContext ctx);

	/**
	 * Enter a parse tree produced by {@link JambdaParser#typeImportOnDemandDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterTypeImportOnDemandDeclaration(@NotNull JambdaParser.TypeImportOnDemandDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JambdaParser#typeImportOnDemandDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitTypeImportOnDemandDeclaration(@NotNull JambdaParser.TypeImportOnDemandDeclarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link JambdaParser#literalName}.
	 * @param ctx the parse tree
	 */
	void enterLiteralName(@NotNull JambdaParser.LiteralNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link JambdaParser#literalName}.
	 * @param ctx the parse tree
	 */
	void exitLiteralName(@NotNull JambdaParser.LiteralNameContext ctx);

	/**
	 * Enter a parse tree produced by {@link JambdaParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassDeclaration(@NotNull JambdaParser.ClassDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JambdaParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassDeclaration(@NotNull JambdaParser.ClassDeclarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link JambdaParser#variableDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclarator(@NotNull JambdaParser.VariableDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link JambdaParser#variableDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclarator(@NotNull JambdaParser.VariableDeclaratorContext ctx);

	/**
	 * Enter a parse tree produced by {@link JambdaParser#methodHeader}.
	 * @param ctx the parse tree
	 */
	void enterMethodHeader(@NotNull JambdaParser.MethodHeaderContext ctx);
	/**
	 * Exit a parse tree produced by {@link JambdaParser#methodHeader}.
	 * @param ctx the parse tree
	 */
	void exitMethodHeader(@NotNull JambdaParser.MethodHeaderContext ctx);

	/**
	 * Enter a parse tree produced by {@link JambdaParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(@NotNull JambdaParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JambdaParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(@NotNull JambdaParser.StatementContext ctx);

	/**
	 * Enter a parse tree produced by {@link JambdaParser#classBody}.
	 * @param ctx the parse tree
	 */
	void enterClassBody(@NotNull JambdaParser.ClassBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link JambdaParser#classBody}.
	 * @param ctx the parse tree
	 */
	void exitClassBody(@NotNull JambdaParser.ClassBodyContext ctx);

	/**
	 * Enter a parse tree produced by {@link JambdaParser#outputStream}.
	 * @param ctx the parse tree
	 */
	void enterOutputStream(@NotNull JambdaParser.OutputStreamContext ctx);
	/**
	 * Exit a parse tree produced by {@link JambdaParser#outputStream}.
	 * @param ctx the parse tree
	 */
	void exitOutputStream(@NotNull JambdaParser.OutputStreamContext ctx);

	/**
	 * Enter a parse tree produced by {@link JambdaParser#importDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterImportDeclaration(@NotNull JambdaParser.ImportDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JambdaParser#importDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitImportDeclaration(@NotNull JambdaParser.ImportDeclarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link JambdaParser#fieldModifier}.
	 * @param ctx the parse tree
	 */
	void enterFieldModifier(@NotNull JambdaParser.FieldModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link JambdaParser#fieldModifier}.
	 * @param ctx the parse tree
	 */
	void exitFieldModifier(@NotNull JambdaParser.FieldModifierContext ctx);

	/**
	 * Enter a parse tree produced by {@link JambdaParser#methodCallParams}.
	 * @param ctx the parse tree
	 */
	void enterMethodCallParams(@NotNull JambdaParser.MethodCallParamsContext ctx);
	/**
	 * Exit a parse tree produced by {@link JambdaParser#methodCallParams}.
	 * @param ctx the parse tree
	 */
	void exitMethodCallParams(@NotNull JambdaParser.MethodCallParamsContext ctx);

	/**
	 * Enter a parse tree produced by {@link JambdaParser#formalParameter}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameter(@NotNull JambdaParser.FormalParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link JambdaParser#formalParameter}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameter(@NotNull JambdaParser.FormalParameterContext ctx);

	/**
	 * Enter a parse tree produced by {@link JambdaParser#unaryPrimitiveType}.
	 * @param ctx the parse tree
	 */
	void enterUnaryPrimitiveType(@NotNull JambdaParser.UnaryPrimitiveTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JambdaParser#unaryPrimitiveType}.
	 * @param ctx the parse tree
	 */
	void exitUnaryPrimitiveType(@NotNull JambdaParser.UnaryPrimitiveTypeContext ctx);

	/**
	 * Enter a parse tree produced by {@link JambdaParser#variableInitializer}.
	 * @param ctx the parse tree
	 */
	void enterVariableInitializer(@NotNull JambdaParser.VariableInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link JambdaParser#variableInitializer}.
	 * @param ctx the parse tree
	 */
	void exitVariableInitializer(@NotNull JambdaParser.VariableInitializerContext ctx);

	/**
	 * Enter a parse tree produced by {@link JambdaParser#methodInvoke}.
	 * @param ctx the parse tree
	 */
	void enterMethodInvoke(@NotNull JambdaParser.MethodInvokeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JambdaParser#methodInvoke}.
	 * @param ctx the parse tree
	 */
	void exitMethodInvoke(@NotNull JambdaParser.MethodInvokeContext ctx);

	/**
	 * Enter a parse tree produced by {@link JambdaParser#blockStatement}.
	 * @param ctx the parse tree
	 */
	void enterBlockStatement(@NotNull JambdaParser.BlockStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JambdaParser#blockStatement}.
	 * @param ctx the parse tree
	 */
	void exitBlockStatement(@NotNull JambdaParser.BlockStatementContext ctx);

	/**
	 * Enter a parse tree produced by {@link JambdaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(@NotNull JambdaParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JambdaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(@NotNull JambdaParser.ExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link JambdaParser#methodInvocation}.
	 * @param ctx the parse tree
	 */
	void enterMethodInvocation(@NotNull JambdaParser.MethodInvocationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JambdaParser#methodInvocation}.
	 * @param ctx the parse tree
	 */
	void exitMethodInvocation(@NotNull JambdaParser.MethodInvocationContext ctx);

	/**
	 * Enter a parse tree produced by {@link JambdaParser#fieldDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterFieldDeclaration(@NotNull JambdaParser.FieldDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JambdaParser#fieldDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitFieldDeclaration(@NotNull JambdaParser.FieldDeclarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link JambdaParser#methodName}.
	 * @param ctx the parse tree
	 */
	void enterMethodName(@NotNull JambdaParser.MethodNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link JambdaParser#methodName}.
	 * @param ctx the parse tree
	 */
	void exitMethodName(@NotNull JambdaParser.MethodNameContext ctx);

	/**
	 * Enter a parse tree produced by {@link JambdaParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(@NotNull JambdaParser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JambdaParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(@NotNull JambdaParser.IfStatementContext ctx);

	/**
	 * Enter a parse tree produced by {@link JambdaParser#collectionType}.
	 * @param ctx the parse tree
	 */
	void enterCollectionType(@NotNull JambdaParser.CollectionTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JambdaParser#collectionType}.
	 * @param ctx the parse tree
	 */
	void exitCollectionType(@NotNull JambdaParser.CollectionTypeContext ctx);

	/**
	 * Enter a parse tree produced by {@link JambdaParser#packageDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterPackageDeclaration(@NotNull JambdaParser.PackageDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JambdaParser#packageDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitPackageDeclaration(@NotNull JambdaParser.PackageDeclarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link JambdaParser#methodReference}.
	 * @param ctx the parse tree
	 */
	void enterMethodReference(@NotNull JambdaParser.MethodReferenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link JambdaParser#methodReference}.
	 * @param ctx the parse tree
	 */
	void exitMethodReference(@NotNull JambdaParser.MethodReferenceContext ctx);

	/**
	 * Enter a parse tree produced by {@link JambdaParser#blockStatements}.
	 * @param ctx the parse tree
	 */
	void enterBlockStatements(@NotNull JambdaParser.BlockStatementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link JambdaParser#blockStatements}.
	 * @param ctx the parse tree
	 */
	void exitBlockStatements(@NotNull JambdaParser.BlockStatementsContext ctx);

	/**
	 * Enter a parse tree produced by {@link JambdaParser#numericType}.
	 * @param ctx the parse tree
	 */
	void enterNumericType(@NotNull JambdaParser.NumericTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JambdaParser#numericType}.
	 * @param ctx the parse tree
	 */
	void exitNumericType(@NotNull JambdaParser.NumericTypeContext ctx);

	/**
	 * Enter a parse tree produced by {@link JambdaParser#formalParameters}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameters(@NotNull JambdaParser.FormalParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link JambdaParser#formalParameters}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameters(@NotNull JambdaParser.FormalParametersContext ctx);
}