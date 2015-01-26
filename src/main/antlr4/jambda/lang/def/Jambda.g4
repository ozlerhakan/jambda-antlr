grammar Jambda;
/**
 * Created by HAKAN on 11/01/2015.
 */
compilationUnit
    :   NL* packageDeclaration? importDeclaration* typeDeclaration* EOF
    ;

packageDeclaration
    :   PACKAGE IDENTIFIER (':' IDENTIFIER)* NL*
    ;

importDeclaration
    :   typeImportOnDemandDeclaration NL*
    ;

typeImportOnDemandDeclaration
    :   IMPORT IDENTIFIER (':' IDENTIFIER)* (':' STAR)?
    ;

typeDeclaration
    :   classDeclaration
    ;

classDeclaration
    :   PUBLIC? IDENTIFIER ':' CLASS superClass? superInterfaces? classBody NL*
    ;

superClass
    :   IDENTIFIER ':' EXTENDS
    ;

superInterfaces
    :   '(' interfaceTypeList '):' IMPLEMENTS
    ;

interfaceTypeList
    :   IDENTIFIER (',' IDENTIFIER)*
    ;

classBody
    :   '->' '{' classBodyDeclaration* '}'
    ;

classBodyDeclaration
    :   classMemberDeclaration NL*
    ;

classMemberDeclaration
    :   fieldDeclaration
    |   methodDeclaration
    ;

fieldDeclaration
    :   fieldModifier* type variableDeclarator
    ;

fieldModifier
    :   PUBLIC
    |   PROTECTED
    |   PRIVATE
    |   STATIC
    ;

variableDeclarator
    :   IDENTIFIER variableAssignment?
    ;

variableAssignment
    :   '->' variableInitializer
    ;

type
    :   unaryPrimitiveType
    |   STRING
    ;

unaryPrimitiveType
    :   numericType
    |   booleanType
    ;

booleanType
    :   BOOLEAN
    ;

numericType
    :   integralType
    |   floatingPointType
    |   collectionType
    ;

integralType
    :   INTEGER
    |   CHARACTER
    ;

floatingPointType
    :   DOUBLE
    ;

collectionType
    :   ARRAYLIST
    ;

variableInitializer
    :   IDENTIFIER
    |   NUMBER
    |   STRINGLITERAL
    |   BOOLEANLITERAL
    |   CHARLITERAL
    |   collectionInitializer
    ;

collectionInitializer
    :   '<' type '>'
    ;

methodDeclaration
    :   methodModifier* methodHeader methodBody
    ;

methodModifier
    :   PUBLIC
    |   PRIVATE
    |   STATIC
    ;

methodHeader
    :   methodDeclarator
    ;

methodDeclarator
    :   methodName '((' formalParameterList? ')'
    ;

formalParameterList
    :   formalParameters
    ;

formalParameters
    :   formalParameter (',' formalParameter)*
    ;

formalParameter
    :   type ELLIPSIS? IDENTIFIER
    ;

methodBody
    :   '->' '{' blockStatements? '});'
    ;

blockStatements
    :   blockStatement blockStatement*
    ;

blockStatement
    :   statement NL*
    ;

statement
    :   expressionStatement
    |   ifStatement
    |   returnStatement
    ;

returnStatement
    :   RETURN IDENTIFIER?
    ;

ifStatement
    :   IF '(' expression ')' ifBody
    ;

ifBody
    :   expressionStatement
    ;

expressionStatement
    :   methodInvocation
    |   fieldDeclaration
    |   objectDeclaration
    |   postIncrementExpression
    ;

postIncrementExpression
    :   IDENTIFIER '++'
    ;

objectDeclaration
    :   typeName objName '->' 'new' '(' ')'
    ;

objName
    :   IDENTIFIER
    ;

methodInvocation
    :   methodInvoke
    ;

methodInvoke
    :   methodTypeRef? methodName '(' argumentList? ')' methodCurrying*
    ;

methodTypeRef
    :   typeName '.' methodTypeRef*
    ;

methodCurrying
    :  '(' argumentList? ')'
    ;

methodName
    :   IDENTIFIER
    ;

typeName
    :   IDENTIFIER
    ;

argumentList
    :   methodCallParams
    |   methodReference
    |   lambdaExpression
    ;

methodCallParams
    :   literalName (',' methodCallParams)*
    ;

methodReference
    :   typeName '::' methodName
    ;

lambdaExpression
    :  '('? prefixName ')'? '->' '{' outputStream '}'
    ;

outputStream
    : (prefixName | argument)*
    ;

prefixName
    :   IDENTIFIER
    ;

literalName
    :   IDENTIFIER
    |   STRINGLITERAL
    |   NUMBER
    |   STRINGLITERAL
    |   BOOLEANLITERAL
    |   CHARLITERAL
    ;

argument
    :   (STRINGLITERAL | '+')+
    ;

expression
    :   expression '*' expression
    |   expression '/' expression
    |   expression '+' expression
    |   expression '-' expression
    |   expression ('<=' | '>=' | '>' | '<') expression
    |   expression 'instanceof' expression
    |   expression ('==' | '!=') expression
    |   expression '&&' expression
    |   expression '||' expression
    |   '(' expression ')'
    |   NUMBER
    |   IDENTIFIER
    ;


// KEYWORDS

PACKAGE   : 'package';
IMPORT    : 'import';
CLASS     : 'class';
EXTENDS   : 'extends';
IMPLEMENTS: 'implements';
PUBLIC    : 'public';
PROTECTED : 'protected';
PRIVATE   : 'private';
STATIC    : 'static';
STRING    : 'string';
BOOLEAN   : 'boolean';
INTEGER   : 'integer';
CHARACTER : 'character';
DOUBLE    : 'double';
LIST      : 'list';
ARRAYLIST : 'arrayList';
ARRAY     : 'array';
RETURN    : 'return';
IF        : 'if';


// OPERANDS

LPAREN    : '(';
RPAREN    : ')';
LCBRACKET : '{';
RCBRACKET : '}';
STAR      : '*';
ELLIPSIS  : '...';

// other rules

ARRAYINIT
    :   '['  (',')* ']'
    ;

STRINGLITERAL
    :   '"' .*? '"'
    ;

BOOLEANLITERAL
    :   'true'
    |   'false'
    ;

CHARLITERAL
    :   '\'' [a-zA-Z] '\''
    ;

NUMBER
    :  [0-9]+ ('.' [0-9]*)?
    |  '.' [0-9]+
    ;

IDENTIFIER
    :  [a-zA-Z_] [a-zA-Z_0-9]*
    ;

NL  :   '\r'? '\n'
    ;

// skip the following three rules

COMMENT
    :   '/>' .*? '</' -> skip
    ;

LINE_COMMENT
    :   '>>' ~[\r\n]* -> skip
    ;

SPACES
    :   [ \t\r\n]+ -> skip
    ;
