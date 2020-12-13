// Generated from /home/bryan/Documents/lenguajes/php/grammar/PhpParser.g4 by ANTLR 4.8
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class PhpParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		SeaWhitespace=1, HtmlText=2, XmlStart=3, PHPStart=4, HtmlScriptOpen=5, 
		HtmlStyleOpen=6, HtmlComment=7, HtmlDtd=8, HtmlOpen=9, Shebang=10, Error=11, 
		XmlText=12, XmlClose=13, PHPStartInside=14, HtmlClose=15, HtmlSlashClose=16, 
		HtmlSlash=17, HtmlEquals=18, HtmlStartQuoteString=19, HtmlStartDoubleQuoteString=20, 
		HtmlHex=21, HtmlDecimal=22, HtmlSpace=23, HtmlName=24, ErrorInside=25, 
		PHPStartInsideQuoteString=26, HtmlEndQuoteString=27, HtmlQuoteString=28, 
		ErrorHtmlQuote=29, PHPStartDoubleQuoteString=30, HtmlEndDoubleQuoteString=31, 
		HtmlDoubleQuoteString=32, ErrorHtmlDoubleQuote=33, ScriptText=34, ScriptClose=35, 
		PHPStartInsideScript=36, StyleBody=37, Decorator=38, PHPEnd=39, Whitespace=40, 
		MultiLineComment=41, SingleLineComment=42, ShellStyleComment=43, Abstract=44, 
		Array=45, As=46, BinaryCast=47, BoolType=48, BooleanConstant=49, Break=50, 
		Callable=51, Case=52, Catch=53, Class=54, Clone=55, Const=56, Continue=57, 
		Declare=58, Default=59, Do=60, DoubleCast=61, DoubleType=62, Echo=63, 
		Else=64, ElseIf=65, Empty=66, EndDeclare=67, EndFor=68, EndForeach=69, 
		EndIf=70, EndSwitch=71, EndWhile=72, Eval=73, Exit=74, Extends=75, Final=76, 
		Finally=77, FloatCast=78, For=79, Foreach=80, Function=81, Global=82, 
		Goto=83, If=84, Implements=85, Import=86, Include=87, IncludeOnce=88, 
		InstanceOf=89, InsteadOf=90, Int8Cast=91, Int16Cast=92, Int64Type=93, 
		IntType=94, Interface=95, IsSet=96, List=97, LogicalAnd=98, LogicalOr=99, 
		LogicalXor=100, Namespace=101, New=102, Null=103, ObjectType=104, Parent_=105, 
		Partial=106, Print=107, Private=108, Protected=109, Public=110, Require=111, 
		RequireOnce=112, Resource=113, Return=114, Static=115, StringType=116, 
		Switch=117, Throw=118, Trait=119, Try=120, Typeof=121, UintCast=122, UnicodeCast=123, 
		Unset=124, Use=125, Var=126, While=127, Yield=128, From=129, LambdaFn=130, 
		Get=131, Set=132, Call=133, CallStatic=134, Constructor=135, Destruct=136, 
		Wakeup=137, Sleep=138, Autoload=139, IsSet__=140, Unset__=141, ToString__=142, 
		Invoke=143, SetState=144, Clone__=145, DebugInfo=146, Namespace__=147, 
		Class__=148, Traic__=149, Function__=150, Method__=151, Line__=152, File__=153, 
		Dir__=154, Spaceship=155, Lgeneric=156, Rgeneric=157, DoubleArrow=158, 
		Inc=159, Dec=160, IsIdentical=161, IsNoidentical=162, IsEqual=163, IsNotEq=164, 
		IsSmallerOrEqual=165, IsGreaterOrEqual=166, PlusEqual=167, MinusEqual=168, 
		MulEqual=169, Pow=170, PowEqual=171, DivEqual=172, Concaequal=173, ModEqual=174, 
		ShiftLeftEqual=175, ShiftRightEqual=176, AndEqual=177, OrEqual=178, XorEqual=179, 
		BooleanOr=180, BooleanAnd=181, NullCoalescing=182, NullCoalescingEqual=183, 
		ShiftLeft=184, ShiftRight=185, DoubleColon=186, ObjectOperator=187, NamespaceSeparator=188, 
		Ellipsis=189, Less=190, Greater=191, Ampersand=192, Pipe=193, Bang=194, 
		Caret=195, Plus=196, Minus=197, Asterisk=198, Percent=199, Divide=200, 
		Tilde=201, SuppressWarnings=202, Dollar=203, Dot=204, QuestionMark=205, 
		OpenRoundBracket=206, CloseRoundBracket=207, OpenSquareBracket=208, CloseSquareBracket=209, 
		OpenCurlyBracket=210, CloseCurlyBracket=211, Comma=212, Colon=213, SemiColon=214, 
		Eq=215, Quote=216, BackQuote=217, VarName=218, Label=219, Octal=220, Decimal=221, 
		Real=222, Hex=223, Binary=224, BackQuoteString=225, SingleQuoteString=226, 
		DoubleQuote=227, StartNowDoc=228, StartHereDoc=229, ErrorPhp=230, CurlyDollar=231, 
		UnicodeEscape=232, StringPart=233, Comment=234, PHPEndSingleLineComment=235, 
		CommentEnd=236, HereDocText=237, XmlText2=238;
	public static final int
		RULE_htmlDocument = 0, RULE_htmlElementOrPhpBlock = 1, RULE_htmlElements = 2, 
		RULE_htmlElement = 3, RULE_scriptTextPart = 4, RULE_phpBlock = 5, RULE_importStatement = 6, 
		RULE_topStatement = 7, RULE_useDeclaration = 8, RULE_useDeclarationContentList = 9, 
		RULE_useDeclarationContent = 10, RULE_namespaceDeclaration = 11, RULE_namespaceStatement = 12, 
		RULE_functionDeclaration = 13, RULE_classDeclaration = 14, RULE_classEntryType = 15, 
		RULE_interfaceList = 16, RULE_typeParameterListInBrackets = 17, RULE_typeParameterList = 18, 
		RULE_typeParameterWithDefaultsList = 19, RULE_typeParameterDecl = 20, 
		RULE_typeParameterWithDefaultDecl = 21, RULE_genericDynamicArgs = 22, 
		RULE_attributes = 23, RULE_attributesGroup = 24, RULE_attribute = 25, 
		RULE_attributeArgList = 26, RULE_attributeNamedArgList = 27, RULE_attributeNamedArg = 28, 
		RULE_innerStatementList = 29, RULE_innerStatement = 30, RULE_statement = 31, 
		RULE_emptyStatement = 32, RULE_blockStatement = 33, RULE_ifStatement = 34, 
		RULE_elseIfStatement = 35, RULE_elseIfColonStatement = 36, RULE_elseStatement = 37, 
		RULE_elseColonStatement = 38, RULE_whileStatement = 39, RULE_doWhileStatement = 40, 
		RULE_forStatement = 41, RULE_forInit = 42, RULE_forUpdate = 43, RULE_switchStatement = 44, 
		RULE_switchBlock = 45, RULE_breakStatement = 46, RULE_continueStatement = 47, 
		RULE_returnStatement = 48, RULE_expressionStatement = 49, RULE_unsetStatement = 50, 
		RULE_foreachStatement = 51, RULE_tryCatchFinally = 52, RULE_catchClause = 53, 
		RULE_finallyStatement = 54, RULE_throwStatement = 55, RULE_gotoStatement = 56, 
		RULE_declareStatement = 57, RULE_inlineHtmlStatement = 58, RULE_inlineHtml = 59, 
		RULE_declareList = 60, RULE_formalParameterList = 61, RULE_formalParameter = 62, 
		RULE_typeHint = 63, RULE_globalStatement = 64, RULE_globalVar = 65, RULE_echoStatement = 66, 
		RULE_staticVariableStatement = 67, RULE_classStatement = 68, RULE_traitAdaptations = 69, 
		RULE_traitAdaptationStatement = 70, RULE_traitPrecedence = 71, RULE_traitAlias = 72, 
		RULE_traitMethodReference = 73, RULE_baseCtorCall = 74, RULE_methodBody = 75, 
		RULE_propertyModifiers = 76, RULE_memberModifiers = 77, RULE_variableInitializer = 78, 
		RULE_identifierInititalizer = 79, RULE_globalConstantDeclaration = 80, 
		RULE_expressionList = 81, RULE_parentheses = 82, RULE_expression = 83, 
		RULE_assignable = 84, RULE_arrayCreation = 85, RULE_lambdaFunctionExpr = 86, 
		RULE_newExpr = 87, RULE_assignmentOperator = 88, RULE_yieldExpression = 89, 
		RULE_arrayItemList = 90, RULE_arrayItem = 91, RULE_lambdaFunctionUseVars = 92, 
		RULE_lambdaFunctionUseVar = 93, RULE_qualifiedStaticTypeRef = 94, RULE_typeRef = 95, 
		RULE_anoymousClass = 96, RULE_indirectTypeRef = 97, RULE_qualifiedNamespaceName = 98, 
		RULE_namespaceNameList = 99, RULE_namespaceNameTail = 100, RULE_qualifiedNamespaceNameList = 101, 
		RULE_arguments = 102, RULE_actualArgument = 103, RULE_constantInititalizer = 104, 
		RULE_constantArrayItemList = 105, RULE_constantArrayItem = 106, RULE_constant = 107, 
		RULE_literalConstant = 108, RULE_numericConstant = 109, RULE_classConstant = 110, 
		RULE_stringConstant = 111, RULE_string = 112, RULE_interpolatedStringPart = 113, 
		RULE_chainList = 114, RULE_chain = 115, RULE_chainOrigin = 116, RULE_memberAccess = 117, 
		RULE_functionCall = 118, RULE_functionCallName = 119, RULE_actualArguments = 120, 
		RULE_chainBase = 121, RULE_keyedFieldName = 122, RULE_keyedSimpleFieldName = 123, 
		RULE_keyedVariable = 124, RULE_squareCurlyExpression = 125, RULE_assignmentList = 126, 
		RULE_assignmentListElement = 127, RULE_modifier = 128, RULE_identifier = 129, 
		RULE_memberModifier = 130, RULE_magicConstant = 131, RULE_magicMethod = 132, 
		RULE_primitiveType = 133, RULE_castOperation = 134, RULE_toDoc = 135;
	private static String[] makeRuleNames() {
		return new String[] {
			"htmlDocument", "htmlElementOrPhpBlock", "htmlElements", "htmlElement", 
			"scriptTextPart", "phpBlock", "importStatement", "topStatement", "useDeclaration", 
			"useDeclarationContentList", "useDeclarationContent", "namespaceDeclaration", 
			"namespaceStatement", "functionDeclaration", "classDeclaration", "classEntryType", 
			"interfaceList", "typeParameterListInBrackets", "typeParameterList", 
			"typeParameterWithDefaultsList", "typeParameterDecl", "typeParameterWithDefaultDecl", 
			"genericDynamicArgs", "attributes", "attributesGroup", "attribute", "attributeArgList", 
			"attributeNamedArgList", "attributeNamedArg", "innerStatementList", "innerStatement", 
			"statement", "emptyStatement", "blockStatement", "ifStatement", "elseIfStatement", 
			"elseIfColonStatement", "elseStatement", "elseColonStatement", "whileStatement", 
			"doWhileStatement", "forStatement", "forInit", "forUpdate", "switchStatement", 
			"switchBlock", "breakStatement", "continueStatement", "returnStatement", 
			"expressionStatement", "unsetStatement", "foreachStatement", "tryCatchFinally", 
			"catchClause", "finallyStatement", "throwStatement", "gotoStatement", 
			"declareStatement", "inlineHtmlStatement", "inlineHtml", "declareList", 
			"formalParameterList", "formalParameter", "typeHint", "globalStatement", 
			"globalVar", "echoStatement", "staticVariableStatement", "classStatement", 
			"traitAdaptations", "traitAdaptationStatement", "traitPrecedence", "traitAlias", 
			"traitMethodReference", "baseCtorCall", "methodBody", "propertyModifiers", 
			"memberModifiers", "variableInitializer", "identifierInititalizer", "globalConstantDeclaration", 
			"expressionList", "parentheses", "expression", "assignable", "arrayCreation", 
			"lambdaFunctionExpr", "newExpr", "assignmentOperator", "yieldExpression", 
			"arrayItemList", "arrayItem", "lambdaFunctionUseVars", "lambdaFunctionUseVar", 
			"qualifiedStaticTypeRef", "typeRef", "anoymousClass", "indirectTypeRef", 
			"qualifiedNamespaceName", "namespaceNameList", "namespaceNameTail", "qualifiedNamespaceNameList", 
			"arguments", "actualArgument", "constantInititalizer", "constantArrayItemList", 
			"constantArrayItem", "constant", "literalConstant", "numericConstant", 
			"classConstant", "stringConstant", "string", "interpolatedStringPart", 
			"chainList", "chain", "chainOrigin", "memberAccess", "functionCall", 
			"functionCallName", "actualArguments", "chainBase", "keyedFieldName", 
			"keyedSimpleFieldName", "keyedVariable", "squareCurlyExpression", "assignmentList", 
			"assignmentListElement", "modifier", "identifier", "memberModifier", 
			"magicConstant", "magicMethod", "primitiveType", "castOperation", "toDoc"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, "'/>'", null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, "'abstract'", "'array'", 
			"'as'", "'binary'", null, null, "'break'", "'callable'", "'case'", "'catch'", 
			"'class'", "'clone'", "'const'", "'continue'", "'declare'", "'default'", 
			"'do'", "'real'", "'double'", "'echo'", "'else'", "'elseif'", "'empty'", 
			"'enddeclare'", "'endfor'", "'endforeach'", "'endif'", "'endswitch'", 
			"'endwhile'", "'eval'", "'die'", "'extends'", "'final'", "'finally'", 
			"'float'", "'for'", "'foreach'", "'function'", "'global'", "'goto'", 
			"'if'", "'implements'", "'import'", "'include'", "'include_once'", "'instanceof'", 
			"'insteadof'", "'int8'", "'int16'", "'int64'", null, "'interface'", "'isset'", 
			"'list'", "'and'", "'or'", "'xor'", "'namespace'", "'new'", "'null'", 
			"'object'", "'parent'", "'partial'", "'print'", "'private'", "'protected'", 
			"'public'", "'require'", "'require_once'", "'resource'", "'return'", 
			"'static'", "'string'", "'switch'", "'throw'", "'trait'", "'try'", "'clrtypeof'", 
			null, "'unicode'", "'unset'", "'use'", "'var'", "'while'", "'yield'", 
			"'from'", "'fn'", "'__get'", "'__set'", "'__call'", "'__callstatic'", 
			"'__construct'", "'__destruct'", "'__wakeup'", "'__sleep'", "'__autoload'", 
			"'__isset'", "'__unset'", "'__tostring'", "'__invoke'", "'__set_state'", 
			"'__clone'", "'__debuginfo'", "'__namespace__'", "'__class__'", "'__trait__'", 
			"'__function__'", "'__method__'", "'__line__'", "'__file__'", "'__dir__'", 
			"'<=>'", "'<:'", "':>'", "'=>'", "'++'", "'--'", "'==='", "'!=='", "'=='", 
			null, "'<='", "'>='", "'+='", "'-='", "'*='", "'**'", "'**='", "'/='", 
			"'.='", "'%='", "'<<='", "'>>='", "'&='", "'|='", "'^='", "'||'", "'&&'", 
			"'??'", "'??='", "'<<'", "'>>'", "'::'", "'->'", "'\\'", "'...'", null, 
			null, "'&'", "'|'", "'!'", "'^'", "'+'", "'-'", "'*'", "'%'", null, "'~'", 
			"'@'", null, "'.'", null, "'('", "')'", "'['", "']'", null, "'}'", "','", 
			"':'", "';'", null, "'''", "'`'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "SeaWhitespace", "HtmlText", "XmlStart", "PHPStart", "HtmlScriptOpen", 
			"HtmlStyleOpen", "HtmlComment", "HtmlDtd", "HtmlOpen", "Shebang", "Error", 
			"XmlText", "XmlClose", "PHPStartInside", "HtmlClose", "HtmlSlashClose", 
			"HtmlSlash", "HtmlEquals", "HtmlStartQuoteString", "HtmlStartDoubleQuoteString", 
			"HtmlHex", "HtmlDecimal", "HtmlSpace", "HtmlName", "ErrorInside", "PHPStartInsideQuoteString", 
			"HtmlEndQuoteString", "HtmlQuoteString", "ErrorHtmlQuote", "PHPStartDoubleQuoteString", 
			"HtmlEndDoubleQuoteString", "HtmlDoubleQuoteString", "ErrorHtmlDoubleQuote", 
			"ScriptText", "ScriptClose", "PHPStartInsideScript", "StyleBody", "Decorator", 
			"PHPEnd", "Whitespace", "MultiLineComment", "SingleLineComment", "ShellStyleComment", 
			"Abstract", "Array", "As", "BinaryCast", "BoolType", "BooleanConstant", 
			"Break", "Callable", "Case", "Catch", "Class", "Clone", "Const", "Continue", 
			"Declare", "Default", "Do", "DoubleCast", "DoubleType", "Echo", "Else", 
			"ElseIf", "Empty", "EndDeclare", "EndFor", "EndForeach", "EndIf", "EndSwitch", 
			"EndWhile", "Eval", "Exit", "Extends", "Final", "Finally", "FloatCast", 
			"For", "Foreach", "Function", "Global", "Goto", "If", "Implements", "Import", 
			"Include", "IncludeOnce", "InstanceOf", "InsteadOf", "Int8Cast", "Int16Cast", 
			"Int64Type", "IntType", "Interface", "IsSet", "List", "LogicalAnd", "LogicalOr", 
			"LogicalXor", "Namespace", "New", "Null", "ObjectType", "Parent_", "Partial", 
			"Print", "Private", "Protected", "Public", "Require", "RequireOnce", 
			"Resource", "Return", "Static", "StringType", "Switch", "Throw", "Trait", 
			"Try", "Typeof", "UintCast", "UnicodeCast", "Unset", "Use", "Var", "While", 
			"Yield", "From", "LambdaFn", "Get", "Set", "Call", "CallStatic", "Constructor", 
			"Destruct", "Wakeup", "Sleep", "Autoload", "IsSet__", "Unset__", "ToString__", 
			"Invoke", "SetState", "Clone__", "DebugInfo", "Namespace__", "Class__", 
			"Traic__", "Function__", "Method__", "Line__", "File__", "Dir__", "Spaceship", 
			"Lgeneric", "Rgeneric", "DoubleArrow", "Inc", "Dec", "IsIdentical", "IsNoidentical", 
			"IsEqual", "IsNotEq", "IsSmallerOrEqual", "IsGreaterOrEqual", "PlusEqual", 
			"MinusEqual", "MulEqual", "Pow", "PowEqual", "DivEqual", "Concaequal", 
			"ModEqual", "ShiftLeftEqual", "ShiftRightEqual", "AndEqual", "OrEqual", 
			"XorEqual", "BooleanOr", "BooleanAnd", "NullCoalescing", "NullCoalescingEqual", 
			"ShiftLeft", "ShiftRight", "DoubleColon", "ObjectOperator", "NamespaceSeparator", 
			"Ellipsis", "Less", "Greater", "Ampersand", "Pipe", "Bang", "Caret", 
			"Plus", "Minus", "Asterisk", "Percent", "Divide", "Tilde", "SuppressWarnings", 
			"Dollar", "Dot", "QuestionMark", "OpenRoundBracket", "CloseRoundBracket", 
			"OpenSquareBracket", "CloseSquareBracket", "OpenCurlyBracket", "CloseCurlyBracket", 
			"Comma", "Colon", "SemiColon", "Eq", "Quote", "BackQuote", "VarName", 
			"Label", "Octal", "Decimal", "Real", "Hex", "Binary", "BackQuoteString", 
			"SingleQuoteString", "DoubleQuote", "StartNowDoc", "StartHereDoc", "ErrorPhp", 
			"CurlyDollar", "UnicodeEscape", "StringPart", "Comment", "PHPEndSingleLineComment", 
			"CommentEnd", "HereDocText", "XmlText2"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "PhpParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public PhpParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class HtmlDocumentContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(PhpParser.EOF, 0); }
		public TerminalNode Shebang() { return getToken(PhpParser.Shebang, 0); }
		public List<HtmlElementOrPhpBlockContext> htmlElementOrPhpBlock() {
			return getRuleContexts(HtmlElementOrPhpBlockContext.class);
		}
		public HtmlElementOrPhpBlockContext htmlElementOrPhpBlock(int i) {
			return getRuleContext(HtmlElementOrPhpBlockContext.class,i);
		}
		public HtmlDocumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlDocument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).enterHtmlDocument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).exitHtmlDocument(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PhpParserVisitor ) return ((PhpParserVisitor<? extends T>)visitor).visitHtmlDocument(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HtmlDocumentContext htmlDocument() throws RecognitionException {
		HtmlDocumentContext _localctx = new HtmlDocumentContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_htmlDocument);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(273);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Shebang) {
				{
				setState(272);
				match(Shebang);
				}
			}

			setState(278);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << HtmlText) | (1L << XmlStart) | (1L << HtmlScriptOpen) | (1L << HtmlStyleOpen) | (1L << HtmlDtd) | (1L << HtmlOpen) | (1L << HtmlClose) | (1L << HtmlSlashClose) | (1L << HtmlSlash) | (1L << HtmlEquals) | (1L << HtmlStartQuoteString) | (1L << HtmlStartDoubleQuoteString) | (1L << HtmlHex) | (1L << HtmlDecimal) | (1L << HtmlName) | (1L << HtmlEndQuoteString) | (1L << HtmlQuoteString) | (1L << HtmlEndDoubleQuoteString) | (1L << HtmlDoubleQuoteString) | (1L << ScriptText) | (1L << ScriptClose) | (1L << StyleBody) | (1L << Decorator) | (1L << Abstract) | (1L << Array) | (1L << As) | (1L << BinaryCast) | (1L << BoolType) | (1L << BooleanConstant) | (1L << Break) | (1L << Callable) | (1L << Case) | (1L << Catch) | (1L << Class) | (1L << Clone) | (1L << Const) | (1L << Continue) | (1L << Declare) | (1L << Default) | (1L << Do) | (1L << DoubleCast) | (1L << DoubleType) | (1L << Echo))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (Else - 64)) | (1L << (ElseIf - 64)) | (1L << (Empty - 64)) | (1L << (EndDeclare - 64)) | (1L << (EndFor - 64)) | (1L << (EndForeach - 64)) | (1L << (EndIf - 64)) | (1L << (EndSwitch - 64)) | (1L << (EndWhile - 64)) | (1L << (Eval - 64)) | (1L << (Exit - 64)) | (1L << (Extends - 64)) | (1L << (Final - 64)) | (1L << (Finally - 64)) | (1L << (FloatCast - 64)) | (1L << (For - 64)) | (1L << (Foreach - 64)) | (1L << (Function - 64)) | (1L << (Global - 64)) | (1L << (Goto - 64)) | (1L << (If - 64)) | (1L << (Implements - 64)) | (1L << (Import - 64)) | (1L << (Include - 64)) | (1L << (IncludeOnce - 64)) | (1L << (InstanceOf - 64)) | (1L << (InsteadOf - 64)) | (1L << (Int8Cast - 64)) | (1L << (Int16Cast - 64)) | (1L << (Int64Type - 64)) | (1L << (IntType - 64)) | (1L << (Interface - 64)) | (1L << (IsSet - 64)) | (1L << (List - 64)) | (1L << (LogicalAnd - 64)) | (1L << (LogicalOr - 64)) | (1L << (LogicalXor - 64)) | (1L << (Namespace - 64)) | (1L << (New - 64)) | (1L << (Null - 64)) | (1L << (ObjectType - 64)) | (1L << (Parent_ - 64)) | (1L << (Partial - 64)) | (1L << (Print - 64)) | (1L << (Private - 64)) | (1L << (Protected - 64)) | (1L << (Public - 64)) | (1L << (Require - 64)) | (1L << (RequireOnce - 64)) | (1L << (Resource - 64)) | (1L << (Return - 64)) | (1L << (Static - 64)) | (1L << (StringType - 64)) | (1L << (Switch - 64)) | (1L << (Throw - 64)) | (1L << (Trait - 64)) | (1L << (Try - 64)) | (1L << (Typeof - 64)) | (1L << (UintCast - 64)) | (1L << (UnicodeCast - 64)) | (1L << (Unset - 64)) | (1L << (Use - 64)) | (1L << (Var - 64)) | (1L << (While - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (Yield - 128)) | (1L << (From - 128)) | (1L << (LambdaFn - 128)) | (1L << (Get - 128)) | (1L << (Set - 128)) | (1L << (Call - 128)) | (1L << (CallStatic - 128)) | (1L << (Constructor - 128)) | (1L << (Destruct - 128)) | (1L << (Wakeup - 128)) | (1L << (Sleep - 128)) | (1L << (Autoload - 128)) | (1L << (IsSet__ - 128)) | (1L << (Unset__ - 128)) | (1L << (ToString__ - 128)) | (1L << (Invoke - 128)) | (1L << (SetState - 128)) | (1L << (Clone__ - 128)) | (1L << (DebugInfo - 128)) | (1L << (Namespace__ - 128)) | (1L << (Class__ - 128)) | (1L << (Traic__ - 128)) | (1L << (Function__ - 128)) | (1L << (Method__ - 128)) | (1L << (Line__ - 128)) | (1L << (File__ - 128)) | (1L << (Dir__ - 128)) | (1L << (Inc - 128)) | (1L << (Dec - 128)) | (1L << (NamespaceSeparator - 128)))) != 0) || ((((_la - 194)) & ~0x3f) == 0 && ((1L << (_la - 194)) & ((1L << (Bang - 194)) | (1L << (Plus - 194)) | (1L << (Minus - 194)) | (1L << (Tilde - 194)) | (1L << (SuppressWarnings - 194)) | (1L << (Dollar - 194)) | (1L << (OpenRoundBracket - 194)) | (1L << (OpenSquareBracket - 194)) | (1L << (OpenCurlyBracket - 194)) | (1L << (SemiColon - 194)) | (1L << (VarName - 194)) | (1L << (Label - 194)) | (1L << (Octal - 194)) | (1L << (Decimal - 194)) | (1L << (Real - 194)) | (1L << (Hex - 194)) | (1L << (Binary - 194)) | (1L << (BackQuoteString - 194)) | (1L << (SingleQuoteString - 194)) | (1L << (DoubleQuote - 194)) | (1L << (StartNowDoc - 194)) | (1L << (StartHereDoc - 194)))) != 0)) {
				{
				{
				setState(275);
				htmlElementOrPhpBlock();
				}
				}
				setState(280);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(281);
			match(EOF);
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

	public static class HtmlElementOrPhpBlockContext extends ParserRuleContext {
		public HtmlElementsContext htmlElements() {
			return getRuleContext(HtmlElementsContext.class,0);
		}
		public PhpBlockContext phpBlock() {
			return getRuleContext(PhpBlockContext.class,0);
		}
		public ScriptTextPartContext scriptTextPart() {
			return getRuleContext(ScriptTextPartContext.class,0);
		}
		public HtmlElementOrPhpBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlElementOrPhpBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).enterHtmlElementOrPhpBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).exitHtmlElementOrPhpBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PhpParserVisitor ) return ((PhpParserVisitor<? extends T>)visitor).visitHtmlElementOrPhpBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HtmlElementOrPhpBlockContext htmlElementOrPhpBlock() throws RecognitionException {
		HtmlElementOrPhpBlockContext _localctx = new HtmlElementOrPhpBlockContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_htmlElementOrPhpBlock);
		try {
			setState(286);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(283);
				htmlElements();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(284);
				phpBlock();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(285);
				scriptTextPart();
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

	public static class HtmlElementsContext extends ParserRuleContext {
		public List<HtmlElementContext> htmlElement() {
			return getRuleContexts(HtmlElementContext.class);
		}
		public HtmlElementContext htmlElement(int i) {
			return getRuleContext(HtmlElementContext.class,i);
		}
		public HtmlElementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlElements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).enterHtmlElements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).exitHtmlElements(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PhpParserVisitor ) return ((PhpParserVisitor<? extends T>)visitor).visitHtmlElements(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HtmlElementsContext htmlElements() throws RecognitionException {
		HtmlElementsContext _localctx = new HtmlElementsContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_htmlElements);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(289); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(288);
					htmlElement();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(291); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
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

	public static class HtmlElementContext extends ParserRuleContext {
		public TerminalNode HtmlDtd() { return getToken(PhpParser.HtmlDtd, 0); }
		public TerminalNode HtmlScriptOpen() { return getToken(PhpParser.HtmlScriptOpen, 0); }
		public TerminalNode HtmlClose() { return getToken(PhpParser.HtmlClose, 0); }
		public TerminalNode HtmlStyleOpen() { return getToken(PhpParser.HtmlStyleOpen, 0); }
		public TerminalNode HtmlOpen() { return getToken(PhpParser.HtmlOpen, 0); }
		public TerminalNode HtmlName() { return getToken(PhpParser.HtmlName, 0); }
		public TerminalNode HtmlSlashClose() { return getToken(PhpParser.HtmlSlashClose, 0); }
		public TerminalNode HtmlSlash() { return getToken(PhpParser.HtmlSlash, 0); }
		public TerminalNode HtmlText() { return getToken(PhpParser.HtmlText, 0); }
		public TerminalNode HtmlEquals() { return getToken(PhpParser.HtmlEquals, 0); }
		public TerminalNode HtmlStartQuoteString() { return getToken(PhpParser.HtmlStartQuoteString, 0); }
		public TerminalNode HtmlEndQuoteString() { return getToken(PhpParser.HtmlEndQuoteString, 0); }
		public TerminalNode HtmlStartDoubleQuoteString() { return getToken(PhpParser.HtmlStartDoubleQuoteString, 0); }
		public TerminalNode HtmlEndDoubleQuoteString() { return getToken(PhpParser.HtmlEndDoubleQuoteString, 0); }
		public TerminalNode HtmlHex() { return getToken(PhpParser.HtmlHex, 0); }
		public TerminalNode HtmlDecimal() { return getToken(PhpParser.HtmlDecimal, 0); }
		public TerminalNode HtmlQuoteString() { return getToken(PhpParser.HtmlQuoteString, 0); }
		public TerminalNode HtmlDoubleQuoteString() { return getToken(PhpParser.HtmlDoubleQuoteString, 0); }
		public TerminalNode StyleBody() { return getToken(PhpParser.StyleBody, 0); }
		public TerminalNode ScriptClose() { return getToken(PhpParser.ScriptClose, 0); }
		public TerminalNode XmlStart() { return getToken(PhpParser.XmlStart, 0); }
		public TerminalNode XmlClose() { return getToken(PhpParser.XmlClose, 0); }
		public List<TerminalNode> XmlText() { return getTokens(PhpParser.XmlText); }
		public TerminalNode XmlText(int i) {
			return getToken(PhpParser.XmlText, i);
		}
		public HtmlElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).enterHtmlElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).exitHtmlElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PhpParserVisitor ) return ((PhpParserVisitor<? extends T>)visitor).visitHtmlElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HtmlElementContext htmlElement() throws RecognitionException {
		HtmlElementContext _localctx = new HtmlElementContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_htmlElement);
		int _la;
		try {
			setState(321);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case HtmlDtd:
				enterOuterAlt(_localctx, 1);
				{
				setState(293);
				match(HtmlDtd);
				}
				break;
			case HtmlScriptOpen:
				enterOuterAlt(_localctx, 2);
				{
				setState(294);
				match(HtmlScriptOpen);
				}
				break;
			case HtmlClose:
				enterOuterAlt(_localctx, 3);
				{
				setState(295);
				match(HtmlClose);
				}
				break;
			case HtmlStyleOpen:
				enterOuterAlt(_localctx, 4);
				{
				setState(296);
				match(HtmlStyleOpen);
				}
				break;
			case HtmlOpen:
				enterOuterAlt(_localctx, 5);
				{
				setState(297);
				match(HtmlOpen);
				}
				break;
			case HtmlName:
				enterOuterAlt(_localctx, 6);
				{
				setState(298);
				match(HtmlName);
				}
				break;
			case HtmlSlashClose:
				enterOuterAlt(_localctx, 7);
				{
				setState(299);
				match(HtmlSlashClose);
				}
				break;
			case HtmlSlash:
				enterOuterAlt(_localctx, 8);
				{
				setState(300);
				match(HtmlSlash);
				}
				break;
			case HtmlText:
				enterOuterAlt(_localctx, 9);
				{
				setState(301);
				match(HtmlText);
				}
				break;
			case HtmlEquals:
				enterOuterAlt(_localctx, 10);
				{
				setState(302);
				match(HtmlEquals);
				}
				break;
			case HtmlStartQuoteString:
				enterOuterAlt(_localctx, 11);
				{
				setState(303);
				match(HtmlStartQuoteString);
				}
				break;
			case HtmlEndQuoteString:
				enterOuterAlt(_localctx, 12);
				{
				setState(304);
				match(HtmlEndQuoteString);
				}
				break;
			case HtmlStartDoubleQuoteString:
				enterOuterAlt(_localctx, 13);
				{
				setState(305);
				match(HtmlStartDoubleQuoteString);
				}
				break;
			case HtmlEndDoubleQuoteString:
				enterOuterAlt(_localctx, 14);
				{
				setState(306);
				match(HtmlEndDoubleQuoteString);
				}
				break;
			case HtmlHex:
				enterOuterAlt(_localctx, 15);
				{
				setState(307);
				match(HtmlHex);
				}
				break;
			case HtmlDecimal:
				enterOuterAlt(_localctx, 16);
				{
				setState(308);
				match(HtmlDecimal);
				}
				break;
			case HtmlQuoteString:
				enterOuterAlt(_localctx, 17);
				{
				setState(309);
				match(HtmlQuoteString);
				}
				break;
			case HtmlDoubleQuoteString:
				enterOuterAlt(_localctx, 18);
				{
				setState(310);
				match(HtmlDoubleQuoteString);
				}
				break;
			case StyleBody:
				enterOuterAlt(_localctx, 19);
				{
				setState(311);
				match(StyleBody);
				}
				break;
			case ScriptClose:
				enterOuterAlt(_localctx, 20);
				{
				setState(312);
				match(ScriptClose);
				}
				break;
			case XmlStart:
				enterOuterAlt(_localctx, 21);
				{
				setState(313);
				match(XmlStart);
				setState(317);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==XmlText) {
					{
					{
					setState(314);
					match(XmlText);
					}
					}
					setState(319);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(320);
				match(XmlClose);
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

	public static class ScriptTextPartContext extends ParserRuleContext {
		public List<TerminalNode> ScriptText() { return getTokens(PhpParser.ScriptText); }
		public TerminalNode ScriptText(int i) {
			return getToken(PhpParser.ScriptText, i);
		}
		public ScriptTextPartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scriptTextPart; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).enterScriptTextPart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).exitScriptTextPart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PhpParserVisitor ) return ((PhpParserVisitor<? extends T>)visitor).visitScriptTextPart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ScriptTextPartContext scriptTextPart() throws RecognitionException {
		ScriptTextPartContext _localctx = new ScriptTextPartContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_scriptTextPart);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(324); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(323);
					match(ScriptText);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(326); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
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

	public static class PhpBlockContext extends ParserRuleContext {
		public List<ImportStatementContext> importStatement() {
			return getRuleContexts(ImportStatementContext.class);
		}
		public ImportStatementContext importStatement(int i) {
			return getRuleContext(ImportStatementContext.class,i);
		}
		public List<TopStatementContext> topStatement() {
			return getRuleContexts(TopStatementContext.class);
		}
		public TopStatementContext topStatement(int i) {
			return getRuleContext(TopStatementContext.class,i);
		}
		public PhpBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_phpBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).enterPhpBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).exitPhpBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PhpParserVisitor ) return ((PhpParserVisitor<? extends T>)visitor).visitPhpBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PhpBlockContext phpBlock() throws RecognitionException {
		PhpBlockContext _localctx = new PhpBlockContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_phpBlock);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(331);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(328);
					importStatement();
					}
					} 
				}
				setState(333);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			}
			setState(335); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(334);
					topStatement();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(337); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
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

	public static class ImportStatementContext extends ParserRuleContext {
		public TerminalNode Import() { return getToken(PhpParser.Import, 0); }
		public TerminalNode Namespace() { return getToken(PhpParser.Namespace, 0); }
		public NamespaceNameListContext namespaceNameList() {
			return getRuleContext(NamespaceNameListContext.class,0);
		}
		public TerminalNode SemiColon() { return getToken(PhpParser.SemiColon, 0); }
		public ImportStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).enterImportStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).exitImportStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PhpParserVisitor ) return ((PhpParserVisitor<? extends T>)visitor).visitImportStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportStatementContext importStatement() throws RecognitionException {
		ImportStatementContext _localctx = new ImportStatementContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_importStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(339);
			match(Import);
			setState(340);
			match(Namespace);
			setState(341);
			namespaceNameList();
			setState(342);
			match(SemiColon);
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

	public static class TopStatementContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public UseDeclarationContext useDeclaration() {
			return getRuleContext(UseDeclarationContext.class,0);
		}
		public NamespaceDeclarationContext namespaceDeclaration() {
			return getRuleContext(NamespaceDeclarationContext.class,0);
		}
		public FunctionDeclarationContext functionDeclaration() {
			return getRuleContext(FunctionDeclarationContext.class,0);
		}
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public GlobalConstantDeclarationContext globalConstantDeclaration() {
			return getRuleContext(GlobalConstantDeclarationContext.class,0);
		}
		public ToDocContext toDoc() {
			return getRuleContext(ToDocContext.class,0);
		}
		public TopStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_topStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).enterTopStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).exitTopStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PhpParserVisitor ) return ((PhpParserVisitor<? extends T>)visitor).visitTopStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TopStatementContext topStatement() throws RecognitionException {
		TopStatementContext _localctx = new TopStatementContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_topStatement);
		try {
			setState(351);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(344);
				statement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(345);
				useDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(346);
				namespaceDeclaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(347);
				functionDeclaration();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(348);
				classDeclaration();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(349);
				globalConstantDeclaration();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(350);
				toDoc();
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

	public static class UseDeclarationContext extends ParserRuleContext {
		public TerminalNode Use() { return getToken(PhpParser.Use, 0); }
		public UseDeclarationContentListContext useDeclarationContentList() {
			return getRuleContext(UseDeclarationContentListContext.class,0);
		}
		public TerminalNode SemiColon() { return getToken(PhpParser.SemiColon, 0); }
		public TerminalNode Function() { return getToken(PhpParser.Function, 0); }
		public TerminalNode Const() { return getToken(PhpParser.Const, 0); }
		public UseDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_useDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).enterUseDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).exitUseDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PhpParserVisitor ) return ((PhpParserVisitor<? extends T>)visitor).visitUseDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UseDeclarationContext useDeclaration() throws RecognitionException {
		UseDeclarationContext _localctx = new UseDeclarationContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_useDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(353);
			match(Use);
			setState(355);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				setState(354);
				_la = _input.LA(1);
				if ( !(_la==Const || _la==Function) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			}
			setState(357);
			useDeclarationContentList();
			setState(358);
			match(SemiColon);
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

	public static class UseDeclarationContentListContext extends ParserRuleContext {
		public List<UseDeclarationContentContext> useDeclarationContent() {
			return getRuleContexts(UseDeclarationContentContext.class);
		}
		public UseDeclarationContentContext useDeclarationContent(int i) {
			return getRuleContext(UseDeclarationContentContext.class,i);
		}
		public List<TerminalNode> NamespaceSeparator() { return getTokens(PhpParser.NamespaceSeparator); }
		public TerminalNode NamespaceSeparator(int i) {
			return getToken(PhpParser.NamespaceSeparator, i);
		}
		public List<TerminalNode> Comma() { return getTokens(PhpParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(PhpParser.Comma, i);
		}
		public UseDeclarationContentListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_useDeclarationContentList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).enterUseDeclarationContentList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).exitUseDeclarationContentList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PhpParserVisitor ) return ((PhpParserVisitor<? extends T>)visitor).visitUseDeclarationContentList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UseDeclarationContentListContext useDeclarationContentList() throws RecognitionException {
		UseDeclarationContentListContext _localctx = new UseDeclarationContentListContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_useDeclarationContentList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(361);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NamespaceSeparator) {
				{
				setState(360);
				match(NamespaceSeparator);
				}
			}

			setState(363);
			useDeclarationContent();
			setState(371);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(364);
				match(Comma);
				setState(366);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NamespaceSeparator) {
					{
					setState(365);
					match(NamespaceSeparator);
					}
				}

				setState(368);
				useDeclarationContent();
				}
				}
				setState(373);
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

	public static class UseDeclarationContentContext extends ParserRuleContext {
		public NamespaceNameListContext namespaceNameList() {
			return getRuleContext(NamespaceNameListContext.class,0);
		}
		public UseDeclarationContentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_useDeclarationContent; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).enterUseDeclarationContent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).exitUseDeclarationContent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PhpParserVisitor ) return ((PhpParserVisitor<? extends T>)visitor).visitUseDeclarationContent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UseDeclarationContentContext useDeclarationContent() throws RecognitionException {
		UseDeclarationContentContext _localctx = new UseDeclarationContentContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_useDeclarationContent);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(374);
			namespaceNameList();
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

	public static class NamespaceDeclarationContext extends ParserRuleContext {
		public TerminalNode Namespace() { return getToken(PhpParser.Namespace, 0); }
		public TerminalNode OpenCurlyBracket() { return getToken(PhpParser.OpenCurlyBracket, 0); }
		public TerminalNode CloseCurlyBracket() { return getToken(PhpParser.CloseCurlyBracket, 0); }
		public NamespaceNameListContext namespaceNameList() {
			return getRuleContext(NamespaceNameListContext.class,0);
		}
		public TerminalNode SemiColon() { return getToken(PhpParser.SemiColon, 0); }
		public List<NamespaceStatementContext> namespaceStatement() {
			return getRuleContexts(NamespaceStatementContext.class);
		}
		public NamespaceStatementContext namespaceStatement(int i) {
			return getRuleContext(NamespaceStatementContext.class,i);
		}
		public NamespaceDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namespaceDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).enterNamespaceDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).exitNamespaceDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PhpParserVisitor ) return ((PhpParserVisitor<? extends T>)visitor).visitNamespaceDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NamespaceDeclarationContext namespaceDeclaration() throws RecognitionException {
		NamespaceDeclarationContext _localctx = new NamespaceDeclarationContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_namespaceDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(376);
			match(Namespace);
			setState(391);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				{
				setState(378);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 44)) & ~0x3f) == 0 && ((1L << (_la - 44)) & ((1L << (Abstract - 44)) | (1L << (Array - 44)) | (1L << (As - 44)) | (1L << (BinaryCast - 44)) | (1L << (BoolType - 44)) | (1L << (BooleanConstant - 44)) | (1L << (Break - 44)) | (1L << (Callable - 44)) | (1L << (Case - 44)) | (1L << (Catch - 44)) | (1L << (Class - 44)) | (1L << (Clone - 44)) | (1L << (Const - 44)) | (1L << (Continue - 44)) | (1L << (Declare - 44)) | (1L << (Default - 44)) | (1L << (Do - 44)) | (1L << (DoubleCast - 44)) | (1L << (DoubleType - 44)) | (1L << (Echo - 44)) | (1L << (Else - 44)) | (1L << (ElseIf - 44)) | (1L << (Empty - 44)) | (1L << (EndDeclare - 44)) | (1L << (EndFor - 44)) | (1L << (EndForeach - 44)) | (1L << (EndIf - 44)) | (1L << (EndSwitch - 44)) | (1L << (EndWhile - 44)) | (1L << (Eval - 44)) | (1L << (Exit - 44)) | (1L << (Extends - 44)) | (1L << (Final - 44)) | (1L << (Finally - 44)) | (1L << (FloatCast - 44)) | (1L << (For - 44)) | (1L << (Foreach - 44)) | (1L << (Function - 44)) | (1L << (Global - 44)) | (1L << (Goto - 44)) | (1L << (If - 44)) | (1L << (Implements - 44)) | (1L << (Import - 44)) | (1L << (Include - 44)) | (1L << (IncludeOnce - 44)) | (1L << (InstanceOf - 44)) | (1L << (InsteadOf - 44)) | (1L << (Int8Cast - 44)) | (1L << (Int16Cast - 44)) | (1L << (Int64Type - 44)) | (1L << (IntType - 44)) | (1L << (Interface - 44)) | (1L << (IsSet - 44)) | (1L << (List - 44)) | (1L << (LogicalAnd - 44)) | (1L << (LogicalOr - 44)) | (1L << (LogicalXor - 44)) | (1L << (Namespace - 44)) | (1L << (New - 44)) | (1L << (Null - 44)) | (1L << (ObjectType - 44)) | (1L << (Parent_ - 44)) | (1L << (Partial - 44)) | (1L << (Print - 44)))) != 0) || ((((_la - 108)) & ~0x3f) == 0 && ((1L << (_la - 108)) & ((1L << (Private - 108)) | (1L << (Protected - 108)) | (1L << (Public - 108)) | (1L << (Require - 108)) | (1L << (RequireOnce - 108)) | (1L << (Resource - 108)) | (1L << (Return - 108)) | (1L << (Static - 108)) | (1L << (StringType - 108)) | (1L << (Switch - 108)) | (1L << (Throw - 108)) | (1L << (Trait - 108)) | (1L << (Try - 108)) | (1L << (Typeof - 108)) | (1L << (UintCast - 108)) | (1L << (UnicodeCast - 108)) | (1L << (Unset - 108)) | (1L << (Use - 108)) | (1L << (Var - 108)) | (1L << (While - 108)) | (1L << (Yield - 108)) | (1L << (From - 108)) | (1L << (Get - 108)) | (1L << (Set - 108)) | (1L << (Call - 108)) | (1L << (CallStatic - 108)) | (1L << (Constructor - 108)) | (1L << (Destruct - 108)) | (1L << (Wakeup - 108)) | (1L << (Sleep - 108)) | (1L << (Autoload - 108)) | (1L << (IsSet__ - 108)) | (1L << (Unset__ - 108)) | (1L << (ToString__ - 108)) | (1L << (Invoke - 108)) | (1L << (SetState - 108)) | (1L << (Clone__ - 108)) | (1L << (DebugInfo - 108)) | (1L << (Namespace__ - 108)) | (1L << (Class__ - 108)) | (1L << (Traic__ - 108)) | (1L << (Function__ - 108)) | (1L << (Method__ - 108)) | (1L << (Line__ - 108)) | (1L << (File__ - 108)) | (1L << (Dir__ - 108)))) != 0) || _la==Label) {
					{
					setState(377);
					namespaceNameList();
					}
				}

				setState(380);
				match(OpenCurlyBracket);
				setState(384);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << HtmlText) | (1L << XmlStart) | (1L << HtmlScriptOpen) | (1L << HtmlStyleOpen) | (1L << HtmlDtd) | (1L << HtmlOpen) | (1L << HtmlClose) | (1L << HtmlSlashClose) | (1L << HtmlSlash) | (1L << HtmlEquals) | (1L << HtmlStartQuoteString) | (1L << HtmlStartDoubleQuoteString) | (1L << HtmlHex) | (1L << HtmlDecimal) | (1L << HtmlName) | (1L << HtmlEndQuoteString) | (1L << HtmlQuoteString) | (1L << HtmlEndDoubleQuoteString) | (1L << HtmlDoubleQuoteString) | (1L << ScriptText) | (1L << ScriptClose) | (1L << StyleBody) | (1L << Abstract) | (1L << Array) | (1L << As) | (1L << BinaryCast) | (1L << BoolType) | (1L << BooleanConstant) | (1L << Break) | (1L << Callable) | (1L << Case) | (1L << Catch) | (1L << Class) | (1L << Clone) | (1L << Const) | (1L << Continue) | (1L << Declare) | (1L << Default) | (1L << Do) | (1L << DoubleCast) | (1L << DoubleType) | (1L << Echo))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (Else - 64)) | (1L << (ElseIf - 64)) | (1L << (Empty - 64)) | (1L << (EndDeclare - 64)) | (1L << (EndFor - 64)) | (1L << (EndForeach - 64)) | (1L << (EndIf - 64)) | (1L << (EndSwitch - 64)) | (1L << (EndWhile - 64)) | (1L << (Eval - 64)) | (1L << (Exit - 64)) | (1L << (Extends - 64)) | (1L << (Final - 64)) | (1L << (Finally - 64)) | (1L << (FloatCast - 64)) | (1L << (For - 64)) | (1L << (Foreach - 64)) | (1L << (Function - 64)) | (1L << (Global - 64)) | (1L << (Goto - 64)) | (1L << (If - 64)) | (1L << (Implements - 64)) | (1L << (Import - 64)) | (1L << (Include - 64)) | (1L << (IncludeOnce - 64)) | (1L << (InstanceOf - 64)) | (1L << (InsteadOf - 64)) | (1L << (Int8Cast - 64)) | (1L << (Int16Cast - 64)) | (1L << (Int64Type - 64)) | (1L << (IntType - 64)) | (1L << (Interface - 64)) | (1L << (IsSet - 64)) | (1L << (List - 64)) | (1L << (LogicalAnd - 64)) | (1L << (LogicalOr - 64)) | (1L << (LogicalXor - 64)) | (1L << (Namespace - 64)) | (1L << (New - 64)) | (1L << (Null - 64)) | (1L << (ObjectType - 64)) | (1L << (Parent_ - 64)) | (1L << (Partial - 64)) | (1L << (Print - 64)) | (1L << (Private - 64)) | (1L << (Protected - 64)) | (1L << (Public - 64)) | (1L << (Require - 64)) | (1L << (RequireOnce - 64)) | (1L << (Resource - 64)) | (1L << (Return - 64)) | (1L << (Static - 64)) | (1L << (StringType - 64)) | (1L << (Switch - 64)) | (1L << (Throw - 64)) | (1L << (Trait - 64)) | (1L << (Try - 64)) | (1L << (Typeof - 64)) | (1L << (UintCast - 64)) | (1L << (UnicodeCast - 64)) | (1L << (Unset - 64)) | (1L << (Use - 64)) | (1L << (Var - 64)) | (1L << (While - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (Yield - 128)) | (1L << (From - 128)) | (1L << (LambdaFn - 128)) | (1L << (Get - 128)) | (1L << (Set - 128)) | (1L << (Call - 128)) | (1L << (CallStatic - 128)) | (1L << (Constructor - 128)) | (1L << (Destruct - 128)) | (1L << (Wakeup - 128)) | (1L << (Sleep - 128)) | (1L << (Autoload - 128)) | (1L << (IsSet__ - 128)) | (1L << (Unset__ - 128)) | (1L << (ToString__ - 128)) | (1L << (Invoke - 128)) | (1L << (SetState - 128)) | (1L << (Clone__ - 128)) | (1L << (DebugInfo - 128)) | (1L << (Namespace__ - 128)) | (1L << (Class__ - 128)) | (1L << (Traic__ - 128)) | (1L << (Function__ - 128)) | (1L << (Method__ - 128)) | (1L << (Line__ - 128)) | (1L << (File__ - 128)) | (1L << (Dir__ - 128)) | (1L << (Inc - 128)) | (1L << (Dec - 128)) | (1L << (NamespaceSeparator - 128)))) != 0) || ((((_la - 194)) & ~0x3f) == 0 && ((1L << (_la - 194)) & ((1L << (Bang - 194)) | (1L << (Plus - 194)) | (1L << (Minus - 194)) | (1L << (Tilde - 194)) | (1L << (SuppressWarnings - 194)) | (1L << (Dollar - 194)) | (1L << (OpenRoundBracket - 194)) | (1L << (OpenSquareBracket - 194)) | (1L << (OpenCurlyBracket - 194)) | (1L << (SemiColon - 194)) | (1L << (VarName - 194)) | (1L << (Label - 194)) | (1L << (Octal - 194)) | (1L << (Decimal - 194)) | (1L << (Real - 194)) | (1L << (Hex - 194)) | (1L << (Binary - 194)) | (1L << (BackQuoteString - 194)) | (1L << (SingleQuoteString - 194)) | (1L << (DoubleQuote - 194)) | (1L << (StartNowDoc - 194)) | (1L << (StartHereDoc - 194)))) != 0)) {
					{
					{
					setState(381);
					namespaceStatement();
					}
					}
					setState(386);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(387);
				match(CloseCurlyBracket);
				}
				break;
			case 2:
				{
				setState(388);
				namespaceNameList();
				setState(389);
				match(SemiColon);
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

	public static class NamespaceStatementContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public UseDeclarationContext useDeclaration() {
			return getRuleContext(UseDeclarationContext.class,0);
		}
		public FunctionDeclarationContext functionDeclaration() {
			return getRuleContext(FunctionDeclarationContext.class,0);
		}
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public GlobalConstantDeclarationContext globalConstantDeclaration() {
			return getRuleContext(GlobalConstantDeclarationContext.class,0);
		}
		public NamespaceStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namespaceStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).enterNamespaceStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).exitNamespaceStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PhpParserVisitor ) return ((PhpParserVisitor<? extends T>)visitor).visitNamespaceStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NamespaceStatementContext namespaceStatement() throws RecognitionException {
		NamespaceStatementContext _localctx = new NamespaceStatementContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_namespaceStatement);
		try {
			setState(398);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(393);
				statement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(394);
				useDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(395);
				functionDeclaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(396);
				classDeclaration();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(397);
				globalConstantDeclaration();
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

	public static class FunctionDeclarationContext extends ParserRuleContext {
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public TerminalNode Function() { return getToken(PhpParser.Function, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode OpenRoundBracket() { return getToken(PhpParser.OpenRoundBracket, 0); }
		public FormalParameterListContext formalParameterList() {
			return getRuleContext(FormalParameterListContext.class,0);
		}
		public TerminalNode CloseRoundBracket() { return getToken(PhpParser.CloseRoundBracket, 0); }
		public BlockStatementContext blockStatement() {
			return getRuleContext(BlockStatementContext.class,0);
		}
		public TerminalNode Ampersand() { return getToken(PhpParser.Ampersand, 0); }
		public TypeParameterListInBracketsContext typeParameterListInBrackets() {
			return getRuleContext(TypeParameterListInBracketsContext.class,0);
		}
		public TerminalNode Colon() { return getToken(PhpParser.Colon, 0); }
		public TypeHintContext typeHint() {
			return getRuleContext(TypeHintContext.class,0);
		}
		public TerminalNode QuestionMark() { return getToken(PhpParser.QuestionMark, 0); }
		public FunctionDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).enterFunctionDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).exitFunctionDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PhpParserVisitor ) return ((PhpParserVisitor<? extends T>)visitor).visitFunctionDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionDeclarationContext functionDeclaration() throws RecognitionException {
		FunctionDeclarationContext _localctx = new FunctionDeclarationContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_functionDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(400);
			attributes();
			setState(401);
			match(Function);
			setState(403);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Ampersand) {
				{
				setState(402);
				match(Ampersand);
				}
			}

			setState(405);
			identifier();
			setState(407);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Lgeneric) {
				{
				setState(406);
				typeParameterListInBrackets();
				}
			}

			setState(409);
			match(OpenRoundBracket);
			setState(410);
			formalParameterList();
			setState(411);
			match(CloseRoundBracket);
			setState(417);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Colon) {
				{
				setState(412);
				match(Colon);
				setState(414);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==QuestionMark) {
					{
					setState(413);
					match(QuestionMark);
					}
				}

				setState(416);
				typeHint();
				}
			}

			setState(419);
			blockStatement();
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
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public TerminalNode OpenCurlyBracket() { return getToken(PhpParser.OpenCurlyBracket, 0); }
		public TerminalNode CloseCurlyBracket() { return getToken(PhpParser.CloseCurlyBracket, 0); }
		public ClassEntryTypeContext classEntryType() {
			return getRuleContext(ClassEntryTypeContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode Interface() { return getToken(PhpParser.Interface, 0); }
		public TerminalNode Private() { return getToken(PhpParser.Private, 0); }
		public ModifierContext modifier() {
			return getRuleContext(ModifierContext.class,0);
		}
		public TerminalNode Partial() { return getToken(PhpParser.Partial, 0); }
		public List<ClassStatementContext> classStatement() {
			return getRuleContexts(ClassStatementContext.class);
		}
		public ClassStatementContext classStatement(int i) {
			return getRuleContext(ClassStatementContext.class,i);
		}
		public TypeParameterListInBracketsContext typeParameterListInBrackets() {
			return getRuleContext(TypeParameterListInBracketsContext.class,0);
		}
		public TerminalNode Extends() { return getToken(PhpParser.Extends, 0); }
		public QualifiedStaticTypeRefContext qualifiedStaticTypeRef() {
			return getRuleContext(QualifiedStaticTypeRefContext.class,0);
		}
		public TerminalNode Implements() { return getToken(PhpParser.Implements, 0); }
		public InterfaceListContext interfaceList() {
			return getRuleContext(InterfaceListContext.class,0);
		}
		public ClassDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).enterClassDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).exitClassDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PhpParserVisitor ) return ((PhpParserVisitor<? extends T>)visitor).visitClassDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassDeclarationContext classDeclaration() throws RecognitionException {
		ClassDeclarationContext _localctx = new ClassDeclarationContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_classDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(421);
			attributes();
			setState(423);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Private) {
				{
				setState(422);
				match(Private);
				}
			}

			setState(426);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Abstract || _la==Final) {
				{
				setState(425);
				modifier();
				}
			}

			setState(429);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Partial) {
				{
				setState(428);
				match(Partial);
				}
			}

			setState(453);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Class:
			case Trait:
				{
				setState(431);
				classEntryType();
				setState(432);
				identifier();
				setState(434);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Lgeneric) {
					{
					setState(433);
					typeParameterListInBrackets();
					}
				}

				setState(438);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Extends) {
					{
					setState(436);
					match(Extends);
					setState(437);
					qualifiedStaticTypeRef();
					}
				}

				setState(442);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Implements) {
					{
					setState(440);
					match(Implements);
					setState(441);
					interfaceList();
					}
				}

				}
				break;
			case Interface:
				{
				setState(444);
				match(Interface);
				setState(445);
				identifier();
				setState(447);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Lgeneric) {
					{
					setState(446);
					typeParameterListInBrackets();
					}
				}

				setState(451);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Extends) {
					{
					setState(449);
					match(Extends);
					setState(450);
					interfaceList();
					}
				}

				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(455);
			match(OpenCurlyBracket);
			setState(459);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Abstract || _la==Const || ((((_la - 76)) & ~0x3f) == 0 && ((1L << (_la - 76)) & ((1L << (Final - 76)) | (1L << (Function - 76)) | (1L << (Private - 76)) | (1L << (Protected - 76)) | (1L << (Public - 76)) | (1L << (Static - 76)) | (1L << (Use - 76)) | (1L << (Var - 76)))) != 0) || _la==OpenSquareBracket) {
				{
				{
				setState(456);
				classStatement();
				}
				}
				setState(461);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(462);
			match(CloseCurlyBracket);
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

	public static class ClassEntryTypeContext extends ParserRuleContext {
		public TerminalNode Class() { return getToken(PhpParser.Class, 0); }
		public TerminalNode Trait() { return getToken(PhpParser.Trait, 0); }
		public ClassEntryTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classEntryType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).enterClassEntryType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).exitClassEntryType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PhpParserVisitor ) return ((PhpParserVisitor<? extends T>)visitor).visitClassEntryType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassEntryTypeContext classEntryType() throws RecognitionException {
		ClassEntryTypeContext _localctx = new ClassEntryTypeContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_classEntryType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(464);
			_la = _input.LA(1);
			if ( !(_la==Class || _la==Trait) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class InterfaceListContext extends ParserRuleContext {
		public List<QualifiedStaticTypeRefContext> qualifiedStaticTypeRef() {
			return getRuleContexts(QualifiedStaticTypeRefContext.class);
		}
		public QualifiedStaticTypeRefContext qualifiedStaticTypeRef(int i) {
			return getRuleContext(QualifiedStaticTypeRefContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(PhpParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(PhpParser.Comma, i);
		}
		public InterfaceListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).enterInterfaceList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).exitInterfaceList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PhpParserVisitor ) return ((PhpParserVisitor<? extends T>)visitor).visitInterfaceList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InterfaceListContext interfaceList() throws RecognitionException {
		InterfaceListContext _localctx = new InterfaceListContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_interfaceList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(466);
			qualifiedStaticTypeRef();
			setState(471);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(467);
				match(Comma);
				setState(468);
				qualifiedStaticTypeRef();
				}
				}
				setState(473);
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

	public static class TypeParameterListInBracketsContext extends ParserRuleContext {
		public TerminalNode Lgeneric() { return getToken(PhpParser.Lgeneric, 0); }
		public TypeParameterListContext typeParameterList() {
			return getRuleContext(TypeParameterListContext.class,0);
		}
		public TerminalNode Rgeneric() { return getToken(PhpParser.Rgeneric, 0); }
		public TypeParameterWithDefaultsListContext typeParameterWithDefaultsList() {
			return getRuleContext(TypeParameterWithDefaultsListContext.class,0);
		}
		public TerminalNode Comma() { return getToken(PhpParser.Comma, 0); }
		public TypeParameterListInBracketsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeParameterListInBrackets; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).enterTypeParameterListInBrackets(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).exitTypeParameterListInBrackets(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PhpParserVisitor ) return ((PhpParserVisitor<? extends T>)visitor).visitTypeParameterListInBrackets(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeParameterListInBracketsContext typeParameterListInBrackets() throws RecognitionException {
		TypeParameterListInBracketsContext _localctx = new TypeParameterListInBracketsContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_typeParameterListInBrackets);
		try {
			setState(488);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(474);
				match(Lgeneric);
				setState(475);
				typeParameterList();
				setState(476);
				match(Rgeneric);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(478);
				match(Lgeneric);
				setState(479);
				typeParameterWithDefaultsList();
				setState(480);
				match(Rgeneric);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(482);
				match(Lgeneric);
				setState(483);
				typeParameterList();
				setState(484);
				match(Comma);
				setState(485);
				typeParameterWithDefaultsList();
				setState(486);
				match(Rgeneric);
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

	public static class TypeParameterListContext extends ParserRuleContext {
		public List<TypeParameterDeclContext> typeParameterDecl() {
			return getRuleContexts(TypeParameterDeclContext.class);
		}
		public TypeParameterDeclContext typeParameterDecl(int i) {
			return getRuleContext(TypeParameterDeclContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(PhpParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(PhpParser.Comma, i);
		}
		public TypeParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeParameterList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).enterTypeParameterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).exitTypeParameterList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PhpParserVisitor ) return ((PhpParserVisitor<? extends T>)visitor).visitTypeParameterList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeParameterListContext typeParameterList() throws RecognitionException {
		TypeParameterListContext _localctx = new TypeParameterListContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_typeParameterList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(490);
			typeParameterDecl();
			setState(495);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(491);
					match(Comma);
					setState(492);
					typeParameterDecl();
					}
					} 
				}
				setState(497);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
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

	public static class TypeParameterWithDefaultsListContext extends ParserRuleContext {
		public List<TypeParameterWithDefaultDeclContext> typeParameterWithDefaultDecl() {
			return getRuleContexts(TypeParameterWithDefaultDeclContext.class);
		}
		public TypeParameterWithDefaultDeclContext typeParameterWithDefaultDecl(int i) {
			return getRuleContext(TypeParameterWithDefaultDeclContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(PhpParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(PhpParser.Comma, i);
		}
		public TypeParameterWithDefaultsListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeParameterWithDefaultsList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).enterTypeParameterWithDefaultsList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).exitTypeParameterWithDefaultsList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PhpParserVisitor ) return ((PhpParserVisitor<? extends T>)visitor).visitTypeParameterWithDefaultsList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeParameterWithDefaultsListContext typeParameterWithDefaultsList() throws RecognitionException {
		TypeParameterWithDefaultsListContext _localctx = new TypeParameterWithDefaultsListContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_typeParameterWithDefaultsList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(498);
			typeParameterWithDefaultDecl();
			setState(503);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(499);
				match(Comma);
				setState(500);
				typeParameterWithDefaultDecl();
				}
				}
				setState(505);
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

	public static class TypeParameterDeclContext extends ParserRuleContext {
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TypeParameterDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeParameterDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).enterTypeParameterDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).exitTypeParameterDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PhpParserVisitor ) return ((PhpParserVisitor<? extends T>)visitor).visitTypeParameterDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeParameterDeclContext typeParameterDecl() throws RecognitionException {
		TypeParameterDeclContext _localctx = new TypeParameterDeclContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_typeParameterDecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(506);
			attributes();
			setState(507);
			identifier();
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

	public static class TypeParameterWithDefaultDeclContext extends ParserRuleContext {
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode Eq() { return getToken(PhpParser.Eq, 0); }
		public QualifiedStaticTypeRefContext qualifiedStaticTypeRef() {
			return getRuleContext(QualifiedStaticTypeRefContext.class,0);
		}
		public PrimitiveTypeContext primitiveType() {
			return getRuleContext(PrimitiveTypeContext.class,0);
		}
		public TypeParameterWithDefaultDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeParameterWithDefaultDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).enterTypeParameterWithDefaultDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).exitTypeParameterWithDefaultDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PhpParserVisitor ) return ((PhpParserVisitor<? extends T>)visitor).visitTypeParameterWithDefaultDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeParameterWithDefaultDeclContext typeParameterWithDefaultDecl() throws RecognitionException {
		TypeParameterWithDefaultDeclContext _localctx = new TypeParameterWithDefaultDeclContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_typeParameterWithDefaultDecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(509);
			attributes();
			setState(510);
			identifier();
			setState(511);
			match(Eq);
			setState(514);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				{
				setState(512);
				qualifiedStaticTypeRef();
				}
				break;
			case 2:
				{
				setState(513);
				primitiveType();
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

	public static class GenericDynamicArgsContext extends ParserRuleContext {
		public TerminalNode Lgeneric() { return getToken(PhpParser.Lgeneric, 0); }
		public List<TypeRefContext> typeRef() {
			return getRuleContexts(TypeRefContext.class);
		}
		public TypeRefContext typeRef(int i) {
			return getRuleContext(TypeRefContext.class,i);
		}
		public TerminalNode Rgeneric() { return getToken(PhpParser.Rgeneric, 0); }
		public List<TerminalNode> Comma() { return getTokens(PhpParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(PhpParser.Comma, i);
		}
		public GenericDynamicArgsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_genericDynamicArgs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).enterGenericDynamicArgs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).exitGenericDynamicArgs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PhpParserVisitor ) return ((PhpParserVisitor<? extends T>)visitor).visitGenericDynamicArgs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GenericDynamicArgsContext genericDynamicArgs() throws RecognitionException {
		GenericDynamicArgsContext _localctx = new GenericDynamicArgsContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_genericDynamicArgs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(516);
			match(Lgeneric);
			setState(517);
			typeRef();
			setState(522);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(518);
				match(Comma);
				setState(519);
				typeRef();
				}
				}
				setState(524);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(525);
			match(Rgeneric);
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

	public static class AttributesContext extends ParserRuleContext {
		public List<AttributesGroupContext> attributesGroup() {
			return getRuleContexts(AttributesGroupContext.class);
		}
		public AttributesGroupContext attributesGroup(int i) {
			return getRuleContext(AttributesGroupContext.class,i);
		}
		public AttributesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attributes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).enterAttributes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).exitAttributes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PhpParserVisitor ) return ((PhpParserVisitor<? extends T>)visitor).visitAttributes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttributesContext attributes() throws RecognitionException {
		AttributesContext _localctx = new AttributesContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_attributes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(530);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OpenSquareBracket) {
				{
				{
				setState(527);
				attributesGroup();
				}
				}
				setState(532);
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

	public static class AttributesGroupContext extends ParserRuleContext {
		public TerminalNode OpenSquareBracket() { return getToken(PhpParser.OpenSquareBracket, 0); }
		public List<AttributeContext> attribute() {
			return getRuleContexts(AttributeContext.class);
		}
		public AttributeContext attribute(int i) {
			return getRuleContext(AttributeContext.class,i);
		}
		public TerminalNode CloseSquareBracket() { return getToken(PhpParser.CloseSquareBracket, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode Colon() { return getToken(PhpParser.Colon, 0); }
		public List<TerminalNode> Comma() { return getTokens(PhpParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(PhpParser.Comma, i);
		}
		public AttributesGroupContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attributesGroup; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).enterAttributesGroup(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).exitAttributesGroup(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PhpParserVisitor ) return ((PhpParserVisitor<? extends T>)visitor).visitAttributesGroup(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttributesGroupContext attributesGroup() throws RecognitionException {
		AttributesGroupContext _localctx = new AttributesGroupContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_attributesGroup);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(533);
			match(OpenSquareBracket);
			setState(537);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
			case 1:
				{
				setState(534);
				identifier();
				setState(535);
				match(Colon);
				}
				break;
			}
			setState(539);
			attribute();
			setState(544);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(540);
				match(Comma);
				setState(541);
				attribute();
				}
				}
				setState(546);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(547);
			match(CloseSquareBracket);
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

	public static class AttributeContext extends ParserRuleContext {
		public QualifiedNamespaceNameContext qualifiedNamespaceName() {
			return getRuleContext(QualifiedNamespaceNameContext.class,0);
		}
		public TerminalNode OpenRoundBracket() { return getToken(PhpParser.OpenRoundBracket, 0); }
		public AttributeArgListContext attributeArgList() {
			return getRuleContext(AttributeArgListContext.class,0);
		}
		public TerminalNode CloseRoundBracket() { return getToken(PhpParser.CloseRoundBracket, 0); }
		public AttributeNamedArgListContext attributeNamedArgList() {
			return getRuleContext(AttributeNamedArgListContext.class,0);
		}
		public TerminalNode Comma() { return getToken(PhpParser.Comma, 0); }
		public AttributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attribute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).enterAttribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).exitAttribute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PhpParserVisitor ) return ((PhpParserVisitor<? extends T>)visitor).visitAttribute(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttributeContext attribute() throws RecognitionException {
		AttributeContext _localctx = new AttributeContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_attribute);
		try {
			setState(567);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(549);
				qualifiedNamespaceName();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(550);
				qualifiedNamespaceName();
				setState(551);
				match(OpenRoundBracket);
				setState(552);
				attributeArgList();
				setState(553);
				match(CloseRoundBracket);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(555);
				qualifiedNamespaceName();
				setState(556);
				match(OpenRoundBracket);
				setState(557);
				attributeNamedArgList();
				setState(558);
				match(CloseRoundBracket);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(560);
				qualifiedNamespaceName();
				setState(561);
				match(OpenRoundBracket);
				setState(562);
				attributeArgList();
				setState(563);
				match(Comma);
				setState(564);
				attributeNamedArgList();
				setState(565);
				match(CloseRoundBracket);
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

	public static class AttributeArgListContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(PhpParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(PhpParser.Comma, i);
		}
		public AttributeArgListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attributeArgList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).enterAttributeArgList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).exitAttributeArgList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PhpParserVisitor ) return ((PhpParserVisitor<? extends T>)visitor).visitAttributeArgList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttributeArgListContext attributeArgList() throws RecognitionException {
		AttributeArgListContext _localctx = new AttributeArgListContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_attributeArgList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(569);
			expression(0);
			setState(574);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,42,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(570);
					match(Comma);
					setState(571);
					expression(0);
					}
					} 
				}
				setState(576);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,42,_ctx);
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

	public static class AttributeNamedArgListContext extends ParserRuleContext {
		public List<AttributeNamedArgContext> attributeNamedArg() {
			return getRuleContexts(AttributeNamedArgContext.class);
		}
		public AttributeNamedArgContext attributeNamedArg(int i) {
			return getRuleContext(AttributeNamedArgContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(PhpParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(PhpParser.Comma, i);
		}
		public AttributeNamedArgListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attributeNamedArgList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).enterAttributeNamedArgList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).exitAttributeNamedArgList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PhpParserVisitor ) return ((PhpParserVisitor<? extends T>)visitor).visitAttributeNamedArgList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttributeNamedArgListContext attributeNamedArgList() throws RecognitionException {
		AttributeNamedArgListContext _localctx = new AttributeNamedArgListContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_attributeNamedArgList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(577);
			attributeNamedArg();
			setState(582);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(578);
				match(Comma);
				setState(579);
				attributeNamedArg();
				}
				}
				setState(584);
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

	public static class AttributeNamedArgContext extends ParserRuleContext {
		public TerminalNode VarName() { return getToken(PhpParser.VarName, 0); }
		public TerminalNode DoubleArrow() { return getToken(PhpParser.DoubleArrow, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AttributeNamedArgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attributeNamedArg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).enterAttributeNamedArg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).exitAttributeNamedArg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PhpParserVisitor ) return ((PhpParserVisitor<? extends T>)visitor).visitAttributeNamedArg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttributeNamedArgContext attributeNamedArg() throws RecognitionException {
		AttributeNamedArgContext _localctx = new AttributeNamedArgContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_attributeNamedArg);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(585);
			match(VarName);
			setState(586);
			match(DoubleArrow);
			setState(587);
			expression(0);
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

	public static class InnerStatementListContext extends ParserRuleContext {
		public List<InnerStatementContext> innerStatement() {
			return getRuleContexts(InnerStatementContext.class);
		}
		public InnerStatementContext innerStatement(int i) {
			return getRuleContext(InnerStatementContext.class,i);
		}
		public InnerStatementListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_innerStatementList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).enterInnerStatementList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).exitInnerStatementList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PhpParserVisitor ) return ((PhpParserVisitor<? extends T>)visitor).visitInnerStatementList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InnerStatementListContext innerStatementList() throws RecognitionException {
		InnerStatementListContext _localctx = new InnerStatementListContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_innerStatementList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(592);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,44,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(589);
					innerStatement();
					}
					} 
				}
				setState(594);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,44,_ctx);
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

	public static class InnerStatementContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public FunctionDeclarationContext functionDeclaration() {
			return getRuleContext(FunctionDeclarationContext.class,0);
		}
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public InnerStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_innerStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).enterInnerStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).exitInnerStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PhpParserVisitor ) return ((PhpParserVisitor<? extends T>)visitor).visitInnerStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InnerStatementContext innerStatement() throws RecognitionException {
		InnerStatementContext _localctx = new InnerStatementContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_innerStatement);
		try {
			setState(598);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(595);
				statement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(596);
				functionDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(597);
				classDeclaration();
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

	public static class StatementContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode Colon() { return getToken(PhpParser.Colon, 0); }
		public BlockStatementContext blockStatement() {
			return getRuleContext(BlockStatementContext.class,0);
		}
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public WhileStatementContext whileStatement() {
			return getRuleContext(WhileStatementContext.class,0);
		}
		public DoWhileStatementContext doWhileStatement() {
			return getRuleContext(DoWhileStatementContext.class,0);
		}
		public ForStatementContext forStatement() {
			return getRuleContext(ForStatementContext.class,0);
		}
		public SwitchStatementContext switchStatement() {
			return getRuleContext(SwitchStatementContext.class,0);
		}
		public BreakStatementContext breakStatement() {
			return getRuleContext(BreakStatementContext.class,0);
		}
		public ContinueStatementContext continueStatement() {
			return getRuleContext(ContinueStatementContext.class,0);
		}
		public ReturnStatementContext returnStatement() {
			return getRuleContext(ReturnStatementContext.class,0);
		}
		public YieldExpressionContext yieldExpression() {
			return getRuleContext(YieldExpressionContext.class,0);
		}
		public TerminalNode SemiColon() { return getToken(PhpParser.SemiColon, 0); }
		public GlobalStatementContext globalStatement() {
			return getRuleContext(GlobalStatementContext.class,0);
		}
		public StaticVariableStatementContext staticVariableStatement() {
			return getRuleContext(StaticVariableStatementContext.class,0);
		}
		public EchoStatementContext echoStatement() {
			return getRuleContext(EchoStatementContext.class,0);
		}
		public ExpressionStatementContext expressionStatement() {
			return getRuleContext(ExpressionStatementContext.class,0);
		}
		public UnsetStatementContext unsetStatement() {
			return getRuleContext(UnsetStatementContext.class,0);
		}
		public ForeachStatementContext foreachStatement() {
			return getRuleContext(ForeachStatementContext.class,0);
		}
		public TryCatchFinallyContext tryCatchFinally() {
			return getRuleContext(TryCatchFinallyContext.class,0);
		}
		public ThrowStatementContext throwStatement() {
			return getRuleContext(ThrowStatementContext.class,0);
		}
		public GotoStatementContext gotoStatement() {
			return getRuleContext(GotoStatementContext.class,0);
		}
		public DeclareStatementContext declareStatement() {
			return getRuleContext(DeclareStatementContext.class,0);
		}
		public EmptyStatementContext emptyStatement() {
			return getRuleContext(EmptyStatementContext.class,0);
		}
		public InlineHtmlStatementContext inlineHtmlStatement() {
			return getRuleContext(InlineHtmlStatementContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PhpParserVisitor ) return ((PhpParserVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_statement);
		try {
			setState(627);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(600);
				identifier();
				setState(601);
				match(Colon);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(603);
				blockStatement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(604);
				ifStatement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(605);
				whileStatement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(606);
				doWhileStatement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(607);
				forStatement();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(608);
				switchStatement();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(609);
				breakStatement();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(610);
				continueStatement();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(611);
				returnStatement();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(612);
				yieldExpression();
				setState(613);
				match(SemiColon);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(615);
				globalStatement();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(616);
				staticVariableStatement();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(617);
				echoStatement();
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(618);
				expressionStatement();
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(619);
				unsetStatement();
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(620);
				foreachStatement();
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(621);
				tryCatchFinally();
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(622);
				throwStatement();
				}
				break;
			case 20:
				enterOuterAlt(_localctx, 20);
				{
				setState(623);
				gotoStatement();
				}
				break;
			case 21:
				enterOuterAlt(_localctx, 21);
				{
				setState(624);
				declareStatement();
				}
				break;
			case 22:
				enterOuterAlt(_localctx, 22);
				{
				setState(625);
				emptyStatement();
				}
				break;
			case 23:
				enterOuterAlt(_localctx, 23);
				{
				setState(626);
				inlineHtmlStatement();
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

	public static class EmptyStatementContext extends ParserRuleContext {
		public TerminalNode SemiColon() { return getToken(PhpParser.SemiColon, 0); }
		public EmptyStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_emptyStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).enterEmptyStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).exitEmptyStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PhpParserVisitor ) return ((PhpParserVisitor<? extends T>)visitor).visitEmptyStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EmptyStatementContext emptyStatement() throws RecognitionException {
		EmptyStatementContext _localctx = new EmptyStatementContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_emptyStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(629);
			match(SemiColon);
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
		public TerminalNode OpenCurlyBracket() { return getToken(PhpParser.OpenCurlyBracket, 0); }
		public InnerStatementListContext innerStatementList() {
			return getRuleContext(InnerStatementListContext.class,0);
		}
		public TerminalNode CloseCurlyBracket() { return getToken(PhpParser.CloseCurlyBracket, 0); }
		public BlockStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).enterBlockStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).exitBlockStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PhpParserVisitor ) return ((PhpParserVisitor<? extends T>)visitor).visitBlockStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockStatementContext blockStatement() throws RecognitionException {
		BlockStatementContext _localctx = new BlockStatementContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_blockStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(631);
			match(OpenCurlyBracket);
			setState(632);
			innerStatementList();
			setState(633);
			match(CloseCurlyBracket);
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
		public TerminalNode If() { return getToken(PhpParser.If, 0); }
		public ParenthesesContext parentheses() {
			return getRuleContext(ParenthesesContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public List<ElseIfStatementContext> elseIfStatement() {
			return getRuleContexts(ElseIfStatementContext.class);
		}
		public ElseIfStatementContext elseIfStatement(int i) {
			return getRuleContext(ElseIfStatementContext.class,i);
		}
		public ElseStatementContext elseStatement() {
			return getRuleContext(ElseStatementContext.class,0);
		}
		public TerminalNode Colon() { return getToken(PhpParser.Colon, 0); }
		public InnerStatementListContext innerStatementList() {
			return getRuleContext(InnerStatementListContext.class,0);
		}
		public TerminalNode EndIf() { return getToken(PhpParser.EndIf, 0); }
		public TerminalNode SemiColon() { return getToken(PhpParser.SemiColon, 0); }
		public List<ElseIfColonStatementContext> elseIfColonStatement() {
			return getRuleContexts(ElseIfColonStatementContext.class);
		}
		public ElseIfColonStatementContext elseIfColonStatement(int i) {
			return getRuleContext(ElseIfColonStatementContext.class,i);
		}
		public ElseColonStatementContext elseColonStatement() {
			return getRuleContext(ElseColonStatementContext.class,0);
		}
		public IfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).enterIfStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).exitIfStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PhpParserVisitor ) return ((PhpParserVisitor<? extends T>)visitor).visitIfStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_ifStatement);
		int _la;
		try {
			int _alt;
			setState(663);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(635);
				match(If);
				setState(636);
				parentheses();
				setState(637);
				statement();
				setState(641);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,47,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(638);
						elseIfStatement();
						}
						} 
					}
					setState(643);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,47,_ctx);
				}
				setState(645);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
				case 1:
					{
					setState(644);
					elseStatement();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(647);
				match(If);
				setState(648);
				parentheses();
				setState(649);
				match(Colon);
				setState(650);
				innerStatementList();
				setState(654);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ElseIf) {
					{
					{
					setState(651);
					elseIfColonStatement();
					}
					}
					setState(656);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(658);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Else) {
					{
					setState(657);
					elseColonStatement();
					}
				}

				setState(660);
				match(EndIf);
				setState(661);
				match(SemiColon);
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

	public static class ElseIfStatementContext extends ParserRuleContext {
		public TerminalNode ElseIf() { return getToken(PhpParser.ElseIf, 0); }
		public ParenthesesContext parentheses() {
			return getRuleContext(ParenthesesContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public ElseIfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseIfStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).enterElseIfStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).exitElseIfStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PhpParserVisitor ) return ((PhpParserVisitor<? extends T>)visitor).visitElseIfStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElseIfStatementContext elseIfStatement() throws RecognitionException {
		ElseIfStatementContext _localctx = new ElseIfStatementContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_elseIfStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(665);
			match(ElseIf);
			setState(666);
			parentheses();
			setState(667);
			statement();
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

	public static class ElseIfColonStatementContext extends ParserRuleContext {
		public TerminalNode ElseIf() { return getToken(PhpParser.ElseIf, 0); }
		public ParenthesesContext parentheses() {
			return getRuleContext(ParenthesesContext.class,0);
		}
		public TerminalNode Colon() { return getToken(PhpParser.Colon, 0); }
		public InnerStatementListContext innerStatementList() {
			return getRuleContext(InnerStatementListContext.class,0);
		}
		public ElseIfColonStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseIfColonStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).enterElseIfColonStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).exitElseIfColonStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PhpParserVisitor ) return ((PhpParserVisitor<? extends T>)visitor).visitElseIfColonStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElseIfColonStatementContext elseIfColonStatement() throws RecognitionException {
		ElseIfColonStatementContext _localctx = new ElseIfColonStatementContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_elseIfColonStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(669);
			match(ElseIf);
			setState(670);
			parentheses();
			setState(671);
			match(Colon);
			setState(672);
			innerStatementList();
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

	public static class ElseStatementContext extends ParserRuleContext {
		public TerminalNode Else() { return getToken(PhpParser.Else, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public ElseStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).enterElseStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).exitElseStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PhpParserVisitor ) return ((PhpParserVisitor<? extends T>)visitor).visitElseStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElseStatementContext elseStatement() throws RecognitionException {
		ElseStatementContext _localctx = new ElseStatementContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_elseStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(674);
			match(Else);
			setState(675);
			statement();
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

	public static class ElseColonStatementContext extends ParserRuleContext {
		public TerminalNode Else() { return getToken(PhpParser.Else, 0); }
		public TerminalNode Colon() { return getToken(PhpParser.Colon, 0); }
		public InnerStatementListContext innerStatementList() {
			return getRuleContext(InnerStatementListContext.class,0);
		}
		public ElseColonStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseColonStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).enterElseColonStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).exitElseColonStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PhpParserVisitor ) return ((PhpParserVisitor<? extends T>)visitor).visitElseColonStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElseColonStatementContext elseColonStatement() throws RecognitionException {
		ElseColonStatementContext _localctx = new ElseColonStatementContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_elseColonStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(677);
			match(Else);
			setState(678);
			match(Colon);
			setState(679);
			innerStatementList();
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

	public static class WhileStatementContext extends ParserRuleContext {
		public TerminalNode While() { return getToken(PhpParser.While, 0); }
		public ParenthesesContext parentheses() {
			return getRuleContext(ParenthesesContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode Colon() { return getToken(PhpParser.Colon, 0); }
		public InnerStatementListContext innerStatementList() {
			return getRuleContext(InnerStatementListContext.class,0);
		}
		public TerminalNode EndWhile() { return getToken(PhpParser.EndWhile, 0); }
		public TerminalNode SemiColon() { return getToken(PhpParser.SemiColon, 0); }
		public WhileStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).enterWhileStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).exitWhileStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PhpParserVisitor ) return ((PhpParserVisitor<? extends T>)visitor).visitWhileStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileStatementContext whileStatement() throws RecognitionException {
		WhileStatementContext _localctx = new WhileStatementContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_whileStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(681);
			match(While);
			setState(682);
			parentheses();
			setState(689);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case HtmlText:
			case XmlStart:
			case HtmlScriptOpen:
			case HtmlStyleOpen:
			case HtmlDtd:
			case HtmlOpen:
			case HtmlClose:
			case HtmlSlashClose:
			case HtmlSlash:
			case HtmlEquals:
			case HtmlStartQuoteString:
			case HtmlStartDoubleQuoteString:
			case HtmlHex:
			case HtmlDecimal:
			case HtmlName:
			case HtmlEndQuoteString:
			case HtmlQuoteString:
			case HtmlEndDoubleQuoteString:
			case HtmlDoubleQuoteString:
			case ScriptText:
			case ScriptClose:
			case StyleBody:
			case Abstract:
			case Array:
			case As:
			case BinaryCast:
			case BoolType:
			case BooleanConstant:
			case Break:
			case Callable:
			case Case:
			case Catch:
			case Class:
			case Clone:
			case Const:
			case Continue:
			case Declare:
			case Default:
			case Do:
			case DoubleCast:
			case DoubleType:
			case Echo:
			case Else:
			case ElseIf:
			case Empty:
			case EndDeclare:
			case EndFor:
			case EndForeach:
			case EndIf:
			case EndSwitch:
			case EndWhile:
			case Eval:
			case Exit:
			case Extends:
			case Final:
			case Finally:
			case FloatCast:
			case For:
			case Foreach:
			case Function:
			case Global:
			case Goto:
			case If:
			case Implements:
			case Import:
			case Include:
			case IncludeOnce:
			case InstanceOf:
			case InsteadOf:
			case Int8Cast:
			case Int16Cast:
			case Int64Type:
			case IntType:
			case Interface:
			case IsSet:
			case List:
			case LogicalAnd:
			case LogicalOr:
			case LogicalXor:
			case Namespace:
			case New:
			case Null:
			case ObjectType:
			case Parent_:
			case Partial:
			case Print:
			case Private:
			case Protected:
			case Public:
			case Require:
			case RequireOnce:
			case Resource:
			case Return:
			case Static:
			case StringType:
			case Switch:
			case Throw:
			case Trait:
			case Try:
			case Typeof:
			case UintCast:
			case UnicodeCast:
			case Unset:
			case Use:
			case Var:
			case While:
			case Yield:
			case From:
			case LambdaFn:
			case Get:
			case Set:
			case Call:
			case CallStatic:
			case Constructor:
			case Destruct:
			case Wakeup:
			case Sleep:
			case Autoload:
			case IsSet__:
			case Unset__:
			case ToString__:
			case Invoke:
			case SetState:
			case Clone__:
			case DebugInfo:
			case Namespace__:
			case Class__:
			case Traic__:
			case Function__:
			case Method__:
			case Line__:
			case File__:
			case Dir__:
			case Inc:
			case Dec:
			case NamespaceSeparator:
			case Bang:
			case Plus:
			case Minus:
			case Tilde:
			case SuppressWarnings:
			case Dollar:
			case OpenRoundBracket:
			case OpenSquareBracket:
			case OpenCurlyBracket:
			case SemiColon:
			case VarName:
			case Label:
			case Octal:
			case Decimal:
			case Real:
			case Hex:
			case Binary:
			case BackQuoteString:
			case SingleQuoteString:
			case DoubleQuote:
			case StartNowDoc:
			case StartHereDoc:
				{
				setState(683);
				statement();
				}
				break;
			case Colon:
				{
				setState(684);
				match(Colon);
				setState(685);
				innerStatementList();
				setState(686);
				match(EndWhile);
				setState(687);
				match(SemiColon);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class DoWhileStatementContext extends ParserRuleContext {
		public TerminalNode Do() { return getToken(PhpParser.Do, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode While() { return getToken(PhpParser.While, 0); }
		public ParenthesesContext parentheses() {
			return getRuleContext(ParenthesesContext.class,0);
		}
		public TerminalNode SemiColon() { return getToken(PhpParser.SemiColon, 0); }
		public DoWhileStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_doWhileStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).enterDoWhileStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).exitDoWhileStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PhpParserVisitor ) return ((PhpParserVisitor<? extends T>)visitor).visitDoWhileStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DoWhileStatementContext doWhileStatement() throws RecognitionException {
		DoWhileStatementContext _localctx = new DoWhileStatementContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_doWhileStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(691);
			match(Do);
			setState(692);
			statement();
			setState(693);
			match(While);
			setState(694);
			parentheses();
			setState(695);
			match(SemiColon);
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

	public static class ForStatementContext extends ParserRuleContext {
		public TerminalNode For() { return getToken(PhpParser.For, 0); }
		public TerminalNode OpenRoundBracket() { return getToken(PhpParser.OpenRoundBracket, 0); }
		public List<TerminalNode> SemiColon() { return getTokens(PhpParser.SemiColon); }
		public TerminalNode SemiColon(int i) {
			return getToken(PhpParser.SemiColon, i);
		}
		public TerminalNode CloseRoundBracket() { return getToken(PhpParser.CloseRoundBracket, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode Colon() { return getToken(PhpParser.Colon, 0); }
		public InnerStatementListContext innerStatementList() {
			return getRuleContext(InnerStatementListContext.class,0);
		}
		public TerminalNode EndFor() { return getToken(PhpParser.EndFor, 0); }
		public ForInitContext forInit() {
			return getRuleContext(ForInitContext.class,0);
		}
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public ForUpdateContext forUpdate() {
			return getRuleContext(ForUpdateContext.class,0);
		}
		public ForStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).enterForStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).exitForStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PhpParserVisitor ) return ((PhpParserVisitor<? extends T>)visitor).visitForStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForStatementContext forStatement() throws RecognitionException {
		ForStatementContext _localctx = new ForStatementContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_forStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(697);
			match(For);
			setState(698);
			match(OpenRoundBracket);
			setState(700);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 44)) & ~0x3f) == 0 && ((1L << (_la - 44)) & ((1L << (Abstract - 44)) | (1L << (Array - 44)) | (1L << (As - 44)) | (1L << (BinaryCast - 44)) | (1L << (BoolType - 44)) | (1L << (BooleanConstant - 44)) | (1L << (Break - 44)) | (1L << (Callable - 44)) | (1L << (Case - 44)) | (1L << (Catch - 44)) | (1L << (Class - 44)) | (1L << (Clone - 44)) | (1L << (Const - 44)) | (1L << (Continue - 44)) | (1L << (Declare - 44)) | (1L << (Default - 44)) | (1L << (Do - 44)) | (1L << (DoubleCast - 44)) | (1L << (DoubleType - 44)) | (1L << (Echo - 44)) | (1L << (Else - 44)) | (1L << (ElseIf - 44)) | (1L << (Empty - 44)) | (1L << (EndDeclare - 44)) | (1L << (EndFor - 44)) | (1L << (EndForeach - 44)) | (1L << (EndIf - 44)) | (1L << (EndSwitch - 44)) | (1L << (EndWhile - 44)) | (1L << (Eval - 44)) | (1L << (Exit - 44)) | (1L << (Extends - 44)) | (1L << (Final - 44)) | (1L << (Finally - 44)) | (1L << (FloatCast - 44)) | (1L << (For - 44)) | (1L << (Foreach - 44)) | (1L << (Function - 44)) | (1L << (Global - 44)) | (1L << (Goto - 44)) | (1L << (If - 44)) | (1L << (Implements - 44)) | (1L << (Import - 44)) | (1L << (Include - 44)) | (1L << (IncludeOnce - 44)) | (1L << (InstanceOf - 44)) | (1L << (InsteadOf - 44)) | (1L << (Int8Cast - 44)) | (1L << (Int16Cast - 44)) | (1L << (Int64Type - 44)) | (1L << (IntType - 44)) | (1L << (Interface - 44)) | (1L << (IsSet - 44)) | (1L << (List - 44)) | (1L << (LogicalAnd - 44)) | (1L << (LogicalOr - 44)) | (1L << (LogicalXor - 44)) | (1L << (Namespace - 44)) | (1L << (New - 44)) | (1L << (Null - 44)) | (1L << (ObjectType - 44)) | (1L << (Parent_ - 44)) | (1L << (Partial - 44)) | (1L << (Print - 44)))) != 0) || ((((_la - 108)) & ~0x3f) == 0 && ((1L << (_la - 108)) & ((1L << (Private - 108)) | (1L << (Protected - 108)) | (1L << (Public - 108)) | (1L << (Require - 108)) | (1L << (RequireOnce - 108)) | (1L << (Resource - 108)) | (1L << (Return - 108)) | (1L << (Static - 108)) | (1L << (StringType - 108)) | (1L << (Switch - 108)) | (1L << (Throw - 108)) | (1L << (Trait - 108)) | (1L << (Try - 108)) | (1L << (Typeof - 108)) | (1L << (UintCast - 108)) | (1L << (UnicodeCast - 108)) | (1L << (Unset - 108)) | (1L << (Use - 108)) | (1L << (Var - 108)) | (1L << (While - 108)) | (1L << (Yield - 108)) | (1L << (From - 108)) | (1L << (LambdaFn - 108)) | (1L << (Get - 108)) | (1L << (Set - 108)) | (1L << (Call - 108)) | (1L << (CallStatic - 108)) | (1L << (Constructor - 108)) | (1L << (Destruct - 108)) | (1L << (Wakeup - 108)) | (1L << (Sleep - 108)) | (1L << (Autoload - 108)) | (1L << (IsSet__ - 108)) | (1L << (Unset__ - 108)) | (1L << (ToString__ - 108)) | (1L << (Invoke - 108)) | (1L << (SetState - 108)) | (1L << (Clone__ - 108)) | (1L << (DebugInfo - 108)) | (1L << (Namespace__ - 108)) | (1L << (Class__ - 108)) | (1L << (Traic__ - 108)) | (1L << (Function__ - 108)) | (1L << (Method__ - 108)) | (1L << (Line__ - 108)) | (1L << (File__ - 108)) | (1L << (Dir__ - 108)) | (1L << (Inc - 108)) | (1L << (Dec - 108)))) != 0) || ((((_la - 188)) & ~0x3f) == 0 && ((1L << (_la - 188)) & ((1L << (NamespaceSeparator - 188)) | (1L << (Bang - 188)) | (1L << (Plus - 188)) | (1L << (Minus - 188)) | (1L << (Tilde - 188)) | (1L << (SuppressWarnings - 188)) | (1L << (Dollar - 188)) | (1L << (OpenRoundBracket - 188)) | (1L << (OpenSquareBracket - 188)) | (1L << (VarName - 188)) | (1L << (Label - 188)) | (1L << (Octal - 188)) | (1L << (Decimal - 188)) | (1L << (Real - 188)) | (1L << (Hex - 188)) | (1L << (Binary - 188)) | (1L << (BackQuoteString - 188)) | (1L << (SingleQuoteString - 188)) | (1L << (DoubleQuote - 188)) | (1L << (StartNowDoc - 188)) | (1L << (StartHereDoc - 188)))) != 0)) {
				{
				setState(699);
				forInit();
				}
			}

			setState(702);
			match(SemiColon);
			setState(704);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 44)) & ~0x3f) == 0 && ((1L << (_la - 44)) & ((1L << (Abstract - 44)) | (1L << (Array - 44)) | (1L << (As - 44)) | (1L << (BinaryCast - 44)) | (1L << (BoolType - 44)) | (1L << (BooleanConstant - 44)) | (1L << (Break - 44)) | (1L << (Callable - 44)) | (1L << (Case - 44)) | (1L << (Catch - 44)) | (1L << (Class - 44)) | (1L << (Clone - 44)) | (1L << (Const - 44)) | (1L << (Continue - 44)) | (1L << (Declare - 44)) | (1L << (Default - 44)) | (1L << (Do - 44)) | (1L << (DoubleCast - 44)) | (1L << (DoubleType - 44)) | (1L << (Echo - 44)) | (1L << (Else - 44)) | (1L << (ElseIf - 44)) | (1L << (Empty - 44)) | (1L << (EndDeclare - 44)) | (1L << (EndFor - 44)) | (1L << (EndForeach - 44)) | (1L << (EndIf - 44)) | (1L << (EndSwitch - 44)) | (1L << (EndWhile - 44)) | (1L << (Eval - 44)) | (1L << (Exit - 44)) | (1L << (Extends - 44)) | (1L << (Final - 44)) | (1L << (Finally - 44)) | (1L << (FloatCast - 44)) | (1L << (For - 44)) | (1L << (Foreach - 44)) | (1L << (Function - 44)) | (1L << (Global - 44)) | (1L << (Goto - 44)) | (1L << (If - 44)) | (1L << (Implements - 44)) | (1L << (Import - 44)) | (1L << (Include - 44)) | (1L << (IncludeOnce - 44)) | (1L << (InstanceOf - 44)) | (1L << (InsteadOf - 44)) | (1L << (Int8Cast - 44)) | (1L << (Int16Cast - 44)) | (1L << (Int64Type - 44)) | (1L << (IntType - 44)) | (1L << (Interface - 44)) | (1L << (IsSet - 44)) | (1L << (List - 44)) | (1L << (LogicalAnd - 44)) | (1L << (LogicalOr - 44)) | (1L << (LogicalXor - 44)) | (1L << (Namespace - 44)) | (1L << (New - 44)) | (1L << (Null - 44)) | (1L << (ObjectType - 44)) | (1L << (Parent_ - 44)) | (1L << (Partial - 44)) | (1L << (Print - 44)))) != 0) || ((((_la - 108)) & ~0x3f) == 0 && ((1L << (_la - 108)) & ((1L << (Private - 108)) | (1L << (Protected - 108)) | (1L << (Public - 108)) | (1L << (Require - 108)) | (1L << (RequireOnce - 108)) | (1L << (Resource - 108)) | (1L << (Return - 108)) | (1L << (Static - 108)) | (1L << (StringType - 108)) | (1L << (Switch - 108)) | (1L << (Throw - 108)) | (1L << (Trait - 108)) | (1L << (Try - 108)) | (1L << (Typeof - 108)) | (1L << (UintCast - 108)) | (1L << (UnicodeCast - 108)) | (1L << (Unset - 108)) | (1L << (Use - 108)) | (1L << (Var - 108)) | (1L << (While - 108)) | (1L << (Yield - 108)) | (1L << (From - 108)) | (1L << (LambdaFn - 108)) | (1L << (Get - 108)) | (1L << (Set - 108)) | (1L << (Call - 108)) | (1L << (CallStatic - 108)) | (1L << (Constructor - 108)) | (1L << (Destruct - 108)) | (1L << (Wakeup - 108)) | (1L << (Sleep - 108)) | (1L << (Autoload - 108)) | (1L << (IsSet__ - 108)) | (1L << (Unset__ - 108)) | (1L << (ToString__ - 108)) | (1L << (Invoke - 108)) | (1L << (SetState - 108)) | (1L << (Clone__ - 108)) | (1L << (DebugInfo - 108)) | (1L << (Namespace__ - 108)) | (1L << (Class__ - 108)) | (1L << (Traic__ - 108)) | (1L << (Function__ - 108)) | (1L << (Method__ - 108)) | (1L << (Line__ - 108)) | (1L << (File__ - 108)) | (1L << (Dir__ - 108)) | (1L << (Inc - 108)) | (1L << (Dec - 108)))) != 0) || ((((_la - 188)) & ~0x3f) == 0 && ((1L << (_la - 188)) & ((1L << (NamespaceSeparator - 188)) | (1L << (Bang - 188)) | (1L << (Plus - 188)) | (1L << (Minus - 188)) | (1L << (Tilde - 188)) | (1L << (SuppressWarnings - 188)) | (1L << (Dollar - 188)) | (1L << (OpenRoundBracket - 188)) | (1L << (OpenSquareBracket - 188)) | (1L << (VarName - 188)) | (1L << (Label - 188)) | (1L << (Octal - 188)) | (1L << (Decimal - 188)) | (1L << (Real - 188)) | (1L << (Hex - 188)) | (1L << (Binary - 188)) | (1L << (BackQuoteString - 188)) | (1L << (SingleQuoteString - 188)) | (1L << (DoubleQuote - 188)) | (1L << (StartNowDoc - 188)) | (1L << (StartHereDoc - 188)))) != 0)) {
				{
				setState(703);
				expressionList();
				}
			}

			setState(706);
			match(SemiColon);
			setState(708);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 44)) & ~0x3f) == 0 && ((1L << (_la - 44)) & ((1L << (Abstract - 44)) | (1L << (Array - 44)) | (1L << (As - 44)) | (1L << (BinaryCast - 44)) | (1L << (BoolType - 44)) | (1L << (BooleanConstant - 44)) | (1L << (Break - 44)) | (1L << (Callable - 44)) | (1L << (Case - 44)) | (1L << (Catch - 44)) | (1L << (Class - 44)) | (1L << (Clone - 44)) | (1L << (Const - 44)) | (1L << (Continue - 44)) | (1L << (Declare - 44)) | (1L << (Default - 44)) | (1L << (Do - 44)) | (1L << (DoubleCast - 44)) | (1L << (DoubleType - 44)) | (1L << (Echo - 44)) | (1L << (Else - 44)) | (1L << (ElseIf - 44)) | (1L << (Empty - 44)) | (1L << (EndDeclare - 44)) | (1L << (EndFor - 44)) | (1L << (EndForeach - 44)) | (1L << (EndIf - 44)) | (1L << (EndSwitch - 44)) | (1L << (EndWhile - 44)) | (1L << (Eval - 44)) | (1L << (Exit - 44)) | (1L << (Extends - 44)) | (1L << (Final - 44)) | (1L << (Finally - 44)) | (1L << (FloatCast - 44)) | (1L << (For - 44)) | (1L << (Foreach - 44)) | (1L << (Function - 44)) | (1L << (Global - 44)) | (1L << (Goto - 44)) | (1L << (If - 44)) | (1L << (Implements - 44)) | (1L << (Import - 44)) | (1L << (Include - 44)) | (1L << (IncludeOnce - 44)) | (1L << (InstanceOf - 44)) | (1L << (InsteadOf - 44)) | (1L << (Int8Cast - 44)) | (1L << (Int16Cast - 44)) | (1L << (Int64Type - 44)) | (1L << (IntType - 44)) | (1L << (Interface - 44)) | (1L << (IsSet - 44)) | (1L << (List - 44)) | (1L << (LogicalAnd - 44)) | (1L << (LogicalOr - 44)) | (1L << (LogicalXor - 44)) | (1L << (Namespace - 44)) | (1L << (New - 44)) | (1L << (Null - 44)) | (1L << (ObjectType - 44)) | (1L << (Parent_ - 44)) | (1L << (Partial - 44)) | (1L << (Print - 44)))) != 0) || ((((_la - 108)) & ~0x3f) == 0 && ((1L << (_la - 108)) & ((1L << (Private - 108)) | (1L << (Protected - 108)) | (1L << (Public - 108)) | (1L << (Require - 108)) | (1L << (RequireOnce - 108)) | (1L << (Resource - 108)) | (1L << (Return - 108)) | (1L << (Static - 108)) | (1L << (StringType - 108)) | (1L << (Switch - 108)) | (1L << (Throw - 108)) | (1L << (Trait - 108)) | (1L << (Try - 108)) | (1L << (Typeof - 108)) | (1L << (UintCast - 108)) | (1L << (UnicodeCast - 108)) | (1L << (Unset - 108)) | (1L << (Use - 108)) | (1L << (Var - 108)) | (1L << (While - 108)) | (1L << (Yield - 108)) | (1L << (From - 108)) | (1L << (LambdaFn - 108)) | (1L << (Get - 108)) | (1L << (Set - 108)) | (1L << (Call - 108)) | (1L << (CallStatic - 108)) | (1L << (Constructor - 108)) | (1L << (Destruct - 108)) | (1L << (Wakeup - 108)) | (1L << (Sleep - 108)) | (1L << (Autoload - 108)) | (1L << (IsSet__ - 108)) | (1L << (Unset__ - 108)) | (1L << (ToString__ - 108)) | (1L << (Invoke - 108)) | (1L << (SetState - 108)) | (1L << (Clone__ - 108)) | (1L << (DebugInfo - 108)) | (1L << (Namespace__ - 108)) | (1L << (Class__ - 108)) | (1L << (Traic__ - 108)) | (1L << (Function__ - 108)) | (1L << (Method__ - 108)) | (1L << (Line__ - 108)) | (1L << (File__ - 108)) | (1L << (Dir__ - 108)) | (1L << (Inc - 108)) | (1L << (Dec - 108)))) != 0) || ((((_la - 188)) & ~0x3f) == 0 && ((1L << (_la - 188)) & ((1L << (NamespaceSeparator - 188)) | (1L << (Bang - 188)) | (1L << (Plus - 188)) | (1L << (Minus - 188)) | (1L << (Tilde - 188)) | (1L << (SuppressWarnings - 188)) | (1L << (Dollar - 188)) | (1L << (OpenRoundBracket - 188)) | (1L << (OpenSquareBracket - 188)) | (1L << (VarName - 188)) | (1L << (Label - 188)) | (1L << (Octal - 188)) | (1L << (Decimal - 188)) | (1L << (Real - 188)) | (1L << (Hex - 188)) | (1L << (Binary - 188)) | (1L << (BackQuoteString - 188)) | (1L << (SingleQuoteString - 188)) | (1L << (DoubleQuote - 188)) | (1L << (StartNowDoc - 188)) | (1L << (StartHereDoc - 188)))) != 0)) {
				{
				setState(707);
				forUpdate();
				}
			}

			setState(710);
			match(CloseRoundBracket);
			setState(717);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case HtmlText:
			case XmlStart:
			case HtmlScriptOpen:
			case HtmlStyleOpen:
			case HtmlDtd:
			case HtmlOpen:
			case HtmlClose:
			case HtmlSlashClose:
			case HtmlSlash:
			case HtmlEquals:
			case HtmlStartQuoteString:
			case HtmlStartDoubleQuoteString:
			case HtmlHex:
			case HtmlDecimal:
			case HtmlName:
			case HtmlEndQuoteString:
			case HtmlQuoteString:
			case HtmlEndDoubleQuoteString:
			case HtmlDoubleQuoteString:
			case ScriptText:
			case ScriptClose:
			case StyleBody:
			case Abstract:
			case Array:
			case As:
			case BinaryCast:
			case BoolType:
			case BooleanConstant:
			case Break:
			case Callable:
			case Case:
			case Catch:
			case Class:
			case Clone:
			case Const:
			case Continue:
			case Declare:
			case Default:
			case Do:
			case DoubleCast:
			case DoubleType:
			case Echo:
			case Else:
			case ElseIf:
			case Empty:
			case EndDeclare:
			case EndFor:
			case EndForeach:
			case EndIf:
			case EndSwitch:
			case EndWhile:
			case Eval:
			case Exit:
			case Extends:
			case Final:
			case Finally:
			case FloatCast:
			case For:
			case Foreach:
			case Function:
			case Global:
			case Goto:
			case If:
			case Implements:
			case Import:
			case Include:
			case IncludeOnce:
			case InstanceOf:
			case InsteadOf:
			case Int8Cast:
			case Int16Cast:
			case Int64Type:
			case IntType:
			case Interface:
			case IsSet:
			case List:
			case LogicalAnd:
			case LogicalOr:
			case LogicalXor:
			case Namespace:
			case New:
			case Null:
			case ObjectType:
			case Parent_:
			case Partial:
			case Print:
			case Private:
			case Protected:
			case Public:
			case Require:
			case RequireOnce:
			case Resource:
			case Return:
			case Static:
			case StringType:
			case Switch:
			case Throw:
			case Trait:
			case Try:
			case Typeof:
			case UintCast:
			case UnicodeCast:
			case Unset:
			case Use:
			case Var:
			case While:
			case Yield:
			case From:
			case LambdaFn:
			case Get:
			case Set:
			case Call:
			case CallStatic:
			case Constructor:
			case Destruct:
			case Wakeup:
			case Sleep:
			case Autoload:
			case IsSet__:
			case Unset__:
			case ToString__:
			case Invoke:
			case SetState:
			case Clone__:
			case DebugInfo:
			case Namespace__:
			case Class__:
			case Traic__:
			case Function__:
			case Method__:
			case Line__:
			case File__:
			case Dir__:
			case Inc:
			case Dec:
			case NamespaceSeparator:
			case Bang:
			case Plus:
			case Minus:
			case Tilde:
			case SuppressWarnings:
			case Dollar:
			case OpenRoundBracket:
			case OpenSquareBracket:
			case OpenCurlyBracket:
			case SemiColon:
			case VarName:
			case Label:
			case Octal:
			case Decimal:
			case Real:
			case Hex:
			case Binary:
			case BackQuoteString:
			case SingleQuoteString:
			case DoubleQuote:
			case StartNowDoc:
			case StartHereDoc:
				{
				setState(711);
				statement();
				}
				break;
			case Colon:
				{
				setState(712);
				match(Colon);
				setState(713);
				innerStatementList();
				setState(714);
				match(EndFor);
				setState(715);
				match(SemiColon);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class ForInitContext extends ParserRuleContext {
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public ForInitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forInit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).enterForInit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).exitForInit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PhpParserVisitor ) return ((PhpParserVisitor<? extends T>)visitor).visitForInit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForInitContext forInit() throws RecognitionException {
		ForInitContext _localctx = new ForInitContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_forInit);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(719);
			expressionList();
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

	public static class ForUpdateContext extends ParserRuleContext {
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public ForUpdateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forUpdate; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).enterForUpdate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).exitForUpdate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PhpParserVisitor ) return ((PhpParserVisitor<? extends T>)visitor).visitForUpdate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForUpdateContext forUpdate() throws RecognitionException {
		ForUpdateContext _localctx = new ForUpdateContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_forUpdate);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(721);
			expressionList();
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

	public static class SwitchStatementContext extends ParserRuleContext {
		public TerminalNode Switch() { return getToken(PhpParser.Switch, 0); }
		public ParenthesesContext parentheses() {
			return getRuleContext(ParenthesesContext.class,0);
		}
		public TerminalNode OpenCurlyBracket() { return getToken(PhpParser.OpenCurlyBracket, 0); }
		public TerminalNode CloseCurlyBracket() { return getToken(PhpParser.CloseCurlyBracket, 0); }
		public TerminalNode Colon() { return getToken(PhpParser.Colon, 0); }
		public TerminalNode EndSwitch() { return getToken(PhpParser.EndSwitch, 0); }
		public List<TerminalNode> SemiColon() { return getTokens(PhpParser.SemiColon); }
		public TerminalNode SemiColon(int i) {
			return getToken(PhpParser.SemiColon, i);
		}
		public List<SwitchBlockContext> switchBlock() {
			return getRuleContexts(SwitchBlockContext.class);
		}
		public SwitchBlockContext switchBlock(int i) {
			return getRuleContext(SwitchBlockContext.class,i);
		}
		public SwitchStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).enterSwitchStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).exitSwitchStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PhpParserVisitor ) return ((PhpParserVisitor<? extends T>)visitor).visitSwitchStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SwitchStatementContext switchStatement() throws RecognitionException {
		SwitchStatementContext _localctx = new SwitchStatementContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_switchStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(723);
			match(Switch);
			setState(724);
			parentheses();
			setState(748);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OpenCurlyBracket:
				{
				setState(725);
				match(OpenCurlyBracket);
				setState(727);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SemiColon) {
					{
					setState(726);
					match(SemiColon);
					}
				}

				setState(732);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Case || _la==Default) {
					{
					{
					setState(729);
					switchBlock();
					}
					}
					setState(734);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(735);
				match(CloseCurlyBracket);
				}
				break;
			case Colon:
				{
				setState(736);
				match(Colon);
				setState(738);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SemiColon) {
					{
					setState(737);
					match(SemiColon);
					}
				}

				setState(743);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Case || _la==Default) {
					{
					{
					setState(740);
					switchBlock();
					}
					}
					setState(745);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(746);
				match(EndSwitch);
				setState(747);
				match(SemiColon);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class SwitchBlockContext extends ParserRuleContext {
		public InnerStatementListContext innerStatementList() {
			return getRuleContext(InnerStatementListContext.class,0);
		}
		public List<TerminalNode> Colon() { return getTokens(PhpParser.Colon); }
		public TerminalNode Colon(int i) {
			return getToken(PhpParser.Colon, i);
		}
		public List<TerminalNode> SemiColon() { return getTokens(PhpParser.SemiColon); }
		public TerminalNode SemiColon(int i) {
			return getToken(PhpParser.SemiColon, i);
		}
		public List<TerminalNode> Case() { return getTokens(PhpParser.Case); }
		public TerminalNode Case(int i) {
			return getToken(PhpParser.Case, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> Default() { return getTokens(PhpParser.Default); }
		public TerminalNode Default(int i) {
			return getToken(PhpParser.Default, i);
		}
		public SwitchBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).enterSwitchBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).exitSwitchBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PhpParserVisitor ) return ((PhpParserVisitor<? extends T>)visitor).visitSwitchBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SwitchBlockContext switchBlock() throws RecognitionException {
		SwitchBlockContext _localctx = new SwitchBlockContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_switchBlock);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(756); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(753);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case Case:
						{
						setState(750);
						match(Case);
						setState(751);
						expression(0);
						}
						break;
					case Default:
						{
						setState(752);
						match(Default);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(755);
					_la = _input.LA(1);
					if ( !(_la==Colon || _la==SemiColon) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(758); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,63,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(760);
			innerStatementList();
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

	public static class BreakStatementContext extends ParserRuleContext {
		public TerminalNode Break() { return getToken(PhpParser.Break, 0); }
		public TerminalNode SemiColon() { return getToken(PhpParser.SemiColon, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public BreakStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_breakStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).enterBreakStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).exitBreakStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PhpParserVisitor ) return ((PhpParserVisitor<? extends T>)visitor).visitBreakStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BreakStatementContext breakStatement() throws RecognitionException {
		BreakStatementContext _localctx = new BreakStatementContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_breakStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(762);
			match(Break);
			setState(764);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 44)) & ~0x3f) == 0 && ((1L << (_la - 44)) & ((1L << (Abstract - 44)) | (1L << (Array - 44)) | (1L << (As - 44)) | (1L << (BinaryCast - 44)) | (1L << (BoolType - 44)) | (1L << (BooleanConstant - 44)) | (1L << (Break - 44)) | (1L << (Callable - 44)) | (1L << (Case - 44)) | (1L << (Catch - 44)) | (1L << (Class - 44)) | (1L << (Clone - 44)) | (1L << (Const - 44)) | (1L << (Continue - 44)) | (1L << (Declare - 44)) | (1L << (Default - 44)) | (1L << (Do - 44)) | (1L << (DoubleCast - 44)) | (1L << (DoubleType - 44)) | (1L << (Echo - 44)) | (1L << (Else - 44)) | (1L << (ElseIf - 44)) | (1L << (Empty - 44)) | (1L << (EndDeclare - 44)) | (1L << (EndFor - 44)) | (1L << (EndForeach - 44)) | (1L << (EndIf - 44)) | (1L << (EndSwitch - 44)) | (1L << (EndWhile - 44)) | (1L << (Eval - 44)) | (1L << (Exit - 44)) | (1L << (Extends - 44)) | (1L << (Final - 44)) | (1L << (Finally - 44)) | (1L << (FloatCast - 44)) | (1L << (For - 44)) | (1L << (Foreach - 44)) | (1L << (Function - 44)) | (1L << (Global - 44)) | (1L << (Goto - 44)) | (1L << (If - 44)) | (1L << (Implements - 44)) | (1L << (Import - 44)) | (1L << (Include - 44)) | (1L << (IncludeOnce - 44)) | (1L << (InstanceOf - 44)) | (1L << (InsteadOf - 44)) | (1L << (Int8Cast - 44)) | (1L << (Int16Cast - 44)) | (1L << (Int64Type - 44)) | (1L << (IntType - 44)) | (1L << (Interface - 44)) | (1L << (IsSet - 44)) | (1L << (List - 44)) | (1L << (LogicalAnd - 44)) | (1L << (LogicalOr - 44)) | (1L << (LogicalXor - 44)) | (1L << (Namespace - 44)) | (1L << (New - 44)) | (1L << (Null - 44)) | (1L << (ObjectType - 44)) | (1L << (Parent_ - 44)) | (1L << (Partial - 44)) | (1L << (Print - 44)))) != 0) || ((((_la - 108)) & ~0x3f) == 0 && ((1L << (_la - 108)) & ((1L << (Private - 108)) | (1L << (Protected - 108)) | (1L << (Public - 108)) | (1L << (Require - 108)) | (1L << (RequireOnce - 108)) | (1L << (Resource - 108)) | (1L << (Return - 108)) | (1L << (Static - 108)) | (1L << (StringType - 108)) | (1L << (Switch - 108)) | (1L << (Throw - 108)) | (1L << (Trait - 108)) | (1L << (Try - 108)) | (1L << (Typeof - 108)) | (1L << (UintCast - 108)) | (1L << (UnicodeCast - 108)) | (1L << (Unset - 108)) | (1L << (Use - 108)) | (1L << (Var - 108)) | (1L << (While - 108)) | (1L << (Yield - 108)) | (1L << (From - 108)) | (1L << (LambdaFn - 108)) | (1L << (Get - 108)) | (1L << (Set - 108)) | (1L << (Call - 108)) | (1L << (CallStatic - 108)) | (1L << (Constructor - 108)) | (1L << (Destruct - 108)) | (1L << (Wakeup - 108)) | (1L << (Sleep - 108)) | (1L << (Autoload - 108)) | (1L << (IsSet__ - 108)) | (1L << (Unset__ - 108)) | (1L << (ToString__ - 108)) | (1L << (Invoke - 108)) | (1L << (SetState - 108)) | (1L << (Clone__ - 108)) | (1L << (DebugInfo - 108)) | (1L << (Namespace__ - 108)) | (1L << (Class__ - 108)) | (1L << (Traic__ - 108)) | (1L << (Function__ - 108)) | (1L << (Method__ - 108)) | (1L << (Line__ - 108)) | (1L << (File__ - 108)) | (1L << (Dir__ - 108)) | (1L << (Inc - 108)) | (1L << (Dec - 108)))) != 0) || ((((_la - 188)) & ~0x3f) == 0 && ((1L << (_la - 188)) & ((1L << (NamespaceSeparator - 188)) | (1L << (Bang - 188)) | (1L << (Plus - 188)) | (1L << (Minus - 188)) | (1L << (Tilde - 188)) | (1L << (SuppressWarnings - 188)) | (1L << (Dollar - 188)) | (1L << (OpenRoundBracket - 188)) | (1L << (OpenSquareBracket - 188)) | (1L << (VarName - 188)) | (1L << (Label - 188)) | (1L << (Octal - 188)) | (1L << (Decimal - 188)) | (1L << (Real - 188)) | (1L << (Hex - 188)) | (1L << (Binary - 188)) | (1L << (BackQuoteString - 188)) | (1L << (SingleQuoteString - 188)) | (1L << (DoubleQuote - 188)) | (1L << (StartNowDoc - 188)) | (1L << (StartHereDoc - 188)))) != 0)) {
				{
				setState(763);
				expression(0);
				}
			}

			setState(766);
			match(SemiColon);
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

	public static class ContinueStatementContext extends ParserRuleContext {
		public TerminalNode Continue() { return getToken(PhpParser.Continue, 0); }
		public TerminalNode SemiColon() { return getToken(PhpParser.SemiColon, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ContinueStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_continueStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).enterContinueStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).exitContinueStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PhpParserVisitor ) return ((PhpParserVisitor<? extends T>)visitor).visitContinueStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ContinueStatementContext continueStatement() throws RecognitionException {
		ContinueStatementContext _localctx = new ContinueStatementContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_continueStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(768);
			match(Continue);
			setState(770);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 44)) & ~0x3f) == 0 && ((1L << (_la - 44)) & ((1L << (Abstract - 44)) | (1L << (Array - 44)) | (1L << (As - 44)) | (1L << (BinaryCast - 44)) | (1L << (BoolType - 44)) | (1L << (BooleanConstant - 44)) | (1L << (Break - 44)) | (1L << (Callable - 44)) | (1L << (Case - 44)) | (1L << (Catch - 44)) | (1L << (Class - 44)) | (1L << (Clone - 44)) | (1L << (Const - 44)) | (1L << (Continue - 44)) | (1L << (Declare - 44)) | (1L << (Default - 44)) | (1L << (Do - 44)) | (1L << (DoubleCast - 44)) | (1L << (DoubleType - 44)) | (1L << (Echo - 44)) | (1L << (Else - 44)) | (1L << (ElseIf - 44)) | (1L << (Empty - 44)) | (1L << (EndDeclare - 44)) | (1L << (EndFor - 44)) | (1L << (EndForeach - 44)) | (1L << (EndIf - 44)) | (1L << (EndSwitch - 44)) | (1L << (EndWhile - 44)) | (1L << (Eval - 44)) | (1L << (Exit - 44)) | (1L << (Extends - 44)) | (1L << (Final - 44)) | (1L << (Finally - 44)) | (1L << (FloatCast - 44)) | (1L << (For - 44)) | (1L << (Foreach - 44)) | (1L << (Function - 44)) | (1L << (Global - 44)) | (1L << (Goto - 44)) | (1L << (If - 44)) | (1L << (Implements - 44)) | (1L << (Import - 44)) | (1L << (Include - 44)) | (1L << (IncludeOnce - 44)) | (1L << (InstanceOf - 44)) | (1L << (InsteadOf - 44)) | (1L << (Int8Cast - 44)) | (1L << (Int16Cast - 44)) | (1L << (Int64Type - 44)) | (1L << (IntType - 44)) | (1L << (Interface - 44)) | (1L << (IsSet - 44)) | (1L << (List - 44)) | (1L << (LogicalAnd - 44)) | (1L << (LogicalOr - 44)) | (1L << (LogicalXor - 44)) | (1L << (Namespace - 44)) | (1L << (New - 44)) | (1L << (Null - 44)) | (1L << (ObjectType - 44)) | (1L << (Parent_ - 44)) | (1L << (Partial - 44)) | (1L << (Print - 44)))) != 0) || ((((_la - 108)) & ~0x3f) == 0 && ((1L << (_la - 108)) & ((1L << (Private - 108)) | (1L << (Protected - 108)) | (1L << (Public - 108)) | (1L << (Require - 108)) | (1L << (RequireOnce - 108)) | (1L << (Resource - 108)) | (1L << (Return - 108)) | (1L << (Static - 108)) | (1L << (StringType - 108)) | (1L << (Switch - 108)) | (1L << (Throw - 108)) | (1L << (Trait - 108)) | (1L << (Try - 108)) | (1L << (Typeof - 108)) | (1L << (UintCast - 108)) | (1L << (UnicodeCast - 108)) | (1L << (Unset - 108)) | (1L << (Use - 108)) | (1L << (Var - 108)) | (1L << (While - 108)) | (1L << (Yield - 108)) | (1L << (From - 108)) | (1L << (LambdaFn - 108)) | (1L << (Get - 108)) | (1L << (Set - 108)) | (1L << (Call - 108)) | (1L << (CallStatic - 108)) | (1L << (Constructor - 108)) | (1L << (Destruct - 108)) | (1L << (Wakeup - 108)) | (1L << (Sleep - 108)) | (1L << (Autoload - 108)) | (1L << (IsSet__ - 108)) | (1L << (Unset__ - 108)) | (1L << (ToString__ - 108)) | (1L << (Invoke - 108)) | (1L << (SetState - 108)) | (1L << (Clone__ - 108)) | (1L << (DebugInfo - 108)) | (1L << (Namespace__ - 108)) | (1L << (Class__ - 108)) | (1L << (Traic__ - 108)) | (1L << (Function__ - 108)) | (1L << (Method__ - 108)) | (1L << (Line__ - 108)) | (1L << (File__ - 108)) | (1L << (Dir__ - 108)) | (1L << (Inc - 108)) | (1L << (Dec - 108)))) != 0) || ((((_la - 188)) & ~0x3f) == 0 && ((1L << (_la - 188)) & ((1L << (NamespaceSeparator - 188)) | (1L << (Bang - 188)) | (1L << (Plus - 188)) | (1L << (Minus - 188)) | (1L << (Tilde - 188)) | (1L << (SuppressWarnings - 188)) | (1L << (Dollar - 188)) | (1L << (OpenRoundBracket - 188)) | (1L << (OpenSquareBracket - 188)) | (1L << (VarName - 188)) | (1L << (Label - 188)) | (1L << (Octal - 188)) | (1L << (Decimal - 188)) | (1L << (Real - 188)) | (1L << (Hex - 188)) | (1L << (Binary - 188)) | (1L << (BackQuoteString - 188)) | (1L << (SingleQuoteString - 188)) | (1L << (DoubleQuote - 188)) | (1L << (StartNowDoc - 188)) | (1L << (StartHereDoc - 188)))) != 0)) {
				{
				setState(769);
				expression(0);
				}
			}

			setState(772);
			match(SemiColon);
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
		public TerminalNode Return() { return getToken(PhpParser.Return, 0); }
		public TerminalNode SemiColon() { return getToken(PhpParser.SemiColon, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ReturnStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).enterReturnStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).exitReturnStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PhpParserVisitor ) return ((PhpParserVisitor<? extends T>)visitor).visitReturnStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnStatementContext returnStatement() throws RecognitionException {
		ReturnStatementContext _localctx = new ReturnStatementContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_returnStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(774);
			match(Return);
			setState(776);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 44)) & ~0x3f) == 0 && ((1L << (_la - 44)) & ((1L << (Abstract - 44)) | (1L << (Array - 44)) | (1L << (As - 44)) | (1L << (BinaryCast - 44)) | (1L << (BoolType - 44)) | (1L << (BooleanConstant - 44)) | (1L << (Break - 44)) | (1L << (Callable - 44)) | (1L << (Case - 44)) | (1L << (Catch - 44)) | (1L << (Class - 44)) | (1L << (Clone - 44)) | (1L << (Const - 44)) | (1L << (Continue - 44)) | (1L << (Declare - 44)) | (1L << (Default - 44)) | (1L << (Do - 44)) | (1L << (DoubleCast - 44)) | (1L << (DoubleType - 44)) | (1L << (Echo - 44)) | (1L << (Else - 44)) | (1L << (ElseIf - 44)) | (1L << (Empty - 44)) | (1L << (EndDeclare - 44)) | (1L << (EndFor - 44)) | (1L << (EndForeach - 44)) | (1L << (EndIf - 44)) | (1L << (EndSwitch - 44)) | (1L << (EndWhile - 44)) | (1L << (Eval - 44)) | (1L << (Exit - 44)) | (1L << (Extends - 44)) | (1L << (Final - 44)) | (1L << (Finally - 44)) | (1L << (FloatCast - 44)) | (1L << (For - 44)) | (1L << (Foreach - 44)) | (1L << (Function - 44)) | (1L << (Global - 44)) | (1L << (Goto - 44)) | (1L << (If - 44)) | (1L << (Implements - 44)) | (1L << (Import - 44)) | (1L << (Include - 44)) | (1L << (IncludeOnce - 44)) | (1L << (InstanceOf - 44)) | (1L << (InsteadOf - 44)) | (1L << (Int8Cast - 44)) | (1L << (Int16Cast - 44)) | (1L << (Int64Type - 44)) | (1L << (IntType - 44)) | (1L << (Interface - 44)) | (1L << (IsSet - 44)) | (1L << (List - 44)) | (1L << (LogicalAnd - 44)) | (1L << (LogicalOr - 44)) | (1L << (LogicalXor - 44)) | (1L << (Namespace - 44)) | (1L << (New - 44)) | (1L << (Null - 44)) | (1L << (ObjectType - 44)) | (1L << (Parent_ - 44)) | (1L << (Partial - 44)) | (1L << (Print - 44)))) != 0) || ((((_la - 108)) & ~0x3f) == 0 && ((1L << (_la - 108)) & ((1L << (Private - 108)) | (1L << (Protected - 108)) | (1L << (Public - 108)) | (1L << (Require - 108)) | (1L << (RequireOnce - 108)) | (1L << (Resource - 108)) | (1L << (Return - 108)) | (1L << (Static - 108)) | (1L << (StringType - 108)) | (1L << (Switch - 108)) | (1L << (Throw - 108)) | (1L << (Trait - 108)) | (1L << (Try - 108)) | (1L << (Typeof - 108)) | (1L << (UintCast - 108)) | (1L << (UnicodeCast - 108)) | (1L << (Unset - 108)) | (1L << (Use - 108)) | (1L << (Var - 108)) | (1L << (While - 108)) | (1L << (Yield - 108)) | (1L << (From - 108)) | (1L << (LambdaFn - 108)) | (1L << (Get - 108)) | (1L << (Set - 108)) | (1L << (Call - 108)) | (1L << (CallStatic - 108)) | (1L << (Constructor - 108)) | (1L << (Destruct - 108)) | (1L << (Wakeup - 108)) | (1L << (Sleep - 108)) | (1L << (Autoload - 108)) | (1L << (IsSet__ - 108)) | (1L << (Unset__ - 108)) | (1L << (ToString__ - 108)) | (1L << (Invoke - 108)) | (1L << (SetState - 108)) | (1L << (Clone__ - 108)) | (1L << (DebugInfo - 108)) | (1L << (Namespace__ - 108)) | (1L << (Class__ - 108)) | (1L << (Traic__ - 108)) | (1L << (Function__ - 108)) | (1L << (Method__ - 108)) | (1L << (Line__ - 108)) | (1L << (File__ - 108)) | (1L << (Dir__ - 108)) | (1L << (Inc - 108)) | (1L << (Dec - 108)))) != 0) || ((((_la - 188)) & ~0x3f) == 0 && ((1L << (_la - 188)) & ((1L << (NamespaceSeparator - 188)) | (1L << (Bang - 188)) | (1L << (Plus - 188)) | (1L << (Minus - 188)) | (1L << (Tilde - 188)) | (1L << (SuppressWarnings - 188)) | (1L << (Dollar - 188)) | (1L << (OpenRoundBracket - 188)) | (1L << (OpenSquareBracket - 188)) | (1L << (VarName - 188)) | (1L << (Label - 188)) | (1L << (Octal - 188)) | (1L << (Decimal - 188)) | (1L << (Real - 188)) | (1L << (Hex - 188)) | (1L << (Binary - 188)) | (1L << (BackQuoteString - 188)) | (1L << (SingleQuoteString - 188)) | (1L << (DoubleQuote - 188)) | (1L << (StartNowDoc - 188)) | (1L << (StartHereDoc - 188)))) != 0)) {
				{
				setState(775);
				expression(0);
				}
			}

			setState(778);
			match(SemiColon);
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
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SemiColon() { return getToken(PhpParser.SemiColon, 0); }
		public ExpressionStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).enterExpressionStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).exitExpressionStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PhpParserVisitor ) return ((PhpParserVisitor<? extends T>)visitor).visitExpressionStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionStatementContext expressionStatement() throws RecognitionException {
		ExpressionStatementContext _localctx = new ExpressionStatementContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_expressionStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(780);
			expression(0);
			setState(781);
			match(SemiColon);
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

	public static class UnsetStatementContext extends ParserRuleContext {
		public TerminalNode Unset() { return getToken(PhpParser.Unset, 0); }
		public TerminalNode OpenRoundBracket() { return getToken(PhpParser.OpenRoundBracket, 0); }
		public ChainListContext chainList() {
			return getRuleContext(ChainListContext.class,0);
		}
		public TerminalNode CloseRoundBracket() { return getToken(PhpParser.CloseRoundBracket, 0); }
		public TerminalNode SemiColon() { return getToken(PhpParser.SemiColon, 0); }
		public UnsetStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unsetStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).enterUnsetStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).exitUnsetStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PhpParserVisitor ) return ((PhpParserVisitor<? extends T>)visitor).visitUnsetStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnsetStatementContext unsetStatement() throws RecognitionException {
		UnsetStatementContext _localctx = new UnsetStatementContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_unsetStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(783);
			match(Unset);
			setState(784);
			match(OpenRoundBracket);
			setState(785);
			chainList();
			setState(786);
			match(CloseRoundBracket);
			setState(787);
			match(SemiColon);
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

	public static class ForeachStatementContext extends ParserRuleContext {
		public TerminalNode Foreach() { return getToken(PhpParser.Foreach, 0); }
		public List<TerminalNode> OpenRoundBracket() { return getTokens(PhpParser.OpenRoundBracket); }
		public TerminalNode OpenRoundBracket(int i) {
			return getToken(PhpParser.OpenRoundBracket, i);
		}
		public List<ChainContext> chain() {
			return getRuleContexts(ChainContext.class);
		}
		public ChainContext chain(int i) {
			return getRuleContext(ChainContext.class,i);
		}
		public TerminalNode As() { return getToken(PhpParser.As, 0); }
		public AssignableContext assignable() {
			return getRuleContext(AssignableContext.class,0);
		}
		public List<TerminalNode> CloseRoundBracket() { return getTokens(PhpParser.CloseRoundBracket); }
		public TerminalNode CloseRoundBracket(int i) {
			return getToken(PhpParser.CloseRoundBracket, i);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode List() { return getToken(PhpParser.List, 0); }
		public AssignmentListContext assignmentList() {
			return getRuleContext(AssignmentListContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode Colon() { return getToken(PhpParser.Colon, 0); }
		public InnerStatementListContext innerStatementList() {
			return getRuleContext(InnerStatementListContext.class,0);
		}
		public TerminalNode EndForeach() { return getToken(PhpParser.EndForeach, 0); }
		public TerminalNode SemiColon() { return getToken(PhpParser.SemiColon, 0); }
		public List<TerminalNode> Ampersand() { return getTokens(PhpParser.Ampersand); }
		public TerminalNode Ampersand(int i) {
			return getToken(PhpParser.Ampersand, i);
		}
		public TerminalNode DoubleArrow() { return getToken(PhpParser.DoubleArrow, 0); }
		public ForeachStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_foreachStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).enterForeachStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).exitForeachStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PhpParserVisitor ) return ((PhpParserVisitor<? extends T>)visitor).visitForeachStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForeachStatementContext foreachStatement() throws RecognitionException {
		ForeachStatementContext _localctx = new ForeachStatementContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_foreachStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(789);
			match(Foreach);
			setState(828);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,72,_ctx) ) {
			case 1:
				{
				setState(790);
				match(OpenRoundBracket);
				setState(791);
				chain();
				setState(792);
				match(As);
				setState(794);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Ampersand) {
					{
					setState(793);
					match(Ampersand);
					}
				}

				setState(796);
				assignable();
				setState(802);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==DoubleArrow) {
					{
					setState(797);
					match(DoubleArrow);
					setState(799);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==Ampersand) {
						{
						setState(798);
						match(Ampersand);
						}
					}

					setState(801);
					chain();
					}
				}

				setState(804);
				match(CloseRoundBracket);
				}
				break;
			case 2:
				{
				setState(806);
				match(OpenRoundBracket);
				setState(807);
				expression(0);
				setState(808);
				match(As);
				setState(809);
				assignable();
				setState(815);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==DoubleArrow) {
					{
					setState(810);
					match(DoubleArrow);
					setState(812);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==Ampersand) {
						{
						setState(811);
						match(Ampersand);
						}
					}

					setState(814);
					chain();
					}
				}

				setState(817);
				match(CloseRoundBracket);
				}
				break;
			case 3:
				{
				setState(819);
				match(OpenRoundBracket);
				setState(820);
				chain();
				setState(821);
				match(As);
				setState(822);
				match(List);
				setState(823);
				match(OpenRoundBracket);
				setState(824);
				assignmentList();
				setState(825);
				match(CloseRoundBracket);
				setState(826);
				match(CloseRoundBracket);
				}
				break;
			}
			setState(836);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case HtmlText:
			case XmlStart:
			case HtmlScriptOpen:
			case HtmlStyleOpen:
			case HtmlDtd:
			case HtmlOpen:
			case HtmlClose:
			case HtmlSlashClose:
			case HtmlSlash:
			case HtmlEquals:
			case HtmlStartQuoteString:
			case HtmlStartDoubleQuoteString:
			case HtmlHex:
			case HtmlDecimal:
			case HtmlName:
			case HtmlEndQuoteString:
			case HtmlQuoteString:
			case HtmlEndDoubleQuoteString:
			case HtmlDoubleQuoteString:
			case ScriptText:
			case ScriptClose:
			case StyleBody:
			case Abstract:
			case Array:
			case As:
			case BinaryCast:
			case BoolType:
			case BooleanConstant:
			case Break:
			case Callable:
			case Case:
			case Catch:
			case Class:
			case Clone:
			case Const:
			case Continue:
			case Declare:
			case Default:
			case Do:
			case DoubleCast:
			case DoubleType:
			case Echo:
			case Else:
			case ElseIf:
			case Empty:
			case EndDeclare:
			case EndFor:
			case EndForeach:
			case EndIf:
			case EndSwitch:
			case EndWhile:
			case Eval:
			case Exit:
			case Extends:
			case Final:
			case Finally:
			case FloatCast:
			case For:
			case Foreach:
			case Function:
			case Global:
			case Goto:
			case If:
			case Implements:
			case Import:
			case Include:
			case IncludeOnce:
			case InstanceOf:
			case InsteadOf:
			case Int8Cast:
			case Int16Cast:
			case Int64Type:
			case IntType:
			case Interface:
			case IsSet:
			case List:
			case LogicalAnd:
			case LogicalOr:
			case LogicalXor:
			case Namespace:
			case New:
			case Null:
			case ObjectType:
			case Parent_:
			case Partial:
			case Print:
			case Private:
			case Protected:
			case Public:
			case Require:
			case RequireOnce:
			case Resource:
			case Return:
			case Static:
			case StringType:
			case Switch:
			case Throw:
			case Trait:
			case Try:
			case Typeof:
			case UintCast:
			case UnicodeCast:
			case Unset:
			case Use:
			case Var:
			case While:
			case Yield:
			case From:
			case LambdaFn:
			case Get:
			case Set:
			case Call:
			case CallStatic:
			case Constructor:
			case Destruct:
			case Wakeup:
			case Sleep:
			case Autoload:
			case IsSet__:
			case Unset__:
			case ToString__:
			case Invoke:
			case SetState:
			case Clone__:
			case DebugInfo:
			case Namespace__:
			case Class__:
			case Traic__:
			case Function__:
			case Method__:
			case Line__:
			case File__:
			case Dir__:
			case Inc:
			case Dec:
			case NamespaceSeparator:
			case Bang:
			case Plus:
			case Minus:
			case Tilde:
			case SuppressWarnings:
			case Dollar:
			case OpenRoundBracket:
			case OpenSquareBracket:
			case OpenCurlyBracket:
			case SemiColon:
			case VarName:
			case Label:
			case Octal:
			case Decimal:
			case Real:
			case Hex:
			case Binary:
			case BackQuoteString:
			case SingleQuoteString:
			case DoubleQuote:
			case StartNowDoc:
			case StartHereDoc:
				{
				setState(830);
				statement();
				}
				break;
			case Colon:
				{
				setState(831);
				match(Colon);
				setState(832);
				innerStatementList();
				setState(833);
				match(EndForeach);
				setState(834);
				match(SemiColon);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class TryCatchFinallyContext extends ParserRuleContext {
		public TerminalNode Try() { return getToken(PhpParser.Try, 0); }
		public BlockStatementContext blockStatement() {
			return getRuleContext(BlockStatementContext.class,0);
		}
		public FinallyStatementContext finallyStatement() {
			return getRuleContext(FinallyStatementContext.class,0);
		}
		public List<CatchClauseContext> catchClause() {
			return getRuleContexts(CatchClauseContext.class);
		}
		public CatchClauseContext catchClause(int i) {
			return getRuleContext(CatchClauseContext.class,i);
		}
		public TryCatchFinallyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tryCatchFinally; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).enterTryCatchFinally(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).exitTryCatchFinally(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PhpParserVisitor ) return ((PhpParserVisitor<? extends T>)visitor).visitTryCatchFinally(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TryCatchFinallyContext tryCatchFinally() throws RecognitionException {
		TryCatchFinallyContext _localctx = new TryCatchFinallyContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_tryCatchFinally);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(838);
			match(Try);
			setState(839);
			blockStatement();
			setState(855);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,77,_ctx) ) {
			case 1:
				{
				setState(841); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(840);
						catchClause();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(843); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,74,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(846);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,75,_ctx) ) {
				case 1:
					{
					setState(845);
					finallyStatement();
					}
					break;
				}
				}
				break;
			case 2:
				{
				setState(851);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Catch) {
					{
					{
					setState(848);
					catchClause();
					}
					}
					setState(853);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(854);
				finallyStatement();
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

	public static class CatchClauseContext extends ParserRuleContext {
		public TerminalNode Catch() { return getToken(PhpParser.Catch, 0); }
		public TerminalNode OpenRoundBracket() { return getToken(PhpParser.OpenRoundBracket, 0); }
		public List<QualifiedStaticTypeRefContext> qualifiedStaticTypeRef() {
			return getRuleContexts(QualifiedStaticTypeRefContext.class);
		}
		public QualifiedStaticTypeRefContext qualifiedStaticTypeRef(int i) {
			return getRuleContext(QualifiedStaticTypeRefContext.class,i);
		}
		public TerminalNode VarName() { return getToken(PhpParser.VarName, 0); }
		public TerminalNode CloseRoundBracket() { return getToken(PhpParser.CloseRoundBracket, 0); }
		public BlockStatementContext blockStatement() {
			return getRuleContext(BlockStatementContext.class,0);
		}
		public List<TerminalNode> Pipe() { return getTokens(PhpParser.Pipe); }
		public TerminalNode Pipe(int i) {
			return getToken(PhpParser.Pipe, i);
		}
		public CatchClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_catchClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).enterCatchClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).exitCatchClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PhpParserVisitor ) return ((PhpParserVisitor<? extends T>)visitor).visitCatchClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CatchClauseContext catchClause() throws RecognitionException {
		CatchClauseContext _localctx = new CatchClauseContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_catchClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(857);
			match(Catch);
			setState(858);
			match(OpenRoundBracket);
			setState(859);
			qualifiedStaticTypeRef();
			setState(864);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Pipe) {
				{
				{
				setState(860);
				match(Pipe);
				setState(861);
				qualifiedStaticTypeRef();
				}
				}
				setState(866);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(867);
			match(VarName);
			setState(868);
			match(CloseRoundBracket);
			setState(869);
			blockStatement();
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

	public static class FinallyStatementContext extends ParserRuleContext {
		public TerminalNode Finally() { return getToken(PhpParser.Finally, 0); }
		public BlockStatementContext blockStatement() {
			return getRuleContext(BlockStatementContext.class,0);
		}
		public FinallyStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_finallyStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).enterFinallyStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).exitFinallyStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PhpParserVisitor ) return ((PhpParserVisitor<? extends T>)visitor).visitFinallyStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FinallyStatementContext finallyStatement() throws RecognitionException {
		FinallyStatementContext _localctx = new FinallyStatementContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_finallyStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(871);
			match(Finally);
			setState(872);
			blockStatement();
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

	public static class ThrowStatementContext extends ParserRuleContext {
		public TerminalNode Throw() { return getToken(PhpParser.Throw, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SemiColon() { return getToken(PhpParser.SemiColon, 0); }
		public ThrowStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_throwStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).enterThrowStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).exitThrowStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PhpParserVisitor ) return ((PhpParserVisitor<? extends T>)visitor).visitThrowStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ThrowStatementContext throwStatement() throws RecognitionException {
		ThrowStatementContext _localctx = new ThrowStatementContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_throwStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(874);
			match(Throw);
			setState(875);
			expression(0);
			setState(876);
			match(SemiColon);
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

	public static class GotoStatementContext extends ParserRuleContext {
		public TerminalNode Goto() { return getToken(PhpParser.Goto, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode SemiColon() { return getToken(PhpParser.SemiColon, 0); }
		public GotoStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_gotoStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).enterGotoStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).exitGotoStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PhpParserVisitor ) return ((PhpParserVisitor<? extends T>)visitor).visitGotoStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GotoStatementContext gotoStatement() throws RecognitionException {
		GotoStatementContext _localctx = new GotoStatementContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_gotoStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(878);
			match(Goto);
			setState(879);
			identifier();
			setState(880);
			match(SemiColon);
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

	public static class DeclareStatementContext extends ParserRuleContext {
		public TerminalNode Declare() { return getToken(PhpParser.Declare, 0); }
		public TerminalNode OpenRoundBracket() { return getToken(PhpParser.OpenRoundBracket, 0); }
		public DeclareListContext declareList() {
			return getRuleContext(DeclareListContext.class,0);
		}
		public TerminalNode CloseRoundBracket() { return getToken(PhpParser.CloseRoundBracket, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode Colon() { return getToken(PhpParser.Colon, 0); }
		public InnerStatementListContext innerStatementList() {
			return getRuleContext(InnerStatementListContext.class,0);
		}
		public TerminalNode EndDeclare() { return getToken(PhpParser.EndDeclare, 0); }
		public TerminalNode SemiColon() { return getToken(PhpParser.SemiColon, 0); }
		public DeclareStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declareStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).enterDeclareStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).exitDeclareStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PhpParserVisitor ) return ((PhpParserVisitor<? extends T>)visitor).visitDeclareStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclareStatementContext declareStatement() throws RecognitionException {
		DeclareStatementContext _localctx = new DeclareStatementContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_declareStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(882);
			match(Declare);
			setState(883);
			match(OpenRoundBracket);
			setState(884);
			declareList();
			setState(885);
			match(CloseRoundBracket);
			setState(892);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case HtmlText:
			case XmlStart:
			case HtmlScriptOpen:
			case HtmlStyleOpen:
			case HtmlDtd:
			case HtmlOpen:
			case HtmlClose:
			case HtmlSlashClose:
			case HtmlSlash:
			case HtmlEquals:
			case HtmlStartQuoteString:
			case HtmlStartDoubleQuoteString:
			case HtmlHex:
			case HtmlDecimal:
			case HtmlName:
			case HtmlEndQuoteString:
			case HtmlQuoteString:
			case HtmlEndDoubleQuoteString:
			case HtmlDoubleQuoteString:
			case ScriptText:
			case ScriptClose:
			case StyleBody:
			case Abstract:
			case Array:
			case As:
			case BinaryCast:
			case BoolType:
			case BooleanConstant:
			case Break:
			case Callable:
			case Case:
			case Catch:
			case Class:
			case Clone:
			case Const:
			case Continue:
			case Declare:
			case Default:
			case Do:
			case DoubleCast:
			case DoubleType:
			case Echo:
			case Else:
			case ElseIf:
			case Empty:
			case EndDeclare:
			case EndFor:
			case EndForeach:
			case EndIf:
			case EndSwitch:
			case EndWhile:
			case Eval:
			case Exit:
			case Extends:
			case Final:
			case Finally:
			case FloatCast:
			case For:
			case Foreach:
			case Function:
			case Global:
			case Goto:
			case If:
			case Implements:
			case Import:
			case Include:
			case IncludeOnce:
			case InstanceOf:
			case InsteadOf:
			case Int8Cast:
			case Int16Cast:
			case Int64Type:
			case IntType:
			case Interface:
			case IsSet:
			case List:
			case LogicalAnd:
			case LogicalOr:
			case LogicalXor:
			case Namespace:
			case New:
			case Null:
			case ObjectType:
			case Parent_:
			case Partial:
			case Print:
			case Private:
			case Protected:
			case Public:
			case Require:
			case RequireOnce:
			case Resource:
			case Return:
			case Static:
			case StringType:
			case Switch:
			case Throw:
			case Trait:
			case Try:
			case Typeof:
			case UintCast:
			case UnicodeCast:
			case Unset:
			case Use:
			case Var:
			case While:
			case Yield:
			case From:
			case LambdaFn:
			case Get:
			case Set:
			case Call:
			case CallStatic:
			case Constructor:
			case Destruct:
			case Wakeup:
			case Sleep:
			case Autoload:
			case IsSet__:
			case Unset__:
			case ToString__:
			case Invoke:
			case SetState:
			case Clone__:
			case DebugInfo:
			case Namespace__:
			case Class__:
			case Traic__:
			case Function__:
			case Method__:
			case Line__:
			case File__:
			case Dir__:
			case Inc:
			case Dec:
			case NamespaceSeparator:
			case Bang:
			case Plus:
			case Minus:
			case Tilde:
			case SuppressWarnings:
			case Dollar:
			case OpenRoundBracket:
			case OpenSquareBracket:
			case OpenCurlyBracket:
			case SemiColon:
			case VarName:
			case Label:
			case Octal:
			case Decimal:
			case Real:
			case Hex:
			case Binary:
			case BackQuoteString:
			case SingleQuoteString:
			case DoubleQuote:
			case StartNowDoc:
			case StartHereDoc:
				{
				setState(886);
				statement();
				}
				break;
			case Colon:
				{
				setState(887);
				match(Colon);
				setState(888);
				innerStatementList();
				setState(889);
				match(EndDeclare);
				setState(890);
				match(SemiColon);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class InlineHtmlStatementContext extends ParserRuleContext {
		public List<InlineHtmlContext> inlineHtml() {
			return getRuleContexts(InlineHtmlContext.class);
		}
		public InlineHtmlContext inlineHtml(int i) {
			return getRuleContext(InlineHtmlContext.class,i);
		}
		public InlineHtmlStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inlineHtmlStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).enterInlineHtmlStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).exitInlineHtmlStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PhpParserVisitor ) return ((PhpParserVisitor<? extends T>)visitor).visitInlineHtmlStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InlineHtmlStatementContext inlineHtmlStatement() throws RecognitionException {
		InlineHtmlStatementContext _localctx = new InlineHtmlStatementContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_inlineHtmlStatement);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(895); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(894);
					inlineHtml();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(897); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,80,_ctx);
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

	public static class InlineHtmlContext extends ParserRuleContext {
		public HtmlElementsContext htmlElements() {
			return getRuleContext(HtmlElementsContext.class,0);
		}
		public ScriptTextPartContext scriptTextPart() {
			return getRuleContext(ScriptTextPartContext.class,0);
		}
		public InlineHtmlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inlineHtml; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).enterInlineHtml(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).exitInlineHtml(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PhpParserVisitor ) return ((PhpParserVisitor<? extends T>)visitor).visitInlineHtml(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InlineHtmlContext inlineHtml() throws RecognitionException {
		InlineHtmlContext _localctx = new InlineHtmlContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_inlineHtml);
		try {
			setState(901);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case HtmlText:
			case XmlStart:
			case HtmlScriptOpen:
			case HtmlStyleOpen:
			case HtmlDtd:
			case HtmlOpen:
			case HtmlClose:
			case HtmlSlashClose:
			case HtmlSlash:
			case HtmlEquals:
			case HtmlStartQuoteString:
			case HtmlStartDoubleQuoteString:
			case HtmlHex:
			case HtmlDecimal:
			case HtmlName:
			case HtmlEndQuoteString:
			case HtmlQuoteString:
			case HtmlEndDoubleQuoteString:
			case HtmlDoubleQuoteString:
			case ScriptClose:
			case StyleBody:
				enterOuterAlt(_localctx, 1);
				{
				setState(899);
				htmlElements();
				}
				break;
			case ScriptText:
				enterOuterAlt(_localctx, 2);
				{
				setState(900);
				scriptTextPart();
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

	public static class DeclareListContext extends ParserRuleContext {
		public List<IdentifierInititalizerContext> identifierInititalizer() {
			return getRuleContexts(IdentifierInititalizerContext.class);
		}
		public IdentifierInititalizerContext identifierInititalizer(int i) {
			return getRuleContext(IdentifierInititalizerContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(PhpParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(PhpParser.Comma, i);
		}
		public DeclareListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declareList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).enterDeclareList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).exitDeclareList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PhpParserVisitor ) return ((PhpParserVisitor<? extends T>)visitor).visitDeclareList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclareListContext declareList() throws RecognitionException {
		DeclareListContext _localctx = new DeclareListContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_declareList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(903);
			identifierInititalizer();
			setState(908);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(904);
				match(Comma);
				setState(905);
				identifierInititalizer();
				}
				}
				setState(910);
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

	public static class FormalParameterListContext extends ParserRuleContext {
		public List<FormalParameterContext> formalParameter() {
			return getRuleContexts(FormalParameterContext.class);
		}
		public FormalParameterContext formalParameter(int i) {
			return getRuleContext(FormalParameterContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(PhpParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(PhpParser.Comma, i);
		}
		public FormalParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParameterList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).enterFormalParameterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).exitFormalParameterList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PhpParserVisitor ) return ((PhpParserVisitor<? extends T>)visitor).visitFormalParameterList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FormalParameterListContext formalParameterList() throws RecognitionException {
		FormalParameterListContext _localctx = new FormalParameterListContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_formalParameterList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(912);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 44)) & ~0x3f) == 0 && ((1L << (_la - 44)) & ((1L << (Abstract - 44)) | (1L << (Array - 44)) | (1L << (As - 44)) | (1L << (BinaryCast - 44)) | (1L << (BoolType - 44)) | (1L << (BooleanConstant - 44)) | (1L << (Break - 44)) | (1L << (Callable - 44)) | (1L << (Case - 44)) | (1L << (Catch - 44)) | (1L << (Class - 44)) | (1L << (Clone - 44)) | (1L << (Const - 44)) | (1L << (Continue - 44)) | (1L << (Declare - 44)) | (1L << (Default - 44)) | (1L << (Do - 44)) | (1L << (DoubleCast - 44)) | (1L << (DoubleType - 44)) | (1L << (Echo - 44)) | (1L << (Else - 44)) | (1L << (ElseIf - 44)) | (1L << (Empty - 44)) | (1L << (EndDeclare - 44)) | (1L << (EndFor - 44)) | (1L << (EndForeach - 44)) | (1L << (EndIf - 44)) | (1L << (EndSwitch - 44)) | (1L << (EndWhile - 44)) | (1L << (Eval - 44)) | (1L << (Exit - 44)) | (1L << (Extends - 44)) | (1L << (Final - 44)) | (1L << (Finally - 44)) | (1L << (FloatCast - 44)) | (1L << (For - 44)) | (1L << (Foreach - 44)) | (1L << (Function - 44)) | (1L << (Global - 44)) | (1L << (Goto - 44)) | (1L << (If - 44)) | (1L << (Implements - 44)) | (1L << (Import - 44)) | (1L << (Include - 44)) | (1L << (IncludeOnce - 44)) | (1L << (InstanceOf - 44)) | (1L << (InsteadOf - 44)) | (1L << (Int8Cast - 44)) | (1L << (Int16Cast - 44)) | (1L << (Int64Type - 44)) | (1L << (IntType - 44)) | (1L << (Interface - 44)) | (1L << (IsSet - 44)) | (1L << (List - 44)) | (1L << (LogicalAnd - 44)) | (1L << (LogicalOr - 44)) | (1L << (LogicalXor - 44)) | (1L << (Namespace - 44)) | (1L << (New - 44)) | (1L << (Null - 44)) | (1L << (ObjectType - 44)) | (1L << (Parent_ - 44)) | (1L << (Partial - 44)) | (1L << (Print - 44)))) != 0) || ((((_la - 108)) & ~0x3f) == 0 && ((1L << (_la - 108)) & ((1L << (Private - 108)) | (1L << (Protected - 108)) | (1L << (Public - 108)) | (1L << (Require - 108)) | (1L << (RequireOnce - 108)) | (1L << (Resource - 108)) | (1L << (Return - 108)) | (1L << (Static - 108)) | (1L << (StringType - 108)) | (1L << (Switch - 108)) | (1L << (Throw - 108)) | (1L << (Trait - 108)) | (1L << (Try - 108)) | (1L << (Typeof - 108)) | (1L << (UintCast - 108)) | (1L << (UnicodeCast - 108)) | (1L << (Unset - 108)) | (1L << (Use - 108)) | (1L << (Var - 108)) | (1L << (While - 108)) | (1L << (Yield - 108)) | (1L << (From - 108)) | (1L << (Get - 108)) | (1L << (Set - 108)) | (1L << (Call - 108)) | (1L << (CallStatic - 108)) | (1L << (Constructor - 108)) | (1L << (Destruct - 108)) | (1L << (Wakeup - 108)) | (1L << (Sleep - 108)) | (1L << (Autoload - 108)) | (1L << (IsSet__ - 108)) | (1L << (Unset__ - 108)) | (1L << (ToString__ - 108)) | (1L << (Invoke - 108)) | (1L << (SetState - 108)) | (1L << (Clone__ - 108)) | (1L << (DebugInfo - 108)) | (1L << (Namespace__ - 108)) | (1L << (Class__ - 108)) | (1L << (Traic__ - 108)) | (1L << (Function__ - 108)) | (1L << (Method__ - 108)) | (1L << (Line__ - 108)) | (1L << (File__ - 108)) | (1L << (Dir__ - 108)))) != 0) || ((((_la - 188)) & ~0x3f) == 0 && ((1L << (_la - 188)) & ((1L << (NamespaceSeparator - 188)) | (1L << (Ellipsis - 188)) | (1L << (Ampersand - 188)) | (1L << (QuestionMark - 188)) | (1L << (OpenSquareBracket - 188)) | (1L << (VarName - 188)) | (1L << (Label - 188)))) != 0)) {
				{
				setState(911);
				formalParameter();
				}
			}

			setState(918);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(914);
				match(Comma);
				setState(915);
				formalParameter();
				}
				}
				setState(920);
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
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public VariableInitializerContext variableInitializer() {
			return getRuleContext(VariableInitializerContext.class,0);
		}
		public TerminalNode QuestionMark() { return getToken(PhpParser.QuestionMark, 0); }
		public TypeHintContext typeHint() {
			return getRuleContext(TypeHintContext.class,0);
		}
		public TerminalNode Ampersand() { return getToken(PhpParser.Ampersand, 0); }
		public TerminalNode Ellipsis() { return getToken(PhpParser.Ellipsis, 0); }
		public FormalParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).enterFormalParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).exitFormalParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PhpParserVisitor ) return ((PhpParserVisitor<? extends T>)visitor).visitFormalParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FormalParameterContext formalParameter() throws RecognitionException {
		FormalParameterContext _localctx = new FormalParameterContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_formalParameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(921);
			attributes();
			setState(923);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==QuestionMark) {
				{
				setState(922);
				match(QuestionMark);
				}
			}

			setState(926);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 44)) & ~0x3f) == 0 && ((1L << (_la - 44)) & ((1L << (Abstract - 44)) | (1L << (Array - 44)) | (1L << (As - 44)) | (1L << (BinaryCast - 44)) | (1L << (BoolType - 44)) | (1L << (BooleanConstant - 44)) | (1L << (Break - 44)) | (1L << (Callable - 44)) | (1L << (Case - 44)) | (1L << (Catch - 44)) | (1L << (Class - 44)) | (1L << (Clone - 44)) | (1L << (Const - 44)) | (1L << (Continue - 44)) | (1L << (Declare - 44)) | (1L << (Default - 44)) | (1L << (Do - 44)) | (1L << (DoubleCast - 44)) | (1L << (DoubleType - 44)) | (1L << (Echo - 44)) | (1L << (Else - 44)) | (1L << (ElseIf - 44)) | (1L << (Empty - 44)) | (1L << (EndDeclare - 44)) | (1L << (EndFor - 44)) | (1L << (EndForeach - 44)) | (1L << (EndIf - 44)) | (1L << (EndSwitch - 44)) | (1L << (EndWhile - 44)) | (1L << (Eval - 44)) | (1L << (Exit - 44)) | (1L << (Extends - 44)) | (1L << (Final - 44)) | (1L << (Finally - 44)) | (1L << (FloatCast - 44)) | (1L << (For - 44)) | (1L << (Foreach - 44)) | (1L << (Function - 44)) | (1L << (Global - 44)) | (1L << (Goto - 44)) | (1L << (If - 44)) | (1L << (Implements - 44)) | (1L << (Import - 44)) | (1L << (Include - 44)) | (1L << (IncludeOnce - 44)) | (1L << (InstanceOf - 44)) | (1L << (InsteadOf - 44)) | (1L << (Int8Cast - 44)) | (1L << (Int16Cast - 44)) | (1L << (Int64Type - 44)) | (1L << (IntType - 44)) | (1L << (Interface - 44)) | (1L << (IsSet - 44)) | (1L << (List - 44)) | (1L << (LogicalAnd - 44)) | (1L << (LogicalOr - 44)) | (1L << (LogicalXor - 44)) | (1L << (Namespace - 44)) | (1L << (New - 44)) | (1L << (Null - 44)) | (1L << (ObjectType - 44)) | (1L << (Parent_ - 44)) | (1L << (Partial - 44)) | (1L << (Print - 44)))) != 0) || ((((_la - 108)) & ~0x3f) == 0 && ((1L << (_la - 108)) & ((1L << (Private - 108)) | (1L << (Protected - 108)) | (1L << (Public - 108)) | (1L << (Require - 108)) | (1L << (RequireOnce - 108)) | (1L << (Resource - 108)) | (1L << (Return - 108)) | (1L << (Static - 108)) | (1L << (StringType - 108)) | (1L << (Switch - 108)) | (1L << (Throw - 108)) | (1L << (Trait - 108)) | (1L << (Try - 108)) | (1L << (Typeof - 108)) | (1L << (UintCast - 108)) | (1L << (UnicodeCast - 108)) | (1L << (Unset - 108)) | (1L << (Use - 108)) | (1L << (Var - 108)) | (1L << (While - 108)) | (1L << (Yield - 108)) | (1L << (From - 108)) | (1L << (Get - 108)) | (1L << (Set - 108)) | (1L << (Call - 108)) | (1L << (CallStatic - 108)) | (1L << (Constructor - 108)) | (1L << (Destruct - 108)) | (1L << (Wakeup - 108)) | (1L << (Sleep - 108)) | (1L << (Autoload - 108)) | (1L << (IsSet__ - 108)) | (1L << (Unset__ - 108)) | (1L << (ToString__ - 108)) | (1L << (Invoke - 108)) | (1L << (SetState - 108)) | (1L << (Clone__ - 108)) | (1L << (DebugInfo - 108)) | (1L << (Namespace__ - 108)) | (1L << (Class__ - 108)) | (1L << (Traic__ - 108)) | (1L << (Function__ - 108)) | (1L << (Method__ - 108)) | (1L << (Line__ - 108)) | (1L << (File__ - 108)) | (1L << (Dir__ - 108)))) != 0) || _la==NamespaceSeparator || _la==Label) {
				{
				setState(925);
				typeHint();
				}
			}

			setState(929);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Ampersand) {
				{
				setState(928);
				match(Ampersand);
				}
			}

			setState(932);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Ellipsis) {
				{
				setState(931);
				match(Ellipsis);
				}
			}

			setState(934);
			variableInitializer();
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

	public static class TypeHintContext extends ParserRuleContext {
		public QualifiedStaticTypeRefContext qualifiedStaticTypeRef() {
			return getRuleContext(QualifiedStaticTypeRefContext.class,0);
		}
		public TerminalNode Callable() { return getToken(PhpParser.Callable, 0); }
		public PrimitiveTypeContext primitiveType() {
			return getRuleContext(PrimitiveTypeContext.class,0);
		}
		public TypeHintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeHint; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).enterTypeHint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).exitTypeHint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PhpParserVisitor ) return ((PhpParserVisitor<? extends T>)visitor).visitTypeHint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeHintContext typeHint() throws RecognitionException {
		TypeHintContext _localctx = new TypeHintContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_typeHint);
		try {
			setState(939);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,89,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(936);
				qualifiedStaticTypeRef();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(937);
				match(Callable);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(938);
				primitiveType();
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

	public static class GlobalStatementContext extends ParserRuleContext {
		public TerminalNode Global() { return getToken(PhpParser.Global, 0); }
		public List<GlobalVarContext> globalVar() {
			return getRuleContexts(GlobalVarContext.class);
		}
		public GlobalVarContext globalVar(int i) {
			return getRuleContext(GlobalVarContext.class,i);
		}
		public TerminalNode SemiColon() { return getToken(PhpParser.SemiColon, 0); }
		public List<TerminalNode> Comma() { return getTokens(PhpParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(PhpParser.Comma, i);
		}
		public GlobalStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_globalStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).enterGlobalStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).exitGlobalStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PhpParserVisitor ) return ((PhpParserVisitor<? extends T>)visitor).visitGlobalStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GlobalStatementContext globalStatement() throws RecognitionException {
		GlobalStatementContext _localctx = new GlobalStatementContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_globalStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(941);
			match(Global);
			setState(942);
			globalVar();
			setState(947);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(943);
				match(Comma);
				setState(944);
				globalVar();
				}
				}
				setState(949);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(950);
			match(SemiColon);
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

	public static class GlobalVarContext extends ParserRuleContext {
		public TerminalNode VarName() { return getToken(PhpParser.VarName, 0); }
		public TerminalNode Dollar() { return getToken(PhpParser.Dollar, 0); }
		public ChainContext chain() {
			return getRuleContext(ChainContext.class,0);
		}
		public TerminalNode OpenCurlyBracket() { return getToken(PhpParser.OpenCurlyBracket, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode CloseCurlyBracket() { return getToken(PhpParser.CloseCurlyBracket, 0); }
		public GlobalVarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_globalVar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).enterGlobalVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).exitGlobalVar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PhpParserVisitor ) return ((PhpParserVisitor<? extends T>)visitor).visitGlobalVar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GlobalVarContext globalVar() throws RecognitionException {
		GlobalVarContext _localctx = new GlobalVarContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_globalVar);
		try {
			setState(960);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,91,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(952);
				match(VarName);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(953);
				match(Dollar);
				setState(954);
				chain();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(955);
				match(Dollar);
				setState(956);
				match(OpenCurlyBracket);
				setState(957);
				expression(0);
				setState(958);
				match(CloseCurlyBracket);
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

	public static class EchoStatementContext extends ParserRuleContext {
		public TerminalNode Echo() { return getToken(PhpParser.Echo, 0); }
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public TerminalNode SemiColon() { return getToken(PhpParser.SemiColon, 0); }
		public EchoStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_echoStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).enterEchoStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).exitEchoStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PhpParserVisitor ) return ((PhpParserVisitor<? extends T>)visitor).visitEchoStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EchoStatementContext echoStatement() throws RecognitionException {
		EchoStatementContext _localctx = new EchoStatementContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_echoStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(962);
			match(Echo);
			setState(963);
			expressionList();
			setState(964);
			match(SemiColon);
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

	public static class StaticVariableStatementContext extends ParserRuleContext {
		public TerminalNode Static() { return getToken(PhpParser.Static, 0); }
		public List<VariableInitializerContext> variableInitializer() {
			return getRuleContexts(VariableInitializerContext.class);
		}
		public VariableInitializerContext variableInitializer(int i) {
			return getRuleContext(VariableInitializerContext.class,i);
		}
		public TerminalNode SemiColon() { return getToken(PhpParser.SemiColon, 0); }
		public List<TerminalNode> Comma() { return getTokens(PhpParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(PhpParser.Comma, i);
		}
		public StaticVariableStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_staticVariableStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).enterStaticVariableStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).exitStaticVariableStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PhpParserVisitor ) return ((PhpParserVisitor<? extends T>)visitor).visitStaticVariableStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StaticVariableStatementContext staticVariableStatement() throws RecognitionException {
		StaticVariableStatementContext _localctx = new StaticVariableStatementContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_staticVariableStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(966);
			match(Static);
			setState(967);
			variableInitializer();
			setState(972);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(968);
				match(Comma);
				setState(969);
				variableInitializer();
				}
				}
				setState(974);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(975);
			match(SemiColon);
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

	public static class ClassStatementContext extends ParserRuleContext {
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public PropertyModifiersContext propertyModifiers() {
			return getRuleContext(PropertyModifiersContext.class,0);
		}
		public List<VariableInitializerContext> variableInitializer() {
			return getRuleContexts(VariableInitializerContext.class);
		}
		public VariableInitializerContext variableInitializer(int i) {
			return getRuleContext(VariableInitializerContext.class,i);
		}
		public TerminalNode SemiColon() { return getToken(PhpParser.SemiColon, 0); }
		public TypeHintContext typeHint() {
			return getRuleContext(TypeHintContext.class,0);
		}
		public List<TerminalNode> Comma() { return getTokens(PhpParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(PhpParser.Comma, i);
		}
		public TerminalNode Const() { return getToken(PhpParser.Const, 0); }
		public List<IdentifierInititalizerContext> identifierInititalizer() {
			return getRuleContexts(IdentifierInititalizerContext.class);
		}
		public IdentifierInititalizerContext identifierInititalizer(int i) {
			return getRuleContext(IdentifierInititalizerContext.class,i);
		}
		public MemberModifiersContext memberModifiers() {
			return getRuleContext(MemberModifiersContext.class,0);
		}
		public TerminalNode Function() { return getToken(PhpParser.Function, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode OpenRoundBracket() { return getToken(PhpParser.OpenRoundBracket, 0); }
		public FormalParameterListContext formalParameterList() {
			return getRuleContext(FormalParameterListContext.class,0);
		}
		public TerminalNode CloseRoundBracket() { return getToken(PhpParser.CloseRoundBracket, 0); }
		public MethodBodyContext methodBody() {
			return getRuleContext(MethodBodyContext.class,0);
		}
		public TerminalNode Ampersand() { return getToken(PhpParser.Ampersand, 0); }
		public TypeParameterListInBracketsContext typeParameterListInBrackets() {
			return getRuleContext(TypeParameterListInBracketsContext.class,0);
		}
		public BaseCtorCallContext baseCtorCall() {
			return getRuleContext(BaseCtorCallContext.class,0);
		}
		public TerminalNode Use() { return getToken(PhpParser.Use, 0); }
		public QualifiedNamespaceNameListContext qualifiedNamespaceNameList() {
			return getRuleContext(QualifiedNamespaceNameListContext.class,0);
		}
		public TraitAdaptationsContext traitAdaptations() {
			return getRuleContext(TraitAdaptationsContext.class,0);
		}
		public ClassStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).enterClassStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).exitClassStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PhpParserVisitor ) return ((PhpParserVisitor<? extends T>)visitor).visitClassStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassStatementContext classStatement() throws RecognitionException {
		ClassStatementContext _localctx = new ClassStatementContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_classStatement);
		int _la;
		try {
			setState(1034);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,102,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(977);
				attributes();
				setState(978);
				propertyModifiers();
				setState(980);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 44)) & ~0x3f) == 0 && ((1L << (_la - 44)) & ((1L << (Abstract - 44)) | (1L << (Array - 44)) | (1L << (As - 44)) | (1L << (BinaryCast - 44)) | (1L << (BoolType - 44)) | (1L << (BooleanConstant - 44)) | (1L << (Break - 44)) | (1L << (Callable - 44)) | (1L << (Case - 44)) | (1L << (Catch - 44)) | (1L << (Class - 44)) | (1L << (Clone - 44)) | (1L << (Const - 44)) | (1L << (Continue - 44)) | (1L << (Declare - 44)) | (1L << (Default - 44)) | (1L << (Do - 44)) | (1L << (DoubleCast - 44)) | (1L << (DoubleType - 44)) | (1L << (Echo - 44)) | (1L << (Else - 44)) | (1L << (ElseIf - 44)) | (1L << (Empty - 44)) | (1L << (EndDeclare - 44)) | (1L << (EndFor - 44)) | (1L << (EndForeach - 44)) | (1L << (EndIf - 44)) | (1L << (EndSwitch - 44)) | (1L << (EndWhile - 44)) | (1L << (Eval - 44)) | (1L << (Exit - 44)) | (1L << (Extends - 44)) | (1L << (Final - 44)) | (1L << (Finally - 44)) | (1L << (FloatCast - 44)) | (1L << (For - 44)) | (1L << (Foreach - 44)) | (1L << (Function - 44)) | (1L << (Global - 44)) | (1L << (Goto - 44)) | (1L << (If - 44)) | (1L << (Implements - 44)) | (1L << (Import - 44)) | (1L << (Include - 44)) | (1L << (IncludeOnce - 44)) | (1L << (InstanceOf - 44)) | (1L << (InsteadOf - 44)) | (1L << (Int8Cast - 44)) | (1L << (Int16Cast - 44)) | (1L << (Int64Type - 44)) | (1L << (IntType - 44)) | (1L << (Interface - 44)) | (1L << (IsSet - 44)) | (1L << (List - 44)) | (1L << (LogicalAnd - 44)) | (1L << (LogicalOr - 44)) | (1L << (LogicalXor - 44)) | (1L << (Namespace - 44)) | (1L << (New - 44)) | (1L << (Null - 44)) | (1L << (ObjectType - 44)) | (1L << (Parent_ - 44)) | (1L << (Partial - 44)) | (1L << (Print - 44)))) != 0) || ((((_la - 108)) & ~0x3f) == 0 && ((1L << (_la - 108)) & ((1L << (Private - 108)) | (1L << (Protected - 108)) | (1L << (Public - 108)) | (1L << (Require - 108)) | (1L << (RequireOnce - 108)) | (1L << (Resource - 108)) | (1L << (Return - 108)) | (1L << (Static - 108)) | (1L << (StringType - 108)) | (1L << (Switch - 108)) | (1L << (Throw - 108)) | (1L << (Trait - 108)) | (1L << (Try - 108)) | (1L << (Typeof - 108)) | (1L << (UintCast - 108)) | (1L << (UnicodeCast - 108)) | (1L << (Unset - 108)) | (1L << (Use - 108)) | (1L << (Var - 108)) | (1L << (While - 108)) | (1L << (Yield - 108)) | (1L << (From - 108)) | (1L << (Get - 108)) | (1L << (Set - 108)) | (1L << (Call - 108)) | (1L << (CallStatic - 108)) | (1L << (Constructor - 108)) | (1L << (Destruct - 108)) | (1L << (Wakeup - 108)) | (1L << (Sleep - 108)) | (1L << (Autoload - 108)) | (1L << (IsSet__ - 108)) | (1L << (Unset__ - 108)) | (1L << (ToString__ - 108)) | (1L << (Invoke - 108)) | (1L << (SetState - 108)) | (1L << (Clone__ - 108)) | (1L << (DebugInfo - 108)) | (1L << (Namespace__ - 108)) | (1L << (Class__ - 108)) | (1L << (Traic__ - 108)) | (1L << (Function__ - 108)) | (1L << (Method__ - 108)) | (1L << (Line__ - 108)) | (1L << (File__ - 108)) | (1L << (Dir__ - 108)))) != 0) || _la==NamespaceSeparator || _la==Label) {
					{
					setState(979);
					typeHint();
					}
				}

				setState(982);
				variableInitializer();
				setState(987);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Comma) {
					{
					{
					setState(983);
					match(Comma);
					setState(984);
					variableInitializer();
					}
					}
					setState(989);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(990);
				match(SemiColon);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(992);
				attributes();
				setState(994);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Abstract || ((((_la - 76)) & ~0x3f) == 0 && ((1L << (_la - 76)) & ((1L << (Final - 76)) | (1L << (Private - 76)) | (1L << (Protected - 76)) | (1L << (Public - 76)) | (1L << (Static - 76)))) != 0)) {
					{
					setState(993);
					memberModifiers();
					}
				}

				setState(996);
				match(Const);
				setState(998);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,96,_ctx) ) {
				case 1:
					{
					setState(997);
					typeHint();
					}
					break;
				}
				setState(1000);
				identifierInititalizer();
				setState(1005);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Comma) {
					{
					{
					setState(1001);
					match(Comma);
					setState(1002);
					identifierInititalizer();
					}
					}
					setState(1007);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1008);
				match(SemiColon);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1010);
				attributes();
				setState(1012);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Abstract || ((((_la - 76)) & ~0x3f) == 0 && ((1L << (_la - 76)) & ((1L << (Final - 76)) | (1L << (Private - 76)) | (1L << (Protected - 76)) | (1L << (Public - 76)) | (1L << (Static - 76)))) != 0)) {
					{
					setState(1011);
					memberModifiers();
					}
				}

				setState(1014);
				match(Function);
				setState(1016);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Ampersand) {
					{
					setState(1015);
					match(Ampersand);
					}
				}

				setState(1018);
				identifier();
				setState(1020);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Lgeneric) {
					{
					setState(1019);
					typeParameterListInBrackets();
					}
				}

				setState(1022);
				match(OpenRoundBracket);
				setState(1023);
				formalParameterList();
				setState(1024);
				match(CloseRoundBracket);
				setState(1026);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Colon) {
					{
					setState(1025);
					baseCtorCall();
					}
				}

				setState(1028);
				methodBody();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1030);
				match(Use);
				setState(1031);
				qualifiedNamespaceNameList();
				setState(1032);
				traitAdaptations();
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

	public static class TraitAdaptationsContext extends ParserRuleContext {
		public TerminalNode SemiColon() { return getToken(PhpParser.SemiColon, 0); }
		public TerminalNode OpenCurlyBracket() { return getToken(PhpParser.OpenCurlyBracket, 0); }
		public TerminalNode CloseCurlyBracket() { return getToken(PhpParser.CloseCurlyBracket, 0); }
		public List<TraitAdaptationStatementContext> traitAdaptationStatement() {
			return getRuleContexts(TraitAdaptationStatementContext.class);
		}
		public TraitAdaptationStatementContext traitAdaptationStatement(int i) {
			return getRuleContext(TraitAdaptationStatementContext.class,i);
		}
		public TraitAdaptationsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_traitAdaptations; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).enterTraitAdaptations(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).exitTraitAdaptations(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PhpParserVisitor ) return ((PhpParserVisitor<? extends T>)visitor).visitTraitAdaptations(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TraitAdaptationsContext traitAdaptations() throws RecognitionException {
		TraitAdaptationsContext _localctx = new TraitAdaptationsContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_traitAdaptations);
		int _la;
		try {
			setState(1045);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SemiColon:
				enterOuterAlt(_localctx, 1);
				{
				setState(1036);
				match(SemiColon);
				}
				break;
			case OpenCurlyBracket:
				enterOuterAlt(_localctx, 2);
				{
				setState(1037);
				match(OpenCurlyBracket);
				setState(1041);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 44)) & ~0x3f) == 0 && ((1L << (_la - 44)) & ((1L << (Abstract - 44)) | (1L << (Array - 44)) | (1L << (As - 44)) | (1L << (BinaryCast - 44)) | (1L << (BoolType - 44)) | (1L << (BooleanConstant - 44)) | (1L << (Break - 44)) | (1L << (Callable - 44)) | (1L << (Case - 44)) | (1L << (Catch - 44)) | (1L << (Class - 44)) | (1L << (Clone - 44)) | (1L << (Const - 44)) | (1L << (Continue - 44)) | (1L << (Declare - 44)) | (1L << (Default - 44)) | (1L << (Do - 44)) | (1L << (DoubleCast - 44)) | (1L << (DoubleType - 44)) | (1L << (Echo - 44)) | (1L << (Else - 44)) | (1L << (ElseIf - 44)) | (1L << (Empty - 44)) | (1L << (EndDeclare - 44)) | (1L << (EndFor - 44)) | (1L << (EndForeach - 44)) | (1L << (EndIf - 44)) | (1L << (EndSwitch - 44)) | (1L << (EndWhile - 44)) | (1L << (Eval - 44)) | (1L << (Exit - 44)) | (1L << (Extends - 44)) | (1L << (Final - 44)) | (1L << (Finally - 44)) | (1L << (FloatCast - 44)) | (1L << (For - 44)) | (1L << (Foreach - 44)) | (1L << (Function - 44)) | (1L << (Global - 44)) | (1L << (Goto - 44)) | (1L << (If - 44)) | (1L << (Implements - 44)) | (1L << (Import - 44)) | (1L << (Include - 44)) | (1L << (IncludeOnce - 44)) | (1L << (InstanceOf - 44)) | (1L << (InsteadOf - 44)) | (1L << (Int8Cast - 44)) | (1L << (Int16Cast - 44)) | (1L << (Int64Type - 44)) | (1L << (IntType - 44)) | (1L << (Interface - 44)) | (1L << (IsSet - 44)) | (1L << (List - 44)) | (1L << (LogicalAnd - 44)) | (1L << (LogicalOr - 44)) | (1L << (LogicalXor - 44)) | (1L << (Namespace - 44)) | (1L << (New - 44)) | (1L << (Null - 44)) | (1L << (ObjectType - 44)) | (1L << (Parent_ - 44)) | (1L << (Partial - 44)) | (1L << (Print - 44)))) != 0) || ((((_la - 108)) & ~0x3f) == 0 && ((1L << (_la - 108)) & ((1L << (Private - 108)) | (1L << (Protected - 108)) | (1L << (Public - 108)) | (1L << (Require - 108)) | (1L << (RequireOnce - 108)) | (1L << (Resource - 108)) | (1L << (Return - 108)) | (1L << (Static - 108)) | (1L << (StringType - 108)) | (1L << (Switch - 108)) | (1L << (Throw - 108)) | (1L << (Trait - 108)) | (1L << (Try - 108)) | (1L << (Typeof - 108)) | (1L << (UintCast - 108)) | (1L << (UnicodeCast - 108)) | (1L << (Unset - 108)) | (1L << (Use - 108)) | (1L << (Var - 108)) | (1L << (While - 108)) | (1L << (Yield - 108)) | (1L << (From - 108)) | (1L << (Get - 108)) | (1L << (Set - 108)) | (1L << (Call - 108)) | (1L << (CallStatic - 108)) | (1L << (Constructor - 108)) | (1L << (Destruct - 108)) | (1L << (Wakeup - 108)) | (1L << (Sleep - 108)) | (1L << (Autoload - 108)) | (1L << (IsSet__ - 108)) | (1L << (Unset__ - 108)) | (1L << (ToString__ - 108)) | (1L << (Invoke - 108)) | (1L << (SetState - 108)) | (1L << (Clone__ - 108)) | (1L << (DebugInfo - 108)) | (1L << (Namespace__ - 108)) | (1L << (Class__ - 108)) | (1L << (Traic__ - 108)) | (1L << (Function__ - 108)) | (1L << (Method__ - 108)) | (1L << (Line__ - 108)) | (1L << (File__ - 108)) | (1L << (Dir__ - 108)))) != 0) || _la==NamespaceSeparator || _la==Label) {
					{
					{
					setState(1038);
					traitAdaptationStatement();
					}
					}
					setState(1043);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1044);
				match(CloseCurlyBracket);
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

	public static class TraitAdaptationStatementContext extends ParserRuleContext {
		public TraitPrecedenceContext traitPrecedence() {
			return getRuleContext(TraitPrecedenceContext.class,0);
		}
		public TraitAliasContext traitAlias() {
			return getRuleContext(TraitAliasContext.class,0);
		}
		public TraitAdaptationStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_traitAdaptationStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).enterTraitAdaptationStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).exitTraitAdaptationStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PhpParserVisitor ) return ((PhpParserVisitor<? extends T>)visitor).visitTraitAdaptationStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TraitAdaptationStatementContext traitAdaptationStatement() throws RecognitionException {
		TraitAdaptationStatementContext _localctx = new TraitAdaptationStatementContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_traitAdaptationStatement);
		try {
			setState(1049);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,105,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1047);
				traitPrecedence();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1048);
				traitAlias();
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

	public static class TraitPrecedenceContext extends ParserRuleContext {
		public QualifiedNamespaceNameContext qualifiedNamespaceName() {
			return getRuleContext(QualifiedNamespaceNameContext.class,0);
		}
		public TerminalNode DoubleColon() { return getToken(PhpParser.DoubleColon, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode InsteadOf() { return getToken(PhpParser.InsteadOf, 0); }
		public QualifiedNamespaceNameListContext qualifiedNamespaceNameList() {
			return getRuleContext(QualifiedNamespaceNameListContext.class,0);
		}
		public TerminalNode SemiColon() { return getToken(PhpParser.SemiColon, 0); }
		public TraitPrecedenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_traitPrecedence; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).enterTraitPrecedence(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).exitTraitPrecedence(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PhpParserVisitor ) return ((PhpParserVisitor<? extends T>)visitor).visitTraitPrecedence(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TraitPrecedenceContext traitPrecedence() throws RecognitionException {
		TraitPrecedenceContext _localctx = new TraitPrecedenceContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_traitPrecedence);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1051);
			qualifiedNamespaceName();
			setState(1052);
			match(DoubleColon);
			setState(1053);
			identifier();
			setState(1054);
			match(InsteadOf);
			setState(1055);
			qualifiedNamespaceNameList();
			setState(1056);
			match(SemiColon);
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

	public static class TraitAliasContext extends ParserRuleContext {
		public TraitMethodReferenceContext traitMethodReference() {
			return getRuleContext(TraitMethodReferenceContext.class,0);
		}
		public TerminalNode As() { return getToken(PhpParser.As, 0); }
		public TerminalNode SemiColon() { return getToken(PhpParser.SemiColon, 0); }
		public MemberModifierContext memberModifier() {
			return getRuleContext(MemberModifierContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TraitAliasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_traitAlias; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).enterTraitAlias(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).exitTraitAlias(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PhpParserVisitor ) return ((PhpParserVisitor<? extends T>)visitor).visitTraitAlias(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TraitAliasContext traitAlias() throws RecognitionException {
		TraitAliasContext _localctx = new TraitAliasContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_traitAlias);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1058);
			traitMethodReference();
			setState(1059);
			match(As);
			setState(1065);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,107,_ctx) ) {
			case 1:
				{
				setState(1060);
				memberModifier();
				}
				break;
			case 2:
				{
				setState(1062);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,106,_ctx) ) {
				case 1:
					{
					setState(1061);
					memberModifier();
					}
					break;
				}
				setState(1064);
				identifier();
				}
				break;
			}
			setState(1067);
			match(SemiColon);
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

	public static class TraitMethodReferenceContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public QualifiedNamespaceNameContext qualifiedNamespaceName() {
			return getRuleContext(QualifiedNamespaceNameContext.class,0);
		}
		public TerminalNode DoubleColon() { return getToken(PhpParser.DoubleColon, 0); }
		public TraitMethodReferenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_traitMethodReference; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).enterTraitMethodReference(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).exitTraitMethodReference(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PhpParserVisitor ) return ((PhpParserVisitor<? extends T>)visitor).visitTraitMethodReference(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TraitMethodReferenceContext traitMethodReference() throws RecognitionException {
		TraitMethodReferenceContext _localctx = new TraitMethodReferenceContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_traitMethodReference);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1072);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,108,_ctx) ) {
			case 1:
				{
				setState(1069);
				qualifiedNamespaceName();
				setState(1070);
				match(DoubleColon);
				}
				break;
			}
			setState(1074);
			identifier();
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

	public static class BaseCtorCallContext extends ParserRuleContext {
		public TerminalNode Colon() { return getToken(PhpParser.Colon, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public BaseCtorCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_baseCtorCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).enterBaseCtorCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).exitBaseCtorCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PhpParserVisitor ) return ((PhpParserVisitor<? extends T>)visitor).visitBaseCtorCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BaseCtorCallContext baseCtorCall() throws RecognitionException {
		BaseCtorCallContext _localctx = new BaseCtorCallContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_baseCtorCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1076);
			match(Colon);
			setState(1077);
			identifier();
			setState(1079);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OpenRoundBracket) {
				{
				setState(1078);
				arguments();
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

	public static class MethodBodyContext extends ParserRuleContext {
		public TerminalNode SemiColon() { return getToken(PhpParser.SemiColon, 0); }
		public BlockStatementContext blockStatement() {
			return getRuleContext(BlockStatementContext.class,0);
		}
		public MethodBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).enterMethodBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).exitMethodBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PhpParserVisitor ) return ((PhpParserVisitor<? extends T>)visitor).visitMethodBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodBodyContext methodBody() throws RecognitionException {
		MethodBodyContext _localctx = new MethodBodyContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_methodBody);
		try {
			setState(1083);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SemiColon:
				enterOuterAlt(_localctx, 1);
				{
				setState(1081);
				match(SemiColon);
				}
				break;
			case OpenCurlyBracket:
				enterOuterAlt(_localctx, 2);
				{
				setState(1082);
				blockStatement();
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

	public static class PropertyModifiersContext extends ParserRuleContext {
		public MemberModifiersContext memberModifiers() {
			return getRuleContext(MemberModifiersContext.class,0);
		}
		public TerminalNode Var() { return getToken(PhpParser.Var, 0); }
		public PropertyModifiersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_propertyModifiers; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).enterPropertyModifiers(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).exitPropertyModifiers(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PhpParserVisitor ) return ((PhpParserVisitor<? extends T>)visitor).visitPropertyModifiers(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PropertyModifiersContext propertyModifiers() throws RecognitionException {
		PropertyModifiersContext _localctx = new PropertyModifiersContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_propertyModifiers);
		try {
			setState(1087);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Abstract:
			case Final:
			case Private:
			case Protected:
			case Public:
			case Static:
				enterOuterAlt(_localctx, 1);
				{
				setState(1085);
				memberModifiers();
				}
				break;
			case Var:
				enterOuterAlt(_localctx, 2);
				{
				setState(1086);
				match(Var);
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

	public static class MemberModifiersContext extends ParserRuleContext {
		public List<MemberModifierContext> memberModifier() {
			return getRuleContexts(MemberModifierContext.class);
		}
		public MemberModifierContext memberModifier(int i) {
			return getRuleContext(MemberModifierContext.class,i);
		}
		public MemberModifiersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_memberModifiers; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).enterMemberModifiers(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).exitMemberModifiers(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PhpParserVisitor ) return ((PhpParserVisitor<? extends T>)visitor).visitMemberModifiers(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MemberModifiersContext memberModifiers() throws RecognitionException {
		MemberModifiersContext _localctx = new MemberModifiersContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_memberModifiers);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1090); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(1089);
					memberModifier();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1092); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,112,_ctx);
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

	public static class VariableInitializerContext extends ParserRuleContext {
		public TerminalNode VarName() { return getToken(PhpParser.VarName, 0); }
		public TerminalNode Eq() { return getToken(PhpParser.Eq, 0); }
		public ConstantInititalizerContext constantInititalizer() {
			return getRuleContext(ConstantInititalizerContext.class,0);
		}
		public VariableInitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableInitializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).enterVariableInitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).exitVariableInitializer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PhpParserVisitor ) return ((PhpParserVisitor<? extends T>)visitor).visitVariableInitializer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableInitializerContext variableInitializer() throws RecognitionException {
		VariableInitializerContext _localctx = new VariableInitializerContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_variableInitializer);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1094);
			match(VarName);
			setState(1097);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Eq) {
				{
				setState(1095);
				match(Eq);
				setState(1096);
				constantInititalizer();
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

	public static class IdentifierInititalizerContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode Eq() { return getToken(PhpParser.Eq, 0); }
		public ConstantInititalizerContext constantInititalizer() {
			return getRuleContext(ConstantInititalizerContext.class,0);
		}
		public IdentifierInititalizerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifierInititalizer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).enterIdentifierInititalizer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).exitIdentifierInititalizer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PhpParserVisitor ) return ((PhpParserVisitor<? extends T>)visitor).visitIdentifierInititalizer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierInititalizerContext identifierInititalizer() throws RecognitionException {
		IdentifierInititalizerContext _localctx = new IdentifierInititalizerContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_identifierInititalizer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1099);
			identifier();
			setState(1100);
			match(Eq);
			setState(1101);
			constantInititalizer();
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

	public static class GlobalConstantDeclarationContext extends ParserRuleContext {
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public TerminalNode Const() { return getToken(PhpParser.Const, 0); }
		public List<IdentifierInititalizerContext> identifierInititalizer() {
			return getRuleContexts(IdentifierInititalizerContext.class);
		}
		public IdentifierInititalizerContext identifierInititalizer(int i) {
			return getRuleContext(IdentifierInititalizerContext.class,i);
		}
		public TerminalNode SemiColon() { return getToken(PhpParser.SemiColon, 0); }
		public List<TerminalNode> Comma() { return getTokens(PhpParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(PhpParser.Comma, i);
		}
		public GlobalConstantDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_globalConstantDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).enterGlobalConstantDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).exitGlobalConstantDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PhpParserVisitor ) return ((PhpParserVisitor<? extends T>)visitor).visitGlobalConstantDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GlobalConstantDeclarationContext globalConstantDeclaration() throws RecognitionException {
		GlobalConstantDeclarationContext _localctx = new GlobalConstantDeclarationContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_globalConstantDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1103);
			attributes();
			setState(1104);
			match(Const);
			setState(1105);
			identifierInititalizer();
			setState(1110);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(1106);
				match(Comma);
				setState(1107);
				identifierInititalizer();
				}
				}
				setState(1112);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1113);
			match(SemiColon);
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

	public static class ExpressionListContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(PhpParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(PhpParser.Comma, i);
		}
		public ExpressionListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).enterExpressionList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).exitExpressionList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PhpParserVisitor ) return ((PhpParserVisitor<? extends T>)visitor).visitExpressionList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionListContext expressionList() throws RecognitionException {
		ExpressionListContext _localctx = new ExpressionListContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_expressionList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1115);
			expression(0);
			setState(1120);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(1116);
				match(Comma);
				setState(1117);
				expression(0);
				}
				}
				setState(1122);
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

	public static class ParenthesesContext extends ParserRuleContext {
		public TerminalNode OpenRoundBracket() { return getToken(PhpParser.OpenRoundBracket, 0); }
		public TerminalNode CloseRoundBracket() { return getToken(PhpParser.CloseRoundBracket, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public YieldExpressionContext yieldExpression() {
			return getRuleContext(YieldExpressionContext.class,0);
		}
		public ParenthesesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parentheses; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).enterParentheses(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).exitParentheses(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PhpParserVisitor ) return ((PhpParserVisitor<? extends T>)visitor).visitParentheses(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParenthesesContext parentheses() throws RecognitionException {
		ParenthesesContext _localctx = new ParenthesesContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_parentheses);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1123);
			match(OpenRoundBracket);
			setState(1126);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,116,_ctx) ) {
			case 1:
				{
				setState(1124);
				expression(0);
				}
				break;
			case 2:
				{
				setState(1125);
				yieldExpression();
				}
				break;
			}
			setState(1128);
			match(CloseRoundBracket);
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
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	 
		public ExpressionContext() { }
		public void copyFrom(ExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ChainExpressionContext extends ExpressionContext {
		public ChainContext chain() {
			return getRuleContext(ChainContext.class,0);
		}
		public ChainExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).enterChainExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).exitChainExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PhpParserVisitor ) return ((PhpParserVisitor<? extends T>)visitor).visitChainExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UnaryOperatorExpressionContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode Tilde() { return getToken(PhpParser.Tilde, 0); }
		public TerminalNode SuppressWarnings() { return getToken(PhpParser.SuppressWarnings, 0); }
		public TerminalNode Bang() { return getToken(PhpParser.Bang, 0); }
		public TerminalNode Plus() { return getToken(PhpParser.Plus, 0); }
		public TerminalNode Minus() { return getToken(PhpParser.Minus, 0); }
		public UnaryOperatorExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).enterUnaryOperatorExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).exitUnaryOperatorExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PhpParserVisitor ) return ((PhpParserVisitor<? extends T>)visitor).visitUnaryOperatorExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SpecialWordExpressionContext extends ExpressionContext {
		public TerminalNode Yield() { return getToken(PhpParser.Yield, 0); }
		public TerminalNode List() { return getToken(PhpParser.List, 0); }
		public TerminalNode OpenRoundBracket() { return getToken(PhpParser.OpenRoundBracket, 0); }
		public AssignmentListContext assignmentList() {
			return getRuleContext(AssignmentListContext.class,0);
		}
		public TerminalNode CloseRoundBracket() { return getToken(PhpParser.CloseRoundBracket, 0); }
		public TerminalNode Eq() { return getToken(PhpParser.Eq, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode IsSet() { return getToken(PhpParser.IsSet, 0); }
		public ChainListContext chainList() {
			return getRuleContext(ChainListContext.class,0);
		}
		public TerminalNode Empty() { return getToken(PhpParser.Empty, 0); }
		public ChainContext chain() {
			return getRuleContext(ChainContext.class,0);
		}
		public TerminalNode Eval() { return getToken(PhpParser.Eval, 0); }
		public TerminalNode Exit() { return getToken(PhpParser.Exit, 0); }
		public ParenthesesContext parentheses() {
			return getRuleContext(ParenthesesContext.class,0);
		}
		public TerminalNode Include() { return getToken(PhpParser.Include, 0); }
		public TerminalNode IncludeOnce() { return getToken(PhpParser.IncludeOnce, 0); }
		public TerminalNode Require() { return getToken(PhpParser.Require, 0); }
		public TerminalNode RequireOnce() { return getToken(PhpParser.RequireOnce, 0); }
		public SpecialWordExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).enterSpecialWordExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).exitSpecialWordExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PhpParserVisitor ) return ((PhpParserVisitor<? extends T>)visitor).visitSpecialWordExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ArrayCreationExpressionContext extends ExpressionContext {
		public ArrayCreationContext arrayCreation() {
			return getRuleContext(ArrayCreationContext.class,0);
		}
		public ArrayCreationExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).enterArrayCreationExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).exitArrayCreationExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PhpParserVisitor ) return ((PhpParserVisitor<? extends T>)visitor).visitArrayCreationExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NewExpressionContext extends ExpressionContext {
		public NewExprContext newExpr() {
			return getRuleContext(NewExprContext.class,0);
		}
		public NewExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).enterNewExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).exitNewExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PhpParserVisitor ) return ((PhpParserVisitor<? extends T>)visitor).visitNewExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ParenthesisExpressionContext extends ExpressionContext {
		public ParenthesesContext parentheses() {
			return getRuleContext(ParenthesesContext.class,0);
		}
		public ParenthesisExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).enterParenthesisExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).exitParenthesisExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PhpParserVisitor ) return ((PhpParserVisitor<? extends T>)visitor).visitParenthesisExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SpaceshipExpressionContext extends ExpressionContext {
		public Token op;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode Spaceship() { return getToken(PhpParser.Spaceship, 0); }
		public SpaceshipExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).enterSpaceshipExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).exitSpaceshipExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PhpParserVisitor ) return ((PhpParserVisitor<? extends T>)visitor).visitSpaceshipExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BackQuoteStringExpressionContext extends ExpressionContext {
		public TerminalNode BackQuoteString() { return getToken(PhpParser.BackQuoteString, 0); }
		public BackQuoteStringExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).enterBackQuoteStringExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).exitBackQuoteStringExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PhpParserVisitor ) return ((PhpParserVisitor<? extends T>)visitor).visitBackQuoteStringExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ConditionalExpressionContext extends ExpressionContext {
		public Token op;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode Colon() { return getToken(PhpParser.Colon, 0); }
		public TerminalNode QuestionMark() { return getToken(PhpParser.QuestionMark, 0); }
		public ConditionalExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).enterConditionalExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).exitConditionalExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PhpParserVisitor ) return ((PhpParserVisitor<? extends T>)visitor).visitConditionalExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NullCoalescingExpressionContext extends ExpressionContext {
		public Token op;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode NullCoalescing() { return getToken(PhpParser.NullCoalescing, 0); }
		public NullCoalescingExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).enterNullCoalescingExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).exitNullCoalescingExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PhpParserVisitor ) return ((PhpParserVisitor<? extends T>)visitor).visitNullCoalescingExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ArithmeticExpressionContext extends ExpressionContext {
		public Token op;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode Pow() { return getToken(PhpParser.Pow, 0); }
		public TerminalNode Asterisk() { return getToken(PhpParser.Asterisk, 0); }
		public TerminalNode Divide() { return getToken(PhpParser.Divide, 0); }
		public TerminalNode Percent() { return getToken(PhpParser.Percent, 0); }
		public TerminalNode Plus() { return getToken(PhpParser.Plus, 0); }
		public TerminalNode Minus() { return getToken(PhpParser.Minus, 0); }
		public TerminalNode Dot() { return getToken(PhpParser.Dot, 0); }
		public ArithmeticExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).enterArithmeticExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).exitArithmeticExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PhpParserVisitor ) return ((PhpParserVisitor<? extends T>)visitor).visitArithmeticExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IndexerExpressionContext extends ExpressionContext {
		public StringConstantContext stringConstant() {
			return getRuleContext(StringConstantContext.class,0);
		}
		public TerminalNode OpenSquareBracket() { return getToken(PhpParser.OpenSquareBracket, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode CloseSquareBracket() { return getToken(PhpParser.CloseSquareBracket, 0); }
		public IndexerExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).enterIndexerExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).exitIndexerExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PhpParserVisitor ) return ((PhpParserVisitor<? extends T>)visitor).visitIndexerExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ScalarExpressionContext extends ExpressionContext {
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public TerminalNode Label() { return getToken(PhpParser.Label, 0); }
		public ScalarExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).enterScalarExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).exitScalarExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PhpParserVisitor ) return ((PhpParserVisitor<? extends T>)visitor).visitScalarExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PrefixIncDecExpressionContext extends ExpressionContext {
		public ChainContext chain() {
			return getRuleContext(ChainContext.class,0);
		}
		public TerminalNode Inc() { return getToken(PhpParser.Inc, 0); }
		public TerminalNode Dec() { return getToken(PhpParser.Dec, 0); }
		public PrefixIncDecExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).enterPrefixIncDecExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).exitPrefixIncDecExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PhpParserVisitor ) return ((PhpParserVisitor<? extends T>)visitor).visitPrefixIncDecExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ComparisonExpressionContext extends ExpressionContext {
		public Token op;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode ShiftLeft() { return getToken(PhpParser.ShiftLeft, 0); }
		public TerminalNode ShiftRight() { return getToken(PhpParser.ShiftRight, 0); }
		public TerminalNode Less() { return getToken(PhpParser.Less, 0); }
		public TerminalNode IsSmallerOrEqual() { return getToken(PhpParser.IsSmallerOrEqual, 0); }
		public TerminalNode Greater() { return getToken(PhpParser.Greater, 0); }
		public TerminalNode IsGreaterOrEqual() { return getToken(PhpParser.IsGreaterOrEqual, 0); }
		public TerminalNode IsIdentical() { return getToken(PhpParser.IsIdentical, 0); }
		public TerminalNode IsNoidentical() { return getToken(PhpParser.IsNoidentical, 0); }
		public TerminalNode IsEqual() { return getToken(PhpParser.IsEqual, 0); }
		public TerminalNode IsNotEq() { return getToken(PhpParser.IsNotEq, 0); }
		public ComparisonExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).enterComparisonExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).exitComparisonExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PhpParserVisitor ) return ((PhpParserVisitor<? extends T>)visitor).visitComparisonExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LogicalExpressionContext extends ExpressionContext {
		public Token op;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode LogicalAnd() { return getToken(PhpParser.LogicalAnd, 0); }
		public TerminalNode LogicalXor() { return getToken(PhpParser.LogicalXor, 0); }
		public TerminalNode LogicalOr() { return getToken(PhpParser.LogicalOr, 0); }
		public LogicalExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).enterLogicalExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).exitLogicalExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PhpParserVisitor ) return ((PhpParserVisitor<? extends T>)visitor).visitLogicalExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PrintExpressionContext extends ExpressionContext {
		public TerminalNode Print() { return getToken(PhpParser.Print, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public PrintExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).enterPrintExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).exitPrintExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PhpParserVisitor ) return ((PhpParserVisitor<? extends T>)visitor).visitPrintExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AssignmentExpressionContext extends ExpressionContext {
		public AssignableContext assignable() {
			return getRuleContext(AssignableContext.class,0);
		}
		public AssignmentOperatorContext assignmentOperator() {
			return getRuleContext(AssignmentOperatorContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode Eq() { return getToken(PhpParser.Eq, 0); }
		public TerminalNode Ampersand() { return getToken(PhpParser.Ampersand, 0); }
		public ChainContext chain() {
			return getRuleContext(ChainContext.class,0);
		}
		public NewExprContext newExpr() {
			return getRuleContext(NewExprContext.class,0);
		}
		public AssignmentExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).enterAssignmentExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).exitAssignmentExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PhpParserVisitor ) return ((PhpParserVisitor<? extends T>)visitor).visitAssignmentExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PostfixIncDecExpressionContext extends ExpressionContext {
		public ChainContext chain() {
			return getRuleContext(ChainContext.class,0);
		}
		public TerminalNode Inc() { return getToken(PhpParser.Inc, 0); }
		public TerminalNode Dec() { return getToken(PhpParser.Dec, 0); }
		public PostfixIncDecExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).enterPostfixIncDecExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).exitPostfixIncDecExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PhpParserVisitor ) return ((PhpParserVisitor<? extends T>)visitor).visitPostfixIncDecExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CastExpressionContext extends ExpressionContext {
		public TerminalNode OpenRoundBracket() { return getToken(PhpParser.OpenRoundBracket, 0); }
		public CastOperationContext castOperation() {
			return getRuleContext(CastOperationContext.class,0);
		}
		public TerminalNode CloseRoundBracket() { return getToken(PhpParser.CloseRoundBracket, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public CastExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).enterCastExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).exitCastExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PhpParserVisitor ) return ((PhpParserVisitor<? extends T>)visitor).visitCastExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class InstanceOfExpressionContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode InstanceOf() { return getToken(PhpParser.InstanceOf, 0); }
		public TypeRefContext typeRef() {
			return getRuleContext(TypeRefContext.class,0);
		}
		public InstanceOfExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).enterInstanceOfExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).exitInstanceOfExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PhpParserVisitor ) return ((PhpParserVisitor<? extends T>)visitor).visitInstanceOfExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LambdaFunctionExpressionContext extends ExpressionContext {
		public LambdaFunctionExprContext lambdaFunctionExpr() {
			return getRuleContext(LambdaFunctionExprContext.class,0);
		}
		public LambdaFunctionExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).enterLambdaFunctionExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).exitLambdaFunctionExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PhpParserVisitor ) return ((PhpParserVisitor<? extends T>)visitor).visitLambdaFunctionExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BitwiseExpressionContext extends ExpressionContext {
		public Token op;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode Ampersand() { return getToken(PhpParser.Ampersand, 0); }
		public TerminalNode Caret() { return getToken(PhpParser.Caret, 0); }
		public TerminalNode Pipe() { return getToken(PhpParser.Pipe, 0); }
		public TerminalNode BooleanAnd() { return getToken(PhpParser.BooleanAnd, 0); }
		public TerminalNode BooleanOr() { return getToken(PhpParser.BooleanOr, 0); }
		public BitwiseExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).enterBitwiseExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).exitBitwiseExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PhpParserVisitor ) return ((PhpParserVisitor<? extends T>)visitor).visitBitwiseExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CloneExpressionContext extends ExpressionContext {
		public TerminalNode Clone() { return getToken(PhpParser.Clone, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public CloneExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).enterCloneExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).exitCloneExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PhpParserVisitor ) return ((PhpParserVisitor<? extends T>)visitor).visitCloneExpression(this);
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
		int _startState = 166;
		enterRecursionRule(_localctx, 166, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1207);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,119,_ctx) ) {
			case 1:
				{
				_localctx = new CloneExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(1131);
				match(Clone);
				setState(1132);
				expression(45);
				}
				break;
			case 2:
				{
				_localctx = new NewExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1133);
				newExpr();
				}
				break;
			case 3:
				{
				_localctx = new IndexerExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1134);
				stringConstant();
				setState(1135);
				match(OpenSquareBracket);
				setState(1136);
				expression(0);
				setState(1137);
				match(CloseSquareBracket);
				}
				break;
			case 4:
				{
				_localctx = new CastExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1139);
				match(OpenRoundBracket);
				setState(1140);
				castOperation();
				setState(1141);
				match(CloseRoundBracket);
				setState(1142);
				expression(42);
				}
				break;
			case 5:
				{
				_localctx = new UnaryOperatorExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1144);
				_la = _input.LA(1);
				if ( !(_la==Tilde || _la==SuppressWarnings) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1145);
				expression(41);
				}
				break;
			case 6:
				{
				_localctx = new UnaryOperatorExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1146);
				_la = _input.LA(1);
				if ( !(((((_la - 194)) & ~0x3f) == 0 && ((1L << (_la - 194)) & ((1L << (Bang - 194)) | (1L << (Plus - 194)) | (1L << (Minus - 194)))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1147);
				expression(40);
				}
				break;
			case 7:
				{
				_localctx = new PrefixIncDecExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1148);
				_la = _input.LA(1);
				if ( !(_la==Inc || _la==Dec) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1149);
				chain();
				}
				break;
			case 8:
				{
				_localctx = new PostfixIncDecExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1150);
				chain();
				setState(1151);
				_la = _input.LA(1);
				if ( !(_la==Inc || _la==Dec) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 9:
				{
				_localctx = new PrintExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1153);
				match(Print);
				setState(1154);
				expression(37);
				}
				break;
			case 10:
				{
				_localctx = new ChainExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1155);
				chain();
				}
				break;
			case 11:
				{
				_localctx = new ScalarExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1156);
				constant();
				}
				break;
			case 12:
				{
				_localctx = new ScalarExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1157);
				string();
				}
				break;
			case 13:
				{
				_localctx = new ScalarExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1158);
				match(Label);
				}
				break;
			case 14:
				{
				_localctx = new BackQuoteStringExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1159);
				match(BackQuoteString);
				}
				break;
			case 15:
				{
				_localctx = new ParenthesisExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1160);
				parentheses();
				}
				break;
			case 16:
				{
				_localctx = new ArrayCreationExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1161);
				arrayCreation();
				}
				break;
			case 17:
				{
				_localctx = new SpecialWordExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1162);
				match(Yield);
				}
				break;
			case 18:
				{
				_localctx = new SpecialWordExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1163);
				match(List);
				setState(1164);
				match(OpenRoundBracket);
				setState(1165);
				assignmentList();
				setState(1166);
				match(CloseRoundBracket);
				setState(1167);
				match(Eq);
				setState(1168);
				expression(28);
				}
				break;
			case 19:
				{
				_localctx = new SpecialWordExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1170);
				match(IsSet);
				setState(1171);
				match(OpenRoundBracket);
				setState(1172);
				chainList();
				setState(1173);
				match(CloseRoundBracket);
				}
				break;
			case 20:
				{
				_localctx = new SpecialWordExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1175);
				match(Empty);
				setState(1176);
				match(OpenRoundBracket);
				setState(1177);
				chain();
				setState(1178);
				match(CloseRoundBracket);
				}
				break;
			case 21:
				{
				_localctx = new SpecialWordExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1180);
				match(Eval);
				setState(1181);
				match(OpenRoundBracket);
				setState(1182);
				expression(0);
				setState(1183);
				match(CloseRoundBracket);
				}
				break;
			case 22:
				{
				_localctx = new SpecialWordExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1185);
				match(Exit);
				setState(1189);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,117,_ctx) ) {
				case 1:
					{
					setState(1186);
					match(OpenRoundBracket);
					setState(1187);
					match(CloseRoundBracket);
					}
					break;
				case 2:
					{
					setState(1188);
					parentheses();
					}
					break;
				}
				}
				break;
			case 23:
				{
				_localctx = new SpecialWordExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1191);
				_la = _input.LA(1);
				if ( !(_la==Include || _la==IncludeOnce) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1192);
				expression(23);
				}
				break;
			case 24:
				{
				_localctx = new SpecialWordExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1193);
				_la = _input.LA(1);
				if ( !(_la==Require || _la==RequireOnce) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1194);
				expression(22);
				}
				break;
			case 25:
				{
				_localctx = new LambdaFunctionExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1195);
				lambdaFunctionExpr();
				}
				break;
			case 26:
				{
				_localctx = new AssignmentExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1196);
				assignable();
				setState(1197);
				assignmentOperator();
				setState(1198);
				expression(5);
				}
				break;
			case 27:
				{
				_localctx = new AssignmentExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1200);
				assignable();
				setState(1201);
				match(Eq);
				setState(1202);
				match(Ampersand);
				setState(1205);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,118,_ctx) ) {
				case 1:
					{
					setState(1203);
					chain();
					}
					break;
				case 2:
					{
					setState(1204);
					newExpr();
					}
					break;
				}
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(1269);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,122,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1267);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,121,_ctx) ) {
					case 1:
						{
						_localctx = new ArithmeticExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1209);
						if (!(precpred(_ctx, 20))) throw new FailedPredicateException(this, "precpred(_ctx, 20)");
						setState(1210);
						((ArithmeticExpressionContext)_localctx).op = match(Pow);
						setState(1211);
						expression(20);
						}
						break;
					case 2:
						{
						_localctx = new ArithmeticExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1212);
						if (!(precpred(_ctx, 18))) throw new FailedPredicateException(this, "precpred(_ctx, 18)");
						setState(1213);
						((ArithmeticExpressionContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(((((_la - 198)) & ~0x3f) == 0 && ((1L << (_la - 198)) & ((1L << (Asterisk - 198)) | (1L << (Percent - 198)) | (1L << (Divide - 198)))) != 0)) ) {
							((ArithmeticExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1214);
						expression(19);
						}
						break;
					case 3:
						{
						_localctx = new ArithmeticExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1215);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(1216);
						((ArithmeticExpressionContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(((((_la - 196)) & ~0x3f) == 0 && ((1L << (_la - 196)) & ((1L << (Plus - 196)) | (1L << (Minus - 196)) | (1L << (Dot - 196)))) != 0)) ) {
							((ArithmeticExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1217);
						expression(18);
						}
						break;
					case 4:
						{
						_localctx = new ComparisonExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1218);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(1219);
						((ComparisonExpressionContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==ShiftLeft || _la==ShiftRight) ) {
							((ComparisonExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1220);
						expression(17);
						}
						break;
					case 5:
						{
						_localctx = new ComparisonExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1221);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(1222);
						((ComparisonExpressionContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(((((_la - 165)) & ~0x3f) == 0 && ((1L << (_la - 165)) & ((1L << (IsSmallerOrEqual - 165)) | (1L << (IsGreaterOrEqual - 165)) | (1L << (Less - 165)) | (1L << (Greater - 165)))) != 0)) ) {
							((ComparisonExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1223);
						expression(16);
						}
						break;
					case 6:
						{
						_localctx = new ComparisonExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1224);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(1225);
						((ComparisonExpressionContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(((((_la - 161)) & ~0x3f) == 0 && ((1L << (_la - 161)) & ((1L << (IsIdentical - 161)) | (1L << (IsNoidentical - 161)) | (1L << (IsEqual - 161)) | (1L << (IsNotEq - 161)))) != 0)) ) {
							((ComparisonExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1226);
						expression(15);
						}
						break;
					case 7:
						{
						_localctx = new BitwiseExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1227);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(1228);
						((BitwiseExpressionContext)_localctx).op = match(Ampersand);
						setState(1229);
						expression(14);
						}
						break;
					case 8:
						{
						_localctx = new BitwiseExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1230);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(1231);
						((BitwiseExpressionContext)_localctx).op = match(Caret);
						setState(1232);
						expression(13);
						}
						break;
					case 9:
						{
						_localctx = new BitwiseExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1233);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(1234);
						((BitwiseExpressionContext)_localctx).op = match(Pipe);
						setState(1235);
						expression(12);
						}
						break;
					case 10:
						{
						_localctx = new BitwiseExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1236);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(1237);
						((BitwiseExpressionContext)_localctx).op = match(BooleanAnd);
						setState(1238);
						expression(11);
						}
						break;
					case 11:
						{
						_localctx = new BitwiseExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1239);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(1240);
						((BitwiseExpressionContext)_localctx).op = match(BooleanOr);
						setState(1241);
						expression(10);
						}
						break;
					case 12:
						{
						_localctx = new ConditionalExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1242);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(1243);
						((ConditionalExpressionContext)_localctx).op = match(QuestionMark);
						setState(1245);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (((((_la - 44)) & ~0x3f) == 0 && ((1L << (_la - 44)) & ((1L << (Abstract - 44)) | (1L << (Array - 44)) | (1L << (As - 44)) | (1L << (BinaryCast - 44)) | (1L << (BoolType - 44)) | (1L << (BooleanConstant - 44)) | (1L << (Break - 44)) | (1L << (Callable - 44)) | (1L << (Case - 44)) | (1L << (Catch - 44)) | (1L << (Class - 44)) | (1L << (Clone - 44)) | (1L << (Const - 44)) | (1L << (Continue - 44)) | (1L << (Declare - 44)) | (1L << (Default - 44)) | (1L << (Do - 44)) | (1L << (DoubleCast - 44)) | (1L << (DoubleType - 44)) | (1L << (Echo - 44)) | (1L << (Else - 44)) | (1L << (ElseIf - 44)) | (1L << (Empty - 44)) | (1L << (EndDeclare - 44)) | (1L << (EndFor - 44)) | (1L << (EndForeach - 44)) | (1L << (EndIf - 44)) | (1L << (EndSwitch - 44)) | (1L << (EndWhile - 44)) | (1L << (Eval - 44)) | (1L << (Exit - 44)) | (1L << (Extends - 44)) | (1L << (Final - 44)) | (1L << (Finally - 44)) | (1L << (FloatCast - 44)) | (1L << (For - 44)) | (1L << (Foreach - 44)) | (1L << (Function - 44)) | (1L << (Global - 44)) | (1L << (Goto - 44)) | (1L << (If - 44)) | (1L << (Implements - 44)) | (1L << (Import - 44)) | (1L << (Include - 44)) | (1L << (IncludeOnce - 44)) | (1L << (InstanceOf - 44)) | (1L << (InsteadOf - 44)) | (1L << (Int8Cast - 44)) | (1L << (Int16Cast - 44)) | (1L << (Int64Type - 44)) | (1L << (IntType - 44)) | (1L << (Interface - 44)) | (1L << (IsSet - 44)) | (1L << (List - 44)) | (1L << (LogicalAnd - 44)) | (1L << (LogicalOr - 44)) | (1L << (LogicalXor - 44)) | (1L << (Namespace - 44)) | (1L << (New - 44)) | (1L << (Null - 44)) | (1L << (ObjectType - 44)) | (1L << (Parent_ - 44)) | (1L << (Partial - 44)) | (1L << (Print - 44)))) != 0) || ((((_la - 108)) & ~0x3f) == 0 && ((1L << (_la - 108)) & ((1L << (Private - 108)) | (1L << (Protected - 108)) | (1L << (Public - 108)) | (1L << (Require - 108)) | (1L << (RequireOnce - 108)) | (1L << (Resource - 108)) | (1L << (Return - 108)) | (1L << (Static - 108)) | (1L << (StringType - 108)) | (1L << (Switch - 108)) | (1L << (Throw - 108)) | (1L << (Trait - 108)) | (1L << (Try - 108)) | (1L << (Typeof - 108)) | (1L << (UintCast - 108)) | (1L << (UnicodeCast - 108)) | (1L << (Unset - 108)) | (1L << (Use - 108)) | (1L << (Var - 108)) | (1L << (While - 108)) | (1L << (Yield - 108)) | (1L << (From - 108)) | (1L << (LambdaFn - 108)) | (1L << (Get - 108)) | (1L << (Set - 108)) | (1L << (Call - 108)) | (1L << (CallStatic - 108)) | (1L << (Constructor - 108)) | (1L << (Destruct - 108)) | (1L << (Wakeup - 108)) | (1L << (Sleep - 108)) | (1L << (Autoload - 108)) | (1L << (IsSet__ - 108)) | (1L << (Unset__ - 108)) | (1L << (ToString__ - 108)) | (1L << (Invoke - 108)) | (1L << (SetState - 108)) | (1L << (Clone__ - 108)) | (1L << (DebugInfo - 108)) | (1L << (Namespace__ - 108)) | (1L << (Class__ - 108)) | (1L << (Traic__ - 108)) | (1L << (Function__ - 108)) | (1L << (Method__ - 108)) | (1L << (Line__ - 108)) | (1L << (File__ - 108)) | (1L << (Dir__ - 108)) | (1L << (Inc - 108)) | (1L << (Dec - 108)))) != 0) || ((((_la - 188)) & ~0x3f) == 0 && ((1L << (_la - 188)) & ((1L << (NamespaceSeparator - 188)) | (1L << (Bang - 188)) | (1L << (Plus - 188)) | (1L << (Minus - 188)) | (1L << (Tilde - 188)) | (1L << (SuppressWarnings - 188)) | (1L << (Dollar - 188)) | (1L << (OpenRoundBracket - 188)) | (1L << (OpenSquareBracket - 188)) | (1L << (VarName - 188)) | (1L << (Label - 188)) | (1L << (Octal - 188)) | (1L << (Decimal - 188)) | (1L << (Real - 188)) | (1L << (Hex - 188)) | (1L << (Binary - 188)) | (1L << (BackQuoteString - 188)) | (1L << (SingleQuoteString - 188)) | (1L << (DoubleQuote - 188)) | (1L << (StartNowDoc - 188)) | (1L << (StartHereDoc - 188)))) != 0)) {
							{
							setState(1244);
							expression(0);
							}
						}

						setState(1247);
						match(Colon);
						setState(1248);
						expression(9);
						}
						break;
					case 13:
						{
						_localctx = new NullCoalescingExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1249);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(1250);
						((NullCoalescingExpressionContext)_localctx).op = match(NullCoalescing);
						setState(1251);
						expression(8);
						}
						break;
					case 14:
						{
						_localctx = new SpaceshipExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1252);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(1253);
						((SpaceshipExpressionContext)_localctx).op = match(Spaceship);
						setState(1254);
						expression(7);
						}
						break;
					case 15:
						{
						_localctx = new LogicalExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1255);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(1256);
						((LogicalExpressionContext)_localctx).op = match(LogicalAnd);
						setState(1257);
						expression(4);
						}
						break;
					case 16:
						{
						_localctx = new LogicalExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1258);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(1259);
						((LogicalExpressionContext)_localctx).op = match(LogicalXor);
						setState(1260);
						expression(3);
						}
						break;
					case 17:
						{
						_localctx = new LogicalExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1261);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(1262);
						((LogicalExpressionContext)_localctx).op = match(LogicalOr);
						setState(1263);
						expression(2);
						}
						break;
					case 18:
						{
						_localctx = new InstanceOfExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1264);
						if (!(precpred(_ctx, 19))) throw new FailedPredicateException(this, "precpred(_ctx, 19)");
						setState(1265);
						match(InstanceOf);
						setState(1266);
						typeRef();
						}
						break;
					}
					} 
				}
				setState(1271);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,122,_ctx);
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

	public static class AssignableContext extends ParserRuleContext {
		public ChainContext chain() {
			return getRuleContext(ChainContext.class,0);
		}
		public ArrayCreationContext arrayCreation() {
			return getRuleContext(ArrayCreationContext.class,0);
		}
		public AssignableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).enterAssignable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).exitAssignable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PhpParserVisitor ) return ((PhpParserVisitor<? extends T>)visitor).visitAssignable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignableContext assignable() throws RecognitionException {
		AssignableContext _localctx = new AssignableContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_assignable);
		try {
			setState(1274);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,123,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1272);
				chain();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1273);
				arrayCreation();
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

	public static class ArrayCreationContext extends ParserRuleContext {
		public TerminalNode Array() { return getToken(PhpParser.Array, 0); }
		public TerminalNode OpenRoundBracket() { return getToken(PhpParser.OpenRoundBracket, 0); }
		public TerminalNode CloseRoundBracket() { return getToken(PhpParser.CloseRoundBracket, 0); }
		public List<TerminalNode> OpenSquareBracket() { return getTokens(PhpParser.OpenSquareBracket); }
		public TerminalNode OpenSquareBracket(int i) {
			return getToken(PhpParser.OpenSquareBracket, i);
		}
		public List<TerminalNode> CloseSquareBracket() { return getTokens(PhpParser.CloseSquareBracket); }
		public TerminalNode CloseSquareBracket(int i) {
			return getToken(PhpParser.CloseSquareBracket, i);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ArrayItemListContext arrayItemList() {
			return getRuleContext(ArrayItemListContext.class,0);
		}
		public ArrayCreationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayCreation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).enterArrayCreation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).exitArrayCreation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PhpParserVisitor ) return ((PhpParserVisitor<? extends T>)visitor).visitArrayCreation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayCreationContext arrayCreation() throws RecognitionException {
		ArrayCreationContext _localctx = new ArrayCreationContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_arrayCreation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1287);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Array:
				{
				setState(1276);
				match(Array);
				setState(1277);
				match(OpenRoundBracket);
				setState(1279);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 44)) & ~0x3f) == 0 && ((1L << (_la - 44)) & ((1L << (Abstract - 44)) | (1L << (Array - 44)) | (1L << (As - 44)) | (1L << (BinaryCast - 44)) | (1L << (BoolType - 44)) | (1L << (BooleanConstant - 44)) | (1L << (Break - 44)) | (1L << (Callable - 44)) | (1L << (Case - 44)) | (1L << (Catch - 44)) | (1L << (Class - 44)) | (1L << (Clone - 44)) | (1L << (Const - 44)) | (1L << (Continue - 44)) | (1L << (Declare - 44)) | (1L << (Default - 44)) | (1L << (Do - 44)) | (1L << (DoubleCast - 44)) | (1L << (DoubleType - 44)) | (1L << (Echo - 44)) | (1L << (Else - 44)) | (1L << (ElseIf - 44)) | (1L << (Empty - 44)) | (1L << (EndDeclare - 44)) | (1L << (EndFor - 44)) | (1L << (EndForeach - 44)) | (1L << (EndIf - 44)) | (1L << (EndSwitch - 44)) | (1L << (EndWhile - 44)) | (1L << (Eval - 44)) | (1L << (Exit - 44)) | (1L << (Extends - 44)) | (1L << (Final - 44)) | (1L << (Finally - 44)) | (1L << (FloatCast - 44)) | (1L << (For - 44)) | (1L << (Foreach - 44)) | (1L << (Function - 44)) | (1L << (Global - 44)) | (1L << (Goto - 44)) | (1L << (If - 44)) | (1L << (Implements - 44)) | (1L << (Import - 44)) | (1L << (Include - 44)) | (1L << (IncludeOnce - 44)) | (1L << (InstanceOf - 44)) | (1L << (InsteadOf - 44)) | (1L << (Int8Cast - 44)) | (1L << (Int16Cast - 44)) | (1L << (Int64Type - 44)) | (1L << (IntType - 44)) | (1L << (Interface - 44)) | (1L << (IsSet - 44)) | (1L << (List - 44)) | (1L << (LogicalAnd - 44)) | (1L << (LogicalOr - 44)) | (1L << (LogicalXor - 44)) | (1L << (Namespace - 44)) | (1L << (New - 44)) | (1L << (Null - 44)) | (1L << (ObjectType - 44)) | (1L << (Parent_ - 44)) | (1L << (Partial - 44)) | (1L << (Print - 44)))) != 0) || ((((_la - 108)) & ~0x3f) == 0 && ((1L << (_la - 108)) & ((1L << (Private - 108)) | (1L << (Protected - 108)) | (1L << (Public - 108)) | (1L << (Require - 108)) | (1L << (RequireOnce - 108)) | (1L << (Resource - 108)) | (1L << (Return - 108)) | (1L << (Static - 108)) | (1L << (StringType - 108)) | (1L << (Switch - 108)) | (1L << (Throw - 108)) | (1L << (Trait - 108)) | (1L << (Try - 108)) | (1L << (Typeof - 108)) | (1L << (UintCast - 108)) | (1L << (UnicodeCast - 108)) | (1L << (Unset - 108)) | (1L << (Use - 108)) | (1L << (Var - 108)) | (1L << (While - 108)) | (1L << (Yield - 108)) | (1L << (From - 108)) | (1L << (LambdaFn - 108)) | (1L << (Get - 108)) | (1L << (Set - 108)) | (1L << (Call - 108)) | (1L << (CallStatic - 108)) | (1L << (Constructor - 108)) | (1L << (Destruct - 108)) | (1L << (Wakeup - 108)) | (1L << (Sleep - 108)) | (1L << (Autoload - 108)) | (1L << (IsSet__ - 108)) | (1L << (Unset__ - 108)) | (1L << (ToString__ - 108)) | (1L << (Invoke - 108)) | (1L << (SetState - 108)) | (1L << (Clone__ - 108)) | (1L << (DebugInfo - 108)) | (1L << (Namespace__ - 108)) | (1L << (Class__ - 108)) | (1L << (Traic__ - 108)) | (1L << (Function__ - 108)) | (1L << (Method__ - 108)) | (1L << (Line__ - 108)) | (1L << (File__ - 108)) | (1L << (Dir__ - 108)) | (1L << (Inc - 108)) | (1L << (Dec - 108)))) != 0) || ((((_la - 188)) & ~0x3f) == 0 && ((1L << (_la - 188)) & ((1L << (NamespaceSeparator - 188)) | (1L << (Ampersand - 188)) | (1L << (Bang - 188)) | (1L << (Plus - 188)) | (1L << (Minus - 188)) | (1L << (Tilde - 188)) | (1L << (SuppressWarnings - 188)) | (1L << (Dollar - 188)) | (1L << (OpenRoundBracket - 188)) | (1L << (OpenSquareBracket - 188)) | (1L << (VarName - 188)) | (1L << (Label - 188)) | (1L << (Octal - 188)) | (1L << (Decimal - 188)) | (1L << (Real - 188)) | (1L << (Hex - 188)) | (1L << (Binary - 188)) | (1L << (BackQuoteString - 188)) | (1L << (SingleQuoteString - 188)) | (1L << (DoubleQuote - 188)) | (1L << (StartNowDoc - 188)) | (1L << (StartHereDoc - 188)))) != 0)) {
					{
					setState(1278);
					arrayItemList();
					}
				}

				setState(1281);
				match(CloseRoundBracket);
				}
				break;
			case OpenSquareBracket:
				{
				setState(1282);
				match(OpenSquareBracket);
				setState(1284);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 44)) & ~0x3f) == 0 && ((1L << (_la - 44)) & ((1L << (Abstract - 44)) | (1L << (Array - 44)) | (1L << (As - 44)) | (1L << (BinaryCast - 44)) | (1L << (BoolType - 44)) | (1L << (BooleanConstant - 44)) | (1L << (Break - 44)) | (1L << (Callable - 44)) | (1L << (Case - 44)) | (1L << (Catch - 44)) | (1L << (Class - 44)) | (1L << (Clone - 44)) | (1L << (Const - 44)) | (1L << (Continue - 44)) | (1L << (Declare - 44)) | (1L << (Default - 44)) | (1L << (Do - 44)) | (1L << (DoubleCast - 44)) | (1L << (DoubleType - 44)) | (1L << (Echo - 44)) | (1L << (Else - 44)) | (1L << (ElseIf - 44)) | (1L << (Empty - 44)) | (1L << (EndDeclare - 44)) | (1L << (EndFor - 44)) | (1L << (EndForeach - 44)) | (1L << (EndIf - 44)) | (1L << (EndSwitch - 44)) | (1L << (EndWhile - 44)) | (1L << (Eval - 44)) | (1L << (Exit - 44)) | (1L << (Extends - 44)) | (1L << (Final - 44)) | (1L << (Finally - 44)) | (1L << (FloatCast - 44)) | (1L << (For - 44)) | (1L << (Foreach - 44)) | (1L << (Function - 44)) | (1L << (Global - 44)) | (1L << (Goto - 44)) | (1L << (If - 44)) | (1L << (Implements - 44)) | (1L << (Import - 44)) | (1L << (Include - 44)) | (1L << (IncludeOnce - 44)) | (1L << (InstanceOf - 44)) | (1L << (InsteadOf - 44)) | (1L << (Int8Cast - 44)) | (1L << (Int16Cast - 44)) | (1L << (Int64Type - 44)) | (1L << (IntType - 44)) | (1L << (Interface - 44)) | (1L << (IsSet - 44)) | (1L << (List - 44)) | (1L << (LogicalAnd - 44)) | (1L << (LogicalOr - 44)) | (1L << (LogicalXor - 44)) | (1L << (Namespace - 44)) | (1L << (New - 44)) | (1L << (Null - 44)) | (1L << (ObjectType - 44)) | (1L << (Parent_ - 44)) | (1L << (Partial - 44)) | (1L << (Print - 44)))) != 0) || ((((_la - 108)) & ~0x3f) == 0 && ((1L << (_la - 108)) & ((1L << (Private - 108)) | (1L << (Protected - 108)) | (1L << (Public - 108)) | (1L << (Require - 108)) | (1L << (RequireOnce - 108)) | (1L << (Resource - 108)) | (1L << (Return - 108)) | (1L << (Static - 108)) | (1L << (StringType - 108)) | (1L << (Switch - 108)) | (1L << (Throw - 108)) | (1L << (Trait - 108)) | (1L << (Try - 108)) | (1L << (Typeof - 108)) | (1L << (UintCast - 108)) | (1L << (UnicodeCast - 108)) | (1L << (Unset - 108)) | (1L << (Use - 108)) | (1L << (Var - 108)) | (1L << (While - 108)) | (1L << (Yield - 108)) | (1L << (From - 108)) | (1L << (LambdaFn - 108)) | (1L << (Get - 108)) | (1L << (Set - 108)) | (1L << (Call - 108)) | (1L << (CallStatic - 108)) | (1L << (Constructor - 108)) | (1L << (Destruct - 108)) | (1L << (Wakeup - 108)) | (1L << (Sleep - 108)) | (1L << (Autoload - 108)) | (1L << (IsSet__ - 108)) | (1L << (Unset__ - 108)) | (1L << (ToString__ - 108)) | (1L << (Invoke - 108)) | (1L << (SetState - 108)) | (1L << (Clone__ - 108)) | (1L << (DebugInfo - 108)) | (1L << (Namespace__ - 108)) | (1L << (Class__ - 108)) | (1L << (Traic__ - 108)) | (1L << (Function__ - 108)) | (1L << (Method__ - 108)) | (1L << (Line__ - 108)) | (1L << (File__ - 108)) | (1L << (Dir__ - 108)) | (1L << (Inc - 108)) | (1L << (Dec - 108)))) != 0) || ((((_la - 188)) & ~0x3f) == 0 && ((1L << (_la - 188)) & ((1L << (NamespaceSeparator - 188)) | (1L << (Ampersand - 188)) | (1L << (Bang - 188)) | (1L << (Plus - 188)) | (1L << (Minus - 188)) | (1L << (Tilde - 188)) | (1L << (SuppressWarnings - 188)) | (1L << (Dollar - 188)) | (1L << (OpenRoundBracket - 188)) | (1L << (OpenSquareBracket - 188)) | (1L << (VarName - 188)) | (1L << (Label - 188)) | (1L << (Octal - 188)) | (1L << (Decimal - 188)) | (1L << (Real - 188)) | (1L << (Hex - 188)) | (1L << (Binary - 188)) | (1L << (BackQuoteString - 188)) | (1L << (SingleQuoteString - 188)) | (1L << (DoubleQuote - 188)) | (1L << (StartNowDoc - 188)) | (1L << (StartHereDoc - 188)))) != 0)) {
					{
					setState(1283);
					arrayItemList();
					}
				}

				setState(1286);
				match(CloseSquareBracket);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1293);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,127,_ctx) ) {
			case 1:
				{
				setState(1289);
				match(OpenSquareBracket);
				setState(1290);
				expression(0);
				setState(1291);
				match(CloseSquareBracket);
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

	public static class LambdaFunctionExprContext extends ParserRuleContext {
		public TerminalNode Function() { return getToken(PhpParser.Function, 0); }
		public TerminalNode OpenRoundBracket() { return getToken(PhpParser.OpenRoundBracket, 0); }
		public FormalParameterListContext formalParameterList() {
			return getRuleContext(FormalParameterListContext.class,0);
		}
		public TerminalNode CloseRoundBracket() { return getToken(PhpParser.CloseRoundBracket, 0); }
		public BlockStatementContext blockStatement() {
			return getRuleContext(BlockStatementContext.class,0);
		}
		public TerminalNode Static() { return getToken(PhpParser.Static, 0); }
		public TerminalNode Ampersand() { return getToken(PhpParser.Ampersand, 0); }
		public LambdaFunctionUseVarsContext lambdaFunctionUseVars() {
			return getRuleContext(LambdaFunctionUseVarsContext.class,0);
		}
		public TerminalNode Colon() { return getToken(PhpParser.Colon, 0); }
		public TypeHintContext typeHint() {
			return getRuleContext(TypeHintContext.class,0);
		}
		public TerminalNode LambdaFn() { return getToken(PhpParser.LambdaFn, 0); }
		public TerminalNode DoubleArrow() { return getToken(PhpParser.DoubleArrow, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public LambdaFunctionExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lambdaFunctionExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).enterLambdaFunctionExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).exitLambdaFunctionExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PhpParserVisitor ) return ((PhpParserVisitor<? extends T>)visitor).visitLambdaFunctionExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LambdaFunctionExprContext lambdaFunctionExpr() throws RecognitionException {
		LambdaFunctionExprContext _localctx = new LambdaFunctionExprContext(_ctx, getState());
		enterRule(_localctx, 172, RULE_lambdaFunctionExpr);
		int _la;
		try {
			setState(1321);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Function:
			case Static:
				enterOuterAlt(_localctx, 1);
				{
				setState(1296);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Static) {
					{
					setState(1295);
					match(Static);
					}
				}

				setState(1298);
				match(Function);
				setState(1300);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Ampersand) {
					{
					setState(1299);
					match(Ampersand);
					}
				}

				setState(1302);
				match(OpenRoundBracket);
				setState(1303);
				formalParameterList();
				setState(1304);
				match(CloseRoundBracket);
				setState(1306);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Use) {
					{
					setState(1305);
					lambdaFunctionUseVars();
					}
				}

				setState(1310);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Colon) {
					{
					setState(1308);
					match(Colon);
					setState(1309);
					typeHint();
					}
				}

				setState(1312);
				blockStatement();
				}
				break;
			case LambdaFn:
				enterOuterAlt(_localctx, 2);
				{
				setState(1314);
				match(LambdaFn);
				setState(1315);
				match(OpenRoundBracket);
				setState(1316);
				formalParameterList();
				setState(1317);
				match(CloseRoundBracket);
				setState(1318);
				match(DoubleArrow);
				setState(1319);
				expression(0);
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

	public static class NewExprContext extends ParserRuleContext {
		public TerminalNode New() { return getToken(PhpParser.New, 0); }
		public TypeRefContext typeRef() {
			return getRuleContext(TypeRefContext.class,0);
		}
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public NewExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_newExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).enterNewExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).exitNewExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PhpParserVisitor ) return ((PhpParserVisitor<? extends T>)visitor).visitNewExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NewExprContext newExpr() throws RecognitionException {
		NewExprContext _localctx = new NewExprContext(_ctx, getState());
		enterRule(_localctx, 174, RULE_newExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1323);
			match(New);
			setState(1324);
			typeRef();
			setState(1326);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,133,_ctx) ) {
			case 1:
				{
				setState(1325);
				arguments();
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

	public static class AssignmentOperatorContext extends ParserRuleContext {
		public TerminalNode Eq() { return getToken(PhpParser.Eq, 0); }
		public TerminalNode PlusEqual() { return getToken(PhpParser.PlusEqual, 0); }
		public TerminalNode MinusEqual() { return getToken(PhpParser.MinusEqual, 0); }
		public TerminalNode MulEqual() { return getToken(PhpParser.MulEqual, 0); }
		public TerminalNode PowEqual() { return getToken(PhpParser.PowEqual, 0); }
		public TerminalNode DivEqual() { return getToken(PhpParser.DivEqual, 0); }
		public TerminalNode Concaequal() { return getToken(PhpParser.Concaequal, 0); }
		public TerminalNode ModEqual() { return getToken(PhpParser.ModEqual, 0); }
		public TerminalNode AndEqual() { return getToken(PhpParser.AndEqual, 0); }
		public TerminalNode OrEqual() { return getToken(PhpParser.OrEqual, 0); }
		public TerminalNode XorEqual() { return getToken(PhpParser.XorEqual, 0); }
		public TerminalNode ShiftLeftEqual() { return getToken(PhpParser.ShiftLeftEqual, 0); }
		public TerminalNode ShiftRightEqual() { return getToken(PhpParser.ShiftRightEqual, 0); }
		public TerminalNode NullCoalescingEqual() { return getToken(PhpParser.NullCoalescingEqual, 0); }
		public AssignmentOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).enterAssignmentOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).exitAssignmentOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PhpParserVisitor ) return ((PhpParserVisitor<? extends T>)visitor).visitAssignmentOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentOperatorContext assignmentOperator() throws RecognitionException {
		AssignmentOperatorContext _localctx = new AssignmentOperatorContext(_ctx, getState());
		enterRule(_localctx, 176, RULE_assignmentOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1328);
			_la = _input.LA(1);
			if ( !(((((_la - 167)) & ~0x3f) == 0 && ((1L << (_la - 167)) & ((1L << (PlusEqual - 167)) | (1L << (MinusEqual - 167)) | (1L << (MulEqual - 167)) | (1L << (PowEqual - 167)) | (1L << (DivEqual - 167)) | (1L << (Concaequal - 167)) | (1L << (ModEqual - 167)) | (1L << (ShiftLeftEqual - 167)) | (1L << (ShiftRightEqual - 167)) | (1L << (AndEqual - 167)) | (1L << (OrEqual - 167)) | (1L << (XorEqual - 167)) | (1L << (NullCoalescingEqual - 167)) | (1L << (Eq - 167)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class YieldExpressionContext extends ParserRuleContext {
		public TerminalNode Yield() { return getToken(PhpParser.Yield, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode From() { return getToken(PhpParser.From, 0); }
		public TerminalNode DoubleArrow() { return getToken(PhpParser.DoubleArrow, 0); }
		public YieldExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_yieldExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).enterYieldExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).exitYieldExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PhpParserVisitor ) return ((PhpParserVisitor<? extends T>)visitor).visitYieldExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final YieldExpressionContext yieldExpression() throws RecognitionException {
		YieldExpressionContext _localctx = new YieldExpressionContext(_ctx, getState());
		enterRule(_localctx, 178, RULE_yieldExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1330);
			match(Yield);
			setState(1338);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,135,_ctx) ) {
			case 1:
				{
				setState(1331);
				expression(0);
				setState(1334);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==DoubleArrow) {
					{
					setState(1332);
					match(DoubleArrow);
					setState(1333);
					expression(0);
					}
				}

				}
				break;
			case 2:
				{
				setState(1336);
				match(From);
				setState(1337);
				expression(0);
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

	public static class ArrayItemListContext extends ParserRuleContext {
		public List<ArrayItemContext> arrayItem() {
			return getRuleContexts(ArrayItemContext.class);
		}
		public ArrayItemContext arrayItem(int i) {
			return getRuleContext(ArrayItemContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(PhpParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(PhpParser.Comma, i);
		}
		public ArrayItemListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayItemList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).enterArrayItemList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).exitArrayItemList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PhpParserVisitor ) return ((PhpParserVisitor<? extends T>)visitor).visitArrayItemList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayItemListContext arrayItemList() throws RecognitionException {
		ArrayItemListContext _localctx = new ArrayItemListContext(_ctx, getState());
		enterRule(_localctx, 180, RULE_arrayItemList);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1340);
			arrayItem();
			setState(1345);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,136,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1341);
					match(Comma);
					setState(1342);
					arrayItem();
					}
					} 
				}
				setState(1347);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,136,_ctx);
			}
			setState(1349);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Comma) {
				{
				setState(1348);
				match(Comma);
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

	public static class ArrayItemContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode DoubleArrow() { return getToken(PhpParser.DoubleArrow, 0); }
		public TerminalNode Ampersand() { return getToken(PhpParser.Ampersand, 0); }
		public ChainContext chain() {
			return getRuleContext(ChainContext.class,0);
		}
		public ArrayItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayItem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).enterArrayItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).exitArrayItem(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PhpParserVisitor ) return ((PhpParserVisitor<? extends T>)visitor).visitArrayItem(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayItemContext arrayItem() throws RecognitionException {
		ArrayItemContext _localctx = new ArrayItemContext(_ctx, getState());
		enterRule(_localctx, 182, RULE_arrayItem);
		int _la;
		try {
			setState(1363);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,140,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1351);
				expression(0);
				setState(1354);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==DoubleArrow) {
					{
					setState(1352);
					match(DoubleArrow);
					setState(1353);
					expression(0);
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1359);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 44)) & ~0x3f) == 0 && ((1L << (_la - 44)) & ((1L << (Abstract - 44)) | (1L << (Array - 44)) | (1L << (As - 44)) | (1L << (BinaryCast - 44)) | (1L << (BoolType - 44)) | (1L << (BooleanConstant - 44)) | (1L << (Break - 44)) | (1L << (Callable - 44)) | (1L << (Case - 44)) | (1L << (Catch - 44)) | (1L << (Class - 44)) | (1L << (Clone - 44)) | (1L << (Const - 44)) | (1L << (Continue - 44)) | (1L << (Declare - 44)) | (1L << (Default - 44)) | (1L << (Do - 44)) | (1L << (DoubleCast - 44)) | (1L << (DoubleType - 44)) | (1L << (Echo - 44)) | (1L << (Else - 44)) | (1L << (ElseIf - 44)) | (1L << (Empty - 44)) | (1L << (EndDeclare - 44)) | (1L << (EndFor - 44)) | (1L << (EndForeach - 44)) | (1L << (EndIf - 44)) | (1L << (EndSwitch - 44)) | (1L << (EndWhile - 44)) | (1L << (Eval - 44)) | (1L << (Exit - 44)) | (1L << (Extends - 44)) | (1L << (Final - 44)) | (1L << (Finally - 44)) | (1L << (FloatCast - 44)) | (1L << (For - 44)) | (1L << (Foreach - 44)) | (1L << (Function - 44)) | (1L << (Global - 44)) | (1L << (Goto - 44)) | (1L << (If - 44)) | (1L << (Implements - 44)) | (1L << (Import - 44)) | (1L << (Include - 44)) | (1L << (IncludeOnce - 44)) | (1L << (InstanceOf - 44)) | (1L << (InsteadOf - 44)) | (1L << (Int8Cast - 44)) | (1L << (Int16Cast - 44)) | (1L << (Int64Type - 44)) | (1L << (IntType - 44)) | (1L << (Interface - 44)) | (1L << (IsSet - 44)) | (1L << (List - 44)) | (1L << (LogicalAnd - 44)) | (1L << (LogicalOr - 44)) | (1L << (LogicalXor - 44)) | (1L << (Namespace - 44)) | (1L << (New - 44)) | (1L << (Null - 44)) | (1L << (ObjectType - 44)) | (1L << (Parent_ - 44)) | (1L << (Partial - 44)) | (1L << (Print - 44)))) != 0) || ((((_la - 108)) & ~0x3f) == 0 && ((1L << (_la - 108)) & ((1L << (Private - 108)) | (1L << (Protected - 108)) | (1L << (Public - 108)) | (1L << (Require - 108)) | (1L << (RequireOnce - 108)) | (1L << (Resource - 108)) | (1L << (Return - 108)) | (1L << (Static - 108)) | (1L << (StringType - 108)) | (1L << (Switch - 108)) | (1L << (Throw - 108)) | (1L << (Trait - 108)) | (1L << (Try - 108)) | (1L << (Typeof - 108)) | (1L << (UintCast - 108)) | (1L << (UnicodeCast - 108)) | (1L << (Unset - 108)) | (1L << (Use - 108)) | (1L << (Var - 108)) | (1L << (While - 108)) | (1L << (Yield - 108)) | (1L << (From - 108)) | (1L << (LambdaFn - 108)) | (1L << (Get - 108)) | (1L << (Set - 108)) | (1L << (Call - 108)) | (1L << (CallStatic - 108)) | (1L << (Constructor - 108)) | (1L << (Destruct - 108)) | (1L << (Wakeup - 108)) | (1L << (Sleep - 108)) | (1L << (Autoload - 108)) | (1L << (IsSet__ - 108)) | (1L << (Unset__ - 108)) | (1L << (ToString__ - 108)) | (1L << (Invoke - 108)) | (1L << (SetState - 108)) | (1L << (Clone__ - 108)) | (1L << (DebugInfo - 108)) | (1L << (Namespace__ - 108)) | (1L << (Class__ - 108)) | (1L << (Traic__ - 108)) | (1L << (Function__ - 108)) | (1L << (Method__ - 108)) | (1L << (Line__ - 108)) | (1L << (File__ - 108)) | (1L << (Dir__ - 108)) | (1L << (Inc - 108)) | (1L << (Dec - 108)))) != 0) || ((((_la - 188)) & ~0x3f) == 0 && ((1L << (_la - 188)) & ((1L << (NamespaceSeparator - 188)) | (1L << (Bang - 188)) | (1L << (Plus - 188)) | (1L << (Minus - 188)) | (1L << (Tilde - 188)) | (1L << (SuppressWarnings - 188)) | (1L << (Dollar - 188)) | (1L << (OpenRoundBracket - 188)) | (1L << (OpenSquareBracket - 188)) | (1L << (VarName - 188)) | (1L << (Label - 188)) | (1L << (Octal - 188)) | (1L << (Decimal - 188)) | (1L << (Real - 188)) | (1L << (Hex - 188)) | (1L << (Binary - 188)) | (1L << (BackQuoteString - 188)) | (1L << (SingleQuoteString - 188)) | (1L << (DoubleQuote - 188)) | (1L << (StartNowDoc - 188)) | (1L << (StartHereDoc - 188)))) != 0)) {
					{
					setState(1356);
					expression(0);
					setState(1357);
					match(DoubleArrow);
					}
				}

				setState(1361);
				match(Ampersand);
				setState(1362);
				chain();
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

	public static class LambdaFunctionUseVarsContext extends ParserRuleContext {
		public TerminalNode Use() { return getToken(PhpParser.Use, 0); }
		public TerminalNode OpenRoundBracket() { return getToken(PhpParser.OpenRoundBracket, 0); }
		public List<LambdaFunctionUseVarContext> lambdaFunctionUseVar() {
			return getRuleContexts(LambdaFunctionUseVarContext.class);
		}
		public LambdaFunctionUseVarContext lambdaFunctionUseVar(int i) {
			return getRuleContext(LambdaFunctionUseVarContext.class,i);
		}
		public TerminalNode CloseRoundBracket() { return getToken(PhpParser.CloseRoundBracket, 0); }
		public List<TerminalNode> Comma() { return getTokens(PhpParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(PhpParser.Comma, i);
		}
		public LambdaFunctionUseVarsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lambdaFunctionUseVars; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).enterLambdaFunctionUseVars(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).exitLambdaFunctionUseVars(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PhpParserVisitor ) return ((PhpParserVisitor<? extends T>)visitor).visitLambdaFunctionUseVars(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LambdaFunctionUseVarsContext lambdaFunctionUseVars() throws RecognitionException {
		LambdaFunctionUseVarsContext _localctx = new LambdaFunctionUseVarsContext(_ctx, getState());
		enterRule(_localctx, 184, RULE_lambdaFunctionUseVars);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1365);
			match(Use);
			setState(1366);
			match(OpenRoundBracket);
			setState(1367);
			lambdaFunctionUseVar();
			setState(1372);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(1368);
				match(Comma);
				setState(1369);
				lambdaFunctionUseVar();
				}
				}
				setState(1374);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1375);
			match(CloseRoundBracket);
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

	public static class LambdaFunctionUseVarContext extends ParserRuleContext {
		public TerminalNode VarName() { return getToken(PhpParser.VarName, 0); }
		public TerminalNode Ampersand() { return getToken(PhpParser.Ampersand, 0); }
		public LambdaFunctionUseVarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lambdaFunctionUseVar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).enterLambdaFunctionUseVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).exitLambdaFunctionUseVar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PhpParserVisitor ) return ((PhpParserVisitor<? extends T>)visitor).visitLambdaFunctionUseVar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LambdaFunctionUseVarContext lambdaFunctionUseVar() throws RecognitionException {
		LambdaFunctionUseVarContext _localctx = new LambdaFunctionUseVarContext(_ctx, getState());
		enterRule(_localctx, 186, RULE_lambdaFunctionUseVar);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1378);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Ampersand) {
				{
				setState(1377);
				match(Ampersand);
				}
			}

			setState(1380);
			match(VarName);
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

	public static class QualifiedStaticTypeRefContext extends ParserRuleContext {
		public QualifiedNamespaceNameContext qualifiedNamespaceName() {
			return getRuleContext(QualifiedNamespaceNameContext.class,0);
		}
		public GenericDynamicArgsContext genericDynamicArgs() {
			return getRuleContext(GenericDynamicArgsContext.class,0);
		}
		public TerminalNode Static() { return getToken(PhpParser.Static, 0); }
		public QualifiedStaticTypeRefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualifiedStaticTypeRef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).enterQualifiedStaticTypeRef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).exitQualifiedStaticTypeRef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PhpParserVisitor ) return ((PhpParserVisitor<? extends T>)visitor).visitQualifiedStaticTypeRef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QualifiedStaticTypeRefContext qualifiedStaticTypeRef() throws RecognitionException {
		QualifiedStaticTypeRefContext _localctx = new QualifiedStaticTypeRefContext(_ctx, getState());
		enterRule(_localctx, 188, RULE_qualifiedStaticTypeRef);
		int _la;
		try {
			setState(1387);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,144,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1382);
				qualifiedNamespaceName();
				setState(1384);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Lgeneric) {
					{
					setState(1383);
					genericDynamicArgs();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1386);
				match(Static);
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

	public static class TypeRefContext extends ParserRuleContext {
		public QualifiedNamespaceNameContext qualifiedNamespaceName() {
			return getRuleContext(QualifiedNamespaceNameContext.class,0);
		}
		public IndirectTypeRefContext indirectTypeRef() {
			return getRuleContext(IndirectTypeRefContext.class,0);
		}
		public GenericDynamicArgsContext genericDynamicArgs() {
			return getRuleContext(GenericDynamicArgsContext.class,0);
		}
		public PrimitiveTypeContext primitiveType() {
			return getRuleContext(PrimitiveTypeContext.class,0);
		}
		public TerminalNode Static() { return getToken(PhpParser.Static, 0); }
		public AnoymousClassContext anoymousClass() {
			return getRuleContext(AnoymousClassContext.class,0);
		}
		public TypeRefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeRef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).enterTypeRef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).exitTypeRef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PhpParserVisitor ) return ((PhpParserVisitor<? extends T>)visitor).visitTypeRef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeRefContext typeRef() throws RecognitionException {
		TypeRefContext _localctx = new TypeRefContext(_ctx, getState());
		enterRule(_localctx, 190, RULE_typeRef);
		try {
			setState(1399);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,147,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1391);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,145,_ctx) ) {
				case 1:
					{
					setState(1389);
					qualifiedNamespaceName();
					}
					break;
				case 2:
					{
					setState(1390);
					indirectTypeRef();
					}
					break;
				}
				setState(1394);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,146,_ctx) ) {
				case 1:
					{
					setState(1393);
					genericDynamicArgs();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1396);
				primitiveType();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1397);
				match(Static);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1398);
				anoymousClass();
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

	public static class AnoymousClassContext extends ParserRuleContext {
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public TerminalNode OpenCurlyBracket() { return getToken(PhpParser.OpenCurlyBracket, 0); }
		public TerminalNode CloseCurlyBracket() { return getToken(PhpParser.CloseCurlyBracket, 0); }
		public ClassEntryTypeContext classEntryType() {
			return getRuleContext(ClassEntryTypeContext.class,0);
		}
		public TerminalNode Interface() { return getToken(PhpParser.Interface, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode Private() { return getToken(PhpParser.Private, 0); }
		public ModifierContext modifier() {
			return getRuleContext(ModifierContext.class,0);
		}
		public TerminalNode Partial() { return getToken(PhpParser.Partial, 0); }
		public List<ClassStatementContext> classStatement() {
			return getRuleContexts(ClassStatementContext.class);
		}
		public ClassStatementContext classStatement(int i) {
			return getRuleContext(ClassStatementContext.class,i);
		}
		public TypeParameterListInBracketsContext typeParameterListInBrackets() {
			return getRuleContext(TypeParameterListInBracketsContext.class,0);
		}
		public TerminalNode Extends() { return getToken(PhpParser.Extends, 0); }
		public QualifiedStaticTypeRefContext qualifiedStaticTypeRef() {
			return getRuleContext(QualifiedStaticTypeRefContext.class,0);
		}
		public TerminalNode Implements() { return getToken(PhpParser.Implements, 0); }
		public InterfaceListContext interfaceList() {
			return getRuleContext(InterfaceListContext.class,0);
		}
		public AnoymousClassContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_anoymousClass; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).enterAnoymousClass(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).exitAnoymousClass(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PhpParserVisitor ) return ((PhpParserVisitor<? extends T>)visitor).visitAnoymousClass(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnoymousClassContext anoymousClass() throws RecognitionException {
		AnoymousClassContext _localctx = new AnoymousClassContext(_ctx, getState());
		enterRule(_localctx, 192, RULE_anoymousClass);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1401);
			attributes();
			setState(1403);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Private) {
				{
				setState(1402);
				match(Private);
				}
			}

			setState(1406);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Abstract || _la==Final) {
				{
				setState(1405);
				modifier();
				}
			}

			setState(1409);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Partial) {
				{
				setState(1408);
				match(Partial);
				}
			}

			setState(1432);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Class:
			case Trait:
				{
				setState(1411);
				classEntryType();
				setState(1413);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Lgeneric) {
					{
					setState(1412);
					typeParameterListInBrackets();
					}
				}

				setState(1417);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Extends) {
					{
					setState(1415);
					match(Extends);
					setState(1416);
					qualifiedStaticTypeRef();
					}
				}

				setState(1421);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Implements) {
					{
					setState(1419);
					match(Implements);
					setState(1420);
					interfaceList();
					}
				}

				}
				break;
			case Interface:
				{
				setState(1423);
				match(Interface);
				setState(1424);
				identifier();
				setState(1426);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Lgeneric) {
					{
					setState(1425);
					typeParameterListInBrackets();
					}
				}

				setState(1430);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Extends) {
					{
					setState(1428);
					match(Extends);
					setState(1429);
					interfaceList();
					}
				}

				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1434);
			match(OpenCurlyBracket);
			setState(1438);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Abstract || _la==Const || ((((_la - 76)) & ~0x3f) == 0 && ((1L << (_la - 76)) & ((1L << (Final - 76)) | (1L << (Function - 76)) | (1L << (Private - 76)) | (1L << (Protected - 76)) | (1L << (Public - 76)) | (1L << (Static - 76)) | (1L << (Use - 76)) | (1L << (Var - 76)))) != 0) || _la==OpenSquareBracket) {
				{
				{
				setState(1435);
				classStatement();
				}
				}
				setState(1440);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1441);
			match(CloseCurlyBracket);
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

	public static class IndirectTypeRefContext extends ParserRuleContext {
		public ChainBaseContext chainBase() {
			return getRuleContext(ChainBaseContext.class,0);
		}
		public List<TerminalNode> ObjectOperator() { return getTokens(PhpParser.ObjectOperator); }
		public TerminalNode ObjectOperator(int i) {
			return getToken(PhpParser.ObjectOperator, i);
		}
		public List<KeyedFieldNameContext> keyedFieldName() {
			return getRuleContexts(KeyedFieldNameContext.class);
		}
		public KeyedFieldNameContext keyedFieldName(int i) {
			return getRuleContext(KeyedFieldNameContext.class,i);
		}
		public IndirectTypeRefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_indirectTypeRef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).enterIndirectTypeRef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).exitIndirectTypeRef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PhpParserVisitor ) return ((PhpParserVisitor<? extends T>)visitor).visitIndirectTypeRef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IndirectTypeRefContext indirectTypeRef() throws RecognitionException {
		IndirectTypeRefContext _localctx = new IndirectTypeRefContext(_ctx, getState());
		enterRule(_localctx, 194, RULE_indirectTypeRef);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1443);
			chainBase();
			setState(1448);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,158,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1444);
					match(ObjectOperator);
					setState(1445);
					keyedFieldName();
					}
					} 
				}
				setState(1450);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,158,_ctx);
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

	public static class QualifiedNamespaceNameContext extends ParserRuleContext {
		public NamespaceNameListContext namespaceNameList() {
			return getRuleContext(NamespaceNameListContext.class,0);
		}
		public TerminalNode Namespace() { return getToken(PhpParser.Namespace, 0); }
		public TerminalNode NamespaceSeparator() { return getToken(PhpParser.NamespaceSeparator, 0); }
		public QualifiedNamespaceNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualifiedNamespaceName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).enterQualifiedNamespaceName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).exitQualifiedNamespaceName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PhpParserVisitor ) return ((PhpParserVisitor<? extends T>)visitor).visitQualifiedNamespaceName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QualifiedNamespaceNameContext qualifiedNamespaceName() throws RecognitionException {
		QualifiedNamespaceNameContext _localctx = new QualifiedNamespaceNameContext(_ctx, getState());
		enterRule(_localctx, 196, RULE_qualifiedNamespaceName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1452);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,159,_ctx) ) {
			case 1:
				{
				setState(1451);
				match(Namespace);
				}
				break;
			}
			setState(1455);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NamespaceSeparator) {
				{
				setState(1454);
				match(NamespaceSeparator);
				}
			}

			setState(1457);
			namespaceNameList();
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

	public static class NamespaceNameListContext extends ParserRuleContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public List<TerminalNode> NamespaceSeparator() { return getTokens(PhpParser.NamespaceSeparator); }
		public TerminalNode NamespaceSeparator(int i) {
			return getToken(PhpParser.NamespaceSeparator, i);
		}
		public NamespaceNameTailContext namespaceNameTail() {
			return getRuleContext(NamespaceNameTailContext.class,0);
		}
		public NamespaceNameListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namespaceNameList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).enterNamespaceNameList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).exitNamespaceNameList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PhpParserVisitor ) return ((PhpParserVisitor<? extends T>)visitor).visitNamespaceNameList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NamespaceNameListContext namespaceNameList() throws RecognitionException {
		NamespaceNameListContext _localctx = new NamespaceNameListContext(_ctx, getState());
		enterRule(_localctx, 198, RULE_namespaceNameList);
		try {
			int _alt;
			setState(1472);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,163,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1459);
				identifier();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1460);
				identifier();
				setState(1465);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,161,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1461);
						match(NamespaceSeparator);
						setState(1462);
						identifier();
						}
						} 
					}
					setState(1467);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,161,_ctx);
				}
				setState(1470);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,162,_ctx) ) {
				case 1:
					{
					setState(1468);
					match(NamespaceSeparator);
					setState(1469);
					namespaceNameTail();
					}
					break;
				}
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

	public static class NamespaceNameTailContext extends ParserRuleContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public TerminalNode As() { return getToken(PhpParser.As, 0); }
		public TerminalNode OpenCurlyBracket() { return getToken(PhpParser.OpenCurlyBracket, 0); }
		public List<NamespaceNameTailContext> namespaceNameTail() {
			return getRuleContexts(NamespaceNameTailContext.class);
		}
		public NamespaceNameTailContext namespaceNameTail(int i) {
			return getRuleContext(NamespaceNameTailContext.class,i);
		}
		public TerminalNode CloseCurlyBracket() { return getToken(PhpParser.CloseCurlyBracket, 0); }
		public List<TerminalNode> Comma() { return getTokens(PhpParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(PhpParser.Comma, i);
		}
		public NamespaceNameTailContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namespaceNameTail; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).enterNamespaceNameTail(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).exitNamespaceNameTail(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PhpParserVisitor ) return ((PhpParserVisitor<? extends T>)visitor).visitNamespaceNameTail(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NamespaceNameTailContext namespaceNameTail() throws RecognitionException {
		NamespaceNameTailContext _localctx = new NamespaceNameTailContext(_ctx, getState());
		enterRule(_localctx, 200, RULE_namespaceNameTail);
		int _la;
		try {
			int _alt;
			setState(1493);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Abstract:
			case Array:
			case As:
			case BinaryCast:
			case BoolType:
			case BooleanConstant:
			case Break:
			case Callable:
			case Case:
			case Catch:
			case Class:
			case Clone:
			case Const:
			case Continue:
			case Declare:
			case Default:
			case Do:
			case DoubleCast:
			case DoubleType:
			case Echo:
			case Else:
			case ElseIf:
			case Empty:
			case EndDeclare:
			case EndFor:
			case EndForeach:
			case EndIf:
			case EndSwitch:
			case EndWhile:
			case Eval:
			case Exit:
			case Extends:
			case Final:
			case Finally:
			case FloatCast:
			case For:
			case Foreach:
			case Function:
			case Global:
			case Goto:
			case If:
			case Implements:
			case Import:
			case Include:
			case IncludeOnce:
			case InstanceOf:
			case InsteadOf:
			case Int8Cast:
			case Int16Cast:
			case Int64Type:
			case IntType:
			case Interface:
			case IsSet:
			case List:
			case LogicalAnd:
			case LogicalOr:
			case LogicalXor:
			case Namespace:
			case New:
			case Null:
			case ObjectType:
			case Parent_:
			case Partial:
			case Print:
			case Private:
			case Protected:
			case Public:
			case Require:
			case RequireOnce:
			case Resource:
			case Return:
			case Static:
			case StringType:
			case Switch:
			case Throw:
			case Trait:
			case Try:
			case Typeof:
			case UintCast:
			case UnicodeCast:
			case Unset:
			case Use:
			case Var:
			case While:
			case Yield:
			case From:
			case Get:
			case Set:
			case Call:
			case CallStatic:
			case Constructor:
			case Destruct:
			case Wakeup:
			case Sleep:
			case Autoload:
			case IsSet__:
			case Unset__:
			case ToString__:
			case Invoke:
			case SetState:
			case Clone__:
			case DebugInfo:
			case Namespace__:
			case Class__:
			case Traic__:
			case Function__:
			case Method__:
			case Line__:
			case File__:
			case Dir__:
			case Label:
				enterOuterAlt(_localctx, 1);
				{
				setState(1474);
				identifier();
				setState(1477);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,164,_ctx) ) {
				case 1:
					{
					setState(1475);
					match(As);
					setState(1476);
					identifier();
					}
					break;
				}
				}
				break;
			case OpenCurlyBracket:
				enterOuterAlt(_localctx, 2);
				{
				setState(1479);
				match(OpenCurlyBracket);
				setState(1480);
				namespaceNameTail();
				setState(1485);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,165,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1481);
						match(Comma);
						setState(1482);
						namespaceNameTail();
						}
						} 
					}
					setState(1487);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,165,_ctx);
				}
				setState(1489);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Comma) {
					{
					setState(1488);
					match(Comma);
					}
				}

				setState(1491);
				match(CloseCurlyBracket);
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

	public static class QualifiedNamespaceNameListContext extends ParserRuleContext {
		public List<QualifiedNamespaceNameContext> qualifiedNamespaceName() {
			return getRuleContexts(QualifiedNamespaceNameContext.class);
		}
		public QualifiedNamespaceNameContext qualifiedNamespaceName(int i) {
			return getRuleContext(QualifiedNamespaceNameContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(PhpParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(PhpParser.Comma, i);
		}
		public QualifiedNamespaceNameListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualifiedNamespaceNameList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).enterQualifiedNamespaceNameList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).exitQualifiedNamespaceNameList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PhpParserVisitor ) return ((PhpParserVisitor<? extends T>)visitor).visitQualifiedNamespaceNameList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QualifiedNamespaceNameListContext qualifiedNamespaceNameList() throws RecognitionException {
		QualifiedNamespaceNameListContext _localctx = new QualifiedNamespaceNameListContext(_ctx, getState());
		enterRule(_localctx, 202, RULE_qualifiedNamespaceNameList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1495);
			qualifiedNamespaceName();
			setState(1500);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(1496);
				match(Comma);
				setState(1497);
				qualifiedNamespaceName();
				}
				}
				setState(1502);
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

	public static class ArgumentsContext extends ParserRuleContext {
		public TerminalNode OpenRoundBracket() { return getToken(PhpParser.OpenRoundBracket, 0); }
		public TerminalNode CloseRoundBracket() { return getToken(PhpParser.CloseRoundBracket, 0); }
		public List<ActualArgumentContext> actualArgument() {
			return getRuleContexts(ActualArgumentContext.class);
		}
		public ActualArgumentContext actualArgument(int i) {
			return getRuleContext(ActualArgumentContext.class,i);
		}
		public YieldExpressionContext yieldExpression() {
			return getRuleContext(YieldExpressionContext.class,0);
		}
		public List<TerminalNode> Comma() { return getTokens(PhpParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(PhpParser.Comma, i);
		}
		public ArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).enterArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).exitArguments(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PhpParserVisitor ) return ((PhpParserVisitor<? extends T>)visitor).visitArguments(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentsContext arguments() throws RecognitionException {
		ArgumentsContext _localctx = new ArgumentsContext(_ctx, getState());
		enterRule(_localctx, 204, RULE_arguments);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1503);
			match(OpenRoundBracket);
			setState(1513);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,170,_ctx) ) {
			case 1:
				{
				setState(1504);
				actualArgument();
				setState(1509);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,169,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1505);
						match(Comma);
						setState(1506);
						actualArgument();
						}
						} 
					}
					setState(1511);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,169,_ctx);
				}
				}
				break;
			case 2:
				{
				setState(1512);
				yieldExpression();
				}
				break;
			}
			setState(1516);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Comma) {
				{
				setState(1515);
				match(Comma);
				}
			}

			setState(1518);
			match(CloseRoundBracket);
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

	public static class ActualArgumentContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode Ellipsis() { return getToken(PhpParser.Ellipsis, 0); }
		public TerminalNode Ampersand() { return getToken(PhpParser.Ampersand, 0); }
		public ChainContext chain() {
			return getRuleContext(ChainContext.class,0);
		}
		public ActualArgumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_actualArgument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).enterActualArgument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).exitActualArgument(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PhpParserVisitor ) return ((PhpParserVisitor<? extends T>)visitor).visitActualArgument(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ActualArgumentContext actualArgument() throws RecognitionException {
		ActualArgumentContext _localctx = new ActualArgumentContext(_ctx, getState());
		enterRule(_localctx, 206, RULE_actualArgument);
		int _la;
		try {
			setState(1526);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Abstract:
			case Array:
			case As:
			case BinaryCast:
			case BoolType:
			case BooleanConstant:
			case Break:
			case Callable:
			case Case:
			case Catch:
			case Class:
			case Clone:
			case Const:
			case Continue:
			case Declare:
			case Default:
			case Do:
			case DoubleCast:
			case DoubleType:
			case Echo:
			case Else:
			case ElseIf:
			case Empty:
			case EndDeclare:
			case EndFor:
			case EndForeach:
			case EndIf:
			case EndSwitch:
			case EndWhile:
			case Eval:
			case Exit:
			case Extends:
			case Final:
			case Finally:
			case FloatCast:
			case For:
			case Foreach:
			case Function:
			case Global:
			case Goto:
			case If:
			case Implements:
			case Import:
			case Include:
			case IncludeOnce:
			case InstanceOf:
			case InsteadOf:
			case Int8Cast:
			case Int16Cast:
			case Int64Type:
			case IntType:
			case Interface:
			case IsSet:
			case List:
			case LogicalAnd:
			case LogicalOr:
			case LogicalXor:
			case Namespace:
			case New:
			case Null:
			case ObjectType:
			case Parent_:
			case Partial:
			case Print:
			case Private:
			case Protected:
			case Public:
			case Require:
			case RequireOnce:
			case Resource:
			case Return:
			case Static:
			case StringType:
			case Switch:
			case Throw:
			case Trait:
			case Try:
			case Typeof:
			case UintCast:
			case UnicodeCast:
			case Unset:
			case Use:
			case Var:
			case While:
			case Yield:
			case From:
			case LambdaFn:
			case Get:
			case Set:
			case Call:
			case CallStatic:
			case Constructor:
			case Destruct:
			case Wakeup:
			case Sleep:
			case Autoload:
			case IsSet__:
			case Unset__:
			case ToString__:
			case Invoke:
			case SetState:
			case Clone__:
			case DebugInfo:
			case Namespace__:
			case Class__:
			case Traic__:
			case Function__:
			case Method__:
			case Line__:
			case File__:
			case Dir__:
			case Inc:
			case Dec:
			case NamespaceSeparator:
			case Ellipsis:
			case Bang:
			case Plus:
			case Minus:
			case Tilde:
			case SuppressWarnings:
			case Dollar:
			case OpenRoundBracket:
			case OpenSquareBracket:
			case VarName:
			case Label:
			case Octal:
			case Decimal:
			case Real:
			case Hex:
			case Binary:
			case BackQuoteString:
			case SingleQuoteString:
			case DoubleQuote:
			case StartNowDoc:
			case StartHereDoc:
				enterOuterAlt(_localctx, 1);
				{
				setState(1521);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Ellipsis) {
					{
					setState(1520);
					match(Ellipsis);
					}
				}

				setState(1523);
				expression(0);
				}
				break;
			case Ampersand:
				enterOuterAlt(_localctx, 2);
				{
				setState(1524);
				match(Ampersand);
				setState(1525);
				chain();
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

	public static class ConstantInititalizerContext extends ParserRuleContext {
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public TerminalNode Array() { return getToken(PhpParser.Array, 0); }
		public TerminalNode OpenRoundBracket() { return getToken(PhpParser.OpenRoundBracket, 0); }
		public TerminalNode CloseRoundBracket() { return getToken(PhpParser.CloseRoundBracket, 0); }
		public ConstantArrayItemListContext constantArrayItemList() {
			return getRuleContext(ConstantArrayItemListContext.class,0);
		}
		public TerminalNode Comma() { return getToken(PhpParser.Comma, 0); }
		public TerminalNode OpenSquareBracket() { return getToken(PhpParser.OpenSquareBracket, 0); }
		public TerminalNode CloseSquareBracket() { return getToken(PhpParser.CloseSquareBracket, 0); }
		public ConstantInititalizerContext constantInititalizer() {
			return getRuleContext(ConstantInititalizerContext.class,0);
		}
		public TerminalNode Plus() { return getToken(PhpParser.Plus, 0); }
		public TerminalNode Minus() { return getToken(PhpParser.Minus, 0); }
		public ConstantInititalizerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constantInititalizer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).enterConstantInititalizer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).exitConstantInititalizer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PhpParserVisitor ) return ((PhpParserVisitor<? extends T>)visitor).visitConstantInititalizer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstantInititalizerContext constantInititalizer() throws RecognitionException {
		ConstantInititalizerContext _localctx = new ConstantInititalizerContext(_ctx, getState());
		enterRule(_localctx, 208, RULE_constantInititalizer);
		int _la;
		try {
			setState(1549);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,178,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1528);
				constant();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1529);
				string();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1530);
				match(Array);
				setState(1531);
				match(OpenRoundBracket);
				setState(1536);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 44)) & ~0x3f) == 0 && ((1L << (_la - 44)) & ((1L << (Abstract - 44)) | (1L << (Array - 44)) | (1L << (As - 44)) | (1L << (BinaryCast - 44)) | (1L << (BoolType - 44)) | (1L << (BooleanConstant - 44)) | (1L << (Break - 44)) | (1L << (Callable - 44)) | (1L << (Case - 44)) | (1L << (Catch - 44)) | (1L << (Class - 44)) | (1L << (Clone - 44)) | (1L << (Const - 44)) | (1L << (Continue - 44)) | (1L << (Declare - 44)) | (1L << (Default - 44)) | (1L << (Do - 44)) | (1L << (DoubleCast - 44)) | (1L << (DoubleType - 44)) | (1L << (Echo - 44)) | (1L << (Else - 44)) | (1L << (ElseIf - 44)) | (1L << (Empty - 44)) | (1L << (EndDeclare - 44)) | (1L << (EndFor - 44)) | (1L << (EndForeach - 44)) | (1L << (EndIf - 44)) | (1L << (EndSwitch - 44)) | (1L << (EndWhile - 44)) | (1L << (Eval - 44)) | (1L << (Exit - 44)) | (1L << (Extends - 44)) | (1L << (Final - 44)) | (1L << (Finally - 44)) | (1L << (FloatCast - 44)) | (1L << (For - 44)) | (1L << (Foreach - 44)) | (1L << (Function - 44)) | (1L << (Global - 44)) | (1L << (Goto - 44)) | (1L << (If - 44)) | (1L << (Implements - 44)) | (1L << (Import - 44)) | (1L << (Include - 44)) | (1L << (IncludeOnce - 44)) | (1L << (InstanceOf - 44)) | (1L << (InsteadOf - 44)) | (1L << (Int8Cast - 44)) | (1L << (Int16Cast - 44)) | (1L << (Int64Type - 44)) | (1L << (IntType - 44)) | (1L << (Interface - 44)) | (1L << (IsSet - 44)) | (1L << (List - 44)) | (1L << (LogicalAnd - 44)) | (1L << (LogicalOr - 44)) | (1L << (LogicalXor - 44)) | (1L << (Namespace - 44)) | (1L << (New - 44)) | (1L << (Null - 44)) | (1L << (ObjectType - 44)) | (1L << (Parent_ - 44)) | (1L << (Partial - 44)) | (1L << (Print - 44)))) != 0) || ((((_la - 108)) & ~0x3f) == 0 && ((1L << (_la - 108)) & ((1L << (Private - 108)) | (1L << (Protected - 108)) | (1L << (Public - 108)) | (1L << (Require - 108)) | (1L << (RequireOnce - 108)) | (1L << (Resource - 108)) | (1L << (Return - 108)) | (1L << (Static - 108)) | (1L << (StringType - 108)) | (1L << (Switch - 108)) | (1L << (Throw - 108)) | (1L << (Trait - 108)) | (1L << (Try - 108)) | (1L << (Typeof - 108)) | (1L << (UintCast - 108)) | (1L << (UnicodeCast - 108)) | (1L << (Unset - 108)) | (1L << (Use - 108)) | (1L << (Var - 108)) | (1L << (While - 108)) | (1L << (Yield - 108)) | (1L << (From - 108)) | (1L << (Get - 108)) | (1L << (Set - 108)) | (1L << (Call - 108)) | (1L << (CallStatic - 108)) | (1L << (Constructor - 108)) | (1L << (Destruct - 108)) | (1L << (Wakeup - 108)) | (1L << (Sleep - 108)) | (1L << (Autoload - 108)) | (1L << (IsSet__ - 108)) | (1L << (Unset__ - 108)) | (1L << (ToString__ - 108)) | (1L << (Invoke - 108)) | (1L << (SetState - 108)) | (1L << (Clone__ - 108)) | (1L << (DebugInfo - 108)) | (1L << (Namespace__ - 108)) | (1L << (Class__ - 108)) | (1L << (Traic__ - 108)) | (1L << (Function__ - 108)) | (1L << (Method__ - 108)) | (1L << (Line__ - 108)) | (1L << (File__ - 108)) | (1L << (Dir__ - 108)))) != 0) || ((((_la - 188)) & ~0x3f) == 0 && ((1L << (_la - 188)) & ((1L << (NamespaceSeparator - 188)) | (1L << (Plus - 188)) | (1L << (Minus - 188)) | (1L << (Dollar - 188)) | (1L << (OpenSquareBracket - 188)) | (1L << (VarName - 188)) | (1L << (Label - 188)) | (1L << (Octal - 188)) | (1L << (Decimal - 188)) | (1L << (Real - 188)) | (1L << (Hex - 188)) | (1L << (Binary - 188)) | (1L << (SingleQuoteString - 188)) | (1L << (DoubleQuote - 188)) | (1L << (StartNowDoc - 188)) | (1L << (StartHereDoc - 188)))) != 0)) {
					{
					setState(1532);
					constantArrayItemList();
					setState(1534);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==Comma) {
						{
						setState(1533);
						match(Comma);
						}
					}

					}
				}

				setState(1538);
				match(CloseRoundBracket);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1539);
				match(OpenSquareBracket);
				setState(1544);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 44)) & ~0x3f) == 0 && ((1L << (_la - 44)) & ((1L << (Abstract - 44)) | (1L << (Array - 44)) | (1L << (As - 44)) | (1L << (BinaryCast - 44)) | (1L << (BoolType - 44)) | (1L << (BooleanConstant - 44)) | (1L << (Break - 44)) | (1L << (Callable - 44)) | (1L << (Case - 44)) | (1L << (Catch - 44)) | (1L << (Class - 44)) | (1L << (Clone - 44)) | (1L << (Const - 44)) | (1L << (Continue - 44)) | (1L << (Declare - 44)) | (1L << (Default - 44)) | (1L << (Do - 44)) | (1L << (DoubleCast - 44)) | (1L << (DoubleType - 44)) | (1L << (Echo - 44)) | (1L << (Else - 44)) | (1L << (ElseIf - 44)) | (1L << (Empty - 44)) | (1L << (EndDeclare - 44)) | (1L << (EndFor - 44)) | (1L << (EndForeach - 44)) | (1L << (EndIf - 44)) | (1L << (EndSwitch - 44)) | (1L << (EndWhile - 44)) | (1L << (Eval - 44)) | (1L << (Exit - 44)) | (1L << (Extends - 44)) | (1L << (Final - 44)) | (1L << (Finally - 44)) | (1L << (FloatCast - 44)) | (1L << (For - 44)) | (1L << (Foreach - 44)) | (1L << (Function - 44)) | (1L << (Global - 44)) | (1L << (Goto - 44)) | (1L << (If - 44)) | (1L << (Implements - 44)) | (1L << (Import - 44)) | (1L << (Include - 44)) | (1L << (IncludeOnce - 44)) | (1L << (InstanceOf - 44)) | (1L << (InsteadOf - 44)) | (1L << (Int8Cast - 44)) | (1L << (Int16Cast - 44)) | (1L << (Int64Type - 44)) | (1L << (IntType - 44)) | (1L << (Interface - 44)) | (1L << (IsSet - 44)) | (1L << (List - 44)) | (1L << (LogicalAnd - 44)) | (1L << (LogicalOr - 44)) | (1L << (LogicalXor - 44)) | (1L << (Namespace - 44)) | (1L << (New - 44)) | (1L << (Null - 44)) | (1L << (ObjectType - 44)) | (1L << (Parent_ - 44)) | (1L << (Partial - 44)) | (1L << (Print - 44)))) != 0) || ((((_la - 108)) & ~0x3f) == 0 && ((1L << (_la - 108)) & ((1L << (Private - 108)) | (1L << (Protected - 108)) | (1L << (Public - 108)) | (1L << (Require - 108)) | (1L << (RequireOnce - 108)) | (1L << (Resource - 108)) | (1L << (Return - 108)) | (1L << (Static - 108)) | (1L << (StringType - 108)) | (1L << (Switch - 108)) | (1L << (Throw - 108)) | (1L << (Trait - 108)) | (1L << (Try - 108)) | (1L << (Typeof - 108)) | (1L << (UintCast - 108)) | (1L << (UnicodeCast - 108)) | (1L << (Unset - 108)) | (1L << (Use - 108)) | (1L << (Var - 108)) | (1L << (While - 108)) | (1L << (Yield - 108)) | (1L << (From - 108)) | (1L << (Get - 108)) | (1L << (Set - 108)) | (1L << (Call - 108)) | (1L << (CallStatic - 108)) | (1L << (Constructor - 108)) | (1L << (Destruct - 108)) | (1L << (Wakeup - 108)) | (1L << (Sleep - 108)) | (1L << (Autoload - 108)) | (1L << (IsSet__ - 108)) | (1L << (Unset__ - 108)) | (1L << (ToString__ - 108)) | (1L << (Invoke - 108)) | (1L << (SetState - 108)) | (1L << (Clone__ - 108)) | (1L << (DebugInfo - 108)) | (1L << (Namespace__ - 108)) | (1L << (Class__ - 108)) | (1L << (Traic__ - 108)) | (1L << (Function__ - 108)) | (1L << (Method__ - 108)) | (1L << (Line__ - 108)) | (1L << (File__ - 108)) | (1L << (Dir__ - 108)))) != 0) || ((((_la - 188)) & ~0x3f) == 0 && ((1L << (_la - 188)) & ((1L << (NamespaceSeparator - 188)) | (1L << (Plus - 188)) | (1L << (Minus - 188)) | (1L << (Dollar - 188)) | (1L << (OpenSquareBracket - 188)) | (1L << (VarName - 188)) | (1L << (Label - 188)) | (1L << (Octal - 188)) | (1L << (Decimal - 188)) | (1L << (Real - 188)) | (1L << (Hex - 188)) | (1L << (Binary - 188)) | (1L << (SingleQuoteString - 188)) | (1L << (DoubleQuote - 188)) | (1L << (StartNowDoc - 188)) | (1L << (StartHereDoc - 188)))) != 0)) {
					{
					setState(1540);
					constantArrayItemList();
					setState(1542);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==Comma) {
						{
						setState(1541);
						match(Comma);
						}
					}

					}
				}

				setState(1546);
				match(CloseSquareBracket);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1547);
				_la = _input.LA(1);
				if ( !(_la==Plus || _la==Minus) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1548);
				constantInititalizer();
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

	public static class ConstantArrayItemListContext extends ParserRuleContext {
		public List<ConstantArrayItemContext> constantArrayItem() {
			return getRuleContexts(ConstantArrayItemContext.class);
		}
		public ConstantArrayItemContext constantArrayItem(int i) {
			return getRuleContext(ConstantArrayItemContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(PhpParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(PhpParser.Comma, i);
		}
		public ConstantArrayItemListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constantArrayItemList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).enterConstantArrayItemList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).exitConstantArrayItemList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PhpParserVisitor ) return ((PhpParserVisitor<? extends T>)visitor).visitConstantArrayItemList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstantArrayItemListContext constantArrayItemList() throws RecognitionException {
		ConstantArrayItemListContext _localctx = new ConstantArrayItemListContext(_ctx, getState());
		enterRule(_localctx, 210, RULE_constantArrayItemList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1551);
			constantArrayItem();
			setState(1556);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,179,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1552);
					match(Comma);
					setState(1553);
					constantArrayItem();
					}
					} 
				}
				setState(1558);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,179,_ctx);
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

	public static class ConstantArrayItemContext extends ParserRuleContext {
		public List<ConstantInititalizerContext> constantInititalizer() {
			return getRuleContexts(ConstantInititalizerContext.class);
		}
		public ConstantInititalizerContext constantInititalizer(int i) {
			return getRuleContext(ConstantInititalizerContext.class,i);
		}
		public TerminalNode DoubleArrow() { return getToken(PhpParser.DoubleArrow, 0); }
		public ConstantArrayItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constantArrayItem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).enterConstantArrayItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).exitConstantArrayItem(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PhpParserVisitor ) return ((PhpParserVisitor<? extends T>)visitor).visitConstantArrayItem(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstantArrayItemContext constantArrayItem() throws RecognitionException {
		ConstantArrayItemContext _localctx = new ConstantArrayItemContext(_ctx, getState());
		enterRule(_localctx, 212, RULE_constantArrayItem);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1559);
			constantInititalizer();
			setState(1562);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DoubleArrow) {
				{
				setState(1560);
				match(DoubleArrow);
				setState(1561);
				constantInititalizer();
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

	public static class ConstantContext extends ParserRuleContext {
		public TerminalNode Null() { return getToken(PhpParser.Null, 0); }
		public LiteralConstantContext literalConstant() {
			return getRuleContext(LiteralConstantContext.class,0);
		}
		public MagicConstantContext magicConstant() {
			return getRuleContext(MagicConstantContext.class,0);
		}
		public ClassConstantContext classConstant() {
			return getRuleContext(ClassConstantContext.class,0);
		}
		public QualifiedNamespaceNameContext qualifiedNamespaceName() {
			return getRuleContext(QualifiedNamespaceNameContext.class,0);
		}
		public ConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constant; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).enterConstant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).exitConstant(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PhpParserVisitor ) return ((PhpParserVisitor<? extends T>)visitor).visitConstant(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstantContext constant() throws RecognitionException {
		ConstantContext _localctx = new ConstantContext(_ctx, getState());
		enterRule(_localctx, 214, RULE_constant);
		try {
			setState(1569);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,181,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1564);
				match(Null);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1565);
				literalConstant();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1566);
				magicConstant();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1567);
				classConstant();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1568);
				qualifiedNamespaceName();
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

	public static class LiteralConstantContext extends ParserRuleContext {
		public TerminalNode Real() { return getToken(PhpParser.Real, 0); }
		public TerminalNode BooleanConstant() { return getToken(PhpParser.BooleanConstant, 0); }
		public NumericConstantContext numericConstant() {
			return getRuleContext(NumericConstantContext.class,0);
		}
		public StringConstantContext stringConstant() {
			return getRuleContext(StringConstantContext.class,0);
		}
		public LiteralConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literalConstant; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).enterLiteralConstant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).exitLiteralConstant(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PhpParserVisitor ) return ((PhpParserVisitor<? extends T>)visitor).visitLiteralConstant(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralConstantContext literalConstant() throws RecognitionException {
		LiteralConstantContext _localctx = new LiteralConstantContext(_ctx, getState());
		enterRule(_localctx, 216, RULE_literalConstant);
		try {
			setState(1575);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Real:
				enterOuterAlt(_localctx, 1);
				{
				setState(1571);
				match(Real);
				}
				break;
			case BooleanConstant:
				enterOuterAlt(_localctx, 2);
				{
				setState(1572);
				match(BooleanConstant);
				}
				break;
			case Octal:
			case Decimal:
			case Hex:
			case Binary:
				enterOuterAlt(_localctx, 3);
				{
				setState(1573);
				numericConstant();
				}
				break;
			case Label:
				enterOuterAlt(_localctx, 4);
				{
				setState(1574);
				stringConstant();
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

	public static class NumericConstantContext extends ParserRuleContext {
		public TerminalNode Octal() { return getToken(PhpParser.Octal, 0); }
		public TerminalNode Decimal() { return getToken(PhpParser.Decimal, 0); }
		public TerminalNode Hex() { return getToken(PhpParser.Hex, 0); }
		public TerminalNode Binary() { return getToken(PhpParser.Binary, 0); }
		public NumericConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numericConstant; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).enterNumericConstant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).exitNumericConstant(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PhpParserVisitor ) return ((PhpParserVisitor<? extends T>)visitor).visitNumericConstant(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumericConstantContext numericConstant() throws RecognitionException {
		NumericConstantContext _localctx = new NumericConstantContext(_ctx, getState());
		enterRule(_localctx, 218, RULE_numericConstant);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1577);
			_la = _input.LA(1);
			if ( !(((((_la - 220)) & ~0x3f) == 0 && ((1L << (_la - 220)) & ((1L << (Octal - 220)) | (1L << (Decimal - 220)) | (1L << (Hex - 220)) | (1L << (Binary - 220)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class ClassConstantContext extends ParserRuleContext {
		public TerminalNode DoubleColon() { return getToken(PhpParser.DoubleColon, 0); }
		public TerminalNode Class() { return getToken(PhpParser.Class, 0); }
		public TerminalNode Parent_() { return getToken(PhpParser.Parent_, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode Constructor() { return getToken(PhpParser.Constructor, 0); }
		public TerminalNode Get() { return getToken(PhpParser.Get, 0); }
		public TerminalNode Set() { return getToken(PhpParser.Set, 0); }
		public QualifiedStaticTypeRefContext qualifiedStaticTypeRef() {
			return getRuleContext(QualifiedStaticTypeRefContext.class,0);
		}
		public List<KeyedVariableContext> keyedVariable() {
			return getRuleContexts(KeyedVariableContext.class);
		}
		public KeyedVariableContext keyedVariable(int i) {
			return getRuleContext(KeyedVariableContext.class,i);
		}
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public ClassConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classConstant; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).enterClassConstant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).exitClassConstant(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PhpParserVisitor ) return ((PhpParserVisitor<? extends T>)visitor).visitClassConstant(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassConstantContext classConstant() throws RecognitionException {
		ClassConstantContext _localctx = new ClassConstantContext(_ctx, getState());
		enterRule(_localctx, 220, RULE_classConstant);
		int _la;
		try {
			setState(1597);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,186,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1579);
				_la = _input.LA(1);
				if ( !(_la==Class || _la==Parent_) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1580);
				match(DoubleColon);
				setState(1585);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,183,_ctx) ) {
				case 1:
					{
					setState(1581);
					identifier();
					}
					break;
				case 2:
					{
					setState(1582);
					match(Constructor);
					}
					break;
				case 3:
					{
					setState(1583);
					match(Get);
					}
					break;
				case 4:
					{
					setState(1584);
					match(Set);
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1590);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case Abstract:
				case Array:
				case As:
				case BinaryCast:
				case BoolType:
				case BooleanConstant:
				case Break:
				case Callable:
				case Case:
				case Catch:
				case Class:
				case Clone:
				case Const:
				case Continue:
				case Declare:
				case Default:
				case Do:
				case DoubleCast:
				case DoubleType:
				case Echo:
				case Else:
				case ElseIf:
				case Empty:
				case EndDeclare:
				case EndFor:
				case EndForeach:
				case EndIf:
				case EndSwitch:
				case EndWhile:
				case Eval:
				case Exit:
				case Extends:
				case Final:
				case Finally:
				case FloatCast:
				case For:
				case Foreach:
				case Function:
				case Global:
				case Goto:
				case If:
				case Implements:
				case Import:
				case Include:
				case IncludeOnce:
				case InstanceOf:
				case InsteadOf:
				case Int8Cast:
				case Int16Cast:
				case Int64Type:
				case IntType:
				case Interface:
				case IsSet:
				case List:
				case LogicalAnd:
				case LogicalOr:
				case LogicalXor:
				case Namespace:
				case New:
				case Null:
				case ObjectType:
				case Parent_:
				case Partial:
				case Print:
				case Private:
				case Protected:
				case Public:
				case Require:
				case RequireOnce:
				case Resource:
				case Return:
				case Static:
				case StringType:
				case Switch:
				case Throw:
				case Trait:
				case Try:
				case Typeof:
				case UintCast:
				case UnicodeCast:
				case Unset:
				case Use:
				case Var:
				case While:
				case Yield:
				case From:
				case Get:
				case Set:
				case Call:
				case CallStatic:
				case Constructor:
				case Destruct:
				case Wakeup:
				case Sleep:
				case Autoload:
				case IsSet__:
				case Unset__:
				case ToString__:
				case Invoke:
				case SetState:
				case Clone__:
				case DebugInfo:
				case Namespace__:
				case Class__:
				case Traic__:
				case Function__:
				case Method__:
				case Line__:
				case File__:
				case Dir__:
				case NamespaceSeparator:
				case Label:
					{
					setState(1587);
					qualifiedStaticTypeRef();
					}
					break;
				case Dollar:
				case VarName:
					{
					setState(1588);
					keyedVariable();
					}
					break;
				case SingleQuoteString:
				case DoubleQuote:
				case StartNowDoc:
				case StartHereDoc:
					{
					setState(1589);
					string();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1592);
				match(DoubleColon);
				setState(1595);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case Abstract:
				case Array:
				case As:
				case BinaryCast:
				case BoolType:
				case BooleanConstant:
				case Break:
				case Callable:
				case Case:
				case Catch:
				case Class:
				case Clone:
				case Const:
				case Continue:
				case Declare:
				case Default:
				case Do:
				case DoubleCast:
				case DoubleType:
				case Echo:
				case Else:
				case ElseIf:
				case Empty:
				case EndDeclare:
				case EndFor:
				case EndForeach:
				case EndIf:
				case EndSwitch:
				case EndWhile:
				case Eval:
				case Exit:
				case Extends:
				case Final:
				case Finally:
				case FloatCast:
				case For:
				case Foreach:
				case Function:
				case Global:
				case Goto:
				case If:
				case Implements:
				case Import:
				case Include:
				case IncludeOnce:
				case InstanceOf:
				case InsteadOf:
				case Int8Cast:
				case Int16Cast:
				case Int64Type:
				case IntType:
				case Interface:
				case IsSet:
				case List:
				case LogicalAnd:
				case LogicalOr:
				case LogicalXor:
				case Namespace:
				case New:
				case Null:
				case ObjectType:
				case Parent_:
				case Partial:
				case Print:
				case Private:
				case Protected:
				case Public:
				case Require:
				case RequireOnce:
				case Resource:
				case Return:
				case Static:
				case StringType:
				case Switch:
				case Throw:
				case Trait:
				case Try:
				case Typeof:
				case UintCast:
				case UnicodeCast:
				case Unset:
				case Use:
				case Var:
				case While:
				case Yield:
				case From:
				case Get:
				case Set:
				case Call:
				case CallStatic:
				case Constructor:
				case Destruct:
				case Wakeup:
				case Sleep:
				case Autoload:
				case IsSet__:
				case Unset__:
				case ToString__:
				case Invoke:
				case SetState:
				case Clone__:
				case DebugInfo:
				case Namespace__:
				case Class__:
				case Traic__:
				case Function__:
				case Method__:
				case Line__:
				case File__:
				case Dir__:
				case Label:
					{
					setState(1593);
					identifier();
					}
					break;
				case Dollar:
				case VarName:
					{
					setState(1594);
					keyedVariable();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
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

	public static class StringConstantContext extends ParserRuleContext {
		public TerminalNode Label() { return getToken(PhpParser.Label, 0); }
		public StringConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stringConstant; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).enterStringConstant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).exitStringConstant(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PhpParserVisitor ) return ((PhpParserVisitor<? extends T>)visitor).visitStringConstant(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StringConstantContext stringConstant() throws RecognitionException {
		StringConstantContext _localctx = new StringConstantContext(_ctx, getState());
		enterRule(_localctx, 222, RULE_stringConstant);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1599);
			match(Label);
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

	public static class StringContext extends ParserRuleContext {
		public TerminalNode StartHereDoc() { return getToken(PhpParser.StartHereDoc, 0); }
		public List<TerminalNode> HereDocText() { return getTokens(PhpParser.HereDocText); }
		public TerminalNode HereDocText(int i) {
			return getToken(PhpParser.HereDocText, i);
		}
		public TerminalNode StartNowDoc() { return getToken(PhpParser.StartNowDoc, 0); }
		public TerminalNode SingleQuoteString() { return getToken(PhpParser.SingleQuoteString, 0); }
		public List<TerminalNode> DoubleQuote() { return getTokens(PhpParser.DoubleQuote); }
		public TerminalNode DoubleQuote(int i) {
			return getToken(PhpParser.DoubleQuote, i);
		}
		public List<InterpolatedStringPartContext> interpolatedStringPart() {
			return getRuleContexts(InterpolatedStringPartContext.class);
		}
		public InterpolatedStringPartContext interpolatedStringPart(int i) {
			return getRuleContext(InterpolatedStringPartContext.class,i);
		}
		public StringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).enterString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).exitString(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PhpParserVisitor ) return ((PhpParserVisitor<? extends T>)visitor).visitString(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StringContext string() throws RecognitionException {
		StringContext _localctx = new StringContext(_ctx, getState());
		enterRule(_localctx, 224, RULE_string);
		try {
			int _alt;
			setState(1622);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case StartHereDoc:
				enterOuterAlt(_localctx, 1);
				{
				setState(1601);
				match(StartHereDoc);
				setState(1603); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(1602);
						match(HereDocText);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(1605); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,187,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case StartNowDoc:
				enterOuterAlt(_localctx, 2);
				{
				setState(1607);
				match(StartNowDoc);
				setState(1609); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(1608);
						match(HereDocText);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(1611); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,188,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case SingleQuoteString:
				enterOuterAlt(_localctx, 3);
				{
				setState(1613);
				match(SingleQuoteString);
				}
				break;
			case DoubleQuote:
				enterOuterAlt(_localctx, 4);
				{
				setState(1614);
				match(DoubleQuote);
				setState(1618);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,189,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1615);
						interpolatedStringPart();
						}
						} 
					}
					setState(1620);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,189,_ctx);
				}
				setState(1621);
				match(DoubleQuote);
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

	public static class InterpolatedStringPartContext extends ParserRuleContext {
		public TerminalNode StringPart() { return getToken(PhpParser.StringPart, 0); }
		public TerminalNode UnicodeEscape() { return getToken(PhpParser.UnicodeEscape, 0); }
		public ChainContext chain() {
			return getRuleContext(ChainContext.class,0);
		}
		public InterpolatedStringPartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interpolatedStringPart; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).enterInterpolatedStringPart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).exitInterpolatedStringPart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PhpParserVisitor ) return ((PhpParserVisitor<? extends T>)visitor).visitInterpolatedStringPart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InterpolatedStringPartContext interpolatedStringPart() throws RecognitionException {
		InterpolatedStringPartContext _localctx = new InterpolatedStringPartContext(_ctx, getState());
		enterRule(_localctx, 226, RULE_interpolatedStringPart);
		try {
			setState(1627);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case StringPart:
				enterOuterAlt(_localctx, 1);
				{
				setState(1624);
				match(StringPart);
				}
				break;
			case UnicodeEscape:
				enterOuterAlt(_localctx, 2);
				{
				setState(1625);
				match(UnicodeEscape);
				}
				break;
			case Abstract:
			case Array:
			case As:
			case BinaryCast:
			case BoolType:
			case BooleanConstant:
			case Break:
			case Callable:
			case Case:
			case Catch:
			case Class:
			case Clone:
			case Const:
			case Continue:
			case Declare:
			case Default:
			case Do:
			case DoubleCast:
			case DoubleType:
			case Echo:
			case Else:
			case ElseIf:
			case Empty:
			case EndDeclare:
			case EndFor:
			case EndForeach:
			case EndIf:
			case EndSwitch:
			case EndWhile:
			case Eval:
			case Exit:
			case Extends:
			case Final:
			case Finally:
			case FloatCast:
			case For:
			case Foreach:
			case Function:
			case Global:
			case Goto:
			case If:
			case Implements:
			case Import:
			case Include:
			case IncludeOnce:
			case InstanceOf:
			case InsteadOf:
			case Int8Cast:
			case Int16Cast:
			case Int64Type:
			case IntType:
			case Interface:
			case IsSet:
			case List:
			case LogicalAnd:
			case LogicalOr:
			case LogicalXor:
			case Namespace:
			case New:
			case Null:
			case ObjectType:
			case Parent_:
			case Partial:
			case Print:
			case Private:
			case Protected:
			case Public:
			case Require:
			case RequireOnce:
			case Resource:
			case Return:
			case Static:
			case StringType:
			case Switch:
			case Throw:
			case Trait:
			case Try:
			case Typeof:
			case UintCast:
			case UnicodeCast:
			case Unset:
			case Use:
			case Var:
			case While:
			case Yield:
			case From:
			case Get:
			case Set:
			case Call:
			case CallStatic:
			case Constructor:
			case Destruct:
			case Wakeup:
			case Sleep:
			case Autoload:
			case IsSet__:
			case Unset__:
			case ToString__:
			case Invoke:
			case SetState:
			case Clone__:
			case DebugInfo:
			case Namespace__:
			case Class__:
			case Traic__:
			case Function__:
			case Method__:
			case Line__:
			case File__:
			case Dir__:
			case NamespaceSeparator:
			case Dollar:
			case OpenRoundBracket:
			case VarName:
			case Label:
			case SingleQuoteString:
			case DoubleQuote:
			case StartNowDoc:
			case StartHereDoc:
				enterOuterAlt(_localctx, 3);
				{
				setState(1626);
				chain();
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

	public static class ChainListContext extends ParserRuleContext {
		public List<ChainContext> chain() {
			return getRuleContexts(ChainContext.class);
		}
		public ChainContext chain(int i) {
			return getRuleContext(ChainContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(PhpParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(PhpParser.Comma, i);
		}
		public ChainListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_chainList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).enterChainList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).exitChainList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PhpParserVisitor ) return ((PhpParserVisitor<? extends T>)visitor).visitChainList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ChainListContext chainList() throws RecognitionException {
		ChainListContext _localctx = new ChainListContext(_ctx, getState());
		enterRule(_localctx, 228, RULE_chainList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1629);
			chain();
			setState(1634);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(1630);
				match(Comma);
				setState(1631);
				chain();
				}
				}
				setState(1636);
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

	public static class ChainContext extends ParserRuleContext {
		public ChainOriginContext chainOrigin() {
			return getRuleContext(ChainOriginContext.class,0);
		}
		public List<MemberAccessContext> memberAccess() {
			return getRuleContexts(MemberAccessContext.class);
		}
		public MemberAccessContext memberAccess(int i) {
			return getRuleContext(MemberAccessContext.class,i);
		}
		public ChainContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_chain; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).enterChain(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).exitChain(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PhpParserVisitor ) return ((PhpParserVisitor<? extends T>)visitor).visitChain(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ChainContext chain() throws RecognitionException {
		ChainContext _localctx = new ChainContext(_ctx, getState());
		enterRule(_localctx, 230, RULE_chain);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1637);
			chainOrigin();
			setState(1641);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,193,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1638);
					memberAccess();
					}
					} 
				}
				setState(1643);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,193,_ctx);
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

	public static class ChainOriginContext extends ParserRuleContext {
		public ChainBaseContext chainBase() {
			return getRuleContext(ChainBaseContext.class,0);
		}
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public TerminalNode OpenRoundBracket() { return getToken(PhpParser.OpenRoundBracket, 0); }
		public NewExprContext newExpr() {
			return getRuleContext(NewExprContext.class,0);
		}
		public TerminalNode CloseRoundBracket() { return getToken(PhpParser.CloseRoundBracket, 0); }
		public ChainOriginContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_chainOrigin; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).enterChainOrigin(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).exitChainOrigin(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PhpParserVisitor ) return ((PhpParserVisitor<? extends T>)visitor).visitChainOrigin(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ChainOriginContext chainOrigin() throws RecognitionException {
		ChainOriginContext _localctx = new ChainOriginContext(_ctx, getState());
		enterRule(_localctx, 232, RULE_chainOrigin);
		try {
			setState(1650);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,194,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1644);
				chainBase();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1645);
				functionCall();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1646);
				match(OpenRoundBracket);
				setState(1647);
				newExpr();
				setState(1648);
				match(CloseRoundBracket);
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

	public static class MemberAccessContext extends ParserRuleContext {
		public TerminalNode ObjectOperator() { return getToken(PhpParser.ObjectOperator, 0); }
		public KeyedFieldNameContext keyedFieldName() {
			return getRuleContext(KeyedFieldNameContext.class,0);
		}
		public ActualArgumentsContext actualArguments() {
			return getRuleContext(ActualArgumentsContext.class,0);
		}
		public MemberAccessContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_memberAccess; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).enterMemberAccess(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).exitMemberAccess(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PhpParserVisitor ) return ((PhpParserVisitor<? extends T>)visitor).visitMemberAccess(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MemberAccessContext memberAccess() throws RecognitionException {
		MemberAccessContext _localctx = new MemberAccessContext(_ctx, getState());
		enterRule(_localctx, 234, RULE_memberAccess);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1652);
			match(ObjectOperator);
			setState(1653);
			keyedFieldName();
			setState(1655);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,195,_ctx) ) {
			case 1:
				{
				setState(1654);
				actualArguments();
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

	public static class FunctionCallContext extends ParserRuleContext {
		public FunctionCallNameContext functionCallName() {
			return getRuleContext(FunctionCallNameContext.class,0);
		}
		public ActualArgumentsContext actualArguments() {
			return getRuleContext(ActualArgumentsContext.class,0);
		}
		public FunctionCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).enterFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).exitFunctionCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PhpParserVisitor ) return ((PhpParserVisitor<? extends T>)visitor).visitFunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionCallContext functionCall() throws RecognitionException {
		FunctionCallContext _localctx = new FunctionCallContext(_ctx, getState());
		enterRule(_localctx, 236, RULE_functionCall);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1657);
			functionCallName();
			setState(1658);
			actualArguments();
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

	public static class FunctionCallNameContext extends ParserRuleContext {
		public QualifiedNamespaceNameContext qualifiedNamespaceName() {
			return getRuleContext(QualifiedNamespaceNameContext.class,0);
		}
		public ClassConstantContext classConstant() {
			return getRuleContext(ClassConstantContext.class,0);
		}
		public ChainBaseContext chainBase() {
			return getRuleContext(ChainBaseContext.class,0);
		}
		public ParenthesesContext parentheses() {
			return getRuleContext(ParenthesesContext.class,0);
		}
		public FunctionCallNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCallName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).enterFunctionCallName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).exitFunctionCallName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PhpParserVisitor ) return ((PhpParserVisitor<? extends T>)visitor).visitFunctionCallName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionCallNameContext functionCallName() throws RecognitionException {
		FunctionCallNameContext _localctx = new FunctionCallNameContext(_ctx, getState());
		enterRule(_localctx, 238, RULE_functionCallName);
		try {
			setState(1664);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,196,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1660);
				qualifiedNamespaceName();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1661);
				classConstant();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1662);
				chainBase();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1663);
				parentheses();
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

	public static class ActualArgumentsContext extends ParserRuleContext {
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public GenericDynamicArgsContext genericDynamicArgs() {
			return getRuleContext(GenericDynamicArgsContext.class,0);
		}
		public List<SquareCurlyExpressionContext> squareCurlyExpression() {
			return getRuleContexts(SquareCurlyExpressionContext.class);
		}
		public SquareCurlyExpressionContext squareCurlyExpression(int i) {
			return getRuleContext(SquareCurlyExpressionContext.class,i);
		}
		public ActualArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_actualArguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).enterActualArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).exitActualArguments(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PhpParserVisitor ) return ((PhpParserVisitor<? extends T>)visitor).visitActualArguments(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ActualArgumentsContext actualArguments() throws RecognitionException {
		ActualArgumentsContext _localctx = new ActualArgumentsContext(_ctx, getState());
		enterRule(_localctx, 240, RULE_actualArguments);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1667);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Lgeneric) {
				{
				setState(1666);
				genericDynamicArgs();
				}
			}

			setState(1669);
			arguments();
			setState(1673);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,198,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1670);
					squareCurlyExpression();
					}
					} 
				}
				setState(1675);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,198,_ctx);
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

	public static class ChainBaseContext extends ParserRuleContext {
		public List<KeyedVariableContext> keyedVariable() {
			return getRuleContexts(KeyedVariableContext.class);
		}
		public KeyedVariableContext keyedVariable(int i) {
			return getRuleContext(KeyedVariableContext.class,i);
		}
		public TerminalNode DoubleColon() { return getToken(PhpParser.DoubleColon, 0); }
		public QualifiedStaticTypeRefContext qualifiedStaticTypeRef() {
			return getRuleContext(QualifiedStaticTypeRefContext.class,0);
		}
		public ChainBaseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_chainBase; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).enterChainBase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).exitChainBase(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PhpParserVisitor ) return ((PhpParserVisitor<? extends T>)visitor).visitChainBase(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ChainBaseContext chainBase() throws RecognitionException {
		ChainBaseContext _localctx = new ChainBaseContext(_ctx, getState());
		enterRule(_localctx, 242, RULE_chainBase);
		try {
			setState(1685);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Dollar:
			case VarName:
				enterOuterAlt(_localctx, 1);
				{
				setState(1676);
				keyedVariable();
				setState(1679);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,199,_ctx) ) {
				case 1:
					{
					setState(1677);
					match(DoubleColon);
					setState(1678);
					keyedVariable();
					}
					break;
				}
				}
				break;
			case Abstract:
			case Array:
			case As:
			case BinaryCast:
			case BoolType:
			case BooleanConstant:
			case Break:
			case Callable:
			case Case:
			case Catch:
			case Class:
			case Clone:
			case Const:
			case Continue:
			case Declare:
			case Default:
			case Do:
			case DoubleCast:
			case DoubleType:
			case Echo:
			case Else:
			case ElseIf:
			case Empty:
			case EndDeclare:
			case EndFor:
			case EndForeach:
			case EndIf:
			case EndSwitch:
			case EndWhile:
			case Eval:
			case Exit:
			case Extends:
			case Final:
			case Finally:
			case FloatCast:
			case For:
			case Foreach:
			case Function:
			case Global:
			case Goto:
			case If:
			case Implements:
			case Import:
			case Include:
			case IncludeOnce:
			case InstanceOf:
			case InsteadOf:
			case Int8Cast:
			case Int16Cast:
			case Int64Type:
			case IntType:
			case Interface:
			case IsSet:
			case List:
			case LogicalAnd:
			case LogicalOr:
			case LogicalXor:
			case Namespace:
			case New:
			case Null:
			case ObjectType:
			case Parent_:
			case Partial:
			case Print:
			case Private:
			case Protected:
			case Public:
			case Require:
			case RequireOnce:
			case Resource:
			case Return:
			case Static:
			case StringType:
			case Switch:
			case Throw:
			case Trait:
			case Try:
			case Typeof:
			case UintCast:
			case UnicodeCast:
			case Unset:
			case Use:
			case Var:
			case While:
			case Yield:
			case From:
			case Get:
			case Set:
			case Call:
			case CallStatic:
			case Constructor:
			case Destruct:
			case Wakeup:
			case Sleep:
			case Autoload:
			case IsSet__:
			case Unset__:
			case ToString__:
			case Invoke:
			case SetState:
			case Clone__:
			case DebugInfo:
			case Namespace__:
			case Class__:
			case Traic__:
			case Function__:
			case Method__:
			case Line__:
			case File__:
			case Dir__:
			case NamespaceSeparator:
			case Label:
				enterOuterAlt(_localctx, 2);
				{
				setState(1681);
				qualifiedStaticTypeRef();
				setState(1682);
				match(DoubleColon);
				setState(1683);
				keyedVariable();
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

	public static class KeyedFieldNameContext extends ParserRuleContext {
		public KeyedSimpleFieldNameContext keyedSimpleFieldName() {
			return getRuleContext(KeyedSimpleFieldNameContext.class,0);
		}
		public KeyedVariableContext keyedVariable() {
			return getRuleContext(KeyedVariableContext.class,0);
		}
		public KeyedFieldNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_keyedFieldName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).enterKeyedFieldName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).exitKeyedFieldName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PhpParserVisitor ) return ((PhpParserVisitor<? extends T>)visitor).visitKeyedFieldName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final KeyedFieldNameContext keyedFieldName() throws RecognitionException {
		KeyedFieldNameContext _localctx = new KeyedFieldNameContext(_ctx, getState());
		enterRule(_localctx, 244, RULE_keyedFieldName);
		try {
			setState(1689);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Abstract:
			case Array:
			case As:
			case BinaryCast:
			case BoolType:
			case BooleanConstant:
			case Break:
			case Callable:
			case Case:
			case Catch:
			case Class:
			case Clone:
			case Const:
			case Continue:
			case Declare:
			case Default:
			case Do:
			case DoubleCast:
			case DoubleType:
			case Echo:
			case Else:
			case ElseIf:
			case Empty:
			case EndDeclare:
			case EndFor:
			case EndForeach:
			case EndIf:
			case EndSwitch:
			case EndWhile:
			case Eval:
			case Exit:
			case Extends:
			case Final:
			case Finally:
			case FloatCast:
			case For:
			case Foreach:
			case Function:
			case Global:
			case Goto:
			case If:
			case Implements:
			case Import:
			case Include:
			case IncludeOnce:
			case InstanceOf:
			case InsteadOf:
			case Int8Cast:
			case Int16Cast:
			case Int64Type:
			case IntType:
			case Interface:
			case IsSet:
			case List:
			case LogicalAnd:
			case LogicalOr:
			case LogicalXor:
			case Namespace:
			case New:
			case Null:
			case ObjectType:
			case Parent_:
			case Partial:
			case Print:
			case Private:
			case Protected:
			case Public:
			case Require:
			case RequireOnce:
			case Resource:
			case Return:
			case Static:
			case StringType:
			case Switch:
			case Throw:
			case Trait:
			case Try:
			case Typeof:
			case UintCast:
			case UnicodeCast:
			case Unset:
			case Use:
			case Var:
			case While:
			case Yield:
			case From:
			case Get:
			case Set:
			case Call:
			case CallStatic:
			case Constructor:
			case Destruct:
			case Wakeup:
			case Sleep:
			case Autoload:
			case IsSet__:
			case Unset__:
			case ToString__:
			case Invoke:
			case SetState:
			case Clone__:
			case DebugInfo:
			case Namespace__:
			case Class__:
			case Traic__:
			case Function__:
			case Method__:
			case Line__:
			case File__:
			case Dir__:
			case OpenCurlyBracket:
			case Label:
				enterOuterAlt(_localctx, 1);
				{
				setState(1687);
				keyedSimpleFieldName();
				}
				break;
			case Dollar:
			case VarName:
				enterOuterAlt(_localctx, 2);
				{
				setState(1688);
				keyedVariable();
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

	public static class KeyedSimpleFieldNameContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode OpenCurlyBracket() { return getToken(PhpParser.OpenCurlyBracket, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode CloseCurlyBracket() { return getToken(PhpParser.CloseCurlyBracket, 0); }
		public List<SquareCurlyExpressionContext> squareCurlyExpression() {
			return getRuleContexts(SquareCurlyExpressionContext.class);
		}
		public SquareCurlyExpressionContext squareCurlyExpression(int i) {
			return getRuleContext(SquareCurlyExpressionContext.class,i);
		}
		public KeyedSimpleFieldNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_keyedSimpleFieldName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).enterKeyedSimpleFieldName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).exitKeyedSimpleFieldName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PhpParserVisitor ) return ((PhpParserVisitor<? extends T>)visitor).visitKeyedSimpleFieldName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final KeyedSimpleFieldNameContext keyedSimpleFieldName() throws RecognitionException {
		KeyedSimpleFieldNameContext _localctx = new KeyedSimpleFieldNameContext(_ctx, getState());
		enterRule(_localctx, 246, RULE_keyedSimpleFieldName);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1696);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Abstract:
			case Array:
			case As:
			case BinaryCast:
			case BoolType:
			case BooleanConstant:
			case Break:
			case Callable:
			case Case:
			case Catch:
			case Class:
			case Clone:
			case Const:
			case Continue:
			case Declare:
			case Default:
			case Do:
			case DoubleCast:
			case DoubleType:
			case Echo:
			case Else:
			case ElseIf:
			case Empty:
			case EndDeclare:
			case EndFor:
			case EndForeach:
			case EndIf:
			case EndSwitch:
			case EndWhile:
			case Eval:
			case Exit:
			case Extends:
			case Final:
			case Finally:
			case FloatCast:
			case For:
			case Foreach:
			case Function:
			case Global:
			case Goto:
			case If:
			case Implements:
			case Import:
			case Include:
			case IncludeOnce:
			case InstanceOf:
			case InsteadOf:
			case Int8Cast:
			case Int16Cast:
			case Int64Type:
			case IntType:
			case Interface:
			case IsSet:
			case List:
			case LogicalAnd:
			case LogicalOr:
			case LogicalXor:
			case Namespace:
			case New:
			case Null:
			case ObjectType:
			case Parent_:
			case Partial:
			case Print:
			case Private:
			case Protected:
			case Public:
			case Require:
			case RequireOnce:
			case Resource:
			case Return:
			case Static:
			case StringType:
			case Switch:
			case Throw:
			case Trait:
			case Try:
			case Typeof:
			case UintCast:
			case UnicodeCast:
			case Unset:
			case Use:
			case Var:
			case While:
			case Yield:
			case From:
			case Get:
			case Set:
			case Call:
			case CallStatic:
			case Constructor:
			case Destruct:
			case Wakeup:
			case Sleep:
			case Autoload:
			case IsSet__:
			case Unset__:
			case ToString__:
			case Invoke:
			case SetState:
			case Clone__:
			case DebugInfo:
			case Namespace__:
			case Class__:
			case Traic__:
			case Function__:
			case Method__:
			case Line__:
			case File__:
			case Dir__:
			case Label:
				{
				setState(1691);
				identifier();
				}
				break;
			case OpenCurlyBracket:
				{
				setState(1692);
				match(OpenCurlyBracket);
				setState(1693);
				expression(0);
				setState(1694);
				match(CloseCurlyBracket);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1701);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,203,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1698);
					squareCurlyExpression();
					}
					} 
				}
				setState(1703);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,203,_ctx);
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

	public static class KeyedVariableContext extends ParserRuleContext {
		public TerminalNode VarName() { return getToken(PhpParser.VarName, 0); }
		public List<TerminalNode> Dollar() { return getTokens(PhpParser.Dollar); }
		public TerminalNode Dollar(int i) {
			return getToken(PhpParser.Dollar, i);
		}
		public TerminalNode OpenCurlyBracket() { return getToken(PhpParser.OpenCurlyBracket, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode CloseCurlyBracket() { return getToken(PhpParser.CloseCurlyBracket, 0); }
		public List<SquareCurlyExpressionContext> squareCurlyExpression() {
			return getRuleContexts(SquareCurlyExpressionContext.class);
		}
		public SquareCurlyExpressionContext squareCurlyExpression(int i) {
			return getRuleContext(SquareCurlyExpressionContext.class,i);
		}
		public KeyedVariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_keyedVariable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).enterKeyedVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).exitKeyedVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PhpParserVisitor ) return ((PhpParserVisitor<? extends T>)visitor).visitKeyedVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final KeyedVariableContext keyedVariable() throws RecognitionException {
		KeyedVariableContext _localctx = new KeyedVariableContext(_ctx, getState());
		enterRule(_localctx, 248, RULE_keyedVariable);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1707);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,204,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1704);
					match(Dollar);
					}
					} 
				}
				setState(1709);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,204,_ctx);
			}
			setState(1716);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VarName:
				{
				setState(1710);
				match(VarName);
				}
				break;
			case Dollar:
				{
				setState(1711);
				match(Dollar);
				setState(1712);
				match(OpenCurlyBracket);
				setState(1713);
				expression(0);
				setState(1714);
				match(CloseCurlyBracket);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1721);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,206,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1718);
					squareCurlyExpression();
					}
					} 
				}
				setState(1723);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,206,_ctx);
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

	public static class SquareCurlyExpressionContext extends ParserRuleContext {
		public TerminalNode OpenSquareBracket() { return getToken(PhpParser.OpenSquareBracket, 0); }
		public TerminalNode CloseSquareBracket() { return getToken(PhpParser.CloseSquareBracket, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode OpenCurlyBracket() { return getToken(PhpParser.OpenCurlyBracket, 0); }
		public TerminalNode CloseCurlyBracket() { return getToken(PhpParser.CloseCurlyBracket, 0); }
		public SquareCurlyExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_squareCurlyExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).enterSquareCurlyExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).exitSquareCurlyExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PhpParserVisitor ) return ((PhpParserVisitor<? extends T>)visitor).visitSquareCurlyExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SquareCurlyExpressionContext squareCurlyExpression() throws RecognitionException {
		SquareCurlyExpressionContext _localctx = new SquareCurlyExpressionContext(_ctx, getState());
		enterRule(_localctx, 250, RULE_squareCurlyExpression);
		int _la;
		try {
			setState(1733);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OpenSquareBracket:
				enterOuterAlt(_localctx, 1);
				{
				setState(1724);
				match(OpenSquareBracket);
				setState(1726);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 44)) & ~0x3f) == 0 && ((1L << (_la - 44)) & ((1L << (Abstract - 44)) | (1L << (Array - 44)) | (1L << (As - 44)) | (1L << (BinaryCast - 44)) | (1L << (BoolType - 44)) | (1L << (BooleanConstant - 44)) | (1L << (Break - 44)) | (1L << (Callable - 44)) | (1L << (Case - 44)) | (1L << (Catch - 44)) | (1L << (Class - 44)) | (1L << (Clone - 44)) | (1L << (Const - 44)) | (1L << (Continue - 44)) | (1L << (Declare - 44)) | (1L << (Default - 44)) | (1L << (Do - 44)) | (1L << (DoubleCast - 44)) | (1L << (DoubleType - 44)) | (1L << (Echo - 44)) | (1L << (Else - 44)) | (1L << (ElseIf - 44)) | (1L << (Empty - 44)) | (1L << (EndDeclare - 44)) | (1L << (EndFor - 44)) | (1L << (EndForeach - 44)) | (1L << (EndIf - 44)) | (1L << (EndSwitch - 44)) | (1L << (EndWhile - 44)) | (1L << (Eval - 44)) | (1L << (Exit - 44)) | (1L << (Extends - 44)) | (1L << (Final - 44)) | (1L << (Finally - 44)) | (1L << (FloatCast - 44)) | (1L << (For - 44)) | (1L << (Foreach - 44)) | (1L << (Function - 44)) | (1L << (Global - 44)) | (1L << (Goto - 44)) | (1L << (If - 44)) | (1L << (Implements - 44)) | (1L << (Import - 44)) | (1L << (Include - 44)) | (1L << (IncludeOnce - 44)) | (1L << (InstanceOf - 44)) | (1L << (InsteadOf - 44)) | (1L << (Int8Cast - 44)) | (1L << (Int16Cast - 44)) | (1L << (Int64Type - 44)) | (1L << (IntType - 44)) | (1L << (Interface - 44)) | (1L << (IsSet - 44)) | (1L << (List - 44)) | (1L << (LogicalAnd - 44)) | (1L << (LogicalOr - 44)) | (1L << (LogicalXor - 44)) | (1L << (Namespace - 44)) | (1L << (New - 44)) | (1L << (Null - 44)) | (1L << (ObjectType - 44)) | (1L << (Parent_ - 44)) | (1L << (Partial - 44)) | (1L << (Print - 44)))) != 0) || ((((_la - 108)) & ~0x3f) == 0 && ((1L << (_la - 108)) & ((1L << (Private - 108)) | (1L << (Protected - 108)) | (1L << (Public - 108)) | (1L << (Require - 108)) | (1L << (RequireOnce - 108)) | (1L << (Resource - 108)) | (1L << (Return - 108)) | (1L << (Static - 108)) | (1L << (StringType - 108)) | (1L << (Switch - 108)) | (1L << (Throw - 108)) | (1L << (Trait - 108)) | (1L << (Try - 108)) | (1L << (Typeof - 108)) | (1L << (UintCast - 108)) | (1L << (UnicodeCast - 108)) | (1L << (Unset - 108)) | (1L << (Use - 108)) | (1L << (Var - 108)) | (1L << (While - 108)) | (1L << (Yield - 108)) | (1L << (From - 108)) | (1L << (LambdaFn - 108)) | (1L << (Get - 108)) | (1L << (Set - 108)) | (1L << (Call - 108)) | (1L << (CallStatic - 108)) | (1L << (Constructor - 108)) | (1L << (Destruct - 108)) | (1L << (Wakeup - 108)) | (1L << (Sleep - 108)) | (1L << (Autoload - 108)) | (1L << (IsSet__ - 108)) | (1L << (Unset__ - 108)) | (1L << (ToString__ - 108)) | (1L << (Invoke - 108)) | (1L << (SetState - 108)) | (1L << (Clone__ - 108)) | (1L << (DebugInfo - 108)) | (1L << (Namespace__ - 108)) | (1L << (Class__ - 108)) | (1L << (Traic__ - 108)) | (1L << (Function__ - 108)) | (1L << (Method__ - 108)) | (1L << (Line__ - 108)) | (1L << (File__ - 108)) | (1L << (Dir__ - 108)) | (1L << (Inc - 108)) | (1L << (Dec - 108)))) != 0) || ((((_la - 188)) & ~0x3f) == 0 && ((1L << (_la - 188)) & ((1L << (NamespaceSeparator - 188)) | (1L << (Bang - 188)) | (1L << (Plus - 188)) | (1L << (Minus - 188)) | (1L << (Tilde - 188)) | (1L << (SuppressWarnings - 188)) | (1L << (Dollar - 188)) | (1L << (OpenRoundBracket - 188)) | (1L << (OpenSquareBracket - 188)) | (1L << (VarName - 188)) | (1L << (Label - 188)) | (1L << (Octal - 188)) | (1L << (Decimal - 188)) | (1L << (Real - 188)) | (1L << (Hex - 188)) | (1L << (Binary - 188)) | (1L << (BackQuoteString - 188)) | (1L << (SingleQuoteString - 188)) | (1L << (DoubleQuote - 188)) | (1L << (StartNowDoc - 188)) | (1L << (StartHereDoc - 188)))) != 0)) {
					{
					setState(1725);
					expression(0);
					}
				}

				setState(1728);
				match(CloseSquareBracket);
				}
				break;
			case OpenCurlyBracket:
				enterOuterAlt(_localctx, 2);
				{
				setState(1729);
				match(OpenCurlyBracket);
				setState(1730);
				expression(0);
				setState(1731);
				match(CloseCurlyBracket);
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

	public static class AssignmentListContext extends ParserRuleContext {
		public List<AssignmentListElementContext> assignmentListElement() {
			return getRuleContexts(AssignmentListElementContext.class);
		}
		public AssignmentListElementContext assignmentListElement(int i) {
			return getRuleContext(AssignmentListElementContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(PhpParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(PhpParser.Comma, i);
		}
		public AssignmentListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).enterAssignmentList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).exitAssignmentList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PhpParserVisitor ) return ((PhpParserVisitor<? extends T>)visitor).visitAssignmentList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentListContext assignmentList() throws RecognitionException {
		AssignmentListContext _localctx = new AssignmentListContext(_ctx, getState());
		enterRule(_localctx, 252, RULE_assignmentList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1736);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 44)) & ~0x3f) == 0 && ((1L << (_la - 44)) & ((1L << (Abstract - 44)) | (1L << (Array - 44)) | (1L << (As - 44)) | (1L << (BinaryCast - 44)) | (1L << (BoolType - 44)) | (1L << (BooleanConstant - 44)) | (1L << (Break - 44)) | (1L << (Callable - 44)) | (1L << (Case - 44)) | (1L << (Catch - 44)) | (1L << (Class - 44)) | (1L << (Clone - 44)) | (1L << (Const - 44)) | (1L << (Continue - 44)) | (1L << (Declare - 44)) | (1L << (Default - 44)) | (1L << (Do - 44)) | (1L << (DoubleCast - 44)) | (1L << (DoubleType - 44)) | (1L << (Echo - 44)) | (1L << (Else - 44)) | (1L << (ElseIf - 44)) | (1L << (Empty - 44)) | (1L << (EndDeclare - 44)) | (1L << (EndFor - 44)) | (1L << (EndForeach - 44)) | (1L << (EndIf - 44)) | (1L << (EndSwitch - 44)) | (1L << (EndWhile - 44)) | (1L << (Eval - 44)) | (1L << (Exit - 44)) | (1L << (Extends - 44)) | (1L << (Final - 44)) | (1L << (Finally - 44)) | (1L << (FloatCast - 44)) | (1L << (For - 44)) | (1L << (Foreach - 44)) | (1L << (Function - 44)) | (1L << (Global - 44)) | (1L << (Goto - 44)) | (1L << (If - 44)) | (1L << (Implements - 44)) | (1L << (Import - 44)) | (1L << (Include - 44)) | (1L << (IncludeOnce - 44)) | (1L << (InstanceOf - 44)) | (1L << (InsteadOf - 44)) | (1L << (Int8Cast - 44)) | (1L << (Int16Cast - 44)) | (1L << (Int64Type - 44)) | (1L << (IntType - 44)) | (1L << (Interface - 44)) | (1L << (IsSet - 44)) | (1L << (List - 44)) | (1L << (LogicalAnd - 44)) | (1L << (LogicalOr - 44)) | (1L << (LogicalXor - 44)) | (1L << (Namespace - 44)) | (1L << (New - 44)) | (1L << (Null - 44)) | (1L << (ObjectType - 44)) | (1L << (Parent_ - 44)) | (1L << (Partial - 44)) | (1L << (Print - 44)))) != 0) || ((((_la - 108)) & ~0x3f) == 0 && ((1L << (_la - 108)) & ((1L << (Private - 108)) | (1L << (Protected - 108)) | (1L << (Public - 108)) | (1L << (Require - 108)) | (1L << (RequireOnce - 108)) | (1L << (Resource - 108)) | (1L << (Return - 108)) | (1L << (Static - 108)) | (1L << (StringType - 108)) | (1L << (Switch - 108)) | (1L << (Throw - 108)) | (1L << (Trait - 108)) | (1L << (Try - 108)) | (1L << (Typeof - 108)) | (1L << (UintCast - 108)) | (1L << (UnicodeCast - 108)) | (1L << (Unset - 108)) | (1L << (Use - 108)) | (1L << (Var - 108)) | (1L << (While - 108)) | (1L << (Yield - 108)) | (1L << (From - 108)) | (1L << (LambdaFn - 108)) | (1L << (Get - 108)) | (1L << (Set - 108)) | (1L << (Call - 108)) | (1L << (CallStatic - 108)) | (1L << (Constructor - 108)) | (1L << (Destruct - 108)) | (1L << (Wakeup - 108)) | (1L << (Sleep - 108)) | (1L << (Autoload - 108)) | (1L << (IsSet__ - 108)) | (1L << (Unset__ - 108)) | (1L << (ToString__ - 108)) | (1L << (Invoke - 108)) | (1L << (SetState - 108)) | (1L << (Clone__ - 108)) | (1L << (DebugInfo - 108)) | (1L << (Namespace__ - 108)) | (1L << (Class__ - 108)) | (1L << (Traic__ - 108)) | (1L << (Function__ - 108)) | (1L << (Method__ - 108)) | (1L << (Line__ - 108)) | (1L << (File__ - 108)) | (1L << (Dir__ - 108)) | (1L << (Inc - 108)) | (1L << (Dec - 108)))) != 0) || ((((_la - 188)) & ~0x3f) == 0 && ((1L << (_la - 188)) & ((1L << (NamespaceSeparator - 188)) | (1L << (Ampersand - 188)) | (1L << (Bang - 188)) | (1L << (Plus - 188)) | (1L << (Minus - 188)) | (1L << (Tilde - 188)) | (1L << (SuppressWarnings - 188)) | (1L << (Dollar - 188)) | (1L << (OpenRoundBracket - 188)) | (1L << (OpenSquareBracket - 188)) | (1L << (VarName - 188)) | (1L << (Label - 188)) | (1L << (Octal - 188)) | (1L << (Decimal - 188)) | (1L << (Real - 188)) | (1L << (Hex - 188)) | (1L << (Binary - 188)) | (1L << (BackQuoteString - 188)) | (1L << (SingleQuoteString - 188)) | (1L << (DoubleQuote - 188)) | (1L << (StartNowDoc - 188)) | (1L << (StartHereDoc - 188)))) != 0)) {
				{
				setState(1735);
				assignmentListElement();
				}
			}

			setState(1744);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(1738);
				match(Comma);
				setState(1740);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 44)) & ~0x3f) == 0 && ((1L << (_la - 44)) & ((1L << (Abstract - 44)) | (1L << (Array - 44)) | (1L << (As - 44)) | (1L << (BinaryCast - 44)) | (1L << (BoolType - 44)) | (1L << (BooleanConstant - 44)) | (1L << (Break - 44)) | (1L << (Callable - 44)) | (1L << (Case - 44)) | (1L << (Catch - 44)) | (1L << (Class - 44)) | (1L << (Clone - 44)) | (1L << (Const - 44)) | (1L << (Continue - 44)) | (1L << (Declare - 44)) | (1L << (Default - 44)) | (1L << (Do - 44)) | (1L << (DoubleCast - 44)) | (1L << (DoubleType - 44)) | (1L << (Echo - 44)) | (1L << (Else - 44)) | (1L << (ElseIf - 44)) | (1L << (Empty - 44)) | (1L << (EndDeclare - 44)) | (1L << (EndFor - 44)) | (1L << (EndForeach - 44)) | (1L << (EndIf - 44)) | (1L << (EndSwitch - 44)) | (1L << (EndWhile - 44)) | (1L << (Eval - 44)) | (1L << (Exit - 44)) | (1L << (Extends - 44)) | (1L << (Final - 44)) | (1L << (Finally - 44)) | (1L << (FloatCast - 44)) | (1L << (For - 44)) | (1L << (Foreach - 44)) | (1L << (Function - 44)) | (1L << (Global - 44)) | (1L << (Goto - 44)) | (1L << (If - 44)) | (1L << (Implements - 44)) | (1L << (Import - 44)) | (1L << (Include - 44)) | (1L << (IncludeOnce - 44)) | (1L << (InstanceOf - 44)) | (1L << (InsteadOf - 44)) | (1L << (Int8Cast - 44)) | (1L << (Int16Cast - 44)) | (1L << (Int64Type - 44)) | (1L << (IntType - 44)) | (1L << (Interface - 44)) | (1L << (IsSet - 44)) | (1L << (List - 44)) | (1L << (LogicalAnd - 44)) | (1L << (LogicalOr - 44)) | (1L << (LogicalXor - 44)) | (1L << (Namespace - 44)) | (1L << (New - 44)) | (1L << (Null - 44)) | (1L << (ObjectType - 44)) | (1L << (Parent_ - 44)) | (1L << (Partial - 44)) | (1L << (Print - 44)))) != 0) || ((((_la - 108)) & ~0x3f) == 0 && ((1L << (_la - 108)) & ((1L << (Private - 108)) | (1L << (Protected - 108)) | (1L << (Public - 108)) | (1L << (Require - 108)) | (1L << (RequireOnce - 108)) | (1L << (Resource - 108)) | (1L << (Return - 108)) | (1L << (Static - 108)) | (1L << (StringType - 108)) | (1L << (Switch - 108)) | (1L << (Throw - 108)) | (1L << (Trait - 108)) | (1L << (Try - 108)) | (1L << (Typeof - 108)) | (1L << (UintCast - 108)) | (1L << (UnicodeCast - 108)) | (1L << (Unset - 108)) | (1L << (Use - 108)) | (1L << (Var - 108)) | (1L << (While - 108)) | (1L << (Yield - 108)) | (1L << (From - 108)) | (1L << (LambdaFn - 108)) | (1L << (Get - 108)) | (1L << (Set - 108)) | (1L << (Call - 108)) | (1L << (CallStatic - 108)) | (1L << (Constructor - 108)) | (1L << (Destruct - 108)) | (1L << (Wakeup - 108)) | (1L << (Sleep - 108)) | (1L << (Autoload - 108)) | (1L << (IsSet__ - 108)) | (1L << (Unset__ - 108)) | (1L << (ToString__ - 108)) | (1L << (Invoke - 108)) | (1L << (SetState - 108)) | (1L << (Clone__ - 108)) | (1L << (DebugInfo - 108)) | (1L << (Namespace__ - 108)) | (1L << (Class__ - 108)) | (1L << (Traic__ - 108)) | (1L << (Function__ - 108)) | (1L << (Method__ - 108)) | (1L << (Line__ - 108)) | (1L << (File__ - 108)) | (1L << (Dir__ - 108)) | (1L << (Inc - 108)) | (1L << (Dec - 108)))) != 0) || ((((_la - 188)) & ~0x3f) == 0 && ((1L << (_la - 188)) & ((1L << (NamespaceSeparator - 188)) | (1L << (Ampersand - 188)) | (1L << (Bang - 188)) | (1L << (Plus - 188)) | (1L << (Minus - 188)) | (1L << (Tilde - 188)) | (1L << (SuppressWarnings - 188)) | (1L << (Dollar - 188)) | (1L << (OpenRoundBracket - 188)) | (1L << (OpenSquareBracket - 188)) | (1L << (VarName - 188)) | (1L << (Label - 188)) | (1L << (Octal - 188)) | (1L << (Decimal - 188)) | (1L << (Real - 188)) | (1L << (Hex - 188)) | (1L << (Binary - 188)) | (1L << (BackQuoteString - 188)) | (1L << (SingleQuoteString - 188)) | (1L << (DoubleQuote - 188)) | (1L << (StartNowDoc - 188)) | (1L << (StartHereDoc - 188)))) != 0)) {
					{
					setState(1739);
					assignmentListElement();
					}
				}

				}
				}
				setState(1746);
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

	public static class AssignmentListElementContext extends ParserRuleContext {
		public ChainContext chain() {
			return getRuleContext(ChainContext.class,0);
		}
		public TerminalNode List() { return getToken(PhpParser.List, 0); }
		public TerminalNode OpenRoundBracket() { return getToken(PhpParser.OpenRoundBracket, 0); }
		public AssignmentListContext assignmentList() {
			return getRuleContext(AssignmentListContext.class,0);
		}
		public TerminalNode CloseRoundBracket() { return getToken(PhpParser.CloseRoundBracket, 0); }
		public ArrayItemContext arrayItem() {
			return getRuleContext(ArrayItemContext.class,0);
		}
		public AssignmentListElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentListElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).enterAssignmentListElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).exitAssignmentListElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PhpParserVisitor ) return ((PhpParserVisitor<? extends T>)visitor).visitAssignmentListElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentListElementContext assignmentListElement() throws RecognitionException {
		AssignmentListElementContext _localctx = new AssignmentListElementContext(_ctx, getState());
		enterRule(_localctx, 254, RULE_assignmentListElement);
		try {
			setState(1754);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,212,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1747);
				chain();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1748);
				match(List);
				setState(1749);
				match(OpenRoundBracket);
				setState(1750);
				assignmentList();
				setState(1751);
				match(CloseRoundBracket);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1753);
				arrayItem();
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

	public static class ModifierContext extends ParserRuleContext {
		public TerminalNode Abstract() { return getToken(PhpParser.Abstract, 0); }
		public TerminalNode Final() { return getToken(PhpParser.Final, 0); }
		public ModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).enterModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).exitModifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PhpParserVisitor ) return ((PhpParserVisitor<? extends T>)visitor).visitModifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ModifierContext modifier() throws RecognitionException {
		ModifierContext _localctx = new ModifierContext(_ctx, getState());
		enterRule(_localctx, 256, RULE_modifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1756);
			_la = _input.LA(1);
			if ( !(_la==Abstract || _la==Final) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class IdentifierContext extends ParserRuleContext {
		public TerminalNode Label() { return getToken(PhpParser.Label, 0); }
		public TerminalNode Abstract() { return getToken(PhpParser.Abstract, 0); }
		public TerminalNode Array() { return getToken(PhpParser.Array, 0); }
		public TerminalNode As() { return getToken(PhpParser.As, 0); }
		public TerminalNode BinaryCast() { return getToken(PhpParser.BinaryCast, 0); }
		public TerminalNode BoolType() { return getToken(PhpParser.BoolType, 0); }
		public TerminalNode BooleanConstant() { return getToken(PhpParser.BooleanConstant, 0); }
		public TerminalNode Break() { return getToken(PhpParser.Break, 0); }
		public TerminalNode Callable() { return getToken(PhpParser.Callable, 0); }
		public TerminalNode Case() { return getToken(PhpParser.Case, 0); }
		public TerminalNode Catch() { return getToken(PhpParser.Catch, 0); }
		public TerminalNode Class() { return getToken(PhpParser.Class, 0); }
		public TerminalNode Clone() { return getToken(PhpParser.Clone, 0); }
		public TerminalNode Const() { return getToken(PhpParser.Const, 0); }
		public TerminalNode Continue() { return getToken(PhpParser.Continue, 0); }
		public TerminalNode Declare() { return getToken(PhpParser.Declare, 0); }
		public TerminalNode Default() { return getToken(PhpParser.Default, 0); }
		public TerminalNode Do() { return getToken(PhpParser.Do, 0); }
		public TerminalNode DoubleCast() { return getToken(PhpParser.DoubleCast, 0); }
		public TerminalNode DoubleType() { return getToken(PhpParser.DoubleType, 0); }
		public TerminalNode Echo() { return getToken(PhpParser.Echo, 0); }
		public TerminalNode Else() { return getToken(PhpParser.Else, 0); }
		public TerminalNode ElseIf() { return getToken(PhpParser.ElseIf, 0); }
		public TerminalNode Empty() { return getToken(PhpParser.Empty, 0); }
		public TerminalNode EndDeclare() { return getToken(PhpParser.EndDeclare, 0); }
		public TerminalNode EndFor() { return getToken(PhpParser.EndFor, 0); }
		public TerminalNode EndForeach() { return getToken(PhpParser.EndForeach, 0); }
		public TerminalNode EndIf() { return getToken(PhpParser.EndIf, 0); }
		public TerminalNode EndSwitch() { return getToken(PhpParser.EndSwitch, 0); }
		public TerminalNode EndWhile() { return getToken(PhpParser.EndWhile, 0); }
		public TerminalNode Eval() { return getToken(PhpParser.Eval, 0); }
		public TerminalNode Exit() { return getToken(PhpParser.Exit, 0); }
		public TerminalNode Extends() { return getToken(PhpParser.Extends, 0); }
		public TerminalNode Final() { return getToken(PhpParser.Final, 0); }
		public TerminalNode Finally() { return getToken(PhpParser.Finally, 0); }
		public TerminalNode FloatCast() { return getToken(PhpParser.FloatCast, 0); }
		public TerminalNode For() { return getToken(PhpParser.For, 0); }
		public TerminalNode Foreach() { return getToken(PhpParser.Foreach, 0); }
		public TerminalNode Function() { return getToken(PhpParser.Function, 0); }
		public TerminalNode Global() { return getToken(PhpParser.Global, 0); }
		public TerminalNode Goto() { return getToken(PhpParser.Goto, 0); }
		public TerminalNode If() { return getToken(PhpParser.If, 0); }
		public TerminalNode Implements() { return getToken(PhpParser.Implements, 0); }
		public TerminalNode Import() { return getToken(PhpParser.Import, 0); }
		public TerminalNode Include() { return getToken(PhpParser.Include, 0); }
		public TerminalNode IncludeOnce() { return getToken(PhpParser.IncludeOnce, 0); }
		public TerminalNode InstanceOf() { return getToken(PhpParser.InstanceOf, 0); }
		public TerminalNode InsteadOf() { return getToken(PhpParser.InsteadOf, 0); }
		public TerminalNode Int16Cast() { return getToken(PhpParser.Int16Cast, 0); }
		public TerminalNode Int64Type() { return getToken(PhpParser.Int64Type, 0); }
		public TerminalNode Int8Cast() { return getToken(PhpParser.Int8Cast, 0); }
		public TerminalNode Interface() { return getToken(PhpParser.Interface, 0); }
		public TerminalNode IntType() { return getToken(PhpParser.IntType, 0); }
		public TerminalNode IsSet() { return getToken(PhpParser.IsSet, 0); }
		public TerminalNode List() { return getToken(PhpParser.List, 0); }
		public TerminalNode LogicalAnd() { return getToken(PhpParser.LogicalAnd, 0); }
		public TerminalNode LogicalOr() { return getToken(PhpParser.LogicalOr, 0); }
		public TerminalNode LogicalXor() { return getToken(PhpParser.LogicalXor, 0); }
		public TerminalNode Namespace() { return getToken(PhpParser.Namespace, 0); }
		public TerminalNode New() { return getToken(PhpParser.New, 0); }
		public TerminalNode Null() { return getToken(PhpParser.Null, 0); }
		public TerminalNode ObjectType() { return getToken(PhpParser.ObjectType, 0); }
		public TerminalNode Parent_() { return getToken(PhpParser.Parent_, 0); }
		public TerminalNode Partial() { return getToken(PhpParser.Partial, 0); }
		public TerminalNode Print() { return getToken(PhpParser.Print, 0); }
		public TerminalNode Private() { return getToken(PhpParser.Private, 0); }
		public TerminalNode Protected() { return getToken(PhpParser.Protected, 0); }
		public TerminalNode Public() { return getToken(PhpParser.Public, 0); }
		public TerminalNode Require() { return getToken(PhpParser.Require, 0); }
		public TerminalNode RequireOnce() { return getToken(PhpParser.RequireOnce, 0); }
		public TerminalNode Resource() { return getToken(PhpParser.Resource, 0); }
		public TerminalNode Return() { return getToken(PhpParser.Return, 0); }
		public TerminalNode Static() { return getToken(PhpParser.Static, 0); }
		public TerminalNode StringType() { return getToken(PhpParser.StringType, 0); }
		public TerminalNode Switch() { return getToken(PhpParser.Switch, 0); }
		public TerminalNode Throw() { return getToken(PhpParser.Throw, 0); }
		public TerminalNode Trait() { return getToken(PhpParser.Trait, 0); }
		public TerminalNode Try() { return getToken(PhpParser.Try, 0); }
		public TerminalNode Typeof() { return getToken(PhpParser.Typeof, 0); }
		public TerminalNode UintCast() { return getToken(PhpParser.UintCast, 0); }
		public TerminalNode UnicodeCast() { return getToken(PhpParser.UnicodeCast, 0); }
		public TerminalNode Unset() { return getToken(PhpParser.Unset, 0); }
		public TerminalNode Use() { return getToken(PhpParser.Use, 0); }
		public TerminalNode Var() { return getToken(PhpParser.Var, 0); }
		public TerminalNode While() { return getToken(PhpParser.While, 0); }
		public TerminalNode Yield() { return getToken(PhpParser.Yield, 0); }
		public TerminalNode From() { return getToken(PhpParser.From, 0); }
		public TerminalNode Get() { return getToken(PhpParser.Get, 0); }
		public TerminalNode Set() { return getToken(PhpParser.Set, 0); }
		public TerminalNode Call() { return getToken(PhpParser.Call, 0); }
		public TerminalNode CallStatic() { return getToken(PhpParser.CallStatic, 0); }
		public TerminalNode Constructor() { return getToken(PhpParser.Constructor, 0); }
		public TerminalNode Destruct() { return getToken(PhpParser.Destruct, 0); }
		public TerminalNode Wakeup() { return getToken(PhpParser.Wakeup, 0); }
		public TerminalNode Sleep() { return getToken(PhpParser.Sleep, 0); }
		public TerminalNode Autoload() { return getToken(PhpParser.Autoload, 0); }
		public TerminalNode IsSet__() { return getToken(PhpParser.IsSet__, 0); }
		public TerminalNode Unset__() { return getToken(PhpParser.Unset__, 0); }
		public TerminalNode ToString__() { return getToken(PhpParser.ToString__, 0); }
		public TerminalNode Invoke() { return getToken(PhpParser.Invoke, 0); }
		public TerminalNode SetState() { return getToken(PhpParser.SetState, 0); }
		public TerminalNode Clone__() { return getToken(PhpParser.Clone__, 0); }
		public TerminalNode DebugInfo() { return getToken(PhpParser.DebugInfo, 0); }
		public TerminalNode Namespace__() { return getToken(PhpParser.Namespace__, 0); }
		public TerminalNode Class__() { return getToken(PhpParser.Class__, 0); }
		public TerminalNode Traic__() { return getToken(PhpParser.Traic__, 0); }
		public TerminalNode Function__() { return getToken(PhpParser.Function__, 0); }
		public TerminalNode Method__() { return getToken(PhpParser.Method__, 0); }
		public TerminalNode Line__() { return getToken(PhpParser.Line__, 0); }
		public TerminalNode File__() { return getToken(PhpParser.File__, 0); }
		public TerminalNode Dir__() { return getToken(PhpParser.Dir__, 0); }
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).enterIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).exitIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PhpParserVisitor ) return ((PhpParserVisitor<? extends T>)visitor).visitIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 258, RULE_identifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1758);
			_la = _input.LA(1);
			if ( !(((((_la - 44)) & ~0x3f) == 0 && ((1L << (_la - 44)) & ((1L << (Abstract - 44)) | (1L << (Array - 44)) | (1L << (As - 44)) | (1L << (BinaryCast - 44)) | (1L << (BoolType - 44)) | (1L << (BooleanConstant - 44)) | (1L << (Break - 44)) | (1L << (Callable - 44)) | (1L << (Case - 44)) | (1L << (Catch - 44)) | (1L << (Class - 44)) | (1L << (Clone - 44)) | (1L << (Const - 44)) | (1L << (Continue - 44)) | (1L << (Declare - 44)) | (1L << (Default - 44)) | (1L << (Do - 44)) | (1L << (DoubleCast - 44)) | (1L << (DoubleType - 44)) | (1L << (Echo - 44)) | (1L << (Else - 44)) | (1L << (ElseIf - 44)) | (1L << (Empty - 44)) | (1L << (EndDeclare - 44)) | (1L << (EndFor - 44)) | (1L << (EndForeach - 44)) | (1L << (EndIf - 44)) | (1L << (EndSwitch - 44)) | (1L << (EndWhile - 44)) | (1L << (Eval - 44)) | (1L << (Exit - 44)) | (1L << (Extends - 44)) | (1L << (Final - 44)) | (1L << (Finally - 44)) | (1L << (FloatCast - 44)) | (1L << (For - 44)) | (1L << (Foreach - 44)) | (1L << (Function - 44)) | (1L << (Global - 44)) | (1L << (Goto - 44)) | (1L << (If - 44)) | (1L << (Implements - 44)) | (1L << (Import - 44)) | (1L << (Include - 44)) | (1L << (IncludeOnce - 44)) | (1L << (InstanceOf - 44)) | (1L << (InsteadOf - 44)) | (1L << (Int8Cast - 44)) | (1L << (Int16Cast - 44)) | (1L << (Int64Type - 44)) | (1L << (IntType - 44)) | (1L << (Interface - 44)) | (1L << (IsSet - 44)) | (1L << (List - 44)) | (1L << (LogicalAnd - 44)) | (1L << (LogicalOr - 44)) | (1L << (LogicalXor - 44)) | (1L << (Namespace - 44)) | (1L << (New - 44)) | (1L << (Null - 44)) | (1L << (ObjectType - 44)) | (1L << (Parent_ - 44)) | (1L << (Partial - 44)) | (1L << (Print - 44)))) != 0) || ((((_la - 108)) & ~0x3f) == 0 && ((1L << (_la - 108)) & ((1L << (Private - 108)) | (1L << (Protected - 108)) | (1L << (Public - 108)) | (1L << (Require - 108)) | (1L << (RequireOnce - 108)) | (1L << (Resource - 108)) | (1L << (Return - 108)) | (1L << (Static - 108)) | (1L << (StringType - 108)) | (1L << (Switch - 108)) | (1L << (Throw - 108)) | (1L << (Trait - 108)) | (1L << (Try - 108)) | (1L << (Typeof - 108)) | (1L << (UintCast - 108)) | (1L << (UnicodeCast - 108)) | (1L << (Unset - 108)) | (1L << (Use - 108)) | (1L << (Var - 108)) | (1L << (While - 108)) | (1L << (Yield - 108)) | (1L << (From - 108)) | (1L << (Get - 108)) | (1L << (Set - 108)) | (1L << (Call - 108)) | (1L << (CallStatic - 108)) | (1L << (Constructor - 108)) | (1L << (Destruct - 108)) | (1L << (Wakeup - 108)) | (1L << (Sleep - 108)) | (1L << (Autoload - 108)) | (1L << (IsSet__ - 108)) | (1L << (Unset__ - 108)) | (1L << (ToString__ - 108)) | (1L << (Invoke - 108)) | (1L << (SetState - 108)) | (1L << (Clone__ - 108)) | (1L << (DebugInfo - 108)) | (1L << (Namespace__ - 108)) | (1L << (Class__ - 108)) | (1L << (Traic__ - 108)) | (1L << (Function__ - 108)) | (1L << (Method__ - 108)) | (1L << (Line__ - 108)) | (1L << (File__ - 108)) | (1L << (Dir__ - 108)))) != 0) || _la==Label) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class MemberModifierContext extends ParserRuleContext {
		public TerminalNode Public() { return getToken(PhpParser.Public, 0); }
		public TerminalNode Protected() { return getToken(PhpParser.Protected, 0); }
		public TerminalNode Private() { return getToken(PhpParser.Private, 0); }
		public TerminalNode Static() { return getToken(PhpParser.Static, 0); }
		public TerminalNode Abstract() { return getToken(PhpParser.Abstract, 0); }
		public TerminalNode Final() { return getToken(PhpParser.Final, 0); }
		public MemberModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_memberModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).enterMemberModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).exitMemberModifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PhpParserVisitor ) return ((PhpParserVisitor<? extends T>)visitor).visitMemberModifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MemberModifierContext memberModifier() throws RecognitionException {
		MemberModifierContext _localctx = new MemberModifierContext(_ctx, getState());
		enterRule(_localctx, 260, RULE_memberModifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1760);
			_la = _input.LA(1);
			if ( !(_la==Abstract || ((((_la - 76)) & ~0x3f) == 0 && ((1L << (_la - 76)) & ((1L << (Final - 76)) | (1L << (Private - 76)) | (1L << (Protected - 76)) | (1L << (Public - 76)) | (1L << (Static - 76)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class MagicConstantContext extends ParserRuleContext {
		public TerminalNode Namespace__() { return getToken(PhpParser.Namespace__, 0); }
		public TerminalNode Class__() { return getToken(PhpParser.Class__, 0); }
		public TerminalNode Traic__() { return getToken(PhpParser.Traic__, 0); }
		public TerminalNode Function__() { return getToken(PhpParser.Function__, 0); }
		public TerminalNode Method__() { return getToken(PhpParser.Method__, 0); }
		public TerminalNode Line__() { return getToken(PhpParser.Line__, 0); }
		public TerminalNode File__() { return getToken(PhpParser.File__, 0); }
		public TerminalNode Dir__() { return getToken(PhpParser.Dir__, 0); }
		public MagicConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_magicConstant; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).enterMagicConstant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).exitMagicConstant(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PhpParserVisitor ) return ((PhpParserVisitor<? extends T>)visitor).visitMagicConstant(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MagicConstantContext magicConstant() throws RecognitionException {
		MagicConstantContext _localctx = new MagicConstantContext(_ctx, getState());
		enterRule(_localctx, 262, RULE_magicConstant);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1762);
			_la = _input.LA(1);
			if ( !(((((_la - 147)) & ~0x3f) == 0 && ((1L << (_la - 147)) & ((1L << (Namespace__ - 147)) | (1L << (Class__ - 147)) | (1L << (Traic__ - 147)) | (1L << (Function__ - 147)) | (1L << (Method__ - 147)) | (1L << (Line__ - 147)) | (1L << (File__ - 147)) | (1L << (Dir__ - 147)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class MagicMethodContext extends ParserRuleContext {
		public TerminalNode Get() { return getToken(PhpParser.Get, 0); }
		public TerminalNode Set() { return getToken(PhpParser.Set, 0); }
		public TerminalNode Call() { return getToken(PhpParser.Call, 0); }
		public TerminalNode CallStatic() { return getToken(PhpParser.CallStatic, 0); }
		public TerminalNode Constructor() { return getToken(PhpParser.Constructor, 0); }
		public TerminalNode Destruct() { return getToken(PhpParser.Destruct, 0); }
		public TerminalNode Wakeup() { return getToken(PhpParser.Wakeup, 0); }
		public TerminalNode Sleep() { return getToken(PhpParser.Sleep, 0); }
		public TerminalNode Autoload() { return getToken(PhpParser.Autoload, 0); }
		public TerminalNode IsSet__() { return getToken(PhpParser.IsSet__, 0); }
		public TerminalNode Unset__() { return getToken(PhpParser.Unset__, 0); }
		public TerminalNode ToString__() { return getToken(PhpParser.ToString__, 0); }
		public TerminalNode Invoke() { return getToken(PhpParser.Invoke, 0); }
		public TerminalNode SetState() { return getToken(PhpParser.SetState, 0); }
		public TerminalNode Clone__() { return getToken(PhpParser.Clone__, 0); }
		public TerminalNode DebugInfo() { return getToken(PhpParser.DebugInfo, 0); }
		public MagicMethodContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_magicMethod; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).enterMagicMethod(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).exitMagicMethod(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PhpParserVisitor ) return ((PhpParserVisitor<? extends T>)visitor).visitMagicMethod(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MagicMethodContext magicMethod() throws RecognitionException {
		MagicMethodContext _localctx = new MagicMethodContext(_ctx, getState());
		enterRule(_localctx, 264, RULE_magicMethod);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1764);
			_la = _input.LA(1);
			if ( !(((((_la - 131)) & ~0x3f) == 0 && ((1L << (_la - 131)) & ((1L << (Get - 131)) | (1L << (Set - 131)) | (1L << (Call - 131)) | (1L << (CallStatic - 131)) | (1L << (Constructor - 131)) | (1L << (Destruct - 131)) | (1L << (Wakeup - 131)) | (1L << (Sleep - 131)) | (1L << (Autoload - 131)) | (1L << (IsSet__ - 131)) | (1L << (Unset__ - 131)) | (1L << (ToString__ - 131)) | (1L << (Invoke - 131)) | (1L << (SetState - 131)) | (1L << (Clone__ - 131)) | (1L << (DebugInfo - 131)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class PrimitiveTypeContext extends ParserRuleContext {
		public TerminalNode BoolType() { return getToken(PhpParser.BoolType, 0); }
		public TerminalNode IntType() { return getToken(PhpParser.IntType, 0); }
		public TerminalNode Int64Type() { return getToken(PhpParser.Int64Type, 0); }
		public TerminalNode DoubleType() { return getToken(PhpParser.DoubleType, 0); }
		public TerminalNode StringType() { return getToken(PhpParser.StringType, 0); }
		public TerminalNode Resource() { return getToken(PhpParser.Resource, 0); }
		public TerminalNode ObjectType() { return getToken(PhpParser.ObjectType, 0); }
		public TerminalNode Array() { return getToken(PhpParser.Array, 0); }
		public PrimitiveTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primitiveType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).enterPrimitiveType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).exitPrimitiveType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PhpParserVisitor ) return ((PhpParserVisitor<? extends T>)visitor).visitPrimitiveType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimitiveTypeContext primitiveType() throws RecognitionException {
		PrimitiveTypeContext _localctx = new PrimitiveTypeContext(_ctx, getState());
		enterRule(_localctx, 266, RULE_primitiveType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1766);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Array) | (1L << BoolType) | (1L << DoubleType))) != 0) || ((((_la - 93)) & ~0x3f) == 0 && ((1L << (_la - 93)) & ((1L << (Int64Type - 93)) | (1L << (IntType - 93)) | (1L << (ObjectType - 93)) | (1L << (Resource - 93)) | (1L << (StringType - 93)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class CastOperationContext extends ParserRuleContext {
		public TerminalNode BoolType() { return getToken(PhpParser.BoolType, 0); }
		public TerminalNode Int8Cast() { return getToken(PhpParser.Int8Cast, 0); }
		public TerminalNode Int16Cast() { return getToken(PhpParser.Int16Cast, 0); }
		public TerminalNode IntType() { return getToken(PhpParser.IntType, 0); }
		public TerminalNode Int64Type() { return getToken(PhpParser.Int64Type, 0); }
		public TerminalNode UintCast() { return getToken(PhpParser.UintCast, 0); }
		public TerminalNode DoubleCast() { return getToken(PhpParser.DoubleCast, 0); }
		public TerminalNode DoubleType() { return getToken(PhpParser.DoubleType, 0); }
		public TerminalNode FloatCast() { return getToken(PhpParser.FloatCast, 0); }
		public TerminalNode StringType() { return getToken(PhpParser.StringType, 0); }
		public TerminalNode BinaryCast() { return getToken(PhpParser.BinaryCast, 0); }
		public TerminalNode UnicodeCast() { return getToken(PhpParser.UnicodeCast, 0); }
		public TerminalNode Array() { return getToken(PhpParser.Array, 0); }
		public TerminalNode ObjectType() { return getToken(PhpParser.ObjectType, 0); }
		public TerminalNode Resource() { return getToken(PhpParser.Resource, 0); }
		public TerminalNode Unset() { return getToken(PhpParser.Unset, 0); }
		public CastOperationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_castOperation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).enterCastOperation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).exitCastOperation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PhpParserVisitor ) return ((PhpParserVisitor<? extends T>)visitor).visitCastOperation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CastOperationContext castOperation() throws RecognitionException {
		CastOperationContext _localctx = new CastOperationContext(_ctx, getState());
		enterRule(_localctx, 268, RULE_castOperation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1768);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Array) | (1L << BinaryCast) | (1L << BoolType) | (1L << DoubleCast) | (1L << DoubleType))) != 0) || ((((_la - 78)) & ~0x3f) == 0 && ((1L << (_la - 78)) & ((1L << (FloatCast - 78)) | (1L << (Int8Cast - 78)) | (1L << (Int16Cast - 78)) | (1L << (Int64Type - 78)) | (1L << (IntType - 78)) | (1L << (ObjectType - 78)) | (1L << (Resource - 78)) | (1L << (StringType - 78)) | (1L << (UintCast - 78)) | (1L << (UnicodeCast - 78)) | (1L << (Unset - 78)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class ToDocContext extends ParserRuleContext {
		public TerminalNode Decorator() { return getToken(PhpParser.Decorator, 0); }
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public ToDocContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_toDoc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).enterToDoc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).exitToDoc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PhpParserVisitor ) return ((PhpParserVisitor<? extends T>)visitor).visitToDoc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ToDocContext toDoc() throws RecognitionException {
		ToDocContext _localctx = new ToDocContext(_ctx, getState());
		enterRule(_localctx, 270, RULE_toDoc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1770);
			match(Decorator);
			setState(1771);
			classDeclaration();
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 83:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 20);
		case 1:
			return precpred(_ctx, 18);
		case 2:
			return precpred(_ctx, 17);
		case 3:
			return precpred(_ctx, 16);
		case 4:
			return precpred(_ctx, 15);
		case 5:
			return precpred(_ctx, 14);
		case 6:
			return precpred(_ctx, 13);
		case 7:
			return precpred(_ctx, 12);
		case 8:
			return precpred(_ctx, 11);
		case 9:
			return precpred(_ctx, 10);
		case 10:
			return precpred(_ctx, 9);
		case 11:
			return precpred(_ctx, 8);
		case 12:
			return precpred(_ctx, 7);
		case 13:
			return precpred(_ctx, 6);
		case 14:
			return precpred(_ctx, 3);
		case 15:
			return precpred(_ctx, 2);
		case 16:
			return precpred(_ctx, 1);
		case 17:
			return precpred(_ctx, 19);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\u00f0\u06f0\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]\t]\4^\t^\4_\t_\4"+
		"`\t`\4a\ta\4b\tb\4c\tc\4d\td\4e\te\4f\tf\4g\tg\4h\th\4i\ti\4j\tj\4k\t"+
		"k\4l\tl\4m\tm\4n\tn\4o\to\4p\tp\4q\tq\4r\tr\4s\ts\4t\tt\4u\tu\4v\tv\4"+
		"w\tw\4x\tx\4y\ty\4z\tz\4{\t{\4|\t|\4}\t}\4~\t~\4\177\t\177\4\u0080\t\u0080"+
		"\4\u0081\t\u0081\4\u0082\t\u0082\4\u0083\t\u0083\4\u0084\t\u0084\4\u0085"+
		"\t\u0085\4\u0086\t\u0086\4\u0087\t\u0087\4\u0088\t\u0088\4\u0089\t\u0089"+
		"\3\2\5\2\u0114\n\2\3\2\7\2\u0117\n\2\f\2\16\2\u011a\13\2\3\2\3\2\3\3\3"+
		"\3\3\3\5\3\u0121\n\3\3\4\6\4\u0124\n\4\r\4\16\4\u0125\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\7\5\u013e\n\5\f\5\16\5\u0141\13\5\3\5\5\5\u0144\n\5\3\6\6\6\u0147\n"+
		"\6\r\6\16\6\u0148\3\7\7\7\u014c\n\7\f\7\16\7\u014f\13\7\3\7\6\7\u0152"+
		"\n\7\r\7\16\7\u0153\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5"+
		"\t\u0162\n\t\3\n\3\n\5\n\u0166\n\n\3\n\3\n\3\n\3\13\5\13\u016c\n\13\3"+
		"\13\3\13\3\13\5\13\u0171\n\13\3\13\7\13\u0174\n\13\f\13\16\13\u0177\13"+
		"\13\3\f\3\f\3\r\3\r\5\r\u017d\n\r\3\r\3\r\7\r\u0181\n\r\f\r\16\r\u0184"+
		"\13\r\3\r\3\r\3\r\3\r\5\r\u018a\n\r\3\16\3\16\3\16\3\16\3\16\5\16\u0191"+
		"\n\16\3\17\3\17\3\17\5\17\u0196\n\17\3\17\3\17\5\17\u019a\n\17\3\17\3"+
		"\17\3\17\3\17\3\17\5\17\u01a1\n\17\3\17\5\17\u01a4\n\17\3\17\3\17\3\20"+
		"\3\20\5\20\u01aa\n\20\3\20\5\20\u01ad\n\20\3\20\5\20\u01b0\n\20\3\20\3"+
		"\20\3\20\5\20\u01b5\n\20\3\20\3\20\5\20\u01b9\n\20\3\20\3\20\5\20\u01bd"+
		"\n\20\3\20\3\20\3\20\5\20\u01c2\n\20\3\20\3\20\5\20\u01c6\n\20\5\20\u01c8"+
		"\n\20\3\20\3\20\7\20\u01cc\n\20\f\20\16\20\u01cf\13\20\3\20\3\20\3\21"+
		"\3\21\3\22\3\22\3\22\7\22\u01d8\n\22\f\22\16\22\u01db\13\22\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u01eb"+
		"\n\23\3\24\3\24\3\24\7\24\u01f0\n\24\f\24\16\24\u01f3\13\24\3\25\3\25"+
		"\3\25\7\25\u01f8\n\25\f\25\16\25\u01fb\13\25\3\26\3\26\3\26\3\27\3\27"+
		"\3\27\3\27\3\27\5\27\u0205\n\27\3\30\3\30\3\30\3\30\7\30\u020b\n\30\f"+
		"\30\16\30\u020e\13\30\3\30\3\30\3\31\7\31\u0213\n\31\f\31\16\31\u0216"+
		"\13\31\3\32\3\32\3\32\3\32\5\32\u021c\n\32\3\32\3\32\3\32\7\32\u0221\n"+
		"\32\f\32\16\32\u0224\13\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\5\33\u023a\n\33"+
		"\3\34\3\34\3\34\7\34\u023f\n\34\f\34\16\34\u0242\13\34\3\35\3\35\3\35"+
		"\7\35\u0247\n\35\f\35\16\35\u024a\13\35\3\36\3\36\3\36\3\36\3\37\7\37"+
		"\u0251\n\37\f\37\16\37\u0254\13\37\3 \3 \3 \5 \u0259\n \3!\3!\3!\3!\3"+
		"!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\5"+
		"!\u0276\n!\3\"\3\"\3#\3#\3#\3#\3$\3$\3$\3$\7$\u0282\n$\f$\16$\u0285\13"+
		"$\3$\5$\u0288\n$\3$\3$\3$\3$\3$\7$\u028f\n$\f$\16$\u0292\13$\3$\5$\u0295"+
		"\n$\3$\3$\3$\5$\u029a\n$\3%\3%\3%\3%\3&\3&\3&\3&\3&\3\'\3\'\3\'\3(\3("+
		"\3(\3(\3)\3)\3)\3)\3)\3)\3)\3)\5)\u02b4\n)\3*\3*\3*\3*\3*\3*\3+\3+\3+"+
		"\5+\u02bf\n+\3+\3+\5+\u02c3\n+\3+\3+\5+\u02c7\n+\3+\3+\3+\3+\3+\3+\3+"+
		"\5+\u02d0\n+\3,\3,\3-\3-\3.\3.\3.\3.\5.\u02da\n.\3.\7.\u02dd\n.\f.\16"+
		".\u02e0\13.\3.\3.\3.\5.\u02e5\n.\3.\7.\u02e8\n.\f.\16.\u02eb\13.\3.\3"+
		".\5.\u02ef\n.\3/\3/\3/\5/\u02f4\n/\3/\6/\u02f7\n/\r/\16/\u02f8\3/\3/\3"+
		"\60\3\60\5\60\u02ff\n\60\3\60\3\60\3\61\3\61\5\61\u0305\n\61\3\61\3\61"+
		"\3\62\3\62\5\62\u030b\n\62\3\62\3\62\3\63\3\63\3\63\3\64\3\64\3\64\3\64"+
		"\3\64\3\64\3\65\3\65\3\65\3\65\3\65\5\65\u031d\n\65\3\65\3\65\3\65\5\65"+
		"\u0322\n\65\3\65\5\65\u0325\n\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3"+
		"\65\5\65\u032f\n\65\3\65\5\65\u0332\n\65\3\65\3\65\3\65\3\65\3\65\3\65"+
		"\3\65\3\65\3\65\3\65\3\65\5\65\u033f\n\65\3\65\3\65\3\65\3\65\3\65\3\65"+
		"\5\65\u0347\n\65\3\66\3\66\3\66\6\66\u034c\n\66\r\66\16\66\u034d\3\66"+
		"\5\66\u0351\n\66\3\66\7\66\u0354\n\66\f\66\16\66\u0357\13\66\3\66\5\66"+
		"\u035a\n\66\3\67\3\67\3\67\3\67\3\67\7\67\u0361\n\67\f\67\16\67\u0364"+
		"\13\67\3\67\3\67\3\67\3\67\38\38\38\39\39\39\39\3:\3:\3:\3:\3;\3;\3;\3"+
		";\3;\3;\3;\3;\3;\3;\5;\u037f\n;\3<\6<\u0382\n<\r<\16<\u0383\3=\3=\5=\u0388"+
		"\n=\3>\3>\3>\7>\u038d\n>\f>\16>\u0390\13>\3?\5?\u0393\n?\3?\3?\7?\u0397"+
		"\n?\f?\16?\u039a\13?\3@\3@\5@\u039e\n@\3@\5@\u03a1\n@\3@\5@\u03a4\n@\3"+
		"@\5@\u03a7\n@\3@\3@\3A\3A\3A\5A\u03ae\nA\3B\3B\3B\3B\7B\u03b4\nB\fB\16"+
		"B\u03b7\13B\3B\3B\3C\3C\3C\3C\3C\3C\3C\3C\5C\u03c3\nC\3D\3D\3D\3D\3E\3"+
		"E\3E\3E\7E\u03cd\nE\fE\16E\u03d0\13E\3E\3E\3F\3F\3F\5F\u03d7\nF\3F\3F"+
		"\3F\7F\u03dc\nF\fF\16F\u03df\13F\3F\3F\3F\3F\5F\u03e5\nF\3F\3F\5F\u03e9"+
		"\nF\3F\3F\3F\7F\u03ee\nF\fF\16F\u03f1\13F\3F\3F\3F\3F\5F\u03f7\nF\3F\3"+
		"F\5F\u03fb\nF\3F\3F\5F\u03ff\nF\3F\3F\3F\3F\5F\u0405\nF\3F\3F\3F\3F\3"+
		"F\3F\5F\u040d\nF\3G\3G\3G\7G\u0412\nG\fG\16G\u0415\13G\3G\5G\u0418\nG"+
		"\3H\3H\5H\u041c\nH\3I\3I\3I\3I\3I\3I\3I\3J\3J\3J\3J\5J\u0429\nJ\3J\5J"+
		"\u042c\nJ\3J\3J\3K\3K\3K\5K\u0433\nK\3K\3K\3L\3L\3L\5L\u043a\nL\3M\3M"+
		"\5M\u043e\nM\3N\3N\5N\u0442\nN\3O\6O\u0445\nO\rO\16O\u0446\3P\3P\3P\5"+
		"P\u044c\nP\3Q\3Q\3Q\3Q\3R\3R\3R\3R\3R\7R\u0457\nR\fR\16R\u045a\13R\3R"+
		"\3R\3S\3S\3S\7S\u0461\nS\fS\16S\u0464\13S\3T\3T\3T\5T\u0469\nT\3T\3T\3"+
		"U\3U\3U\3U\3U\3U\3U\3U\3U\3U\3U\3U\3U\3U\3U\3U\3U\3U\3U\3U\3U\3U\3U\3"+
		"U\3U\3U\3U\3U\3U\3U\3U\3U\3U\3U\3U\3U\3U\3U\3U\3U\3U\3U\3U\3U\3U\3U\3"+
		"U\3U\3U\3U\3U\3U\3U\3U\3U\3U\3U\3U\3U\5U\u04a8\nU\3U\3U\3U\3U\3U\3U\3"+
		"U\3U\3U\3U\3U\3U\3U\3U\5U\u04b8\nU\5U\u04ba\nU\3U\3U\3U\3U\3U\3U\3U\3"+
		"U\3U\3U\3U\3U\3U\3U\3U\3U\3U\3U\3U\3U\3U\3U\3U\3U\3U\3U\3U\3U\3U\3U\3"+
		"U\3U\3U\3U\3U\3U\5U\u04e0\nU\3U\3U\3U\3U\3U\3U\3U\3U\3U\3U\3U\3U\3U\3"+
		"U\3U\3U\3U\3U\3U\3U\7U\u04f6\nU\fU\16U\u04f9\13U\3V\3V\5V\u04fd\nV\3W"+
		"\3W\3W\5W\u0502\nW\3W\3W\3W\5W\u0507\nW\3W\5W\u050a\nW\3W\3W\3W\3W\5W"+
		"\u0510\nW\3X\5X\u0513\nX\3X\3X\5X\u0517\nX\3X\3X\3X\3X\5X\u051d\nX\3X"+
		"\3X\5X\u0521\nX\3X\3X\3X\3X\3X\3X\3X\3X\3X\5X\u052c\nX\3Y\3Y\3Y\5Y\u0531"+
		"\nY\3Z\3Z\3[\3[\3[\3[\5[\u0539\n[\3[\3[\5[\u053d\n[\3\\\3\\\3\\\7\\\u0542"+
		"\n\\\f\\\16\\\u0545\13\\\3\\\5\\\u0548\n\\\3]\3]\3]\5]\u054d\n]\3]\3]"+
		"\3]\5]\u0552\n]\3]\3]\5]\u0556\n]\3^\3^\3^\3^\3^\7^\u055d\n^\f^\16^\u0560"+
		"\13^\3^\3^\3_\5_\u0565\n_\3_\3_\3`\3`\5`\u056b\n`\3`\5`\u056e\n`\3a\3"+
		"a\5a\u0572\na\3a\5a\u0575\na\3a\3a\3a\5a\u057a\na\3b\3b\5b\u057e\nb\3"+
		"b\5b\u0581\nb\3b\5b\u0584\nb\3b\3b\5b\u0588\nb\3b\3b\5b\u058c\nb\3b\3"+
		"b\5b\u0590\nb\3b\3b\3b\5b\u0595\nb\3b\3b\5b\u0599\nb\5b\u059b\nb\3b\3"+
		"b\7b\u059f\nb\fb\16b\u05a2\13b\3b\3b\3c\3c\3c\7c\u05a9\nc\fc\16c\u05ac"+
		"\13c\3d\5d\u05af\nd\3d\5d\u05b2\nd\3d\3d\3e\3e\3e\3e\7e\u05ba\ne\fe\16"+
		"e\u05bd\13e\3e\3e\5e\u05c1\ne\5e\u05c3\ne\3f\3f\3f\5f\u05c8\nf\3f\3f\3"+
		"f\3f\7f\u05ce\nf\ff\16f\u05d1\13f\3f\5f\u05d4\nf\3f\3f\5f\u05d8\nf\3g"+
		"\3g\3g\7g\u05dd\ng\fg\16g\u05e0\13g\3h\3h\3h\3h\7h\u05e6\nh\fh\16h\u05e9"+
		"\13h\3h\5h\u05ec\nh\3h\5h\u05ef\nh\3h\3h\3i\5i\u05f4\ni\3i\3i\3i\5i\u05f9"+
		"\ni\3j\3j\3j\3j\3j\3j\5j\u0601\nj\5j\u0603\nj\3j\3j\3j\3j\5j\u0609\nj"+
		"\5j\u060b\nj\3j\3j\3j\5j\u0610\nj\3k\3k\3k\7k\u0615\nk\fk\16k\u0618\13"+
		"k\3l\3l\3l\5l\u061d\nl\3m\3m\3m\3m\3m\5m\u0624\nm\3n\3n\3n\3n\5n\u062a"+
		"\nn\3o\3o\3p\3p\3p\3p\3p\3p\5p\u0634\np\3p\3p\3p\5p\u0639\np\3p\3p\3p"+
		"\5p\u063e\np\5p\u0640\np\3q\3q\3r\3r\6r\u0646\nr\rr\16r\u0647\3r\3r\6"+
		"r\u064c\nr\rr\16r\u064d\3r\3r\3r\7r\u0653\nr\fr\16r\u0656\13r\3r\5r\u0659"+
		"\nr\3s\3s\3s\5s\u065e\ns\3t\3t\3t\7t\u0663\nt\ft\16t\u0666\13t\3u\3u\7"+
		"u\u066a\nu\fu\16u\u066d\13u\3v\3v\3v\3v\3v\3v\5v\u0675\nv\3w\3w\3w\5w"+
		"\u067a\nw\3x\3x\3x\3y\3y\3y\3y\5y\u0683\ny\3z\5z\u0686\nz\3z\3z\7z\u068a"+
		"\nz\fz\16z\u068d\13z\3{\3{\3{\5{\u0692\n{\3{\3{\3{\3{\5{\u0698\n{\3|\3"+
		"|\5|\u069c\n|\3}\3}\3}\3}\3}\5}\u06a3\n}\3}\7}\u06a6\n}\f}\16}\u06a9\13"+
		"}\3~\7~\u06ac\n~\f~\16~\u06af\13~\3~\3~\3~\3~\3~\3~\5~\u06b7\n~\3~\7~"+
		"\u06ba\n~\f~\16~\u06bd\13~\3\177\3\177\5\177\u06c1\n\177\3\177\3\177\3"+
		"\177\3\177\3\177\5\177\u06c8\n\177\3\u0080\5\u0080\u06cb\n\u0080\3\u0080"+
		"\3\u0080\5\u0080\u06cf\n\u0080\7\u0080\u06d1\n\u0080\f\u0080\16\u0080"+
		"\u06d4\13\u0080\3\u0081\3\u0081\3\u0081\3\u0081\3\u0081\3\u0081\3\u0081"+
		"\5\u0081\u06dd\n\u0081\3\u0082\3\u0082\3\u0083\3\u0083\3\u0084\3\u0084"+
		"\3\u0085\3\u0085\3\u0086\3\u0086\3\u0087\3\u0087\3\u0088\3\u0088\3\u0089"+
		"\3\u0089\3\u0089\3\u0089\2\3\u00a8\u008a\2\4\6\b\n\f\16\20\22\24\26\30"+
		"\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080"+
		"\u0082\u0084\u0086\u0088\u008a\u008c\u008e\u0090\u0092\u0094\u0096\u0098"+
		"\u009a\u009c\u009e\u00a0\u00a2\u00a4\u00a6\u00a8\u00aa\u00ac\u00ae\u00b0"+
		"\u00b2\u00b4\u00b6\u00b8\u00ba\u00bc\u00be\u00c0\u00c2\u00c4\u00c6\u00c8"+
		"\u00ca\u00cc\u00ce\u00d0\u00d2\u00d4\u00d6\u00d8\u00da\u00dc\u00de\u00e0"+
		"\u00e2\u00e4\u00e6\u00e8\u00ea\u00ec\u00ee\u00f0\u00f2\u00f4\u00f6\u00f8"+
		"\u00fa\u00fc\u00fe\u0100\u0102\u0104\u0106\u0108\u010a\u010c\u010e\u0110"+
		"\2\32\4\2::SS\4\288yy\3\2\u00d7\u00d8\3\2\u00cb\u00cc\4\2\u00c4\u00c4"+
		"\u00c6\u00c7\3\2\u00a1\u00a2\3\2YZ\3\2qr\3\2\u00c8\u00ca\4\2\u00c6\u00c7"+
		"\u00ce\u00ce\3\2\u00ba\u00bb\4\2\u00a7\u00a8\u00c0\u00c1\3\2\u00a3\u00a6"+
		"\6\2\u00a9\u00ab\u00ad\u00b5\u00b9\u00b9\u00d9\u00d9\3\2\u00c6\u00c7\4"+
		"\2\u00de\u00df\u00e1\u00e2\4\288kk\4\2..NN\5\2.\u0083\u0085\u009c\u00dd"+
		"\u00dd\6\2..NNnpuu\3\2\u0095\u009c\3\2\u0085\u0094\t\2//\62\62@@_`jjs"+
		"svv\13\2//\61\62?@PP]`jjssvv|~\2\u07b5\2\u0113\3\2\2\2\4\u0120\3\2\2\2"+
		"\6\u0123\3\2\2\2\b\u0143\3\2\2\2\n\u0146\3\2\2\2\f\u014d\3\2\2\2\16\u0155"+
		"\3\2\2\2\20\u0161\3\2\2\2\22\u0163\3\2\2\2\24\u016b\3\2\2\2\26\u0178\3"+
		"\2\2\2\30\u017a\3\2\2\2\32\u0190\3\2\2\2\34\u0192\3\2\2\2\36\u01a7\3\2"+
		"\2\2 \u01d2\3\2\2\2\"\u01d4\3\2\2\2$\u01ea\3\2\2\2&\u01ec\3\2\2\2(\u01f4"+
		"\3\2\2\2*\u01fc\3\2\2\2,\u01ff\3\2\2\2.\u0206\3\2\2\2\60\u0214\3\2\2\2"+
		"\62\u0217\3\2\2\2\64\u0239\3\2\2\2\66\u023b\3\2\2\28\u0243\3\2\2\2:\u024b"+
		"\3\2\2\2<\u0252\3\2\2\2>\u0258\3\2\2\2@\u0275\3\2\2\2B\u0277\3\2\2\2D"+
		"\u0279\3\2\2\2F\u0299\3\2\2\2H\u029b\3\2\2\2J\u029f\3\2\2\2L\u02a4\3\2"+
		"\2\2N\u02a7\3\2\2\2P\u02ab\3\2\2\2R\u02b5\3\2\2\2T\u02bb\3\2\2\2V\u02d1"+
		"\3\2\2\2X\u02d3\3\2\2\2Z\u02d5\3\2\2\2\\\u02f6\3\2\2\2^\u02fc\3\2\2\2"+
		"`\u0302\3\2\2\2b\u0308\3\2\2\2d\u030e\3\2\2\2f\u0311\3\2\2\2h\u0317\3"+
		"\2\2\2j\u0348\3\2\2\2l\u035b\3\2\2\2n\u0369\3\2\2\2p\u036c\3\2\2\2r\u0370"+
		"\3\2\2\2t\u0374\3\2\2\2v\u0381\3\2\2\2x\u0387\3\2\2\2z\u0389\3\2\2\2|"+
		"\u0392\3\2\2\2~\u039b\3\2\2\2\u0080\u03ad\3\2\2\2\u0082\u03af\3\2\2\2"+
		"\u0084\u03c2\3\2\2\2\u0086\u03c4\3\2\2\2\u0088\u03c8\3\2\2\2\u008a\u040c"+
		"\3\2\2\2\u008c\u0417\3\2\2\2\u008e\u041b\3\2\2\2\u0090\u041d\3\2\2\2\u0092"+
		"\u0424\3\2\2\2\u0094\u0432\3\2\2\2\u0096\u0436\3\2\2\2\u0098\u043d\3\2"+
		"\2\2\u009a\u0441\3\2\2\2\u009c\u0444\3\2\2\2\u009e\u0448\3\2\2\2\u00a0"+
		"\u044d\3\2\2\2\u00a2\u0451\3\2\2\2\u00a4\u045d\3\2\2\2\u00a6\u0465\3\2"+
		"\2\2\u00a8\u04b9\3\2\2\2\u00aa\u04fc\3\2\2\2\u00ac\u0509\3\2\2\2\u00ae"+
		"\u052b\3\2\2\2\u00b0\u052d\3\2\2\2\u00b2\u0532\3\2\2\2\u00b4\u0534\3\2"+
		"\2\2\u00b6\u053e\3\2\2\2\u00b8\u0555\3\2\2\2\u00ba\u0557\3\2\2\2\u00bc"+
		"\u0564\3\2\2\2\u00be\u056d\3\2\2\2\u00c0\u0579\3\2\2\2\u00c2\u057b\3\2"+
		"\2\2\u00c4\u05a5\3\2\2\2\u00c6\u05ae\3\2\2\2\u00c8\u05c2\3\2\2\2\u00ca"+
		"\u05d7\3\2\2\2\u00cc\u05d9\3\2\2\2\u00ce\u05e1\3\2\2\2\u00d0\u05f8\3\2"+
		"\2\2\u00d2\u060f\3\2\2\2\u00d4\u0611\3\2\2\2\u00d6\u0619\3\2\2\2\u00d8"+
		"\u0623\3\2\2\2\u00da\u0629\3\2\2\2\u00dc\u062b\3\2\2\2\u00de\u063f\3\2"+
		"\2\2\u00e0\u0641\3\2\2\2\u00e2\u0658\3\2\2\2\u00e4\u065d\3\2\2\2\u00e6"+
		"\u065f\3\2\2\2\u00e8\u0667\3\2\2\2\u00ea\u0674\3\2\2\2\u00ec\u0676\3\2"+
		"\2\2\u00ee\u067b\3\2\2\2\u00f0\u0682\3\2\2\2\u00f2\u0685\3\2\2\2\u00f4"+
		"\u0697\3\2\2\2\u00f6\u069b\3\2\2\2\u00f8\u06a2\3\2\2\2\u00fa\u06ad\3\2"+
		"\2\2\u00fc\u06c7\3\2\2\2\u00fe\u06ca\3\2\2\2\u0100\u06dc\3\2\2\2\u0102"+
		"\u06de\3\2\2\2\u0104\u06e0\3\2\2\2\u0106\u06e2\3\2\2\2\u0108\u06e4\3\2"+
		"\2\2\u010a\u06e6\3\2\2\2\u010c\u06e8\3\2\2\2\u010e\u06ea\3\2\2\2\u0110"+
		"\u06ec\3\2\2\2\u0112\u0114\7\f\2\2\u0113\u0112\3\2\2\2\u0113\u0114\3\2"+
		"\2\2\u0114\u0118\3\2\2\2\u0115\u0117\5\4\3\2\u0116\u0115\3\2\2\2\u0117"+
		"\u011a\3\2\2\2\u0118\u0116\3\2\2\2\u0118\u0119\3\2\2\2\u0119\u011b\3\2"+
		"\2\2\u011a\u0118\3\2\2\2\u011b\u011c\7\2\2\3\u011c\3\3\2\2\2\u011d\u0121"+
		"\5\6\4\2\u011e\u0121\5\f\7\2\u011f\u0121\5\n\6\2\u0120\u011d\3\2\2\2\u0120"+
		"\u011e\3\2\2\2\u0120\u011f\3\2\2\2\u0121\5\3\2\2\2\u0122\u0124\5\b\5\2"+
		"\u0123\u0122\3\2\2\2\u0124\u0125\3\2\2\2\u0125\u0123\3\2\2\2\u0125\u0126"+
		"\3\2\2\2\u0126\7\3\2\2\2\u0127\u0144\7\n\2\2\u0128\u0144\7\7\2\2\u0129"+
		"\u0144\7\21\2\2\u012a\u0144\7\b\2\2\u012b\u0144\7\13\2\2\u012c\u0144\7"+
		"\32\2\2\u012d\u0144\7\22\2\2\u012e\u0144\7\23\2\2\u012f\u0144\7\4\2\2"+
		"\u0130\u0144\7\24\2\2\u0131\u0144\7\25\2\2\u0132\u0144\7\35\2\2\u0133"+
		"\u0144\7\26\2\2\u0134\u0144\7!\2\2\u0135\u0144\7\27\2\2\u0136\u0144\7"+
		"\30\2\2\u0137\u0144\7\36\2\2\u0138\u0144\7\"\2\2\u0139\u0144\7\'\2\2\u013a"+
		"\u0144\7%\2\2\u013b\u013f\7\5\2\2\u013c\u013e\7\16\2\2\u013d\u013c\3\2"+
		"\2\2\u013e\u0141\3\2\2\2\u013f\u013d\3\2\2\2\u013f\u0140\3\2\2\2\u0140"+
		"\u0142\3\2\2\2\u0141\u013f\3\2\2\2\u0142\u0144\7\17\2\2\u0143\u0127\3"+
		"\2\2\2\u0143\u0128\3\2\2\2\u0143\u0129\3\2\2\2\u0143\u012a\3\2\2\2\u0143"+
		"\u012b\3\2\2\2\u0143\u012c\3\2\2\2\u0143\u012d\3\2\2\2\u0143\u012e\3\2"+
		"\2\2\u0143\u012f\3\2\2\2\u0143\u0130\3\2\2\2\u0143\u0131\3\2\2\2\u0143"+
		"\u0132\3\2\2\2\u0143\u0133\3\2\2\2\u0143\u0134\3\2\2\2\u0143\u0135\3\2"+
		"\2\2\u0143\u0136\3\2\2\2\u0143\u0137\3\2\2\2\u0143\u0138\3\2\2\2\u0143"+
		"\u0139\3\2\2\2\u0143\u013a\3\2\2\2\u0143\u013b\3\2\2\2\u0144\t\3\2\2\2"+
		"\u0145\u0147\7$\2\2\u0146\u0145\3\2\2\2\u0147\u0148\3\2\2\2\u0148\u0146"+
		"\3\2\2\2\u0148\u0149\3\2\2\2\u0149\13\3\2\2\2\u014a\u014c\5\16\b\2\u014b"+
		"\u014a\3\2\2\2\u014c\u014f\3\2\2\2\u014d\u014b\3\2\2\2\u014d\u014e\3\2"+
		"\2\2\u014e\u0151\3\2\2\2\u014f\u014d\3\2\2\2\u0150\u0152\5\20\t\2\u0151"+
		"\u0150\3\2\2\2\u0152\u0153\3\2\2\2\u0153\u0151\3\2\2\2\u0153\u0154\3\2"+
		"\2\2\u0154\r\3\2\2\2\u0155\u0156\7X\2\2\u0156\u0157\7g\2\2\u0157\u0158"+
		"\5\u00c8e\2\u0158\u0159\7\u00d8\2\2\u0159\17\3\2\2\2\u015a\u0162\5@!\2"+
		"\u015b\u0162\5\22\n\2\u015c\u0162\5\30\r\2\u015d\u0162\5\34\17\2\u015e"+
		"\u0162\5\36\20\2\u015f\u0162\5\u00a2R\2\u0160\u0162\5\u0110\u0089\2\u0161"+
		"\u015a\3\2\2\2\u0161\u015b\3\2\2\2\u0161\u015c\3\2\2\2\u0161\u015d\3\2"+
		"\2\2\u0161\u015e\3\2\2\2\u0161\u015f\3\2\2\2\u0161\u0160\3\2\2\2\u0162"+
		"\21\3\2\2\2\u0163\u0165\7\177\2\2\u0164\u0166\t\2\2\2\u0165\u0164\3\2"+
		"\2\2\u0165\u0166\3\2\2\2\u0166\u0167\3\2\2\2\u0167\u0168\5\24\13\2\u0168"+
		"\u0169\7\u00d8\2\2\u0169\23\3\2\2\2\u016a\u016c\7\u00be\2\2\u016b\u016a"+
		"\3\2\2\2\u016b\u016c\3\2\2\2\u016c\u016d\3\2\2\2\u016d\u0175\5\26\f\2"+
		"\u016e\u0170\7\u00d6\2\2\u016f\u0171\7\u00be\2\2\u0170\u016f\3\2\2\2\u0170"+
		"\u0171\3\2\2\2\u0171\u0172\3\2\2\2\u0172\u0174\5\26\f\2\u0173\u016e\3"+
		"\2\2\2\u0174\u0177\3\2\2\2\u0175\u0173\3\2\2\2\u0175\u0176\3\2\2\2\u0176"+
		"\25\3\2\2\2\u0177\u0175\3\2\2\2\u0178\u0179\5\u00c8e\2\u0179\27\3\2\2"+
		"\2\u017a\u0189\7g\2\2\u017b\u017d\5\u00c8e\2\u017c\u017b\3\2\2\2\u017c"+
		"\u017d\3\2\2\2\u017d\u017e\3\2\2\2\u017e\u0182\7\u00d4\2\2\u017f\u0181"+
		"\5\32\16\2\u0180\u017f\3\2\2\2\u0181\u0184\3\2\2\2\u0182\u0180\3\2\2\2"+
		"\u0182\u0183\3\2\2\2\u0183\u0185\3\2\2\2\u0184\u0182\3\2\2\2\u0185\u018a"+
		"\7\u00d5\2\2\u0186\u0187\5\u00c8e\2\u0187\u0188\7\u00d8\2\2\u0188\u018a"+
		"\3\2\2\2\u0189\u017c\3\2\2\2\u0189\u0186\3\2\2\2\u018a\31\3\2\2\2\u018b"+
		"\u0191\5@!\2\u018c\u0191\5\22\n\2\u018d\u0191\5\34\17\2\u018e\u0191\5"+
		"\36\20\2\u018f\u0191\5\u00a2R\2\u0190\u018b\3\2\2\2\u0190\u018c\3\2\2"+
		"\2\u0190\u018d\3\2\2\2\u0190\u018e\3\2\2\2\u0190\u018f\3\2\2\2\u0191\33"+
		"\3\2\2\2\u0192\u0193\5\60\31\2\u0193\u0195\7S\2\2\u0194\u0196\7\u00c2"+
		"\2\2\u0195\u0194\3\2\2\2\u0195\u0196\3\2\2\2\u0196\u0197\3\2\2\2\u0197"+
		"\u0199\5\u0104\u0083\2\u0198\u019a\5$\23\2\u0199\u0198\3\2\2\2\u0199\u019a"+
		"\3\2\2\2\u019a\u019b\3\2\2\2\u019b\u019c\7\u00d0\2\2\u019c\u019d\5|?\2"+
		"\u019d\u01a3\7\u00d1\2\2\u019e\u01a0\7\u00d7\2\2\u019f\u01a1\7\u00cf\2"+
		"\2\u01a0\u019f\3\2\2\2\u01a0\u01a1\3\2\2\2\u01a1\u01a2\3\2\2\2\u01a2\u01a4"+
		"\5\u0080A\2\u01a3\u019e\3\2\2\2\u01a3\u01a4\3\2\2\2\u01a4\u01a5\3\2\2"+
		"\2\u01a5\u01a6\5D#\2\u01a6\35\3\2\2\2\u01a7\u01a9\5\60\31\2\u01a8\u01aa"+
		"\7n\2\2\u01a9\u01a8\3\2\2\2\u01a9\u01aa\3\2\2\2\u01aa\u01ac\3\2\2\2\u01ab"+
		"\u01ad\5\u0102\u0082\2\u01ac\u01ab\3\2\2\2\u01ac\u01ad\3\2\2\2\u01ad\u01af"+
		"\3\2\2\2\u01ae\u01b0\7l\2\2\u01af\u01ae\3\2\2\2\u01af\u01b0\3\2\2\2\u01b0"+
		"\u01c7\3\2\2\2\u01b1\u01b2\5 \21\2\u01b2\u01b4\5\u0104\u0083\2\u01b3\u01b5"+
		"\5$\23\2\u01b4\u01b3\3\2\2\2\u01b4\u01b5\3\2\2\2\u01b5\u01b8\3\2\2\2\u01b6"+
		"\u01b7\7M\2\2\u01b7\u01b9\5\u00be`\2\u01b8\u01b6\3\2\2\2\u01b8\u01b9\3"+
		"\2\2\2\u01b9\u01bc\3\2\2\2\u01ba\u01bb\7W\2\2\u01bb\u01bd\5\"\22\2\u01bc"+
		"\u01ba\3\2\2\2\u01bc\u01bd\3\2\2\2\u01bd\u01c8\3\2\2\2\u01be\u01bf\7a"+
		"\2\2\u01bf\u01c1\5\u0104\u0083\2\u01c0\u01c2\5$\23\2\u01c1\u01c0\3\2\2"+
		"\2\u01c1\u01c2\3\2\2\2\u01c2\u01c5\3\2\2\2\u01c3\u01c4\7M\2\2\u01c4\u01c6"+
		"\5\"\22\2\u01c5\u01c3\3\2\2\2\u01c5\u01c6\3\2\2\2\u01c6\u01c8\3\2\2\2"+
		"\u01c7\u01b1\3\2\2\2\u01c7\u01be\3\2\2\2\u01c8\u01c9\3\2\2\2\u01c9\u01cd"+
		"\7\u00d4\2\2\u01ca\u01cc\5\u008aF\2\u01cb\u01ca\3\2\2\2\u01cc\u01cf\3"+
		"\2\2\2\u01cd\u01cb\3\2\2\2\u01cd\u01ce\3\2\2\2\u01ce\u01d0\3\2\2\2\u01cf"+
		"\u01cd\3\2\2\2\u01d0\u01d1\7\u00d5\2\2\u01d1\37\3\2\2\2\u01d2\u01d3\t"+
		"\3\2\2\u01d3!\3\2\2\2\u01d4\u01d9\5\u00be`\2\u01d5\u01d6\7\u00d6\2\2\u01d6"+
		"\u01d8\5\u00be`\2\u01d7\u01d5\3\2\2\2\u01d8\u01db\3\2\2\2\u01d9\u01d7"+
		"\3\2\2\2\u01d9\u01da\3\2\2\2\u01da#\3\2\2\2\u01db\u01d9\3\2\2\2\u01dc"+
		"\u01dd\7\u009e\2\2\u01dd\u01de\5&\24\2\u01de\u01df\7\u009f\2\2\u01df\u01eb"+
		"\3\2\2\2\u01e0\u01e1\7\u009e\2\2\u01e1\u01e2\5(\25\2\u01e2\u01e3\7\u009f"+
		"\2\2\u01e3\u01eb\3\2\2\2\u01e4\u01e5\7\u009e\2\2\u01e5\u01e6\5&\24\2\u01e6"+
		"\u01e7\7\u00d6\2\2\u01e7\u01e8\5(\25\2\u01e8\u01e9\7\u009f\2\2\u01e9\u01eb"+
		"\3\2\2\2\u01ea\u01dc\3\2\2\2\u01ea\u01e0\3\2\2\2\u01ea\u01e4\3\2\2\2\u01eb"+
		"%\3\2\2\2\u01ec\u01f1\5*\26\2\u01ed\u01ee\7\u00d6\2\2\u01ee\u01f0\5*\26"+
		"\2\u01ef\u01ed\3\2\2\2\u01f0\u01f3\3\2\2\2\u01f1\u01ef\3\2\2\2\u01f1\u01f2"+
		"\3\2\2\2\u01f2\'\3\2\2\2\u01f3\u01f1\3\2\2\2\u01f4\u01f9\5,\27\2\u01f5"+
		"\u01f6\7\u00d6\2\2\u01f6\u01f8\5,\27\2\u01f7\u01f5\3\2\2\2\u01f8\u01fb"+
		"\3\2\2\2\u01f9\u01f7\3\2\2\2\u01f9\u01fa\3\2\2\2\u01fa)\3\2\2\2\u01fb"+
		"\u01f9\3\2\2\2\u01fc\u01fd\5\60\31\2\u01fd\u01fe\5\u0104\u0083\2\u01fe"+
		"+\3\2\2\2\u01ff\u0200\5\60\31\2\u0200\u0201\5\u0104\u0083\2\u0201\u0204"+
		"\7\u00d9\2\2\u0202\u0205\5\u00be`\2\u0203\u0205\5\u010c\u0087\2\u0204"+
		"\u0202\3\2\2\2\u0204\u0203\3\2\2\2\u0205-\3\2\2\2\u0206\u0207\7\u009e"+
		"\2\2\u0207\u020c\5\u00c0a\2\u0208\u0209\7\u00d6\2\2\u0209\u020b\5\u00c0"+
		"a\2\u020a\u0208\3\2\2\2\u020b\u020e\3\2\2\2\u020c\u020a\3\2\2\2\u020c"+
		"\u020d\3\2\2\2\u020d\u020f\3\2\2\2\u020e\u020c\3\2\2\2\u020f\u0210\7\u009f"+
		"\2\2\u0210/\3\2\2\2\u0211\u0213\5\62\32\2\u0212\u0211\3\2\2\2\u0213\u0216"+
		"\3\2\2\2\u0214\u0212\3\2\2\2\u0214\u0215\3\2\2\2\u0215\61\3\2\2\2\u0216"+
		"\u0214\3\2\2\2\u0217\u021b\7\u00d2\2\2\u0218\u0219\5\u0104\u0083\2\u0219"+
		"\u021a\7\u00d7\2\2\u021a\u021c\3\2\2\2\u021b\u0218\3\2\2\2\u021b\u021c"+
		"\3\2\2\2\u021c\u021d\3\2\2\2\u021d\u0222\5\64\33\2\u021e\u021f\7\u00d6"+
		"\2\2\u021f\u0221\5\64\33\2\u0220\u021e\3\2\2\2\u0221\u0224\3\2\2\2\u0222"+
		"\u0220\3\2\2\2\u0222\u0223\3\2\2\2\u0223\u0225\3\2\2\2\u0224\u0222\3\2"+
		"\2\2\u0225\u0226\7\u00d3\2\2\u0226\63\3\2\2\2\u0227\u023a\5\u00c6d\2\u0228"+
		"\u0229\5\u00c6d\2\u0229\u022a\7\u00d0\2\2\u022a\u022b\5\66\34\2\u022b"+
		"\u022c\7\u00d1\2\2\u022c\u023a\3\2\2\2\u022d\u022e\5\u00c6d\2\u022e\u022f"+
		"\7\u00d0\2\2\u022f\u0230\58\35\2\u0230\u0231\7\u00d1\2\2\u0231\u023a\3"+
		"\2\2\2\u0232\u0233\5\u00c6d\2\u0233\u0234\7\u00d0\2\2\u0234\u0235\5\66"+
		"\34\2\u0235\u0236\7\u00d6\2\2\u0236\u0237\58\35\2\u0237\u0238\7\u00d1"+
		"\2\2\u0238\u023a\3\2\2\2\u0239\u0227\3\2\2\2\u0239\u0228\3\2\2\2\u0239"+
		"\u022d\3\2\2\2\u0239\u0232\3\2\2\2\u023a\65\3\2\2\2\u023b\u0240\5\u00a8"+
		"U\2\u023c\u023d\7\u00d6\2\2\u023d\u023f\5\u00a8U\2\u023e\u023c\3\2\2\2"+
		"\u023f\u0242\3\2\2\2\u0240\u023e\3\2\2\2\u0240\u0241\3\2\2\2\u0241\67"+
		"\3\2\2\2\u0242\u0240\3\2\2\2\u0243\u0248\5:\36\2\u0244\u0245\7\u00d6\2"+
		"\2\u0245\u0247\5:\36\2\u0246\u0244\3\2\2\2\u0247\u024a\3\2\2\2\u0248\u0246"+
		"\3\2\2\2\u0248\u0249\3\2\2\2\u02499\3\2\2\2\u024a\u0248\3\2\2\2\u024b"+
		"\u024c\7\u00dc\2\2\u024c\u024d\7\u00a0\2\2\u024d\u024e\5\u00a8U\2\u024e"+
		";\3\2\2\2\u024f\u0251\5> \2\u0250\u024f\3\2\2\2\u0251\u0254\3\2\2\2\u0252"+
		"\u0250\3\2\2\2\u0252\u0253\3\2\2\2\u0253=\3\2\2\2\u0254\u0252\3\2\2\2"+
		"\u0255\u0259\5@!\2\u0256\u0259\5\34\17\2\u0257\u0259\5\36\20\2\u0258\u0255"+
		"\3\2\2\2\u0258\u0256\3\2\2\2\u0258\u0257\3\2\2\2\u0259?\3\2\2\2\u025a"+
		"\u025b\5\u0104\u0083\2\u025b\u025c\7\u00d7\2\2\u025c\u0276\3\2\2\2\u025d"+
		"\u0276\5D#\2\u025e\u0276\5F$\2\u025f\u0276\5P)\2\u0260\u0276\5R*\2\u0261"+
		"\u0276\5T+\2\u0262\u0276\5Z.\2\u0263\u0276\5^\60\2\u0264\u0276\5`\61\2"+
		"\u0265\u0276\5b\62\2\u0266\u0267\5\u00b4[\2\u0267\u0268\7\u00d8\2\2\u0268"+
		"\u0276\3\2\2\2\u0269\u0276\5\u0082B\2\u026a\u0276\5\u0088E\2\u026b\u0276"+
		"\5\u0086D\2\u026c\u0276\5d\63\2\u026d\u0276\5f\64\2\u026e\u0276\5h\65"+
		"\2\u026f\u0276\5j\66\2\u0270\u0276\5p9\2\u0271\u0276\5r:\2\u0272\u0276"+
		"\5t;\2\u0273\u0276\5B\"\2\u0274\u0276\5v<\2\u0275\u025a\3\2\2\2\u0275"+
		"\u025d\3\2\2\2\u0275\u025e\3\2\2\2\u0275\u025f\3\2\2\2\u0275\u0260\3\2"+
		"\2\2\u0275\u0261\3\2\2\2\u0275\u0262\3\2\2\2\u0275\u0263\3\2\2\2\u0275"+
		"\u0264\3\2\2\2\u0275\u0265\3\2\2\2\u0275\u0266\3\2\2\2\u0275\u0269\3\2"+
		"\2\2\u0275\u026a\3\2\2\2\u0275\u026b\3\2\2\2\u0275\u026c\3\2\2\2\u0275"+
		"\u026d\3\2\2\2\u0275\u026e\3\2\2\2\u0275\u026f\3\2\2\2\u0275\u0270\3\2"+
		"\2\2\u0275\u0271\3\2\2\2\u0275\u0272\3\2\2\2\u0275\u0273\3\2\2\2\u0275"+
		"\u0274\3\2\2\2\u0276A\3\2\2\2\u0277\u0278\7\u00d8\2\2\u0278C\3\2\2\2\u0279"+
		"\u027a\7\u00d4\2\2\u027a\u027b\5<\37\2\u027b\u027c\7\u00d5\2\2\u027cE"+
		"\3\2\2\2\u027d\u027e\7V\2\2\u027e\u027f\5\u00a6T\2\u027f\u0283\5@!\2\u0280"+
		"\u0282\5H%\2\u0281\u0280\3\2\2\2\u0282\u0285\3\2\2\2\u0283\u0281\3\2\2"+
		"\2\u0283\u0284\3\2\2\2\u0284\u0287\3\2\2\2\u0285\u0283\3\2\2\2\u0286\u0288"+
		"\5L\'\2\u0287\u0286\3\2\2\2\u0287\u0288\3\2\2\2\u0288\u029a\3\2\2\2\u0289"+
		"\u028a\7V\2\2\u028a\u028b\5\u00a6T\2\u028b\u028c\7\u00d7\2\2\u028c\u0290"+
		"\5<\37\2\u028d\u028f\5J&\2\u028e\u028d\3\2\2\2\u028f\u0292\3\2\2\2\u0290"+
		"\u028e\3\2\2\2\u0290\u0291\3\2\2\2\u0291\u0294\3\2\2\2\u0292\u0290\3\2"+
		"\2\2\u0293\u0295\5N(\2\u0294\u0293\3\2\2\2\u0294\u0295\3\2\2\2\u0295\u0296"+
		"\3\2\2\2\u0296\u0297\7H\2\2\u0297\u0298\7\u00d8\2\2\u0298\u029a\3\2\2"+
		"\2\u0299\u027d\3\2\2\2\u0299\u0289\3\2\2\2\u029aG\3\2\2\2\u029b\u029c"+
		"\7C\2\2\u029c\u029d\5\u00a6T\2\u029d\u029e\5@!\2\u029eI\3\2\2\2\u029f"+
		"\u02a0\7C\2\2\u02a0\u02a1\5\u00a6T\2\u02a1\u02a2\7\u00d7\2\2\u02a2\u02a3"+
		"\5<\37\2\u02a3K\3\2\2\2\u02a4\u02a5\7B\2\2\u02a5\u02a6\5@!\2\u02a6M\3"+
		"\2\2\2\u02a7\u02a8\7B\2\2\u02a8\u02a9\7\u00d7\2\2\u02a9\u02aa\5<\37\2"+
		"\u02aaO\3\2\2\2\u02ab\u02ac\7\u0081\2\2\u02ac\u02b3\5\u00a6T\2\u02ad\u02b4"+
		"\5@!\2\u02ae\u02af\7\u00d7\2\2\u02af\u02b0\5<\37\2\u02b0\u02b1\7J\2\2"+
		"\u02b1\u02b2\7\u00d8\2\2\u02b2\u02b4\3\2\2\2\u02b3\u02ad\3\2\2\2\u02b3"+
		"\u02ae\3\2\2\2\u02b4Q\3\2\2\2\u02b5\u02b6\7>\2\2\u02b6\u02b7\5@!\2\u02b7"+
		"\u02b8\7\u0081\2\2\u02b8\u02b9\5\u00a6T\2\u02b9\u02ba\7\u00d8\2\2\u02ba"+
		"S\3\2\2\2\u02bb\u02bc\7Q\2\2\u02bc\u02be\7\u00d0\2\2\u02bd\u02bf\5V,\2"+
		"\u02be\u02bd\3\2\2\2\u02be\u02bf\3\2\2\2\u02bf\u02c0\3\2\2\2\u02c0\u02c2"+
		"\7\u00d8\2\2\u02c1\u02c3\5\u00a4S\2\u02c2\u02c1\3\2\2\2\u02c2\u02c3\3"+
		"\2\2\2\u02c3\u02c4\3\2\2\2\u02c4\u02c6\7\u00d8\2\2\u02c5\u02c7\5X-\2\u02c6"+
		"\u02c5\3\2\2\2\u02c6\u02c7\3\2\2\2\u02c7\u02c8\3\2\2\2\u02c8\u02cf\7\u00d1"+
		"\2\2\u02c9\u02d0\5@!\2\u02ca\u02cb\7\u00d7\2\2\u02cb\u02cc\5<\37\2\u02cc"+
		"\u02cd\7F\2\2\u02cd\u02ce\7\u00d8\2\2\u02ce\u02d0\3\2\2\2\u02cf\u02c9"+
		"\3\2\2\2\u02cf\u02ca\3\2\2\2\u02d0U\3\2\2\2\u02d1\u02d2\5\u00a4S\2\u02d2"+
		"W\3\2\2\2\u02d3\u02d4\5\u00a4S\2\u02d4Y\3\2\2\2\u02d5\u02d6\7w\2\2\u02d6"+
		"\u02ee\5\u00a6T\2\u02d7\u02d9\7\u00d4\2\2\u02d8\u02da\7\u00d8\2\2\u02d9"+
		"\u02d8\3\2\2\2\u02d9\u02da\3\2\2\2\u02da\u02de\3\2\2\2\u02db\u02dd\5\\"+
		"/\2\u02dc\u02db\3\2\2\2\u02dd\u02e0\3\2\2\2\u02de\u02dc\3\2\2\2\u02de"+
		"\u02df\3\2\2\2\u02df\u02e1\3\2\2\2\u02e0\u02de\3\2\2\2\u02e1\u02ef\7\u00d5"+
		"\2\2\u02e2\u02e4\7\u00d7\2\2\u02e3\u02e5\7\u00d8\2\2\u02e4\u02e3\3\2\2"+
		"\2\u02e4\u02e5\3\2\2\2\u02e5\u02e9\3\2\2\2\u02e6\u02e8\5\\/\2\u02e7\u02e6"+
		"\3\2\2\2\u02e8\u02eb\3\2\2\2\u02e9\u02e7\3\2\2\2\u02e9\u02ea\3\2\2\2\u02ea"+
		"\u02ec\3\2\2\2\u02eb\u02e9\3\2\2\2\u02ec\u02ed\7I\2\2\u02ed\u02ef\7\u00d8"+
		"\2\2\u02ee\u02d7\3\2\2\2\u02ee\u02e2\3\2\2\2\u02ef[\3\2\2\2\u02f0\u02f1"+
		"\7\66\2\2\u02f1\u02f4\5\u00a8U\2\u02f2\u02f4\7=\2\2\u02f3\u02f0\3\2\2"+
		"\2\u02f3\u02f2\3\2\2\2\u02f4\u02f5\3\2\2\2\u02f5\u02f7\t\4\2\2\u02f6\u02f3"+
		"\3\2\2\2\u02f7\u02f8\3\2\2\2\u02f8\u02f6\3\2\2\2\u02f8\u02f9\3\2\2\2\u02f9"+
		"\u02fa\3\2\2\2\u02fa\u02fb\5<\37\2\u02fb]\3\2\2\2\u02fc\u02fe\7\64\2\2"+
		"\u02fd\u02ff\5\u00a8U\2\u02fe\u02fd\3\2\2\2\u02fe\u02ff\3\2\2\2\u02ff"+
		"\u0300\3\2\2\2\u0300\u0301\7\u00d8\2\2\u0301_\3\2\2\2\u0302\u0304\7;\2"+
		"\2\u0303\u0305\5\u00a8U\2\u0304\u0303\3\2\2\2\u0304\u0305\3\2\2\2\u0305"+
		"\u0306\3\2\2\2\u0306\u0307\7\u00d8\2\2\u0307a\3\2\2\2\u0308\u030a\7t\2"+
		"\2\u0309\u030b\5\u00a8U\2\u030a\u0309\3\2\2\2\u030a\u030b\3\2\2\2\u030b"+
		"\u030c\3\2\2\2\u030c\u030d\7\u00d8\2\2\u030dc\3\2\2\2\u030e\u030f\5\u00a8"+
		"U\2\u030f\u0310\7\u00d8\2\2\u0310e\3\2\2\2\u0311\u0312\7~\2\2\u0312\u0313"+
		"\7\u00d0\2\2\u0313\u0314\5\u00e6t\2\u0314\u0315\7\u00d1\2\2\u0315\u0316"+
		"\7\u00d8\2\2\u0316g\3\2\2\2\u0317\u033e\7R\2\2\u0318\u0319\7\u00d0\2\2"+
		"\u0319\u031a\5\u00e8u\2\u031a\u031c\7\60\2\2\u031b\u031d\7\u00c2\2\2\u031c"+
		"\u031b\3\2\2\2\u031c\u031d\3\2\2\2\u031d\u031e\3\2\2\2\u031e\u0324\5\u00aa"+
		"V\2\u031f\u0321\7\u00a0\2\2\u0320\u0322\7\u00c2\2\2\u0321\u0320\3\2\2"+
		"\2\u0321\u0322\3\2\2\2\u0322\u0323\3\2\2\2\u0323\u0325\5\u00e8u\2\u0324"+
		"\u031f\3\2\2\2\u0324\u0325\3\2\2\2\u0325\u0326\3\2\2\2\u0326\u0327\7\u00d1"+
		"\2\2\u0327\u033f\3\2\2\2\u0328\u0329\7\u00d0\2\2\u0329\u032a\5\u00a8U"+
		"\2\u032a\u032b\7\60\2\2\u032b\u0331\5\u00aaV\2\u032c\u032e\7\u00a0\2\2"+
		"\u032d\u032f\7\u00c2\2\2\u032e\u032d\3\2\2\2\u032e\u032f\3\2\2\2\u032f"+
		"\u0330\3\2\2\2\u0330\u0332\5\u00e8u\2\u0331\u032c\3\2\2\2\u0331\u0332"+
		"\3\2\2\2\u0332\u0333\3\2\2\2\u0333\u0334\7\u00d1\2\2\u0334\u033f\3\2\2"+
		"\2\u0335\u0336\7\u00d0\2\2\u0336\u0337\5\u00e8u\2\u0337\u0338\7\60\2\2"+
		"\u0338\u0339\7c\2\2\u0339\u033a\7\u00d0\2\2\u033a\u033b\5\u00fe\u0080"+
		"\2\u033b\u033c\7\u00d1\2\2\u033c\u033d\7\u00d1\2\2\u033d\u033f\3\2\2\2"+
		"\u033e\u0318\3\2\2\2\u033e\u0328\3\2\2\2\u033e\u0335\3\2\2\2\u033f\u0346"+
		"\3\2\2\2\u0340\u0347\5@!\2\u0341\u0342\7\u00d7\2\2\u0342\u0343\5<\37\2"+
		"\u0343\u0344\7G\2\2\u0344\u0345\7\u00d8\2\2\u0345\u0347\3\2\2\2\u0346"+
		"\u0340\3\2\2\2\u0346\u0341\3\2\2\2\u0347i\3\2\2\2\u0348\u0349\7z\2\2\u0349"+
		"\u0359\5D#\2\u034a\u034c\5l\67\2\u034b\u034a\3\2\2\2\u034c\u034d\3\2\2"+
		"\2\u034d\u034b\3\2\2\2\u034d\u034e\3\2\2\2\u034e\u0350\3\2\2\2\u034f\u0351"+
		"\5n8\2\u0350\u034f\3\2\2\2\u0350\u0351\3\2\2\2\u0351\u035a\3\2\2\2\u0352"+
		"\u0354\5l\67\2\u0353\u0352\3\2\2\2\u0354\u0357\3\2\2\2\u0355\u0353\3\2"+
		"\2\2\u0355\u0356\3\2\2\2\u0356\u0358\3\2\2\2\u0357\u0355\3\2\2\2\u0358"+
		"\u035a\5n8\2\u0359\u034b\3\2\2\2\u0359\u0355\3\2\2\2\u035ak\3\2\2\2\u035b"+
		"\u035c\7\67\2\2\u035c\u035d\7\u00d0\2\2\u035d\u0362\5\u00be`\2\u035e\u035f"+
		"\7\u00c3\2\2\u035f\u0361\5\u00be`\2\u0360\u035e\3\2\2\2\u0361\u0364\3"+
		"\2\2\2\u0362\u0360\3\2\2\2\u0362\u0363\3\2\2\2\u0363\u0365\3\2\2\2\u0364"+
		"\u0362\3\2\2\2\u0365\u0366\7\u00dc\2\2\u0366\u0367\7\u00d1\2\2\u0367\u0368"+
		"\5D#\2\u0368m\3\2\2\2\u0369\u036a\7O\2\2\u036a\u036b\5D#\2\u036bo\3\2"+
		"\2\2\u036c\u036d\7x\2\2\u036d\u036e\5\u00a8U\2\u036e\u036f\7\u00d8\2\2"+
		"\u036fq\3\2\2\2\u0370\u0371\7U\2\2\u0371\u0372\5\u0104\u0083\2\u0372\u0373"+
		"\7\u00d8\2\2\u0373s\3\2\2\2\u0374\u0375\7<\2\2\u0375\u0376\7\u00d0\2\2"+
		"\u0376\u0377\5z>\2\u0377\u037e\7\u00d1\2\2\u0378\u037f\5@!\2\u0379\u037a"+
		"\7\u00d7\2\2\u037a\u037b\5<\37\2\u037b\u037c\7E\2\2\u037c\u037d\7\u00d8"+
		"\2\2\u037d\u037f\3\2\2\2\u037e\u0378\3\2\2\2\u037e\u0379\3\2\2\2\u037f"+
		"u\3\2\2\2\u0380\u0382\5x=\2\u0381\u0380\3\2\2\2\u0382\u0383\3\2\2\2\u0383"+
		"\u0381\3\2\2\2\u0383\u0384\3\2\2\2\u0384w\3\2\2\2\u0385\u0388\5\6\4\2"+
		"\u0386\u0388\5\n\6\2\u0387\u0385\3\2\2\2\u0387\u0386\3\2\2\2\u0388y\3"+
		"\2\2\2\u0389\u038e\5\u00a0Q\2\u038a\u038b\7\u00d6\2\2\u038b\u038d\5\u00a0"+
		"Q\2\u038c\u038a\3\2\2\2\u038d\u0390\3\2\2\2\u038e\u038c\3\2\2\2\u038e"+
		"\u038f\3\2\2\2\u038f{\3\2\2\2\u0390\u038e\3\2\2\2\u0391\u0393\5~@\2\u0392"+
		"\u0391\3\2\2\2\u0392\u0393\3\2\2\2\u0393\u0398\3\2\2\2\u0394\u0395\7\u00d6"+
		"\2\2\u0395\u0397\5~@\2\u0396\u0394\3\2\2\2\u0397\u039a\3\2\2\2\u0398\u0396"+
		"\3\2\2\2\u0398\u0399\3\2\2\2\u0399}\3\2\2\2\u039a\u0398\3\2\2\2\u039b"+
		"\u039d\5\60\31\2\u039c\u039e\7\u00cf\2\2\u039d\u039c\3\2\2\2\u039d\u039e"+
		"\3\2\2\2\u039e\u03a0\3\2\2\2\u039f\u03a1\5\u0080A\2\u03a0\u039f\3\2\2"+
		"\2\u03a0\u03a1\3\2\2\2\u03a1\u03a3\3\2\2\2\u03a2\u03a4\7\u00c2\2\2\u03a3"+
		"\u03a2\3\2\2\2\u03a3\u03a4\3\2\2\2\u03a4\u03a6\3\2\2\2\u03a5\u03a7\7\u00bf"+
		"\2\2\u03a6\u03a5\3\2\2\2\u03a6\u03a7\3\2\2\2\u03a7\u03a8\3\2\2\2\u03a8"+
		"\u03a9\5\u009eP\2\u03a9\177\3\2\2\2\u03aa\u03ae\5\u00be`\2\u03ab\u03ae"+
		"\7\65\2\2\u03ac\u03ae\5\u010c\u0087\2\u03ad\u03aa\3\2\2\2\u03ad\u03ab"+
		"\3\2\2\2\u03ad\u03ac\3\2\2\2\u03ae\u0081\3\2\2\2\u03af\u03b0\7T\2\2\u03b0"+
		"\u03b5\5\u0084C\2\u03b1\u03b2\7\u00d6\2\2\u03b2\u03b4\5\u0084C\2\u03b3"+
		"\u03b1\3\2\2\2\u03b4\u03b7\3\2\2\2\u03b5\u03b3\3\2\2\2\u03b5\u03b6\3\2"+
		"\2\2\u03b6\u03b8\3\2\2\2\u03b7\u03b5\3\2\2\2\u03b8\u03b9\7\u00d8\2\2\u03b9"+
		"\u0083\3\2\2\2\u03ba\u03c3\7\u00dc\2\2\u03bb\u03bc\7\u00cd\2\2\u03bc\u03c3"+
		"\5\u00e8u\2\u03bd\u03be\7\u00cd\2\2\u03be\u03bf\7\u00d4\2\2\u03bf\u03c0"+
		"\5\u00a8U\2\u03c0\u03c1\7\u00d5\2\2\u03c1\u03c3\3\2\2\2\u03c2\u03ba\3"+
		"\2\2\2\u03c2\u03bb\3\2\2\2\u03c2\u03bd\3\2\2\2\u03c3\u0085\3\2\2\2\u03c4"+
		"\u03c5\7A\2\2\u03c5\u03c6\5\u00a4S\2\u03c6\u03c7\7\u00d8\2\2\u03c7\u0087"+
		"\3\2\2\2\u03c8\u03c9\7u\2\2\u03c9\u03ce\5\u009eP\2\u03ca\u03cb\7\u00d6"+
		"\2\2\u03cb\u03cd\5\u009eP\2\u03cc\u03ca\3\2\2\2\u03cd\u03d0\3\2\2\2\u03ce"+
		"\u03cc\3\2\2\2\u03ce\u03cf\3\2\2\2\u03cf\u03d1\3\2\2\2\u03d0\u03ce\3\2"+
		"\2\2\u03d1\u03d2\7\u00d8\2\2\u03d2\u0089\3\2\2\2\u03d3\u03d4\5\60\31\2"+
		"\u03d4\u03d6\5\u009aN\2\u03d5\u03d7\5\u0080A\2\u03d6\u03d5\3\2\2\2\u03d6"+
		"\u03d7\3\2\2\2\u03d7\u03d8\3\2\2\2\u03d8\u03dd\5\u009eP\2\u03d9\u03da"+
		"\7\u00d6\2\2\u03da\u03dc\5\u009eP\2\u03db\u03d9\3\2\2\2\u03dc\u03df\3"+
		"\2\2\2\u03dd\u03db\3\2\2\2\u03dd\u03de\3\2\2\2\u03de\u03e0\3\2\2\2\u03df"+
		"\u03dd\3\2\2\2\u03e0\u03e1\7\u00d8\2\2\u03e1\u040d\3\2\2\2\u03e2\u03e4"+
		"\5\60\31\2\u03e3\u03e5\5\u009cO\2\u03e4\u03e3\3\2\2\2\u03e4\u03e5\3\2"+
		"\2\2\u03e5\u03e6\3\2\2\2\u03e6\u03e8\7:\2\2\u03e7\u03e9\5\u0080A\2\u03e8"+
		"\u03e7\3\2\2\2\u03e8\u03e9\3\2\2\2\u03e9\u03ea\3\2\2\2\u03ea\u03ef\5\u00a0"+
		"Q\2\u03eb\u03ec\7\u00d6\2\2\u03ec\u03ee\5\u00a0Q\2\u03ed\u03eb\3\2\2\2"+
		"\u03ee\u03f1\3\2\2\2\u03ef\u03ed\3\2\2\2\u03ef\u03f0\3\2\2\2\u03f0\u03f2"+
		"\3\2\2\2\u03f1\u03ef\3\2\2\2\u03f2\u03f3\7\u00d8\2\2\u03f3\u040d\3\2\2"+
		"\2\u03f4\u03f6\5\60\31\2\u03f5\u03f7\5\u009cO\2\u03f6\u03f5\3\2\2\2\u03f6"+
		"\u03f7\3\2\2\2\u03f7\u03f8\3\2\2\2\u03f8\u03fa\7S\2\2\u03f9\u03fb\7\u00c2"+
		"\2\2\u03fa\u03f9\3\2\2\2\u03fa\u03fb\3\2\2\2\u03fb\u03fc\3\2\2\2\u03fc"+
		"\u03fe\5\u0104\u0083\2\u03fd\u03ff\5$\23\2\u03fe\u03fd\3\2\2\2\u03fe\u03ff"+
		"\3\2\2\2\u03ff\u0400\3\2\2\2\u0400\u0401\7\u00d0\2\2\u0401\u0402\5|?\2"+
		"\u0402\u0404\7\u00d1\2\2\u0403\u0405\5\u0096L\2\u0404\u0403\3\2\2\2\u0404"+
		"\u0405\3\2\2\2\u0405\u0406\3\2\2\2\u0406\u0407\5\u0098M\2\u0407\u040d"+
		"\3\2\2\2\u0408\u0409\7\177\2\2\u0409\u040a\5\u00ccg\2\u040a\u040b\5\u008c"+
		"G\2\u040b\u040d\3\2\2\2\u040c\u03d3\3\2\2\2\u040c\u03e2\3\2\2\2\u040c"+
		"\u03f4\3\2\2\2\u040c\u0408\3\2\2\2\u040d\u008b\3\2\2\2\u040e\u0418\7\u00d8"+
		"\2\2\u040f\u0413\7\u00d4\2\2\u0410\u0412\5\u008eH\2\u0411\u0410\3\2\2"+
		"\2\u0412\u0415\3\2\2\2\u0413\u0411\3\2\2\2\u0413\u0414\3\2\2\2\u0414\u0416"+
		"\3\2\2\2\u0415\u0413\3\2\2\2\u0416\u0418\7\u00d5\2\2\u0417\u040e\3\2\2"+
		"\2\u0417\u040f\3\2\2\2\u0418\u008d\3\2\2\2\u0419\u041c\5\u0090I\2\u041a"+
		"\u041c\5\u0092J\2\u041b\u0419\3\2\2\2\u041b\u041a\3\2\2\2\u041c\u008f"+
		"\3\2\2\2\u041d\u041e\5\u00c6d\2\u041e\u041f\7\u00bc\2\2\u041f\u0420\5"+
		"\u0104\u0083\2\u0420\u0421\7\\\2\2\u0421\u0422\5\u00ccg\2\u0422\u0423"+
		"\7\u00d8\2\2\u0423\u0091\3\2\2\2\u0424\u0425\5\u0094K\2\u0425\u042b\7"+
		"\60\2\2\u0426\u042c\5\u0106\u0084\2\u0427\u0429\5\u0106\u0084\2\u0428"+
		"\u0427\3\2\2\2\u0428\u0429\3\2\2\2\u0429\u042a\3\2\2\2\u042a\u042c\5\u0104"+
		"\u0083\2\u042b\u0426\3\2\2\2\u042b\u0428\3\2\2\2\u042c\u042d\3\2\2\2\u042d"+
		"\u042e\7\u00d8\2\2\u042e\u0093\3\2\2\2\u042f\u0430\5\u00c6d\2\u0430\u0431"+
		"\7\u00bc\2\2\u0431\u0433\3\2\2\2\u0432\u042f\3\2\2\2\u0432\u0433\3\2\2"+
		"\2\u0433\u0434\3\2\2\2\u0434\u0435\5\u0104\u0083\2\u0435\u0095\3\2\2\2"+
		"\u0436\u0437\7\u00d7\2\2\u0437\u0439\5\u0104\u0083\2\u0438\u043a\5\u00ce"+
		"h\2\u0439\u0438\3\2\2\2\u0439\u043a\3\2\2\2\u043a\u0097\3\2\2\2\u043b"+
		"\u043e\7\u00d8\2\2\u043c\u043e\5D#\2\u043d\u043b\3\2\2\2\u043d\u043c\3"+
		"\2\2\2\u043e\u0099\3\2\2\2\u043f\u0442\5\u009cO\2\u0440\u0442\7\u0080"+
		"\2\2\u0441\u043f\3\2\2\2\u0441\u0440\3\2\2\2\u0442\u009b\3\2\2\2\u0443"+
		"\u0445\5\u0106\u0084\2\u0444\u0443\3\2\2\2\u0445\u0446\3\2\2\2\u0446\u0444"+
		"\3\2\2\2\u0446\u0447\3\2\2\2\u0447\u009d\3\2\2\2\u0448\u044b\7\u00dc\2"+
		"\2\u0449\u044a\7\u00d9\2\2\u044a\u044c\5\u00d2j\2\u044b\u0449\3\2\2\2"+
		"\u044b\u044c\3\2\2\2\u044c\u009f\3\2\2\2\u044d\u044e\5\u0104\u0083\2\u044e"+
		"\u044f\7\u00d9\2\2\u044f\u0450\5\u00d2j\2\u0450\u00a1\3\2\2\2\u0451\u0452"+
		"\5\60\31\2\u0452\u0453\7:\2\2\u0453\u0458\5\u00a0Q\2\u0454\u0455\7\u00d6"+
		"\2\2\u0455\u0457\5\u00a0Q\2\u0456\u0454\3\2\2\2\u0457\u045a\3\2\2\2\u0458"+
		"\u0456\3\2\2\2\u0458\u0459\3\2\2\2\u0459\u045b\3\2\2\2\u045a\u0458\3\2"+
		"\2\2\u045b\u045c\7\u00d8\2\2\u045c\u00a3\3\2\2\2\u045d\u0462\5\u00a8U"+
		"\2\u045e\u045f\7\u00d6\2\2\u045f\u0461\5\u00a8U\2\u0460\u045e\3\2\2\2"+
		"\u0461\u0464\3\2\2\2\u0462\u0460\3\2\2\2\u0462\u0463\3\2\2\2\u0463\u00a5"+
		"\3\2\2\2\u0464\u0462\3\2\2\2\u0465\u0468\7\u00d0\2\2\u0466\u0469\5\u00a8"+
		"U\2\u0467\u0469\5\u00b4[\2\u0468\u0466\3\2\2\2\u0468\u0467\3\2\2\2\u0469"+
		"\u046a\3\2\2\2\u046a\u046b\7\u00d1\2\2\u046b\u00a7\3\2\2\2\u046c\u046d"+
		"\bU\1\2\u046d\u046e\79\2\2\u046e\u04ba\5\u00a8U/\u046f\u04ba\5\u00b0Y"+
		"\2\u0470\u0471\5\u00e0q\2\u0471\u0472\7\u00d2\2\2\u0472\u0473\5\u00a8"+
		"U\2\u0473\u0474\7\u00d3\2\2\u0474\u04ba\3\2\2\2\u0475\u0476\7\u00d0\2"+
		"\2\u0476\u0477\5\u010e\u0088\2\u0477\u0478\7\u00d1\2\2\u0478\u0479\5\u00a8"+
		"U,\u0479\u04ba\3\2\2\2\u047a\u047b\t\5\2\2\u047b\u04ba\5\u00a8U+\u047c"+
		"\u047d\t\6\2\2\u047d\u04ba\5\u00a8U*\u047e\u047f\t\7\2\2\u047f\u04ba\5"+
		"\u00e8u\2\u0480\u0481\5\u00e8u\2\u0481\u0482\t\7\2\2\u0482\u04ba\3\2\2"+
		"\2\u0483\u0484\7m\2\2\u0484\u04ba\5\u00a8U\'\u0485\u04ba\5\u00e8u\2\u0486"+
		"\u04ba\5\u00d8m\2\u0487\u04ba\5\u00e2r\2\u0488\u04ba\7\u00dd\2\2\u0489"+
		"\u04ba\7\u00e3\2\2\u048a\u04ba\5\u00a6T\2\u048b\u04ba\5\u00acW\2\u048c"+
		"\u04ba\7\u0082\2\2\u048d\u048e\7c\2\2\u048e\u048f\7\u00d0\2\2\u048f\u0490"+
		"\5\u00fe\u0080\2\u0490\u0491\7\u00d1\2\2\u0491\u0492\7\u00d9\2\2\u0492"+
		"\u0493\5\u00a8U\36\u0493\u04ba\3\2\2\2\u0494\u0495\7b\2\2\u0495\u0496"+
		"\7\u00d0\2\2\u0496\u0497\5\u00e6t\2\u0497\u0498\7\u00d1\2\2\u0498\u04ba"+
		"\3\2\2\2\u0499\u049a\7D\2\2\u049a\u049b\7\u00d0\2\2\u049b\u049c\5\u00e8"+
		"u\2\u049c\u049d\7\u00d1\2\2\u049d\u04ba\3\2\2\2\u049e\u049f\7K\2\2\u049f"+
		"\u04a0\7\u00d0\2\2\u04a0\u04a1\5\u00a8U\2\u04a1\u04a2\7\u00d1\2\2\u04a2"+
		"\u04ba\3\2\2\2\u04a3\u04a7\7L\2\2\u04a4\u04a5\7\u00d0\2\2\u04a5\u04a8"+
		"\7\u00d1\2\2\u04a6\u04a8\5\u00a6T\2\u04a7\u04a4\3\2\2\2\u04a7\u04a6\3"+
		"\2\2\2\u04a7\u04a8\3\2\2\2\u04a8\u04ba\3\2\2\2\u04a9\u04aa\t\b\2\2\u04aa"+
		"\u04ba\5\u00a8U\31\u04ab\u04ac\t\t\2\2\u04ac\u04ba\5\u00a8U\30\u04ad\u04ba"+
		"\5\u00aeX\2\u04ae\u04af\5\u00aaV\2\u04af\u04b0\5\u00b2Z\2\u04b0\u04b1"+
		"\5\u00a8U\7\u04b1\u04ba\3\2\2\2\u04b2\u04b3\5\u00aaV\2\u04b3\u04b4\7\u00d9"+
		"\2\2\u04b4\u04b7\7\u00c2\2\2\u04b5\u04b8\5\u00e8u\2\u04b6\u04b8\5\u00b0"+
		"Y\2\u04b7\u04b5\3\2\2\2\u04b7\u04b6\3\2\2\2\u04b8\u04ba\3\2\2\2\u04b9"+
		"\u046c\3\2\2\2\u04b9\u046f\3\2\2\2\u04b9\u0470\3\2\2\2\u04b9\u0475\3\2"+
		"\2\2\u04b9\u047a\3\2\2\2\u04b9\u047c\3\2\2\2\u04b9\u047e\3\2\2\2\u04b9"+
		"\u0480\3\2\2\2\u04b9\u0483\3\2\2\2\u04b9\u0485\3\2\2\2\u04b9\u0486\3\2"+
		"\2\2\u04b9\u0487\3\2\2\2\u04b9\u0488\3\2\2\2\u04b9\u0489\3\2\2\2\u04b9"+
		"\u048a\3\2\2\2\u04b9\u048b\3\2\2\2\u04b9\u048c\3\2\2\2\u04b9\u048d\3\2"+
		"\2\2\u04b9\u0494\3\2\2\2\u04b9\u0499\3\2\2\2\u04b9\u049e\3\2\2\2\u04b9"+
		"\u04a3\3\2\2\2\u04b9\u04a9\3\2\2\2\u04b9\u04ab\3\2\2\2\u04b9\u04ad\3\2"+
		"\2\2\u04b9\u04ae\3\2\2\2\u04b9\u04b2\3\2\2\2\u04ba\u04f7\3\2\2\2\u04bb"+
		"\u04bc\f\26\2\2\u04bc\u04bd\7\u00ac\2\2\u04bd\u04f6\5\u00a8U\26\u04be"+
		"\u04bf\f\24\2\2\u04bf\u04c0\t\n\2\2\u04c0\u04f6\5\u00a8U\25\u04c1\u04c2"+
		"\f\23\2\2\u04c2\u04c3\t\13\2\2\u04c3\u04f6\5\u00a8U\24\u04c4\u04c5\f\22"+
		"\2\2\u04c5\u04c6\t\f\2\2\u04c6\u04f6\5\u00a8U\23\u04c7\u04c8\f\21\2\2"+
		"\u04c8\u04c9\t\r\2\2\u04c9\u04f6\5\u00a8U\22\u04ca\u04cb\f\20\2\2\u04cb"+
		"\u04cc\t\16\2\2\u04cc\u04f6\5\u00a8U\21\u04cd\u04ce\f\17\2\2\u04ce\u04cf"+
		"\7\u00c2\2\2\u04cf\u04f6\5\u00a8U\20\u04d0\u04d1\f\16\2\2\u04d1\u04d2"+
		"\7\u00c5\2\2\u04d2\u04f6\5\u00a8U\17\u04d3\u04d4\f\r\2\2\u04d4\u04d5\7"+
		"\u00c3\2\2\u04d5\u04f6\5\u00a8U\16\u04d6\u04d7\f\f\2\2\u04d7\u04d8\7\u00b7"+
		"\2\2\u04d8\u04f6\5\u00a8U\r\u04d9\u04da\f\13\2\2\u04da\u04db\7\u00b6\2"+
		"\2\u04db\u04f6\5\u00a8U\f\u04dc\u04dd\f\n\2\2\u04dd\u04df\7\u00cf\2\2"+
		"\u04de\u04e0\5\u00a8U\2\u04df\u04de\3\2\2\2\u04df\u04e0\3\2\2\2\u04e0"+
		"\u04e1\3\2\2\2\u04e1\u04e2\7\u00d7\2\2\u04e2\u04f6\5\u00a8U\13\u04e3\u04e4"+
		"\f\t\2\2\u04e4\u04e5\7\u00b8\2\2\u04e5\u04f6\5\u00a8U\n\u04e6\u04e7\f"+
		"\b\2\2\u04e7\u04e8\7\u009d\2\2\u04e8\u04f6\5\u00a8U\t\u04e9\u04ea\f\5"+
		"\2\2\u04ea\u04eb\7d\2\2\u04eb\u04f6\5\u00a8U\6\u04ec\u04ed\f\4\2\2\u04ed"+
		"\u04ee\7f\2\2\u04ee\u04f6\5\u00a8U\5\u04ef\u04f0\f\3\2\2\u04f0\u04f1\7"+
		"e\2\2\u04f1\u04f6\5\u00a8U\4\u04f2\u04f3\f\25\2\2\u04f3\u04f4\7[\2\2\u04f4"+
		"\u04f6\5\u00c0a\2\u04f5\u04bb\3\2\2\2\u04f5\u04be\3\2\2\2\u04f5\u04c1"+
		"\3\2\2\2\u04f5\u04c4\3\2\2\2\u04f5\u04c7\3\2\2\2\u04f5\u04ca\3\2\2\2\u04f5"+
		"\u04cd\3\2\2\2\u04f5\u04d0\3\2\2\2\u04f5\u04d3\3\2\2\2\u04f5\u04d6\3\2"+
		"\2\2\u04f5\u04d9\3\2\2\2\u04f5\u04dc\3\2\2\2\u04f5\u04e3\3\2\2\2\u04f5"+
		"\u04e6\3\2\2\2\u04f5\u04e9\3\2\2\2\u04f5\u04ec\3\2\2\2\u04f5\u04ef\3\2"+
		"\2\2\u04f5\u04f2\3\2\2\2\u04f6\u04f9\3\2\2\2\u04f7\u04f5\3\2\2\2\u04f7"+
		"\u04f8\3\2\2\2\u04f8\u00a9\3\2\2\2\u04f9\u04f7\3\2\2\2\u04fa\u04fd\5\u00e8"+
		"u\2\u04fb\u04fd\5\u00acW\2\u04fc\u04fa\3\2\2\2\u04fc\u04fb\3\2\2\2\u04fd"+
		"\u00ab\3\2\2\2\u04fe\u04ff\7/\2\2\u04ff\u0501\7\u00d0\2\2\u0500\u0502"+
		"\5\u00b6\\\2\u0501\u0500\3\2\2\2\u0501\u0502\3\2\2\2\u0502\u0503\3\2\2"+
		"\2\u0503\u050a\7\u00d1\2\2\u0504\u0506\7\u00d2\2\2\u0505\u0507\5\u00b6"+
		"\\\2\u0506\u0505\3\2\2\2\u0506\u0507\3\2\2\2\u0507\u0508\3\2\2\2\u0508"+
		"\u050a\7\u00d3\2\2\u0509\u04fe\3\2\2\2\u0509\u0504\3\2\2\2\u050a\u050f"+
		"\3\2\2\2\u050b\u050c\7\u00d2\2\2\u050c\u050d\5\u00a8U\2\u050d\u050e\7"+
		"\u00d3\2\2\u050e\u0510\3\2\2\2\u050f\u050b\3\2\2\2\u050f\u0510\3\2\2\2"+
		"\u0510\u00ad\3\2\2\2\u0511\u0513\7u\2\2\u0512\u0511\3\2\2\2\u0512\u0513"+
		"\3\2\2\2\u0513\u0514\3\2\2\2\u0514\u0516\7S\2\2\u0515\u0517\7\u00c2\2"+
		"\2\u0516\u0515\3\2\2\2\u0516\u0517\3\2\2\2\u0517\u0518\3\2\2\2\u0518\u0519"+
		"\7\u00d0\2\2\u0519\u051a\5|?\2\u051a\u051c\7\u00d1\2\2\u051b\u051d\5\u00ba"+
		"^\2\u051c\u051b\3\2\2\2\u051c\u051d\3\2\2\2\u051d\u0520\3\2\2\2\u051e"+
		"\u051f\7\u00d7\2\2\u051f\u0521\5\u0080A\2\u0520\u051e\3\2\2\2\u0520\u0521"+
		"\3\2\2\2\u0521\u0522\3\2\2\2\u0522\u0523\5D#\2\u0523\u052c\3\2\2\2\u0524"+
		"\u0525\7\u0084\2\2\u0525\u0526\7\u00d0\2\2\u0526\u0527\5|?\2\u0527\u0528"+
		"\7\u00d1\2\2\u0528\u0529\7\u00a0\2\2\u0529\u052a\5\u00a8U\2\u052a\u052c"+
		"\3\2\2\2\u052b\u0512\3\2\2\2\u052b\u0524\3\2\2\2\u052c\u00af\3\2\2\2\u052d"+
		"\u052e\7h\2\2\u052e\u0530\5\u00c0a\2\u052f\u0531\5\u00ceh\2\u0530\u052f"+
		"\3\2\2\2\u0530\u0531\3\2\2\2\u0531\u00b1\3\2\2\2\u0532\u0533\t\17\2\2"+
		"\u0533\u00b3\3\2\2\2\u0534\u053c\7\u0082\2\2\u0535\u0538\5\u00a8U\2\u0536"+
		"\u0537\7\u00a0\2\2\u0537\u0539\5\u00a8U\2\u0538\u0536\3\2\2\2\u0538\u0539"+
		"\3\2\2\2\u0539\u053d\3\2\2\2\u053a\u053b\7\u0083\2\2\u053b\u053d\5\u00a8"+
		"U\2\u053c\u0535\3\2\2\2\u053c\u053a\3\2\2\2\u053d\u00b5\3\2\2\2\u053e"+
		"\u0543\5\u00b8]\2\u053f\u0540\7\u00d6\2\2\u0540\u0542\5\u00b8]\2\u0541"+
		"\u053f\3\2\2\2\u0542\u0545\3\2\2\2\u0543\u0541\3\2\2\2\u0543\u0544\3\2"+
		"\2\2\u0544\u0547\3\2\2\2\u0545\u0543\3\2\2\2\u0546\u0548\7\u00d6\2\2\u0547"+
		"\u0546\3\2\2\2\u0547\u0548\3\2\2\2\u0548\u00b7\3\2\2\2\u0549\u054c\5\u00a8"+
		"U\2\u054a\u054b\7\u00a0\2\2\u054b\u054d\5\u00a8U\2\u054c\u054a\3\2\2\2"+
		"\u054c\u054d\3\2\2\2\u054d\u0556\3\2\2\2\u054e\u054f\5\u00a8U\2\u054f"+
		"\u0550\7\u00a0\2\2\u0550\u0552\3\2\2\2\u0551\u054e\3\2\2\2\u0551\u0552"+
		"\3\2\2\2\u0552\u0553\3\2\2\2\u0553\u0554\7\u00c2\2\2\u0554\u0556\5\u00e8"+
		"u\2\u0555\u0549\3\2\2\2\u0555\u0551\3\2\2\2\u0556\u00b9\3\2\2\2\u0557"+
		"\u0558\7\177\2\2\u0558\u0559\7\u00d0\2\2\u0559\u055e\5\u00bc_\2\u055a"+
		"\u055b\7\u00d6\2\2\u055b\u055d\5\u00bc_\2\u055c\u055a\3\2\2\2\u055d\u0560"+
		"\3\2\2\2\u055e\u055c\3\2\2\2\u055e\u055f\3\2\2\2\u055f\u0561\3\2\2\2\u0560"+
		"\u055e\3\2\2\2\u0561\u0562\7\u00d1\2\2\u0562\u00bb\3\2\2\2\u0563\u0565"+
		"\7\u00c2\2\2\u0564\u0563\3\2\2\2\u0564\u0565\3\2\2\2\u0565\u0566\3\2\2"+
		"\2\u0566\u0567\7\u00dc\2\2\u0567\u00bd\3\2\2\2\u0568\u056a\5\u00c6d\2"+
		"\u0569\u056b\5.\30\2\u056a\u0569\3\2\2\2\u056a\u056b\3\2\2\2\u056b\u056e"+
		"\3\2\2\2\u056c\u056e\7u\2\2\u056d\u0568\3\2\2\2\u056d\u056c\3\2\2\2\u056e"+
		"\u00bf\3\2\2\2\u056f\u0572\5\u00c6d\2\u0570\u0572\5\u00c4c\2\u0571\u056f"+
		"\3\2\2\2\u0571\u0570\3\2\2\2\u0572\u0574\3\2\2\2\u0573\u0575\5.\30\2\u0574"+
		"\u0573\3\2\2\2\u0574\u0575\3\2\2\2\u0575\u057a\3\2\2\2\u0576\u057a\5\u010c"+
		"\u0087\2\u0577\u057a\7u\2\2\u0578\u057a\5\u00c2b\2\u0579\u0571\3\2\2\2"+
		"\u0579\u0576\3\2\2\2\u0579\u0577\3\2\2\2\u0579\u0578\3\2\2\2\u057a\u00c1"+
		"\3\2\2\2\u057b\u057d\5\60\31\2\u057c\u057e\7n\2\2\u057d\u057c\3\2\2\2"+
		"\u057d\u057e\3\2\2\2\u057e\u0580\3\2\2\2\u057f\u0581\5\u0102\u0082\2\u0580"+
		"\u057f\3\2\2\2\u0580\u0581\3\2\2\2\u0581\u0583\3\2\2\2\u0582\u0584\7l"+
		"\2\2\u0583\u0582\3\2\2\2\u0583\u0584\3\2\2\2\u0584\u059a\3\2\2\2\u0585"+
		"\u0587\5 \21\2\u0586\u0588\5$\23\2\u0587\u0586\3\2\2\2\u0587\u0588\3\2"+
		"\2\2\u0588\u058b\3\2\2\2\u0589\u058a\7M\2\2\u058a\u058c\5\u00be`\2\u058b"+
		"\u0589\3\2\2\2\u058b\u058c\3\2\2\2\u058c\u058f\3\2\2\2\u058d\u058e\7W"+
		"\2\2\u058e\u0590\5\"\22\2\u058f\u058d\3\2\2\2\u058f\u0590\3\2\2\2\u0590"+
		"\u059b\3\2\2\2\u0591\u0592\7a\2\2\u0592\u0594\5\u0104\u0083\2\u0593\u0595"+
		"\5$\23\2\u0594\u0593\3\2\2\2\u0594\u0595\3\2\2\2\u0595\u0598\3\2\2\2\u0596"+
		"\u0597\7M\2\2\u0597\u0599\5\"\22\2\u0598\u0596\3\2\2\2\u0598\u0599\3\2"+
		"\2\2\u0599\u059b\3\2\2\2\u059a\u0585\3\2\2\2\u059a\u0591\3\2\2\2\u059b"+
		"\u059c\3\2\2\2\u059c\u05a0\7\u00d4\2\2\u059d\u059f\5\u008aF\2\u059e\u059d"+
		"\3\2\2\2\u059f\u05a2\3\2\2\2\u05a0\u059e\3\2\2\2\u05a0\u05a1\3\2\2\2\u05a1"+
		"\u05a3\3\2\2\2\u05a2\u05a0\3\2\2\2\u05a3\u05a4\7\u00d5\2\2\u05a4\u00c3"+
		"\3\2\2\2\u05a5\u05aa\5\u00f4{\2\u05a6\u05a7\7\u00bd\2\2\u05a7\u05a9\5"+
		"\u00f6|\2\u05a8\u05a6\3\2\2\2\u05a9\u05ac\3\2\2\2\u05aa\u05a8\3\2\2\2"+
		"\u05aa\u05ab\3\2\2\2\u05ab\u00c5\3\2\2\2\u05ac\u05aa\3\2\2\2\u05ad\u05af"+
		"\7g\2\2\u05ae\u05ad\3\2\2\2\u05ae\u05af\3\2\2\2\u05af\u05b1\3\2\2\2\u05b0"+
		"\u05b2\7\u00be\2\2\u05b1\u05b0\3\2\2\2\u05b1\u05b2\3\2\2\2\u05b2\u05b3"+
		"\3\2\2\2\u05b3\u05b4\5\u00c8e\2\u05b4\u00c7\3\2\2\2\u05b5\u05c3\5\u0104"+
		"\u0083\2\u05b6\u05bb\5\u0104\u0083\2\u05b7\u05b8\7\u00be\2\2\u05b8\u05ba"+
		"\5\u0104\u0083\2\u05b9\u05b7\3\2\2\2\u05ba\u05bd\3\2\2\2\u05bb\u05b9\3"+
		"\2\2\2\u05bb\u05bc\3\2\2\2\u05bc\u05c0\3\2\2\2\u05bd\u05bb\3\2\2\2\u05be"+
		"\u05bf\7\u00be\2\2\u05bf\u05c1\5\u00caf\2\u05c0\u05be\3\2\2\2\u05c0\u05c1"+
		"\3\2\2\2\u05c1\u05c3\3\2\2\2\u05c2\u05b5\3\2\2\2\u05c2\u05b6\3\2\2\2\u05c3"+
		"\u00c9\3\2\2\2\u05c4\u05c7\5\u0104\u0083\2\u05c5\u05c6\7\60\2\2\u05c6"+
		"\u05c8\5\u0104\u0083\2\u05c7\u05c5\3\2\2\2\u05c7\u05c8\3\2\2\2\u05c8\u05d8"+
		"\3\2\2\2\u05c9\u05ca\7\u00d4\2\2\u05ca\u05cf\5\u00caf\2\u05cb\u05cc\7"+
		"\u00d6\2\2\u05cc\u05ce\5\u00caf\2\u05cd\u05cb\3\2\2\2\u05ce\u05d1\3\2"+
		"\2\2\u05cf\u05cd\3\2\2\2\u05cf\u05d0\3\2\2\2\u05d0\u05d3\3\2\2\2\u05d1"+
		"\u05cf\3\2\2\2\u05d2\u05d4\7\u00d6\2\2\u05d3\u05d2\3\2\2\2\u05d3\u05d4"+
		"\3\2\2\2\u05d4\u05d5\3\2\2\2\u05d5\u05d6\7\u00d5\2\2\u05d6\u05d8\3\2\2"+
		"\2\u05d7\u05c4\3\2\2\2\u05d7\u05c9\3\2\2\2\u05d8\u00cb\3\2\2\2\u05d9\u05de"+
		"\5\u00c6d\2\u05da\u05db\7\u00d6\2\2\u05db\u05dd\5\u00c6d\2\u05dc\u05da"+
		"\3\2\2\2\u05dd\u05e0\3\2\2\2\u05de\u05dc\3\2\2\2\u05de\u05df\3\2\2\2\u05df"+
		"\u00cd\3\2\2\2\u05e0\u05de\3\2\2\2\u05e1\u05eb\7\u00d0\2\2\u05e2\u05e7"+
		"\5\u00d0i\2\u05e3\u05e4\7\u00d6\2\2\u05e4\u05e6\5\u00d0i\2\u05e5\u05e3"+
		"\3\2\2\2\u05e6\u05e9\3\2\2\2\u05e7\u05e5\3\2\2\2\u05e7\u05e8\3\2\2\2\u05e8"+
		"\u05ec\3\2\2\2\u05e9\u05e7\3\2\2\2\u05ea\u05ec\5\u00b4[\2\u05eb\u05e2"+
		"\3\2\2\2\u05eb\u05ea\3\2\2\2\u05eb\u05ec\3\2\2\2\u05ec\u05ee\3\2\2\2\u05ed"+
		"\u05ef\7\u00d6\2\2\u05ee\u05ed\3\2\2\2\u05ee\u05ef\3\2\2\2\u05ef\u05f0"+
		"\3\2\2\2\u05f0\u05f1\7\u00d1\2\2\u05f1\u00cf\3\2\2\2\u05f2\u05f4\7\u00bf"+
		"\2\2\u05f3\u05f2\3\2\2\2\u05f3\u05f4\3\2\2\2\u05f4\u05f5\3\2\2\2\u05f5"+
		"\u05f9\5\u00a8U\2\u05f6\u05f7\7\u00c2\2\2\u05f7\u05f9\5\u00e8u\2\u05f8"+
		"\u05f3\3\2\2\2\u05f8\u05f6\3\2\2\2\u05f9\u00d1\3\2\2\2\u05fa\u0610\5\u00d8"+
		"m\2\u05fb\u0610\5\u00e2r\2\u05fc\u05fd\7/\2\2\u05fd\u0602\7\u00d0\2\2"+
		"\u05fe\u0600\5\u00d4k\2\u05ff\u0601\7\u00d6\2\2\u0600\u05ff\3\2\2\2\u0600"+
		"\u0601\3\2\2\2\u0601\u0603\3\2\2\2\u0602\u05fe\3\2\2\2\u0602\u0603\3\2"+
		"\2\2\u0603\u0604\3\2\2\2\u0604\u0610\7\u00d1\2\2\u0605\u060a\7\u00d2\2"+
		"\2\u0606\u0608\5\u00d4k\2\u0607\u0609\7\u00d6\2\2\u0608\u0607\3\2\2\2"+
		"\u0608\u0609\3\2\2\2\u0609\u060b\3\2\2\2\u060a\u0606\3\2\2\2\u060a\u060b"+
		"\3\2\2\2\u060b\u060c\3\2\2\2\u060c\u0610\7\u00d3\2\2\u060d\u060e\t\20"+
		"\2\2\u060e\u0610\5\u00d2j\2\u060f\u05fa\3\2\2\2\u060f\u05fb\3\2\2\2\u060f"+
		"\u05fc\3\2\2\2\u060f\u0605\3\2\2\2\u060f\u060d\3\2\2\2\u0610\u00d3\3\2"+
		"\2\2\u0611\u0616\5\u00d6l\2\u0612\u0613\7\u00d6\2\2\u0613\u0615\5\u00d6"+
		"l\2\u0614\u0612\3\2\2\2\u0615\u0618\3\2\2\2\u0616\u0614\3\2\2\2\u0616"+
		"\u0617\3\2\2\2\u0617\u00d5\3\2\2\2\u0618\u0616\3\2\2\2\u0619\u061c\5\u00d2"+
		"j\2\u061a\u061b\7\u00a0\2\2\u061b\u061d\5\u00d2j\2\u061c\u061a\3\2\2\2"+
		"\u061c\u061d\3\2\2\2\u061d\u00d7\3\2\2\2\u061e\u0624\7i\2\2\u061f\u0624"+
		"\5\u00dan\2\u0620\u0624\5\u0108\u0085\2\u0621\u0624\5\u00dep\2\u0622\u0624"+
		"\5\u00c6d\2\u0623\u061e\3\2\2\2\u0623\u061f\3\2\2\2\u0623\u0620\3\2\2"+
		"\2\u0623\u0621\3\2\2\2\u0623\u0622\3\2\2\2\u0624\u00d9\3\2\2\2\u0625\u062a"+
		"\7\u00e0\2\2\u0626\u062a\7\63\2\2\u0627\u062a\5\u00dco\2\u0628\u062a\5"+
		"\u00e0q\2\u0629\u0625\3\2\2\2\u0629\u0626\3\2\2\2\u0629\u0627\3\2\2\2"+
		"\u0629\u0628\3\2\2\2\u062a\u00db\3\2\2\2\u062b\u062c\t\21\2\2\u062c\u00dd"+
		"\3\2\2\2\u062d\u062e\t\22\2\2\u062e\u0633\7\u00bc\2\2\u062f\u0634\5\u0104"+
		"\u0083\2\u0630\u0634\7\u0089\2\2\u0631\u0634\7\u0085\2\2\u0632\u0634\7"+
		"\u0086\2\2\u0633\u062f\3\2\2\2\u0633\u0630\3\2\2\2\u0633\u0631\3\2\2\2"+
		"\u0633\u0632\3\2\2\2\u0634\u0640\3\2\2\2\u0635\u0639\5\u00be`\2\u0636"+
		"\u0639\5\u00fa~\2\u0637\u0639\5\u00e2r\2\u0638\u0635\3\2\2\2\u0638\u0636"+
		"\3\2\2\2\u0638\u0637\3\2\2\2\u0639\u063a\3\2\2\2\u063a\u063d\7\u00bc\2"+
		"\2\u063b\u063e\5\u0104\u0083\2\u063c\u063e\5\u00fa~\2\u063d\u063b\3\2"+
		"\2\2\u063d\u063c\3\2\2\2\u063e\u0640\3\2\2\2\u063f\u062d\3\2\2\2\u063f"+
		"\u0638\3\2\2\2\u0640\u00df\3\2\2\2\u0641\u0642\7\u00dd\2\2\u0642\u00e1"+
		"\3\2\2\2\u0643\u0645\7\u00e7\2\2\u0644\u0646\7\u00ef\2\2\u0645\u0644\3"+
		"\2\2\2\u0646\u0647\3\2\2\2\u0647\u0645\3\2\2\2\u0647\u0648\3\2\2\2\u0648"+
		"\u0659\3\2\2\2\u0649\u064b\7\u00e6\2\2\u064a\u064c\7\u00ef\2\2\u064b\u064a"+
		"\3\2\2\2\u064c\u064d\3\2\2\2\u064d\u064b\3\2\2\2\u064d\u064e\3\2\2\2\u064e"+
		"\u0659\3\2\2\2\u064f\u0659\7\u00e4\2\2\u0650\u0654\7\u00e5\2\2\u0651\u0653"+
		"\5\u00e4s\2\u0652\u0651\3\2\2\2\u0653\u0656\3\2\2\2\u0654\u0652\3\2\2"+
		"\2\u0654\u0655\3\2\2\2\u0655\u0657\3\2\2\2\u0656\u0654\3\2\2\2\u0657\u0659"+
		"\7\u00e5\2\2\u0658\u0643\3\2\2\2\u0658\u0649\3\2\2\2\u0658\u064f\3\2\2"+
		"\2\u0658\u0650\3\2\2\2\u0659\u00e3\3\2\2\2\u065a\u065e\7\u00eb\2\2\u065b"+
		"\u065e\7\u00ea\2\2\u065c\u065e\5\u00e8u\2\u065d\u065a\3\2\2\2\u065d\u065b"+
		"\3\2\2\2\u065d\u065c\3\2\2\2\u065e\u00e5\3\2\2\2\u065f\u0664\5\u00e8u"+
		"\2\u0660\u0661\7\u00d6\2\2\u0661\u0663\5\u00e8u\2\u0662\u0660\3\2\2\2"+
		"\u0663\u0666\3\2\2\2\u0664\u0662\3\2\2\2\u0664\u0665\3\2\2\2\u0665\u00e7"+
		"\3\2\2\2\u0666\u0664\3\2\2\2\u0667\u066b\5\u00eav\2\u0668\u066a\5\u00ec"+
		"w\2\u0669\u0668\3\2\2\2\u066a\u066d\3\2\2\2\u066b\u0669\3\2\2\2\u066b"+
		"\u066c\3\2\2\2\u066c\u00e9\3\2\2\2\u066d\u066b\3\2\2\2\u066e\u0675\5\u00f4"+
		"{\2\u066f\u0675\5\u00eex\2\u0670\u0671\7\u00d0\2\2\u0671\u0672\5\u00b0"+
		"Y\2\u0672\u0673\7\u00d1\2\2\u0673\u0675\3\2\2\2\u0674\u066e\3\2\2\2\u0674"+
		"\u066f\3\2\2\2\u0674\u0670\3\2\2\2\u0675\u00eb\3\2\2\2\u0676\u0677\7\u00bd"+
		"\2\2\u0677\u0679\5\u00f6|\2\u0678\u067a\5\u00f2z\2\u0679\u0678\3\2\2\2"+
		"\u0679\u067a\3\2\2\2\u067a\u00ed\3\2\2\2\u067b\u067c\5\u00f0y\2\u067c"+
		"\u067d\5\u00f2z\2\u067d\u00ef\3\2\2\2\u067e\u0683\5\u00c6d\2\u067f\u0683"+
		"\5\u00dep\2\u0680\u0683\5\u00f4{\2\u0681\u0683\5\u00a6T\2\u0682\u067e"+
		"\3\2\2\2\u0682\u067f\3\2\2\2\u0682\u0680\3\2\2\2\u0682\u0681\3\2\2\2\u0683"+
		"\u00f1\3\2\2\2\u0684\u0686\5.\30\2\u0685\u0684\3\2\2\2\u0685\u0686\3\2"+
		"\2\2\u0686\u0687\3\2\2\2\u0687\u068b\5\u00ceh\2\u0688\u068a\5\u00fc\177"+
		"\2\u0689\u0688\3\2\2\2\u068a\u068d\3\2\2\2\u068b\u0689\3\2\2\2\u068b\u068c"+
		"\3\2\2\2\u068c\u00f3\3\2\2\2\u068d\u068b\3\2\2\2\u068e\u0691\5\u00fa~"+
		"\2\u068f\u0690\7\u00bc\2\2\u0690\u0692\5\u00fa~\2\u0691\u068f\3\2\2\2"+
		"\u0691\u0692\3\2\2\2\u0692\u0698\3\2\2\2\u0693\u0694\5\u00be`\2\u0694"+
		"\u0695\7\u00bc\2\2\u0695\u0696\5\u00fa~\2\u0696\u0698\3\2\2\2\u0697\u068e"+
		"\3\2\2\2\u0697\u0693\3\2\2\2\u0698\u00f5\3\2\2\2\u0699\u069c\5\u00f8}"+
		"\2\u069a\u069c\5\u00fa~\2\u069b\u0699\3\2\2\2\u069b\u069a\3\2\2\2\u069c"+
		"\u00f7\3\2\2\2\u069d\u06a3\5\u0104\u0083\2\u069e\u069f\7\u00d4\2\2\u069f"+
		"\u06a0\5\u00a8U\2\u06a0\u06a1\7\u00d5\2\2\u06a1\u06a3\3\2\2\2\u06a2\u069d"+
		"\3\2\2\2\u06a2\u069e\3\2\2\2\u06a3\u06a7\3\2\2\2\u06a4\u06a6\5\u00fc\177"+
		"\2\u06a5\u06a4\3\2\2\2\u06a6\u06a9\3\2\2\2\u06a7\u06a5\3\2\2\2\u06a7\u06a8"+
		"\3\2\2\2\u06a8\u00f9\3\2\2\2\u06a9\u06a7\3\2\2\2\u06aa\u06ac\7\u00cd\2"+
		"\2\u06ab\u06aa\3\2\2\2\u06ac\u06af\3\2\2\2\u06ad\u06ab\3\2\2\2\u06ad\u06ae"+
		"\3\2\2\2\u06ae\u06b6\3\2\2\2\u06af\u06ad\3\2\2\2\u06b0\u06b7\7\u00dc\2"+
		"\2\u06b1\u06b2\7\u00cd\2\2\u06b2\u06b3\7\u00d4\2\2\u06b3\u06b4\5\u00a8"+
		"U\2\u06b4\u06b5\7\u00d5\2\2\u06b5\u06b7\3\2\2\2\u06b6\u06b0\3\2\2\2\u06b6"+
		"\u06b1\3\2\2\2\u06b7\u06bb\3\2\2\2\u06b8\u06ba\5\u00fc\177\2\u06b9\u06b8"+
		"\3\2\2\2\u06ba\u06bd\3\2\2\2\u06bb\u06b9\3\2\2\2\u06bb\u06bc\3\2\2\2\u06bc"+
		"\u00fb\3\2\2\2\u06bd\u06bb\3\2\2\2\u06be\u06c0\7\u00d2\2\2\u06bf\u06c1"+
		"\5\u00a8U\2\u06c0\u06bf\3\2\2\2\u06c0\u06c1\3\2\2\2\u06c1\u06c2\3\2\2"+
		"\2\u06c2\u06c8\7\u00d3\2\2\u06c3\u06c4\7\u00d4\2\2\u06c4\u06c5\5\u00a8"+
		"U\2\u06c5\u06c6\7\u00d5\2\2\u06c6\u06c8\3\2\2\2\u06c7\u06be\3\2\2\2\u06c7"+
		"\u06c3\3\2\2\2\u06c8\u00fd\3\2\2\2\u06c9\u06cb\5\u0100\u0081\2\u06ca\u06c9"+
		"\3\2\2\2\u06ca\u06cb\3\2\2\2\u06cb\u06d2\3\2\2\2\u06cc\u06ce\7\u00d6\2"+
		"\2\u06cd\u06cf\5\u0100\u0081\2\u06ce\u06cd\3\2\2\2\u06ce\u06cf\3\2\2\2"+
		"\u06cf\u06d1\3\2\2\2\u06d0\u06cc\3\2\2\2\u06d1\u06d4\3\2\2\2\u06d2\u06d0"+
		"\3\2\2\2\u06d2\u06d3\3\2\2\2\u06d3\u00ff\3\2\2\2\u06d4\u06d2\3\2\2\2\u06d5"+
		"\u06dd\5\u00e8u\2\u06d6\u06d7\7c\2\2\u06d7\u06d8\7\u00d0\2\2\u06d8\u06d9"+
		"\5\u00fe\u0080\2\u06d9\u06da\7\u00d1\2\2\u06da\u06dd\3\2\2\2\u06db\u06dd"+
		"\5\u00b8]\2\u06dc\u06d5\3\2\2\2\u06dc\u06d6\3\2\2\2\u06dc\u06db\3\2\2"+
		"\2\u06dd\u0101\3\2\2\2\u06de\u06df\t\23\2\2\u06df\u0103\3\2\2\2\u06e0"+
		"\u06e1\t\24\2\2\u06e1\u0105\3\2\2\2\u06e2\u06e3\t\25\2\2\u06e3\u0107\3"+
		"\2\2\2\u06e4\u06e5\t\26\2\2\u06e5\u0109\3\2\2\2\u06e6\u06e7\t\27\2\2\u06e7"+
		"\u010b\3\2\2\2\u06e8\u06e9\t\30\2\2\u06e9\u010d\3\2\2\2\u06ea\u06eb\t"+
		"\31\2\2\u06eb\u010f\3\2\2\2\u06ec\u06ed\7(\2\2\u06ed\u06ee\5\36\20\2\u06ee"+
		"\u0111\3\2\2\2\u00d7\u0113\u0118\u0120\u0125\u013f\u0143\u0148\u014d\u0153"+
		"\u0161\u0165\u016b\u0170\u0175\u017c\u0182\u0189\u0190\u0195\u0199\u01a0"+
		"\u01a3\u01a9\u01ac\u01af\u01b4\u01b8\u01bc\u01c1\u01c5\u01c7\u01cd\u01d9"+
		"\u01ea\u01f1\u01f9\u0204\u020c\u0214\u021b\u0222\u0239\u0240\u0248\u0252"+
		"\u0258\u0275\u0283\u0287\u0290\u0294\u0299\u02b3\u02be\u02c2\u02c6\u02cf"+
		"\u02d9\u02de\u02e4\u02e9\u02ee\u02f3\u02f8\u02fe\u0304\u030a\u031c\u0321"+
		"\u0324\u032e\u0331\u033e\u0346\u034d\u0350\u0355\u0359\u0362\u037e\u0383"+
		"\u0387\u038e\u0392\u0398\u039d\u03a0\u03a3\u03a6\u03ad\u03b5\u03c2\u03ce"+
		"\u03d6\u03dd\u03e4\u03e8\u03ef\u03f6\u03fa\u03fe\u0404\u040c\u0413\u0417"+
		"\u041b\u0428\u042b\u0432\u0439\u043d\u0441\u0446\u044b\u0458\u0462\u0468"+
		"\u04a7\u04b7\u04b9\u04df\u04f5\u04f7\u04fc\u0501\u0506\u0509\u050f\u0512"+
		"\u0516\u051c\u0520\u052b\u0530\u0538\u053c\u0543\u0547\u054c\u0551\u0555"+
		"\u055e\u0564\u056a\u056d\u0571\u0574\u0579\u057d\u0580\u0583\u0587\u058b"+
		"\u058f\u0594\u0598\u059a\u05a0\u05aa\u05ae\u05b1\u05bb\u05c0\u05c2\u05c7"+
		"\u05cf\u05d3\u05d7\u05de\u05e7\u05eb\u05ee\u05f3\u05f8\u0600\u0602\u0608"+
		"\u060a\u060f\u0616\u061c\u0623\u0629\u0633\u0638\u063d\u063f\u0647\u064d"+
		"\u0654\u0658\u065d\u0664\u066b\u0674\u0679\u0682\u0685\u068b\u0691\u0697"+
		"\u069b\u06a2\u06a7\u06ad\u06b6\u06bb\u06c0\u06c7\u06ca\u06ce\u06d2\u06dc";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}