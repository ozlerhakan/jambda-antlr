// Generated from jambda\lang\def\Jambda.g4 by ANTLR 4.3
package jambda.lang.def;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link JambdaParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface JambdaVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link JambdaParser#classMemberDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassMemberDeclaration(@NotNull JambdaParser.ClassMemberDeclarationContext ctx);

	/**
	 * Visit a parse tree produced by {@link JambdaParser#argument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgument(@NotNull JambdaParser.ArgumentContext ctx);

	/**
	 * Visit a parse tree produced by {@link JambdaParser#variableAssignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableAssignment(@NotNull JambdaParser.VariableAssignmentContext ctx);

	/**
	 * Visit a parse tree produced by {@link JambdaParser#methodDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodDeclarator(@NotNull JambdaParser.MethodDeclaratorContext ctx);

	/**
	 * Visit a parse tree produced by {@link JambdaParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(@NotNull JambdaParser.TypeContext ctx);

	/**
	 * Visit a parse tree produced by {@link JambdaParser#superInterfaces}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSuperInterfaces(@NotNull JambdaParser.SuperInterfacesContext ctx);

	/**
	 * Visit a parse tree produced by {@link JambdaParser#methodTypeRef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodTypeRef(@NotNull JambdaParser.MethodTypeRefContext ctx);

	/**
	 * Visit a parse tree produced by {@link JambdaParser#argumentList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgumentList(@NotNull JambdaParser.ArgumentListContext ctx);

	/**
	 * Visit a parse tree produced by {@link JambdaParser#classBodyDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassBodyDeclaration(@NotNull JambdaParser.ClassBodyDeclarationContext ctx);

	/**
	 * Visit a parse tree produced by {@link JambdaParser#expressionStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionStatement(@NotNull JambdaParser.ExpressionStatementContext ctx);

	/**
	 * Visit a parse tree produced by {@link JambdaParser#methodModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodModifier(@NotNull JambdaParser.MethodModifierContext ctx);

	/**
	 * Visit a parse tree produced by {@link JambdaParser#floatingPointType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFloatingPointType(@NotNull JambdaParser.FloatingPointTypeContext ctx);

	/**
	 * Visit a parse tree produced by {@link JambdaParser#lambdaExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLambdaExpression(@NotNull JambdaParser.LambdaExpressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link JambdaParser#booleanType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanType(@NotNull JambdaParser.BooleanTypeContext ctx);

	/**
	 * Visit a parse tree produced by {@link JambdaParser#prefixName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrefixName(@NotNull JambdaParser.PrefixNameContext ctx);

	/**
	 * Visit a parse tree produced by {@link JambdaParser#objName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjName(@NotNull JambdaParser.ObjNameContext ctx);

	/**
	 * Visit a parse tree produced by {@link JambdaParser#interfaceTypeList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceTypeList(@NotNull JambdaParser.InterfaceTypeListContext ctx);

	/**
	 * Visit a parse tree produced by {@link JambdaParser#integralType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntegralType(@NotNull JambdaParser.IntegralTypeContext ctx);

	/**
	 * Visit a parse tree produced by {@link JambdaParser#formalParameterList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormalParameterList(@NotNull JambdaParser.FormalParameterListContext ctx);

	/**
	 * Visit a parse tree produced by {@link JambdaParser#compilationUnit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompilationUnit(@NotNull JambdaParser.CompilationUnitContext ctx);

	/**
	 * Visit a parse tree produced by {@link JambdaParser#superClass}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSuperClass(@NotNull JambdaParser.SuperClassContext ctx);

	/**
	 * Visit a parse tree produced by {@link JambdaParser#ifBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfBody(@NotNull JambdaParser.IfBodyContext ctx);

	/**
	 * Visit a parse tree produced by {@link JambdaParser#methodCurrying}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodCurrying(@NotNull JambdaParser.MethodCurryingContext ctx);

	/**
	 * Visit a parse tree produced by {@link JambdaParser#postIncrementExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPostIncrementExpression(@NotNull JambdaParser.PostIncrementExpressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link JambdaParser#objectDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjectDeclaration(@NotNull JambdaParser.ObjectDeclarationContext ctx);

	/**
	 * Visit a parse tree produced by {@link JambdaParser#methodDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodDeclaration(@NotNull JambdaParser.MethodDeclarationContext ctx);

	/**
	 * Visit a parse tree produced by {@link JambdaParser#methodBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodBody(@NotNull JambdaParser.MethodBodyContext ctx);

	/**
	 * Visit a parse tree produced by {@link JambdaParser#collectionInitializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCollectionInitializer(@NotNull JambdaParser.CollectionInitializerContext ctx);

	/**
	 * Visit a parse tree produced by {@link JambdaParser#typeName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeName(@NotNull JambdaParser.TypeNameContext ctx);

	/**
	 * Visit a parse tree produced by {@link JambdaParser#typeDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeDeclaration(@NotNull JambdaParser.TypeDeclarationContext ctx);

	/**
	 * Visit a parse tree produced by {@link JambdaParser#returnStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnStatement(@NotNull JambdaParser.ReturnStatementContext ctx);

	/**
	 * Visit a parse tree produced by {@link JambdaParser#typeImportOnDemandDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeImportOnDemandDeclaration(@NotNull JambdaParser.TypeImportOnDemandDeclarationContext ctx);

	/**
	 * Visit a parse tree produced by {@link JambdaParser#literalName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteralName(@NotNull JambdaParser.LiteralNameContext ctx);

	/**
	 * Visit a parse tree produced by {@link JambdaParser#classDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassDeclaration(@NotNull JambdaParser.ClassDeclarationContext ctx);

	/**
	 * Visit a parse tree produced by {@link JambdaParser#variableDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclarator(@NotNull JambdaParser.VariableDeclaratorContext ctx);

	/**
	 * Visit a parse tree produced by {@link JambdaParser#methodHeader}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodHeader(@NotNull JambdaParser.MethodHeaderContext ctx);

	/**
	 * Visit a parse tree produced by {@link JambdaParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(@NotNull JambdaParser.StatementContext ctx);

	/**
	 * Visit a parse tree produced by {@link JambdaParser#classBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassBody(@NotNull JambdaParser.ClassBodyContext ctx);

	/**
	 * Visit a parse tree produced by {@link JambdaParser#outputStream}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOutputStream(@NotNull JambdaParser.OutputStreamContext ctx);

	/**
	 * Visit a parse tree produced by {@link JambdaParser#importDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportDeclaration(@NotNull JambdaParser.ImportDeclarationContext ctx);

	/**
	 * Visit a parse tree produced by {@link JambdaParser#fieldModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldModifier(@NotNull JambdaParser.FieldModifierContext ctx);

	/**
	 * Visit a parse tree produced by {@link JambdaParser#methodCallParams}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodCallParams(@NotNull JambdaParser.MethodCallParamsContext ctx);

	/**
	 * Visit a parse tree produced by {@link JambdaParser#formalParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormalParameter(@NotNull JambdaParser.FormalParameterContext ctx);

	/**
	 * Visit a parse tree produced by {@link JambdaParser#unaryPrimitiveType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryPrimitiveType(@NotNull JambdaParser.UnaryPrimitiveTypeContext ctx);

	/**
	 * Visit a parse tree produced by {@link JambdaParser#variableInitializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableInitializer(@NotNull JambdaParser.VariableInitializerContext ctx);

	/**
	 * Visit a parse tree produced by {@link JambdaParser#methodInvoke}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodInvoke(@NotNull JambdaParser.MethodInvokeContext ctx);

	/**
	 * Visit a parse tree produced by {@link JambdaParser#blockStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockStatement(@NotNull JambdaParser.BlockStatementContext ctx);

	/**
	 * Visit a parse tree produced by {@link JambdaParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(@NotNull JambdaParser.ExpressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link JambdaParser#methodInvocation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodInvocation(@NotNull JambdaParser.MethodInvocationContext ctx);

	/**
	 * Visit a parse tree produced by {@link JambdaParser#fieldDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldDeclaration(@NotNull JambdaParser.FieldDeclarationContext ctx);

	/**
	 * Visit a parse tree produced by {@link JambdaParser#methodName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodName(@NotNull JambdaParser.MethodNameContext ctx);

	/**
	 * Visit a parse tree produced by {@link JambdaParser#ifStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStatement(@NotNull JambdaParser.IfStatementContext ctx);

	/**
	 * Visit a parse tree produced by {@link JambdaParser#collectionType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCollectionType(@NotNull JambdaParser.CollectionTypeContext ctx);

	/**
	 * Visit a parse tree produced by {@link JambdaParser#packageDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPackageDeclaration(@NotNull JambdaParser.PackageDeclarationContext ctx);

	/**
	 * Visit a parse tree produced by {@link JambdaParser#methodReference}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodReference(@NotNull JambdaParser.MethodReferenceContext ctx);

	/**
	 * Visit a parse tree produced by {@link JambdaParser#blockStatements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockStatements(@NotNull JambdaParser.BlockStatementsContext ctx);

	/**
	 * Visit a parse tree produced by {@link JambdaParser#numericType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumericType(@NotNull JambdaParser.NumericTypeContext ctx);

	/**
	 * Visit a parse tree produced by {@link JambdaParser#formalParameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormalParameters(@NotNull JambdaParser.FormalParametersContext ctx);
}