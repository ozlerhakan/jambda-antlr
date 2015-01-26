// Generated from jambda\lang\def\Jambda.g4 by ANTLR 4.3
package jambda.lang.def;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class JambdaParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__21=1, T__20=2, T__19=3, T__18=4, T__17=5, T__16=6, T__15=7, T__14=8, 
		T__13=9, T__12=10, T__11=11, T__10=12, T__9=13, T__8=14, T__7=15, T__6=16, 
		T__5=17, T__4=18, T__3=19, T__2=20, T__1=21, T__0=22, PACKAGE=23, IMPORT=24, 
		CLASS=25, EXTENDS=26, IMPLEMENTS=27, PUBLIC=28, PROTECTED=29, PRIVATE=30, 
		STATIC=31, STRING=32, BOOLEAN=33, INTEGER=34, CHARACTER=35, DOUBLE=36, 
		LIST=37, ARRAYLIST=38, ARRAY=39, RETURN=40, IF=41, LPAREN=42, RPAREN=43, 
		LCBRACKET=44, RCBRACKET=45, STAR=46, ELLIPSIS=47, ARRAYINIT=48, STRINGLITERAL=49, 
		BOOLEANLITERAL=50, CHARLITERAL=51, NUMBER=52, IDENTIFIER=53, NL=54, COMMENT=55, 
		LINE_COMMENT=56, SPACES=57;
	public static final String[] tokenNames = {
		"<INVALID>", "'/'", "'new'", "'!='", "'||'", "'&&'", "'instanceof'", "'::'", 
		"'(('", "'<='", "','", "'.'", "'});'", "'->'", "'):'", "':'", "'>='", 
		"'=='", "'++'", "'<'", "'>'", "'+'", "'-'", "'package'", "'import'", "'class'", 
		"'extends'", "'implements'", "'public'", "'protected'", "'private'", "'static'", 
		"'string'", "'boolean'", "'integer'", "'character'", "'double'", "'list'", 
		"'arrayList'", "'array'", "'return'", "'if'", "'('", "')'", "'{'", "'}'", 
		"'*'", "'...'", "ARRAYINIT", "STRINGLITERAL", "BOOLEANLITERAL", "CHARLITERAL", 
		"NUMBER", "IDENTIFIER", "NL", "COMMENT", "LINE_COMMENT", "SPACES"
	};
	public static final int
		RULE_compilationUnit = 0, RULE_packageDeclaration = 1, RULE_importDeclaration = 2, 
		RULE_typeImportOnDemandDeclaration = 3, RULE_typeDeclaration = 4, RULE_classDeclaration = 5, 
		RULE_superClass = 6, RULE_superInterfaces = 7, RULE_interfaceTypeList = 8, 
		RULE_classBody = 9, RULE_classBodyDeclaration = 10, RULE_classMemberDeclaration = 11, 
		RULE_fieldDeclaration = 12, RULE_fieldModifier = 13, RULE_variableDeclarator = 14, 
		RULE_variableAssignment = 15, RULE_type = 16, RULE_unaryPrimitiveType = 17, 
		RULE_booleanType = 18, RULE_numericType = 19, RULE_integralType = 20, 
		RULE_floatingPointType = 21, RULE_collectionType = 22, RULE_variableInitializer = 23, 
		RULE_collectionInitializer = 24, RULE_methodDeclaration = 25, RULE_methodModifier = 26, 
		RULE_methodHeader = 27, RULE_methodDeclarator = 28, RULE_formalParameterList = 29, 
		RULE_formalParameters = 30, RULE_formalParameter = 31, RULE_methodBody = 32, 
		RULE_blockStatements = 33, RULE_blockStatement = 34, RULE_statement = 35, 
		RULE_returnStatement = 36, RULE_ifStatement = 37, RULE_ifBody = 38, RULE_expressionStatement = 39, 
		RULE_postIncrementExpression = 40, RULE_objectDeclaration = 41, RULE_objName = 42, 
		RULE_methodInvocation = 43, RULE_methodInvoke = 44, RULE_methodTypeRef = 45, 
		RULE_methodCurrying = 46, RULE_methodName = 47, RULE_typeName = 48, RULE_argumentList = 49, 
		RULE_methodCallParams = 50, RULE_methodReference = 51, RULE_lambdaExpression = 52, 
		RULE_outputStream = 53, RULE_prefixName = 54, RULE_literalName = 55, RULE_argument = 56, 
		RULE_expression = 57;
	public static final String[] ruleNames = {
		"compilationUnit", "packageDeclaration", "importDeclaration", "typeImportOnDemandDeclaration", 
		"typeDeclaration", "classDeclaration", "superClass", "superInterfaces", 
		"interfaceTypeList", "classBody", "classBodyDeclaration", "classMemberDeclaration", 
		"fieldDeclaration", "fieldModifier", "variableDeclarator", "variableAssignment", 
		"type", "unaryPrimitiveType", "booleanType", "numericType", "integralType", 
		"floatingPointType", "collectionType", "variableInitializer", "collectionInitializer", 
		"methodDeclaration", "methodModifier", "methodHeader", "methodDeclarator", 
		"formalParameterList", "formalParameters", "formalParameter", "methodBody", 
		"blockStatements", "blockStatement", "statement", "returnStatement", "ifStatement", 
		"ifBody", "expressionStatement", "postIncrementExpression", "objectDeclaration", 
		"objName", "methodInvocation", "methodInvoke", "methodTypeRef", "methodCurrying", 
		"methodName", "typeName", "argumentList", "methodCallParams", "methodReference", 
		"lambdaExpression", "outputStream", "prefixName", "literalName", "argument", 
		"expression"
	};

	@Override
	public String getGrammarFileName() { return "Jambda.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public JambdaParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class CompilationUnitContext extends ParserRuleContext {
		public List<TerminalNode> NL() { return getTokens(JambdaParser.NL); }
		public TypeDeclarationContext typeDeclaration(int i) {
			return getRuleContext(TypeDeclarationContext.class,i);
		}
		public ImportDeclarationContext importDeclaration(int i) {
			return getRuleContext(ImportDeclarationContext.class,i);
		}
		public List<ImportDeclarationContext> importDeclaration() {
			return getRuleContexts(ImportDeclarationContext.class);
		}
		public TerminalNode EOF() { return getToken(JambdaParser.EOF, 0); }
		public PackageDeclarationContext packageDeclaration() {
			return getRuleContext(PackageDeclarationContext.class,0);
		}
		public List<TypeDeclarationContext> typeDeclaration() {
			return getRuleContexts(TypeDeclarationContext.class);
		}
		public TerminalNode NL(int i) {
			return getToken(JambdaParser.NL, i);
		}
		public CompilationUnitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compilationUnit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JambdaListener ) ((JambdaListener)listener).enterCompilationUnit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JambdaListener ) ((JambdaListener)listener).exitCompilationUnit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JambdaVisitor ) return ((JambdaVisitor<? extends T>)visitor).visitCompilationUnit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompilationUnitContext compilationUnit() throws RecognitionException {
		CompilationUnitContext _localctx = new CompilationUnitContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_compilationUnit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(119);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(116); match(NL);
				}
				}
				setState(121);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(123);
			_la = _input.LA(1);
			if (_la==PACKAGE) {
				{
				setState(122); packageDeclaration();
				}
			}

			setState(128);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IMPORT) {
				{
				{
				setState(125); importDeclaration();
				}
				}
				setState(130);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(134);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PUBLIC || _la==IDENTIFIER) {
				{
				{
				setState(131); typeDeclaration();
				}
				}
				setState(136);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(137); match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PackageDeclarationContext extends ParserRuleContext {
		public List<TerminalNode> NL() { return getTokens(JambdaParser.NL); }
		public TerminalNode PACKAGE() { return getToken(JambdaParser.PACKAGE, 0); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(JambdaParser.IDENTIFIER, i);
		}
		public TerminalNode NL(int i) {
			return getToken(JambdaParser.NL, i);
		}
		public List<TerminalNode> IDENTIFIER() { return getTokens(JambdaParser.IDENTIFIER); }
		public PackageDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_packageDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JambdaListener ) ((JambdaListener)listener).enterPackageDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JambdaListener ) ((JambdaListener)listener).exitPackageDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JambdaVisitor ) return ((JambdaVisitor<? extends T>)visitor).visitPackageDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PackageDeclarationContext packageDeclaration() throws RecognitionException {
		PackageDeclarationContext _localctx = new PackageDeclarationContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_packageDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(139); match(PACKAGE);
			setState(140); match(IDENTIFIER);
			setState(145);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__7) {
				{
				{
				setState(141); match(T__7);
				setState(142); match(IDENTIFIER);
				}
				}
				setState(147);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(151);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(148); match(NL);
				}
				}
				setState(153);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ImportDeclarationContext extends ParserRuleContext {
		public List<TerminalNode> NL() { return getTokens(JambdaParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(JambdaParser.NL, i);
		}
		public TypeImportOnDemandDeclarationContext typeImportOnDemandDeclaration() {
			return getRuleContext(TypeImportOnDemandDeclarationContext.class,0);
		}
		public ImportDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JambdaListener ) ((JambdaListener)listener).enterImportDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JambdaListener ) ((JambdaListener)listener).exitImportDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JambdaVisitor ) return ((JambdaVisitor<? extends T>)visitor).visitImportDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportDeclarationContext importDeclaration() throws RecognitionException {
		ImportDeclarationContext _localctx = new ImportDeclarationContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_importDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(154); typeImportOnDemandDeclaration();
			setState(158);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(155); match(NL);
				}
				}
				setState(160);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeImportOnDemandDeclarationContext extends ParserRuleContext {
		public TerminalNode IMPORT() { return getToken(JambdaParser.IMPORT, 0); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(JambdaParser.IDENTIFIER, i);
		}
		public TerminalNode STAR() { return getToken(JambdaParser.STAR, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(JambdaParser.IDENTIFIER); }
		public TypeImportOnDemandDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeImportOnDemandDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JambdaListener ) ((JambdaListener)listener).enterTypeImportOnDemandDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JambdaListener ) ((JambdaListener)listener).exitTypeImportOnDemandDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JambdaVisitor ) return ((JambdaVisitor<? extends T>)visitor).visitTypeImportOnDemandDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeImportOnDemandDeclarationContext typeImportOnDemandDeclaration() throws RecognitionException {
		TypeImportOnDemandDeclarationContext _localctx = new TypeImportOnDemandDeclarationContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_typeImportOnDemandDeclaration);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(161); match(IMPORT);
			setState(162); match(IDENTIFIER);
			setState(167);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(163); match(T__7);
					setState(164); match(IDENTIFIER);
					}
					} 
				}
				setState(169);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			}
			setState(172);
			_la = _input.LA(1);
			if (_la==T__7) {
				{
				setState(170); match(T__7);
				setState(171); match(STAR);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeDeclarationContext extends ParserRuleContext {
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public TypeDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JambdaListener ) ((JambdaListener)listener).enterTypeDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JambdaListener ) ((JambdaListener)listener).exitTypeDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JambdaVisitor ) return ((JambdaVisitor<? extends T>)visitor).visitTypeDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeDeclarationContext typeDeclaration() throws RecognitionException {
		TypeDeclarationContext _localctx = new TypeDeclarationContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_typeDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(174); classDeclaration();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassDeclarationContext extends ParserRuleContext {
		public List<TerminalNode> NL() { return getTokens(JambdaParser.NL); }
		public SuperInterfacesContext superInterfaces() {
			return getRuleContext(SuperInterfacesContext.class,0);
		}
		public ClassBodyContext classBody() {
			return getRuleContext(ClassBodyContext.class,0);
		}
		public SuperClassContext superClass() {
			return getRuleContext(SuperClassContext.class,0);
		}
		public TerminalNode PUBLIC() { return getToken(JambdaParser.PUBLIC, 0); }
		public TerminalNode NL(int i) {
			return getToken(JambdaParser.NL, i);
		}
		public TerminalNode IDENTIFIER() { return getToken(JambdaParser.IDENTIFIER, 0); }
		public TerminalNode CLASS() { return getToken(JambdaParser.CLASS, 0); }
		public ClassDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JambdaListener ) ((JambdaListener)listener).enterClassDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JambdaListener ) ((JambdaListener)listener).exitClassDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JambdaVisitor ) return ((JambdaVisitor<? extends T>)visitor).visitClassDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassDeclarationContext classDeclaration() throws RecognitionException {
		ClassDeclarationContext _localctx = new ClassDeclarationContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_classDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(177);
			_la = _input.LA(1);
			if (_la==PUBLIC) {
				{
				setState(176); match(PUBLIC);
				}
			}

			setState(179); match(IDENTIFIER);
			setState(180); match(T__7);
			setState(181); match(CLASS);
			setState(183);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(182); superClass();
				}
			}

			setState(186);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(185); superInterfaces();
				}
			}

			setState(188); classBody();
			setState(192);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(189); match(NL);
				}
				}
				setState(194);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SuperClassContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(JambdaParser.IDENTIFIER, 0); }
		public TerminalNode EXTENDS() { return getToken(JambdaParser.EXTENDS, 0); }
		public SuperClassContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_superClass; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JambdaListener ) ((JambdaListener)listener).enterSuperClass(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JambdaListener ) ((JambdaListener)listener).exitSuperClass(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JambdaVisitor ) return ((JambdaVisitor<? extends T>)visitor).visitSuperClass(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SuperClassContext superClass() throws RecognitionException {
		SuperClassContext _localctx = new SuperClassContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_superClass);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(195); match(IDENTIFIER);
			setState(196); match(T__7);
			setState(197); match(EXTENDS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SuperInterfacesContext extends ParserRuleContext {
		public InterfaceTypeListContext interfaceTypeList() {
			return getRuleContext(InterfaceTypeListContext.class,0);
		}
		public TerminalNode IMPLEMENTS() { return getToken(JambdaParser.IMPLEMENTS, 0); }
		public SuperInterfacesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_superInterfaces; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JambdaListener ) ((JambdaListener)listener).enterSuperInterfaces(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JambdaListener ) ((JambdaListener)listener).exitSuperInterfaces(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JambdaVisitor ) return ((JambdaVisitor<? extends T>)visitor).visitSuperInterfaces(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SuperInterfacesContext superInterfaces() throws RecognitionException {
		SuperInterfacesContext _localctx = new SuperInterfacesContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_superInterfaces);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(199); match(LPAREN);
			setState(200); interfaceTypeList();
			setState(201); match(T__8);
			setState(202); match(IMPLEMENTS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InterfaceTypeListContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER(int i) {
			return getToken(JambdaParser.IDENTIFIER, i);
		}
		public List<TerminalNode> IDENTIFIER() { return getTokens(JambdaParser.IDENTIFIER); }
		public InterfaceTypeListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceTypeList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JambdaListener ) ((JambdaListener)listener).enterInterfaceTypeList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JambdaListener ) ((JambdaListener)listener).exitInterfaceTypeList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JambdaVisitor ) return ((JambdaVisitor<? extends T>)visitor).visitInterfaceTypeList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InterfaceTypeListContext interfaceTypeList() throws RecognitionException {
		InterfaceTypeListContext _localctx = new InterfaceTypeListContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_interfaceTypeList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(204); match(IDENTIFIER);
			setState(209);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__12) {
				{
				{
				setState(205); match(T__12);
				setState(206); match(IDENTIFIER);
				}
				}
				setState(211);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassBodyContext extends ParserRuleContext {
		public List<ClassBodyDeclarationContext> classBodyDeclaration() {
			return getRuleContexts(ClassBodyDeclarationContext.class);
		}
		public ClassBodyDeclarationContext classBodyDeclaration(int i) {
			return getRuleContext(ClassBodyDeclarationContext.class,i);
		}
		public ClassBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JambdaListener ) ((JambdaListener)listener).enterClassBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JambdaListener ) ((JambdaListener)listener).exitClassBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JambdaVisitor ) return ((JambdaVisitor<? extends T>)visitor).visitClassBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassBodyContext classBody() throws RecognitionException {
		ClassBodyContext _localctx = new ClassBodyContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_classBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(212); match(T__9);
			setState(213); match(LCBRACKET);
			setState(217);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PUBLIC) | (1L << PROTECTED) | (1L << PRIVATE) | (1L << STATIC) | (1L << STRING) | (1L << BOOLEAN) | (1L << INTEGER) | (1L << CHARACTER) | (1L << DOUBLE) | (1L << ARRAYLIST) | (1L << IDENTIFIER))) != 0)) {
				{
				{
				setState(214); classBodyDeclaration();
				}
				}
				setState(219);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(220); match(RCBRACKET);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassBodyDeclarationContext extends ParserRuleContext {
		public List<TerminalNode> NL() { return getTokens(JambdaParser.NL); }
		public ClassMemberDeclarationContext classMemberDeclaration() {
			return getRuleContext(ClassMemberDeclarationContext.class,0);
		}
		public TerminalNode NL(int i) {
			return getToken(JambdaParser.NL, i);
		}
		public ClassBodyDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classBodyDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JambdaListener ) ((JambdaListener)listener).enterClassBodyDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JambdaListener ) ((JambdaListener)listener).exitClassBodyDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JambdaVisitor ) return ((JambdaVisitor<? extends T>)visitor).visitClassBodyDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassBodyDeclarationContext classBodyDeclaration() throws RecognitionException {
		ClassBodyDeclarationContext _localctx = new ClassBodyDeclarationContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_classBodyDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(222); classMemberDeclaration();
			setState(226);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(223); match(NL);
				}
				}
				setState(228);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassMemberDeclarationContext extends ParserRuleContext {
		public MethodDeclarationContext methodDeclaration() {
			return getRuleContext(MethodDeclarationContext.class,0);
		}
		public FieldDeclarationContext fieldDeclaration() {
			return getRuleContext(FieldDeclarationContext.class,0);
		}
		public ClassMemberDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classMemberDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JambdaListener ) ((JambdaListener)listener).enterClassMemberDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JambdaListener ) ((JambdaListener)listener).exitClassMemberDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JambdaVisitor ) return ((JambdaVisitor<? extends T>)visitor).visitClassMemberDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassMemberDeclarationContext classMemberDeclaration() throws RecognitionException {
		ClassMemberDeclarationContext _localctx = new ClassMemberDeclarationContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_classMemberDeclaration);
		try {
			setState(231);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(229); fieldDeclaration();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(230); methodDeclaration();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FieldDeclarationContext extends ParserRuleContext {
		public List<FieldModifierContext> fieldModifier() {
			return getRuleContexts(FieldModifierContext.class);
		}
		public VariableDeclaratorContext variableDeclarator() {
			return getRuleContext(VariableDeclaratorContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public FieldModifierContext fieldModifier(int i) {
			return getRuleContext(FieldModifierContext.class,i);
		}
		public FieldDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JambdaListener ) ((JambdaListener)listener).enterFieldDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JambdaListener ) ((JambdaListener)listener).exitFieldDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JambdaVisitor ) return ((JambdaVisitor<? extends T>)visitor).visitFieldDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FieldDeclarationContext fieldDeclaration() throws RecognitionException {
		FieldDeclarationContext _localctx = new FieldDeclarationContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_fieldDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(236);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PUBLIC) | (1L << PROTECTED) | (1L << PRIVATE) | (1L << STATIC))) != 0)) {
				{
				{
				setState(233); fieldModifier();
				}
				}
				setState(238);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(239); type();
			setState(240); variableDeclarator();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FieldModifierContext extends ParserRuleContext {
		public TerminalNode STATIC() { return getToken(JambdaParser.STATIC, 0); }
		public TerminalNode PROTECTED() { return getToken(JambdaParser.PROTECTED, 0); }
		public TerminalNode PUBLIC() { return getToken(JambdaParser.PUBLIC, 0); }
		public TerminalNode PRIVATE() { return getToken(JambdaParser.PRIVATE, 0); }
		public FieldModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JambdaListener ) ((JambdaListener)listener).enterFieldModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JambdaListener ) ((JambdaListener)listener).exitFieldModifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JambdaVisitor ) return ((JambdaVisitor<? extends T>)visitor).visitFieldModifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FieldModifierContext fieldModifier() throws RecognitionException {
		FieldModifierContext _localctx = new FieldModifierContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_fieldModifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(242);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PUBLIC) | (1L << PROTECTED) | (1L << PRIVATE) | (1L << STATIC))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableDeclaratorContext extends ParserRuleContext {
		public VariableAssignmentContext variableAssignment() {
			return getRuleContext(VariableAssignmentContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(JambdaParser.IDENTIFIER, 0); }
		public VariableDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JambdaListener ) ((JambdaListener)listener).enterVariableDeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JambdaListener ) ((JambdaListener)listener).exitVariableDeclarator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JambdaVisitor ) return ((JambdaVisitor<? extends T>)visitor).visitVariableDeclarator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDeclaratorContext variableDeclarator() throws RecognitionException {
		VariableDeclaratorContext _localctx = new VariableDeclaratorContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_variableDeclarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(244); match(IDENTIFIER);
			setState(246);
			_la = _input.LA(1);
			if (_la==T__9) {
				{
				setState(245); variableAssignment();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableAssignmentContext extends ParserRuleContext {
		public VariableInitializerContext variableInitializer() {
			return getRuleContext(VariableInitializerContext.class,0);
		}
		public VariableAssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableAssignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JambdaListener ) ((JambdaListener)listener).enterVariableAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JambdaListener ) ((JambdaListener)listener).exitVariableAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JambdaVisitor ) return ((JambdaVisitor<? extends T>)visitor).visitVariableAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableAssignmentContext variableAssignment() throws RecognitionException {
		VariableAssignmentContext _localctx = new VariableAssignmentContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_variableAssignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(248); match(T__9);
			setState(249); variableInitializer();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeContext extends ParserRuleContext {
		public UnaryPrimitiveTypeContext unaryPrimitiveType() {
			return getRuleContext(UnaryPrimitiveTypeContext.class,0);
		}
		public TerminalNode STRING() { return getToken(JambdaParser.STRING, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JambdaListener ) ((JambdaListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JambdaListener ) ((JambdaListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JambdaVisitor ) return ((JambdaVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_type);
		try {
			setState(253);
			switch (_input.LA(1)) {
			case BOOLEAN:
			case INTEGER:
			case CHARACTER:
			case DOUBLE:
			case ARRAYLIST:
				enterOuterAlt(_localctx, 1);
				{
				setState(251); unaryPrimitiveType();
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(252); match(STRING);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnaryPrimitiveTypeContext extends ParserRuleContext {
		public NumericTypeContext numericType() {
			return getRuleContext(NumericTypeContext.class,0);
		}
		public BooleanTypeContext booleanType() {
			return getRuleContext(BooleanTypeContext.class,0);
		}
		public UnaryPrimitiveTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryPrimitiveType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JambdaListener ) ((JambdaListener)listener).enterUnaryPrimitiveType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JambdaListener ) ((JambdaListener)listener).exitUnaryPrimitiveType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JambdaVisitor ) return ((JambdaVisitor<? extends T>)visitor).visitUnaryPrimitiveType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnaryPrimitiveTypeContext unaryPrimitiveType() throws RecognitionException {
		UnaryPrimitiveTypeContext _localctx = new UnaryPrimitiveTypeContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_unaryPrimitiveType);
		try {
			setState(257);
			switch (_input.LA(1)) {
			case INTEGER:
			case CHARACTER:
			case DOUBLE:
			case ARRAYLIST:
				enterOuterAlt(_localctx, 1);
				{
				setState(255); numericType();
				}
				break;
			case BOOLEAN:
				enterOuterAlt(_localctx, 2);
				{
				setState(256); booleanType();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BooleanTypeContext extends ParserRuleContext {
		public TerminalNode BOOLEAN() { return getToken(JambdaParser.BOOLEAN, 0); }
		public BooleanTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JambdaListener ) ((JambdaListener)listener).enterBooleanType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JambdaListener ) ((JambdaListener)listener).exitBooleanType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JambdaVisitor ) return ((JambdaVisitor<? extends T>)visitor).visitBooleanType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BooleanTypeContext booleanType() throws RecognitionException {
		BooleanTypeContext _localctx = new BooleanTypeContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_booleanType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(259); match(BOOLEAN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NumericTypeContext extends ParserRuleContext {
		public CollectionTypeContext collectionType() {
			return getRuleContext(CollectionTypeContext.class,0);
		}
		public IntegralTypeContext integralType() {
			return getRuleContext(IntegralTypeContext.class,0);
		}
		public FloatingPointTypeContext floatingPointType() {
			return getRuleContext(FloatingPointTypeContext.class,0);
		}
		public NumericTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numericType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JambdaListener ) ((JambdaListener)listener).enterNumericType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JambdaListener ) ((JambdaListener)listener).exitNumericType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JambdaVisitor ) return ((JambdaVisitor<? extends T>)visitor).visitNumericType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumericTypeContext numericType() throws RecognitionException {
		NumericTypeContext _localctx = new NumericTypeContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_numericType);
		try {
			setState(264);
			switch (_input.LA(1)) {
			case INTEGER:
			case CHARACTER:
				enterOuterAlt(_localctx, 1);
				{
				setState(261); integralType();
				}
				break;
			case DOUBLE:
				enterOuterAlt(_localctx, 2);
				{
				setState(262); floatingPointType();
				}
				break;
			case ARRAYLIST:
				enterOuterAlt(_localctx, 3);
				{
				setState(263); collectionType();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IntegralTypeContext extends ParserRuleContext {
		public TerminalNode INTEGER() { return getToken(JambdaParser.INTEGER, 0); }
		public TerminalNode CHARACTER() { return getToken(JambdaParser.CHARACTER, 0); }
		public IntegralTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_integralType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JambdaListener ) ((JambdaListener)listener).enterIntegralType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JambdaListener ) ((JambdaListener)listener).exitIntegralType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JambdaVisitor ) return ((JambdaVisitor<? extends T>)visitor).visitIntegralType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntegralTypeContext integralType() throws RecognitionException {
		IntegralTypeContext _localctx = new IntegralTypeContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_integralType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(266);
			_la = _input.LA(1);
			if ( !(_la==INTEGER || _la==CHARACTER) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FloatingPointTypeContext extends ParserRuleContext {
		public TerminalNode DOUBLE() { return getToken(JambdaParser.DOUBLE, 0); }
		public FloatingPointTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_floatingPointType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JambdaListener ) ((JambdaListener)listener).enterFloatingPointType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JambdaListener ) ((JambdaListener)listener).exitFloatingPointType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JambdaVisitor ) return ((JambdaVisitor<? extends T>)visitor).visitFloatingPointType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FloatingPointTypeContext floatingPointType() throws RecognitionException {
		FloatingPointTypeContext _localctx = new FloatingPointTypeContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_floatingPointType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(268); match(DOUBLE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CollectionTypeContext extends ParserRuleContext {
		public TerminalNode ARRAYLIST() { return getToken(JambdaParser.ARRAYLIST, 0); }
		public CollectionTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_collectionType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JambdaListener ) ((JambdaListener)listener).enterCollectionType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JambdaListener ) ((JambdaListener)listener).exitCollectionType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JambdaVisitor ) return ((JambdaVisitor<? extends T>)visitor).visitCollectionType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CollectionTypeContext collectionType() throws RecognitionException {
		CollectionTypeContext _localctx = new CollectionTypeContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_collectionType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(270); match(ARRAYLIST);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableInitializerContext extends ParserRuleContext {
		public TerminalNode STRINGLITERAL() { return getToken(JambdaParser.STRINGLITERAL, 0); }
		public TerminalNode BOOLEANLITERAL() { return getToken(JambdaParser.BOOLEANLITERAL, 0); }
		public TerminalNode NUMBER() { return getToken(JambdaParser.NUMBER, 0); }
		public TerminalNode IDENTIFIER() { return getToken(JambdaParser.IDENTIFIER, 0); }
		public TerminalNode CHARLITERAL() { return getToken(JambdaParser.CHARLITERAL, 0); }
		public CollectionInitializerContext collectionInitializer() {
			return getRuleContext(CollectionInitializerContext.class,0);
		}
		public VariableInitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableInitializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JambdaListener ) ((JambdaListener)listener).enterVariableInitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JambdaListener ) ((JambdaListener)listener).exitVariableInitializer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JambdaVisitor ) return ((JambdaVisitor<? extends T>)visitor).visitVariableInitializer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableInitializerContext variableInitializer() throws RecognitionException {
		VariableInitializerContext _localctx = new VariableInitializerContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_variableInitializer);
		try {
			setState(278);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(272); match(IDENTIFIER);
				}
				break;
			case NUMBER:
				enterOuterAlt(_localctx, 2);
				{
				setState(273); match(NUMBER);
				}
				break;
			case STRINGLITERAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(274); match(STRINGLITERAL);
				}
				break;
			case BOOLEANLITERAL:
				enterOuterAlt(_localctx, 4);
				{
				setState(275); match(BOOLEANLITERAL);
				}
				break;
			case CHARLITERAL:
				enterOuterAlt(_localctx, 5);
				{
				setState(276); match(CHARLITERAL);
				}
				break;
			case T__3:
				enterOuterAlt(_localctx, 6);
				{
				setState(277); collectionInitializer();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CollectionInitializerContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public CollectionInitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_collectionInitializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JambdaListener ) ((JambdaListener)listener).enterCollectionInitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JambdaListener ) ((JambdaListener)listener).exitCollectionInitializer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JambdaVisitor ) return ((JambdaVisitor<? extends T>)visitor).visitCollectionInitializer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CollectionInitializerContext collectionInitializer() throws RecognitionException {
		CollectionInitializerContext _localctx = new CollectionInitializerContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_collectionInitializer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(280); match(T__3);
			setState(281); type();
			setState(282); match(T__2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodDeclarationContext extends ParserRuleContext {
		public MethodBodyContext methodBody() {
			return getRuleContext(MethodBodyContext.class,0);
		}
		public MethodHeaderContext methodHeader() {
			return getRuleContext(MethodHeaderContext.class,0);
		}
		public List<MethodModifierContext> methodModifier() {
			return getRuleContexts(MethodModifierContext.class);
		}
		public MethodModifierContext methodModifier(int i) {
			return getRuleContext(MethodModifierContext.class,i);
		}
		public MethodDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JambdaListener ) ((JambdaListener)listener).enterMethodDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JambdaListener ) ((JambdaListener)listener).exitMethodDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JambdaVisitor ) return ((JambdaVisitor<? extends T>)visitor).visitMethodDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodDeclarationContext methodDeclaration() throws RecognitionException {
		MethodDeclarationContext _localctx = new MethodDeclarationContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_methodDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(287);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PUBLIC) | (1L << PRIVATE) | (1L << STATIC))) != 0)) {
				{
				{
				setState(284); methodModifier();
				}
				}
				setState(289);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(290); methodHeader();
			setState(291); methodBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodModifierContext extends ParserRuleContext {
		public TerminalNode STATIC() { return getToken(JambdaParser.STATIC, 0); }
		public TerminalNode PUBLIC() { return getToken(JambdaParser.PUBLIC, 0); }
		public TerminalNode PRIVATE() { return getToken(JambdaParser.PRIVATE, 0); }
		public MethodModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JambdaListener ) ((JambdaListener)listener).enterMethodModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JambdaListener ) ((JambdaListener)listener).exitMethodModifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JambdaVisitor ) return ((JambdaVisitor<? extends T>)visitor).visitMethodModifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodModifierContext methodModifier() throws RecognitionException {
		MethodModifierContext _localctx = new MethodModifierContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_methodModifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(293);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PUBLIC) | (1L << PRIVATE) | (1L << STATIC))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodHeaderContext extends ParserRuleContext {
		public MethodDeclaratorContext methodDeclarator() {
			return getRuleContext(MethodDeclaratorContext.class,0);
		}
		public MethodHeaderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodHeader; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JambdaListener ) ((JambdaListener)listener).enterMethodHeader(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JambdaListener ) ((JambdaListener)listener).exitMethodHeader(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JambdaVisitor ) return ((JambdaVisitor<? extends T>)visitor).visitMethodHeader(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodHeaderContext methodHeader() throws RecognitionException {
		MethodHeaderContext _localctx = new MethodHeaderContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_methodHeader);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(295); methodDeclarator();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodDeclaratorContext extends ParserRuleContext {
		public FormalParameterListContext formalParameterList() {
			return getRuleContext(FormalParameterListContext.class,0);
		}
		public MethodNameContext methodName() {
			return getRuleContext(MethodNameContext.class,0);
		}
		public MethodDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodDeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JambdaListener ) ((JambdaListener)listener).enterMethodDeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JambdaListener ) ((JambdaListener)listener).exitMethodDeclarator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JambdaVisitor ) return ((JambdaVisitor<? extends T>)visitor).visitMethodDeclarator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodDeclaratorContext methodDeclarator() throws RecognitionException {
		MethodDeclaratorContext _localctx = new MethodDeclaratorContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_methodDeclarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(297); methodName();
			setState(298); match(T__14);
			setState(300);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STRING) | (1L << BOOLEAN) | (1L << INTEGER) | (1L << CHARACTER) | (1L << DOUBLE) | (1L << ARRAYLIST))) != 0)) {
				{
				setState(299); formalParameterList();
				}
			}

			setState(302); match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FormalParameterListContext extends ParserRuleContext {
		public FormalParametersContext formalParameters() {
			return getRuleContext(FormalParametersContext.class,0);
		}
		public FormalParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParameterList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JambdaListener ) ((JambdaListener)listener).enterFormalParameterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JambdaListener ) ((JambdaListener)listener).exitFormalParameterList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JambdaVisitor ) return ((JambdaVisitor<? extends T>)visitor).visitFormalParameterList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FormalParameterListContext formalParameterList() throws RecognitionException {
		FormalParameterListContext _localctx = new FormalParameterListContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_formalParameterList);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(304); formalParameters();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FormalParametersContext extends ParserRuleContext {
		public List<FormalParameterContext> formalParameter() {
			return getRuleContexts(FormalParameterContext.class);
		}
		public FormalParameterContext formalParameter(int i) {
			return getRuleContext(FormalParameterContext.class,i);
		}
		public FormalParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JambdaListener ) ((JambdaListener)listener).enterFormalParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JambdaListener ) ((JambdaListener)listener).exitFormalParameters(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JambdaVisitor ) return ((JambdaVisitor<? extends T>)visitor).visitFormalParameters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FormalParametersContext formalParameters() throws RecognitionException {
		FormalParametersContext _localctx = new FormalParametersContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_formalParameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(306); formalParameter();
			setState(311);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__12) {
				{
				{
				setState(307); match(T__12);
				setState(308); formalParameter();
				}
				}
				setState(313);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FormalParameterContext extends ParserRuleContext {
		public TerminalNode ELLIPSIS() { return getToken(JambdaParser.ELLIPSIS, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(JambdaParser.IDENTIFIER, 0); }
		public FormalParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JambdaListener ) ((JambdaListener)listener).enterFormalParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JambdaListener ) ((JambdaListener)listener).exitFormalParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JambdaVisitor ) return ((JambdaVisitor<? extends T>)visitor).visitFormalParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FormalParameterContext formalParameter() throws RecognitionException {
		FormalParameterContext _localctx = new FormalParameterContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_formalParameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(314); type();
			setState(316);
			_la = _input.LA(1);
			if (_la==ELLIPSIS) {
				{
				setState(315); match(ELLIPSIS);
				}
			}

			setState(318); match(IDENTIFIER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodBodyContext extends ParserRuleContext {
		public BlockStatementsContext blockStatements() {
			return getRuleContext(BlockStatementsContext.class,0);
		}
		public MethodBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JambdaListener ) ((JambdaListener)listener).enterMethodBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JambdaListener ) ((JambdaListener)listener).exitMethodBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JambdaVisitor ) return ((JambdaVisitor<? extends T>)visitor).visitMethodBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodBodyContext methodBody() throws RecognitionException {
		MethodBodyContext _localctx = new MethodBodyContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_methodBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(320); match(T__9);
			setState(321); match(LCBRACKET);
			setState(323);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PUBLIC) | (1L << PROTECTED) | (1L << PRIVATE) | (1L << STATIC) | (1L << STRING) | (1L << BOOLEAN) | (1L << INTEGER) | (1L << CHARACTER) | (1L << DOUBLE) | (1L << ARRAYLIST) | (1L << RETURN) | (1L << IF) | (1L << IDENTIFIER))) != 0)) {
				{
				setState(322); blockStatements();
				}
			}

			setState(325); match(T__10);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockStatementsContext extends ParserRuleContext {
		public List<BlockStatementContext> blockStatement() {
			return getRuleContexts(BlockStatementContext.class);
		}
		public BlockStatementContext blockStatement(int i) {
			return getRuleContext(BlockStatementContext.class,i);
		}
		public BlockStatementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockStatements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JambdaListener ) ((JambdaListener)listener).enterBlockStatements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JambdaListener ) ((JambdaListener)listener).exitBlockStatements(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JambdaVisitor ) return ((JambdaVisitor<? extends T>)visitor).visitBlockStatements(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockStatementsContext blockStatements() throws RecognitionException {
		BlockStatementsContext _localctx = new BlockStatementsContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_blockStatements);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(327); blockStatement();
			setState(331);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PUBLIC) | (1L << PROTECTED) | (1L << PRIVATE) | (1L << STATIC) | (1L << STRING) | (1L << BOOLEAN) | (1L << INTEGER) | (1L << CHARACTER) | (1L << DOUBLE) | (1L << ARRAYLIST) | (1L << RETURN) | (1L << IF) | (1L << IDENTIFIER))) != 0)) {
				{
				{
				setState(328); blockStatement();
				}
				}
				setState(333);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockStatementContext extends ParserRuleContext {
		public List<TerminalNode> NL() { return getTokens(JambdaParser.NL); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode NL(int i) {
			return getToken(JambdaParser.NL, i);
		}
		public BlockStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JambdaListener ) ((JambdaListener)listener).enterBlockStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JambdaListener ) ((JambdaListener)listener).exitBlockStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JambdaVisitor ) return ((JambdaVisitor<? extends T>)visitor).visitBlockStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockStatementContext blockStatement() throws RecognitionException {
		BlockStatementContext _localctx = new BlockStatementContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_blockStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(334); statement();
			setState(338);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(335); match(NL);
				}
				}
				setState(340);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public ExpressionStatementContext expressionStatement() {
			return getRuleContext(ExpressionStatementContext.class,0);
		}
		public ReturnStatementContext returnStatement() {
			return getRuleContext(ReturnStatementContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JambdaListener ) ((JambdaListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JambdaListener ) ((JambdaListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JambdaVisitor ) return ((JambdaVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_statement);
		try {
			setState(344);
			switch (_input.LA(1)) {
			case PUBLIC:
			case PROTECTED:
			case PRIVATE:
			case STATIC:
			case STRING:
			case BOOLEAN:
			case INTEGER:
			case CHARACTER:
			case DOUBLE:
			case ARRAYLIST:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(341); expressionStatement();
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 2);
				{
				setState(342); ifStatement();
				}
				break;
			case RETURN:
				enterOuterAlt(_localctx, 3);
				{
				setState(343); returnStatement();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ReturnStatementContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(JambdaParser.RETURN, 0); }
		public TerminalNode IDENTIFIER() { return getToken(JambdaParser.IDENTIFIER, 0); }
		public ReturnStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JambdaListener ) ((JambdaListener)listener).enterReturnStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JambdaListener ) ((JambdaListener)listener).exitReturnStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JambdaVisitor ) return ((JambdaVisitor<? extends T>)visitor).visitReturnStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnStatementContext returnStatement() throws RecognitionException {
		ReturnStatementContext _localctx = new ReturnStatementContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_returnStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(346); match(RETURN);
			setState(348);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				{
				setState(347); match(IDENTIFIER);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IfStatementContext extends ParserRuleContext {
		public IfBodyContext ifBody() {
			return getRuleContext(IfBodyContext.class,0);
		}
		public TerminalNode IF() { return getToken(JambdaParser.IF, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public IfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JambdaListener ) ((JambdaListener)listener).enterIfStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JambdaListener ) ((JambdaListener)listener).exitIfStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JambdaVisitor ) return ((JambdaVisitor<? extends T>)visitor).visitIfStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_ifStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(350); match(IF);
			setState(351); match(LPAREN);
			setState(352); expression(0);
			setState(353); match(RPAREN);
			setState(354); ifBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IfBodyContext extends ParserRuleContext {
		public ExpressionStatementContext expressionStatement() {
			return getRuleContext(ExpressionStatementContext.class,0);
		}
		public IfBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JambdaListener ) ((JambdaListener)listener).enterIfBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JambdaListener ) ((JambdaListener)listener).exitIfBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JambdaVisitor ) return ((JambdaVisitor<? extends T>)visitor).visitIfBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfBodyContext ifBody() throws RecognitionException {
		IfBodyContext _localctx = new IfBodyContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_ifBody);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(356); expressionStatement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionStatementContext extends ParserRuleContext {
		public PostIncrementExpressionContext postIncrementExpression() {
			return getRuleContext(PostIncrementExpressionContext.class,0);
		}
		public MethodInvocationContext methodInvocation() {
			return getRuleContext(MethodInvocationContext.class,0);
		}
		public ObjectDeclarationContext objectDeclaration() {
			return getRuleContext(ObjectDeclarationContext.class,0);
		}
		public FieldDeclarationContext fieldDeclaration() {
			return getRuleContext(FieldDeclarationContext.class,0);
		}
		public ExpressionStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JambdaListener ) ((JambdaListener)listener).enterExpressionStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JambdaListener ) ((JambdaListener)listener).exitExpressionStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JambdaVisitor ) return ((JambdaVisitor<? extends T>)visitor).visitExpressionStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionStatementContext expressionStatement() throws RecognitionException {
		ExpressionStatementContext _localctx = new ExpressionStatementContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_expressionStatement);
		try {
			setState(362);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(358); methodInvocation();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(359); fieldDeclaration();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(360); objectDeclaration();
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(361); postIncrementExpression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PostIncrementExpressionContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(JambdaParser.IDENTIFIER, 0); }
		public PostIncrementExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_postIncrementExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JambdaListener ) ((JambdaListener)listener).enterPostIncrementExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JambdaListener ) ((JambdaListener)listener).exitPostIncrementExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JambdaVisitor ) return ((JambdaVisitor<? extends T>)visitor).visitPostIncrementExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PostIncrementExpressionContext postIncrementExpression() throws RecognitionException {
		PostIncrementExpressionContext _localctx = new PostIncrementExpressionContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_postIncrementExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(364); match(IDENTIFIER);
			setState(365); match(T__4);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ObjectDeclarationContext extends ParserRuleContext {
		public ObjNameContext objName() {
			return getRuleContext(ObjNameContext.class,0);
		}
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public ObjectDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objectDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JambdaListener ) ((JambdaListener)listener).enterObjectDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JambdaListener ) ((JambdaListener)listener).exitObjectDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JambdaVisitor ) return ((JambdaVisitor<? extends T>)visitor).visitObjectDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ObjectDeclarationContext objectDeclaration() throws RecognitionException {
		ObjectDeclarationContext _localctx = new ObjectDeclarationContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_objectDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(367); typeName();
			setState(368); objName();
			setState(369); match(T__9);
			setState(370); match(T__20);
			setState(371); match(LPAREN);
			setState(372); match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ObjNameContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(JambdaParser.IDENTIFIER, 0); }
		public ObjNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JambdaListener ) ((JambdaListener)listener).enterObjName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JambdaListener ) ((JambdaListener)listener).exitObjName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JambdaVisitor ) return ((JambdaVisitor<? extends T>)visitor).visitObjName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ObjNameContext objName() throws RecognitionException {
		ObjNameContext _localctx = new ObjNameContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_objName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(374); match(IDENTIFIER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodInvocationContext extends ParserRuleContext {
		public MethodInvokeContext methodInvoke() {
			return getRuleContext(MethodInvokeContext.class,0);
		}
		public MethodInvocationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodInvocation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JambdaListener ) ((JambdaListener)listener).enterMethodInvocation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JambdaListener ) ((JambdaListener)listener).exitMethodInvocation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JambdaVisitor ) return ((JambdaVisitor<? extends T>)visitor).visitMethodInvocation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodInvocationContext methodInvocation() throws RecognitionException {
		MethodInvocationContext _localctx = new MethodInvocationContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_methodInvocation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(376); methodInvoke();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodInvokeContext extends ParserRuleContext {
		public MethodNameContext methodName() {
			return getRuleContext(MethodNameContext.class,0);
		}
		public List<MethodCurryingContext> methodCurrying() {
			return getRuleContexts(MethodCurryingContext.class);
		}
		public MethodCurryingContext methodCurrying(int i) {
			return getRuleContext(MethodCurryingContext.class,i);
		}
		public MethodTypeRefContext methodTypeRef() {
			return getRuleContext(MethodTypeRefContext.class,0);
		}
		public ArgumentListContext argumentList() {
			return getRuleContext(ArgumentListContext.class,0);
		}
		public MethodInvokeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodInvoke; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JambdaListener ) ((JambdaListener)listener).enterMethodInvoke(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JambdaListener ) ((JambdaListener)listener).exitMethodInvoke(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JambdaVisitor ) return ((JambdaVisitor<? extends T>)visitor).visitMethodInvoke(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodInvokeContext methodInvoke() throws RecognitionException {
		MethodInvokeContext _localctx = new MethodInvokeContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_methodInvoke);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(379);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				{
				setState(378); methodTypeRef();
				}
				break;
			}
			setState(381); methodName();
			setState(382); match(LPAREN);
			setState(384);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LPAREN) | (1L << STRINGLITERAL) | (1L << BOOLEANLITERAL) | (1L << CHARLITERAL) | (1L << NUMBER) | (1L << IDENTIFIER))) != 0)) {
				{
				setState(383); argumentList();
				}
			}

			setState(386); match(RPAREN);
			setState(390);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LPAREN) {
				{
				{
				setState(387); methodCurrying();
				}
				}
				setState(392);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodTypeRefContext extends ParserRuleContext {
		public MethodTypeRefContext methodTypeRef(int i) {
			return getRuleContext(MethodTypeRefContext.class,i);
		}
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public List<MethodTypeRefContext> methodTypeRef() {
			return getRuleContexts(MethodTypeRefContext.class);
		}
		public MethodTypeRefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodTypeRef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JambdaListener ) ((JambdaListener)listener).enterMethodTypeRef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JambdaListener ) ((JambdaListener)listener).exitMethodTypeRef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JambdaVisitor ) return ((JambdaVisitor<? extends T>)visitor).visitMethodTypeRef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodTypeRefContext methodTypeRef() throws RecognitionException {
		MethodTypeRefContext _localctx = new MethodTypeRefContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_methodTypeRef);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(393); typeName();
			setState(394); match(T__11);
			setState(398);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(395); methodTypeRef();
					}
					} 
				}
				setState(400);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodCurryingContext extends ParserRuleContext {
		public ArgumentListContext argumentList() {
			return getRuleContext(ArgumentListContext.class,0);
		}
		public MethodCurryingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodCurrying; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JambdaListener ) ((JambdaListener)listener).enterMethodCurrying(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JambdaListener ) ((JambdaListener)listener).exitMethodCurrying(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JambdaVisitor ) return ((JambdaVisitor<? extends T>)visitor).visitMethodCurrying(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodCurryingContext methodCurrying() throws RecognitionException {
		MethodCurryingContext _localctx = new MethodCurryingContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_methodCurrying);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(401); match(LPAREN);
			setState(403);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LPAREN) | (1L << STRINGLITERAL) | (1L << BOOLEANLITERAL) | (1L << CHARLITERAL) | (1L << NUMBER) | (1L << IDENTIFIER))) != 0)) {
				{
				setState(402); argumentList();
				}
			}

			setState(405); match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodNameContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(JambdaParser.IDENTIFIER, 0); }
		public MethodNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JambdaListener ) ((JambdaListener)listener).enterMethodName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JambdaListener ) ((JambdaListener)listener).exitMethodName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JambdaVisitor ) return ((JambdaVisitor<? extends T>)visitor).visitMethodName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodNameContext methodName() throws RecognitionException {
		MethodNameContext _localctx = new MethodNameContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_methodName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(407); match(IDENTIFIER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeNameContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(JambdaParser.IDENTIFIER, 0); }
		public TypeNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JambdaListener ) ((JambdaListener)listener).enterTypeName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JambdaListener ) ((JambdaListener)listener).exitTypeName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JambdaVisitor ) return ((JambdaVisitor<? extends T>)visitor).visitTypeName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeNameContext typeName() throws RecognitionException {
		TypeNameContext _localctx = new TypeNameContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_typeName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(409); match(IDENTIFIER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArgumentListContext extends ParserRuleContext {
		public MethodCallParamsContext methodCallParams() {
			return getRuleContext(MethodCallParamsContext.class,0);
		}
		public MethodReferenceContext methodReference() {
			return getRuleContext(MethodReferenceContext.class,0);
		}
		public LambdaExpressionContext lambdaExpression() {
			return getRuleContext(LambdaExpressionContext.class,0);
		}
		public ArgumentListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argumentList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JambdaListener ) ((JambdaListener)listener).enterArgumentList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JambdaListener ) ((JambdaListener)listener).exitArgumentList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JambdaVisitor ) return ((JambdaVisitor<? extends T>)visitor).visitArgumentList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentListContext argumentList() throws RecognitionException {
		ArgumentListContext _localctx = new ArgumentListContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_argumentList);
		try {
			setState(414);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(411); methodCallParams();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(412); methodReference();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(413); lambdaExpression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodCallParamsContext extends ParserRuleContext {
		public List<MethodCallParamsContext> methodCallParams() {
			return getRuleContexts(MethodCallParamsContext.class);
		}
		public MethodCallParamsContext methodCallParams(int i) {
			return getRuleContext(MethodCallParamsContext.class,i);
		}
		public LiteralNameContext literalName() {
			return getRuleContext(LiteralNameContext.class,0);
		}
		public MethodCallParamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodCallParams; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JambdaListener ) ((JambdaListener)listener).enterMethodCallParams(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JambdaListener ) ((JambdaListener)listener).exitMethodCallParams(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JambdaVisitor ) return ((JambdaVisitor<? extends T>)visitor).visitMethodCallParams(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodCallParamsContext methodCallParams() throws RecognitionException {
		MethodCallParamsContext _localctx = new MethodCallParamsContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_methodCallParams);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(416); literalName();
			setState(421);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,39,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(417); match(T__12);
					setState(418); methodCallParams();
					}
					} 
				}
				setState(423);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,39,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodReferenceContext extends ParserRuleContext {
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public MethodNameContext methodName() {
			return getRuleContext(MethodNameContext.class,0);
		}
		public MethodReferenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodReference; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JambdaListener ) ((JambdaListener)listener).enterMethodReference(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JambdaListener ) ((JambdaListener)listener).exitMethodReference(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JambdaVisitor ) return ((JambdaVisitor<? extends T>)visitor).visitMethodReference(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodReferenceContext methodReference() throws RecognitionException {
		MethodReferenceContext _localctx = new MethodReferenceContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_methodReference);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(424); typeName();
			setState(425); match(T__15);
			setState(426); methodName();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LambdaExpressionContext extends ParserRuleContext {
		public OutputStreamContext outputStream() {
			return getRuleContext(OutputStreamContext.class,0);
		}
		public PrefixNameContext prefixName() {
			return getRuleContext(PrefixNameContext.class,0);
		}
		public LambdaExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lambdaExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JambdaListener ) ((JambdaListener)listener).enterLambdaExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JambdaListener ) ((JambdaListener)listener).exitLambdaExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JambdaVisitor ) return ((JambdaVisitor<? extends T>)visitor).visitLambdaExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LambdaExpressionContext lambdaExpression() throws RecognitionException {
		LambdaExpressionContext _localctx = new LambdaExpressionContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_lambdaExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(429);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(428); match(LPAREN);
				}
			}

			setState(431); prefixName();
			setState(433);
			_la = _input.LA(1);
			if (_la==RPAREN) {
				{
				setState(432); match(RPAREN);
				}
			}

			setState(435); match(T__9);
			setState(436); match(LCBRACKET);
			setState(437); outputStream();
			setState(438); match(RCBRACKET);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OutputStreamContext extends ParserRuleContext {
		public PrefixNameContext prefixName(int i) {
			return getRuleContext(PrefixNameContext.class,i);
		}
		public List<PrefixNameContext> prefixName() {
			return getRuleContexts(PrefixNameContext.class);
		}
		public List<ArgumentContext> argument() {
			return getRuleContexts(ArgumentContext.class);
		}
		public ArgumentContext argument(int i) {
			return getRuleContext(ArgumentContext.class,i);
		}
		public OutputStreamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_outputStream; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JambdaListener ) ((JambdaListener)listener).enterOutputStream(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JambdaListener ) ((JambdaListener)listener).exitOutputStream(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JambdaVisitor ) return ((JambdaVisitor<? extends T>)visitor).visitOutputStream(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OutputStreamContext outputStream() throws RecognitionException {
		OutputStreamContext _localctx = new OutputStreamContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_outputStream);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(444);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << STRINGLITERAL) | (1L << IDENTIFIER))) != 0)) {
				{
				setState(442);
				switch (_input.LA(1)) {
				case IDENTIFIER:
					{
					setState(440); prefixName();
					}
					break;
				case T__1:
				case STRINGLITERAL:
					{
					setState(441); argument();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(446);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrefixNameContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(JambdaParser.IDENTIFIER, 0); }
		public PrefixNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prefixName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JambdaListener ) ((JambdaListener)listener).enterPrefixName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JambdaListener ) ((JambdaListener)listener).exitPrefixName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JambdaVisitor ) return ((JambdaVisitor<? extends T>)visitor).visitPrefixName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrefixNameContext prefixName() throws RecognitionException {
		PrefixNameContext _localctx = new PrefixNameContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_prefixName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(447); match(IDENTIFIER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LiteralNameContext extends ParserRuleContext {
		public TerminalNode STRINGLITERAL(int i) {
			return getToken(JambdaParser.STRINGLITERAL, i);
		}
		public List<TerminalNode> STRINGLITERAL() { return getTokens(JambdaParser.STRINGLITERAL); }
		public TerminalNode BOOLEANLITERAL() { return getToken(JambdaParser.BOOLEANLITERAL, 0); }
		public TerminalNode NUMBER() { return getToken(JambdaParser.NUMBER, 0); }
		public TerminalNode IDENTIFIER() { return getToken(JambdaParser.IDENTIFIER, 0); }
		public TerminalNode CHARLITERAL() { return getToken(JambdaParser.CHARLITERAL, 0); }
		public LiteralNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literalName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JambdaListener ) ((JambdaListener)listener).enterLiteralName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JambdaListener ) ((JambdaListener)listener).exitLiteralName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JambdaVisitor ) return ((JambdaVisitor<? extends T>)visitor).visitLiteralName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralNameContext literalName() throws RecognitionException {
		LiteralNameContext _localctx = new LiteralNameContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_literalName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(449);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STRINGLITERAL) | (1L << BOOLEANLITERAL) | (1L << CHARLITERAL) | (1L << NUMBER) | (1L << IDENTIFIER))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArgumentContext extends ParserRuleContext {
		public TerminalNode STRINGLITERAL(int i) {
			return getToken(JambdaParser.STRINGLITERAL, i);
		}
		public List<TerminalNode> STRINGLITERAL() { return getTokens(JambdaParser.STRINGLITERAL); }
		public ArgumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JambdaListener ) ((JambdaListener)listener).enterArgument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JambdaListener ) ((JambdaListener)listener).exitArgument(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JambdaVisitor ) return ((JambdaVisitor<? extends T>)visitor).visitArgument(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentContext argument() throws RecognitionException {
		ArgumentContext _localctx = new ArgumentContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_argument);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(452); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(451);
					_la = _input.LA(1);
					if ( !(_la==T__1 || _la==STRINGLITERAL) ) {
					_errHandler.recoverInline(this);
					}
					consume();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(454); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,44,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode NUMBER() { return getToken(JambdaParser.NUMBER, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public TerminalNode IDENTIFIER() { return getToken(JambdaParser.IDENTIFIER, 0); }
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JambdaListener ) ((JambdaListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JambdaListener ) ((JambdaListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JambdaVisitor ) return ((JambdaVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 114;
		enterRecursionRule(_localctx, 114, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(463);
			switch (_input.LA(1)) {
			case LPAREN:
				{
				setState(457); match(LPAREN);
				setState(458); expression(0);
				setState(459); match(RPAREN);
				}
				break;
			case NUMBER:
				{
				setState(461); match(NUMBER);
				}
				break;
			case IDENTIFIER:
				{
				setState(462); match(IDENTIFIER);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(494);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,47,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(492);
					switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(465);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(466); match(STAR);
						setState(467); expression(13);
						}
						break;

					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(468);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(469); match(T__21);
						setState(470); expression(12);
						}
						break;

					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(471);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(472); match(T__1);
						setState(473); expression(11);
						}
						break;

					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(474);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(475); match(T__0);
						setState(476); expression(10);
						}
						break;

					case 5:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(477);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(478);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__13) | (1L << T__6) | (1L << T__3) | (1L << T__2))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						setState(479); expression(9);
						}
						break;

					case 6:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(480);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(481); match(T__16);
						setState(482); expression(8);
						}
						break;

					case 7:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(483);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(484);
						_la = _input.LA(1);
						if ( !(_la==T__19 || _la==T__5) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						setState(485); expression(7);
						}
						break;

					case 8:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(486);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(487); match(T__17);
						setState(488); expression(6);
						}
						break;

					case 9:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(489);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(490); match(T__18);
						setState(491); expression(5);
						}
						break;
					}
					} 
				}
				setState(496);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,47,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 57: return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0: return precpred(_ctx, 12);

		case 1: return precpred(_ctx, 11);

		case 2: return precpred(_ctx, 10);

		case 3: return precpred(_ctx, 9);

		case 4: return precpred(_ctx, 8);

		case 5: return precpred(_ctx, 7);

		case 6: return precpred(_ctx, 6);

		case 7: return precpred(_ctx, 5);

		case 8: return precpred(_ctx, 4);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3;\u01f4\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\3\2\7\2x\n\2"+
		"\f\2\16\2{\13\2\3\2\5\2~\n\2\3\2\7\2\u0081\n\2\f\2\16\2\u0084\13\2\3\2"+
		"\7\2\u0087\n\2\f\2\16\2\u008a\13\2\3\2\3\2\3\3\3\3\3\3\3\3\7\3\u0092\n"+
		"\3\f\3\16\3\u0095\13\3\3\3\7\3\u0098\n\3\f\3\16\3\u009b\13\3\3\4\3\4\7"+
		"\4\u009f\n\4\f\4\16\4\u00a2\13\4\3\5\3\5\3\5\3\5\7\5\u00a8\n\5\f\5\16"+
		"\5\u00ab\13\5\3\5\3\5\5\5\u00af\n\5\3\6\3\6\3\7\5\7\u00b4\n\7\3\7\3\7"+
		"\3\7\3\7\5\7\u00ba\n\7\3\7\5\7\u00bd\n\7\3\7\3\7\7\7\u00c1\n\7\f\7\16"+
		"\7\u00c4\13\7\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\7\n\u00d2"+
		"\n\n\f\n\16\n\u00d5\13\n\3\13\3\13\3\13\7\13\u00da\n\13\f\13\16\13\u00dd"+
		"\13\13\3\13\3\13\3\f\3\f\7\f\u00e3\n\f\f\f\16\f\u00e6\13\f\3\r\3\r\5\r"+
		"\u00ea\n\r\3\16\7\16\u00ed\n\16\f\16\16\16\u00f0\13\16\3\16\3\16\3\16"+
		"\3\17\3\17\3\20\3\20\5\20\u00f9\n\20\3\21\3\21\3\21\3\22\3\22\5\22\u0100"+
		"\n\22\3\23\3\23\5\23\u0104\n\23\3\24\3\24\3\25\3\25\3\25\5\25\u010b\n"+
		"\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\5\31\u0119"+
		"\n\31\3\32\3\32\3\32\3\32\3\33\7\33\u0120\n\33\f\33\16\33\u0123\13\33"+
		"\3\33\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\36\5\36\u012f\n\36\3\36"+
		"\3\36\3\37\3\37\3 \3 \3 \7 \u0138\n \f \16 \u013b\13 \3!\3!\5!\u013f\n"+
		"!\3!\3!\3\"\3\"\3\"\5\"\u0146\n\"\3\"\3\"\3#\3#\7#\u014c\n#\f#\16#\u014f"+
		"\13#\3$\3$\7$\u0153\n$\f$\16$\u0156\13$\3%\3%\3%\5%\u015b\n%\3&\3&\5&"+
		"\u015f\n&\3\'\3\'\3\'\3\'\3\'\3\'\3(\3(\3)\3)\3)\3)\5)\u016d\n)\3*\3*"+
		"\3*\3+\3+\3+\3+\3+\3+\3+\3,\3,\3-\3-\3.\5.\u017e\n.\3.\3.\3.\5.\u0183"+
		"\n.\3.\3.\7.\u0187\n.\f.\16.\u018a\13.\3/\3/\3/\7/\u018f\n/\f/\16/\u0192"+
		"\13/\3\60\3\60\5\60\u0196\n\60\3\60\3\60\3\61\3\61\3\62\3\62\3\63\3\63"+
		"\3\63\5\63\u01a1\n\63\3\64\3\64\3\64\7\64\u01a6\n\64\f\64\16\64\u01a9"+
		"\13\64\3\65\3\65\3\65\3\65\3\66\5\66\u01b0\n\66\3\66\3\66\5\66\u01b4\n"+
		"\66\3\66\3\66\3\66\3\66\3\66\3\67\3\67\7\67\u01bd\n\67\f\67\16\67\u01c0"+
		"\13\67\38\38\39\39\3:\6:\u01c7\n:\r:\16:\u01c8\3;\3;\3;\3;\3;\3;\3;\5"+
		";\u01d2\n;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3"+
		";\3;\3;\3;\3;\3;\3;\3;\7;\u01ef\n;\f;\16;\u01f2\13;\3;\2\3t<\2\4\6\b\n"+
		"\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\"+
		"^`bdfhjlnprt\2\t\3\2\36!\3\2$%\4\2\36\36 !\3\2\63\67\4\2\27\27\63\63\5"+
		"\2\13\13\22\22\25\26\4\2\5\5\23\23\u01fa\2y\3\2\2\2\4\u008d\3\2\2\2\6"+
		"\u009c\3\2\2\2\b\u00a3\3\2\2\2\n\u00b0\3\2\2\2\f\u00b3\3\2\2\2\16\u00c5"+
		"\3\2\2\2\20\u00c9\3\2\2\2\22\u00ce\3\2\2\2\24\u00d6\3\2\2\2\26\u00e0\3"+
		"\2\2\2\30\u00e9\3\2\2\2\32\u00ee\3\2\2\2\34\u00f4\3\2\2\2\36\u00f6\3\2"+
		"\2\2 \u00fa\3\2\2\2\"\u00ff\3\2\2\2$\u0103\3\2\2\2&\u0105\3\2\2\2(\u010a"+
		"\3\2\2\2*\u010c\3\2\2\2,\u010e\3\2\2\2.\u0110\3\2\2\2\60\u0118\3\2\2\2"+
		"\62\u011a\3\2\2\2\64\u0121\3\2\2\2\66\u0127\3\2\2\28\u0129\3\2\2\2:\u012b"+
		"\3\2\2\2<\u0132\3\2\2\2>\u0134\3\2\2\2@\u013c\3\2\2\2B\u0142\3\2\2\2D"+
		"\u0149\3\2\2\2F\u0150\3\2\2\2H\u015a\3\2\2\2J\u015c\3\2\2\2L\u0160\3\2"+
		"\2\2N\u0166\3\2\2\2P\u016c\3\2\2\2R\u016e\3\2\2\2T\u0171\3\2\2\2V\u0178"+
		"\3\2\2\2X\u017a\3\2\2\2Z\u017d\3\2\2\2\\\u018b\3\2\2\2^\u0193\3\2\2\2"+
		"`\u0199\3\2\2\2b\u019b\3\2\2\2d\u01a0\3\2\2\2f\u01a2\3\2\2\2h\u01aa\3"+
		"\2\2\2j\u01af\3\2\2\2l\u01be\3\2\2\2n\u01c1\3\2\2\2p\u01c3\3\2\2\2r\u01c6"+
		"\3\2\2\2t\u01d1\3\2\2\2vx\78\2\2wv\3\2\2\2x{\3\2\2\2yw\3\2\2\2yz\3\2\2"+
		"\2z}\3\2\2\2{y\3\2\2\2|~\5\4\3\2}|\3\2\2\2}~\3\2\2\2~\u0082\3\2\2\2\177"+
		"\u0081\5\6\4\2\u0080\177\3\2\2\2\u0081\u0084\3\2\2\2\u0082\u0080\3\2\2"+
		"\2\u0082\u0083\3\2\2\2\u0083\u0088\3\2\2\2\u0084\u0082\3\2\2\2\u0085\u0087"+
		"\5\n\6\2\u0086\u0085\3\2\2\2\u0087\u008a\3\2\2\2\u0088\u0086\3\2\2\2\u0088"+
		"\u0089\3\2\2\2\u0089\u008b\3\2\2\2\u008a\u0088\3\2\2\2\u008b\u008c\7\2"+
		"\2\3\u008c\3\3\2\2\2\u008d\u008e\7\31\2\2\u008e\u0093\7\67\2\2\u008f\u0090"+
		"\7\21\2\2\u0090\u0092\7\67\2\2\u0091\u008f\3\2\2\2\u0092\u0095\3\2\2\2"+
		"\u0093\u0091\3\2\2\2\u0093\u0094\3\2\2\2\u0094\u0099\3\2\2\2\u0095\u0093"+
		"\3\2\2\2\u0096\u0098\78\2\2\u0097\u0096\3\2\2\2\u0098\u009b\3\2\2\2\u0099"+
		"\u0097\3\2\2\2\u0099\u009a\3\2\2\2\u009a\5\3\2\2\2\u009b\u0099\3\2\2\2"+
		"\u009c\u00a0\5\b\5\2\u009d\u009f\78\2\2\u009e\u009d\3\2\2\2\u009f\u00a2"+
		"\3\2\2\2\u00a0\u009e\3\2\2\2\u00a0\u00a1\3\2\2\2\u00a1\7\3\2\2\2\u00a2"+
		"\u00a0\3\2\2\2\u00a3\u00a4\7\32\2\2\u00a4\u00a9\7\67\2\2\u00a5\u00a6\7"+
		"\21\2\2\u00a6\u00a8\7\67\2\2\u00a7\u00a5\3\2\2\2\u00a8\u00ab\3\2\2\2\u00a9"+
		"\u00a7\3\2\2\2\u00a9\u00aa\3\2\2\2\u00aa\u00ae\3\2\2\2\u00ab\u00a9\3\2"+
		"\2\2\u00ac\u00ad\7\21\2\2\u00ad\u00af\7\60\2\2\u00ae\u00ac\3\2\2\2\u00ae"+
		"\u00af\3\2\2\2\u00af\t\3\2\2\2\u00b0\u00b1\5\f\7\2\u00b1\13\3\2\2\2\u00b2"+
		"\u00b4\7\36\2\2\u00b3\u00b2\3\2\2\2\u00b3\u00b4\3\2\2\2\u00b4\u00b5\3"+
		"\2\2\2\u00b5\u00b6\7\67\2\2\u00b6\u00b7\7\21\2\2\u00b7\u00b9\7\33\2\2"+
		"\u00b8\u00ba\5\16\b\2\u00b9\u00b8\3\2\2\2\u00b9\u00ba\3\2\2\2\u00ba\u00bc"+
		"\3\2\2\2\u00bb\u00bd\5\20\t\2\u00bc\u00bb\3\2\2\2\u00bc\u00bd\3\2\2\2"+
		"\u00bd\u00be\3\2\2\2\u00be\u00c2\5\24\13\2\u00bf\u00c1\78\2\2\u00c0\u00bf"+
		"\3\2\2\2\u00c1\u00c4\3\2\2\2\u00c2\u00c0\3\2\2\2\u00c2\u00c3\3\2\2\2\u00c3"+
		"\r\3\2\2\2\u00c4\u00c2\3\2\2\2\u00c5\u00c6\7\67\2\2\u00c6\u00c7\7\21\2"+
		"\2\u00c7\u00c8\7\34\2\2\u00c8\17\3\2\2\2\u00c9\u00ca\7,\2\2\u00ca\u00cb"+
		"\5\22\n\2\u00cb\u00cc\7\20\2\2\u00cc\u00cd\7\35\2\2\u00cd\21\3\2\2\2\u00ce"+
		"\u00d3\7\67\2\2\u00cf\u00d0\7\f\2\2\u00d0\u00d2\7\67\2\2\u00d1\u00cf\3"+
		"\2\2\2\u00d2\u00d5\3\2\2\2\u00d3\u00d1\3\2\2\2\u00d3\u00d4\3\2\2\2\u00d4"+
		"\23\3\2\2\2\u00d5\u00d3\3\2\2\2\u00d6\u00d7\7\17\2\2\u00d7\u00db\7.\2"+
		"\2\u00d8\u00da\5\26\f\2\u00d9\u00d8\3\2\2\2\u00da\u00dd\3\2\2\2\u00db"+
		"\u00d9\3\2\2\2\u00db\u00dc\3\2\2\2\u00dc\u00de\3\2\2\2\u00dd\u00db\3\2"+
		"\2\2\u00de\u00df\7/\2\2\u00df\25\3\2\2\2\u00e0\u00e4\5\30\r\2\u00e1\u00e3"+
		"\78\2\2\u00e2\u00e1\3\2\2\2\u00e3\u00e6\3\2\2\2\u00e4\u00e2\3\2\2\2\u00e4"+
		"\u00e5\3\2\2\2\u00e5\27\3\2\2\2\u00e6\u00e4\3\2\2\2\u00e7\u00ea\5\32\16"+
		"\2\u00e8\u00ea\5\64\33\2\u00e9\u00e7\3\2\2\2\u00e9\u00e8\3\2\2\2\u00ea"+
		"\31\3\2\2\2\u00eb\u00ed\5\34\17\2\u00ec\u00eb\3\2\2\2\u00ed\u00f0\3\2"+
		"\2\2\u00ee\u00ec\3\2\2\2\u00ee\u00ef\3\2\2\2\u00ef\u00f1\3\2\2\2\u00f0"+
		"\u00ee\3\2\2\2\u00f1\u00f2\5\"\22\2\u00f2\u00f3\5\36\20\2\u00f3\33\3\2"+
		"\2\2\u00f4\u00f5\t\2\2\2\u00f5\35\3\2\2\2\u00f6\u00f8\7\67\2\2\u00f7\u00f9"+
		"\5 \21\2\u00f8\u00f7\3\2\2\2\u00f8\u00f9\3\2\2\2\u00f9\37\3\2\2\2\u00fa"+
		"\u00fb\7\17\2\2\u00fb\u00fc\5\60\31\2\u00fc!\3\2\2\2\u00fd\u0100\5$\23"+
		"\2\u00fe\u0100\7\"\2\2\u00ff\u00fd\3\2\2\2\u00ff\u00fe\3\2\2\2\u0100#"+
		"\3\2\2\2\u0101\u0104\5(\25\2\u0102\u0104\5&\24\2\u0103\u0101\3\2\2\2\u0103"+
		"\u0102\3\2\2\2\u0104%\3\2\2\2\u0105\u0106\7#\2\2\u0106\'\3\2\2\2\u0107"+
		"\u010b\5*\26\2\u0108\u010b\5,\27\2\u0109\u010b\5.\30\2\u010a\u0107\3\2"+
		"\2\2\u010a\u0108\3\2\2\2\u010a\u0109\3\2\2\2\u010b)\3\2\2\2\u010c\u010d"+
		"\t\3\2\2\u010d+\3\2\2\2\u010e\u010f\7&\2\2\u010f-\3\2\2\2\u0110\u0111"+
		"\7(\2\2\u0111/\3\2\2\2\u0112\u0119\7\67\2\2\u0113\u0119\7\66\2\2\u0114"+
		"\u0119\7\63\2\2\u0115\u0119\7\64\2\2\u0116\u0119\7\65\2\2\u0117\u0119"+
		"\5\62\32\2\u0118\u0112\3\2\2\2\u0118\u0113\3\2\2\2\u0118\u0114\3\2\2\2"+
		"\u0118\u0115\3\2\2\2\u0118\u0116\3\2\2\2\u0118\u0117\3\2\2\2\u0119\61"+
		"\3\2\2\2\u011a\u011b\7\25\2\2\u011b\u011c\5\"\22\2\u011c\u011d\7\26\2"+
		"\2\u011d\63\3\2\2\2\u011e\u0120\5\66\34\2\u011f\u011e\3\2\2\2\u0120\u0123"+
		"\3\2\2\2\u0121\u011f\3\2\2\2\u0121\u0122\3\2\2\2\u0122\u0124\3\2\2\2\u0123"+
		"\u0121\3\2\2\2\u0124\u0125\58\35\2\u0125\u0126\5B\"\2\u0126\65\3\2\2\2"+
		"\u0127\u0128\t\4\2\2\u0128\67\3\2\2\2\u0129\u012a\5:\36\2\u012a9\3\2\2"+
		"\2\u012b\u012c\5`\61\2\u012c\u012e\7\n\2\2\u012d\u012f\5<\37\2\u012e\u012d"+
		"\3\2\2\2\u012e\u012f\3\2\2\2\u012f\u0130\3\2\2\2\u0130\u0131\7-\2\2\u0131"+
		";\3\2\2\2\u0132\u0133\5> \2\u0133=\3\2\2\2\u0134\u0139\5@!\2\u0135\u0136"+
		"\7\f\2\2\u0136\u0138\5@!\2\u0137\u0135\3\2\2\2\u0138\u013b\3\2\2\2\u0139"+
		"\u0137\3\2\2\2\u0139\u013a\3\2\2\2\u013a?\3\2\2\2\u013b\u0139\3\2\2\2"+
		"\u013c\u013e\5\"\22\2\u013d\u013f\7\61\2\2\u013e\u013d\3\2\2\2\u013e\u013f"+
		"\3\2\2\2\u013f\u0140\3\2\2\2\u0140\u0141\7\67\2\2\u0141A\3\2\2\2\u0142"+
		"\u0143\7\17\2\2\u0143\u0145\7.\2\2\u0144\u0146\5D#\2\u0145\u0144\3\2\2"+
		"\2\u0145\u0146\3\2\2\2\u0146\u0147\3\2\2\2\u0147\u0148\7\16\2\2\u0148"+
		"C\3\2\2\2\u0149\u014d\5F$\2\u014a\u014c\5F$\2\u014b\u014a\3\2\2\2\u014c"+
		"\u014f\3\2\2\2\u014d\u014b\3\2\2\2\u014d\u014e\3\2\2\2\u014eE\3\2\2\2"+
		"\u014f\u014d\3\2\2\2\u0150\u0154\5H%\2\u0151\u0153\78\2\2\u0152\u0151"+
		"\3\2\2\2\u0153\u0156\3\2\2\2\u0154\u0152\3\2\2\2\u0154\u0155\3\2\2\2\u0155"+
		"G\3\2\2\2\u0156\u0154\3\2\2\2\u0157\u015b\5P)\2\u0158\u015b\5L\'\2\u0159"+
		"\u015b\5J&\2\u015a\u0157\3\2\2\2\u015a\u0158\3\2\2\2\u015a\u0159\3\2\2"+
		"\2\u015bI\3\2\2\2\u015c\u015e\7*\2\2\u015d\u015f\7\67\2\2\u015e\u015d"+
		"\3\2\2\2\u015e\u015f\3\2\2\2\u015fK\3\2\2\2\u0160\u0161\7+\2\2\u0161\u0162"+
		"\7,\2\2\u0162\u0163\5t;\2\u0163\u0164\7-\2\2\u0164\u0165\5N(\2\u0165M"+
		"\3\2\2\2\u0166\u0167\5P)\2\u0167O\3\2\2\2\u0168\u016d\5X-\2\u0169\u016d"+
		"\5\32\16\2\u016a\u016d\5T+\2\u016b\u016d\5R*\2\u016c\u0168\3\2\2\2\u016c"+
		"\u0169\3\2\2\2\u016c\u016a\3\2\2\2\u016c\u016b\3\2\2\2\u016dQ\3\2\2\2"+
		"\u016e\u016f\7\67\2\2\u016f\u0170\7\24\2\2\u0170S\3\2\2\2\u0171\u0172"+
		"\5b\62\2\u0172\u0173\5V,\2\u0173\u0174\7\17\2\2\u0174\u0175\7\4\2\2\u0175"+
		"\u0176\7,\2\2\u0176\u0177\7-\2\2\u0177U\3\2\2\2\u0178\u0179\7\67\2\2\u0179"+
		"W\3\2\2\2\u017a\u017b\5Z.\2\u017bY\3\2\2\2\u017c\u017e\5\\/\2\u017d\u017c"+
		"\3\2\2\2\u017d\u017e\3\2\2\2\u017e\u017f\3\2\2\2\u017f\u0180\5`\61\2\u0180"+
		"\u0182\7,\2\2\u0181\u0183\5d\63\2\u0182\u0181\3\2\2\2\u0182\u0183\3\2"+
		"\2\2\u0183\u0184\3\2\2\2\u0184\u0188\7-\2\2\u0185\u0187\5^\60\2\u0186"+
		"\u0185\3\2\2\2\u0187\u018a\3\2\2\2\u0188\u0186\3\2\2\2\u0188\u0189\3\2"+
		"\2\2\u0189[\3\2\2\2\u018a\u0188\3\2\2\2\u018b\u018c\5b\62\2\u018c\u0190"+
		"\7\r\2\2\u018d\u018f\5\\/\2\u018e\u018d\3\2\2\2\u018f\u0192\3\2\2\2\u0190"+
		"\u018e\3\2\2\2\u0190\u0191\3\2\2\2\u0191]\3\2\2\2\u0192\u0190\3\2\2\2"+
		"\u0193\u0195\7,\2\2\u0194\u0196\5d\63\2\u0195\u0194\3\2\2\2\u0195\u0196"+
		"\3\2\2\2\u0196\u0197\3\2\2\2\u0197\u0198\7-\2\2\u0198_\3\2\2\2\u0199\u019a"+
		"\7\67\2\2\u019aa\3\2\2\2\u019b\u019c\7\67\2\2\u019cc\3\2\2\2\u019d\u01a1"+
		"\5f\64\2\u019e\u01a1\5h\65\2\u019f\u01a1\5j\66\2\u01a0\u019d\3\2\2\2\u01a0"+
		"\u019e\3\2\2\2\u01a0\u019f\3\2\2\2\u01a1e\3\2\2\2\u01a2\u01a7\5p9\2\u01a3"+
		"\u01a4\7\f\2\2\u01a4\u01a6\5f\64\2\u01a5\u01a3\3\2\2\2\u01a6\u01a9\3\2"+
		"\2\2\u01a7\u01a5\3\2\2\2\u01a7\u01a8\3\2\2\2\u01a8g\3\2\2\2\u01a9\u01a7"+
		"\3\2\2\2\u01aa\u01ab\5b\62\2\u01ab\u01ac\7\t\2\2\u01ac\u01ad\5`\61\2\u01ad"+
		"i\3\2\2\2\u01ae\u01b0\7,\2\2\u01af\u01ae\3\2\2\2\u01af\u01b0\3\2\2\2\u01b0"+
		"\u01b1\3\2\2\2\u01b1\u01b3\5n8\2\u01b2\u01b4\7-\2\2\u01b3\u01b2\3\2\2"+
		"\2\u01b3\u01b4\3\2\2\2\u01b4\u01b5\3\2\2\2\u01b5\u01b6\7\17\2\2\u01b6"+
		"\u01b7\7.\2\2\u01b7\u01b8\5l\67\2\u01b8\u01b9\7/\2\2\u01b9k\3\2\2\2\u01ba"+
		"\u01bd\5n8\2\u01bb\u01bd\5r:\2\u01bc\u01ba\3\2\2\2\u01bc\u01bb\3\2\2\2"+
		"\u01bd\u01c0\3\2\2\2\u01be\u01bc\3\2\2\2\u01be\u01bf\3\2\2\2\u01bfm\3"+
		"\2\2\2\u01c0\u01be\3\2\2\2\u01c1\u01c2\7\67\2\2\u01c2o\3\2\2\2\u01c3\u01c4"+
		"\t\5\2\2\u01c4q\3\2\2\2\u01c5\u01c7\t\6\2\2\u01c6\u01c5\3\2\2\2\u01c7"+
		"\u01c8\3\2\2\2\u01c8\u01c6\3\2\2\2\u01c8\u01c9\3\2\2\2\u01c9s\3\2\2\2"+
		"\u01ca\u01cb\b;\1\2\u01cb\u01cc\7,\2\2\u01cc\u01cd\5t;\2\u01cd\u01ce\7"+
		"-\2\2\u01ce\u01d2\3\2\2\2\u01cf\u01d2\7\66\2\2\u01d0\u01d2\7\67\2\2\u01d1"+
		"\u01ca\3\2\2\2\u01d1\u01cf\3\2\2\2\u01d1\u01d0\3\2\2\2\u01d2\u01f0\3\2"+
		"\2\2\u01d3\u01d4\f\16\2\2\u01d4\u01d5\7\60\2\2\u01d5\u01ef\5t;\17\u01d6"+
		"\u01d7\f\r\2\2\u01d7\u01d8\7\3\2\2\u01d8\u01ef\5t;\16\u01d9\u01da\f\f"+
		"\2\2\u01da\u01db\7\27\2\2\u01db\u01ef\5t;\r\u01dc\u01dd\f\13\2\2\u01dd"+
		"\u01de\7\30\2\2\u01de\u01ef\5t;\f\u01df\u01e0\f\n\2\2\u01e0\u01e1\t\7"+
		"\2\2\u01e1\u01ef\5t;\13\u01e2\u01e3\f\t\2\2\u01e3\u01e4\7\b\2\2\u01e4"+
		"\u01ef\5t;\n\u01e5\u01e6\f\b\2\2\u01e6\u01e7\t\b\2\2\u01e7\u01ef\5t;\t"+
		"\u01e8\u01e9\f\7\2\2\u01e9\u01ea\7\7\2\2\u01ea\u01ef\5t;\b\u01eb\u01ec"+
		"\f\6\2\2\u01ec\u01ed\7\6\2\2\u01ed\u01ef\5t;\7\u01ee\u01d3\3\2\2\2\u01ee"+
		"\u01d6\3\2\2\2\u01ee\u01d9\3\2\2\2\u01ee\u01dc\3\2\2\2\u01ee\u01df\3\2"+
		"\2\2\u01ee\u01e2\3\2\2\2\u01ee\u01e5\3\2\2\2\u01ee\u01e8\3\2\2\2\u01ee"+
		"\u01eb\3\2\2\2\u01ef\u01f2\3\2\2\2\u01f0\u01ee\3\2\2\2\u01f0\u01f1\3\2"+
		"\2\2\u01f1u\3\2\2\2\u01f2\u01f0\3\2\2\2\62y}\u0082\u0088\u0093\u0099\u00a0"+
		"\u00a9\u00ae\u00b3\u00b9\u00bc\u00c2\u00d3\u00db\u00e4\u00e9\u00ee\u00f8"+
		"\u00ff\u0103\u010a\u0118\u0121\u012e\u0139\u013e\u0145\u014d\u0154\u015a"+
		"\u015e\u016c\u017d\u0182\u0188\u0190\u0195\u01a0\u01a7\u01af\u01b3\u01bc"+
		"\u01be\u01c8\u01d1\u01ee\u01f0";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}