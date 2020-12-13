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
		RULE_primitiveType = 133, RULE_castOperation = 134, RULE_toDoc = 135, 
		RULE_funcToDoc = 136;
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
			"magicConstant", "magicMethod", "primitiveType", "castOperation", "toDoc", 
			"funcToDoc"
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
			setState(275);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Shebang) {
				{
				setState(274);
				match(Shebang);
				}
			}

			setState(280);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << HtmlText) | (1L << XmlStart) | (1L << HtmlScriptOpen) | (1L << HtmlStyleOpen) | (1L << HtmlDtd) | (1L << HtmlOpen) | (1L << HtmlClose) | (1L << HtmlSlashClose) | (1L << HtmlSlash) | (1L << HtmlEquals) | (1L << HtmlStartQuoteString) | (1L << HtmlStartDoubleQuoteString) | (1L << HtmlHex) | (1L << HtmlDecimal) | (1L << HtmlName) | (1L << HtmlEndQuoteString) | (1L << HtmlQuoteString) | (1L << HtmlEndDoubleQuoteString) | (1L << HtmlDoubleQuoteString) | (1L << ScriptText) | (1L << ScriptClose) | (1L << StyleBody) | (1L << Decorator) | (1L << Abstract) | (1L << Array) | (1L << As) | (1L << BinaryCast) | (1L << BoolType) | (1L << BooleanConstant) | (1L << Break) | (1L << Callable) | (1L << Case) | (1L << Catch) | (1L << Class) | (1L << Clone) | (1L << Const) | (1L << Continue) | (1L << Declare) | (1L << Default) | (1L << Do) | (1L << DoubleCast) | (1L << DoubleType) | (1L << Echo))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (Else - 64)) | (1L << (ElseIf - 64)) | (1L << (Empty - 64)) | (1L << (EndDeclare - 64)) | (1L << (EndFor - 64)) | (1L << (EndForeach - 64)) | (1L << (EndIf - 64)) | (1L << (EndSwitch - 64)) | (1L << (EndWhile - 64)) | (1L << (Eval - 64)) | (1L << (Exit - 64)) | (1L << (Extends - 64)) | (1L << (Final - 64)) | (1L << (Finally - 64)) | (1L << (FloatCast - 64)) | (1L << (For - 64)) | (1L << (Foreach - 64)) | (1L << (Function - 64)) | (1L << (Global - 64)) | (1L << (Goto - 64)) | (1L << (If - 64)) | (1L << (Implements - 64)) | (1L << (Import - 64)) | (1L << (Include - 64)) | (1L << (IncludeOnce - 64)) | (1L << (InstanceOf - 64)) | (1L << (InsteadOf - 64)) | (1L << (Int8Cast - 64)) | (1L << (Int16Cast - 64)) | (1L << (Int64Type - 64)) | (1L << (IntType - 64)) | (1L << (Interface - 64)) | (1L << (IsSet - 64)) | (1L << (List - 64)) | (1L << (LogicalAnd - 64)) | (1L << (LogicalOr - 64)) | (1L << (LogicalXor - 64)) | (1L << (Namespace - 64)) | (1L << (New - 64)) | (1L << (Null - 64)) | (1L << (ObjectType - 64)) | (1L << (Parent_ - 64)) | (1L << (Partial - 64)) | (1L << (Print - 64)) | (1L << (Private - 64)) | (1L << (Protected - 64)) | (1L << (Public - 64)) | (1L << (Require - 64)) | (1L << (RequireOnce - 64)) | (1L << (Resource - 64)) | (1L << (Return - 64)) | (1L << (Static - 64)) | (1L << (StringType - 64)) | (1L << (Switch - 64)) | (1L << (Throw - 64)) | (1L << (Trait - 64)) | (1L << (Try - 64)) | (1L << (Typeof - 64)) | (1L << (UintCast - 64)) | (1L << (UnicodeCast - 64)) | (1L << (Unset - 64)) | (1L << (Use - 64)) | (1L << (Var - 64)) | (1L << (While - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (Yield - 128)) | (1L << (From - 128)) | (1L << (LambdaFn - 128)) | (1L << (Get - 128)) | (1L << (Set - 128)) | (1L << (Call - 128)) | (1L << (CallStatic - 128)) | (1L << (Constructor - 128)) | (1L << (Destruct - 128)) | (1L << (Wakeup - 128)) | (1L << (Sleep - 128)) | (1L << (Autoload - 128)) | (1L << (IsSet__ - 128)) | (1L << (Unset__ - 128)) | (1L << (ToString__ - 128)) | (1L << (Invoke - 128)) | (1L << (SetState - 128)) | (1L << (Clone__ - 128)) | (1L << (DebugInfo - 128)) | (1L << (Namespace__ - 128)) | (1L << (Class__ - 128)) | (1L << (Traic__ - 128)) | (1L << (Function__ - 128)) | (1L << (Method__ - 128)) | (1L << (Line__ - 128)) | (1L << (File__ - 128)) | (1L << (Dir__ - 128)) | (1L << (Inc - 128)) | (1L << (Dec - 128)) | (1L << (NamespaceSeparator - 128)))) != 0) || ((((_la - 194)) & ~0x3f) == 0 && ((1L << (_la - 194)) & ((1L << (Bang - 194)) | (1L << (Plus - 194)) | (1L << (Minus - 194)) | (1L << (Tilde - 194)) | (1L << (SuppressWarnings - 194)) | (1L << (Dollar - 194)) | (1L << (OpenRoundBracket - 194)) | (1L << (OpenSquareBracket - 194)) | (1L << (OpenCurlyBracket - 194)) | (1L << (SemiColon - 194)) | (1L << (VarName - 194)) | (1L << (Label - 194)) | (1L << (Octal - 194)) | (1L << (Decimal - 194)) | (1L << (Real - 194)) | (1L << (Hex - 194)) | (1L << (Binary - 194)) | (1L << (BackQuoteString - 194)) | (1L << (SingleQuoteString - 194)) | (1L << (DoubleQuote - 194)) | (1L << (StartNowDoc - 194)) | (1L << (StartHereDoc - 194)))) != 0)) {
				{
				{
				setState(277);
				htmlElementOrPhpBlock();
				}
				}
				setState(282);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(283);
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
			setState(288);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(285);
				htmlElements();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(286);
				phpBlock();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(287);
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
			setState(291); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(290);
					htmlElement();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(293); 
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
			setState(323);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case HtmlDtd:
				enterOuterAlt(_localctx, 1);
				{
				setState(295);
				match(HtmlDtd);
				}
				break;
			case HtmlScriptOpen:
				enterOuterAlt(_localctx, 2);
				{
				setState(296);
				match(HtmlScriptOpen);
				}
				break;
			case HtmlClose:
				enterOuterAlt(_localctx, 3);
				{
				setState(297);
				match(HtmlClose);
				}
				break;
			case HtmlStyleOpen:
				enterOuterAlt(_localctx, 4);
				{
				setState(298);
				match(HtmlStyleOpen);
				}
				break;
			case HtmlOpen:
				enterOuterAlt(_localctx, 5);
				{
				setState(299);
				match(HtmlOpen);
				}
				break;
			case HtmlName:
				enterOuterAlt(_localctx, 6);
				{
				setState(300);
				match(HtmlName);
				}
				break;
			case HtmlSlashClose:
				enterOuterAlt(_localctx, 7);
				{
				setState(301);
				match(HtmlSlashClose);
				}
				break;
			case HtmlSlash:
				enterOuterAlt(_localctx, 8);
				{
				setState(302);
				match(HtmlSlash);
				}
				break;
			case HtmlText:
				enterOuterAlt(_localctx, 9);
				{
				setState(303);
				match(HtmlText);
				}
				break;
			case HtmlEquals:
				enterOuterAlt(_localctx, 10);
				{
				setState(304);
				match(HtmlEquals);
				}
				break;
			case HtmlStartQuoteString:
				enterOuterAlt(_localctx, 11);
				{
				setState(305);
				match(HtmlStartQuoteString);
				}
				break;
			case HtmlEndQuoteString:
				enterOuterAlt(_localctx, 12);
				{
				setState(306);
				match(HtmlEndQuoteString);
				}
				break;
			case HtmlStartDoubleQuoteString:
				enterOuterAlt(_localctx, 13);
				{
				setState(307);
				match(HtmlStartDoubleQuoteString);
				}
				break;
			case HtmlEndDoubleQuoteString:
				enterOuterAlt(_localctx, 14);
				{
				setState(308);
				match(HtmlEndDoubleQuoteString);
				}
				break;
			case HtmlHex:
				enterOuterAlt(_localctx, 15);
				{
				setState(309);
				match(HtmlHex);
				}
				break;
			case HtmlDecimal:
				enterOuterAlt(_localctx, 16);
				{
				setState(310);
				match(HtmlDecimal);
				}
				break;
			case HtmlQuoteString:
				enterOuterAlt(_localctx, 17);
				{
				setState(311);
				match(HtmlQuoteString);
				}
				break;
			case HtmlDoubleQuoteString:
				enterOuterAlt(_localctx, 18);
				{
				setState(312);
				match(HtmlDoubleQuoteString);
				}
				break;
			case StyleBody:
				enterOuterAlt(_localctx, 19);
				{
				setState(313);
				match(StyleBody);
				}
				break;
			case ScriptClose:
				enterOuterAlt(_localctx, 20);
				{
				setState(314);
				match(ScriptClose);
				}
				break;
			case XmlStart:
				enterOuterAlt(_localctx, 21);
				{
				setState(315);
				match(XmlStart);
				setState(319);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==XmlText) {
					{
					{
					setState(316);
					match(XmlText);
					}
					}
					setState(321);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(322);
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
			setState(326); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(325);
					match(ScriptText);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(328); 
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
			setState(333);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(330);
					importStatement();
					}
					} 
				}
				setState(335);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			}
			setState(337); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(336);
					topStatement();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(339); 
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
			setState(341);
			match(Import);
			setState(342);
			match(Namespace);
			setState(343);
			namespaceNameList();
			setState(344);
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
			setState(353);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(346);
				statement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(347);
				useDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(348);
				namespaceDeclaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(349);
				functionDeclaration();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(350);
				classDeclaration();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(351);
				globalConstantDeclaration();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(352);
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
			setState(355);
			match(Use);
			setState(357);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				setState(356);
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
			setState(359);
			useDeclarationContentList();
			setState(360);
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
			setState(363);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NamespaceSeparator) {
				{
				setState(362);
				match(NamespaceSeparator);
				}
			}

			setState(365);
			useDeclarationContent();
			setState(373);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(366);
				match(Comma);
				setState(368);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NamespaceSeparator) {
					{
					setState(367);
					match(NamespaceSeparator);
					}
				}

				setState(370);
				useDeclarationContent();
				}
				}
				setState(375);
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
			setState(376);
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
			setState(378);
			match(Namespace);
			setState(393);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				{
				setState(380);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 44)) & ~0x3f) == 0 && ((1L << (_la - 44)) & ((1L << (Abstract - 44)) | (1L << (Array - 44)) | (1L << (As - 44)) | (1L << (BinaryCast - 44)) | (1L << (BoolType - 44)) | (1L << (BooleanConstant - 44)) | (1L << (Break - 44)) | (1L << (Callable - 44)) | (1L << (Case - 44)) | (1L << (Catch - 44)) | (1L << (Class - 44)) | (1L << (Clone - 44)) | (1L << (Const - 44)) | (1L << (Continue - 44)) | (1L << (Declare - 44)) | (1L << (Default - 44)) | (1L << (Do - 44)) | (1L << (DoubleCast - 44)) | (1L << (DoubleType - 44)) | (1L << (Echo - 44)) | (1L << (Else - 44)) | (1L << (ElseIf - 44)) | (1L << (Empty - 44)) | (1L << (EndDeclare - 44)) | (1L << (EndFor - 44)) | (1L << (EndForeach - 44)) | (1L << (EndIf - 44)) | (1L << (EndSwitch - 44)) | (1L << (EndWhile - 44)) | (1L << (Eval - 44)) | (1L << (Exit - 44)) | (1L << (Extends - 44)) | (1L << (Final - 44)) | (1L << (Finally - 44)) | (1L << (FloatCast - 44)) | (1L << (For - 44)) | (1L << (Foreach - 44)) | (1L << (Function - 44)) | (1L << (Global - 44)) | (1L << (Goto - 44)) | (1L << (If - 44)) | (1L << (Implements - 44)) | (1L << (Import - 44)) | (1L << (Include - 44)) | (1L << (IncludeOnce - 44)) | (1L << (InstanceOf - 44)) | (1L << (InsteadOf - 44)) | (1L << (Int8Cast - 44)) | (1L << (Int16Cast - 44)) | (1L << (Int64Type - 44)) | (1L << (IntType - 44)) | (1L << (Interface - 44)) | (1L << (IsSet - 44)) | (1L << (List - 44)) | (1L << (LogicalAnd - 44)) | (1L << (LogicalOr - 44)) | (1L << (LogicalXor - 44)) | (1L << (Namespace - 44)) | (1L << (New - 44)) | (1L << (Null - 44)) | (1L << (ObjectType - 44)) | (1L << (Parent_ - 44)) | (1L << (Partial - 44)) | (1L << (Print - 44)))) != 0) || ((((_la - 108)) & ~0x3f) == 0 && ((1L << (_la - 108)) & ((1L << (Private - 108)) | (1L << (Protected - 108)) | (1L << (Public - 108)) | (1L << (Require - 108)) | (1L << (RequireOnce - 108)) | (1L << (Resource - 108)) | (1L << (Return - 108)) | (1L << (Static - 108)) | (1L << (StringType - 108)) | (1L << (Switch - 108)) | (1L << (Throw - 108)) | (1L << (Trait - 108)) | (1L << (Try - 108)) | (1L << (Typeof - 108)) | (1L << (UintCast - 108)) | (1L << (UnicodeCast - 108)) | (1L << (Unset - 108)) | (1L << (Use - 108)) | (1L << (Var - 108)) | (1L << (While - 108)) | (1L << (Yield - 108)) | (1L << (From - 108)) | (1L << (Get - 108)) | (1L << (Set - 108)) | (1L << (Call - 108)) | (1L << (CallStatic - 108)) | (1L << (Constructor - 108)) | (1L << (Destruct - 108)) | (1L << (Wakeup - 108)) | (1L << (Sleep - 108)) | (1L << (Autoload - 108)) | (1L << (IsSet__ - 108)) | (1L << (Unset__ - 108)) | (1L << (ToString__ - 108)) | (1L << (Invoke - 108)) | (1L << (SetState - 108)) | (1L << (Clone__ - 108)) | (1L << (DebugInfo - 108)) | (1L << (Namespace__ - 108)) | (1L << (Class__ - 108)) | (1L << (Traic__ - 108)) | (1L << (Function__ - 108)) | (1L << (Method__ - 108)) | (1L << (Line__ - 108)) | (1L << (File__ - 108)) | (1L << (Dir__ - 108)))) != 0) || _la==Label) {
					{
					setState(379);
					namespaceNameList();
					}
				}

				setState(382);
				match(OpenCurlyBracket);
				setState(386);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << HtmlText) | (1L << XmlStart) | (1L << HtmlScriptOpen) | (1L << HtmlStyleOpen) | (1L << HtmlDtd) | (1L << HtmlOpen) | (1L << HtmlClose) | (1L << HtmlSlashClose) | (1L << HtmlSlash) | (1L << HtmlEquals) | (1L << HtmlStartQuoteString) | (1L << HtmlStartDoubleQuoteString) | (1L << HtmlHex) | (1L << HtmlDecimal) | (1L << HtmlName) | (1L << HtmlEndQuoteString) | (1L << HtmlQuoteString) | (1L << HtmlEndDoubleQuoteString) | (1L << HtmlDoubleQuoteString) | (1L << ScriptText) | (1L << ScriptClose) | (1L << StyleBody) | (1L << Abstract) | (1L << Array) | (1L << As) | (1L << BinaryCast) | (1L << BoolType) | (1L << BooleanConstant) | (1L << Break) | (1L << Callable) | (1L << Case) | (1L << Catch) | (1L << Class) | (1L << Clone) | (1L << Const) | (1L << Continue) | (1L << Declare) | (1L << Default) | (1L << Do) | (1L << DoubleCast) | (1L << DoubleType) | (1L << Echo))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (Else - 64)) | (1L << (ElseIf - 64)) | (1L << (Empty - 64)) | (1L << (EndDeclare - 64)) | (1L << (EndFor - 64)) | (1L << (EndForeach - 64)) | (1L << (EndIf - 64)) | (1L << (EndSwitch - 64)) | (1L << (EndWhile - 64)) | (1L << (Eval - 64)) | (1L << (Exit - 64)) | (1L << (Extends - 64)) | (1L << (Final - 64)) | (1L << (Finally - 64)) | (1L << (FloatCast - 64)) | (1L << (For - 64)) | (1L << (Foreach - 64)) | (1L << (Function - 64)) | (1L << (Global - 64)) | (1L << (Goto - 64)) | (1L << (If - 64)) | (1L << (Implements - 64)) | (1L << (Import - 64)) | (1L << (Include - 64)) | (1L << (IncludeOnce - 64)) | (1L << (InstanceOf - 64)) | (1L << (InsteadOf - 64)) | (1L << (Int8Cast - 64)) | (1L << (Int16Cast - 64)) | (1L << (Int64Type - 64)) | (1L << (IntType - 64)) | (1L << (Interface - 64)) | (1L << (IsSet - 64)) | (1L << (List - 64)) | (1L << (LogicalAnd - 64)) | (1L << (LogicalOr - 64)) | (1L << (LogicalXor - 64)) | (1L << (Namespace - 64)) | (1L << (New - 64)) | (1L << (Null - 64)) | (1L << (ObjectType - 64)) | (1L << (Parent_ - 64)) | (1L << (Partial - 64)) | (1L << (Print - 64)) | (1L << (Private - 64)) | (1L << (Protected - 64)) | (1L << (Public - 64)) | (1L << (Require - 64)) | (1L << (RequireOnce - 64)) | (1L << (Resource - 64)) | (1L << (Return - 64)) | (1L << (Static - 64)) | (1L << (StringType - 64)) | (1L << (Switch - 64)) | (1L << (Throw - 64)) | (1L << (Trait - 64)) | (1L << (Try - 64)) | (1L << (Typeof - 64)) | (1L << (UintCast - 64)) | (1L << (UnicodeCast - 64)) | (1L << (Unset - 64)) | (1L << (Use - 64)) | (1L << (Var - 64)) | (1L << (While - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (Yield - 128)) | (1L << (From - 128)) | (1L << (LambdaFn - 128)) | (1L << (Get - 128)) | (1L << (Set - 128)) | (1L << (Call - 128)) | (1L << (CallStatic - 128)) | (1L << (Constructor - 128)) | (1L << (Destruct - 128)) | (1L << (Wakeup - 128)) | (1L << (Sleep - 128)) | (1L << (Autoload - 128)) | (1L << (IsSet__ - 128)) | (1L << (Unset__ - 128)) | (1L << (ToString__ - 128)) | (1L << (Invoke - 128)) | (1L << (SetState - 128)) | (1L << (Clone__ - 128)) | (1L << (DebugInfo - 128)) | (1L << (Namespace__ - 128)) | (1L << (Class__ - 128)) | (1L << (Traic__ - 128)) | (1L << (Function__ - 128)) | (1L << (Method__ - 128)) | (1L << (Line__ - 128)) | (1L << (File__ - 128)) | (1L << (Dir__ - 128)) | (1L << (Inc - 128)) | (1L << (Dec - 128)) | (1L << (NamespaceSeparator - 128)))) != 0) || ((((_la - 194)) & ~0x3f) == 0 && ((1L << (_la - 194)) & ((1L << (Bang - 194)) | (1L << (Plus - 194)) | (1L << (Minus - 194)) | (1L << (Tilde - 194)) | (1L << (SuppressWarnings - 194)) | (1L << (Dollar - 194)) | (1L << (OpenRoundBracket - 194)) | (1L << (OpenSquareBracket - 194)) | (1L << (OpenCurlyBracket - 194)) | (1L << (SemiColon - 194)) | (1L << (VarName - 194)) | (1L << (Label - 194)) | (1L << (Octal - 194)) | (1L << (Decimal - 194)) | (1L << (Real - 194)) | (1L << (Hex - 194)) | (1L << (Binary - 194)) | (1L << (BackQuoteString - 194)) | (1L << (SingleQuoteString - 194)) | (1L << (DoubleQuote - 194)) | (1L << (StartNowDoc - 194)) | (1L << (StartHereDoc - 194)))) != 0)) {
					{
					{
					setState(383);
					namespaceStatement();
					}
					}
					setState(388);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(389);
				match(CloseCurlyBracket);
				}
				break;
			case 2:
				{
				setState(390);
				namespaceNameList();
				setState(391);
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
			setState(400);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(395);
				statement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(396);
				useDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(397);
				functionDeclaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(398);
				classDeclaration();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(399);
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
			setState(402);
			attributes();
			setState(403);
			match(Function);
			setState(405);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Ampersand) {
				{
				setState(404);
				match(Ampersand);
				}
			}

			setState(407);
			identifier();
			setState(409);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Lgeneric) {
				{
				setState(408);
				typeParameterListInBrackets();
				}
			}

			setState(411);
			match(OpenRoundBracket);
			setState(412);
			formalParameterList();
			setState(413);
			match(CloseRoundBracket);
			setState(419);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Colon) {
				{
				setState(414);
				match(Colon);
				setState(416);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==QuestionMark) {
					{
					setState(415);
					match(QuestionMark);
					}
				}

				setState(418);
				typeHint();
				}
			}

			setState(421);
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
			setState(423);
			attributes();
			setState(425);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Private) {
				{
				setState(424);
				match(Private);
				}
			}

			setState(428);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Abstract || _la==Final) {
				{
				setState(427);
				modifier();
				}
			}

			setState(431);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Partial) {
				{
				setState(430);
				match(Partial);
				}
			}

			setState(455);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Class:
			case Trait:
				{
				setState(433);
				classEntryType();
				setState(434);
				identifier();
				setState(436);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Lgeneric) {
					{
					setState(435);
					typeParameterListInBrackets();
					}
				}

				setState(440);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Extends) {
					{
					setState(438);
					match(Extends);
					setState(439);
					qualifiedStaticTypeRef();
					}
				}

				setState(444);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Implements) {
					{
					setState(442);
					match(Implements);
					setState(443);
					interfaceList();
					}
				}

				}
				break;
			case Interface:
				{
				setState(446);
				match(Interface);
				setState(447);
				identifier();
				setState(449);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Lgeneric) {
					{
					setState(448);
					typeParameterListInBrackets();
					}
				}

				setState(453);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Extends) {
					{
					setState(451);
					match(Extends);
					setState(452);
					interfaceList();
					}
				}

				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(457);
			match(OpenCurlyBracket);
			setState(461);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Decorator) | (1L << Abstract) | (1L << Const))) != 0) || ((((_la - 76)) & ~0x3f) == 0 && ((1L << (_la - 76)) & ((1L << (Final - 76)) | (1L << (Function - 76)) | (1L << (Private - 76)) | (1L << (Protected - 76)) | (1L << (Public - 76)) | (1L << (Static - 76)) | (1L << (Use - 76)) | (1L << (Var - 76)))) != 0) || _la==OpenSquareBracket) {
				{
				{
				setState(458);
				classStatement();
				}
				}
				setState(463);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(464);
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
			setState(466);
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
			setState(468);
			qualifiedStaticTypeRef();
			setState(473);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(469);
				match(Comma);
				setState(470);
				qualifiedStaticTypeRef();
				}
				}
				setState(475);
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
			setState(490);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(476);
				match(Lgeneric);
				setState(477);
				typeParameterList();
				setState(478);
				match(Rgeneric);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(480);
				match(Lgeneric);
				setState(481);
				typeParameterWithDefaultsList();
				setState(482);
				match(Rgeneric);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(484);
				match(Lgeneric);
				setState(485);
				typeParameterList();
				setState(486);
				match(Comma);
				setState(487);
				typeParameterWithDefaultsList();
				setState(488);
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
			setState(492);
			typeParameterDecl();
			setState(497);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(493);
					match(Comma);
					setState(494);
					typeParameterDecl();
					}
					} 
				}
				setState(499);
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
			setState(500);
			typeParameterWithDefaultDecl();
			setState(505);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(501);
				match(Comma);
				setState(502);
				typeParameterWithDefaultDecl();
				}
				}
				setState(507);
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
			setState(508);
			attributes();
			setState(509);
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
			setState(511);
			attributes();
			setState(512);
			identifier();
			setState(513);
			match(Eq);
			setState(516);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				{
				setState(514);
				qualifiedStaticTypeRef();
				}
				break;
			case 2:
				{
				setState(515);
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
			setState(518);
			match(Lgeneric);
			setState(519);
			typeRef();
			setState(524);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(520);
				match(Comma);
				setState(521);
				typeRef();
				}
				}
				setState(526);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(527);
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
			setState(532);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OpenSquareBracket) {
				{
				{
				setState(529);
				attributesGroup();
				}
				}
				setState(534);
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
			setState(535);
			match(OpenSquareBracket);
			setState(539);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
			case 1:
				{
				setState(536);
				identifier();
				setState(537);
				match(Colon);
				}
				break;
			}
			setState(541);
			attribute();
			setState(546);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(542);
				match(Comma);
				setState(543);
				attribute();
				}
				}
				setState(548);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(549);
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
			setState(569);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(551);
				qualifiedNamespaceName();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(552);
				qualifiedNamespaceName();
				setState(553);
				match(OpenRoundBracket);
				setState(554);
				attributeArgList();
				setState(555);
				match(CloseRoundBracket);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(557);
				qualifiedNamespaceName();
				setState(558);
				match(OpenRoundBracket);
				setState(559);
				attributeNamedArgList();
				setState(560);
				match(CloseRoundBracket);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(562);
				qualifiedNamespaceName();
				setState(563);
				match(OpenRoundBracket);
				setState(564);
				attributeArgList();
				setState(565);
				match(Comma);
				setState(566);
				attributeNamedArgList();
				setState(567);
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
			setState(571);
			expression(0);
			setState(576);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,42,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(572);
					match(Comma);
					setState(573);
					expression(0);
					}
					} 
				}
				setState(578);
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
			setState(579);
			attributeNamedArg();
			setState(584);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(580);
				match(Comma);
				setState(581);
				attributeNamedArg();
				}
				}
				setState(586);
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
			setState(587);
			match(VarName);
			setState(588);
			match(DoubleArrow);
			setState(589);
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
			setState(594);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,44,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(591);
					innerStatement();
					}
					} 
				}
				setState(596);
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
			setState(600);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(597);
				statement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(598);
				functionDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(599);
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
			setState(629);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(602);
				identifier();
				setState(603);
				match(Colon);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(605);
				blockStatement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(606);
				ifStatement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(607);
				whileStatement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(608);
				doWhileStatement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(609);
				forStatement();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(610);
				switchStatement();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(611);
				breakStatement();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(612);
				continueStatement();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(613);
				returnStatement();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(614);
				yieldExpression();
				setState(615);
				match(SemiColon);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(617);
				globalStatement();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(618);
				staticVariableStatement();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(619);
				echoStatement();
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(620);
				expressionStatement();
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(621);
				unsetStatement();
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(622);
				foreachStatement();
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(623);
				tryCatchFinally();
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(624);
				throwStatement();
				}
				break;
			case 20:
				enterOuterAlt(_localctx, 20);
				{
				setState(625);
				gotoStatement();
				}
				break;
			case 21:
				enterOuterAlt(_localctx, 21);
				{
				setState(626);
				declareStatement();
				}
				break;
			case 22:
				enterOuterAlt(_localctx, 22);
				{
				setState(627);
				emptyStatement();
				}
				break;
			case 23:
				enterOuterAlt(_localctx, 23);
				{
				setState(628);
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
			setState(631);
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
			setState(633);
			match(OpenCurlyBracket);
			setState(634);
			innerStatementList();
			setState(635);
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
			setState(665);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(637);
				match(If);
				setState(638);
				parentheses();
				setState(639);
				statement();
				setState(643);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,47,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(640);
						elseIfStatement();
						}
						} 
					}
					setState(645);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,47,_ctx);
				}
				setState(647);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
				case 1:
					{
					setState(646);
					elseStatement();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(649);
				match(If);
				setState(650);
				parentheses();
				setState(651);
				match(Colon);
				setState(652);
				innerStatementList();
				setState(656);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ElseIf) {
					{
					{
					setState(653);
					elseIfColonStatement();
					}
					}
					setState(658);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(660);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Else) {
					{
					setState(659);
					elseColonStatement();
					}
				}

				setState(662);
				match(EndIf);
				setState(663);
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
			setState(667);
			match(ElseIf);
			setState(668);
			parentheses();
			setState(669);
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
			setState(671);
			match(ElseIf);
			setState(672);
			parentheses();
			setState(673);
			match(Colon);
			setState(674);
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
			setState(676);
			match(Else);
			setState(677);
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
			setState(679);
			match(Else);
			setState(680);
			match(Colon);
			setState(681);
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
			setState(683);
			match(While);
			setState(684);
			parentheses();
			setState(691);
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
				setState(685);
				statement();
				}
				break;
			case Colon:
				{
				setState(686);
				match(Colon);
				setState(687);
				innerStatementList();
				setState(688);
				match(EndWhile);
				setState(689);
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
			setState(693);
			match(Do);
			setState(694);
			statement();
			setState(695);
			match(While);
			setState(696);
			parentheses();
			setState(697);
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
			setState(699);
			match(For);
			setState(700);
			match(OpenRoundBracket);
			setState(702);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 44)) & ~0x3f) == 0 && ((1L << (_la - 44)) & ((1L << (Abstract - 44)) | (1L << (Array - 44)) | (1L << (As - 44)) | (1L << (BinaryCast - 44)) | (1L << (BoolType - 44)) | (1L << (BooleanConstant - 44)) | (1L << (Break - 44)) | (1L << (Callable - 44)) | (1L << (Case - 44)) | (1L << (Catch - 44)) | (1L << (Class - 44)) | (1L << (Clone - 44)) | (1L << (Const - 44)) | (1L << (Continue - 44)) | (1L << (Declare - 44)) | (1L << (Default - 44)) | (1L << (Do - 44)) | (1L << (DoubleCast - 44)) | (1L << (DoubleType - 44)) | (1L << (Echo - 44)) | (1L << (Else - 44)) | (1L << (ElseIf - 44)) | (1L << (Empty - 44)) | (1L << (EndDeclare - 44)) | (1L << (EndFor - 44)) | (1L << (EndForeach - 44)) | (1L << (EndIf - 44)) | (1L << (EndSwitch - 44)) | (1L << (EndWhile - 44)) | (1L << (Eval - 44)) | (1L << (Exit - 44)) | (1L << (Extends - 44)) | (1L << (Final - 44)) | (1L << (Finally - 44)) | (1L << (FloatCast - 44)) | (1L << (For - 44)) | (1L << (Foreach - 44)) | (1L << (Function - 44)) | (1L << (Global - 44)) | (1L << (Goto - 44)) | (1L << (If - 44)) | (1L << (Implements - 44)) | (1L << (Import - 44)) | (1L << (Include - 44)) | (1L << (IncludeOnce - 44)) | (1L << (InstanceOf - 44)) | (1L << (InsteadOf - 44)) | (1L << (Int8Cast - 44)) | (1L << (Int16Cast - 44)) | (1L << (Int64Type - 44)) | (1L << (IntType - 44)) | (1L << (Interface - 44)) | (1L << (IsSet - 44)) | (1L << (List - 44)) | (1L << (LogicalAnd - 44)) | (1L << (LogicalOr - 44)) | (1L << (LogicalXor - 44)) | (1L << (Namespace - 44)) | (1L << (New - 44)) | (1L << (Null - 44)) | (1L << (ObjectType - 44)) | (1L << (Parent_ - 44)) | (1L << (Partial - 44)) | (1L << (Print - 44)))) != 0) || ((((_la - 108)) & ~0x3f) == 0 && ((1L << (_la - 108)) & ((1L << (Private - 108)) | (1L << (Protected - 108)) | (1L << (Public - 108)) | (1L << (Require - 108)) | (1L << (RequireOnce - 108)) | (1L << (Resource - 108)) | (1L << (Return - 108)) | (1L << (Static - 108)) | (1L << (StringType - 108)) | (1L << (Switch - 108)) | (1L << (Throw - 108)) | (1L << (Trait - 108)) | (1L << (Try - 108)) | (1L << (Typeof - 108)) | (1L << (UintCast - 108)) | (1L << (UnicodeCast - 108)) | (1L << (Unset - 108)) | (1L << (Use - 108)) | (1L << (Var - 108)) | (1L << (While - 108)) | (1L << (Yield - 108)) | (1L << (From - 108)) | (1L << (LambdaFn - 108)) | (1L << (Get - 108)) | (1L << (Set - 108)) | (1L << (Call - 108)) | (1L << (CallStatic - 108)) | (1L << (Constructor - 108)) | (1L << (Destruct - 108)) | (1L << (Wakeup - 108)) | (1L << (Sleep - 108)) | (1L << (Autoload - 108)) | (1L << (IsSet__ - 108)) | (1L << (Unset__ - 108)) | (1L << (ToString__ - 108)) | (1L << (Invoke - 108)) | (1L << (SetState - 108)) | (1L << (Clone__ - 108)) | (1L << (DebugInfo - 108)) | (1L << (Namespace__ - 108)) | (1L << (Class__ - 108)) | (1L << (Traic__ - 108)) | (1L << (Function__ - 108)) | (1L << (Method__ - 108)) | (1L << (Line__ - 108)) | (1L << (File__ - 108)) | (1L << (Dir__ - 108)) | (1L << (Inc - 108)) | (1L << (Dec - 108)))) != 0) || ((((_la - 188)) & ~0x3f) == 0 && ((1L << (_la - 188)) & ((1L << (NamespaceSeparator - 188)) | (1L << (Bang - 188)) | (1L << (Plus - 188)) | (1L << (Minus - 188)) | (1L << (Tilde - 188)) | (1L << (SuppressWarnings - 188)) | (1L << (Dollar - 188)) | (1L << (OpenRoundBracket - 188)) | (1L << (OpenSquareBracket - 188)) | (1L << (VarName - 188)) | (1L << (Label - 188)) | (1L << (Octal - 188)) | (1L << (Decimal - 188)) | (1L << (Real - 188)) | (1L << (Hex - 188)) | (1L << (Binary - 188)) | (1L << (BackQuoteString - 188)) | (1L << (SingleQuoteString - 188)) | (1L << (DoubleQuote - 188)) | (1L << (StartNowDoc - 188)) | (1L << (StartHereDoc - 188)))) != 0)) {
				{
				setState(701);
				forInit();
				}
			}

			setState(704);
			match(SemiColon);
			setState(706);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 44)) & ~0x3f) == 0 && ((1L << (_la - 44)) & ((1L << (Abstract - 44)) | (1L << (Array - 44)) | (1L << (As - 44)) | (1L << (BinaryCast - 44)) | (1L << (BoolType - 44)) | (1L << (BooleanConstant - 44)) | (1L << (Break - 44)) | (1L << (Callable - 44)) | (1L << (Case - 44)) | (1L << (Catch - 44)) | (1L << (Class - 44)) | (1L << (Clone - 44)) | (1L << (Const - 44)) | (1L << (Continue - 44)) | (1L << (Declare - 44)) | (1L << (Default - 44)) | (1L << (Do - 44)) | (1L << (DoubleCast - 44)) | (1L << (DoubleType - 44)) | (1L << (Echo - 44)) | (1L << (Else - 44)) | (1L << (ElseIf - 44)) | (1L << (Empty - 44)) | (1L << (EndDeclare - 44)) | (1L << (EndFor - 44)) | (1L << (EndForeach - 44)) | (1L << (EndIf - 44)) | (1L << (EndSwitch - 44)) | (1L << (EndWhile - 44)) | (1L << (Eval - 44)) | (1L << (Exit - 44)) | (1L << (Extends - 44)) | (1L << (Final - 44)) | (1L << (Finally - 44)) | (1L << (FloatCast - 44)) | (1L << (For - 44)) | (1L << (Foreach - 44)) | (1L << (Function - 44)) | (1L << (Global - 44)) | (1L << (Goto - 44)) | (1L << (If - 44)) | (1L << (Implements - 44)) | (1L << (Import - 44)) | (1L << (Include - 44)) | (1L << (IncludeOnce - 44)) | (1L << (InstanceOf - 44)) | (1L << (InsteadOf - 44)) | (1L << (Int8Cast - 44)) | (1L << (Int16Cast - 44)) | (1L << (Int64Type - 44)) | (1L << (IntType - 44)) | (1L << (Interface - 44)) | (1L << (IsSet - 44)) | (1L << (List - 44)) | (1L << (LogicalAnd - 44)) | (1L << (LogicalOr - 44)) | (1L << (LogicalXor - 44)) | (1L << (Namespace - 44)) | (1L << (New - 44)) | (1L << (Null - 44)) | (1L << (ObjectType - 44)) | (1L << (Parent_ - 44)) | (1L << (Partial - 44)) | (1L << (Print - 44)))) != 0) || ((((_la - 108)) & ~0x3f) == 0 && ((1L << (_la - 108)) & ((1L << (Private - 108)) | (1L << (Protected - 108)) | (1L << (Public - 108)) | (1L << (Require - 108)) | (1L << (RequireOnce - 108)) | (1L << (Resource - 108)) | (1L << (Return - 108)) | (1L << (Static - 108)) | (1L << (StringType - 108)) | (1L << (Switch - 108)) | (1L << (Throw - 108)) | (1L << (Trait - 108)) | (1L << (Try - 108)) | (1L << (Typeof - 108)) | (1L << (UintCast - 108)) | (1L << (UnicodeCast - 108)) | (1L << (Unset - 108)) | (1L << (Use - 108)) | (1L << (Var - 108)) | (1L << (While - 108)) | (1L << (Yield - 108)) | (1L << (From - 108)) | (1L << (LambdaFn - 108)) | (1L << (Get - 108)) | (1L << (Set - 108)) | (1L << (Call - 108)) | (1L << (CallStatic - 108)) | (1L << (Constructor - 108)) | (1L << (Destruct - 108)) | (1L << (Wakeup - 108)) | (1L << (Sleep - 108)) | (1L << (Autoload - 108)) | (1L << (IsSet__ - 108)) | (1L << (Unset__ - 108)) | (1L << (ToString__ - 108)) | (1L << (Invoke - 108)) | (1L << (SetState - 108)) | (1L << (Clone__ - 108)) | (1L << (DebugInfo - 108)) | (1L << (Namespace__ - 108)) | (1L << (Class__ - 108)) | (1L << (Traic__ - 108)) | (1L << (Function__ - 108)) | (1L << (Method__ - 108)) | (1L << (Line__ - 108)) | (1L << (File__ - 108)) | (1L << (Dir__ - 108)) | (1L << (Inc - 108)) | (1L << (Dec - 108)))) != 0) || ((((_la - 188)) & ~0x3f) == 0 && ((1L << (_la - 188)) & ((1L << (NamespaceSeparator - 188)) | (1L << (Bang - 188)) | (1L << (Plus - 188)) | (1L << (Minus - 188)) | (1L << (Tilde - 188)) | (1L << (SuppressWarnings - 188)) | (1L << (Dollar - 188)) | (1L << (OpenRoundBracket - 188)) | (1L << (OpenSquareBracket - 188)) | (1L << (VarName - 188)) | (1L << (Label - 188)) | (1L << (Octal - 188)) | (1L << (Decimal - 188)) | (1L << (Real - 188)) | (1L << (Hex - 188)) | (1L << (Binary - 188)) | (1L << (BackQuoteString - 188)) | (1L << (SingleQuoteString - 188)) | (1L << (DoubleQuote - 188)) | (1L << (StartNowDoc - 188)) | (1L << (StartHereDoc - 188)))) != 0)) {
				{
				setState(705);
				expressionList();
				}
			}

			setState(708);
			match(SemiColon);
			setState(710);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 44)) & ~0x3f) == 0 && ((1L << (_la - 44)) & ((1L << (Abstract - 44)) | (1L << (Array - 44)) | (1L << (As - 44)) | (1L << (BinaryCast - 44)) | (1L << (BoolType - 44)) | (1L << (BooleanConstant - 44)) | (1L << (Break - 44)) | (1L << (Callable - 44)) | (1L << (Case - 44)) | (1L << (Catch - 44)) | (1L << (Class - 44)) | (1L << (Clone - 44)) | (1L << (Const - 44)) | (1L << (Continue - 44)) | (1L << (Declare - 44)) | (1L << (Default - 44)) | (1L << (Do - 44)) | (1L << (DoubleCast - 44)) | (1L << (DoubleType - 44)) | (1L << (Echo - 44)) | (1L << (Else - 44)) | (1L << (ElseIf - 44)) | (1L << (Empty - 44)) | (1L << (EndDeclare - 44)) | (1L << (EndFor - 44)) | (1L << (EndForeach - 44)) | (1L << (EndIf - 44)) | (1L << (EndSwitch - 44)) | (1L << (EndWhile - 44)) | (1L << (Eval - 44)) | (1L << (Exit - 44)) | (1L << (Extends - 44)) | (1L << (Final - 44)) | (1L << (Finally - 44)) | (1L << (FloatCast - 44)) | (1L << (For - 44)) | (1L << (Foreach - 44)) | (1L << (Function - 44)) | (1L << (Global - 44)) | (1L << (Goto - 44)) | (1L << (If - 44)) | (1L << (Implements - 44)) | (1L << (Import - 44)) | (1L << (Include - 44)) | (1L << (IncludeOnce - 44)) | (1L << (InstanceOf - 44)) | (1L << (InsteadOf - 44)) | (1L << (Int8Cast - 44)) | (1L << (Int16Cast - 44)) | (1L << (Int64Type - 44)) | (1L << (IntType - 44)) | (1L << (Interface - 44)) | (1L << (IsSet - 44)) | (1L << (List - 44)) | (1L << (LogicalAnd - 44)) | (1L << (LogicalOr - 44)) | (1L << (LogicalXor - 44)) | (1L << (Namespace - 44)) | (1L << (New - 44)) | (1L << (Null - 44)) | (1L << (ObjectType - 44)) | (1L << (Parent_ - 44)) | (1L << (Partial - 44)) | (1L << (Print - 44)))) != 0) || ((((_la - 108)) & ~0x3f) == 0 && ((1L << (_la - 108)) & ((1L << (Private - 108)) | (1L << (Protected - 108)) | (1L << (Public - 108)) | (1L << (Require - 108)) | (1L << (RequireOnce - 108)) | (1L << (Resource - 108)) | (1L << (Return - 108)) | (1L << (Static - 108)) | (1L << (StringType - 108)) | (1L << (Switch - 108)) | (1L << (Throw - 108)) | (1L << (Trait - 108)) | (1L << (Try - 108)) | (1L << (Typeof - 108)) | (1L << (UintCast - 108)) | (1L << (UnicodeCast - 108)) | (1L << (Unset - 108)) | (1L << (Use - 108)) | (1L << (Var - 108)) | (1L << (While - 108)) | (1L << (Yield - 108)) | (1L << (From - 108)) | (1L << (LambdaFn - 108)) | (1L << (Get - 108)) | (1L << (Set - 108)) | (1L << (Call - 108)) | (1L << (CallStatic - 108)) | (1L << (Constructor - 108)) | (1L << (Destruct - 108)) | (1L << (Wakeup - 108)) | (1L << (Sleep - 108)) | (1L << (Autoload - 108)) | (1L << (IsSet__ - 108)) | (1L << (Unset__ - 108)) | (1L << (ToString__ - 108)) | (1L << (Invoke - 108)) | (1L << (SetState - 108)) | (1L << (Clone__ - 108)) | (1L << (DebugInfo - 108)) | (1L << (Namespace__ - 108)) | (1L << (Class__ - 108)) | (1L << (Traic__ - 108)) | (1L << (Function__ - 108)) | (1L << (Method__ - 108)) | (1L << (Line__ - 108)) | (1L << (File__ - 108)) | (1L << (Dir__ - 108)) | (1L << (Inc - 108)) | (1L << (Dec - 108)))) != 0) || ((((_la - 188)) & ~0x3f) == 0 && ((1L << (_la - 188)) & ((1L << (NamespaceSeparator - 188)) | (1L << (Bang - 188)) | (1L << (Plus - 188)) | (1L << (Minus - 188)) | (1L << (Tilde - 188)) | (1L << (SuppressWarnings - 188)) | (1L << (Dollar - 188)) | (1L << (OpenRoundBracket - 188)) | (1L << (OpenSquareBracket - 188)) | (1L << (VarName - 188)) | (1L << (Label - 188)) | (1L << (Octal - 188)) | (1L << (Decimal - 188)) | (1L << (Real - 188)) | (1L << (Hex - 188)) | (1L << (Binary - 188)) | (1L << (BackQuoteString - 188)) | (1L << (SingleQuoteString - 188)) | (1L << (DoubleQuote - 188)) | (1L << (StartNowDoc - 188)) | (1L << (StartHereDoc - 188)))) != 0)) {
				{
				setState(709);
				forUpdate();
				}
			}

			setState(712);
			match(CloseRoundBracket);
			setState(719);
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
				setState(713);
				statement();
				}
				break;
			case Colon:
				{
				setState(714);
				match(Colon);
				setState(715);
				innerStatementList();
				setState(716);
				match(EndFor);
				setState(717);
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
			setState(723);
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
			setState(725);
			match(Switch);
			setState(726);
			parentheses();
			setState(750);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OpenCurlyBracket:
				{
				setState(727);
				match(OpenCurlyBracket);
				setState(729);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SemiColon) {
					{
					setState(728);
					match(SemiColon);
					}
				}

				setState(734);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Case || _la==Default) {
					{
					{
					setState(731);
					switchBlock();
					}
					}
					setState(736);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(737);
				match(CloseCurlyBracket);
				}
				break;
			case Colon:
				{
				setState(738);
				match(Colon);
				setState(740);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SemiColon) {
					{
					setState(739);
					match(SemiColon);
					}
				}

				setState(745);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Case || _la==Default) {
					{
					{
					setState(742);
					switchBlock();
					}
					}
					setState(747);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(748);
				match(EndSwitch);
				setState(749);
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
			setState(758); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(755);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case Case:
						{
						setState(752);
						match(Case);
						setState(753);
						expression(0);
						}
						break;
					case Default:
						{
						setState(754);
						match(Default);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(757);
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
				setState(760); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,63,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(762);
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
			setState(764);
			match(Break);
			setState(766);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 44)) & ~0x3f) == 0 && ((1L << (_la - 44)) & ((1L << (Abstract - 44)) | (1L << (Array - 44)) | (1L << (As - 44)) | (1L << (BinaryCast - 44)) | (1L << (BoolType - 44)) | (1L << (BooleanConstant - 44)) | (1L << (Break - 44)) | (1L << (Callable - 44)) | (1L << (Case - 44)) | (1L << (Catch - 44)) | (1L << (Class - 44)) | (1L << (Clone - 44)) | (1L << (Const - 44)) | (1L << (Continue - 44)) | (1L << (Declare - 44)) | (1L << (Default - 44)) | (1L << (Do - 44)) | (1L << (DoubleCast - 44)) | (1L << (DoubleType - 44)) | (1L << (Echo - 44)) | (1L << (Else - 44)) | (1L << (ElseIf - 44)) | (1L << (Empty - 44)) | (1L << (EndDeclare - 44)) | (1L << (EndFor - 44)) | (1L << (EndForeach - 44)) | (1L << (EndIf - 44)) | (1L << (EndSwitch - 44)) | (1L << (EndWhile - 44)) | (1L << (Eval - 44)) | (1L << (Exit - 44)) | (1L << (Extends - 44)) | (1L << (Final - 44)) | (1L << (Finally - 44)) | (1L << (FloatCast - 44)) | (1L << (For - 44)) | (1L << (Foreach - 44)) | (1L << (Function - 44)) | (1L << (Global - 44)) | (1L << (Goto - 44)) | (1L << (If - 44)) | (1L << (Implements - 44)) | (1L << (Import - 44)) | (1L << (Include - 44)) | (1L << (IncludeOnce - 44)) | (1L << (InstanceOf - 44)) | (1L << (InsteadOf - 44)) | (1L << (Int8Cast - 44)) | (1L << (Int16Cast - 44)) | (1L << (Int64Type - 44)) | (1L << (IntType - 44)) | (1L << (Interface - 44)) | (1L << (IsSet - 44)) | (1L << (List - 44)) | (1L << (LogicalAnd - 44)) | (1L << (LogicalOr - 44)) | (1L << (LogicalXor - 44)) | (1L << (Namespace - 44)) | (1L << (New - 44)) | (1L << (Null - 44)) | (1L << (ObjectType - 44)) | (1L << (Parent_ - 44)) | (1L << (Partial - 44)) | (1L << (Print - 44)))) != 0) || ((((_la - 108)) & ~0x3f) == 0 && ((1L << (_la - 108)) & ((1L << (Private - 108)) | (1L << (Protected - 108)) | (1L << (Public - 108)) | (1L << (Require - 108)) | (1L << (RequireOnce - 108)) | (1L << (Resource - 108)) | (1L << (Return - 108)) | (1L << (Static - 108)) | (1L << (StringType - 108)) | (1L << (Switch - 108)) | (1L << (Throw - 108)) | (1L << (Trait - 108)) | (1L << (Try - 108)) | (1L << (Typeof - 108)) | (1L << (UintCast - 108)) | (1L << (UnicodeCast - 108)) | (1L << (Unset - 108)) | (1L << (Use - 108)) | (1L << (Var - 108)) | (1L << (While - 108)) | (1L << (Yield - 108)) | (1L << (From - 108)) | (1L << (LambdaFn - 108)) | (1L << (Get - 108)) | (1L << (Set - 108)) | (1L << (Call - 108)) | (1L << (CallStatic - 108)) | (1L << (Constructor - 108)) | (1L << (Destruct - 108)) | (1L << (Wakeup - 108)) | (1L << (Sleep - 108)) | (1L << (Autoload - 108)) | (1L << (IsSet__ - 108)) | (1L << (Unset__ - 108)) | (1L << (ToString__ - 108)) | (1L << (Invoke - 108)) | (1L << (SetState - 108)) | (1L << (Clone__ - 108)) | (1L << (DebugInfo - 108)) | (1L << (Namespace__ - 108)) | (1L << (Class__ - 108)) | (1L << (Traic__ - 108)) | (1L << (Function__ - 108)) | (1L << (Method__ - 108)) | (1L << (Line__ - 108)) | (1L << (File__ - 108)) | (1L << (Dir__ - 108)) | (1L << (Inc - 108)) | (1L << (Dec - 108)))) != 0) || ((((_la - 188)) & ~0x3f) == 0 && ((1L << (_la - 188)) & ((1L << (NamespaceSeparator - 188)) | (1L << (Bang - 188)) | (1L << (Plus - 188)) | (1L << (Minus - 188)) | (1L << (Tilde - 188)) | (1L << (SuppressWarnings - 188)) | (1L << (Dollar - 188)) | (1L << (OpenRoundBracket - 188)) | (1L << (OpenSquareBracket - 188)) | (1L << (VarName - 188)) | (1L << (Label - 188)) | (1L << (Octal - 188)) | (1L << (Decimal - 188)) | (1L << (Real - 188)) | (1L << (Hex - 188)) | (1L << (Binary - 188)) | (1L << (BackQuoteString - 188)) | (1L << (SingleQuoteString - 188)) | (1L << (DoubleQuote - 188)) | (1L << (StartNowDoc - 188)) | (1L << (StartHereDoc - 188)))) != 0)) {
				{
				setState(765);
				expression(0);
				}
			}

			setState(768);
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
			setState(770);
			match(Continue);
			setState(772);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 44)) & ~0x3f) == 0 && ((1L << (_la - 44)) & ((1L << (Abstract - 44)) | (1L << (Array - 44)) | (1L << (As - 44)) | (1L << (BinaryCast - 44)) | (1L << (BoolType - 44)) | (1L << (BooleanConstant - 44)) | (1L << (Break - 44)) | (1L << (Callable - 44)) | (1L << (Case - 44)) | (1L << (Catch - 44)) | (1L << (Class - 44)) | (1L << (Clone - 44)) | (1L << (Const - 44)) | (1L << (Continue - 44)) | (1L << (Declare - 44)) | (1L << (Default - 44)) | (1L << (Do - 44)) | (1L << (DoubleCast - 44)) | (1L << (DoubleType - 44)) | (1L << (Echo - 44)) | (1L << (Else - 44)) | (1L << (ElseIf - 44)) | (1L << (Empty - 44)) | (1L << (EndDeclare - 44)) | (1L << (EndFor - 44)) | (1L << (EndForeach - 44)) | (1L << (EndIf - 44)) | (1L << (EndSwitch - 44)) | (1L << (EndWhile - 44)) | (1L << (Eval - 44)) | (1L << (Exit - 44)) | (1L << (Extends - 44)) | (1L << (Final - 44)) | (1L << (Finally - 44)) | (1L << (FloatCast - 44)) | (1L << (For - 44)) | (1L << (Foreach - 44)) | (1L << (Function - 44)) | (1L << (Global - 44)) | (1L << (Goto - 44)) | (1L << (If - 44)) | (1L << (Implements - 44)) | (1L << (Import - 44)) | (1L << (Include - 44)) | (1L << (IncludeOnce - 44)) | (1L << (InstanceOf - 44)) | (1L << (InsteadOf - 44)) | (1L << (Int8Cast - 44)) | (1L << (Int16Cast - 44)) | (1L << (Int64Type - 44)) | (1L << (IntType - 44)) | (1L << (Interface - 44)) | (1L << (IsSet - 44)) | (1L << (List - 44)) | (1L << (LogicalAnd - 44)) | (1L << (LogicalOr - 44)) | (1L << (LogicalXor - 44)) | (1L << (Namespace - 44)) | (1L << (New - 44)) | (1L << (Null - 44)) | (1L << (ObjectType - 44)) | (1L << (Parent_ - 44)) | (1L << (Partial - 44)) | (1L << (Print - 44)))) != 0) || ((((_la - 108)) & ~0x3f) == 0 && ((1L << (_la - 108)) & ((1L << (Private - 108)) | (1L << (Protected - 108)) | (1L << (Public - 108)) | (1L << (Require - 108)) | (1L << (RequireOnce - 108)) | (1L << (Resource - 108)) | (1L << (Return - 108)) | (1L << (Static - 108)) | (1L << (StringType - 108)) | (1L << (Switch - 108)) | (1L << (Throw - 108)) | (1L << (Trait - 108)) | (1L << (Try - 108)) | (1L << (Typeof - 108)) | (1L << (UintCast - 108)) | (1L << (UnicodeCast - 108)) | (1L << (Unset - 108)) | (1L << (Use - 108)) | (1L << (Var - 108)) | (1L << (While - 108)) | (1L << (Yield - 108)) | (1L << (From - 108)) | (1L << (LambdaFn - 108)) | (1L << (Get - 108)) | (1L << (Set - 108)) | (1L << (Call - 108)) | (1L << (CallStatic - 108)) | (1L << (Constructor - 108)) | (1L << (Destruct - 108)) | (1L << (Wakeup - 108)) | (1L << (Sleep - 108)) | (1L << (Autoload - 108)) | (1L << (IsSet__ - 108)) | (1L << (Unset__ - 108)) | (1L << (ToString__ - 108)) | (1L << (Invoke - 108)) | (1L << (SetState - 108)) | (1L << (Clone__ - 108)) | (1L << (DebugInfo - 108)) | (1L << (Namespace__ - 108)) | (1L << (Class__ - 108)) | (1L << (Traic__ - 108)) | (1L << (Function__ - 108)) | (1L << (Method__ - 108)) | (1L << (Line__ - 108)) | (1L << (File__ - 108)) | (1L << (Dir__ - 108)) | (1L << (Inc - 108)) | (1L << (Dec - 108)))) != 0) || ((((_la - 188)) & ~0x3f) == 0 && ((1L << (_la - 188)) & ((1L << (NamespaceSeparator - 188)) | (1L << (Bang - 188)) | (1L << (Plus - 188)) | (1L << (Minus - 188)) | (1L << (Tilde - 188)) | (1L << (SuppressWarnings - 188)) | (1L << (Dollar - 188)) | (1L << (OpenRoundBracket - 188)) | (1L << (OpenSquareBracket - 188)) | (1L << (VarName - 188)) | (1L << (Label - 188)) | (1L << (Octal - 188)) | (1L << (Decimal - 188)) | (1L << (Real - 188)) | (1L << (Hex - 188)) | (1L << (Binary - 188)) | (1L << (BackQuoteString - 188)) | (1L << (SingleQuoteString - 188)) | (1L << (DoubleQuote - 188)) | (1L << (StartNowDoc - 188)) | (1L << (StartHereDoc - 188)))) != 0)) {
				{
				setState(771);
				expression(0);
				}
			}

			setState(774);
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
			setState(776);
			match(Return);
			setState(778);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 44)) & ~0x3f) == 0 && ((1L << (_la - 44)) & ((1L << (Abstract - 44)) | (1L << (Array - 44)) | (1L << (As - 44)) | (1L << (BinaryCast - 44)) | (1L << (BoolType - 44)) | (1L << (BooleanConstant - 44)) | (1L << (Break - 44)) | (1L << (Callable - 44)) | (1L << (Case - 44)) | (1L << (Catch - 44)) | (1L << (Class - 44)) | (1L << (Clone - 44)) | (1L << (Const - 44)) | (1L << (Continue - 44)) | (1L << (Declare - 44)) | (1L << (Default - 44)) | (1L << (Do - 44)) | (1L << (DoubleCast - 44)) | (1L << (DoubleType - 44)) | (1L << (Echo - 44)) | (1L << (Else - 44)) | (1L << (ElseIf - 44)) | (1L << (Empty - 44)) | (1L << (EndDeclare - 44)) | (1L << (EndFor - 44)) | (1L << (EndForeach - 44)) | (1L << (EndIf - 44)) | (1L << (EndSwitch - 44)) | (1L << (EndWhile - 44)) | (1L << (Eval - 44)) | (1L << (Exit - 44)) | (1L << (Extends - 44)) | (1L << (Final - 44)) | (1L << (Finally - 44)) | (1L << (FloatCast - 44)) | (1L << (For - 44)) | (1L << (Foreach - 44)) | (1L << (Function - 44)) | (1L << (Global - 44)) | (1L << (Goto - 44)) | (1L << (If - 44)) | (1L << (Implements - 44)) | (1L << (Import - 44)) | (1L << (Include - 44)) | (1L << (IncludeOnce - 44)) | (1L << (InstanceOf - 44)) | (1L << (InsteadOf - 44)) | (1L << (Int8Cast - 44)) | (1L << (Int16Cast - 44)) | (1L << (Int64Type - 44)) | (1L << (IntType - 44)) | (1L << (Interface - 44)) | (1L << (IsSet - 44)) | (1L << (List - 44)) | (1L << (LogicalAnd - 44)) | (1L << (LogicalOr - 44)) | (1L << (LogicalXor - 44)) | (1L << (Namespace - 44)) | (1L << (New - 44)) | (1L << (Null - 44)) | (1L << (ObjectType - 44)) | (1L << (Parent_ - 44)) | (1L << (Partial - 44)) | (1L << (Print - 44)))) != 0) || ((((_la - 108)) & ~0x3f) == 0 && ((1L << (_la - 108)) & ((1L << (Private - 108)) | (1L << (Protected - 108)) | (1L << (Public - 108)) | (1L << (Require - 108)) | (1L << (RequireOnce - 108)) | (1L << (Resource - 108)) | (1L << (Return - 108)) | (1L << (Static - 108)) | (1L << (StringType - 108)) | (1L << (Switch - 108)) | (1L << (Throw - 108)) | (1L << (Trait - 108)) | (1L << (Try - 108)) | (1L << (Typeof - 108)) | (1L << (UintCast - 108)) | (1L << (UnicodeCast - 108)) | (1L << (Unset - 108)) | (1L << (Use - 108)) | (1L << (Var - 108)) | (1L << (While - 108)) | (1L << (Yield - 108)) | (1L << (From - 108)) | (1L << (LambdaFn - 108)) | (1L << (Get - 108)) | (1L << (Set - 108)) | (1L << (Call - 108)) | (1L << (CallStatic - 108)) | (1L << (Constructor - 108)) | (1L << (Destruct - 108)) | (1L << (Wakeup - 108)) | (1L << (Sleep - 108)) | (1L << (Autoload - 108)) | (1L << (IsSet__ - 108)) | (1L << (Unset__ - 108)) | (1L << (ToString__ - 108)) | (1L << (Invoke - 108)) | (1L << (SetState - 108)) | (1L << (Clone__ - 108)) | (1L << (DebugInfo - 108)) | (1L << (Namespace__ - 108)) | (1L << (Class__ - 108)) | (1L << (Traic__ - 108)) | (1L << (Function__ - 108)) | (1L << (Method__ - 108)) | (1L << (Line__ - 108)) | (1L << (File__ - 108)) | (1L << (Dir__ - 108)) | (1L << (Inc - 108)) | (1L << (Dec - 108)))) != 0) || ((((_la - 188)) & ~0x3f) == 0 && ((1L << (_la - 188)) & ((1L << (NamespaceSeparator - 188)) | (1L << (Bang - 188)) | (1L << (Plus - 188)) | (1L << (Minus - 188)) | (1L << (Tilde - 188)) | (1L << (SuppressWarnings - 188)) | (1L << (Dollar - 188)) | (1L << (OpenRoundBracket - 188)) | (1L << (OpenSquareBracket - 188)) | (1L << (VarName - 188)) | (1L << (Label - 188)) | (1L << (Octal - 188)) | (1L << (Decimal - 188)) | (1L << (Real - 188)) | (1L << (Hex - 188)) | (1L << (Binary - 188)) | (1L << (BackQuoteString - 188)) | (1L << (SingleQuoteString - 188)) | (1L << (DoubleQuote - 188)) | (1L << (StartNowDoc - 188)) | (1L << (StartHereDoc - 188)))) != 0)) {
				{
				setState(777);
				expression(0);
				}
			}

			setState(780);
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
			setState(782);
			expression(0);
			setState(783);
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
			setState(785);
			match(Unset);
			setState(786);
			match(OpenRoundBracket);
			setState(787);
			chainList();
			setState(788);
			match(CloseRoundBracket);
			setState(789);
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
			setState(791);
			match(Foreach);
			setState(830);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,72,_ctx) ) {
			case 1:
				{
				setState(792);
				match(OpenRoundBracket);
				setState(793);
				chain();
				setState(794);
				match(As);
				setState(796);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Ampersand) {
					{
					setState(795);
					match(Ampersand);
					}
				}

				setState(798);
				assignable();
				setState(804);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==DoubleArrow) {
					{
					setState(799);
					match(DoubleArrow);
					setState(801);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==Ampersand) {
						{
						setState(800);
						match(Ampersand);
						}
					}

					setState(803);
					chain();
					}
				}

				setState(806);
				match(CloseRoundBracket);
				}
				break;
			case 2:
				{
				setState(808);
				match(OpenRoundBracket);
				setState(809);
				expression(0);
				setState(810);
				match(As);
				setState(811);
				assignable();
				setState(817);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==DoubleArrow) {
					{
					setState(812);
					match(DoubleArrow);
					setState(814);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==Ampersand) {
						{
						setState(813);
						match(Ampersand);
						}
					}

					setState(816);
					chain();
					}
				}

				setState(819);
				match(CloseRoundBracket);
				}
				break;
			case 3:
				{
				setState(821);
				match(OpenRoundBracket);
				setState(822);
				chain();
				setState(823);
				match(As);
				setState(824);
				match(List);
				setState(825);
				match(OpenRoundBracket);
				setState(826);
				assignmentList();
				setState(827);
				match(CloseRoundBracket);
				setState(828);
				match(CloseRoundBracket);
				}
				break;
			}
			setState(838);
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
				setState(832);
				statement();
				}
				break;
			case Colon:
				{
				setState(833);
				match(Colon);
				setState(834);
				innerStatementList();
				setState(835);
				match(EndForeach);
				setState(836);
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
			setState(840);
			match(Try);
			setState(841);
			blockStatement();
			setState(857);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,77,_ctx) ) {
			case 1:
				{
				setState(843); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(842);
						catchClause();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(845); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,74,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(848);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,75,_ctx) ) {
				case 1:
					{
					setState(847);
					finallyStatement();
					}
					break;
				}
				}
				break;
			case 2:
				{
				setState(853);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Catch) {
					{
					{
					setState(850);
					catchClause();
					}
					}
					setState(855);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(856);
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
			setState(859);
			match(Catch);
			setState(860);
			match(OpenRoundBracket);
			setState(861);
			qualifiedStaticTypeRef();
			setState(866);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Pipe) {
				{
				{
				setState(862);
				match(Pipe);
				setState(863);
				qualifiedStaticTypeRef();
				}
				}
				setState(868);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(869);
			match(VarName);
			setState(870);
			match(CloseRoundBracket);
			setState(871);
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
			setState(873);
			match(Finally);
			setState(874);
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
			setState(876);
			match(Throw);
			setState(877);
			expression(0);
			setState(878);
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
			setState(880);
			match(Goto);
			setState(881);
			identifier();
			setState(882);
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
			setState(884);
			match(Declare);
			setState(885);
			match(OpenRoundBracket);
			setState(886);
			declareList();
			setState(887);
			match(CloseRoundBracket);
			setState(894);
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
				setState(888);
				statement();
				}
				break;
			case Colon:
				{
				setState(889);
				match(Colon);
				setState(890);
				innerStatementList();
				setState(891);
				match(EndDeclare);
				setState(892);
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
			setState(897); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(896);
					inlineHtml();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(899); 
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
			setState(903);
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
				setState(901);
				htmlElements();
				}
				break;
			case ScriptText:
				enterOuterAlt(_localctx, 2);
				{
				setState(902);
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
			setState(905);
			identifierInititalizer();
			setState(910);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(906);
				match(Comma);
				setState(907);
				identifierInititalizer();
				}
				}
				setState(912);
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
			setState(914);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 44)) & ~0x3f) == 0 && ((1L << (_la - 44)) & ((1L << (Abstract - 44)) | (1L << (Array - 44)) | (1L << (As - 44)) | (1L << (BinaryCast - 44)) | (1L << (BoolType - 44)) | (1L << (BooleanConstant - 44)) | (1L << (Break - 44)) | (1L << (Callable - 44)) | (1L << (Case - 44)) | (1L << (Catch - 44)) | (1L << (Class - 44)) | (1L << (Clone - 44)) | (1L << (Const - 44)) | (1L << (Continue - 44)) | (1L << (Declare - 44)) | (1L << (Default - 44)) | (1L << (Do - 44)) | (1L << (DoubleCast - 44)) | (1L << (DoubleType - 44)) | (1L << (Echo - 44)) | (1L << (Else - 44)) | (1L << (ElseIf - 44)) | (1L << (Empty - 44)) | (1L << (EndDeclare - 44)) | (1L << (EndFor - 44)) | (1L << (EndForeach - 44)) | (1L << (EndIf - 44)) | (1L << (EndSwitch - 44)) | (1L << (EndWhile - 44)) | (1L << (Eval - 44)) | (1L << (Exit - 44)) | (1L << (Extends - 44)) | (1L << (Final - 44)) | (1L << (Finally - 44)) | (1L << (FloatCast - 44)) | (1L << (For - 44)) | (1L << (Foreach - 44)) | (1L << (Function - 44)) | (1L << (Global - 44)) | (1L << (Goto - 44)) | (1L << (If - 44)) | (1L << (Implements - 44)) | (1L << (Import - 44)) | (1L << (Include - 44)) | (1L << (IncludeOnce - 44)) | (1L << (InstanceOf - 44)) | (1L << (InsteadOf - 44)) | (1L << (Int8Cast - 44)) | (1L << (Int16Cast - 44)) | (1L << (Int64Type - 44)) | (1L << (IntType - 44)) | (1L << (Interface - 44)) | (1L << (IsSet - 44)) | (1L << (List - 44)) | (1L << (LogicalAnd - 44)) | (1L << (LogicalOr - 44)) | (1L << (LogicalXor - 44)) | (1L << (Namespace - 44)) | (1L << (New - 44)) | (1L << (Null - 44)) | (1L << (ObjectType - 44)) | (1L << (Parent_ - 44)) | (1L << (Partial - 44)) | (1L << (Print - 44)))) != 0) || ((((_la - 108)) & ~0x3f) == 0 && ((1L << (_la - 108)) & ((1L << (Private - 108)) | (1L << (Protected - 108)) | (1L << (Public - 108)) | (1L << (Require - 108)) | (1L << (RequireOnce - 108)) | (1L << (Resource - 108)) | (1L << (Return - 108)) | (1L << (Static - 108)) | (1L << (StringType - 108)) | (1L << (Switch - 108)) | (1L << (Throw - 108)) | (1L << (Trait - 108)) | (1L << (Try - 108)) | (1L << (Typeof - 108)) | (1L << (UintCast - 108)) | (1L << (UnicodeCast - 108)) | (1L << (Unset - 108)) | (1L << (Use - 108)) | (1L << (Var - 108)) | (1L << (While - 108)) | (1L << (Yield - 108)) | (1L << (From - 108)) | (1L << (Get - 108)) | (1L << (Set - 108)) | (1L << (Call - 108)) | (1L << (CallStatic - 108)) | (1L << (Constructor - 108)) | (1L << (Destruct - 108)) | (1L << (Wakeup - 108)) | (1L << (Sleep - 108)) | (1L << (Autoload - 108)) | (1L << (IsSet__ - 108)) | (1L << (Unset__ - 108)) | (1L << (ToString__ - 108)) | (1L << (Invoke - 108)) | (1L << (SetState - 108)) | (1L << (Clone__ - 108)) | (1L << (DebugInfo - 108)) | (1L << (Namespace__ - 108)) | (1L << (Class__ - 108)) | (1L << (Traic__ - 108)) | (1L << (Function__ - 108)) | (1L << (Method__ - 108)) | (1L << (Line__ - 108)) | (1L << (File__ - 108)) | (1L << (Dir__ - 108)))) != 0) || ((((_la - 188)) & ~0x3f) == 0 && ((1L << (_la - 188)) & ((1L << (NamespaceSeparator - 188)) | (1L << (Ellipsis - 188)) | (1L << (Ampersand - 188)) | (1L << (QuestionMark - 188)) | (1L << (OpenSquareBracket - 188)) | (1L << (VarName - 188)) | (1L << (Label - 188)))) != 0)) {
				{
				setState(913);
				formalParameter();
				}
			}

			setState(920);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(916);
				match(Comma);
				setState(917);
				formalParameter();
				}
				}
				setState(922);
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
			setState(923);
			attributes();
			setState(925);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==QuestionMark) {
				{
				setState(924);
				match(QuestionMark);
				}
			}

			setState(928);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 44)) & ~0x3f) == 0 && ((1L << (_la - 44)) & ((1L << (Abstract - 44)) | (1L << (Array - 44)) | (1L << (As - 44)) | (1L << (BinaryCast - 44)) | (1L << (BoolType - 44)) | (1L << (BooleanConstant - 44)) | (1L << (Break - 44)) | (1L << (Callable - 44)) | (1L << (Case - 44)) | (1L << (Catch - 44)) | (1L << (Class - 44)) | (1L << (Clone - 44)) | (1L << (Const - 44)) | (1L << (Continue - 44)) | (1L << (Declare - 44)) | (1L << (Default - 44)) | (1L << (Do - 44)) | (1L << (DoubleCast - 44)) | (1L << (DoubleType - 44)) | (1L << (Echo - 44)) | (1L << (Else - 44)) | (1L << (ElseIf - 44)) | (1L << (Empty - 44)) | (1L << (EndDeclare - 44)) | (1L << (EndFor - 44)) | (1L << (EndForeach - 44)) | (1L << (EndIf - 44)) | (1L << (EndSwitch - 44)) | (1L << (EndWhile - 44)) | (1L << (Eval - 44)) | (1L << (Exit - 44)) | (1L << (Extends - 44)) | (1L << (Final - 44)) | (1L << (Finally - 44)) | (1L << (FloatCast - 44)) | (1L << (For - 44)) | (1L << (Foreach - 44)) | (1L << (Function - 44)) | (1L << (Global - 44)) | (1L << (Goto - 44)) | (1L << (If - 44)) | (1L << (Implements - 44)) | (1L << (Import - 44)) | (1L << (Include - 44)) | (1L << (IncludeOnce - 44)) | (1L << (InstanceOf - 44)) | (1L << (InsteadOf - 44)) | (1L << (Int8Cast - 44)) | (1L << (Int16Cast - 44)) | (1L << (Int64Type - 44)) | (1L << (IntType - 44)) | (1L << (Interface - 44)) | (1L << (IsSet - 44)) | (1L << (List - 44)) | (1L << (LogicalAnd - 44)) | (1L << (LogicalOr - 44)) | (1L << (LogicalXor - 44)) | (1L << (Namespace - 44)) | (1L << (New - 44)) | (1L << (Null - 44)) | (1L << (ObjectType - 44)) | (1L << (Parent_ - 44)) | (1L << (Partial - 44)) | (1L << (Print - 44)))) != 0) || ((((_la - 108)) & ~0x3f) == 0 && ((1L << (_la - 108)) & ((1L << (Private - 108)) | (1L << (Protected - 108)) | (1L << (Public - 108)) | (1L << (Require - 108)) | (1L << (RequireOnce - 108)) | (1L << (Resource - 108)) | (1L << (Return - 108)) | (1L << (Static - 108)) | (1L << (StringType - 108)) | (1L << (Switch - 108)) | (1L << (Throw - 108)) | (1L << (Trait - 108)) | (1L << (Try - 108)) | (1L << (Typeof - 108)) | (1L << (UintCast - 108)) | (1L << (UnicodeCast - 108)) | (1L << (Unset - 108)) | (1L << (Use - 108)) | (1L << (Var - 108)) | (1L << (While - 108)) | (1L << (Yield - 108)) | (1L << (From - 108)) | (1L << (Get - 108)) | (1L << (Set - 108)) | (1L << (Call - 108)) | (1L << (CallStatic - 108)) | (1L << (Constructor - 108)) | (1L << (Destruct - 108)) | (1L << (Wakeup - 108)) | (1L << (Sleep - 108)) | (1L << (Autoload - 108)) | (1L << (IsSet__ - 108)) | (1L << (Unset__ - 108)) | (1L << (ToString__ - 108)) | (1L << (Invoke - 108)) | (1L << (SetState - 108)) | (1L << (Clone__ - 108)) | (1L << (DebugInfo - 108)) | (1L << (Namespace__ - 108)) | (1L << (Class__ - 108)) | (1L << (Traic__ - 108)) | (1L << (Function__ - 108)) | (1L << (Method__ - 108)) | (1L << (Line__ - 108)) | (1L << (File__ - 108)) | (1L << (Dir__ - 108)))) != 0) || _la==NamespaceSeparator || _la==Label) {
				{
				setState(927);
				typeHint();
				}
			}

			setState(931);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Ampersand) {
				{
				setState(930);
				match(Ampersand);
				}
			}

			setState(934);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Ellipsis) {
				{
				setState(933);
				match(Ellipsis);
				}
			}

			setState(936);
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
			setState(941);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,89,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(938);
				qualifiedStaticTypeRef();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(939);
				match(Callable);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(940);
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
			setState(943);
			match(Global);
			setState(944);
			globalVar();
			setState(949);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(945);
				match(Comma);
				setState(946);
				globalVar();
				}
				}
				setState(951);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(952);
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
			setState(962);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,91,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(954);
				match(VarName);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(955);
				match(Dollar);
				setState(956);
				chain();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(957);
				match(Dollar);
				setState(958);
				match(OpenCurlyBracket);
				setState(959);
				expression(0);
				setState(960);
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
			setState(964);
			match(Echo);
			setState(965);
			expressionList();
			setState(966);
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
			setState(968);
			match(Static);
			setState(969);
			variableInitializer();
			setState(974);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(970);
				match(Comma);
				setState(971);
				variableInitializer();
				}
				}
				setState(976);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(977);
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
		public FuncToDocContext funcToDoc() {
			return getRuleContext(FuncToDocContext.class,0);
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
			setState(1037);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,102,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(979);
				attributes();
				setState(980);
				propertyModifiers();
				setState(982);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 44)) & ~0x3f) == 0 && ((1L << (_la - 44)) & ((1L << (Abstract - 44)) | (1L << (Array - 44)) | (1L << (As - 44)) | (1L << (BinaryCast - 44)) | (1L << (BoolType - 44)) | (1L << (BooleanConstant - 44)) | (1L << (Break - 44)) | (1L << (Callable - 44)) | (1L << (Case - 44)) | (1L << (Catch - 44)) | (1L << (Class - 44)) | (1L << (Clone - 44)) | (1L << (Const - 44)) | (1L << (Continue - 44)) | (1L << (Declare - 44)) | (1L << (Default - 44)) | (1L << (Do - 44)) | (1L << (DoubleCast - 44)) | (1L << (DoubleType - 44)) | (1L << (Echo - 44)) | (1L << (Else - 44)) | (1L << (ElseIf - 44)) | (1L << (Empty - 44)) | (1L << (EndDeclare - 44)) | (1L << (EndFor - 44)) | (1L << (EndForeach - 44)) | (1L << (EndIf - 44)) | (1L << (EndSwitch - 44)) | (1L << (EndWhile - 44)) | (1L << (Eval - 44)) | (1L << (Exit - 44)) | (1L << (Extends - 44)) | (1L << (Final - 44)) | (1L << (Finally - 44)) | (1L << (FloatCast - 44)) | (1L << (For - 44)) | (1L << (Foreach - 44)) | (1L << (Function - 44)) | (1L << (Global - 44)) | (1L << (Goto - 44)) | (1L << (If - 44)) | (1L << (Implements - 44)) | (1L << (Import - 44)) | (1L << (Include - 44)) | (1L << (IncludeOnce - 44)) | (1L << (InstanceOf - 44)) | (1L << (InsteadOf - 44)) | (1L << (Int8Cast - 44)) | (1L << (Int16Cast - 44)) | (1L << (Int64Type - 44)) | (1L << (IntType - 44)) | (1L << (Interface - 44)) | (1L << (IsSet - 44)) | (1L << (List - 44)) | (1L << (LogicalAnd - 44)) | (1L << (LogicalOr - 44)) | (1L << (LogicalXor - 44)) | (1L << (Namespace - 44)) | (1L << (New - 44)) | (1L << (Null - 44)) | (1L << (ObjectType - 44)) | (1L << (Parent_ - 44)) | (1L << (Partial - 44)) | (1L << (Print - 44)))) != 0) || ((((_la - 108)) & ~0x3f) == 0 && ((1L << (_la - 108)) & ((1L << (Private - 108)) | (1L << (Protected - 108)) | (1L << (Public - 108)) | (1L << (Require - 108)) | (1L << (RequireOnce - 108)) | (1L << (Resource - 108)) | (1L << (Return - 108)) | (1L << (Static - 108)) | (1L << (StringType - 108)) | (1L << (Switch - 108)) | (1L << (Throw - 108)) | (1L << (Trait - 108)) | (1L << (Try - 108)) | (1L << (Typeof - 108)) | (1L << (UintCast - 108)) | (1L << (UnicodeCast - 108)) | (1L << (Unset - 108)) | (1L << (Use - 108)) | (1L << (Var - 108)) | (1L << (While - 108)) | (1L << (Yield - 108)) | (1L << (From - 108)) | (1L << (Get - 108)) | (1L << (Set - 108)) | (1L << (Call - 108)) | (1L << (CallStatic - 108)) | (1L << (Constructor - 108)) | (1L << (Destruct - 108)) | (1L << (Wakeup - 108)) | (1L << (Sleep - 108)) | (1L << (Autoload - 108)) | (1L << (IsSet__ - 108)) | (1L << (Unset__ - 108)) | (1L << (ToString__ - 108)) | (1L << (Invoke - 108)) | (1L << (SetState - 108)) | (1L << (Clone__ - 108)) | (1L << (DebugInfo - 108)) | (1L << (Namespace__ - 108)) | (1L << (Class__ - 108)) | (1L << (Traic__ - 108)) | (1L << (Function__ - 108)) | (1L << (Method__ - 108)) | (1L << (Line__ - 108)) | (1L << (File__ - 108)) | (1L << (Dir__ - 108)))) != 0) || _la==NamespaceSeparator || _la==Label) {
					{
					setState(981);
					typeHint();
					}
				}

				setState(984);
				variableInitializer();
				setState(989);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Comma) {
					{
					{
					setState(985);
					match(Comma);
					setState(986);
					variableInitializer();
					}
					}
					setState(991);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(992);
				match(SemiColon);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(994);
				attributes();
				setState(996);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Abstract || ((((_la - 76)) & ~0x3f) == 0 && ((1L << (_la - 76)) & ((1L << (Final - 76)) | (1L << (Private - 76)) | (1L << (Protected - 76)) | (1L << (Public - 76)) | (1L << (Static - 76)))) != 0)) {
					{
					setState(995);
					memberModifiers();
					}
				}

				setState(998);
				match(Const);
				setState(1000);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,96,_ctx) ) {
				case 1:
					{
					setState(999);
					typeHint();
					}
					break;
				}
				setState(1002);
				identifierInititalizer();
				setState(1007);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Comma) {
					{
					{
					setState(1003);
					match(Comma);
					setState(1004);
					identifierInititalizer();
					}
					}
					setState(1009);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1010);
				match(SemiColon);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1012);
				attributes();
				setState(1014);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Abstract || ((((_la - 76)) & ~0x3f) == 0 && ((1L << (_la - 76)) & ((1L << (Final - 76)) | (1L << (Private - 76)) | (1L << (Protected - 76)) | (1L << (Public - 76)) | (1L << (Static - 76)))) != 0)) {
					{
					setState(1013);
					memberModifiers();
					}
				}

				setState(1016);
				match(Function);
				setState(1018);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Ampersand) {
					{
					setState(1017);
					match(Ampersand);
					}
				}

				setState(1020);
				identifier();
				setState(1022);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Lgeneric) {
					{
					setState(1021);
					typeParameterListInBrackets();
					}
				}

				setState(1024);
				match(OpenRoundBracket);
				setState(1025);
				formalParameterList();
				setState(1026);
				match(CloseRoundBracket);
				setState(1028);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Colon) {
					{
					setState(1027);
					baseCtorCall();
					}
				}

				setState(1030);
				methodBody();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1032);
				match(Use);
				setState(1033);
				qualifiedNamespaceNameList();
				setState(1034);
				traitAdaptations();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1036);
				funcToDoc();
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
			setState(1048);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SemiColon:
				enterOuterAlt(_localctx, 1);
				{
				setState(1039);
				match(SemiColon);
				}
				break;
			case OpenCurlyBracket:
				enterOuterAlt(_localctx, 2);
				{
				setState(1040);
				match(OpenCurlyBracket);
				setState(1044);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 44)) & ~0x3f) == 0 && ((1L << (_la - 44)) & ((1L << (Abstract - 44)) | (1L << (Array - 44)) | (1L << (As - 44)) | (1L << (BinaryCast - 44)) | (1L << (BoolType - 44)) | (1L << (BooleanConstant - 44)) | (1L << (Break - 44)) | (1L << (Callable - 44)) | (1L << (Case - 44)) | (1L << (Catch - 44)) | (1L << (Class - 44)) | (1L << (Clone - 44)) | (1L << (Const - 44)) | (1L << (Continue - 44)) | (1L << (Declare - 44)) | (1L << (Default - 44)) | (1L << (Do - 44)) | (1L << (DoubleCast - 44)) | (1L << (DoubleType - 44)) | (1L << (Echo - 44)) | (1L << (Else - 44)) | (1L << (ElseIf - 44)) | (1L << (Empty - 44)) | (1L << (EndDeclare - 44)) | (1L << (EndFor - 44)) | (1L << (EndForeach - 44)) | (1L << (EndIf - 44)) | (1L << (EndSwitch - 44)) | (1L << (EndWhile - 44)) | (1L << (Eval - 44)) | (1L << (Exit - 44)) | (1L << (Extends - 44)) | (1L << (Final - 44)) | (1L << (Finally - 44)) | (1L << (FloatCast - 44)) | (1L << (For - 44)) | (1L << (Foreach - 44)) | (1L << (Function - 44)) | (1L << (Global - 44)) | (1L << (Goto - 44)) | (1L << (If - 44)) | (1L << (Implements - 44)) | (1L << (Import - 44)) | (1L << (Include - 44)) | (1L << (IncludeOnce - 44)) | (1L << (InstanceOf - 44)) | (1L << (InsteadOf - 44)) | (1L << (Int8Cast - 44)) | (1L << (Int16Cast - 44)) | (1L << (Int64Type - 44)) | (1L << (IntType - 44)) | (1L << (Interface - 44)) | (1L << (IsSet - 44)) | (1L << (List - 44)) | (1L << (LogicalAnd - 44)) | (1L << (LogicalOr - 44)) | (1L << (LogicalXor - 44)) | (1L << (Namespace - 44)) | (1L << (New - 44)) | (1L << (Null - 44)) | (1L << (ObjectType - 44)) | (1L << (Parent_ - 44)) | (1L << (Partial - 44)) | (1L << (Print - 44)))) != 0) || ((((_la - 108)) & ~0x3f) == 0 && ((1L << (_la - 108)) & ((1L << (Private - 108)) | (1L << (Protected - 108)) | (1L << (Public - 108)) | (1L << (Require - 108)) | (1L << (RequireOnce - 108)) | (1L << (Resource - 108)) | (1L << (Return - 108)) | (1L << (Static - 108)) | (1L << (StringType - 108)) | (1L << (Switch - 108)) | (1L << (Throw - 108)) | (1L << (Trait - 108)) | (1L << (Try - 108)) | (1L << (Typeof - 108)) | (1L << (UintCast - 108)) | (1L << (UnicodeCast - 108)) | (1L << (Unset - 108)) | (1L << (Use - 108)) | (1L << (Var - 108)) | (1L << (While - 108)) | (1L << (Yield - 108)) | (1L << (From - 108)) | (1L << (Get - 108)) | (1L << (Set - 108)) | (1L << (Call - 108)) | (1L << (CallStatic - 108)) | (1L << (Constructor - 108)) | (1L << (Destruct - 108)) | (1L << (Wakeup - 108)) | (1L << (Sleep - 108)) | (1L << (Autoload - 108)) | (1L << (IsSet__ - 108)) | (1L << (Unset__ - 108)) | (1L << (ToString__ - 108)) | (1L << (Invoke - 108)) | (1L << (SetState - 108)) | (1L << (Clone__ - 108)) | (1L << (DebugInfo - 108)) | (1L << (Namespace__ - 108)) | (1L << (Class__ - 108)) | (1L << (Traic__ - 108)) | (1L << (Function__ - 108)) | (1L << (Method__ - 108)) | (1L << (Line__ - 108)) | (1L << (File__ - 108)) | (1L << (Dir__ - 108)))) != 0) || _la==NamespaceSeparator || _la==Label) {
					{
					{
					setState(1041);
					traitAdaptationStatement();
					}
					}
					setState(1046);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1047);
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
			setState(1052);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,105,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1050);
				traitPrecedence();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1051);
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
			setState(1054);
			qualifiedNamespaceName();
			setState(1055);
			match(DoubleColon);
			setState(1056);
			identifier();
			setState(1057);
			match(InsteadOf);
			setState(1058);
			qualifiedNamespaceNameList();
			setState(1059);
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
			setState(1061);
			traitMethodReference();
			setState(1062);
			match(As);
			setState(1068);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,107,_ctx) ) {
			case 1:
				{
				setState(1063);
				memberModifier();
				}
				break;
			case 2:
				{
				setState(1065);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,106,_ctx) ) {
				case 1:
					{
					setState(1064);
					memberModifier();
					}
					break;
				}
				setState(1067);
				identifier();
				}
				break;
			}
			setState(1070);
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
			setState(1075);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,108,_ctx) ) {
			case 1:
				{
				setState(1072);
				qualifiedNamespaceName();
				setState(1073);
				match(DoubleColon);
				}
				break;
			}
			setState(1077);
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
			setState(1079);
			match(Colon);
			setState(1080);
			identifier();
			setState(1082);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OpenRoundBracket) {
				{
				setState(1081);
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
			setState(1086);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SemiColon:
				enterOuterAlt(_localctx, 1);
				{
				setState(1084);
				match(SemiColon);
				}
				break;
			case OpenCurlyBracket:
				enterOuterAlt(_localctx, 2);
				{
				setState(1085);
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
			setState(1090);
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
				setState(1088);
				memberModifiers();
				}
				break;
			case Var:
				enterOuterAlt(_localctx, 2);
				{
				setState(1089);
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
			setState(1093); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(1092);
					memberModifier();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1095); 
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
			setState(1097);
			match(VarName);
			setState(1100);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Eq) {
				{
				setState(1098);
				match(Eq);
				setState(1099);
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
			setState(1102);
			identifier();
			setState(1103);
			match(Eq);
			setState(1104);
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
			setState(1106);
			attributes();
			setState(1107);
			match(Const);
			setState(1108);
			identifierInititalizer();
			setState(1113);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(1109);
				match(Comma);
				setState(1110);
				identifierInititalizer();
				}
				}
				setState(1115);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1116);
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
			setState(1118);
			expression(0);
			setState(1123);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(1119);
				match(Comma);
				setState(1120);
				expression(0);
				}
				}
				setState(1125);
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
			setState(1126);
			match(OpenRoundBracket);
			setState(1129);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,116,_ctx) ) {
			case 1:
				{
				setState(1127);
				expression(0);
				}
				break;
			case 2:
				{
				setState(1128);
				yieldExpression();
				}
				break;
			}
			setState(1131);
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
			setState(1210);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,119,_ctx) ) {
			case 1:
				{
				_localctx = new CloneExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(1134);
				match(Clone);
				setState(1135);
				expression(45);
				}
				break;
			case 2:
				{
				_localctx = new NewExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1136);
				newExpr();
				}
				break;
			case 3:
				{
				_localctx = new IndexerExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1137);
				stringConstant();
				setState(1138);
				match(OpenSquareBracket);
				setState(1139);
				expression(0);
				setState(1140);
				match(CloseSquareBracket);
				}
				break;
			case 4:
				{
				_localctx = new CastExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1142);
				match(OpenRoundBracket);
				setState(1143);
				castOperation();
				setState(1144);
				match(CloseRoundBracket);
				setState(1145);
				expression(42);
				}
				break;
			case 5:
				{
				_localctx = new UnaryOperatorExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1147);
				_la = _input.LA(1);
				if ( !(_la==Tilde || _la==SuppressWarnings) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1148);
				expression(41);
				}
				break;
			case 6:
				{
				_localctx = new UnaryOperatorExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1149);
				_la = _input.LA(1);
				if ( !(((((_la - 194)) & ~0x3f) == 0 && ((1L << (_la - 194)) & ((1L << (Bang - 194)) | (1L << (Plus - 194)) | (1L << (Minus - 194)))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1150);
				expression(40);
				}
				break;
			case 7:
				{
				_localctx = new PrefixIncDecExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
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
				setState(1152);
				chain();
				}
				break;
			case 8:
				{
				_localctx = new PostfixIncDecExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1153);
				chain();
				setState(1154);
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
				setState(1156);
				match(Print);
				setState(1157);
				expression(37);
				}
				break;
			case 10:
				{
				_localctx = new ChainExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1158);
				chain();
				}
				break;
			case 11:
				{
				_localctx = new ScalarExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1159);
				constant();
				}
				break;
			case 12:
				{
				_localctx = new ScalarExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1160);
				string();
				}
				break;
			case 13:
				{
				_localctx = new ScalarExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1161);
				match(Label);
				}
				break;
			case 14:
				{
				_localctx = new BackQuoteStringExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1162);
				match(BackQuoteString);
				}
				break;
			case 15:
				{
				_localctx = new ParenthesisExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1163);
				parentheses();
				}
				break;
			case 16:
				{
				_localctx = new ArrayCreationExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1164);
				arrayCreation();
				}
				break;
			case 17:
				{
				_localctx = new SpecialWordExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1165);
				match(Yield);
				}
				break;
			case 18:
				{
				_localctx = new SpecialWordExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1166);
				match(List);
				setState(1167);
				match(OpenRoundBracket);
				setState(1168);
				assignmentList();
				setState(1169);
				match(CloseRoundBracket);
				setState(1170);
				match(Eq);
				setState(1171);
				expression(28);
				}
				break;
			case 19:
				{
				_localctx = new SpecialWordExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1173);
				match(IsSet);
				setState(1174);
				match(OpenRoundBracket);
				setState(1175);
				chainList();
				setState(1176);
				match(CloseRoundBracket);
				}
				break;
			case 20:
				{
				_localctx = new SpecialWordExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1178);
				match(Empty);
				setState(1179);
				match(OpenRoundBracket);
				setState(1180);
				chain();
				setState(1181);
				match(CloseRoundBracket);
				}
				break;
			case 21:
				{
				_localctx = new SpecialWordExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1183);
				match(Eval);
				setState(1184);
				match(OpenRoundBracket);
				setState(1185);
				expression(0);
				setState(1186);
				match(CloseRoundBracket);
				}
				break;
			case 22:
				{
				_localctx = new SpecialWordExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1188);
				match(Exit);
				setState(1192);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,117,_ctx) ) {
				case 1:
					{
					setState(1189);
					match(OpenRoundBracket);
					setState(1190);
					match(CloseRoundBracket);
					}
					break;
				case 2:
					{
					setState(1191);
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
				setState(1194);
				_la = _input.LA(1);
				if ( !(_la==Include || _la==IncludeOnce) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1195);
				expression(23);
				}
				break;
			case 24:
				{
				_localctx = new SpecialWordExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1196);
				_la = _input.LA(1);
				if ( !(_la==Require || _la==RequireOnce) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1197);
				expression(22);
				}
				break;
			case 25:
				{
				_localctx = new LambdaFunctionExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1198);
				lambdaFunctionExpr();
				}
				break;
			case 26:
				{
				_localctx = new AssignmentExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1199);
				assignable();
				setState(1200);
				assignmentOperator();
				setState(1201);
				expression(5);
				}
				break;
			case 27:
				{
				_localctx = new AssignmentExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1203);
				assignable();
				setState(1204);
				match(Eq);
				setState(1205);
				match(Ampersand);
				setState(1208);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,118,_ctx) ) {
				case 1:
					{
					setState(1206);
					chain();
					}
					break;
				case 2:
					{
					setState(1207);
					newExpr();
					}
					break;
				}
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(1272);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,122,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1270);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,121,_ctx) ) {
					case 1:
						{
						_localctx = new ArithmeticExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1212);
						if (!(precpred(_ctx, 20))) throw new FailedPredicateException(this, "precpred(_ctx, 20)");
						setState(1213);
						((ArithmeticExpressionContext)_localctx).op = match(Pow);
						setState(1214);
						expression(20);
						}
						break;
					case 2:
						{
						_localctx = new ArithmeticExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1215);
						if (!(precpred(_ctx, 18))) throw new FailedPredicateException(this, "precpred(_ctx, 18)");
						setState(1216);
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
						setState(1217);
						expression(19);
						}
						break;
					case 3:
						{
						_localctx = new ArithmeticExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1218);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(1219);
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
						setState(1220);
						expression(18);
						}
						break;
					case 4:
						{
						_localctx = new ComparisonExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1221);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(1222);
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
						setState(1223);
						expression(17);
						}
						break;
					case 5:
						{
						_localctx = new ComparisonExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1224);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(1225);
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
						setState(1226);
						expression(16);
						}
						break;
					case 6:
						{
						_localctx = new ComparisonExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1227);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(1228);
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
						setState(1229);
						expression(15);
						}
						break;
					case 7:
						{
						_localctx = new BitwiseExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1230);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(1231);
						((BitwiseExpressionContext)_localctx).op = match(Ampersand);
						setState(1232);
						expression(14);
						}
						break;
					case 8:
						{
						_localctx = new BitwiseExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1233);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(1234);
						((BitwiseExpressionContext)_localctx).op = match(Caret);
						setState(1235);
						expression(13);
						}
						break;
					case 9:
						{
						_localctx = new BitwiseExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1236);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(1237);
						((BitwiseExpressionContext)_localctx).op = match(Pipe);
						setState(1238);
						expression(12);
						}
						break;
					case 10:
						{
						_localctx = new BitwiseExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1239);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(1240);
						((BitwiseExpressionContext)_localctx).op = match(BooleanAnd);
						setState(1241);
						expression(11);
						}
						break;
					case 11:
						{
						_localctx = new BitwiseExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1242);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(1243);
						((BitwiseExpressionContext)_localctx).op = match(BooleanOr);
						setState(1244);
						expression(10);
						}
						break;
					case 12:
						{
						_localctx = new ConditionalExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1245);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(1246);
						((ConditionalExpressionContext)_localctx).op = match(QuestionMark);
						setState(1248);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (((((_la - 44)) & ~0x3f) == 0 && ((1L << (_la - 44)) & ((1L << (Abstract - 44)) | (1L << (Array - 44)) | (1L << (As - 44)) | (1L << (BinaryCast - 44)) | (1L << (BoolType - 44)) | (1L << (BooleanConstant - 44)) | (1L << (Break - 44)) | (1L << (Callable - 44)) | (1L << (Case - 44)) | (1L << (Catch - 44)) | (1L << (Class - 44)) | (1L << (Clone - 44)) | (1L << (Const - 44)) | (1L << (Continue - 44)) | (1L << (Declare - 44)) | (1L << (Default - 44)) | (1L << (Do - 44)) | (1L << (DoubleCast - 44)) | (1L << (DoubleType - 44)) | (1L << (Echo - 44)) | (1L << (Else - 44)) | (1L << (ElseIf - 44)) | (1L << (Empty - 44)) | (1L << (EndDeclare - 44)) | (1L << (EndFor - 44)) | (1L << (EndForeach - 44)) | (1L << (EndIf - 44)) | (1L << (EndSwitch - 44)) | (1L << (EndWhile - 44)) | (1L << (Eval - 44)) | (1L << (Exit - 44)) | (1L << (Extends - 44)) | (1L << (Final - 44)) | (1L << (Finally - 44)) | (1L << (FloatCast - 44)) | (1L << (For - 44)) | (1L << (Foreach - 44)) | (1L << (Function - 44)) | (1L << (Global - 44)) | (1L << (Goto - 44)) | (1L << (If - 44)) | (1L << (Implements - 44)) | (1L << (Import - 44)) | (1L << (Include - 44)) | (1L << (IncludeOnce - 44)) | (1L << (InstanceOf - 44)) | (1L << (InsteadOf - 44)) | (1L << (Int8Cast - 44)) | (1L << (Int16Cast - 44)) | (1L << (Int64Type - 44)) | (1L << (IntType - 44)) | (1L << (Interface - 44)) | (1L << (IsSet - 44)) | (1L << (List - 44)) | (1L << (LogicalAnd - 44)) | (1L << (LogicalOr - 44)) | (1L << (LogicalXor - 44)) | (1L << (Namespace - 44)) | (1L << (New - 44)) | (1L << (Null - 44)) | (1L << (ObjectType - 44)) | (1L << (Parent_ - 44)) | (1L << (Partial - 44)) | (1L << (Print - 44)))) != 0) || ((((_la - 108)) & ~0x3f) == 0 && ((1L << (_la - 108)) & ((1L << (Private - 108)) | (1L << (Protected - 108)) | (1L << (Public - 108)) | (1L << (Require - 108)) | (1L << (RequireOnce - 108)) | (1L << (Resource - 108)) | (1L << (Return - 108)) | (1L << (Static - 108)) | (1L << (StringType - 108)) | (1L << (Switch - 108)) | (1L << (Throw - 108)) | (1L << (Trait - 108)) | (1L << (Try - 108)) | (1L << (Typeof - 108)) | (1L << (UintCast - 108)) | (1L << (UnicodeCast - 108)) | (1L << (Unset - 108)) | (1L << (Use - 108)) | (1L << (Var - 108)) | (1L << (While - 108)) | (1L << (Yield - 108)) | (1L << (From - 108)) | (1L << (LambdaFn - 108)) | (1L << (Get - 108)) | (1L << (Set - 108)) | (1L << (Call - 108)) | (1L << (CallStatic - 108)) | (1L << (Constructor - 108)) | (1L << (Destruct - 108)) | (1L << (Wakeup - 108)) | (1L << (Sleep - 108)) | (1L << (Autoload - 108)) | (1L << (IsSet__ - 108)) | (1L << (Unset__ - 108)) | (1L << (ToString__ - 108)) | (1L << (Invoke - 108)) | (1L << (SetState - 108)) | (1L << (Clone__ - 108)) | (1L << (DebugInfo - 108)) | (1L << (Namespace__ - 108)) | (1L << (Class__ - 108)) | (1L << (Traic__ - 108)) | (1L << (Function__ - 108)) | (1L << (Method__ - 108)) | (1L << (Line__ - 108)) | (1L << (File__ - 108)) | (1L << (Dir__ - 108)) | (1L << (Inc - 108)) | (1L << (Dec - 108)))) != 0) || ((((_la - 188)) & ~0x3f) == 0 && ((1L << (_la - 188)) & ((1L << (NamespaceSeparator - 188)) | (1L << (Bang - 188)) | (1L << (Plus - 188)) | (1L << (Minus - 188)) | (1L << (Tilde - 188)) | (1L << (SuppressWarnings - 188)) | (1L << (Dollar - 188)) | (1L << (OpenRoundBracket - 188)) | (1L << (OpenSquareBracket - 188)) | (1L << (VarName - 188)) | (1L << (Label - 188)) | (1L << (Octal - 188)) | (1L << (Decimal - 188)) | (1L << (Real - 188)) | (1L << (Hex - 188)) | (1L << (Binary - 188)) | (1L << (BackQuoteString - 188)) | (1L << (SingleQuoteString - 188)) | (1L << (DoubleQuote - 188)) | (1L << (StartNowDoc - 188)) | (1L << (StartHereDoc - 188)))) != 0)) {
							{
							setState(1247);
							expression(0);
							}
						}

						setState(1250);
						match(Colon);
						setState(1251);
						expression(9);
						}
						break;
					case 13:
						{
						_localctx = new NullCoalescingExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1252);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(1253);
						((NullCoalescingExpressionContext)_localctx).op = match(NullCoalescing);
						setState(1254);
						expression(8);
						}
						break;
					case 14:
						{
						_localctx = new SpaceshipExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1255);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(1256);
						((SpaceshipExpressionContext)_localctx).op = match(Spaceship);
						setState(1257);
						expression(7);
						}
						break;
					case 15:
						{
						_localctx = new LogicalExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1258);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(1259);
						((LogicalExpressionContext)_localctx).op = match(LogicalAnd);
						setState(1260);
						expression(4);
						}
						break;
					case 16:
						{
						_localctx = new LogicalExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1261);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(1262);
						((LogicalExpressionContext)_localctx).op = match(LogicalXor);
						setState(1263);
						expression(3);
						}
						break;
					case 17:
						{
						_localctx = new LogicalExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1264);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(1265);
						((LogicalExpressionContext)_localctx).op = match(LogicalOr);
						setState(1266);
						expression(2);
						}
						break;
					case 18:
						{
						_localctx = new InstanceOfExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1267);
						if (!(precpred(_ctx, 19))) throw new FailedPredicateException(this, "precpred(_ctx, 19)");
						setState(1268);
						match(InstanceOf);
						setState(1269);
						typeRef();
						}
						break;
					}
					} 
				}
				setState(1274);
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
			setState(1277);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,123,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1275);
				chain();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1276);
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
			setState(1290);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Array:
				{
				setState(1279);
				match(Array);
				setState(1280);
				match(OpenRoundBracket);
				setState(1282);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 44)) & ~0x3f) == 0 && ((1L << (_la - 44)) & ((1L << (Abstract - 44)) | (1L << (Array - 44)) | (1L << (As - 44)) | (1L << (BinaryCast - 44)) | (1L << (BoolType - 44)) | (1L << (BooleanConstant - 44)) | (1L << (Break - 44)) | (1L << (Callable - 44)) | (1L << (Case - 44)) | (1L << (Catch - 44)) | (1L << (Class - 44)) | (1L << (Clone - 44)) | (1L << (Const - 44)) | (1L << (Continue - 44)) | (1L << (Declare - 44)) | (1L << (Default - 44)) | (1L << (Do - 44)) | (1L << (DoubleCast - 44)) | (1L << (DoubleType - 44)) | (1L << (Echo - 44)) | (1L << (Else - 44)) | (1L << (ElseIf - 44)) | (1L << (Empty - 44)) | (1L << (EndDeclare - 44)) | (1L << (EndFor - 44)) | (1L << (EndForeach - 44)) | (1L << (EndIf - 44)) | (1L << (EndSwitch - 44)) | (1L << (EndWhile - 44)) | (1L << (Eval - 44)) | (1L << (Exit - 44)) | (1L << (Extends - 44)) | (1L << (Final - 44)) | (1L << (Finally - 44)) | (1L << (FloatCast - 44)) | (1L << (For - 44)) | (1L << (Foreach - 44)) | (1L << (Function - 44)) | (1L << (Global - 44)) | (1L << (Goto - 44)) | (1L << (If - 44)) | (1L << (Implements - 44)) | (1L << (Import - 44)) | (1L << (Include - 44)) | (1L << (IncludeOnce - 44)) | (1L << (InstanceOf - 44)) | (1L << (InsteadOf - 44)) | (1L << (Int8Cast - 44)) | (1L << (Int16Cast - 44)) | (1L << (Int64Type - 44)) | (1L << (IntType - 44)) | (1L << (Interface - 44)) | (1L << (IsSet - 44)) | (1L << (List - 44)) | (1L << (LogicalAnd - 44)) | (1L << (LogicalOr - 44)) | (1L << (LogicalXor - 44)) | (1L << (Namespace - 44)) | (1L << (New - 44)) | (1L << (Null - 44)) | (1L << (ObjectType - 44)) | (1L << (Parent_ - 44)) | (1L << (Partial - 44)) | (1L << (Print - 44)))) != 0) || ((((_la - 108)) & ~0x3f) == 0 && ((1L << (_la - 108)) & ((1L << (Private - 108)) | (1L << (Protected - 108)) | (1L << (Public - 108)) | (1L << (Require - 108)) | (1L << (RequireOnce - 108)) | (1L << (Resource - 108)) | (1L << (Return - 108)) | (1L << (Static - 108)) | (1L << (StringType - 108)) | (1L << (Switch - 108)) | (1L << (Throw - 108)) | (1L << (Trait - 108)) | (1L << (Try - 108)) | (1L << (Typeof - 108)) | (1L << (UintCast - 108)) | (1L << (UnicodeCast - 108)) | (1L << (Unset - 108)) | (1L << (Use - 108)) | (1L << (Var - 108)) | (1L << (While - 108)) | (1L << (Yield - 108)) | (1L << (From - 108)) | (1L << (LambdaFn - 108)) | (1L << (Get - 108)) | (1L << (Set - 108)) | (1L << (Call - 108)) | (1L << (CallStatic - 108)) | (1L << (Constructor - 108)) | (1L << (Destruct - 108)) | (1L << (Wakeup - 108)) | (1L << (Sleep - 108)) | (1L << (Autoload - 108)) | (1L << (IsSet__ - 108)) | (1L << (Unset__ - 108)) | (1L << (ToString__ - 108)) | (1L << (Invoke - 108)) | (1L << (SetState - 108)) | (1L << (Clone__ - 108)) | (1L << (DebugInfo - 108)) | (1L << (Namespace__ - 108)) | (1L << (Class__ - 108)) | (1L << (Traic__ - 108)) | (1L << (Function__ - 108)) | (1L << (Method__ - 108)) | (1L << (Line__ - 108)) | (1L << (File__ - 108)) | (1L << (Dir__ - 108)) | (1L << (Inc - 108)) | (1L << (Dec - 108)))) != 0) || ((((_la - 188)) & ~0x3f) == 0 && ((1L << (_la - 188)) & ((1L << (NamespaceSeparator - 188)) | (1L << (Ampersand - 188)) | (1L << (Bang - 188)) | (1L << (Plus - 188)) | (1L << (Minus - 188)) | (1L << (Tilde - 188)) | (1L << (SuppressWarnings - 188)) | (1L << (Dollar - 188)) | (1L << (OpenRoundBracket - 188)) | (1L << (OpenSquareBracket - 188)) | (1L << (VarName - 188)) | (1L << (Label - 188)) | (1L << (Octal - 188)) | (1L << (Decimal - 188)) | (1L << (Real - 188)) | (1L << (Hex - 188)) | (1L << (Binary - 188)) | (1L << (BackQuoteString - 188)) | (1L << (SingleQuoteString - 188)) | (1L << (DoubleQuote - 188)) | (1L << (StartNowDoc - 188)) | (1L << (StartHereDoc - 188)))) != 0)) {
					{
					setState(1281);
					arrayItemList();
					}
				}

				setState(1284);
				match(CloseRoundBracket);
				}
				break;
			case OpenSquareBracket:
				{
				setState(1285);
				match(OpenSquareBracket);
				setState(1287);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 44)) & ~0x3f) == 0 && ((1L << (_la - 44)) & ((1L << (Abstract - 44)) | (1L << (Array - 44)) | (1L << (As - 44)) | (1L << (BinaryCast - 44)) | (1L << (BoolType - 44)) | (1L << (BooleanConstant - 44)) | (1L << (Break - 44)) | (1L << (Callable - 44)) | (1L << (Case - 44)) | (1L << (Catch - 44)) | (1L << (Class - 44)) | (1L << (Clone - 44)) | (1L << (Const - 44)) | (1L << (Continue - 44)) | (1L << (Declare - 44)) | (1L << (Default - 44)) | (1L << (Do - 44)) | (1L << (DoubleCast - 44)) | (1L << (DoubleType - 44)) | (1L << (Echo - 44)) | (1L << (Else - 44)) | (1L << (ElseIf - 44)) | (1L << (Empty - 44)) | (1L << (EndDeclare - 44)) | (1L << (EndFor - 44)) | (1L << (EndForeach - 44)) | (1L << (EndIf - 44)) | (1L << (EndSwitch - 44)) | (1L << (EndWhile - 44)) | (1L << (Eval - 44)) | (1L << (Exit - 44)) | (1L << (Extends - 44)) | (1L << (Final - 44)) | (1L << (Finally - 44)) | (1L << (FloatCast - 44)) | (1L << (For - 44)) | (1L << (Foreach - 44)) | (1L << (Function - 44)) | (1L << (Global - 44)) | (1L << (Goto - 44)) | (1L << (If - 44)) | (1L << (Implements - 44)) | (1L << (Import - 44)) | (1L << (Include - 44)) | (1L << (IncludeOnce - 44)) | (1L << (InstanceOf - 44)) | (1L << (InsteadOf - 44)) | (1L << (Int8Cast - 44)) | (1L << (Int16Cast - 44)) | (1L << (Int64Type - 44)) | (1L << (IntType - 44)) | (1L << (Interface - 44)) | (1L << (IsSet - 44)) | (1L << (List - 44)) | (1L << (LogicalAnd - 44)) | (1L << (LogicalOr - 44)) | (1L << (LogicalXor - 44)) | (1L << (Namespace - 44)) | (1L << (New - 44)) | (1L << (Null - 44)) | (1L << (ObjectType - 44)) | (1L << (Parent_ - 44)) | (1L << (Partial - 44)) | (1L << (Print - 44)))) != 0) || ((((_la - 108)) & ~0x3f) == 0 && ((1L << (_la - 108)) & ((1L << (Private - 108)) | (1L << (Protected - 108)) | (1L << (Public - 108)) | (1L << (Require - 108)) | (1L << (RequireOnce - 108)) | (1L << (Resource - 108)) | (1L << (Return - 108)) | (1L << (Static - 108)) | (1L << (StringType - 108)) | (1L << (Switch - 108)) | (1L << (Throw - 108)) | (1L << (Trait - 108)) | (1L << (Try - 108)) | (1L << (Typeof - 108)) | (1L << (UintCast - 108)) | (1L << (UnicodeCast - 108)) | (1L << (Unset - 108)) | (1L << (Use - 108)) | (1L << (Var - 108)) | (1L << (While - 108)) | (1L << (Yield - 108)) | (1L << (From - 108)) | (1L << (LambdaFn - 108)) | (1L << (Get - 108)) | (1L << (Set - 108)) | (1L << (Call - 108)) | (1L << (CallStatic - 108)) | (1L << (Constructor - 108)) | (1L << (Destruct - 108)) | (1L << (Wakeup - 108)) | (1L << (Sleep - 108)) | (1L << (Autoload - 108)) | (1L << (IsSet__ - 108)) | (1L << (Unset__ - 108)) | (1L << (ToString__ - 108)) | (1L << (Invoke - 108)) | (1L << (SetState - 108)) | (1L << (Clone__ - 108)) | (1L << (DebugInfo - 108)) | (1L << (Namespace__ - 108)) | (1L << (Class__ - 108)) | (1L << (Traic__ - 108)) | (1L << (Function__ - 108)) | (1L << (Method__ - 108)) | (1L << (Line__ - 108)) | (1L << (File__ - 108)) | (1L << (Dir__ - 108)) | (1L << (Inc - 108)) | (1L << (Dec - 108)))) != 0) || ((((_la - 188)) & ~0x3f) == 0 && ((1L << (_la - 188)) & ((1L << (NamespaceSeparator - 188)) | (1L << (Ampersand - 188)) | (1L << (Bang - 188)) | (1L << (Plus - 188)) | (1L << (Minus - 188)) | (1L << (Tilde - 188)) | (1L << (SuppressWarnings - 188)) | (1L << (Dollar - 188)) | (1L << (OpenRoundBracket - 188)) | (1L << (OpenSquareBracket - 188)) | (1L << (VarName - 188)) | (1L << (Label - 188)) | (1L << (Octal - 188)) | (1L << (Decimal - 188)) | (1L << (Real - 188)) | (1L << (Hex - 188)) | (1L << (Binary - 188)) | (1L << (BackQuoteString - 188)) | (1L << (SingleQuoteString - 188)) | (1L << (DoubleQuote - 188)) | (1L << (StartNowDoc - 188)) | (1L << (StartHereDoc - 188)))) != 0)) {
					{
					setState(1286);
					arrayItemList();
					}
				}

				setState(1289);
				match(CloseSquareBracket);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1296);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,127,_ctx) ) {
			case 1:
				{
				setState(1292);
				match(OpenSquareBracket);
				setState(1293);
				expression(0);
				setState(1294);
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
			setState(1324);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Function:
			case Static:
				enterOuterAlt(_localctx, 1);
				{
				setState(1299);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Static) {
					{
					setState(1298);
					match(Static);
					}
				}

				setState(1301);
				match(Function);
				setState(1303);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Ampersand) {
					{
					setState(1302);
					match(Ampersand);
					}
				}

				setState(1305);
				match(OpenRoundBracket);
				setState(1306);
				formalParameterList();
				setState(1307);
				match(CloseRoundBracket);
				setState(1309);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Use) {
					{
					setState(1308);
					lambdaFunctionUseVars();
					}
				}

				setState(1313);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Colon) {
					{
					setState(1311);
					match(Colon);
					setState(1312);
					typeHint();
					}
				}

				setState(1315);
				blockStatement();
				}
				break;
			case LambdaFn:
				enterOuterAlt(_localctx, 2);
				{
				setState(1317);
				match(LambdaFn);
				setState(1318);
				match(OpenRoundBracket);
				setState(1319);
				formalParameterList();
				setState(1320);
				match(CloseRoundBracket);
				setState(1321);
				match(DoubleArrow);
				setState(1322);
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
			setState(1326);
			match(New);
			setState(1327);
			typeRef();
			setState(1329);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,133,_ctx) ) {
			case 1:
				{
				setState(1328);
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
			setState(1331);
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
			setState(1333);
			match(Yield);
			setState(1341);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,135,_ctx) ) {
			case 1:
				{
				setState(1334);
				expression(0);
				setState(1337);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==DoubleArrow) {
					{
					setState(1335);
					match(DoubleArrow);
					setState(1336);
					expression(0);
					}
				}

				}
				break;
			case 2:
				{
				setState(1339);
				match(From);
				setState(1340);
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
			setState(1343);
			arrayItem();
			setState(1348);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,136,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1344);
					match(Comma);
					setState(1345);
					arrayItem();
					}
					} 
				}
				setState(1350);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,136,_ctx);
			}
			setState(1352);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Comma) {
				{
				setState(1351);
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
			setState(1366);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,140,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1354);
				expression(0);
				setState(1357);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==DoubleArrow) {
					{
					setState(1355);
					match(DoubleArrow);
					setState(1356);
					expression(0);
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1362);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 44)) & ~0x3f) == 0 && ((1L << (_la - 44)) & ((1L << (Abstract - 44)) | (1L << (Array - 44)) | (1L << (As - 44)) | (1L << (BinaryCast - 44)) | (1L << (BoolType - 44)) | (1L << (BooleanConstant - 44)) | (1L << (Break - 44)) | (1L << (Callable - 44)) | (1L << (Case - 44)) | (1L << (Catch - 44)) | (1L << (Class - 44)) | (1L << (Clone - 44)) | (1L << (Const - 44)) | (1L << (Continue - 44)) | (1L << (Declare - 44)) | (1L << (Default - 44)) | (1L << (Do - 44)) | (1L << (DoubleCast - 44)) | (1L << (DoubleType - 44)) | (1L << (Echo - 44)) | (1L << (Else - 44)) | (1L << (ElseIf - 44)) | (1L << (Empty - 44)) | (1L << (EndDeclare - 44)) | (1L << (EndFor - 44)) | (1L << (EndForeach - 44)) | (1L << (EndIf - 44)) | (1L << (EndSwitch - 44)) | (1L << (EndWhile - 44)) | (1L << (Eval - 44)) | (1L << (Exit - 44)) | (1L << (Extends - 44)) | (1L << (Final - 44)) | (1L << (Finally - 44)) | (1L << (FloatCast - 44)) | (1L << (For - 44)) | (1L << (Foreach - 44)) | (1L << (Function - 44)) | (1L << (Global - 44)) | (1L << (Goto - 44)) | (1L << (If - 44)) | (1L << (Implements - 44)) | (1L << (Import - 44)) | (1L << (Include - 44)) | (1L << (IncludeOnce - 44)) | (1L << (InstanceOf - 44)) | (1L << (InsteadOf - 44)) | (1L << (Int8Cast - 44)) | (1L << (Int16Cast - 44)) | (1L << (Int64Type - 44)) | (1L << (IntType - 44)) | (1L << (Interface - 44)) | (1L << (IsSet - 44)) | (1L << (List - 44)) | (1L << (LogicalAnd - 44)) | (1L << (LogicalOr - 44)) | (1L << (LogicalXor - 44)) | (1L << (Namespace - 44)) | (1L << (New - 44)) | (1L << (Null - 44)) | (1L << (ObjectType - 44)) | (1L << (Parent_ - 44)) | (1L << (Partial - 44)) | (1L << (Print - 44)))) != 0) || ((((_la - 108)) & ~0x3f) == 0 && ((1L << (_la - 108)) & ((1L << (Private - 108)) | (1L << (Protected - 108)) | (1L << (Public - 108)) | (1L << (Require - 108)) | (1L << (RequireOnce - 108)) | (1L << (Resource - 108)) | (1L << (Return - 108)) | (1L << (Static - 108)) | (1L << (StringType - 108)) | (1L << (Switch - 108)) | (1L << (Throw - 108)) | (1L << (Trait - 108)) | (1L << (Try - 108)) | (1L << (Typeof - 108)) | (1L << (UintCast - 108)) | (1L << (UnicodeCast - 108)) | (1L << (Unset - 108)) | (1L << (Use - 108)) | (1L << (Var - 108)) | (1L << (While - 108)) | (1L << (Yield - 108)) | (1L << (From - 108)) | (1L << (LambdaFn - 108)) | (1L << (Get - 108)) | (1L << (Set - 108)) | (1L << (Call - 108)) | (1L << (CallStatic - 108)) | (1L << (Constructor - 108)) | (1L << (Destruct - 108)) | (1L << (Wakeup - 108)) | (1L << (Sleep - 108)) | (1L << (Autoload - 108)) | (1L << (IsSet__ - 108)) | (1L << (Unset__ - 108)) | (1L << (ToString__ - 108)) | (1L << (Invoke - 108)) | (1L << (SetState - 108)) | (1L << (Clone__ - 108)) | (1L << (DebugInfo - 108)) | (1L << (Namespace__ - 108)) | (1L << (Class__ - 108)) | (1L << (Traic__ - 108)) | (1L << (Function__ - 108)) | (1L << (Method__ - 108)) | (1L << (Line__ - 108)) | (1L << (File__ - 108)) | (1L << (Dir__ - 108)) | (1L << (Inc - 108)) | (1L << (Dec - 108)))) != 0) || ((((_la - 188)) & ~0x3f) == 0 && ((1L << (_la - 188)) & ((1L << (NamespaceSeparator - 188)) | (1L << (Bang - 188)) | (1L << (Plus - 188)) | (1L << (Minus - 188)) | (1L << (Tilde - 188)) | (1L << (SuppressWarnings - 188)) | (1L << (Dollar - 188)) | (1L << (OpenRoundBracket - 188)) | (1L << (OpenSquareBracket - 188)) | (1L << (VarName - 188)) | (1L << (Label - 188)) | (1L << (Octal - 188)) | (1L << (Decimal - 188)) | (1L << (Real - 188)) | (1L << (Hex - 188)) | (1L << (Binary - 188)) | (1L << (BackQuoteString - 188)) | (1L << (SingleQuoteString - 188)) | (1L << (DoubleQuote - 188)) | (1L << (StartNowDoc - 188)) | (1L << (StartHereDoc - 188)))) != 0)) {
					{
					setState(1359);
					expression(0);
					setState(1360);
					match(DoubleArrow);
					}
				}

				setState(1364);
				match(Ampersand);
				setState(1365);
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
			setState(1368);
			match(Use);
			setState(1369);
			match(OpenRoundBracket);
			setState(1370);
			lambdaFunctionUseVar();
			setState(1375);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(1371);
				match(Comma);
				setState(1372);
				lambdaFunctionUseVar();
				}
				}
				setState(1377);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1378);
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
			setState(1381);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Ampersand) {
				{
				setState(1380);
				match(Ampersand);
				}
			}

			setState(1383);
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
			setState(1390);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,144,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1385);
				qualifiedNamespaceName();
				setState(1387);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Lgeneric) {
					{
					setState(1386);
					genericDynamicArgs();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1389);
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
			setState(1402);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,147,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1394);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,145,_ctx) ) {
				case 1:
					{
					setState(1392);
					qualifiedNamespaceName();
					}
					break;
				case 2:
					{
					setState(1393);
					indirectTypeRef();
					}
					break;
				}
				setState(1397);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,146,_ctx) ) {
				case 1:
					{
					setState(1396);
					genericDynamicArgs();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1399);
				primitiveType();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1400);
				match(Static);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1401);
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
			setState(1404);
			attributes();
			setState(1406);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Private) {
				{
				setState(1405);
				match(Private);
				}
			}

			setState(1409);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Abstract || _la==Final) {
				{
				setState(1408);
				modifier();
				}
			}

			setState(1412);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Partial) {
				{
				setState(1411);
				match(Partial);
				}
			}

			setState(1435);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Class:
			case Trait:
				{
				setState(1414);
				classEntryType();
				setState(1416);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Lgeneric) {
					{
					setState(1415);
					typeParameterListInBrackets();
					}
				}

				setState(1420);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Extends) {
					{
					setState(1418);
					match(Extends);
					setState(1419);
					qualifiedStaticTypeRef();
					}
				}

				setState(1424);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Implements) {
					{
					setState(1422);
					match(Implements);
					setState(1423);
					interfaceList();
					}
				}

				}
				break;
			case Interface:
				{
				setState(1426);
				match(Interface);
				setState(1427);
				identifier();
				setState(1429);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Lgeneric) {
					{
					setState(1428);
					typeParameterListInBrackets();
					}
				}

				setState(1433);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Extends) {
					{
					setState(1431);
					match(Extends);
					setState(1432);
					interfaceList();
					}
				}

				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1437);
			match(OpenCurlyBracket);
			setState(1441);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Decorator) | (1L << Abstract) | (1L << Const))) != 0) || ((((_la - 76)) & ~0x3f) == 0 && ((1L << (_la - 76)) & ((1L << (Final - 76)) | (1L << (Function - 76)) | (1L << (Private - 76)) | (1L << (Protected - 76)) | (1L << (Public - 76)) | (1L << (Static - 76)) | (1L << (Use - 76)) | (1L << (Var - 76)))) != 0) || _la==OpenSquareBracket) {
				{
				{
				setState(1438);
				classStatement();
				}
				}
				setState(1443);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1444);
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
			setState(1446);
			chainBase();
			setState(1451);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,158,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1447);
					match(ObjectOperator);
					setState(1448);
					keyedFieldName();
					}
					} 
				}
				setState(1453);
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
			setState(1455);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,159,_ctx) ) {
			case 1:
				{
				setState(1454);
				match(Namespace);
				}
				break;
			}
			setState(1458);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NamespaceSeparator) {
				{
				setState(1457);
				match(NamespaceSeparator);
				}
			}

			setState(1460);
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
			setState(1475);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,163,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1462);
				identifier();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1463);
				identifier();
				setState(1468);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,161,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1464);
						match(NamespaceSeparator);
						setState(1465);
						identifier();
						}
						} 
					}
					setState(1470);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,161,_ctx);
				}
				setState(1473);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,162,_ctx) ) {
				case 1:
					{
					setState(1471);
					match(NamespaceSeparator);
					setState(1472);
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
			setState(1496);
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
				setState(1477);
				identifier();
				setState(1480);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,164,_ctx) ) {
				case 1:
					{
					setState(1478);
					match(As);
					setState(1479);
					identifier();
					}
					break;
				}
				}
				break;
			case OpenCurlyBracket:
				enterOuterAlt(_localctx, 2);
				{
				setState(1482);
				match(OpenCurlyBracket);
				setState(1483);
				namespaceNameTail();
				setState(1488);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,165,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1484);
						match(Comma);
						setState(1485);
						namespaceNameTail();
						}
						} 
					}
					setState(1490);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,165,_ctx);
				}
				setState(1492);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Comma) {
					{
					setState(1491);
					match(Comma);
					}
				}

				setState(1494);
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
			setState(1498);
			qualifiedNamespaceName();
			setState(1503);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(1499);
				match(Comma);
				setState(1500);
				qualifiedNamespaceName();
				}
				}
				setState(1505);
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
			setState(1506);
			match(OpenRoundBracket);
			setState(1516);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,170,_ctx) ) {
			case 1:
				{
				setState(1507);
				actualArgument();
				setState(1512);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,169,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1508);
						match(Comma);
						setState(1509);
						actualArgument();
						}
						} 
					}
					setState(1514);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,169,_ctx);
				}
				}
				break;
			case 2:
				{
				setState(1515);
				yieldExpression();
				}
				break;
			}
			setState(1519);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Comma) {
				{
				setState(1518);
				match(Comma);
				}
			}

			setState(1521);
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
			setState(1529);
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
				setState(1524);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Ellipsis) {
					{
					setState(1523);
					match(Ellipsis);
					}
				}

				setState(1526);
				expression(0);
				}
				break;
			case Ampersand:
				enterOuterAlt(_localctx, 2);
				{
				setState(1527);
				match(Ampersand);
				setState(1528);
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
			setState(1552);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,178,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1531);
				constant();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1532);
				string();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1533);
				match(Array);
				setState(1534);
				match(OpenRoundBracket);
				setState(1539);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 44)) & ~0x3f) == 0 && ((1L << (_la - 44)) & ((1L << (Abstract - 44)) | (1L << (Array - 44)) | (1L << (As - 44)) | (1L << (BinaryCast - 44)) | (1L << (BoolType - 44)) | (1L << (BooleanConstant - 44)) | (1L << (Break - 44)) | (1L << (Callable - 44)) | (1L << (Case - 44)) | (1L << (Catch - 44)) | (1L << (Class - 44)) | (1L << (Clone - 44)) | (1L << (Const - 44)) | (1L << (Continue - 44)) | (1L << (Declare - 44)) | (1L << (Default - 44)) | (1L << (Do - 44)) | (1L << (DoubleCast - 44)) | (1L << (DoubleType - 44)) | (1L << (Echo - 44)) | (1L << (Else - 44)) | (1L << (ElseIf - 44)) | (1L << (Empty - 44)) | (1L << (EndDeclare - 44)) | (1L << (EndFor - 44)) | (1L << (EndForeach - 44)) | (1L << (EndIf - 44)) | (1L << (EndSwitch - 44)) | (1L << (EndWhile - 44)) | (1L << (Eval - 44)) | (1L << (Exit - 44)) | (1L << (Extends - 44)) | (1L << (Final - 44)) | (1L << (Finally - 44)) | (1L << (FloatCast - 44)) | (1L << (For - 44)) | (1L << (Foreach - 44)) | (1L << (Function - 44)) | (1L << (Global - 44)) | (1L << (Goto - 44)) | (1L << (If - 44)) | (1L << (Implements - 44)) | (1L << (Import - 44)) | (1L << (Include - 44)) | (1L << (IncludeOnce - 44)) | (1L << (InstanceOf - 44)) | (1L << (InsteadOf - 44)) | (1L << (Int8Cast - 44)) | (1L << (Int16Cast - 44)) | (1L << (Int64Type - 44)) | (1L << (IntType - 44)) | (1L << (Interface - 44)) | (1L << (IsSet - 44)) | (1L << (List - 44)) | (1L << (LogicalAnd - 44)) | (1L << (LogicalOr - 44)) | (1L << (LogicalXor - 44)) | (1L << (Namespace - 44)) | (1L << (New - 44)) | (1L << (Null - 44)) | (1L << (ObjectType - 44)) | (1L << (Parent_ - 44)) | (1L << (Partial - 44)) | (1L << (Print - 44)))) != 0) || ((((_la - 108)) & ~0x3f) == 0 && ((1L << (_la - 108)) & ((1L << (Private - 108)) | (1L << (Protected - 108)) | (1L << (Public - 108)) | (1L << (Require - 108)) | (1L << (RequireOnce - 108)) | (1L << (Resource - 108)) | (1L << (Return - 108)) | (1L << (Static - 108)) | (1L << (StringType - 108)) | (1L << (Switch - 108)) | (1L << (Throw - 108)) | (1L << (Trait - 108)) | (1L << (Try - 108)) | (1L << (Typeof - 108)) | (1L << (UintCast - 108)) | (1L << (UnicodeCast - 108)) | (1L << (Unset - 108)) | (1L << (Use - 108)) | (1L << (Var - 108)) | (1L << (While - 108)) | (1L << (Yield - 108)) | (1L << (From - 108)) | (1L << (Get - 108)) | (1L << (Set - 108)) | (1L << (Call - 108)) | (1L << (CallStatic - 108)) | (1L << (Constructor - 108)) | (1L << (Destruct - 108)) | (1L << (Wakeup - 108)) | (1L << (Sleep - 108)) | (1L << (Autoload - 108)) | (1L << (IsSet__ - 108)) | (1L << (Unset__ - 108)) | (1L << (ToString__ - 108)) | (1L << (Invoke - 108)) | (1L << (SetState - 108)) | (1L << (Clone__ - 108)) | (1L << (DebugInfo - 108)) | (1L << (Namespace__ - 108)) | (1L << (Class__ - 108)) | (1L << (Traic__ - 108)) | (1L << (Function__ - 108)) | (1L << (Method__ - 108)) | (1L << (Line__ - 108)) | (1L << (File__ - 108)) | (1L << (Dir__ - 108)))) != 0) || ((((_la - 188)) & ~0x3f) == 0 && ((1L << (_la - 188)) & ((1L << (NamespaceSeparator - 188)) | (1L << (Plus - 188)) | (1L << (Minus - 188)) | (1L << (Dollar - 188)) | (1L << (OpenSquareBracket - 188)) | (1L << (VarName - 188)) | (1L << (Label - 188)) | (1L << (Octal - 188)) | (1L << (Decimal - 188)) | (1L << (Real - 188)) | (1L << (Hex - 188)) | (1L << (Binary - 188)) | (1L << (SingleQuoteString - 188)) | (1L << (DoubleQuote - 188)) | (1L << (StartNowDoc - 188)) | (1L << (StartHereDoc - 188)))) != 0)) {
					{
					setState(1535);
					constantArrayItemList();
					setState(1537);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==Comma) {
						{
						setState(1536);
						match(Comma);
						}
					}

					}
				}

				setState(1541);
				match(CloseRoundBracket);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1542);
				match(OpenSquareBracket);
				setState(1547);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 44)) & ~0x3f) == 0 && ((1L << (_la - 44)) & ((1L << (Abstract - 44)) | (1L << (Array - 44)) | (1L << (As - 44)) | (1L << (BinaryCast - 44)) | (1L << (BoolType - 44)) | (1L << (BooleanConstant - 44)) | (1L << (Break - 44)) | (1L << (Callable - 44)) | (1L << (Case - 44)) | (1L << (Catch - 44)) | (1L << (Class - 44)) | (1L << (Clone - 44)) | (1L << (Const - 44)) | (1L << (Continue - 44)) | (1L << (Declare - 44)) | (1L << (Default - 44)) | (1L << (Do - 44)) | (1L << (DoubleCast - 44)) | (1L << (DoubleType - 44)) | (1L << (Echo - 44)) | (1L << (Else - 44)) | (1L << (ElseIf - 44)) | (1L << (Empty - 44)) | (1L << (EndDeclare - 44)) | (1L << (EndFor - 44)) | (1L << (EndForeach - 44)) | (1L << (EndIf - 44)) | (1L << (EndSwitch - 44)) | (1L << (EndWhile - 44)) | (1L << (Eval - 44)) | (1L << (Exit - 44)) | (1L << (Extends - 44)) | (1L << (Final - 44)) | (1L << (Finally - 44)) | (1L << (FloatCast - 44)) | (1L << (For - 44)) | (1L << (Foreach - 44)) | (1L << (Function - 44)) | (1L << (Global - 44)) | (1L << (Goto - 44)) | (1L << (If - 44)) | (1L << (Implements - 44)) | (1L << (Import - 44)) | (1L << (Include - 44)) | (1L << (IncludeOnce - 44)) | (1L << (InstanceOf - 44)) | (1L << (InsteadOf - 44)) | (1L << (Int8Cast - 44)) | (1L << (Int16Cast - 44)) | (1L << (Int64Type - 44)) | (1L << (IntType - 44)) | (1L << (Interface - 44)) | (1L << (IsSet - 44)) | (1L << (List - 44)) | (1L << (LogicalAnd - 44)) | (1L << (LogicalOr - 44)) | (1L << (LogicalXor - 44)) | (1L << (Namespace - 44)) | (1L << (New - 44)) | (1L << (Null - 44)) | (1L << (ObjectType - 44)) | (1L << (Parent_ - 44)) | (1L << (Partial - 44)) | (1L << (Print - 44)))) != 0) || ((((_la - 108)) & ~0x3f) == 0 && ((1L << (_la - 108)) & ((1L << (Private - 108)) | (1L << (Protected - 108)) | (1L << (Public - 108)) | (1L << (Require - 108)) | (1L << (RequireOnce - 108)) | (1L << (Resource - 108)) | (1L << (Return - 108)) | (1L << (Static - 108)) | (1L << (StringType - 108)) | (1L << (Switch - 108)) | (1L << (Throw - 108)) | (1L << (Trait - 108)) | (1L << (Try - 108)) | (1L << (Typeof - 108)) | (1L << (UintCast - 108)) | (1L << (UnicodeCast - 108)) | (1L << (Unset - 108)) | (1L << (Use - 108)) | (1L << (Var - 108)) | (1L << (While - 108)) | (1L << (Yield - 108)) | (1L << (From - 108)) | (1L << (Get - 108)) | (1L << (Set - 108)) | (1L << (Call - 108)) | (1L << (CallStatic - 108)) | (1L << (Constructor - 108)) | (1L << (Destruct - 108)) | (1L << (Wakeup - 108)) | (1L << (Sleep - 108)) | (1L << (Autoload - 108)) | (1L << (IsSet__ - 108)) | (1L << (Unset__ - 108)) | (1L << (ToString__ - 108)) | (1L << (Invoke - 108)) | (1L << (SetState - 108)) | (1L << (Clone__ - 108)) | (1L << (DebugInfo - 108)) | (1L << (Namespace__ - 108)) | (1L << (Class__ - 108)) | (1L << (Traic__ - 108)) | (1L << (Function__ - 108)) | (1L << (Method__ - 108)) | (1L << (Line__ - 108)) | (1L << (File__ - 108)) | (1L << (Dir__ - 108)))) != 0) || ((((_la - 188)) & ~0x3f) == 0 && ((1L << (_la - 188)) & ((1L << (NamespaceSeparator - 188)) | (1L << (Plus - 188)) | (1L << (Minus - 188)) | (1L << (Dollar - 188)) | (1L << (OpenSquareBracket - 188)) | (1L << (VarName - 188)) | (1L << (Label - 188)) | (1L << (Octal - 188)) | (1L << (Decimal - 188)) | (1L << (Real - 188)) | (1L << (Hex - 188)) | (1L << (Binary - 188)) | (1L << (SingleQuoteString - 188)) | (1L << (DoubleQuote - 188)) | (1L << (StartNowDoc - 188)) | (1L << (StartHereDoc - 188)))) != 0)) {
					{
					setState(1543);
					constantArrayItemList();
					setState(1545);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==Comma) {
						{
						setState(1544);
						match(Comma);
						}
					}

					}
				}

				setState(1549);
				match(CloseSquareBracket);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1550);
				_la = _input.LA(1);
				if ( !(_la==Plus || _la==Minus) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1551);
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
			setState(1554);
			constantArrayItem();
			setState(1559);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,179,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1555);
					match(Comma);
					setState(1556);
					constantArrayItem();
					}
					} 
				}
				setState(1561);
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
			setState(1562);
			constantInititalizer();
			setState(1565);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DoubleArrow) {
				{
				setState(1563);
				match(DoubleArrow);
				setState(1564);
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
			setState(1572);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,181,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1567);
				match(Null);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1568);
				literalConstant();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1569);
				magicConstant();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1570);
				classConstant();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1571);
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
			setState(1578);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Real:
				enterOuterAlt(_localctx, 1);
				{
				setState(1574);
				match(Real);
				}
				break;
			case BooleanConstant:
				enterOuterAlt(_localctx, 2);
				{
				setState(1575);
				match(BooleanConstant);
				}
				break;
			case Octal:
			case Decimal:
			case Hex:
			case Binary:
				enterOuterAlt(_localctx, 3);
				{
				setState(1576);
				numericConstant();
				}
				break;
			case Label:
				enterOuterAlt(_localctx, 4);
				{
				setState(1577);
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
			setState(1580);
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
			setState(1600);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,186,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1582);
				_la = _input.LA(1);
				if ( !(_la==Class || _la==Parent_) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1583);
				match(DoubleColon);
				setState(1588);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,183,_ctx) ) {
				case 1:
					{
					setState(1584);
					identifier();
					}
					break;
				case 2:
					{
					setState(1585);
					match(Constructor);
					}
					break;
				case 3:
					{
					setState(1586);
					match(Get);
					}
					break;
				case 4:
					{
					setState(1587);
					match(Set);
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1593);
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
					setState(1590);
					qualifiedStaticTypeRef();
					}
					break;
				case Dollar:
				case VarName:
					{
					setState(1591);
					keyedVariable();
					}
					break;
				case SingleQuoteString:
				case DoubleQuote:
				case StartNowDoc:
				case StartHereDoc:
					{
					setState(1592);
					string();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1595);
				match(DoubleColon);
				setState(1598);
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
					setState(1596);
					identifier();
					}
					break;
				case Dollar:
				case VarName:
					{
					setState(1597);
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
			setState(1602);
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
			setState(1625);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case StartHereDoc:
				enterOuterAlt(_localctx, 1);
				{
				setState(1604);
				match(StartHereDoc);
				setState(1606); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(1605);
						match(HereDocText);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(1608); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,187,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case StartNowDoc:
				enterOuterAlt(_localctx, 2);
				{
				setState(1610);
				match(StartNowDoc);
				setState(1612); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(1611);
						match(HereDocText);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(1614); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,188,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case SingleQuoteString:
				enterOuterAlt(_localctx, 3);
				{
				setState(1616);
				match(SingleQuoteString);
				}
				break;
			case DoubleQuote:
				enterOuterAlt(_localctx, 4);
				{
				setState(1617);
				match(DoubleQuote);
				setState(1621);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,189,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1618);
						interpolatedStringPart();
						}
						} 
					}
					setState(1623);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,189,_ctx);
				}
				setState(1624);
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
			setState(1630);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case StringPart:
				enterOuterAlt(_localctx, 1);
				{
				setState(1627);
				match(StringPart);
				}
				break;
			case UnicodeEscape:
				enterOuterAlt(_localctx, 2);
				{
				setState(1628);
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
				setState(1629);
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
			setState(1632);
			chain();
			setState(1637);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(1633);
				match(Comma);
				setState(1634);
				chain();
				}
				}
				setState(1639);
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
			setState(1640);
			chainOrigin();
			setState(1644);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,193,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1641);
					memberAccess();
					}
					} 
				}
				setState(1646);
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
			setState(1653);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,194,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1647);
				chainBase();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1648);
				functionCall();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1649);
				match(OpenRoundBracket);
				setState(1650);
				newExpr();
				setState(1651);
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
			setState(1655);
			match(ObjectOperator);
			setState(1656);
			keyedFieldName();
			setState(1658);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,195,_ctx) ) {
			case 1:
				{
				setState(1657);
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
			setState(1660);
			functionCallName();
			setState(1661);
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
			setState(1667);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,196,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1663);
				qualifiedNamespaceName();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1664);
				classConstant();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1665);
				chainBase();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1666);
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
			setState(1670);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Lgeneric) {
				{
				setState(1669);
				genericDynamicArgs();
				}
			}

			setState(1672);
			arguments();
			setState(1676);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,198,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1673);
					squareCurlyExpression();
					}
					} 
				}
				setState(1678);
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
			setState(1688);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Dollar:
			case VarName:
				enterOuterAlt(_localctx, 1);
				{
				setState(1679);
				keyedVariable();
				setState(1682);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,199,_ctx) ) {
				case 1:
					{
					setState(1680);
					match(DoubleColon);
					setState(1681);
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
				setState(1684);
				qualifiedStaticTypeRef();
				setState(1685);
				match(DoubleColon);
				setState(1686);
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
			setState(1692);
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
				setState(1690);
				keyedSimpleFieldName();
				}
				break;
			case Dollar:
			case VarName:
				enterOuterAlt(_localctx, 2);
				{
				setState(1691);
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
			setState(1699);
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
				setState(1694);
				identifier();
				}
				break;
			case OpenCurlyBracket:
				{
				setState(1695);
				match(OpenCurlyBracket);
				setState(1696);
				expression(0);
				setState(1697);
				match(CloseCurlyBracket);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1704);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,203,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1701);
					squareCurlyExpression();
					}
					} 
				}
				setState(1706);
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
			setState(1710);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,204,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1707);
					match(Dollar);
					}
					} 
				}
				setState(1712);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,204,_ctx);
			}
			setState(1719);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VarName:
				{
				setState(1713);
				match(VarName);
				}
				break;
			case Dollar:
				{
				setState(1714);
				match(Dollar);
				setState(1715);
				match(OpenCurlyBracket);
				setState(1716);
				expression(0);
				setState(1717);
				match(CloseCurlyBracket);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1724);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,206,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1721);
					squareCurlyExpression();
					}
					} 
				}
				setState(1726);
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
			setState(1736);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OpenSquareBracket:
				enterOuterAlt(_localctx, 1);
				{
				setState(1727);
				match(OpenSquareBracket);
				setState(1729);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 44)) & ~0x3f) == 0 && ((1L << (_la - 44)) & ((1L << (Abstract - 44)) | (1L << (Array - 44)) | (1L << (As - 44)) | (1L << (BinaryCast - 44)) | (1L << (BoolType - 44)) | (1L << (BooleanConstant - 44)) | (1L << (Break - 44)) | (1L << (Callable - 44)) | (1L << (Case - 44)) | (1L << (Catch - 44)) | (1L << (Class - 44)) | (1L << (Clone - 44)) | (1L << (Const - 44)) | (1L << (Continue - 44)) | (1L << (Declare - 44)) | (1L << (Default - 44)) | (1L << (Do - 44)) | (1L << (DoubleCast - 44)) | (1L << (DoubleType - 44)) | (1L << (Echo - 44)) | (1L << (Else - 44)) | (1L << (ElseIf - 44)) | (1L << (Empty - 44)) | (1L << (EndDeclare - 44)) | (1L << (EndFor - 44)) | (1L << (EndForeach - 44)) | (1L << (EndIf - 44)) | (1L << (EndSwitch - 44)) | (1L << (EndWhile - 44)) | (1L << (Eval - 44)) | (1L << (Exit - 44)) | (1L << (Extends - 44)) | (1L << (Final - 44)) | (1L << (Finally - 44)) | (1L << (FloatCast - 44)) | (1L << (For - 44)) | (1L << (Foreach - 44)) | (1L << (Function - 44)) | (1L << (Global - 44)) | (1L << (Goto - 44)) | (1L << (If - 44)) | (1L << (Implements - 44)) | (1L << (Import - 44)) | (1L << (Include - 44)) | (1L << (IncludeOnce - 44)) | (1L << (InstanceOf - 44)) | (1L << (InsteadOf - 44)) | (1L << (Int8Cast - 44)) | (1L << (Int16Cast - 44)) | (1L << (Int64Type - 44)) | (1L << (IntType - 44)) | (1L << (Interface - 44)) | (1L << (IsSet - 44)) | (1L << (List - 44)) | (1L << (LogicalAnd - 44)) | (1L << (LogicalOr - 44)) | (1L << (LogicalXor - 44)) | (1L << (Namespace - 44)) | (1L << (New - 44)) | (1L << (Null - 44)) | (1L << (ObjectType - 44)) | (1L << (Parent_ - 44)) | (1L << (Partial - 44)) | (1L << (Print - 44)))) != 0) || ((((_la - 108)) & ~0x3f) == 0 && ((1L << (_la - 108)) & ((1L << (Private - 108)) | (1L << (Protected - 108)) | (1L << (Public - 108)) | (1L << (Require - 108)) | (1L << (RequireOnce - 108)) | (1L << (Resource - 108)) | (1L << (Return - 108)) | (1L << (Static - 108)) | (1L << (StringType - 108)) | (1L << (Switch - 108)) | (1L << (Throw - 108)) | (1L << (Trait - 108)) | (1L << (Try - 108)) | (1L << (Typeof - 108)) | (1L << (UintCast - 108)) | (1L << (UnicodeCast - 108)) | (1L << (Unset - 108)) | (1L << (Use - 108)) | (1L << (Var - 108)) | (1L << (While - 108)) | (1L << (Yield - 108)) | (1L << (From - 108)) | (1L << (LambdaFn - 108)) | (1L << (Get - 108)) | (1L << (Set - 108)) | (1L << (Call - 108)) | (1L << (CallStatic - 108)) | (1L << (Constructor - 108)) | (1L << (Destruct - 108)) | (1L << (Wakeup - 108)) | (1L << (Sleep - 108)) | (1L << (Autoload - 108)) | (1L << (IsSet__ - 108)) | (1L << (Unset__ - 108)) | (1L << (ToString__ - 108)) | (1L << (Invoke - 108)) | (1L << (SetState - 108)) | (1L << (Clone__ - 108)) | (1L << (DebugInfo - 108)) | (1L << (Namespace__ - 108)) | (1L << (Class__ - 108)) | (1L << (Traic__ - 108)) | (1L << (Function__ - 108)) | (1L << (Method__ - 108)) | (1L << (Line__ - 108)) | (1L << (File__ - 108)) | (1L << (Dir__ - 108)) | (1L << (Inc - 108)) | (1L << (Dec - 108)))) != 0) || ((((_la - 188)) & ~0x3f) == 0 && ((1L << (_la - 188)) & ((1L << (NamespaceSeparator - 188)) | (1L << (Bang - 188)) | (1L << (Plus - 188)) | (1L << (Minus - 188)) | (1L << (Tilde - 188)) | (1L << (SuppressWarnings - 188)) | (1L << (Dollar - 188)) | (1L << (OpenRoundBracket - 188)) | (1L << (OpenSquareBracket - 188)) | (1L << (VarName - 188)) | (1L << (Label - 188)) | (1L << (Octal - 188)) | (1L << (Decimal - 188)) | (1L << (Real - 188)) | (1L << (Hex - 188)) | (1L << (Binary - 188)) | (1L << (BackQuoteString - 188)) | (1L << (SingleQuoteString - 188)) | (1L << (DoubleQuote - 188)) | (1L << (StartNowDoc - 188)) | (1L << (StartHereDoc - 188)))) != 0)) {
					{
					setState(1728);
					expression(0);
					}
				}

				setState(1731);
				match(CloseSquareBracket);
				}
				break;
			case OpenCurlyBracket:
				enterOuterAlt(_localctx, 2);
				{
				setState(1732);
				match(OpenCurlyBracket);
				setState(1733);
				expression(0);
				setState(1734);
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
			setState(1739);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 44)) & ~0x3f) == 0 && ((1L << (_la - 44)) & ((1L << (Abstract - 44)) | (1L << (Array - 44)) | (1L << (As - 44)) | (1L << (BinaryCast - 44)) | (1L << (BoolType - 44)) | (1L << (BooleanConstant - 44)) | (1L << (Break - 44)) | (1L << (Callable - 44)) | (1L << (Case - 44)) | (1L << (Catch - 44)) | (1L << (Class - 44)) | (1L << (Clone - 44)) | (1L << (Const - 44)) | (1L << (Continue - 44)) | (1L << (Declare - 44)) | (1L << (Default - 44)) | (1L << (Do - 44)) | (1L << (DoubleCast - 44)) | (1L << (DoubleType - 44)) | (1L << (Echo - 44)) | (1L << (Else - 44)) | (1L << (ElseIf - 44)) | (1L << (Empty - 44)) | (1L << (EndDeclare - 44)) | (1L << (EndFor - 44)) | (1L << (EndForeach - 44)) | (1L << (EndIf - 44)) | (1L << (EndSwitch - 44)) | (1L << (EndWhile - 44)) | (1L << (Eval - 44)) | (1L << (Exit - 44)) | (1L << (Extends - 44)) | (1L << (Final - 44)) | (1L << (Finally - 44)) | (1L << (FloatCast - 44)) | (1L << (For - 44)) | (1L << (Foreach - 44)) | (1L << (Function - 44)) | (1L << (Global - 44)) | (1L << (Goto - 44)) | (1L << (If - 44)) | (1L << (Implements - 44)) | (1L << (Import - 44)) | (1L << (Include - 44)) | (1L << (IncludeOnce - 44)) | (1L << (InstanceOf - 44)) | (1L << (InsteadOf - 44)) | (1L << (Int8Cast - 44)) | (1L << (Int16Cast - 44)) | (1L << (Int64Type - 44)) | (1L << (IntType - 44)) | (1L << (Interface - 44)) | (1L << (IsSet - 44)) | (1L << (List - 44)) | (1L << (LogicalAnd - 44)) | (1L << (LogicalOr - 44)) | (1L << (LogicalXor - 44)) | (1L << (Namespace - 44)) | (1L << (New - 44)) | (1L << (Null - 44)) | (1L << (ObjectType - 44)) | (1L << (Parent_ - 44)) | (1L << (Partial - 44)) | (1L << (Print - 44)))) != 0) || ((((_la - 108)) & ~0x3f) == 0 && ((1L << (_la - 108)) & ((1L << (Private - 108)) | (1L << (Protected - 108)) | (1L << (Public - 108)) | (1L << (Require - 108)) | (1L << (RequireOnce - 108)) | (1L << (Resource - 108)) | (1L << (Return - 108)) | (1L << (Static - 108)) | (1L << (StringType - 108)) | (1L << (Switch - 108)) | (1L << (Throw - 108)) | (1L << (Trait - 108)) | (1L << (Try - 108)) | (1L << (Typeof - 108)) | (1L << (UintCast - 108)) | (1L << (UnicodeCast - 108)) | (1L << (Unset - 108)) | (1L << (Use - 108)) | (1L << (Var - 108)) | (1L << (While - 108)) | (1L << (Yield - 108)) | (1L << (From - 108)) | (1L << (LambdaFn - 108)) | (1L << (Get - 108)) | (1L << (Set - 108)) | (1L << (Call - 108)) | (1L << (CallStatic - 108)) | (1L << (Constructor - 108)) | (1L << (Destruct - 108)) | (1L << (Wakeup - 108)) | (1L << (Sleep - 108)) | (1L << (Autoload - 108)) | (1L << (IsSet__ - 108)) | (1L << (Unset__ - 108)) | (1L << (ToString__ - 108)) | (1L << (Invoke - 108)) | (1L << (SetState - 108)) | (1L << (Clone__ - 108)) | (1L << (DebugInfo - 108)) | (1L << (Namespace__ - 108)) | (1L << (Class__ - 108)) | (1L << (Traic__ - 108)) | (1L << (Function__ - 108)) | (1L << (Method__ - 108)) | (1L << (Line__ - 108)) | (1L << (File__ - 108)) | (1L << (Dir__ - 108)) | (1L << (Inc - 108)) | (1L << (Dec - 108)))) != 0) || ((((_la - 188)) & ~0x3f) == 0 && ((1L << (_la - 188)) & ((1L << (NamespaceSeparator - 188)) | (1L << (Ampersand - 188)) | (1L << (Bang - 188)) | (1L << (Plus - 188)) | (1L << (Minus - 188)) | (1L << (Tilde - 188)) | (1L << (SuppressWarnings - 188)) | (1L << (Dollar - 188)) | (1L << (OpenRoundBracket - 188)) | (1L << (OpenSquareBracket - 188)) | (1L << (VarName - 188)) | (1L << (Label - 188)) | (1L << (Octal - 188)) | (1L << (Decimal - 188)) | (1L << (Real - 188)) | (1L << (Hex - 188)) | (1L << (Binary - 188)) | (1L << (BackQuoteString - 188)) | (1L << (SingleQuoteString - 188)) | (1L << (DoubleQuote - 188)) | (1L << (StartNowDoc - 188)) | (1L << (StartHereDoc - 188)))) != 0)) {
				{
				setState(1738);
				assignmentListElement();
				}
			}

			setState(1747);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(1741);
				match(Comma);
				setState(1743);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 44)) & ~0x3f) == 0 && ((1L << (_la - 44)) & ((1L << (Abstract - 44)) | (1L << (Array - 44)) | (1L << (As - 44)) | (1L << (BinaryCast - 44)) | (1L << (BoolType - 44)) | (1L << (BooleanConstant - 44)) | (1L << (Break - 44)) | (1L << (Callable - 44)) | (1L << (Case - 44)) | (1L << (Catch - 44)) | (1L << (Class - 44)) | (1L << (Clone - 44)) | (1L << (Const - 44)) | (1L << (Continue - 44)) | (1L << (Declare - 44)) | (1L << (Default - 44)) | (1L << (Do - 44)) | (1L << (DoubleCast - 44)) | (1L << (DoubleType - 44)) | (1L << (Echo - 44)) | (1L << (Else - 44)) | (1L << (ElseIf - 44)) | (1L << (Empty - 44)) | (1L << (EndDeclare - 44)) | (1L << (EndFor - 44)) | (1L << (EndForeach - 44)) | (1L << (EndIf - 44)) | (1L << (EndSwitch - 44)) | (1L << (EndWhile - 44)) | (1L << (Eval - 44)) | (1L << (Exit - 44)) | (1L << (Extends - 44)) | (1L << (Final - 44)) | (1L << (Finally - 44)) | (1L << (FloatCast - 44)) | (1L << (For - 44)) | (1L << (Foreach - 44)) | (1L << (Function - 44)) | (1L << (Global - 44)) | (1L << (Goto - 44)) | (1L << (If - 44)) | (1L << (Implements - 44)) | (1L << (Import - 44)) | (1L << (Include - 44)) | (1L << (IncludeOnce - 44)) | (1L << (InstanceOf - 44)) | (1L << (InsteadOf - 44)) | (1L << (Int8Cast - 44)) | (1L << (Int16Cast - 44)) | (1L << (Int64Type - 44)) | (1L << (IntType - 44)) | (1L << (Interface - 44)) | (1L << (IsSet - 44)) | (1L << (List - 44)) | (1L << (LogicalAnd - 44)) | (1L << (LogicalOr - 44)) | (1L << (LogicalXor - 44)) | (1L << (Namespace - 44)) | (1L << (New - 44)) | (1L << (Null - 44)) | (1L << (ObjectType - 44)) | (1L << (Parent_ - 44)) | (1L << (Partial - 44)) | (1L << (Print - 44)))) != 0) || ((((_la - 108)) & ~0x3f) == 0 && ((1L << (_la - 108)) & ((1L << (Private - 108)) | (1L << (Protected - 108)) | (1L << (Public - 108)) | (1L << (Require - 108)) | (1L << (RequireOnce - 108)) | (1L << (Resource - 108)) | (1L << (Return - 108)) | (1L << (Static - 108)) | (1L << (StringType - 108)) | (1L << (Switch - 108)) | (1L << (Throw - 108)) | (1L << (Trait - 108)) | (1L << (Try - 108)) | (1L << (Typeof - 108)) | (1L << (UintCast - 108)) | (1L << (UnicodeCast - 108)) | (1L << (Unset - 108)) | (1L << (Use - 108)) | (1L << (Var - 108)) | (1L << (While - 108)) | (1L << (Yield - 108)) | (1L << (From - 108)) | (1L << (LambdaFn - 108)) | (1L << (Get - 108)) | (1L << (Set - 108)) | (1L << (Call - 108)) | (1L << (CallStatic - 108)) | (1L << (Constructor - 108)) | (1L << (Destruct - 108)) | (1L << (Wakeup - 108)) | (1L << (Sleep - 108)) | (1L << (Autoload - 108)) | (1L << (IsSet__ - 108)) | (1L << (Unset__ - 108)) | (1L << (ToString__ - 108)) | (1L << (Invoke - 108)) | (1L << (SetState - 108)) | (1L << (Clone__ - 108)) | (1L << (DebugInfo - 108)) | (1L << (Namespace__ - 108)) | (1L << (Class__ - 108)) | (1L << (Traic__ - 108)) | (1L << (Function__ - 108)) | (1L << (Method__ - 108)) | (1L << (Line__ - 108)) | (1L << (File__ - 108)) | (1L << (Dir__ - 108)) | (1L << (Inc - 108)) | (1L << (Dec - 108)))) != 0) || ((((_la - 188)) & ~0x3f) == 0 && ((1L << (_la - 188)) & ((1L << (NamespaceSeparator - 188)) | (1L << (Ampersand - 188)) | (1L << (Bang - 188)) | (1L << (Plus - 188)) | (1L << (Minus - 188)) | (1L << (Tilde - 188)) | (1L << (SuppressWarnings - 188)) | (1L << (Dollar - 188)) | (1L << (OpenRoundBracket - 188)) | (1L << (OpenSquareBracket - 188)) | (1L << (VarName - 188)) | (1L << (Label - 188)) | (1L << (Octal - 188)) | (1L << (Decimal - 188)) | (1L << (Real - 188)) | (1L << (Hex - 188)) | (1L << (Binary - 188)) | (1L << (BackQuoteString - 188)) | (1L << (SingleQuoteString - 188)) | (1L << (DoubleQuote - 188)) | (1L << (StartNowDoc - 188)) | (1L << (StartHereDoc - 188)))) != 0)) {
					{
					setState(1742);
					assignmentListElement();
					}
				}

				}
				}
				setState(1749);
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
			setState(1757);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,212,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1750);
				chain();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1751);
				match(List);
				setState(1752);
				match(OpenRoundBracket);
				setState(1753);
				assignmentList();
				setState(1754);
				match(CloseRoundBracket);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1756);
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
			setState(1759);
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
			setState(1761);
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
			setState(1763);
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
			setState(1765);
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
			setState(1767);
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
			setState(1769);
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
			setState(1771);
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
			setState(1773);
			match(Decorator);
			setState(1774);
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

	public static class FuncToDocContext extends ParserRuleContext {
		public TerminalNode Decorator() { return getToken(PhpParser.Decorator, 0); }
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
		public MethodBodyContext methodBody() {
			return getRuleContext(MethodBodyContext.class,0);
		}
		public MemberModifiersContext memberModifiers() {
			return getRuleContext(MemberModifiersContext.class,0);
		}
		public TerminalNode Ampersand() { return getToken(PhpParser.Ampersand, 0); }
		public TypeParameterListInBracketsContext typeParameterListInBrackets() {
			return getRuleContext(TypeParameterListInBracketsContext.class,0);
		}
		public BaseCtorCallContext baseCtorCall() {
			return getRuleContext(BaseCtorCallContext.class,0);
		}
		public FuncToDocContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcToDoc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).enterFuncToDoc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).exitFuncToDoc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PhpParserVisitor ) return ((PhpParserVisitor<? extends T>)visitor).visitFuncToDoc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncToDocContext funcToDoc() throws RecognitionException {
		FuncToDocContext _localctx = new FuncToDocContext(_ctx, getState());
		enterRule(_localctx, 272, RULE_funcToDoc);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1776);
			match(Decorator);
			setState(1777);
			attributes();
			setState(1779);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Abstract || ((((_la - 76)) & ~0x3f) == 0 && ((1L << (_la - 76)) & ((1L << (Final - 76)) | (1L << (Private - 76)) | (1L << (Protected - 76)) | (1L << (Public - 76)) | (1L << (Static - 76)))) != 0)) {
				{
				setState(1778);
				memberModifiers();
				}
			}

			setState(1781);
			match(Function);
			setState(1783);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Ampersand) {
				{
				setState(1782);
				match(Ampersand);
				}
			}

			setState(1785);
			identifier();
			setState(1787);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Lgeneric) {
				{
				setState(1786);
				typeParameterListInBrackets();
				}
			}

			setState(1789);
			match(OpenRoundBracket);
			setState(1790);
			formalParameterList();
			setState(1791);
			match(CloseRoundBracket);
			setState(1793);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Colon) {
				{
				setState(1792);
				baseCtorCall();
				}
			}

			setState(1795);
			methodBody();
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\u00f0\u0708\4\2\t"+
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
		"\4\u008a\t\u008a\3\2\5\2\u0116\n\2\3\2\7\2\u0119\n\2\f\2\16\2\u011c\13"+
		"\2\3\2\3\2\3\3\3\3\3\3\5\3\u0123\n\3\3\4\6\4\u0126\n\4\r\4\16\4\u0127"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\7\5\u0140\n\5\f\5\16\5\u0143\13\5\3\5\5\5\u0146\n\5"+
		"\3\6\6\6\u0149\n\6\r\6\16\6\u014a\3\7\7\7\u014e\n\7\f\7\16\7\u0151\13"+
		"\7\3\7\6\7\u0154\n\7\r\7\16\7\u0155\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\5\t\u0164\n\t\3\n\3\n\5\n\u0168\n\n\3\n\3\n\3\n\3\13\5"+
		"\13\u016e\n\13\3\13\3\13\3\13\5\13\u0173\n\13\3\13\7\13\u0176\n\13\f\13"+
		"\16\13\u0179\13\13\3\f\3\f\3\r\3\r\5\r\u017f\n\r\3\r\3\r\7\r\u0183\n\r"+
		"\f\r\16\r\u0186\13\r\3\r\3\r\3\r\3\r\5\r\u018c\n\r\3\16\3\16\3\16\3\16"+
		"\3\16\5\16\u0193\n\16\3\17\3\17\3\17\5\17\u0198\n\17\3\17\3\17\5\17\u019c"+
		"\n\17\3\17\3\17\3\17\3\17\3\17\5\17\u01a3\n\17\3\17\5\17\u01a6\n\17\3"+
		"\17\3\17\3\20\3\20\5\20\u01ac\n\20\3\20\5\20\u01af\n\20\3\20\5\20\u01b2"+
		"\n\20\3\20\3\20\3\20\5\20\u01b7\n\20\3\20\3\20\5\20\u01bb\n\20\3\20\3"+
		"\20\5\20\u01bf\n\20\3\20\3\20\3\20\5\20\u01c4\n\20\3\20\3\20\5\20\u01c8"+
		"\n\20\5\20\u01ca\n\20\3\20\3\20\7\20\u01ce\n\20\f\20\16\20\u01d1\13\20"+
		"\3\20\3\20\3\21\3\21\3\22\3\22\3\22\7\22\u01da\n\22\f\22\16\22\u01dd\13"+
		"\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3"+
		"\23\5\23\u01ed\n\23\3\24\3\24\3\24\7\24\u01f2\n\24\f\24\16\24\u01f5\13"+
		"\24\3\25\3\25\3\25\7\25\u01fa\n\25\f\25\16\25\u01fd\13\25\3\26\3\26\3"+
		"\26\3\27\3\27\3\27\3\27\3\27\5\27\u0207\n\27\3\30\3\30\3\30\3\30\7\30"+
		"\u020d\n\30\f\30\16\30\u0210\13\30\3\30\3\30\3\31\7\31\u0215\n\31\f\31"+
		"\16\31\u0218\13\31\3\32\3\32\3\32\3\32\5\32\u021e\n\32\3\32\3\32\3\32"+
		"\7\32\u0223\n\32\f\32\16\32\u0226\13\32\3\32\3\32\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33"+
		"\5\33\u023c\n\33\3\34\3\34\3\34\7\34\u0241\n\34\f\34\16\34\u0244\13\34"+
		"\3\35\3\35\3\35\7\35\u0249\n\35\f\35\16\35\u024c\13\35\3\36\3\36\3\36"+
		"\3\36\3\37\7\37\u0253\n\37\f\37\16\37\u0256\13\37\3 \3 \3 \5 \u025b\n"+
		" \3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3"+
		"!\3!\3!\3!\3!\5!\u0278\n!\3\"\3\"\3#\3#\3#\3#\3$\3$\3$\3$\7$\u0284\n$"+
		"\f$\16$\u0287\13$\3$\5$\u028a\n$\3$\3$\3$\3$\3$\7$\u0291\n$\f$\16$\u0294"+
		"\13$\3$\5$\u0297\n$\3$\3$\3$\5$\u029c\n$\3%\3%\3%\3%\3&\3&\3&\3&\3&\3"+
		"\'\3\'\3\'\3(\3(\3(\3(\3)\3)\3)\3)\3)\3)\3)\3)\5)\u02b6\n)\3*\3*\3*\3"+
		"*\3*\3*\3+\3+\3+\5+\u02c1\n+\3+\3+\5+\u02c5\n+\3+\3+\5+\u02c9\n+\3+\3"+
		"+\3+\3+\3+\3+\3+\5+\u02d2\n+\3,\3,\3-\3-\3.\3.\3.\3.\5.\u02dc\n.\3.\7"+
		".\u02df\n.\f.\16.\u02e2\13.\3.\3.\3.\5.\u02e7\n.\3.\7.\u02ea\n.\f.\16"+
		".\u02ed\13.\3.\3.\5.\u02f1\n.\3/\3/\3/\5/\u02f6\n/\3/\6/\u02f9\n/\r/\16"+
		"/\u02fa\3/\3/\3\60\3\60\5\60\u0301\n\60\3\60\3\60\3\61\3\61\5\61\u0307"+
		"\n\61\3\61\3\61\3\62\3\62\5\62\u030d\n\62\3\62\3\62\3\63\3\63\3\63\3\64"+
		"\3\64\3\64\3\64\3\64\3\64\3\65\3\65\3\65\3\65\3\65\5\65\u031f\n\65\3\65"+
		"\3\65\3\65\5\65\u0324\n\65\3\65\5\65\u0327\n\65\3\65\3\65\3\65\3\65\3"+
		"\65\3\65\3\65\3\65\5\65\u0331\n\65\3\65\5\65\u0334\n\65\3\65\3\65\3\65"+
		"\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\5\65\u0341\n\65\3\65\3\65\3\65"+
		"\3\65\3\65\3\65\5\65\u0349\n\65\3\66\3\66\3\66\6\66\u034e\n\66\r\66\16"+
		"\66\u034f\3\66\5\66\u0353\n\66\3\66\7\66\u0356\n\66\f\66\16\66\u0359\13"+
		"\66\3\66\5\66\u035c\n\66\3\67\3\67\3\67\3\67\3\67\7\67\u0363\n\67\f\67"+
		"\16\67\u0366\13\67\3\67\3\67\3\67\3\67\38\38\38\39\39\39\39\3:\3:\3:\3"+
		":\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\5;\u0381\n;\3<\6<\u0384\n<\r<\16<\u0385"+
		"\3=\3=\5=\u038a\n=\3>\3>\3>\7>\u038f\n>\f>\16>\u0392\13>\3?\5?\u0395\n"+
		"?\3?\3?\7?\u0399\n?\f?\16?\u039c\13?\3@\3@\5@\u03a0\n@\3@\5@\u03a3\n@"+
		"\3@\5@\u03a6\n@\3@\5@\u03a9\n@\3@\3@\3A\3A\3A\5A\u03b0\nA\3B\3B\3B\3B"+
		"\7B\u03b6\nB\fB\16B\u03b9\13B\3B\3B\3C\3C\3C\3C\3C\3C\3C\3C\5C\u03c5\n"+
		"C\3D\3D\3D\3D\3E\3E\3E\3E\7E\u03cf\nE\fE\16E\u03d2\13E\3E\3E\3F\3F\3F"+
		"\5F\u03d9\nF\3F\3F\3F\7F\u03de\nF\fF\16F\u03e1\13F\3F\3F\3F\3F\5F\u03e7"+
		"\nF\3F\3F\5F\u03eb\nF\3F\3F\3F\7F\u03f0\nF\fF\16F\u03f3\13F\3F\3F\3F\3"+
		"F\5F\u03f9\nF\3F\3F\5F\u03fd\nF\3F\3F\5F\u0401\nF\3F\3F\3F\3F\5F\u0407"+
		"\nF\3F\3F\3F\3F\3F\3F\3F\5F\u0410\nF\3G\3G\3G\7G\u0415\nG\fG\16G\u0418"+
		"\13G\3G\5G\u041b\nG\3H\3H\5H\u041f\nH\3I\3I\3I\3I\3I\3I\3I\3J\3J\3J\3"+
		"J\5J\u042c\nJ\3J\5J\u042f\nJ\3J\3J\3K\3K\3K\5K\u0436\nK\3K\3K\3L\3L\3"+
		"L\5L\u043d\nL\3M\3M\5M\u0441\nM\3N\3N\5N\u0445\nN\3O\6O\u0448\nO\rO\16"+
		"O\u0449\3P\3P\3P\5P\u044f\nP\3Q\3Q\3Q\3Q\3R\3R\3R\3R\3R\7R\u045a\nR\f"+
		"R\16R\u045d\13R\3R\3R\3S\3S\3S\7S\u0464\nS\fS\16S\u0467\13S\3T\3T\3T\5"+
		"T\u046c\nT\3T\3T\3U\3U\3U\3U\3U\3U\3U\3U\3U\3U\3U\3U\3U\3U\3U\3U\3U\3"+
		"U\3U\3U\3U\3U\3U\3U\3U\3U\3U\3U\3U\3U\3U\3U\3U\3U\3U\3U\3U\3U\3U\3U\3"+
		"U\3U\3U\3U\3U\3U\3U\3U\3U\3U\3U\3U\3U\3U\3U\3U\3U\3U\3U\5U\u04ab\nU\3"+
		"U\3U\3U\3U\3U\3U\3U\3U\3U\3U\3U\3U\3U\3U\5U\u04bb\nU\5U\u04bd\nU\3U\3"+
		"U\3U\3U\3U\3U\3U\3U\3U\3U\3U\3U\3U\3U\3U\3U\3U\3U\3U\3U\3U\3U\3U\3U\3"+
		"U\3U\3U\3U\3U\3U\3U\3U\3U\3U\3U\3U\5U\u04e3\nU\3U\3U\3U\3U\3U\3U\3U\3"+
		"U\3U\3U\3U\3U\3U\3U\3U\3U\3U\3U\3U\3U\7U\u04f9\nU\fU\16U\u04fc\13U\3V"+
		"\3V\5V\u0500\nV\3W\3W\3W\5W\u0505\nW\3W\3W\3W\5W\u050a\nW\3W\5W\u050d"+
		"\nW\3W\3W\3W\3W\5W\u0513\nW\3X\5X\u0516\nX\3X\3X\5X\u051a\nX\3X\3X\3X"+
		"\3X\5X\u0520\nX\3X\3X\5X\u0524\nX\3X\3X\3X\3X\3X\3X\3X\3X\3X\5X\u052f"+
		"\nX\3Y\3Y\3Y\5Y\u0534\nY\3Z\3Z\3[\3[\3[\3[\5[\u053c\n[\3[\3[\5[\u0540"+
		"\n[\3\\\3\\\3\\\7\\\u0545\n\\\f\\\16\\\u0548\13\\\3\\\5\\\u054b\n\\\3"+
		"]\3]\3]\5]\u0550\n]\3]\3]\3]\5]\u0555\n]\3]\3]\5]\u0559\n]\3^\3^\3^\3"+
		"^\3^\7^\u0560\n^\f^\16^\u0563\13^\3^\3^\3_\5_\u0568\n_\3_\3_\3`\3`\5`"+
		"\u056e\n`\3`\5`\u0571\n`\3a\3a\5a\u0575\na\3a\5a\u0578\na\3a\3a\3a\5a"+
		"\u057d\na\3b\3b\5b\u0581\nb\3b\5b\u0584\nb\3b\5b\u0587\nb\3b\3b\5b\u058b"+
		"\nb\3b\3b\5b\u058f\nb\3b\3b\5b\u0593\nb\3b\3b\3b\5b\u0598\nb\3b\3b\5b"+
		"\u059c\nb\5b\u059e\nb\3b\3b\7b\u05a2\nb\fb\16b\u05a5\13b\3b\3b\3c\3c\3"+
		"c\7c\u05ac\nc\fc\16c\u05af\13c\3d\5d\u05b2\nd\3d\5d\u05b5\nd\3d\3d\3e"+
		"\3e\3e\3e\7e\u05bd\ne\fe\16e\u05c0\13e\3e\3e\5e\u05c4\ne\5e\u05c6\ne\3"+
		"f\3f\3f\5f\u05cb\nf\3f\3f\3f\3f\7f\u05d1\nf\ff\16f\u05d4\13f\3f\5f\u05d7"+
		"\nf\3f\3f\5f\u05db\nf\3g\3g\3g\7g\u05e0\ng\fg\16g\u05e3\13g\3h\3h\3h\3"+
		"h\7h\u05e9\nh\fh\16h\u05ec\13h\3h\5h\u05ef\nh\3h\5h\u05f2\nh\3h\3h\3i"+
		"\5i\u05f7\ni\3i\3i\3i\5i\u05fc\ni\3j\3j\3j\3j\3j\3j\5j\u0604\nj\5j\u0606"+
		"\nj\3j\3j\3j\3j\5j\u060c\nj\5j\u060e\nj\3j\3j\3j\5j\u0613\nj\3k\3k\3k"+
		"\7k\u0618\nk\fk\16k\u061b\13k\3l\3l\3l\5l\u0620\nl\3m\3m\3m\3m\3m\5m\u0627"+
		"\nm\3n\3n\3n\3n\5n\u062d\nn\3o\3o\3p\3p\3p\3p\3p\3p\5p\u0637\np\3p\3p"+
		"\3p\5p\u063c\np\3p\3p\3p\5p\u0641\np\5p\u0643\np\3q\3q\3r\3r\6r\u0649"+
		"\nr\rr\16r\u064a\3r\3r\6r\u064f\nr\rr\16r\u0650\3r\3r\3r\7r\u0656\nr\f"+
		"r\16r\u0659\13r\3r\5r\u065c\nr\3s\3s\3s\5s\u0661\ns\3t\3t\3t\7t\u0666"+
		"\nt\ft\16t\u0669\13t\3u\3u\7u\u066d\nu\fu\16u\u0670\13u\3v\3v\3v\3v\3"+
		"v\3v\5v\u0678\nv\3w\3w\3w\5w\u067d\nw\3x\3x\3x\3y\3y\3y\3y\5y\u0686\n"+
		"y\3z\5z\u0689\nz\3z\3z\7z\u068d\nz\fz\16z\u0690\13z\3{\3{\3{\5{\u0695"+
		"\n{\3{\3{\3{\3{\5{\u069b\n{\3|\3|\5|\u069f\n|\3}\3}\3}\3}\3}\5}\u06a6"+
		"\n}\3}\7}\u06a9\n}\f}\16}\u06ac\13}\3~\7~\u06af\n~\f~\16~\u06b2\13~\3"+
		"~\3~\3~\3~\3~\3~\5~\u06ba\n~\3~\7~\u06bd\n~\f~\16~\u06c0\13~\3\177\3\177"+
		"\5\177\u06c4\n\177\3\177\3\177\3\177\3\177\3\177\5\177\u06cb\n\177\3\u0080"+
		"\5\u0080\u06ce\n\u0080\3\u0080\3\u0080\5\u0080\u06d2\n\u0080\7\u0080\u06d4"+
		"\n\u0080\f\u0080\16\u0080\u06d7\13\u0080\3\u0081\3\u0081\3\u0081\3\u0081"+
		"\3\u0081\3\u0081\3\u0081\5\u0081\u06e0\n\u0081\3\u0082\3\u0082\3\u0083"+
		"\3\u0083\3\u0084\3\u0084\3\u0085\3\u0085\3\u0086\3\u0086\3\u0087\3\u0087"+
		"\3\u0088\3\u0088\3\u0089\3\u0089\3\u0089\3\u008a\3\u008a\3\u008a\5\u008a"+
		"\u06f6\n\u008a\3\u008a\3\u008a\5\u008a\u06fa\n\u008a\3\u008a\3\u008a\5"+
		"\u008a\u06fe\n\u008a\3\u008a\3\u008a\3\u008a\3\u008a\5\u008a\u0704\n\u008a"+
		"\3\u008a\3\u008a\3\u008a\2\3\u00a8\u008b\2\4\6\b\n\f\16\20\22\24\26\30"+
		"\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080"+
		"\u0082\u0084\u0086\u0088\u008a\u008c\u008e\u0090\u0092\u0094\u0096\u0098"+
		"\u009a\u009c\u009e\u00a0\u00a2\u00a4\u00a6\u00a8\u00aa\u00ac\u00ae\u00b0"+
		"\u00b2\u00b4\u00b6\u00b8\u00ba\u00bc\u00be\u00c0\u00c2\u00c4\u00c6\u00c8"+
		"\u00ca\u00cc\u00ce\u00d0\u00d2\u00d4\u00d6\u00d8\u00da\u00dc\u00de\u00e0"+
		"\u00e2\u00e4\u00e6\u00e8\u00ea\u00ec\u00ee\u00f0\u00f2\u00f4\u00f6\u00f8"+
		"\u00fa\u00fc\u00fe\u0100\u0102\u0104\u0106\u0108\u010a\u010c\u010e\u0110"+
		"\u0112\2\32\4\2::SS\4\288yy\3\2\u00d7\u00d8\3\2\u00cb\u00cc\4\2\u00c4"+
		"\u00c4\u00c6\u00c7\3\2\u00a1\u00a2\3\2YZ\3\2qr\3\2\u00c8\u00ca\4\2\u00c6"+
		"\u00c7\u00ce\u00ce\3\2\u00ba\u00bb\4\2\u00a7\u00a8\u00c0\u00c1\3\2\u00a3"+
		"\u00a6\6\2\u00a9\u00ab\u00ad\u00b5\u00b9\u00b9\u00d9\u00d9\3\2\u00c6\u00c7"+
		"\4\2\u00de\u00df\u00e1\u00e2\4\288kk\4\2..NN\5\2.\u0083\u0085\u009c\u00dd"+
		"\u00dd\6\2..NNnpuu\3\2\u0095\u009c\3\2\u0085\u0094\t\2//\62\62@@_`jjs"+
		"svv\13\2//\61\62?@PP]`jjssvv|~\2\u07d1\2\u0115\3\2\2\2\4\u0122\3\2\2\2"+
		"\6\u0125\3\2\2\2\b\u0145\3\2\2\2\n\u0148\3\2\2\2\f\u014f\3\2\2\2\16\u0157"+
		"\3\2\2\2\20\u0163\3\2\2\2\22\u0165\3\2\2\2\24\u016d\3\2\2\2\26\u017a\3"+
		"\2\2\2\30\u017c\3\2\2\2\32\u0192\3\2\2\2\34\u0194\3\2\2\2\36\u01a9\3\2"+
		"\2\2 \u01d4\3\2\2\2\"\u01d6\3\2\2\2$\u01ec\3\2\2\2&\u01ee\3\2\2\2(\u01f6"+
		"\3\2\2\2*\u01fe\3\2\2\2,\u0201\3\2\2\2.\u0208\3\2\2\2\60\u0216\3\2\2\2"+
		"\62\u0219\3\2\2\2\64\u023b\3\2\2\2\66\u023d\3\2\2\28\u0245\3\2\2\2:\u024d"+
		"\3\2\2\2<\u0254\3\2\2\2>\u025a\3\2\2\2@\u0277\3\2\2\2B\u0279\3\2\2\2D"+
		"\u027b\3\2\2\2F\u029b\3\2\2\2H\u029d\3\2\2\2J\u02a1\3\2\2\2L\u02a6\3\2"+
		"\2\2N\u02a9\3\2\2\2P\u02ad\3\2\2\2R\u02b7\3\2\2\2T\u02bd\3\2\2\2V\u02d3"+
		"\3\2\2\2X\u02d5\3\2\2\2Z\u02d7\3\2\2\2\\\u02f8\3\2\2\2^\u02fe\3\2\2\2"+
		"`\u0304\3\2\2\2b\u030a\3\2\2\2d\u0310\3\2\2\2f\u0313\3\2\2\2h\u0319\3"+
		"\2\2\2j\u034a\3\2\2\2l\u035d\3\2\2\2n\u036b\3\2\2\2p\u036e\3\2\2\2r\u0372"+
		"\3\2\2\2t\u0376\3\2\2\2v\u0383\3\2\2\2x\u0389\3\2\2\2z\u038b\3\2\2\2|"+
		"\u0394\3\2\2\2~\u039d\3\2\2\2\u0080\u03af\3\2\2\2\u0082\u03b1\3\2\2\2"+
		"\u0084\u03c4\3\2\2\2\u0086\u03c6\3\2\2\2\u0088\u03ca\3\2\2\2\u008a\u040f"+
		"\3\2\2\2\u008c\u041a\3\2\2\2\u008e\u041e\3\2\2\2\u0090\u0420\3\2\2\2\u0092"+
		"\u0427\3\2\2\2\u0094\u0435\3\2\2\2\u0096\u0439\3\2\2\2\u0098\u0440\3\2"+
		"\2\2\u009a\u0444\3\2\2\2\u009c\u0447\3\2\2\2\u009e\u044b\3\2\2\2\u00a0"+
		"\u0450\3\2\2\2\u00a2\u0454\3\2\2\2\u00a4\u0460\3\2\2\2\u00a6\u0468\3\2"+
		"\2\2\u00a8\u04bc\3\2\2\2\u00aa\u04ff\3\2\2\2\u00ac\u050c\3\2\2\2\u00ae"+
		"\u052e\3\2\2\2\u00b0\u0530\3\2\2\2\u00b2\u0535\3\2\2\2\u00b4\u0537\3\2"+
		"\2\2\u00b6\u0541\3\2\2\2\u00b8\u0558\3\2\2\2\u00ba\u055a\3\2\2\2\u00bc"+
		"\u0567\3\2\2\2\u00be\u0570\3\2\2\2\u00c0\u057c\3\2\2\2\u00c2\u057e\3\2"+
		"\2\2\u00c4\u05a8\3\2\2\2\u00c6\u05b1\3\2\2\2\u00c8\u05c5\3\2\2\2\u00ca"+
		"\u05da\3\2\2\2\u00cc\u05dc\3\2\2\2\u00ce\u05e4\3\2\2\2\u00d0\u05fb\3\2"+
		"\2\2\u00d2\u0612\3\2\2\2\u00d4\u0614\3\2\2\2\u00d6\u061c\3\2\2\2\u00d8"+
		"\u0626\3\2\2\2\u00da\u062c\3\2\2\2\u00dc\u062e\3\2\2\2\u00de\u0642\3\2"+
		"\2\2\u00e0\u0644\3\2\2\2\u00e2\u065b\3\2\2\2\u00e4\u0660\3\2\2\2\u00e6"+
		"\u0662\3\2\2\2\u00e8\u066a\3\2\2\2\u00ea\u0677\3\2\2\2\u00ec\u0679\3\2"+
		"\2\2\u00ee\u067e\3\2\2\2\u00f0\u0685\3\2\2\2\u00f2\u0688\3\2\2\2\u00f4"+
		"\u069a\3\2\2\2\u00f6\u069e\3\2\2\2\u00f8\u06a5\3\2\2\2\u00fa\u06b0\3\2"+
		"\2\2\u00fc\u06ca\3\2\2\2\u00fe\u06cd\3\2\2\2\u0100\u06df\3\2\2\2\u0102"+
		"\u06e1\3\2\2\2\u0104\u06e3\3\2\2\2\u0106\u06e5\3\2\2\2\u0108\u06e7\3\2"+
		"\2\2\u010a\u06e9\3\2\2\2\u010c\u06eb\3\2\2\2\u010e\u06ed\3\2\2\2\u0110"+
		"\u06ef\3\2\2\2\u0112\u06f2\3\2\2\2\u0114\u0116\7\f\2\2\u0115\u0114\3\2"+
		"\2\2\u0115\u0116\3\2\2\2\u0116\u011a\3\2\2\2\u0117\u0119\5\4\3\2\u0118"+
		"\u0117\3\2\2\2\u0119\u011c\3\2\2\2\u011a\u0118\3\2\2\2\u011a\u011b\3\2"+
		"\2\2\u011b\u011d\3\2\2\2\u011c\u011a\3\2\2\2\u011d\u011e\7\2\2\3\u011e"+
		"\3\3\2\2\2\u011f\u0123\5\6\4\2\u0120\u0123\5\f\7\2\u0121\u0123\5\n\6\2"+
		"\u0122\u011f\3\2\2\2\u0122\u0120\3\2\2\2\u0122\u0121\3\2\2\2\u0123\5\3"+
		"\2\2\2\u0124\u0126\5\b\5\2\u0125\u0124\3\2\2\2\u0126\u0127\3\2\2\2\u0127"+
		"\u0125\3\2\2\2\u0127\u0128\3\2\2\2\u0128\7\3\2\2\2\u0129\u0146\7\n\2\2"+
		"\u012a\u0146\7\7\2\2\u012b\u0146\7\21\2\2\u012c\u0146\7\b\2\2\u012d\u0146"+
		"\7\13\2\2\u012e\u0146\7\32\2\2\u012f\u0146\7\22\2\2\u0130\u0146\7\23\2"+
		"\2\u0131\u0146\7\4\2\2\u0132\u0146\7\24\2\2\u0133\u0146\7\25\2\2\u0134"+
		"\u0146\7\35\2\2\u0135\u0146\7\26\2\2\u0136\u0146\7!\2\2\u0137\u0146\7"+
		"\27\2\2\u0138\u0146\7\30\2\2\u0139\u0146\7\36\2\2\u013a\u0146\7\"\2\2"+
		"\u013b\u0146\7\'\2\2\u013c\u0146\7%\2\2\u013d\u0141\7\5\2\2\u013e\u0140"+
		"\7\16\2\2\u013f\u013e\3\2\2\2\u0140\u0143\3\2\2\2\u0141\u013f\3\2\2\2"+
		"\u0141\u0142\3\2\2\2\u0142\u0144\3\2\2\2\u0143\u0141\3\2\2\2\u0144\u0146"+
		"\7\17\2\2\u0145\u0129\3\2\2\2\u0145\u012a\3\2\2\2\u0145\u012b\3\2\2\2"+
		"\u0145\u012c\3\2\2\2\u0145\u012d\3\2\2\2\u0145\u012e\3\2\2\2\u0145\u012f"+
		"\3\2\2\2\u0145\u0130\3\2\2\2\u0145\u0131\3\2\2\2\u0145\u0132\3\2\2\2\u0145"+
		"\u0133\3\2\2\2\u0145\u0134\3\2\2\2\u0145\u0135\3\2\2\2\u0145\u0136\3\2"+
		"\2\2\u0145\u0137\3\2\2\2\u0145\u0138\3\2\2\2\u0145\u0139\3\2\2\2\u0145"+
		"\u013a\3\2\2\2\u0145\u013b\3\2\2\2\u0145\u013c\3\2\2\2\u0145\u013d\3\2"+
		"\2\2\u0146\t\3\2\2\2\u0147\u0149\7$\2\2\u0148\u0147\3\2\2\2\u0149\u014a"+
		"\3\2\2\2\u014a\u0148\3\2\2\2\u014a\u014b\3\2\2\2\u014b\13\3\2\2\2\u014c"+
		"\u014e\5\16\b\2\u014d\u014c\3\2\2\2\u014e\u0151\3\2\2\2\u014f\u014d\3"+
		"\2\2\2\u014f\u0150\3\2\2\2\u0150\u0153\3\2\2\2\u0151\u014f\3\2\2\2\u0152"+
		"\u0154\5\20\t\2\u0153\u0152\3\2\2\2\u0154\u0155\3\2\2\2\u0155\u0153\3"+
		"\2\2\2\u0155\u0156\3\2\2\2\u0156\r\3\2\2\2\u0157\u0158\7X\2\2\u0158\u0159"+
		"\7g\2\2\u0159\u015a\5\u00c8e\2\u015a\u015b\7\u00d8\2\2\u015b\17\3\2\2"+
		"\2\u015c\u0164\5@!\2\u015d\u0164\5\22\n\2\u015e\u0164\5\30\r\2\u015f\u0164"+
		"\5\34\17\2\u0160\u0164\5\36\20\2\u0161\u0164\5\u00a2R\2\u0162\u0164\5"+
		"\u0110\u0089\2\u0163\u015c\3\2\2\2\u0163\u015d\3\2\2\2\u0163\u015e\3\2"+
		"\2\2\u0163\u015f\3\2\2\2\u0163\u0160\3\2\2\2\u0163\u0161\3\2\2\2\u0163"+
		"\u0162\3\2\2\2\u0164\21\3\2\2\2\u0165\u0167\7\177\2\2\u0166\u0168\t\2"+
		"\2\2\u0167\u0166\3\2\2\2\u0167\u0168\3\2\2\2\u0168\u0169\3\2\2\2\u0169"+
		"\u016a\5\24\13\2\u016a\u016b\7\u00d8\2\2\u016b\23\3\2\2\2\u016c\u016e"+
		"\7\u00be\2\2\u016d\u016c\3\2\2\2\u016d\u016e\3\2\2\2\u016e\u016f\3\2\2"+
		"\2\u016f\u0177\5\26\f\2\u0170\u0172\7\u00d6\2\2\u0171\u0173\7\u00be\2"+
		"\2\u0172\u0171\3\2\2\2\u0172\u0173\3\2\2\2\u0173\u0174\3\2\2\2\u0174\u0176"+
		"\5\26\f\2\u0175\u0170\3\2\2\2\u0176\u0179\3\2\2\2\u0177\u0175\3\2\2\2"+
		"\u0177\u0178\3\2\2\2\u0178\25\3\2\2\2\u0179\u0177\3\2\2\2\u017a\u017b"+
		"\5\u00c8e\2\u017b\27\3\2\2\2\u017c\u018b\7g\2\2\u017d\u017f\5\u00c8e\2"+
		"\u017e\u017d\3\2\2\2\u017e\u017f\3\2\2\2\u017f\u0180\3\2\2\2\u0180\u0184"+
		"\7\u00d4\2\2\u0181\u0183\5\32\16\2\u0182\u0181\3\2\2\2\u0183\u0186\3\2"+
		"\2\2\u0184\u0182\3\2\2\2\u0184\u0185\3\2\2\2\u0185\u0187\3\2\2\2\u0186"+
		"\u0184\3\2\2\2\u0187\u018c\7\u00d5\2\2\u0188\u0189\5\u00c8e\2\u0189\u018a"+
		"\7\u00d8\2\2\u018a\u018c\3\2\2\2\u018b\u017e\3\2\2\2\u018b\u0188\3\2\2"+
		"\2\u018c\31\3\2\2\2\u018d\u0193\5@!\2\u018e\u0193\5\22\n\2\u018f\u0193"+
		"\5\34\17\2\u0190\u0193\5\36\20\2\u0191\u0193\5\u00a2R\2\u0192\u018d\3"+
		"\2\2\2\u0192\u018e\3\2\2\2\u0192\u018f\3\2\2\2\u0192\u0190\3\2\2\2\u0192"+
		"\u0191\3\2\2\2\u0193\33\3\2\2\2\u0194\u0195\5\60\31\2\u0195\u0197\7S\2"+
		"\2\u0196\u0198\7\u00c2\2\2\u0197\u0196\3\2\2\2\u0197\u0198\3\2\2\2\u0198"+
		"\u0199\3\2\2\2\u0199\u019b\5\u0104\u0083\2\u019a\u019c\5$\23\2\u019b\u019a"+
		"\3\2\2\2\u019b\u019c\3\2\2\2\u019c\u019d\3\2\2\2\u019d\u019e\7\u00d0\2"+
		"\2\u019e\u019f\5|?\2\u019f\u01a5\7\u00d1\2\2\u01a0\u01a2\7\u00d7\2\2\u01a1"+
		"\u01a3\7\u00cf\2\2\u01a2\u01a1\3\2\2\2\u01a2\u01a3\3\2\2\2\u01a3\u01a4"+
		"\3\2\2\2\u01a4\u01a6\5\u0080A\2\u01a5\u01a0\3\2\2\2\u01a5\u01a6\3\2\2"+
		"\2\u01a6\u01a7\3\2\2\2\u01a7\u01a8\5D#\2\u01a8\35\3\2\2\2\u01a9\u01ab"+
		"\5\60\31\2\u01aa\u01ac\7n\2\2\u01ab\u01aa\3\2\2\2\u01ab\u01ac\3\2\2\2"+
		"\u01ac\u01ae\3\2\2\2\u01ad\u01af\5\u0102\u0082\2\u01ae\u01ad\3\2\2\2\u01ae"+
		"\u01af\3\2\2\2\u01af\u01b1\3\2\2\2\u01b0\u01b2\7l\2\2\u01b1\u01b0\3\2"+
		"\2\2\u01b1\u01b2\3\2\2\2\u01b2\u01c9\3\2\2\2\u01b3\u01b4\5 \21\2\u01b4"+
		"\u01b6\5\u0104\u0083\2\u01b5\u01b7\5$\23\2\u01b6\u01b5\3\2\2\2\u01b6\u01b7"+
		"\3\2\2\2\u01b7\u01ba\3\2\2\2\u01b8\u01b9\7M\2\2\u01b9\u01bb\5\u00be`\2"+
		"\u01ba\u01b8\3\2\2\2\u01ba\u01bb\3\2\2\2\u01bb\u01be\3\2\2\2\u01bc\u01bd"+
		"\7W\2\2\u01bd\u01bf\5\"\22\2\u01be\u01bc\3\2\2\2\u01be\u01bf\3\2\2\2\u01bf"+
		"\u01ca\3\2\2\2\u01c0\u01c1\7a\2\2\u01c1\u01c3\5\u0104\u0083\2\u01c2\u01c4"+
		"\5$\23\2\u01c3\u01c2\3\2\2\2\u01c3\u01c4\3\2\2\2\u01c4\u01c7\3\2\2\2\u01c5"+
		"\u01c6\7M\2\2\u01c6\u01c8\5\"\22\2\u01c7\u01c5\3\2\2\2\u01c7\u01c8\3\2"+
		"\2\2\u01c8\u01ca\3\2\2\2\u01c9\u01b3\3\2\2\2\u01c9\u01c0\3\2\2\2\u01ca"+
		"\u01cb\3\2\2\2\u01cb\u01cf\7\u00d4\2\2\u01cc\u01ce\5\u008aF\2\u01cd\u01cc"+
		"\3\2\2\2\u01ce\u01d1\3\2\2\2\u01cf\u01cd\3\2\2\2\u01cf\u01d0\3\2\2\2\u01d0"+
		"\u01d2\3\2\2\2\u01d1\u01cf\3\2\2\2\u01d2\u01d3\7\u00d5\2\2\u01d3\37\3"+
		"\2\2\2\u01d4\u01d5\t\3\2\2\u01d5!\3\2\2\2\u01d6\u01db\5\u00be`\2\u01d7"+
		"\u01d8\7\u00d6\2\2\u01d8\u01da\5\u00be`\2\u01d9\u01d7\3\2\2\2\u01da\u01dd"+
		"\3\2\2\2\u01db\u01d9\3\2\2\2\u01db\u01dc\3\2\2\2\u01dc#\3\2\2\2\u01dd"+
		"\u01db\3\2\2\2\u01de\u01df\7\u009e\2\2\u01df\u01e0\5&\24\2\u01e0\u01e1"+
		"\7\u009f\2\2\u01e1\u01ed\3\2\2\2\u01e2\u01e3\7\u009e\2\2\u01e3\u01e4\5"+
		"(\25\2\u01e4\u01e5\7\u009f\2\2\u01e5\u01ed\3\2\2\2\u01e6\u01e7\7\u009e"+
		"\2\2\u01e7\u01e8\5&\24\2\u01e8\u01e9\7\u00d6\2\2\u01e9\u01ea\5(\25\2\u01ea"+
		"\u01eb\7\u009f\2\2\u01eb\u01ed\3\2\2\2\u01ec\u01de\3\2\2\2\u01ec\u01e2"+
		"\3\2\2\2\u01ec\u01e6\3\2\2\2\u01ed%\3\2\2\2\u01ee\u01f3\5*\26\2\u01ef"+
		"\u01f0\7\u00d6\2\2\u01f0\u01f2\5*\26\2\u01f1\u01ef\3\2\2\2\u01f2\u01f5"+
		"\3\2\2\2\u01f3\u01f1\3\2\2\2\u01f3\u01f4\3\2\2\2\u01f4\'\3\2\2\2\u01f5"+
		"\u01f3\3\2\2\2\u01f6\u01fb\5,\27\2\u01f7\u01f8\7\u00d6\2\2\u01f8\u01fa"+
		"\5,\27\2\u01f9\u01f7\3\2\2\2\u01fa\u01fd\3\2\2\2\u01fb\u01f9\3\2\2\2\u01fb"+
		"\u01fc\3\2\2\2\u01fc)\3\2\2\2\u01fd\u01fb\3\2\2\2\u01fe\u01ff\5\60\31"+
		"\2\u01ff\u0200\5\u0104\u0083\2\u0200+\3\2\2\2\u0201\u0202\5\60\31\2\u0202"+
		"\u0203\5\u0104\u0083\2\u0203\u0206\7\u00d9\2\2\u0204\u0207\5\u00be`\2"+
		"\u0205\u0207\5\u010c\u0087\2\u0206\u0204\3\2\2\2\u0206\u0205\3\2\2\2\u0207"+
		"-\3\2\2\2\u0208\u0209\7\u009e\2\2\u0209\u020e\5\u00c0a\2\u020a\u020b\7"+
		"\u00d6\2\2\u020b\u020d\5\u00c0a\2\u020c\u020a\3\2\2\2\u020d\u0210\3\2"+
		"\2\2\u020e\u020c\3\2\2\2\u020e\u020f\3\2\2\2\u020f\u0211\3\2\2\2\u0210"+
		"\u020e\3\2\2\2\u0211\u0212\7\u009f\2\2\u0212/\3\2\2\2\u0213\u0215\5\62"+
		"\32\2\u0214\u0213\3\2\2\2\u0215\u0218\3\2\2\2\u0216\u0214\3\2\2\2\u0216"+
		"\u0217\3\2\2\2\u0217\61\3\2\2\2\u0218\u0216\3\2\2\2\u0219\u021d\7\u00d2"+
		"\2\2\u021a\u021b\5\u0104\u0083\2\u021b\u021c\7\u00d7\2\2\u021c\u021e\3"+
		"\2\2\2\u021d\u021a\3\2\2\2\u021d\u021e\3\2\2\2\u021e\u021f\3\2\2\2\u021f"+
		"\u0224\5\64\33\2\u0220\u0221\7\u00d6\2\2\u0221\u0223\5\64\33\2\u0222\u0220"+
		"\3\2\2\2\u0223\u0226\3\2\2\2\u0224\u0222\3\2\2\2\u0224\u0225\3\2\2\2\u0225"+
		"\u0227\3\2\2\2\u0226\u0224\3\2\2\2\u0227\u0228\7\u00d3\2\2\u0228\63\3"+
		"\2\2\2\u0229\u023c\5\u00c6d\2\u022a\u022b\5\u00c6d\2\u022b\u022c\7\u00d0"+
		"\2\2\u022c\u022d\5\66\34\2\u022d\u022e\7\u00d1\2\2\u022e\u023c\3\2\2\2"+
		"\u022f\u0230\5\u00c6d\2\u0230\u0231\7\u00d0\2\2\u0231\u0232\58\35\2\u0232"+
		"\u0233\7\u00d1\2\2\u0233\u023c\3\2\2\2\u0234\u0235\5\u00c6d\2\u0235\u0236"+
		"\7\u00d0\2\2\u0236\u0237\5\66\34\2\u0237\u0238\7\u00d6\2\2\u0238\u0239"+
		"\58\35\2\u0239\u023a\7\u00d1\2\2\u023a\u023c\3\2\2\2\u023b\u0229\3\2\2"+
		"\2\u023b\u022a\3\2\2\2\u023b\u022f\3\2\2\2\u023b\u0234\3\2\2\2\u023c\65"+
		"\3\2\2\2\u023d\u0242\5\u00a8U\2\u023e\u023f\7\u00d6\2\2\u023f\u0241\5"+
		"\u00a8U\2\u0240\u023e\3\2\2\2\u0241\u0244\3\2\2\2\u0242\u0240\3\2\2\2"+
		"\u0242\u0243\3\2\2\2\u0243\67\3\2\2\2\u0244\u0242\3\2\2\2\u0245\u024a"+
		"\5:\36\2\u0246\u0247\7\u00d6\2\2\u0247\u0249\5:\36\2\u0248\u0246\3\2\2"+
		"\2\u0249\u024c\3\2\2\2\u024a\u0248\3\2\2\2\u024a\u024b\3\2\2\2\u024b9"+
		"\3\2\2\2\u024c\u024a\3\2\2\2\u024d\u024e\7\u00dc\2\2\u024e\u024f\7\u00a0"+
		"\2\2\u024f\u0250\5\u00a8U\2\u0250;\3\2\2\2\u0251\u0253\5> \2\u0252\u0251"+
		"\3\2\2\2\u0253\u0256\3\2\2\2\u0254\u0252\3\2\2\2\u0254\u0255\3\2\2\2\u0255"+
		"=\3\2\2\2\u0256\u0254\3\2\2\2\u0257\u025b\5@!\2\u0258\u025b\5\34\17\2"+
		"\u0259\u025b\5\36\20\2\u025a\u0257\3\2\2\2\u025a\u0258\3\2\2\2\u025a\u0259"+
		"\3\2\2\2\u025b?\3\2\2\2\u025c\u025d\5\u0104\u0083\2\u025d\u025e\7\u00d7"+
		"\2\2\u025e\u0278\3\2\2\2\u025f\u0278\5D#\2\u0260\u0278\5F$\2\u0261\u0278"+
		"\5P)\2\u0262\u0278\5R*\2\u0263\u0278\5T+\2\u0264\u0278\5Z.\2\u0265\u0278"+
		"\5^\60\2\u0266\u0278\5`\61\2\u0267\u0278\5b\62\2\u0268\u0269\5\u00b4["+
		"\2\u0269\u026a\7\u00d8\2\2\u026a\u0278\3\2\2\2\u026b\u0278\5\u0082B\2"+
		"\u026c\u0278\5\u0088E\2\u026d\u0278\5\u0086D\2\u026e\u0278\5d\63\2\u026f"+
		"\u0278\5f\64\2\u0270\u0278\5h\65\2\u0271\u0278\5j\66\2\u0272\u0278\5p"+
		"9\2\u0273\u0278\5r:\2\u0274\u0278\5t;\2\u0275\u0278\5B\"\2\u0276\u0278"+
		"\5v<\2\u0277\u025c\3\2\2\2\u0277\u025f\3\2\2\2\u0277\u0260\3\2\2\2\u0277"+
		"\u0261\3\2\2\2\u0277\u0262\3\2\2\2\u0277\u0263\3\2\2\2\u0277\u0264\3\2"+
		"\2\2\u0277\u0265\3\2\2\2\u0277\u0266\3\2\2\2\u0277\u0267\3\2\2\2\u0277"+
		"\u0268\3\2\2\2\u0277\u026b\3\2\2\2\u0277\u026c\3\2\2\2\u0277\u026d\3\2"+
		"\2\2\u0277\u026e\3\2\2\2\u0277\u026f\3\2\2\2\u0277\u0270\3\2\2\2\u0277"+
		"\u0271\3\2\2\2\u0277\u0272\3\2\2\2\u0277\u0273\3\2\2\2\u0277\u0274\3\2"+
		"\2\2\u0277\u0275\3\2\2\2\u0277\u0276\3\2\2\2\u0278A\3\2\2\2\u0279\u027a"+
		"\7\u00d8\2\2\u027aC\3\2\2\2\u027b\u027c\7\u00d4\2\2\u027c\u027d\5<\37"+
		"\2\u027d\u027e\7\u00d5\2\2\u027eE\3\2\2\2\u027f\u0280\7V\2\2\u0280\u0281"+
		"\5\u00a6T\2\u0281\u0285\5@!\2\u0282\u0284\5H%\2\u0283\u0282\3\2\2\2\u0284"+
		"\u0287\3\2\2\2\u0285\u0283\3\2\2\2\u0285\u0286\3\2\2\2\u0286\u0289\3\2"+
		"\2\2\u0287\u0285\3\2\2\2\u0288\u028a\5L\'\2\u0289\u0288\3\2\2\2\u0289"+
		"\u028a\3\2\2\2\u028a\u029c\3\2\2\2\u028b\u028c\7V\2\2\u028c\u028d\5\u00a6"+
		"T\2\u028d\u028e\7\u00d7\2\2\u028e\u0292\5<\37\2\u028f\u0291\5J&\2\u0290"+
		"\u028f\3\2\2\2\u0291\u0294\3\2\2\2\u0292\u0290\3\2\2\2\u0292\u0293\3\2"+
		"\2\2\u0293\u0296\3\2\2\2\u0294\u0292\3\2\2\2\u0295\u0297\5N(\2\u0296\u0295"+
		"\3\2\2\2\u0296\u0297\3\2\2\2\u0297\u0298\3\2\2\2\u0298\u0299\7H\2\2\u0299"+
		"\u029a\7\u00d8\2\2\u029a\u029c\3\2\2\2\u029b\u027f\3\2\2\2\u029b\u028b"+
		"\3\2\2\2\u029cG\3\2\2\2\u029d\u029e\7C\2\2\u029e\u029f\5\u00a6T\2\u029f"+
		"\u02a0\5@!\2\u02a0I\3\2\2\2\u02a1\u02a2\7C\2\2\u02a2\u02a3\5\u00a6T\2"+
		"\u02a3\u02a4\7\u00d7\2\2\u02a4\u02a5\5<\37\2\u02a5K\3\2\2\2\u02a6\u02a7"+
		"\7B\2\2\u02a7\u02a8\5@!\2\u02a8M\3\2\2\2\u02a9\u02aa\7B\2\2\u02aa\u02ab"+
		"\7\u00d7\2\2\u02ab\u02ac\5<\37\2\u02acO\3\2\2\2\u02ad\u02ae\7\u0081\2"+
		"\2\u02ae\u02b5\5\u00a6T\2\u02af\u02b6\5@!\2\u02b0\u02b1\7\u00d7\2\2\u02b1"+
		"\u02b2\5<\37\2\u02b2\u02b3\7J\2\2\u02b3\u02b4\7\u00d8\2\2\u02b4\u02b6"+
		"\3\2\2\2\u02b5\u02af\3\2\2\2\u02b5\u02b0\3\2\2\2\u02b6Q\3\2\2\2\u02b7"+
		"\u02b8\7>\2\2\u02b8\u02b9\5@!\2\u02b9\u02ba\7\u0081\2\2\u02ba\u02bb\5"+
		"\u00a6T\2\u02bb\u02bc\7\u00d8\2\2\u02bcS\3\2\2\2\u02bd\u02be\7Q\2\2\u02be"+
		"\u02c0\7\u00d0\2\2\u02bf\u02c1\5V,\2\u02c0\u02bf\3\2\2\2\u02c0\u02c1\3"+
		"\2\2\2\u02c1\u02c2\3\2\2\2\u02c2\u02c4\7\u00d8\2\2\u02c3\u02c5\5\u00a4"+
		"S\2\u02c4\u02c3\3\2\2\2\u02c4\u02c5\3\2\2\2\u02c5\u02c6\3\2\2\2\u02c6"+
		"\u02c8\7\u00d8\2\2\u02c7\u02c9\5X-\2\u02c8\u02c7\3\2\2\2\u02c8\u02c9\3"+
		"\2\2\2\u02c9\u02ca\3\2\2\2\u02ca\u02d1\7\u00d1\2\2\u02cb\u02d2\5@!\2\u02cc"+
		"\u02cd\7\u00d7\2\2\u02cd\u02ce\5<\37\2\u02ce\u02cf\7F\2\2\u02cf\u02d0"+
		"\7\u00d8\2\2\u02d0\u02d2\3\2\2\2\u02d1\u02cb\3\2\2\2\u02d1\u02cc\3\2\2"+
		"\2\u02d2U\3\2\2\2\u02d3\u02d4\5\u00a4S\2\u02d4W\3\2\2\2\u02d5\u02d6\5"+
		"\u00a4S\2\u02d6Y\3\2\2\2\u02d7\u02d8\7w\2\2\u02d8\u02f0\5\u00a6T\2\u02d9"+
		"\u02db\7\u00d4\2\2\u02da\u02dc\7\u00d8\2\2\u02db\u02da\3\2\2\2\u02db\u02dc"+
		"\3\2\2\2\u02dc\u02e0\3\2\2\2\u02dd\u02df\5\\/\2\u02de\u02dd\3\2\2\2\u02df"+
		"\u02e2\3\2\2\2\u02e0\u02de\3\2\2\2\u02e0\u02e1\3\2\2\2\u02e1\u02e3\3\2"+
		"\2\2\u02e2\u02e0\3\2\2\2\u02e3\u02f1\7\u00d5\2\2\u02e4\u02e6\7\u00d7\2"+
		"\2\u02e5\u02e7\7\u00d8\2\2\u02e6\u02e5\3\2\2\2\u02e6\u02e7\3\2\2\2\u02e7"+
		"\u02eb\3\2\2\2\u02e8\u02ea\5\\/\2\u02e9\u02e8\3\2\2\2\u02ea\u02ed\3\2"+
		"\2\2\u02eb\u02e9\3\2\2\2\u02eb\u02ec\3\2\2\2\u02ec\u02ee\3\2\2\2\u02ed"+
		"\u02eb\3\2\2\2\u02ee\u02ef\7I\2\2\u02ef\u02f1\7\u00d8\2\2\u02f0\u02d9"+
		"\3\2\2\2\u02f0\u02e4\3\2\2\2\u02f1[\3\2\2\2\u02f2\u02f3\7\66\2\2\u02f3"+
		"\u02f6\5\u00a8U\2\u02f4\u02f6\7=\2\2\u02f5\u02f2\3\2\2\2\u02f5\u02f4\3"+
		"\2\2\2\u02f6\u02f7\3\2\2\2\u02f7\u02f9\t\4\2\2\u02f8\u02f5\3\2\2\2\u02f9"+
		"\u02fa\3\2\2\2\u02fa\u02f8\3\2\2\2\u02fa\u02fb\3\2\2\2\u02fb\u02fc\3\2"+
		"\2\2\u02fc\u02fd\5<\37\2\u02fd]\3\2\2\2\u02fe\u0300\7\64\2\2\u02ff\u0301"+
		"\5\u00a8U\2\u0300\u02ff\3\2\2\2\u0300\u0301\3\2\2\2\u0301\u0302\3\2\2"+
		"\2\u0302\u0303\7\u00d8\2\2\u0303_\3\2\2\2\u0304\u0306\7;\2\2\u0305\u0307"+
		"\5\u00a8U\2\u0306\u0305\3\2\2\2\u0306\u0307\3\2\2\2\u0307\u0308\3\2\2"+
		"\2\u0308\u0309\7\u00d8\2\2\u0309a\3\2\2\2\u030a\u030c\7t\2\2\u030b\u030d"+
		"\5\u00a8U\2\u030c\u030b\3\2\2\2\u030c\u030d\3\2\2\2\u030d\u030e\3\2\2"+
		"\2\u030e\u030f\7\u00d8\2\2\u030fc\3\2\2\2\u0310\u0311\5\u00a8U\2\u0311"+
		"\u0312\7\u00d8\2\2\u0312e\3\2\2\2\u0313\u0314\7~\2\2\u0314\u0315\7\u00d0"+
		"\2\2\u0315\u0316\5\u00e6t\2\u0316\u0317\7\u00d1\2\2\u0317\u0318\7\u00d8"+
		"\2\2\u0318g\3\2\2\2\u0319\u0340\7R\2\2\u031a\u031b\7\u00d0\2\2\u031b\u031c"+
		"\5\u00e8u\2\u031c\u031e\7\60\2\2\u031d\u031f\7\u00c2\2\2\u031e\u031d\3"+
		"\2\2\2\u031e\u031f\3\2\2\2\u031f\u0320\3\2\2\2\u0320\u0326\5\u00aaV\2"+
		"\u0321\u0323\7\u00a0\2\2\u0322\u0324\7\u00c2\2\2\u0323\u0322\3\2\2\2\u0323"+
		"\u0324\3\2\2\2\u0324\u0325\3\2\2\2\u0325\u0327\5\u00e8u\2\u0326\u0321"+
		"\3\2\2\2\u0326\u0327\3\2\2\2\u0327\u0328\3\2\2\2\u0328\u0329\7\u00d1\2"+
		"\2\u0329\u0341\3\2\2\2\u032a\u032b\7\u00d0\2\2\u032b\u032c\5\u00a8U\2"+
		"\u032c\u032d\7\60\2\2\u032d\u0333\5\u00aaV\2\u032e\u0330\7\u00a0\2\2\u032f"+
		"\u0331\7\u00c2\2\2\u0330\u032f\3\2\2\2\u0330\u0331\3\2\2\2\u0331\u0332"+
		"\3\2\2\2\u0332\u0334\5\u00e8u\2\u0333\u032e\3\2\2\2\u0333\u0334\3\2\2"+
		"\2\u0334\u0335\3\2\2\2\u0335\u0336\7\u00d1\2\2\u0336\u0341\3\2\2\2\u0337"+
		"\u0338\7\u00d0\2\2\u0338\u0339\5\u00e8u\2\u0339\u033a\7\60\2\2\u033a\u033b"+
		"\7c\2\2\u033b\u033c\7\u00d0\2\2\u033c\u033d\5\u00fe\u0080\2\u033d\u033e"+
		"\7\u00d1\2\2\u033e\u033f\7\u00d1\2\2\u033f\u0341\3\2\2\2\u0340\u031a\3"+
		"\2\2\2\u0340\u032a\3\2\2\2\u0340\u0337\3\2\2\2\u0341\u0348\3\2\2\2\u0342"+
		"\u0349\5@!\2\u0343\u0344\7\u00d7\2\2\u0344\u0345\5<\37\2\u0345\u0346\7"+
		"G\2\2\u0346\u0347\7\u00d8\2\2\u0347\u0349\3\2\2\2\u0348\u0342\3\2\2\2"+
		"\u0348\u0343\3\2\2\2\u0349i\3\2\2\2\u034a\u034b\7z\2\2\u034b\u035b\5D"+
		"#\2\u034c\u034e\5l\67\2\u034d\u034c\3\2\2\2\u034e\u034f\3\2\2\2\u034f"+
		"\u034d\3\2\2\2\u034f\u0350\3\2\2\2\u0350\u0352\3\2\2\2\u0351\u0353\5n"+
		"8\2\u0352\u0351\3\2\2\2\u0352\u0353\3\2\2\2\u0353\u035c\3\2\2\2\u0354"+
		"\u0356\5l\67\2\u0355\u0354\3\2\2\2\u0356\u0359\3\2\2\2\u0357\u0355\3\2"+
		"\2\2\u0357\u0358\3\2\2\2\u0358\u035a\3\2\2\2\u0359\u0357\3\2\2\2\u035a"+
		"\u035c\5n8\2\u035b\u034d\3\2\2\2\u035b\u0357\3\2\2\2\u035ck\3\2\2\2\u035d"+
		"\u035e\7\67\2\2\u035e\u035f\7\u00d0\2\2\u035f\u0364\5\u00be`\2\u0360\u0361"+
		"\7\u00c3\2\2\u0361\u0363\5\u00be`\2\u0362\u0360\3\2\2\2\u0363\u0366\3"+
		"\2\2\2\u0364\u0362\3\2\2\2\u0364\u0365\3\2\2\2\u0365\u0367\3\2\2\2\u0366"+
		"\u0364\3\2\2\2\u0367\u0368\7\u00dc\2\2\u0368\u0369\7\u00d1\2\2\u0369\u036a"+
		"\5D#\2\u036am\3\2\2\2\u036b\u036c\7O\2\2\u036c\u036d\5D#\2\u036do\3\2"+
		"\2\2\u036e\u036f\7x\2\2\u036f\u0370\5\u00a8U\2\u0370\u0371\7\u00d8\2\2"+
		"\u0371q\3\2\2\2\u0372\u0373\7U\2\2\u0373\u0374\5\u0104\u0083\2\u0374\u0375"+
		"\7\u00d8\2\2\u0375s\3\2\2\2\u0376\u0377\7<\2\2\u0377\u0378\7\u00d0\2\2"+
		"\u0378\u0379\5z>\2\u0379\u0380\7\u00d1\2\2\u037a\u0381\5@!\2\u037b\u037c"+
		"\7\u00d7\2\2\u037c\u037d\5<\37\2\u037d\u037e\7E\2\2\u037e\u037f\7\u00d8"+
		"\2\2\u037f\u0381\3\2\2\2\u0380\u037a\3\2\2\2\u0380\u037b\3\2\2\2\u0381"+
		"u\3\2\2\2\u0382\u0384\5x=\2\u0383\u0382\3\2\2\2\u0384\u0385\3\2\2\2\u0385"+
		"\u0383\3\2\2\2\u0385\u0386\3\2\2\2\u0386w\3\2\2\2\u0387\u038a\5\6\4\2"+
		"\u0388\u038a\5\n\6\2\u0389\u0387\3\2\2\2\u0389\u0388\3\2\2\2\u038ay\3"+
		"\2\2\2\u038b\u0390\5\u00a0Q\2\u038c\u038d\7\u00d6\2\2\u038d\u038f\5\u00a0"+
		"Q\2\u038e\u038c\3\2\2\2\u038f\u0392\3\2\2\2\u0390\u038e\3\2\2\2\u0390"+
		"\u0391\3\2\2\2\u0391{\3\2\2\2\u0392\u0390\3\2\2\2\u0393\u0395\5~@\2\u0394"+
		"\u0393\3\2\2\2\u0394\u0395\3\2\2\2\u0395\u039a\3\2\2\2\u0396\u0397\7\u00d6"+
		"\2\2\u0397\u0399\5~@\2\u0398\u0396\3\2\2\2\u0399\u039c\3\2\2\2\u039a\u0398"+
		"\3\2\2\2\u039a\u039b\3\2\2\2\u039b}\3\2\2\2\u039c\u039a\3\2\2\2\u039d"+
		"\u039f\5\60\31\2\u039e\u03a0\7\u00cf\2\2\u039f\u039e\3\2\2\2\u039f\u03a0"+
		"\3\2\2\2\u03a0\u03a2\3\2\2\2\u03a1\u03a3\5\u0080A\2\u03a2\u03a1\3\2\2"+
		"\2\u03a2\u03a3\3\2\2\2\u03a3\u03a5\3\2\2\2\u03a4\u03a6\7\u00c2\2\2\u03a5"+
		"\u03a4\3\2\2\2\u03a5\u03a6\3\2\2\2\u03a6\u03a8\3\2\2\2\u03a7\u03a9\7\u00bf"+
		"\2\2\u03a8\u03a7\3\2\2\2\u03a8\u03a9\3\2\2\2\u03a9\u03aa\3\2\2\2\u03aa"+
		"\u03ab\5\u009eP\2\u03ab\177\3\2\2\2\u03ac\u03b0\5\u00be`\2\u03ad\u03b0"+
		"\7\65\2\2\u03ae\u03b0\5\u010c\u0087\2\u03af\u03ac\3\2\2\2\u03af\u03ad"+
		"\3\2\2\2\u03af\u03ae\3\2\2\2\u03b0\u0081\3\2\2\2\u03b1\u03b2\7T\2\2\u03b2"+
		"\u03b7\5\u0084C\2\u03b3\u03b4\7\u00d6\2\2\u03b4\u03b6\5\u0084C\2\u03b5"+
		"\u03b3\3\2\2\2\u03b6\u03b9\3\2\2\2\u03b7\u03b5\3\2\2\2\u03b7\u03b8\3\2"+
		"\2\2\u03b8\u03ba\3\2\2\2\u03b9\u03b7\3\2\2\2\u03ba\u03bb\7\u00d8\2\2\u03bb"+
		"\u0083\3\2\2\2\u03bc\u03c5\7\u00dc\2\2\u03bd\u03be\7\u00cd\2\2\u03be\u03c5"+
		"\5\u00e8u\2\u03bf\u03c0\7\u00cd\2\2\u03c0\u03c1\7\u00d4\2\2\u03c1\u03c2"+
		"\5\u00a8U\2\u03c2\u03c3\7\u00d5\2\2\u03c3\u03c5\3\2\2\2\u03c4\u03bc\3"+
		"\2\2\2\u03c4\u03bd\3\2\2\2\u03c4\u03bf\3\2\2\2\u03c5\u0085\3\2\2\2\u03c6"+
		"\u03c7\7A\2\2\u03c7\u03c8\5\u00a4S\2\u03c8\u03c9\7\u00d8\2\2\u03c9\u0087"+
		"\3\2\2\2\u03ca\u03cb\7u\2\2\u03cb\u03d0\5\u009eP\2\u03cc\u03cd\7\u00d6"+
		"\2\2\u03cd\u03cf\5\u009eP\2\u03ce\u03cc\3\2\2\2\u03cf\u03d2\3\2\2\2\u03d0"+
		"\u03ce\3\2\2\2\u03d0\u03d1\3\2\2\2\u03d1\u03d3\3\2\2\2\u03d2\u03d0\3\2"+
		"\2\2\u03d3\u03d4\7\u00d8\2\2\u03d4\u0089\3\2\2\2\u03d5\u03d6\5\60\31\2"+
		"\u03d6\u03d8\5\u009aN\2\u03d7\u03d9\5\u0080A\2\u03d8\u03d7\3\2\2\2\u03d8"+
		"\u03d9\3\2\2\2\u03d9\u03da\3\2\2\2\u03da\u03df\5\u009eP\2\u03db\u03dc"+
		"\7\u00d6\2\2\u03dc\u03de\5\u009eP\2\u03dd\u03db\3\2\2\2\u03de\u03e1\3"+
		"\2\2\2\u03df\u03dd\3\2\2\2\u03df\u03e0\3\2\2\2\u03e0\u03e2\3\2\2\2\u03e1"+
		"\u03df\3\2\2\2\u03e2\u03e3\7\u00d8\2\2\u03e3\u0410\3\2\2\2\u03e4\u03e6"+
		"\5\60\31\2\u03e5\u03e7\5\u009cO\2\u03e6\u03e5\3\2\2\2\u03e6\u03e7\3\2"+
		"\2\2\u03e7\u03e8\3\2\2\2\u03e8\u03ea\7:\2\2\u03e9\u03eb\5\u0080A\2\u03ea"+
		"\u03e9\3\2\2\2\u03ea\u03eb\3\2\2\2\u03eb\u03ec\3\2\2\2\u03ec\u03f1\5\u00a0"+
		"Q\2\u03ed\u03ee\7\u00d6\2\2\u03ee\u03f0\5\u00a0Q\2\u03ef\u03ed\3\2\2\2"+
		"\u03f0\u03f3\3\2\2\2\u03f1\u03ef\3\2\2\2\u03f1\u03f2\3\2\2\2\u03f2\u03f4"+
		"\3\2\2\2\u03f3\u03f1\3\2\2\2\u03f4\u03f5\7\u00d8\2\2\u03f5\u0410\3\2\2"+
		"\2\u03f6\u03f8\5\60\31\2\u03f7\u03f9\5\u009cO\2\u03f8\u03f7\3\2\2\2\u03f8"+
		"\u03f9\3\2\2\2\u03f9\u03fa\3\2\2\2\u03fa\u03fc\7S\2\2\u03fb\u03fd\7\u00c2"+
		"\2\2\u03fc\u03fb\3\2\2\2\u03fc\u03fd\3\2\2\2\u03fd\u03fe\3\2\2\2\u03fe"+
		"\u0400\5\u0104\u0083\2\u03ff\u0401\5$\23\2\u0400\u03ff\3\2\2\2\u0400\u0401"+
		"\3\2\2\2\u0401\u0402\3\2\2\2\u0402\u0403\7\u00d0\2\2\u0403\u0404\5|?\2"+
		"\u0404\u0406\7\u00d1\2\2\u0405\u0407\5\u0096L\2\u0406\u0405\3\2\2\2\u0406"+
		"\u0407\3\2\2\2\u0407\u0408\3\2\2\2\u0408\u0409\5\u0098M\2\u0409\u0410"+
		"\3\2\2\2\u040a\u040b\7\177\2\2\u040b\u040c\5\u00ccg\2\u040c\u040d\5\u008c"+
		"G\2\u040d\u0410\3\2\2\2\u040e\u0410\5\u0112\u008a\2\u040f\u03d5\3\2\2"+
		"\2\u040f\u03e4\3\2\2\2\u040f\u03f6\3\2\2\2\u040f\u040a\3\2\2\2\u040f\u040e"+
		"\3\2\2\2\u0410\u008b\3\2\2\2\u0411\u041b\7\u00d8\2\2\u0412\u0416\7\u00d4"+
		"\2\2\u0413\u0415\5\u008eH\2\u0414\u0413\3\2\2\2\u0415\u0418\3\2\2\2\u0416"+
		"\u0414\3\2\2\2\u0416\u0417\3\2\2\2\u0417\u0419\3\2\2\2\u0418\u0416\3\2"+
		"\2\2\u0419\u041b\7\u00d5\2\2\u041a\u0411\3\2\2\2\u041a\u0412\3\2\2\2\u041b"+
		"\u008d\3\2\2\2\u041c\u041f\5\u0090I\2\u041d\u041f\5\u0092J\2\u041e\u041c"+
		"\3\2\2\2\u041e\u041d\3\2\2\2\u041f\u008f\3\2\2\2\u0420\u0421\5\u00c6d"+
		"\2\u0421\u0422\7\u00bc\2\2\u0422\u0423\5\u0104\u0083\2\u0423\u0424\7\\"+
		"\2\2\u0424\u0425\5\u00ccg\2\u0425\u0426\7\u00d8\2\2\u0426\u0091\3\2\2"+
		"\2\u0427\u0428\5\u0094K\2\u0428\u042e\7\60\2\2\u0429\u042f\5\u0106\u0084"+
		"\2\u042a\u042c\5\u0106\u0084\2\u042b\u042a\3\2\2\2\u042b\u042c\3\2\2\2"+
		"\u042c\u042d\3\2\2\2\u042d\u042f\5\u0104\u0083\2\u042e\u0429\3\2\2\2\u042e"+
		"\u042b\3\2\2\2\u042f\u0430\3\2\2\2\u0430\u0431\7\u00d8\2\2\u0431\u0093"+
		"\3\2\2\2\u0432\u0433\5\u00c6d\2\u0433\u0434\7\u00bc\2\2\u0434\u0436\3"+
		"\2\2\2\u0435\u0432\3\2\2\2\u0435\u0436\3\2\2\2\u0436\u0437\3\2\2\2\u0437"+
		"\u0438\5\u0104\u0083\2\u0438\u0095\3\2\2\2\u0439\u043a\7\u00d7\2\2\u043a"+
		"\u043c\5\u0104\u0083\2\u043b\u043d\5\u00ceh\2\u043c\u043b\3\2\2\2\u043c"+
		"\u043d\3\2\2\2\u043d\u0097\3\2\2\2\u043e\u0441\7\u00d8\2\2\u043f\u0441"+
		"\5D#\2\u0440\u043e\3\2\2\2\u0440\u043f\3\2\2\2\u0441\u0099\3\2\2\2\u0442"+
		"\u0445\5\u009cO\2\u0443\u0445\7\u0080\2\2\u0444\u0442\3\2\2\2\u0444\u0443"+
		"\3\2\2\2\u0445\u009b\3\2\2\2\u0446\u0448\5\u0106\u0084\2\u0447\u0446\3"+
		"\2\2\2\u0448\u0449\3\2\2\2\u0449\u0447\3\2\2\2\u0449\u044a\3\2\2\2\u044a"+
		"\u009d\3\2\2\2\u044b\u044e\7\u00dc\2\2\u044c\u044d\7\u00d9\2\2\u044d\u044f"+
		"\5\u00d2j\2\u044e\u044c\3\2\2\2\u044e\u044f\3\2\2\2\u044f\u009f\3\2\2"+
		"\2\u0450\u0451\5\u0104\u0083\2\u0451\u0452\7\u00d9\2\2\u0452\u0453\5\u00d2"+
		"j\2\u0453\u00a1\3\2\2\2\u0454\u0455\5\60\31\2\u0455\u0456\7:\2\2\u0456"+
		"\u045b\5\u00a0Q\2\u0457\u0458\7\u00d6\2\2\u0458\u045a\5\u00a0Q\2\u0459"+
		"\u0457\3\2\2\2\u045a\u045d\3\2\2\2\u045b\u0459\3\2\2\2\u045b\u045c\3\2"+
		"\2\2\u045c\u045e\3\2\2\2\u045d\u045b\3\2\2\2\u045e\u045f\7\u00d8\2\2\u045f"+
		"\u00a3\3\2\2\2\u0460\u0465\5\u00a8U\2\u0461\u0462\7\u00d6\2\2\u0462\u0464"+
		"\5\u00a8U\2\u0463\u0461\3\2\2\2\u0464\u0467\3\2\2\2\u0465\u0463\3\2\2"+
		"\2\u0465\u0466\3\2\2\2\u0466\u00a5\3\2\2\2\u0467\u0465\3\2\2\2\u0468\u046b"+
		"\7\u00d0\2\2\u0469\u046c\5\u00a8U\2\u046a\u046c\5\u00b4[\2\u046b\u0469"+
		"\3\2\2\2\u046b\u046a\3\2\2\2\u046c\u046d\3\2\2\2\u046d\u046e\7\u00d1\2"+
		"\2\u046e\u00a7\3\2\2\2\u046f\u0470\bU\1\2\u0470\u0471\79\2\2\u0471\u04bd"+
		"\5\u00a8U/\u0472\u04bd\5\u00b0Y\2\u0473\u0474\5\u00e0q\2\u0474\u0475\7"+
		"\u00d2\2\2\u0475\u0476\5\u00a8U\2\u0476\u0477\7\u00d3\2\2\u0477\u04bd"+
		"\3\2\2\2\u0478\u0479\7\u00d0\2\2\u0479\u047a\5\u010e\u0088\2\u047a\u047b"+
		"\7\u00d1\2\2\u047b\u047c\5\u00a8U,\u047c\u04bd\3\2\2\2\u047d\u047e\t\5"+
		"\2\2\u047e\u04bd\5\u00a8U+\u047f\u0480\t\6\2\2\u0480\u04bd\5\u00a8U*\u0481"+
		"\u0482\t\7\2\2\u0482\u04bd\5\u00e8u\2\u0483\u0484\5\u00e8u\2\u0484\u0485"+
		"\t\7\2\2\u0485\u04bd\3\2\2\2\u0486\u0487\7m\2\2\u0487\u04bd\5\u00a8U\'"+
		"\u0488\u04bd\5\u00e8u\2\u0489\u04bd\5\u00d8m\2\u048a\u04bd\5\u00e2r\2"+
		"\u048b\u04bd\7\u00dd\2\2\u048c\u04bd\7\u00e3\2\2\u048d\u04bd\5\u00a6T"+
		"\2\u048e\u04bd\5\u00acW\2\u048f\u04bd\7\u0082\2\2\u0490\u0491\7c\2\2\u0491"+
		"\u0492\7\u00d0\2\2\u0492\u0493\5\u00fe\u0080\2\u0493\u0494\7\u00d1\2\2"+
		"\u0494\u0495\7\u00d9\2\2\u0495\u0496\5\u00a8U\36\u0496\u04bd\3\2\2\2\u0497"+
		"\u0498\7b\2\2\u0498\u0499\7\u00d0\2\2\u0499\u049a\5\u00e6t\2\u049a\u049b"+
		"\7\u00d1\2\2\u049b\u04bd\3\2\2\2\u049c\u049d\7D\2\2\u049d\u049e\7\u00d0"+
		"\2\2\u049e\u049f\5\u00e8u\2\u049f\u04a0\7\u00d1\2\2\u04a0\u04bd\3\2\2"+
		"\2\u04a1\u04a2\7K\2\2\u04a2\u04a3\7\u00d0\2\2\u04a3\u04a4\5\u00a8U\2\u04a4"+
		"\u04a5\7\u00d1\2\2\u04a5\u04bd\3\2\2\2\u04a6\u04aa\7L\2\2\u04a7\u04a8"+
		"\7\u00d0\2\2\u04a8\u04ab\7\u00d1\2\2\u04a9\u04ab\5\u00a6T\2\u04aa\u04a7"+
		"\3\2\2\2\u04aa\u04a9\3\2\2\2\u04aa\u04ab\3\2\2\2\u04ab\u04bd\3\2\2\2\u04ac"+
		"\u04ad\t\b\2\2\u04ad\u04bd\5\u00a8U\31\u04ae\u04af\t\t\2\2\u04af\u04bd"+
		"\5\u00a8U\30\u04b0\u04bd\5\u00aeX\2\u04b1\u04b2\5\u00aaV\2\u04b2\u04b3"+
		"\5\u00b2Z\2\u04b3\u04b4\5\u00a8U\7\u04b4\u04bd\3\2\2\2\u04b5\u04b6\5\u00aa"+
		"V\2\u04b6\u04b7\7\u00d9\2\2\u04b7\u04ba\7\u00c2\2\2\u04b8\u04bb\5\u00e8"+
		"u\2\u04b9\u04bb\5\u00b0Y\2\u04ba\u04b8\3\2\2\2\u04ba\u04b9\3\2\2\2\u04bb"+
		"\u04bd\3\2\2\2\u04bc\u046f\3\2\2\2\u04bc\u0472\3\2\2\2\u04bc\u0473\3\2"+
		"\2\2\u04bc\u0478\3\2\2\2\u04bc\u047d\3\2\2\2\u04bc\u047f\3\2\2\2\u04bc"+
		"\u0481\3\2\2\2\u04bc\u0483\3\2\2\2\u04bc\u0486\3\2\2\2\u04bc\u0488\3\2"+
		"\2\2\u04bc\u0489\3\2\2\2\u04bc\u048a\3\2\2\2\u04bc\u048b\3\2\2\2\u04bc"+
		"\u048c\3\2\2\2\u04bc\u048d\3\2\2\2\u04bc\u048e\3\2\2\2\u04bc\u048f\3\2"+
		"\2\2\u04bc\u0490\3\2\2\2\u04bc\u0497\3\2\2\2\u04bc\u049c\3\2\2\2\u04bc"+
		"\u04a1\3\2\2\2\u04bc\u04a6\3\2\2\2\u04bc\u04ac\3\2\2\2\u04bc\u04ae\3\2"+
		"\2\2\u04bc\u04b0\3\2\2\2\u04bc\u04b1\3\2\2\2\u04bc\u04b5\3\2\2\2\u04bd"+
		"\u04fa\3\2\2\2\u04be\u04bf\f\26\2\2\u04bf\u04c0\7\u00ac\2\2\u04c0\u04f9"+
		"\5\u00a8U\26\u04c1\u04c2\f\24\2\2\u04c2\u04c3\t\n\2\2\u04c3\u04f9\5\u00a8"+
		"U\25\u04c4\u04c5\f\23\2\2\u04c5\u04c6\t\13\2\2\u04c6\u04f9\5\u00a8U\24"+
		"\u04c7\u04c8\f\22\2\2\u04c8\u04c9\t\f\2\2\u04c9\u04f9\5\u00a8U\23\u04ca"+
		"\u04cb\f\21\2\2\u04cb\u04cc\t\r\2\2\u04cc\u04f9\5\u00a8U\22\u04cd\u04ce"+
		"\f\20\2\2\u04ce\u04cf\t\16\2\2\u04cf\u04f9\5\u00a8U\21\u04d0\u04d1\f\17"+
		"\2\2\u04d1\u04d2\7\u00c2\2\2\u04d2\u04f9\5\u00a8U\20\u04d3\u04d4\f\16"+
		"\2\2\u04d4\u04d5\7\u00c5\2\2\u04d5\u04f9\5\u00a8U\17\u04d6\u04d7\f\r\2"+
		"\2\u04d7\u04d8\7\u00c3\2\2\u04d8\u04f9\5\u00a8U\16\u04d9\u04da\f\f\2\2"+
		"\u04da\u04db\7\u00b7\2\2\u04db\u04f9\5\u00a8U\r\u04dc\u04dd\f\13\2\2\u04dd"+
		"\u04de\7\u00b6\2\2\u04de\u04f9\5\u00a8U\f\u04df\u04e0\f\n\2\2\u04e0\u04e2"+
		"\7\u00cf\2\2\u04e1\u04e3\5\u00a8U\2\u04e2\u04e1\3\2\2\2\u04e2\u04e3\3"+
		"\2\2\2\u04e3\u04e4\3\2\2\2\u04e4\u04e5\7\u00d7\2\2\u04e5\u04f9\5\u00a8"+
		"U\13\u04e6\u04e7\f\t\2\2\u04e7\u04e8\7\u00b8\2\2\u04e8\u04f9\5\u00a8U"+
		"\n\u04e9\u04ea\f\b\2\2\u04ea\u04eb\7\u009d\2\2\u04eb\u04f9\5\u00a8U\t"+
		"\u04ec\u04ed\f\5\2\2\u04ed\u04ee\7d\2\2\u04ee\u04f9\5\u00a8U\6\u04ef\u04f0"+
		"\f\4\2\2\u04f0\u04f1\7f\2\2\u04f1\u04f9\5\u00a8U\5\u04f2\u04f3\f\3\2\2"+
		"\u04f3\u04f4\7e\2\2\u04f4\u04f9\5\u00a8U\4\u04f5\u04f6\f\25\2\2\u04f6"+
		"\u04f7\7[\2\2\u04f7\u04f9\5\u00c0a\2\u04f8\u04be\3\2\2\2\u04f8\u04c1\3"+
		"\2\2\2\u04f8\u04c4\3\2\2\2\u04f8\u04c7\3\2\2\2\u04f8\u04ca\3\2\2\2\u04f8"+
		"\u04cd\3\2\2\2\u04f8\u04d0\3\2\2\2\u04f8\u04d3\3\2\2\2\u04f8\u04d6\3\2"+
		"\2\2\u04f8\u04d9\3\2\2\2\u04f8\u04dc\3\2\2\2\u04f8\u04df\3\2\2\2\u04f8"+
		"\u04e6\3\2\2\2\u04f8\u04e9\3\2\2\2\u04f8\u04ec\3\2\2\2\u04f8\u04ef\3\2"+
		"\2\2\u04f8\u04f2\3\2\2\2\u04f8\u04f5\3\2\2\2\u04f9\u04fc\3\2\2\2\u04fa"+
		"\u04f8\3\2\2\2\u04fa\u04fb\3\2\2\2\u04fb\u00a9\3\2\2\2\u04fc\u04fa\3\2"+
		"\2\2\u04fd\u0500\5\u00e8u\2\u04fe\u0500\5\u00acW\2\u04ff\u04fd\3\2\2\2"+
		"\u04ff\u04fe\3\2\2\2\u0500\u00ab\3\2\2\2\u0501\u0502\7/\2\2\u0502\u0504"+
		"\7\u00d0\2\2\u0503\u0505\5\u00b6\\\2\u0504\u0503\3\2\2\2\u0504\u0505\3"+
		"\2\2\2\u0505\u0506\3\2\2\2\u0506\u050d\7\u00d1\2\2\u0507\u0509\7\u00d2"+
		"\2\2\u0508\u050a\5\u00b6\\\2\u0509\u0508\3\2\2\2\u0509\u050a\3\2\2\2\u050a"+
		"\u050b\3\2\2\2\u050b\u050d\7\u00d3\2\2\u050c\u0501\3\2\2\2\u050c\u0507"+
		"\3\2\2\2\u050d\u0512\3\2\2\2\u050e\u050f\7\u00d2\2\2\u050f\u0510\5\u00a8"+
		"U\2\u0510\u0511\7\u00d3\2\2\u0511\u0513\3\2\2\2\u0512\u050e\3\2\2\2\u0512"+
		"\u0513\3\2\2\2\u0513\u00ad\3\2\2\2\u0514\u0516\7u\2\2\u0515\u0514\3\2"+
		"\2\2\u0515\u0516\3\2\2\2\u0516\u0517\3\2\2\2\u0517\u0519\7S\2\2\u0518"+
		"\u051a\7\u00c2\2\2\u0519\u0518\3\2\2\2\u0519\u051a\3\2\2\2\u051a\u051b"+
		"\3\2\2\2\u051b\u051c\7\u00d0\2\2\u051c\u051d\5|?\2\u051d\u051f\7\u00d1"+
		"\2\2\u051e\u0520\5\u00ba^\2\u051f\u051e\3\2\2\2\u051f\u0520\3\2\2\2\u0520"+
		"\u0523\3\2\2\2\u0521\u0522\7\u00d7\2\2\u0522\u0524\5\u0080A\2\u0523\u0521"+
		"\3\2\2\2\u0523\u0524\3\2\2\2\u0524\u0525\3\2\2\2\u0525\u0526\5D#\2\u0526"+
		"\u052f\3\2\2\2\u0527\u0528\7\u0084\2\2\u0528\u0529\7\u00d0\2\2\u0529\u052a"+
		"\5|?\2\u052a\u052b\7\u00d1\2\2\u052b\u052c\7\u00a0\2\2\u052c\u052d\5\u00a8"+
		"U\2\u052d\u052f\3\2\2\2\u052e\u0515\3\2\2\2\u052e\u0527\3\2\2\2\u052f"+
		"\u00af\3\2\2\2\u0530\u0531\7h\2\2\u0531\u0533\5\u00c0a\2\u0532\u0534\5"+
		"\u00ceh\2\u0533\u0532\3\2\2\2\u0533\u0534\3\2\2\2\u0534\u00b1\3\2\2\2"+
		"\u0535\u0536\t\17\2\2\u0536\u00b3\3\2\2\2\u0537\u053f\7\u0082\2\2\u0538"+
		"\u053b\5\u00a8U\2\u0539\u053a\7\u00a0\2\2\u053a\u053c\5\u00a8U\2\u053b"+
		"\u0539\3\2\2\2\u053b\u053c\3\2\2\2\u053c\u0540\3\2\2\2\u053d\u053e\7\u0083"+
		"\2\2\u053e\u0540\5\u00a8U\2\u053f\u0538\3\2\2\2\u053f\u053d\3\2\2\2\u0540"+
		"\u00b5\3\2\2\2\u0541\u0546\5\u00b8]\2\u0542\u0543\7\u00d6\2\2\u0543\u0545"+
		"\5\u00b8]\2\u0544\u0542\3\2\2\2\u0545\u0548\3\2\2\2\u0546\u0544\3\2\2"+
		"\2\u0546\u0547\3\2\2\2\u0547\u054a\3\2\2\2\u0548\u0546\3\2\2\2\u0549\u054b"+
		"\7\u00d6\2\2\u054a\u0549\3\2\2\2\u054a\u054b\3\2\2\2\u054b\u00b7\3\2\2"+
		"\2\u054c\u054f\5\u00a8U\2\u054d\u054e\7\u00a0\2\2\u054e\u0550\5\u00a8"+
		"U\2\u054f\u054d\3\2\2\2\u054f\u0550\3\2\2\2\u0550\u0559\3\2\2\2\u0551"+
		"\u0552\5\u00a8U\2\u0552\u0553\7\u00a0\2\2\u0553\u0555\3\2\2\2\u0554\u0551"+
		"\3\2\2\2\u0554\u0555\3\2\2\2\u0555\u0556\3\2\2\2\u0556\u0557\7\u00c2\2"+
		"\2\u0557\u0559\5\u00e8u\2\u0558\u054c\3\2\2\2\u0558\u0554\3\2\2\2\u0559"+
		"\u00b9\3\2\2\2\u055a\u055b\7\177\2\2\u055b\u055c\7\u00d0\2\2\u055c\u0561"+
		"\5\u00bc_\2\u055d\u055e\7\u00d6\2\2\u055e\u0560\5\u00bc_\2\u055f\u055d"+
		"\3\2\2\2\u0560\u0563\3\2\2\2\u0561\u055f\3\2\2\2\u0561\u0562\3\2\2\2\u0562"+
		"\u0564\3\2\2\2\u0563\u0561\3\2\2\2\u0564\u0565\7\u00d1\2\2\u0565\u00bb"+
		"\3\2\2\2\u0566\u0568\7\u00c2\2\2\u0567\u0566\3\2\2\2\u0567\u0568\3\2\2"+
		"\2\u0568\u0569\3\2\2\2\u0569\u056a\7\u00dc\2\2\u056a\u00bd\3\2\2\2\u056b"+
		"\u056d\5\u00c6d\2\u056c\u056e\5.\30\2\u056d\u056c\3\2\2\2\u056d\u056e"+
		"\3\2\2\2\u056e\u0571\3\2\2\2\u056f\u0571\7u\2\2\u0570\u056b\3\2\2\2\u0570"+
		"\u056f\3\2\2\2\u0571\u00bf\3\2\2\2\u0572\u0575\5\u00c6d\2\u0573\u0575"+
		"\5\u00c4c\2\u0574\u0572\3\2\2\2\u0574\u0573\3\2\2\2\u0575\u0577\3\2\2"+
		"\2\u0576\u0578\5.\30\2\u0577\u0576\3\2\2\2\u0577\u0578\3\2\2\2\u0578\u057d"+
		"\3\2\2\2\u0579\u057d\5\u010c\u0087\2\u057a\u057d\7u\2\2\u057b\u057d\5"+
		"\u00c2b\2\u057c\u0574\3\2\2\2\u057c\u0579\3\2\2\2\u057c\u057a\3\2\2\2"+
		"\u057c\u057b\3\2\2\2\u057d\u00c1\3\2\2\2\u057e\u0580\5\60\31\2\u057f\u0581"+
		"\7n\2\2\u0580\u057f\3\2\2\2\u0580\u0581\3\2\2\2\u0581\u0583\3\2\2\2\u0582"+
		"\u0584\5\u0102\u0082\2\u0583\u0582\3\2\2\2\u0583\u0584\3\2\2\2\u0584\u0586"+
		"\3\2\2\2\u0585\u0587\7l\2\2\u0586\u0585\3\2\2\2\u0586\u0587\3\2\2\2\u0587"+
		"\u059d\3\2\2\2\u0588\u058a\5 \21\2\u0589\u058b\5$\23\2\u058a\u0589\3\2"+
		"\2\2\u058a\u058b\3\2\2\2\u058b\u058e\3\2\2\2\u058c\u058d\7M\2\2\u058d"+
		"\u058f\5\u00be`\2\u058e\u058c\3\2\2\2\u058e\u058f\3\2\2\2\u058f\u0592"+
		"\3\2\2\2\u0590\u0591\7W\2\2\u0591\u0593\5\"\22\2\u0592\u0590\3\2\2\2\u0592"+
		"\u0593\3\2\2\2\u0593\u059e\3\2\2\2\u0594\u0595\7a\2\2\u0595\u0597\5\u0104"+
		"\u0083\2\u0596\u0598\5$\23\2\u0597\u0596\3\2\2\2\u0597\u0598\3\2\2\2\u0598"+
		"\u059b\3\2\2\2\u0599\u059a\7M\2\2\u059a\u059c\5\"\22\2\u059b\u0599\3\2"+
		"\2\2\u059b\u059c\3\2\2\2\u059c\u059e\3\2\2\2\u059d\u0588\3\2\2\2\u059d"+
		"\u0594\3\2\2\2\u059e\u059f\3\2\2\2\u059f\u05a3\7\u00d4\2\2\u05a0\u05a2"+
		"\5\u008aF\2\u05a1\u05a0\3\2\2\2\u05a2\u05a5\3\2\2\2\u05a3\u05a1\3\2\2"+
		"\2\u05a3\u05a4\3\2\2\2\u05a4\u05a6\3\2\2\2\u05a5\u05a3\3\2\2\2\u05a6\u05a7"+
		"\7\u00d5\2\2\u05a7\u00c3\3\2\2\2\u05a8\u05ad\5\u00f4{\2\u05a9\u05aa\7"+
		"\u00bd\2\2\u05aa\u05ac\5\u00f6|\2\u05ab\u05a9\3\2\2\2\u05ac\u05af\3\2"+
		"\2\2\u05ad\u05ab\3\2\2\2\u05ad\u05ae\3\2\2\2\u05ae\u00c5\3\2\2\2\u05af"+
		"\u05ad\3\2\2\2\u05b0\u05b2\7g\2\2\u05b1\u05b0\3\2\2\2\u05b1\u05b2\3\2"+
		"\2\2\u05b2\u05b4\3\2\2\2\u05b3\u05b5\7\u00be\2\2\u05b4\u05b3\3\2\2\2\u05b4"+
		"\u05b5\3\2\2\2\u05b5\u05b6\3\2\2\2\u05b6\u05b7\5\u00c8e\2\u05b7\u00c7"+
		"\3\2\2\2\u05b8\u05c6\5\u0104\u0083\2\u05b9\u05be\5\u0104\u0083\2\u05ba"+
		"\u05bb\7\u00be\2\2\u05bb\u05bd\5\u0104\u0083\2\u05bc\u05ba\3\2\2\2\u05bd"+
		"\u05c0\3\2\2\2\u05be\u05bc\3\2\2\2\u05be\u05bf\3\2\2\2\u05bf\u05c3\3\2"+
		"\2\2\u05c0\u05be\3\2\2\2\u05c1\u05c2\7\u00be\2\2\u05c2\u05c4\5\u00caf"+
		"\2\u05c3\u05c1\3\2\2\2\u05c3\u05c4\3\2\2\2\u05c4\u05c6\3\2\2\2\u05c5\u05b8"+
		"\3\2\2\2\u05c5\u05b9\3\2\2\2\u05c6\u00c9\3\2\2\2\u05c7\u05ca\5\u0104\u0083"+
		"\2\u05c8\u05c9\7\60\2\2\u05c9\u05cb\5\u0104\u0083\2\u05ca\u05c8\3\2\2"+
		"\2\u05ca\u05cb\3\2\2\2\u05cb\u05db\3\2\2\2\u05cc\u05cd\7\u00d4\2\2\u05cd"+
		"\u05d2\5\u00caf\2\u05ce\u05cf\7\u00d6\2\2\u05cf\u05d1\5\u00caf\2\u05d0"+
		"\u05ce\3\2\2\2\u05d1\u05d4\3\2\2\2\u05d2\u05d0\3\2\2\2\u05d2\u05d3\3\2"+
		"\2\2\u05d3\u05d6\3\2\2\2\u05d4\u05d2\3\2\2\2\u05d5\u05d7\7\u00d6\2\2\u05d6"+
		"\u05d5\3\2\2\2\u05d6\u05d7\3\2\2\2\u05d7\u05d8\3\2\2\2\u05d8\u05d9\7\u00d5"+
		"\2\2\u05d9\u05db\3\2\2\2\u05da\u05c7\3\2\2\2\u05da\u05cc\3\2\2\2\u05db"+
		"\u00cb\3\2\2\2\u05dc\u05e1\5\u00c6d\2\u05dd\u05de\7\u00d6\2\2\u05de\u05e0"+
		"\5\u00c6d\2\u05df\u05dd\3\2\2\2\u05e0\u05e3\3\2\2\2\u05e1\u05df\3\2\2"+
		"\2\u05e1\u05e2\3\2\2\2\u05e2\u00cd\3\2\2\2\u05e3\u05e1\3\2\2\2\u05e4\u05ee"+
		"\7\u00d0\2\2\u05e5\u05ea\5\u00d0i\2\u05e6\u05e7\7\u00d6\2\2\u05e7\u05e9"+
		"\5\u00d0i\2\u05e8\u05e6\3\2\2\2\u05e9\u05ec\3\2\2\2\u05ea\u05e8\3\2\2"+
		"\2\u05ea\u05eb\3\2\2\2\u05eb\u05ef\3\2\2\2\u05ec\u05ea\3\2\2\2\u05ed\u05ef"+
		"\5\u00b4[\2\u05ee\u05e5\3\2\2\2\u05ee\u05ed\3\2\2\2\u05ee\u05ef\3\2\2"+
		"\2\u05ef\u05f1\3\2\2\2\u05f0\u05f2\7\u00d6\2\2\u05f1\u05f0\3\2\2\2\u05f1"+
		"\u05f2\3\2\2\2\u05f2\u05f3\3\2\2\2\u05f3\u05f4\7\u00d1\2\2\u05f4\u00cf"+
		"\3\2\2\2\u05f5\u05f7\7\u00bf\2\2\u05f6\u05f5\3\2\2\2\u05f6\u05f7\3\2\2"+
		"\2\u05f7\u05f8\3\2\2\2\u05f8\u05fc\5\u00a8U\2\u05f9\u05fa\7\u00c2\2\2"+
		"\u05fa\u05fc\5\u00e8u\2\u05fb\u05f6\3\2\2\2\u05fb\u05f9\3\2\2\2\u05fc"+
		"\u00d1\3\2\2\2\u05fd\u0613\5\u00d8m\2\u05fe\u0613\5\u00e2r\2\u05ff\u0600"+
		"\7/\2\2\u0600\u0605\7\u00d0\2\2\u0601\u0603\5\u00d4k\2\u0602\u0604\7\u00d6"+
		"\2\2\u0603\u0602\3\2\2\2\u0603\u0604\3\2\2\2\u0604\u0606\3\2\2\2\u0605"+
		"\u0601\3\2\2\2\u0605\u0606\3\2\2\2\u0606\u0607\3\2\2\2\u0607\u0613\7\u00d1"+
		"\2\2\u0608\u060d\7\u00d2\2\2\u0609\u060b\5\u00d4k\2\u060a\u060c\7\u00d6"+
		"\2\2\u060b\u060a\3\2\2\2\u060b\u060c\3\2\2\2\u060c\u060e\3\2\2\2\u060d"+
		"\u0609\3\2\2\2\u060d\u060e\3\2\2\2\u060e\u060f\3\2\2\2\u060f\u0613\7\u00d3"+
		"\2\2\u0610\u0611\t\20\2\2\u0611\u0613\5\u00d2j\2\u0612\u05fd\3\2\2\2\u0612"+
		"\u05fe\3\2\2\2\u0612\u05ff\3\2\2\2\u0612\u0608\3\2\2\2\u0612\u0610\3\2"+
		"\2\2\u0613\u00d3\3\2\2\2\u0614\u0619\5\u00d6l\2\u0615\u0616\7\u00d6\2"+
		"\2\u0616\u0618\5\u00d6l\2\u0617\u0615\3\2\2\2\u0618\u061b\3\2\2\2\u0619"+
		"\u0617\3\2\2\2\u0619\u061a\3\2\2\2\u061a\u00d5\3\2\2\2\u061b\u0619\3\2"+
		"\2\2\u061c\u061f\5\u00d2j\2\u061d\u061e\7\u00a0\2\2\u061e\u0620\5\u00d2"+
		"j\2\u061f\u061d\3\2\2\2\u061f\u0620\3\2\2\2\u0620\u00d7\3\2\2\2\u0621"+
		"\u0627\7i\2\2\u0622\u0627\5\u00dan\2\u0623\u0627\5\u0108\u0085\2\u0624"+
		"\u0627\5\u00dep\2\u0625\u0627\5\u00c6d\2\u0626\u0621\3\2\2\2\u0626\u0622"+
		"\3\2\2\2\u0626\u0623\3\2\2\2\u0626\u0624\3\2\2\2\u0626\u0625\3\2\2\2\u0627"+
		"\u00d9\3\2\2\2\u0628\u062d\7\u00e0\2\2\u0629\u062d\7\63\2\2\u062a\u062d"+
		"\5\u00dco\2\u062b\u062d\5\u00e0q\2\u062c\u0628\3\2\2\2\u062c\u0629\3\2"+
		"\2\2\u062c\u062a\3\2\2\2\u062c\u062b\3\2\2\2\u062d\u00db\3\2\2\2\u062e"+
		"\u062f\t\21\2\2\u062f\u00dd\3\2\2\2\u0630\u0631\t\22\2\2\u0631\u0636\7"+
		"\u00bc\2\2\u0632\u0637\5\u0104\u0083\2\u0633\u0637\7\u0089\2\2\u0634\u0637"+
		"\7\u0085\2\2\u0635\u0637\7\u0086\2\2\u0636\u0632\3\2\2\2\u0636\u0633\3"+
		"\2\2\2\u0636\u0634\3\2\2\2\u0636\u0635\3\2\2\2\u0637\u0643\3\2\2\2\u0638"+
		"\u063c\5\u00be`\2\u0639\u063c\5\u00fa~\2\u063a\u063c\5\u00e2r\2\u063b"+
		"\u0638\3\2\2\2\u063b\u0639\3\2\2\2\u063b\u063a\3\2\2\2\u063c\u063d\3\2"+
		"\2\2\u063d\u0640\7\u00bc\2\2\u063e\u0641\5\u0104\u0083\2\u063f\u0641\5"+
		"\u00fa~\2\u0640\u063e\3\2\2\2\u0640\u063f\3\2\2\2\u0641\u0643\3\2\2\2"+
		"\u0642\u0630\3\2\2\2\u0642\u063b\3\2\2\2\u0643\u00df\3\2\2\2\u0644\u0645"+
		"\7\u00dd\2\2\u0645\u00e1\3\2\2\2\u0646\u0648\7\u00e7\2\2\u0647\u0649\7"+
		"\u00ef\2\2\u0648\u0647\3\2\2\2\u0649\u064a\3\2\2\2\u064a\u0648\3\2\2\2"+
		"\u064a\u064b\3\2\2\2\u064b\u065c\3\2\2\2\u064c\u064e\7\u00e6\2\2\u064d"+
		"\u064f\7\u00ef\2\2\u064e\u064d\3\2\2\2\u064f\u0650\3\2\2\2\u0650\u064e"+
		"\3\2\2\2\u0650\u0651\3\2\2\2\u0651\u065c\3\2\2\2\u0652\u065c\7\u00e4\2"+
		"\2\u0653\u0657\7\u00e5\2\2\u0654\u0656\5\u00e4s\2\u0655\u0654\3\2\2\2"+
		"\u0656\u0659\3\2\2\2\u0657\u0655\3\2\2\2\u0657\u0658\3\2\2\2\u0658\u065a"+
		"\3\2\2\2\u0659\u0657\3\2\2\2\u065a\u065c\7\u00e5\2\2\u065b\u0646\3\2\2"+
		"\2\u065b\u064c\3\2\2\2\u065b\u0652\3\2\2\2\u065b\u0653\3\2\2\2\u065c\u00e3"+
		"\3\2\2\2\u065d\u0661\7\u00eb\2\2\u065e\u0661\7\u00ea\2\2\u065f\u0661\5"+
		"\u00e8u\2\u0660\u065d\3\2\2\2\u0660\u065e\3\2\2\2\u0660\u065f\3\2\2\2"+
		"\u0661\u00e5\3\2\2\2\u0662\u0667\5\u00e8u\2\u0663\u0664\7\u00d6\2\2\u0664"+
		"\u0666\5\u00e8u\2\u0665\u0663\3\2\2\2\u0666\u0669\3\2\2\2\u0667\u0665"+
		"\3\2\2\2\u0667\u0668\3\2\2\2\u0668\u00e7\3\2\2\2\u0669\u0667\3\2\2\2\u066a"+
		"\u066e\5\u00eav\2\u066b\u066d\5\u00ecw\2\u066c\u066b\3\2\2\2\u066d\u0670"+
		"\3\2\2\2\u066e\u066c\3\2\2\2\u066e\u066f\3\2\2\2\u066f\u00e9\3\2\2\2\u0670"+
		"\u066e\3\2\2\2\u0671\u0678\5\u00f4{\2\u0672\u0678\5\u00eex\2\u0673\u0674"+
		"\7\u00d0\2\2\u0674\u0675\5\u00b0Y\2\u0675\u0676\7\u00d1\2\2\u0676\u0678"+
		"\3\2\2\2\u0677\u0671\3\2\2\2\u0677\u0672\3\2\2\2\u0677\u0673\3\2\2\2\u0678"+
		"\u00eb\3\2\2\2\u0679\u067a\7\u00bd\2\2\u067a\u067c\5\u00f6|\2\u067b\u067d"+
		"\5\u00f2z\2\u067c\u067b\3\2\2\2\u067c\u067d\3\2\2\2\u067d\u00ed\3\2\2"+
		"\2\u067e\u067f\5\u00f0y\2\u067f\u0680\5\u00f2z\2\u0680\u00ef\3\2\2\2\u0681"+
		"\u0686\5\u00c6d\2\u0682\u0686\5\u00dep\2\u0683\u0686\5\u00f4{\2\u0684"+
		"\u0686\5\u00a6T\2\u0685\u0681\3\2\2\2\u0685\u0682\3\2\2\2\u0685\u0683"+
		"\3\2\2\2\u0685\u0684\3\2\2\2\u0686\u00f1\3\2\2\2\u0687\u0689\5.\30\2\u0688"+
		"\u0687\3\2\2\2\u0688\u0689\3\2\2\2\u0689\u068a\3\2\2\2\u068a\u068e\5\u00ce"+
		"h\2\u068b\u068d\5\u00fc\177\2\u068c\u068b\3\2\2\2\u068d\u0690\3\2\2\2"+
		"\u068e\u068c\3\2\2\2\u068e\u068f\3\2\2\2\u068f\u00f3\3\2\2\2\u0690\u068e"+
		"\3\2\2\2\u0691\u0694\5\u00fa~\2\u0692\u0693\7\u00bc\2\2\u0693\u0695\5"+
		"\u00fa~\2\u0694\u0692\3\2\2\2\u0694\u0695\3\2\2\2\u0695\u069b\3\2\2\2"+
		"\u0696\u0697\5\u00be`\2\u0697\u0698\7\u00bc\2\2\u0698\u0699\5\u00fa~\2"+
		"\u0699\u069b\3\2\2\2\u069a\u0691\3\2\2\2\u069a\u0696\3\2\2\2\u069b\u00f5"+
		"\3\2\2\2\u069c\u069f\5\u00f8}\2\u069d\u069f\5\u00fa~\2\u069e\u069c\3\2"+
		"\2\2\u069e\u069d\3\2\2\2\u069f\u00f7\3\2\2\2\u06a0\u06a6\5\u0104\u0083"+
		"\2\u06a1\u06a2\7\u00d4\2\2\u06a2\u06a3\5\u00a8U\2\u06a3\u06a4\7\u00d5"+
		"\2\2\u06a4\u06a6\3\2\2\2\u06a5\u06a0\3\2\2\2\u06a5\u06a1\3\2\2\2\u06a6"+
		"\u06aa\3\2\2\2\u06a7\u06a9\5\u00fc\177\2\u06a8\u06a7\3\2\2\2\u06a9\u06ac"+
		"\3\2\2\2\u06aa\u06a8\3\2\2\2\u06aa\u06ab\3\2\2\2\u06ab\u00f9\3\2\2\2\u06ac"+
		"\u06aa\3\2\2\2\u06ad\u06af\7\u00cd\2\2\u06ae\u06ad\3\2\2\2\u06af\u06b2"+
		"\3\2\2\2\u06b0\u06ae\3\2\2\2\u06b0\u06b1\3\2\2\2\u06b1\u06b9\3\2\2\2\u06b2"+
		"\u06b0\3\2\2\2\u06b3\u06ba\7\u00dc\2\2\u06b4\u06b5\7\u00cd\2\2\u06b5\u06b6"+
		"\7\u00d4\2\2\u06b6\u06b7\5\u00a8U\2\u06b7\u06b8\7\u00d5\2\2\u06b8\u06ba"+
		"\3\2\2\2\u06b9\u06b3\3\2\2\2\u06b9\u06b4\3\2\2\2\u06ba\u06be\3\2\2\2\u06bb"+
		"\u06bd\5\u00fc\177\2\u06bc\u06bb\3\2\2\2\u06bd\u06c0\3\2\2\2\u06be\u06bc"+
		"\3\2\2\2\u06be\u06bf\3\2\2\2\u06bf\u00fb\3\2\2\2\u06c0\u06be\3\2\2\2\u06c1"+
		"\u06c3\7\u00d2\2\2\u06c2\u06c4\5\u00a8U\2\u06c3\u06c2\3\2\2\2\u06c3\u06c4"+
		"\3\2\2\2\u06c4\u06c5\3\2\2\2\u06c5\u06cb\7\u00d3\2\2\u06c6\u06c7\7\u00d4"+
		"\2\2\u06c7\u06c8\5\u00a8U\2\u06c8\u06c9\7\u00d5\2\2\u06c9\u06cb\3\2\2"+
		"\2\u06ca\u06c1\3\2\2\2\u06ca\u06c6\3\2\2\2\u06cb\u00fd\3\2\2\2\u06cc\u06ce"+
		"\5\u0100\u0081\2\u06cd\u06cc\3\2\2\2\u06cd\u06ce\3\2\2\2\u06ce\u06d5\3"+
		"\2\2\2\u06cf\u06d1\7\u00d6\2\2\u06d0\u06d2\5\u0100\u0081\2\u06d1\u06d0"+
		"\3\2\2\2\u06d1\u06d2\3\2\2\2\u06d2\u06d4\3\2\2\2\u06d3\u06cf\3\2\2\2\u06d4"+
		"\u06d7\3\2\2\2\u06d5\u06d3\3\2\2\2\u06d5\u06d6\3\2\2\2\u06d6\u00ff\3\2"+
		"\2\2\u06d7\u06d5\3\2\2\2\u06d8\u06e0\5\u00e8u\2\u06d9\u06da\7c\2\2\u06da"+
		"\u06db\7\u00d0\2\2\u06db\u06dc\5\u00fe\u0080\2\u06dc\u06dd\7\u00d1\2\2"+
		"\u06dd\u06e0\3\2\2\2\u06de\u06e0\5\u00b8]\2\u06df\u06d8\3\2\2\2\u06df"+
		"\u06d9\3\2\2\2\u06df\u06de\3\2\2\2\u06e0\u0101\3\2\2\2\u06e1\u06e2\t\23"+
		"\2\2\u06e2\u0103\3\2\2\2\u06e3\u06e4\t\24\2\2\u06e4\u0105\3\2\2\2\u06e5"+
		"\u06e6\t\25\2\2\u06e6\u0107\3\2\2\2\u06e7\u06e8\t\26\2\2\u06e8\u0109\3"+
		"\2\2\2\u06e9\u06ea\t\27\2\2\u06ea\u010b\3\2\2\2\u06eb\u06ec\t\30\2\2\u06ec"+
		"\u010d\3\2\2\2\u06ed\u06ee\t\31\2\2\u06ee\u010f\3\2\2\2\u06ef\u06f0\7"+
		"(\2\2\u06f0\u06f1\5\36\20\2\u06f1\u0111\3\2\2\2\u06f2\u06f3\7(\2\2\u06f3"+
		"\u06f5\5\60\31\2\u06f4\u06f6\5\u009cO\2\u06f5\u06f4\3\2\2\2\u06f5\u06f6"+
		"\3\2\2\2\u06f6\u06f7\3\2\2\2\u06f7\u06f9\7S\2\2\u06f8\u06fa\7\u00c2\2"+
		"\2\u06f9\u06f8\3\2\2\2\u06f9\u06fa\3\2\2\2\u06fa\u06fb\3\2\2\2\u06fb\u06fd"+
		"\5\u0104\u0083\2\u06fc\u06fe\5$\23\2\u06fd\u06fc\3\2\2\2\u06fd\u06fe\3"+
		"\2\2\2\u06fe\u06ff\3\2\2\2\u06ff\u0700\7\u00d0\2\2\u0700\u0701\5|?\2\u0701"+
		"\u0703\7\u00d1\2\2\u0702\u0704\5\u0096L\2\u0703\u0702\3\2\2\2\u0703\u0704"+
		"\3\2\2\2\u0704\u0705\3\2\2\2\u0705\u0706\5\u0098M\2\u0706\u0113\3\2\2"+
		"\2\u00db\u0115\u011a\u0122\u0127\u0141\u0145\u014a\u014f\u0155\u0163\u0167"+
		"\u016d\u0172\u0177\u017e\u0184\u018b\u0192\u0197\u019b\u01a2\u01a5\u01ab"+
		"\u01ae\u01b1\u01b6\u01ba\u01be\u01c3\u01c7\u01c9\u01cf\u01db\u01ec\u01f3"+
		"\u01fb\u0206\u020e\u0216\u021d\u0224\u023b\u0242\u024a\u0254\u025a\u0277"+
		"\u0285\u0289\u0292\u0296\u029b\u02b5\u02c0\u02c4\u02c8\u02d1\u02db\u02e0"+
		"\u02e6\u02eb\u02f0\u02f5\u02fa\u0300\u0306\u030c\u031e\u0323\u0326\u0330"+
		"\u0333\u0340\u0348\u034f\u0352\u0357\u035b\u0364\u0380\u0385\u0389\u0390"+
		"\u0394\u039a\u039f\u03a2\u03a5\u03a8\u03af\u03b7\u03c4\u03d0\u03d8\u03df"+
		"\u03e6\u03ea\u03f1\u03f8\u03fc\u0400\u0406\u040f\u0416\u041a\u041e\u042b"+
		"\u042e\u0435\u043c\u0440\u0444\u0449\u044e\u045b\u0465\u046b\u04aa\u04ba"+
		"\u04bc\u04e2\u04f8\u04fa\u04ff\u0504\u0509\u050c\u0512\u0515\u0519\u051f"+
		"\u0523\u052e\u0533\u053b\u053f\u0546\u054a\u054f\u0554\u0558\u0561\u0567"+
		"\u056d\u0570\u0574\u0577\u057c\u0580\u0583\u0586\u058a\u058e\u0592\u0597"+
		"\u059b\u059d\u05a3\u05ad\u05b1\u05b4\u05be\u05c3\u05c5\u05ca\u05d2\u05d6"+
		"\u05da\u05e1\u05ea\u05ee\u05f1\u05f6\u05fb\u0603\u0605\u060b\u060d\u0612"+
		"\u0619\u061f\u0626\u062c\u0636\u063b\u0640\u0642\u064a\u0650\u0657\u065b"+
		"\u0660\u0667\u066e\u0677\u067c\u0685\u0688\u068e\u0694\u069a\u069e\u06a5"+
		"\u06aa\u06b0\u06b9\u06be\u06c3\u06ca\u06cd\u06d1\u06d5\u06df\u06f5\u06f9"+
		"\u06fd\u0703";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}