// Generated from simple.g4 by ANTLR 4.5.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class simpleParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		BODY=1, HEAD=2, CONST=3, VARS=4, SUBS=5, COLLECTION=6, DICTIONARY=7, OF=8, 
		IF=9, ELSE=10, NUMBER=11, REAL=12, STRING=13, OR=14, AND=15, PRINT=16, 
		GET=17, WHILE=18, RET=19, ASSIGN=20, RCURL=21, LCURL=22, RPAREN=23, LPAREN=24, 
		RBRACK=25, LBRACK=26, COL=27, SEMI=28, COM=29, DOT=30, EQUAL=31, NOT_EQUAL=32, 
		NOT=33, LT=34, LE=35, GT=36, GE=37, PLUS=38, MINUS=39, STAR=40, SLASH=41, 
		IDENT=42, NUM_INT=43, NUM_REAL=44, WS=45, STRING_LITERAL=46, COMMENT=47;
	public static final int
		RULE_program = 0, RULE_declarations = 1, RULE_constantBlock = 2, RULE_constDefinition = 3, 
		RULE_identifier = 4, RULE_constant = 5, RULE_unsignedNumber = 6, RULE_sign = 7, 
		RULE_string = 8, RULE_variableBlock = 9, RULE_variableDefinition = 10, 
		RULE_atomicDefinition = 11, RULE_type = 12, RULE_arrayDefinition = 13, 
		RULE_dictDefinition = 14, RULE_functionBlock = 15, RULE_functionDefinition = 16, 
		RULE_functionDecl = 17, RULE_args = 18, RULE_variable = 19, RULE_code = 20, 
		RULE_returnStatement = 21, RULE_statementSequence = 22, RULE_statement = 23, 
		RULE_loop = 24, RULE_condition = 25, RULE_input = 26, RULE_output = 27, 
		RULE_assign = 28, RULE_expression = 29, RULE_simpleExpression = 30, RULE_term = 31, 
		RULE_signedFactor = 32, RULE_factor = 33, RULE_argsList = 34, RULE_functionCall = 35, 
		RULE_argument = 36;
	public static final String[] ruleNames = {
		"program", "declarations", "constantBlock", "constDefinition", "identifier", 
		"constant", "unsignedNumber", "sign", "string", "variableBlock", "variableDefinition", 
		"atomicDefinition", "type", "arrayDefinition", "dictDefinition", "functionBlock", 
		"functionDefinition", "functionDecl", "args", "variable", "code", "returnStatement", 
		"statementSequence", "statement", "loop", "condition", "input", "output", 
		"assign", "expression", "simpleExpression", "term", "signedFactor", "factor", 
		"argsList", "functionCall", "argument"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, "':='", "'{'", "'}'", 
		"'('", "')'", "'['", "']'", "':'", "';'", "','", "'.'", "'='", "'!='", 
		"'!'", "'<'", "'<='", "'>'", "'>='", "'+'", "'-'", "'*'", "'/'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "BODY", "HEAD", "CONST", "VARS", "SUBS", "COLLECTION", "DICTIONARY", 
		"OF", "IF", "ELSE", "NUMBER", "REAL", "STRING", "OR", "AND", "PRINT", 
		"GET", "WHILE", "RET", "ASSIGN", "RCURL", "LCURL", "RPAREN", "LPAREN", 
		"RBRACK", "LBRACK", "COL", "SEMI", "COM", "DOT", "EQUAL", "NOT_EQUAL", 
		"NOT", "LT", "LE", "GT", "GE", "PLUS", "MINUS", "STAR", "SLASH", "IDENT", 
		"NUM_INT", "NUM_REAL", "WS", "STRING_LITERAL", "COMMENT"
	};
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
	public String getGrammarFileName() { return "simple.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public simpleParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
		public DeclarationsContext declarations() {
			return getRuleContext(DeclarationsContext.class,0);
		}
		public CodeContext code() {
			return getRuleContext(CodeContext.class,0);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof simpleListener ) ((simpleListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof simpleListener ) ((simpleListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof simpleVisitor ) return ((simpleVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(74);
			declarations();
			setState(75);
			code();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclarationsContext extends ParserRuleContext {
		public TerminalNode HEAD() { return getToken(simpleParser.HEAD, 0); }
		public TerminalNode COL() { return getToken(simpleParser.COL, 0); }
		public TerminalNode RCURL() { return getToken(simpleParser.RCURL, 0); }
		public TerminalNode LCURL() { return getToken(simpleParser.LCURL, 0); }
		public List<ConstantBlockContext> constantBlock() {
			return getRuleContexts(ConstantBlockContext.class);
		}
		public ConstantBlockContext constantBlock(int i) {
			return getRuleContext(ConstantBlockContext.class,i);
		}
		public List<VariableBlockContext> variableBlock() {
			return getRuleContexts(VariableBlockContext.class);
		}
		public VariableBlockContext variableBlock(int i) {
			return getRuleContext(VariableBlockContext.class,i);
		}
		public List<FunctionBlockContext> functionBlock() {
			return getRuleContexts(FunctionBlockContext.class);
		}
		public FunctionBlockContext functionBlock(int i) {
			return getRuleContext(FunctionBlockContext.class,i);
		}
		public DeclarationsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarations; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof simpleListener ) ((simpleListener)listener).enterDeclarations(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof simpleListener ) ((simpleListener)listener).exitDeclarations(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof simpleVisitor ) return ((simpleVisitor<? extends T>)visitor).visitDeclarations(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationsContext declarations() throws RecognitionException {
		DeclarationsContext _localctx = new DeclarationsContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_declarations);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(77);
			match(HEAD);
			setState(78);
			match(COL);
			setState(79);
			match(RCURL);
			setState(85);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CONST) | (1L << VARS) | (1L << SUBS))) != 0)) {
				{
				setState(83);
				switch (_input.LA(1)) {
				case CONST:
					{
					setState(80);
					constantBlock();
					}
					break;
				case VARS:
					{
					setState(81);
					variableBlock();
					}
					break;
				case SUBS:
					{
					setState(82);
					functionBlock();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(87);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(88);
			match(LCURL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstantBlockContext extends ParserRuleContext {
		public TerminalNode CONST() { return getToken(simpleParser.CONST, 0); }
		public TerminalNode COL() { return getToken(simpleParser.COL, 0); }
		public TerminalNode RCURL() { return getToken(simpleParser.RCURL, 0); }
		public TerminalNode LCURL() { return getToken(simpleParser.LCURL, 0); }
		public ConstDefinitionContext constDefinition() {
			return getRuleContext(ConstDefinitionContext.class,0);
		}
		public ConstantBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constantBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof simpleListener ) ((simpleListener)listener).enterConstantBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof simpleListener ) ((simpleListener)listener).exitConstantBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof simpleVisitor ) return ((simpleVisitor<? extends T>)visitor).visitConstantBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstantBlockContext constantBlock() throws RecognitionException {
		ConstantBlockContext _localctx = new ConstantBlockContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_constantBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(90);
			match(CONST);
			setState(91);
			match(COL);
			setState(92);
			match(RCURL);
			setState(94);
			_la = _input.LA(1);
			if (_la==IDENT) {
				{
				setState(93);
				constDefinition();
				}
			}

			setState(96);
			match(LCURL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstDefinitionContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode EQUAL() { return getToken(simpleParser.EQUAL, 0); }
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(simpleParser.SEMI, 0); }
		public List<ConstDefinitionContext> constDefinition() {
			return getRuleContexts(ConstDefinitionContext.class);
		}
		public ConstDefinitionContext constDefinition(int i) {
			return getRuleContext(ConstDefinitionContext.class,i);
		}
		public ConstDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof simpleListener ) ((simpleListener)listener).enterConstDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof simpleListener ) ((simpleListener)listener).exitConstDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof simpleVisitor ) return ((simpleVisitor<? extends T>)visitor).visitConstDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstDefinitionContext constDefinition() throws RecognitionException {
		ConstDefinitionContext _localctx = new ConstDefinitionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_constDefinition);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(98);
			identifier();
			setState(99);
			match(EQUAL);
			setState(100);
			constant();
			setState(101);
			match(SEMI);
			setState(105);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(102);
					constDefinition();
					}
					} 
				}
				setState(107);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
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
		public TerminalNode IDENT() { return getToken(simpleParser.IDENT, 0); }
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof simpleListener ) ((simpleListener)listener).enterIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof simpleListener ) ((simpleListener)listener).exitIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof simpleVisitor ) return ((simpleVisitor<? extends T>)visitor).visitIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_identifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(108);
			match(IDENT);
			}
		}
		catch (RecognitionException re) {
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
		public UnsignedNumberContext unsignedNumber() {
			return getRuleContext(UnsignedNumberContext.class,0);
		}
		public SignContext sign() {
			return getRuleContext(SignContext.class,0);
		}
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public ConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constant; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof simpleListener ) ((simpleListener)listener).enterConstant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof simpleListener ) ((simpleListener)listener).exitConstant(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof simpleVisitor ) return ((simpleVisitor<? extends T>)visitor).visitConstant(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstantContext constant() throws RecognitionException {
		ConstantContext _localctx = new ConstantContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_constant);
		try {
			setState(115);
			switch (_input.LA(1)) {
			case NUM_INT:
			case NUM_REAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(110);
				unsignedNumber();
				}
				break;
			case PLUS:
			case MINUS:
				enterOuterAlt(_localctx, 2);
				{
				setState(111);
				sign();
				setState(112);
				unsignedNumber();
				}
				break;
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(114);
				string();
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

	public static class UnsignedNumberContext extends ParserRuleContext {
		public TerminalNode NUM_INT() { return getToken(simpleParser.NUM_INT, 0); }
		public TerminalNode NUM_REAL() { return getToken(simpleParser.NUM_REAL, 0); }
		public UnsignedNumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unsignedNumber; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof simpleListener ) ((simpleListener)listener).enterUnsignedNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof simpleListener ) ((simpleListener)listener).exitUnsignedNumber(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof simpleVisitor ) return ((simpleVisitor<? extends T>)visitor).visitUnsignedNumber(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnsignedNumberContext unsignedNumber() throws RecognitionException {
		UnsignedNumberContext _localctx = new UnsignedNumberContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_unsignedNumber);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(117);
			_la = _input.LA(1);
			if ( !(_la==NUM_INT || _la==NUM_REAL) ) {
			_errHandler.recoverInline(this);
			} else {
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

	public static class SignContext extends ParserRuleContext {
		public TerminalNode PLUS() { return getToken(simpleParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(simpleParser.MINUS, 0); }
		public SignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof simpleListener ) ((simpleListener)listener).enterSign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof simpleListener ) ((simpleListener)listener).exitSign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof simpleVisitor ) return ((simpleVisitor<? extends T>)visitor).visitSign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SignContext sign() throws RecognitionException {
		SignContext _localctx = new SignContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_sign);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(119);
			_la = _input.LA(1);
			if ( !(_la==PLUS || _la==MINUS) ) {
			_errHandler.recoverInline(this);
			} else {
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

	public static class StringContext extends ParserRuleContext {
		public TerminalNode STRING_LITERAL() { return getToken(simpleParser.STRING_LITERAL, 0); }
		public StringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof simpleListener ) ((simpleListener)listener).enterString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof simpleListener ) ((simpleListener)listener).exitString(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof simpleVisitor ) return ((simpleVisitor<? extends T>)visitor).visitString(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StringContext string() throws RecognitionException {
		StringContext _localctx = new StringContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_string);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(121);
			match(STRING_LITERAL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableBlockContext extends ParserRuleContext {
		public TerminalNode VARS() { return getToken(simpleParser.VARS, 0); }
		public TerminalNode COL() { return getToken(simpleParser.COL, 0); }
		public TerminalNode RCURL() { return getToken(simpleParser.RCURL, 0); }
		public TerminalNode LCURL() { return getToken(simpleParser.LCURL, 0); }
		public VariableDefinitionContext variableDefinition() {
			return getRuleContext(VariableDefinitionContext.class,0);
		}
		public VariableBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof simpleListener ) ((simpleListener)listener).enterVariableBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof simpleListener ) ((simpleListener)listener).exitVariableBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof simpleVisitor ) return ((simpleVisitor<? extends T>)visitor).visitVariableBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableBlockContext variableBlock() throws RecognitionException {
		VariableBlockContext _localctx = new VariableBlockContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_variableBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(123);
			match(VARS);
			setState(124);
			match(COL);
			setState(125);
			match(RCURL);
			setState(127);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << COLLECTION) | (1L << DICTIONARY) | (1L << IDENT))) != 0)) {
				{
				setState(126);
				variableDefinition();
				}
			}

			setState(129);
			match(LCURL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableDefinitionContext extends ParserRuleContext {
		public AtomicDefinitionContext atomicDefinition() {
			return getRuleContext(AtomicDefinitionContext.class,0);
		}
		public ArrayDefinitionContext arrayDefinition() {
			return getRuleContext(ArrayDefinitionContext.class,0);
		}
		public DictDefinitionContext dictDefinition() {
			return getRuleContext(DictDefinitionContext.class,0);
		}
		public VariableDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof simpleListener ) ((simpleListener)listener).enterVariableDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof simpleListener ) ((simpleListener)listener).exitVariableDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof simpleVisitor ) return ((simpleVisitor<? extends T>)visitor).visitVariableDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDefinitionContext variableDefinition() throws RecognitionException {
		VariableDefinitionContext _localctx = new VariableDefinitionContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_variableDefinition);
		try {
			setState(134);
			switch (_input.LA(1)) {
			case IDENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(131);
				atomicDefinition();
				}
				break;
			case COLLECTION:
				enterOuterAlt(_localctx, 2);
				{
				setState(132);
				arrayDefinition();
				}
				break;
			case DICTIONARY:
				enterOuterAlt(_localctx, 3);
				{
				setState(133);
				dictDefinition();
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

	public static class AtomicDefinitionContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode COL() { return getToken(simpleParser.COL, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(simpleParser.SEMI, 0); }
		public List<VariableDefinitionContext> variableDefinition() {
			return getRuleContexts(VariableDefinitionContext.class);
		}
		public VariableDefinitionContext variableDefinition(int i) {
			return getRuleContext(VariableDefinitionContext.class,i);
		}
		public AtomicDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atomicDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof simpleListener ) ((simpleListener)listener).enterAtomicDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof simpleListener ) ((simpleListener)listener).exitAtomicDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof simpleVisitor ) return ((simpleVisitor<? extends T>)visitor).visitAtomicDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AtomicDefinitionContext atomicDefinition() throws RecognitionException {
		AtomicDefinitionContext _localctx = new AtomicDefinitionContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_atomicDefinition);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(136);
			identifier();
			setState(137);
			match(COL);
			setState(138);
			type();
			setState(139);
			match(SEMI);
			setState(143);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(140);
					variableDefinition();
					}
					} 
				}
				setState(145);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
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

	public static class TypeContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(simpleParser.NUMBER, 0); }
		public TerminalNode REAL() { return getToken(simpleParser.REAL, 0); }
		public TerminalNode STRING() { return getToken(simpleParser.STRING, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof simpleListener ) ((simpleListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof simpleListener ) ((simpleListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof simpleVisitor ) return ((simpleVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(146);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NUMBER) | (1L << REAL) | (1L << STRING))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
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

	public static class ArrayDefinitionContext extends ParserRuleContext {
		public TerminalNode COLLECTION() { return getToken(simpleParser.COLLECTION, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode OF() { return getToken(simpleParser.OF, 0); }
		public TerminalNode NUM_INT() { return getToken(simpleParser.NUM_INT, 0); }
		public TerminalNode COL() { return getToken(simpleParser.COL, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(simpleParser.SEMI, 0); }
		public List<VariableDefinitionContext> variableDefinition() {
			return getRuleContexts(VariableDefinitionContext.class);
		}
		public VariableDefinitionContext variableDefinition(int i) {
			return getRuleContext(VariableDefinitionContext.class,i);
		}
		public ArrayDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof simpleListener ) ((simpleListener)listener).enterArrayDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof simpleListener ) ((simpleListener)listener).exitArrayDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof simpleVisitor ) return ((simpleVisitor<? extends T>)visitor).visitArrayDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayDefinitionContext arrayDefinition() throws RecognitionException {
		ArrayDefinitionContext _localctx = new ArrayDefinitionContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_arrayDefinition);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(148);
			match(COLLECTION);
			setState(149);
			identifier();
			setState(150);
			match(OF);
			setState(151);
			match(NUM_INT);
			setState(152);
			match(COL);
			setState(153);
			type();
			setState(154);
			match(SEMI);
			setState(158);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(155);
					variableDefinition();
					}
					} 
				}
				setState(160);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
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

	public static class DictDefinitionContext extends ParserRuleContext {
		public TerminalNode DICTIONARY() { return getToken(simpleParser.DICTIONARY, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode OF() { return getToken(simpleParser.OF, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(simpleParser.SEMI, 0); }
		public List<VariableDefinitionContext> variableDefinition() {
			return getRuleContexts(VariableDefinitionContext.class);
		}
		public VariableDefinitionContext variableDefinition(int i) {
			return getRuleContext(VariableDefinitionContext.class,i);
		}
		public DictDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dictDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof simpleListener ) ((simpleListener)listener).enterDictDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof simpleListener ) ((simpleListener)listener).exitDictDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof simpleVisitor ) return ((simpleVisitor<? extends T>)visitor).visitDictDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DictDefinitionContext dictDefinition() throws RecognitionException {
		DictDefinitionContext _localctx = new DictDefinitionContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_dictDefinition);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(161);
			match(DICTIONARY);
			setState(162);
			identifier();
			setState(163);
			match(OF);
			setState(164);
			type();
			setState(165);
			match(SEMI);
			setState(169);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(166);
					variableDefinition();
					}
					} 
				}
				setState(171);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
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

	public static class FunctionBlockContext extends ParserRuleContext {
		public TerminalNode SUBS() { return getToken(simpleParser.SUBS, 0); }
		public TerminalNode COL() { return getToken(simpleParser.COL, 0); }
		public TerminalNode RCURL() { return getToken(simpleParser.RCURL, 0); }
		public TerminalNode LCURL() { return getToken(simpleParser.LCURL, 0); }
		public FunctionDefinitionContext functionDefinition() {
			return getRuleContext(FunctionDefinitionContext.class,0);
		}
		public FunctionBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof simpleListener ) ((simpleListener)listener).enterFunctionBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof simpleListener ) ((simpleListener)listener).exitFunctionBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof simpleVisitor ) return ((simpleVisitor<? extends T>)visitor).visitFunctionBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionBlockContext functionBlock() throws RecognitionException {
		FunctionBlockContext _localctx = new FunctionBlockContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_functionBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(172);
			match(SUBS);
			setState(173);
			match(COL);
			setState(174);
			match(RCURL);
			setState(176);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NUMBER) | (1L << REAL) | (1L << STRING))) != 0)) {
				{
				setState(175);
				functionDefinition();
				}
			}

			setState(178);
			match(LCURL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionDefinitionContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(simpleParser.RPAREN, 0); }
		public TerminalNode LPAREN() { return getToken(simpleParser.LPAREN, 0); }
		public TerminalNode RCURL() { return getToken(simpleParser.RCURL, 0); }
		public FunctionDeclContext functionDecl() {
			return getRuleContext(FunctionDeclContext.class,0);
		}
		public CodeContext code() {
			return getRuleContext(CodeContext.class,0);
		}
		public TerminalNode LCURL() { return getToken(simpleParser.LCURL, 0); }
		public ArgsContext args() {
			return getRuleContext(ArgsContext.class,0);
		}
		public List<FunctionDefinitionContext> functionDefinition() {
			return getRuleContexts(FunctionDefinitionContext.class);
		}
		public FunctionDefinitionContext functionDefinition(int i) {
			return getRuleContext(FunctionDefinitionContext.class,i);
		}
		public FunctionDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof simpleListener ) ((simpleListener)listener).enterFunctionDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof simpleListener ) ((simpleListener)listener).exitFunctionDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof simpleVisitor ) return ((simpleVisitor<? extends T>)visitor).visitFunctionDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionDefinitionContext functionDefinition() throws RecognitionException {
		FunctionDefinitionContext _localctx = new FunctionDefinitionContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_functionDefinition);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(180);
			type();
			setState(181);
			identifier();
			setState(182);
			match(RPAREN);
			setState(184);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NUMBER) | (1L << REAL) | (1L << STRING))) != 0)) {
				{
				setState(183);
				args();
				}
			}

			setState(186);
			match(LPAREN);
			setState(187);
			match(RCURL);
			setState(188);
			functionDecl();
			setState(189);
			code();
			setState(190);
			match(LCURL);
			setState(194);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(191);
					functionDefinition();
					}
					} 
				}
				setState(196);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
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

	public static class FunctionDeclContext extends ParserRuleContext {
		public TerminalNode HEAD() { return getToken(simpleParser.HEAD, 0); }
		public TerminalNode COL() { return getToken(simpleParser.COL, 0); }
		public TerminalNode RCURL() { return getToken(simpleParser.RCURL, 0); }
		public TerminalNode LCURL() { return getToken(simpleParser.LCURL, 0); }
		public List<ConstantBlockContext> constantBlock() {
			return getRuleContexts(ConstantBlockContext.class);
		}
		public ConstantBlockContext constantBlock(int i) {
			return getRuleContext(ConstantBlockContext.class,i);
		}
		public List<VariableBlockContext> variableBlock() {
			return getRuleContexts(VariableBlockContext.class);
		}
		public VariableBlockContext variableBlock(int i) {
			return getRuleContext(VariableBlockContext.class,i);
		}
		public FunctionDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof simpleListener ) ((simpleListener)listener).enterFunctionDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof simpleListener ) ((simpleListener)listener).exitFunctionDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof simpleVisitor ) return ((simpleVisitor<? extends T>)visitor).visitFunctionDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionDeclContext functionDecl() throws RecognitionException {
		FunctionDeclContext _localctx = new FunctionDeclContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_functionDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(197);
			match(HEAD);
			setState(198);
			match(COL);
			setState(199);
			match(RCURL);
			setState(204);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CONST || _la==VARS) {
				{
				setState(202);
				switch (_input.LA(1)) {
				case CONST:
					{
					setState(200);
					constantBlock();
					}
					break;
				case VARS:
					{
					setState(201);
					variableBlock();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(206);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(207);
			match(LCURL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArgsContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public List<TerminalNode> COM() { return getTokens(simpleParser.COM); }
		public TerminalNode COM(int i) {
			return getToken(simpleParser.COM, i);
		}
		public List<ArgsContext> args() {
			return getRuleContexts(ArgsContext.class);
		}
		public ArgsContext args(int i) {
			return getRuleContext(ArgsContext.class,i);
		}
		public ArgsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_args; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof simpleListener ) ((simpleListener)listener).enterArgs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof simpleListener ) ((simpleListener)listener).exitArgs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof simpleVisitor ) return ((simpleVisitor<? extends T>)visitor).visitArgs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgsContext args() throws RecognitionException {
		ArgsContext _localctx = new ArgsContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_args);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(209);
			type();
			setState(210);
			identifier();
			setState(215);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(211);
					match(COM);
					setState(212);
					args();
					}
					} 
				}
				setState(217);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
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

	public static class VariableContext extends ParserRuleContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public TerminalNode RBRACK() { return getToken(simpleParser.RBRACK, 0); }
		public SimpleExpressionContext simpleExpression() {
			return getRuleContext(SimpleExpressionContext.class,0);
		}
		public TerminalNode LBRACK() { return getToken(simpleParser.LBRACK, 0); }
		public TerminalNode DOT() { return getToken(simpleParser.DOT, 0); }
		public VariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof simpleListener ) ((simpleListener)listener).enterVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof simpleListener ) ((simpleListener)listener).exitVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof simpleVisitor ) return ((simpleVisitor<? extends T>)visitor).visitVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_variable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(218);
			identifier();
			setState(225);
			switch (_input.LA(1)) {
			case RBRACK:
				{
				setState(219);
				match(RBRACK);
				setState(220);
				simpleExpression();
				setState(221);
				match(LBRACK);
				}
				break;
			case DOT:
				{
				setState(223);
				match(DOT);
				setState(224);
				identifier();
				}
				break;
			case OR:
			case AND:
			case ASSIGN:
			case RCURL:
			case RPAREN:
			case LPAREN:
			case LBRACK:
			case SEMI:
			case COM:
			case EQUAL:
			case NOT_EQUAL:
			case LT:
			case LE:
			case GT:
			case GE:
			case PLUS:
			case MINUS:
			case STAR:
			case SLASH:
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

	public static class CodeContext extends ParserRuleContext {
		public TerminalNode BODY() { return getToken(simpleParser.BODY, 0); }
		public TerminalNode COL() { return getToken(simpleParser.COL, 0); }
		public TerminalNode RCURL() { return getToken(simpleParser.RCURL, 0); }
		public StatementSequenceContext statementSequence() {
			return getRuleContext(StatementSequenceContext.class,0);
		}
		public ReturnStatementContext returnStatement() {
			return getRuleContext(ReturnStatementContext.class,0);
		}
		public TerminalNode LCURL() { return getToken(simpleParser.LCURL, 0); }
		public CodeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_code; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof simpleListener ) ((simpleListener)listener).enterCode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof simpleListener ) ((simpleListener)listener).exitCode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof simpleVisitor ) return ((simpleVisitor<? extends T>)visitor).visitCode(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CodeContext code() throws RecognitionException {
		CodeContext _localctx = new CodeContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_code);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(227);
			match(BODY);
			setState(228);
			match(COL);
			setState(229);
			match(RCURL);
			setState(230);
			statementSequence();
			setState(231);
			returnStatement();
			setState(232);
			match(LCURL);
			}
		}
		catch (RecognitionException re) {
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
		public TerminalNode RET() { return getToken(simpleParser.RET, 0); }
		public SimpleExpressionContext simpleExpression() {
			return getRuleContext(SimpleExpressionContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(simpleParser.SEMI, 0); }
		public ReturnStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof simpleListener ) ((simpleListener)listener).enterReturnStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof simpleListener ) ((simpleListener)listener).exitReturnStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof simpleVisitor ) return ((simpleVisitor<? extends T>)visitor).visitReturnStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnStatementContext returnStatement() throws RecognitionException {
		ReturnStatementContext _localctx = new ReturnStatementContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_returnStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(234);
			match(RET);
			setState(235);
			simpleExpression();
			setState(236);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementSequenceContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<TerminalNode> SEMI() { return getTokens(simpleParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(simpleParser.SEMI, i);
		}
		public StatementSequenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementSequence; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof simpleListener ) ((simpleListener)listener).enterStatementSequence(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof simpleListener ) ((simpleListener)listener).exitStatementSequence(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof simpleVisitor ) return ((simpleVisitor<? extends T>)visitor).visitStatementSequence(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementSequenceContext statementSequence() throws RecognitionException {
		StatementSequenceContext _localctx = new StatementSequenceContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_statementSequence);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(243);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << PRINT) | (1L << GET) | (1L << WHILE) | (1L << IDENT))) != 0)) {
				{
				{
				setState(238);
				statement();
				setState(239);
				match(SEMI);
				}
				}
				setState(245);
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
		public AssignContext assign() {
			return getRuleContext(AssignContext.class,0);
		}
		public InputContext input() {
			return getRuleContext(InputContext.class,0);
		}
		public OutputContext output() {
			return getRuleContext(OutputContext.class,0);
		}
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public LoopContext loop() {
			return getRuleContext(LoopContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof simpleListener ) ((simpleListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof simpleListener ) ((simpleListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof simpleVisitor ) return ((simpleVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_statement);
		try {
			setState(252);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(246);
				assign();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(247);
				input();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(248);
				output();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(249);
				functionCall();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(250);
				condition();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(251);
				loop();
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

	public static class LoopContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(simpleParser.WHILE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RCURL() { return getToken(simpleParser.RCURL, 0); }
		public StatementSequenceContext statementSequence() {
			return getRuleContext(StatementSequenceContext.class,0);
		}
		public TerminalNode LCURL() { return getToken(simpleParser.LCURL, 0); }
		public LoopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof simpleListener ) ((simpleListener)listener).enterLoop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof simpleListener ) ((simpleListener)listener).exitLoop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof simpleVisitor ) return ((simpleVisitor<? extends T>)visitor).visitLoop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LoopContext loop() throws RecognitionException {
		LoopContext _localctx = new LoopContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_loop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(254);
			match(WHILE);
			setState(255);
			expression();
			setState(256);
			match(RCURL);
			setState(257);
			statementSequence();
			setState(258);
			match(LCURL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConditionContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(simpleParser.IF, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<TerminalNode> RCURL() { return getTokens(simpleParser.RCURL); }
		public TerminalNode RCURL(int i) {
			return getToken(simpleParser.RCURL, i);
		}
		public List<StatementSequenceContext> statementSequence() {
			return getRuleContexts(StatementSequenceContext.class);
		}
		public StatementSequenceContext statementSequence(int i) {
			return getRuleContext(StatementSequenceContext.class,i);
		}
		public List<TerminalNode> LCURL() { return getTokens(simpleParser.LCURL); }
		public TerminalNode LCURL(int i) {
			return getToken(simpleParser.LCURL, i);
		}
		public TerminalNode ELSE() { return getToken(simpleParser.ELSE, 0); }
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof simpleListener ) ((simpleListener)listener).enterCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof simpleListener ) ((simpleListener)listener).exitCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof simpleVisitor ) return ((simpleVisitor<? extends T>)visitor).visitCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_condition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(260);
			match(IF);
			setState(261);
			expression();
			setState(262);
			match(RCURL);
			setState(263);
			statementSequence();
			setState(264);
			match(LCURL);
			setState(270);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(265);
				match(ELSE);
				setState(266);
				match(RCURL);
				setState(267);
				statementSequence();
				setState(268);
				match(LCURL);
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

	public static class InputContext extends ParserRuleContext {
		public TerminalNode GET() { return getToken(simpleParser.GET, 0); }
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public InputContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_input; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof simpleListener ) ((simpleListener)listener).enterInput(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof simpleListener ) ((simpleListener)listener).exitInput(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof simpleVisitor ) return ((simpleVisitor<? extends T>)visitor).visitInput(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InputContext input() throws RecognitionException {
		InputContext _localctx = new InputContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_input);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(272);
			match(GET);
			setState(273);
			variable();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OutputContext extends ParserRuleContext {
		public TerminalNode PRINT() { return getToken(simpleParser.PRINT, 0); }
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public OutputContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_output; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof simpleListener ) ((simpleListener)listener).enterOutput(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof simpleListener ) ((simpleListener)listener).exitOutput(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof simpleVisitor ) return ((simpleVisitor<? extends T>)visitor).visitOutput(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OutputContext output() throws RecognitionException {
		OutputContext _localctx = new OutputContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_output);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(275);
			match(PRINT);
			setState(278);
			switch (_input.LA(1)) {
			case IDENT:
				{
				setState(276);
				variable();
				}
				break;
			case STRING_LITERAL:
				{
				setState(277);
				string();
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

	public static class AssignContext extends ParserRuleContext {
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(simpleParser.ASSIGN, 0); }
		public SimpleExpressionContext simpleExpression() {
			return getRuleContext(SimpleExpressionContext.class,0);
		}
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public AssignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof simpleListener ) ((simpleListener)listener).enterAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof simpleListener ) ((simpleListener)listener).exitAssign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof simpleVisitor ) return ((simpleVisitor<? extends T>)visitor).visitAssign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignContext assign() throws RecognitionException {
		AssignContext _localctx = new AssignContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_assign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(280);
			variable();
			setState(281);
			match(ASSIGN);
			setState(284);
			switch (_input.LA(1)) {
			case LPAREN:
			case NOT:
			case PLUS:
			case MINUS:
			case IDENT:
			case NUM_INT:
			case NUM_REAL:
				{
				setState(282);
				simpleExpression();
				}
				break;
			case STRING_LITERAL:
				{
				setState(283);
				string();
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

	public static class ExpressionContext extends ParserRuleContext {
		public List<SimpleExpressionContext> simpleExpression() {
			return getRuleContexts(SimpleExpressionContext.class);
		}
		public SimpleExpressionContext simpleExpression(int i) {
			return getRuleContext(SimpleExpressionContext.class,i);
		}
		public List<TerminalNode> EQUAL() { return getTokens(simpleParser.EQUAL); }
		public TerminalNode EQUAL(int i) {
			return getToken(simpleParser.EQUAL, i);
		}
		public List<TerminalNode> NOT_EQUAL() { return getTokens(simpleParser.NOT_EQUAL); }
		public TerminalNode NOT_EQUAL(int i) {
			return getToken(simpleParser.NOT_EQUAL, i);
		}
		public List<TerminalNode> LT() { return getTokens(simpleParser.LT); }
		public TerminalNode LT(int i) {
			return getToken(simpleParser.LT, i);
		}
		public List<TerminalNode> LE() { return getTokens(simpleParser.LE); }
		public TerminalNode LE(int i) {
			return getToken(simpleParser.LE, i);
		}
		public List<TerminalNode> GE() { return getTokens(simpleParser.GE); }
		public TerminalNode GE(int i) {
			return getToken(simpleParser.GE, i);
		}
		public List<TerminalNode> GT() { return getTokens(simpleParser.GT); }
		public TerminalNode GT(int i) {
			return getToken(simpleParser.GT, i);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof simpleListener ) ((simpleListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof simpleListener ) ((simpleListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof simpleVisitor ) return ((simpleVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(286);
			simpleExpression();
			setState(291);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EQUAL) | (1L << NOT_EQUAL) | (1L << LT) | (1L << LE) | (1L << GT) | (1L << GE))) != 0)) {
				{
				{
				setState(287);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EQUAL) | (1L << NOT_EQUAL) | (1L << LT) | (1L << LE) | (1L << GT) | (1L << GE))) != 0)) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(288);
				simpleExpression();
				}
				}
				setState(293);
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

	public static class SimpleExpressionContext extends ParserRuleContext {
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public List<TerminalNode> PLUS() { return getTokens(simpleParser.PLUS); }
		public TerminalNode PLUS(int i) {
			return getToken(simpleParser.PLUS, i);
		}
		public List<TerminalNode> MINUS() { return getTokens(simpleParser.MINUS); }
		public TerminalNode MINUS(int i) {
			return getToken(simpleParser.MINUS, i);
		}
		public List<TerminalNode> OR() { return getTokens(simpleParser.OR); }
		public TerminalNode OR(int i) {
			return getToken(simpleParser.OR, i);
		}
		public SimpleExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof simpleListener ) ((simpleListener)listener).enterSimpleExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof simpleListener ) ((simpleListener)listener).exitSimpleExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof simpleVisitor ) return ((simpleVisitor<? extends T>)visitor).visitSimpleExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SimpleExpressionContext simpleExpression() throws RecognitionException {
		SimpleExpressionContext _localctx = new SimpleExpressionContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_simpleExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(294);
			term();
			setState(299);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OR) | (1L << PLUS) | (1L << MINUS))) != 0)) {
				{
				{
				setState(295);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OR) | (1L << PLUS) | (1L << MINUS))) != 0)) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(296);
				term();
				}
				}
				setState(301);
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

	public static class TermContext extends ParserRuleContext {
		public List<SignedFactorContext> signedFactor() {
			return getRuleContexts(SignedFactorContext.class);
		}
		public SignedFactorContext signedFactor(int i) {
			return getRuleContext(SignedFactorContext.class,i);
		}
		public List<TerminalNode> STAR() { return getTokens(simpleParser.STAR); }
		public TerminalNode STAR(int i) {
			return getToken(simpleParser.STAR, i);
		}
		public List<TerminalNode> SLASH() { return getTokens(simpleParser.SLASH); }
		public TerminalNode SLASH(int i) {
			return getToken(simpleParser.SLASH, i);
		}
		public List<TerminalNode> AND() { return getTokens(simpleParser.AND); }
		public TerminalNode AND(int i) {
			return getToken(simpleParser.AND, i);
		}
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof simpleListener ) ((simpleListener)listener).enterTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof simpleListener ) ((simpleListener)listener).exitTerm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof simpleVisitor ) return ((simpleVisitor<? extends T>)visitor).visitTerm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_term);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(302);
			signedFactor();
			setState(307);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AND) | (1L << STAR) | (1L << SLASH))) != 0)) {
				{
				{
				setState(303);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AND) | (1L << STAR) | (1L << SLASH))) != 0)) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(304);
				signedFactor();
				}
				}
				setState(309);
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

	public static class SignedFactorContext extends ParserRuleContext {
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public TerminalNode PLUS() { return getToken(simpleParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(simpleParser.MINUS, 0); }
		public SignedFactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_signedFactor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof simpleListener ) ((simpleListener)listener).enterSignedFactor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof simpleListener ) ((simpleListener)listener).exitSignedFactor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof simpleVisitor ) return ((simpleVisitor<? extends T>)visitor).visitSignedFactor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SignedFactorContext signedFactor() throws RecognitionException {
		SignedFactorContext _localctx = new SignedFactorContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_signedFactor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(311);
			_la = _input.LA(1);
			if (_la==PLUS || _la==MINUS) {
				{
				setState(310);
				_la = _input.LA(1);
				if ( !(_la==PLUS || _la==MINUS) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
			}

			setState(313);
			factor();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FactorContext extends ParserRuleContext {
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(simpleParser.LPAREN, 0); }
		public SimpleExpressionContext simpleExpression() {
			return getRuleContext(SimpleExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(simpleParser.RPAREN, 0); }
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public UnsignedNumberContext unsignedNumber() {
			return getRuleContext(UnsignedNumberContext.class,0);
		}
		public TerminalNode NOT() { return getToken(simpleParser.NOT, 0); }
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public FactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof simpleListener ) ((simpleListener)listener).enterFactor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof simpleListener ) ((simpleListener)listener).exitFactor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof simpleVisitor ) return ((simpleVisitor<? extends T>)visitor).visitFactor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_factor);
		try {
			setState(324);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(315);
				variable();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(316);
				match(LPAREN);
				setState(317);
				simpleExpression();
				setState(318);
				match(RPAREN);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(320);
				functionCall();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(321);
				unsignedNumber();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(322);
				match(NOT);
				setState(323);
				factor();
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

	public static class ArgsListContext extends ParserRuleContext {
		public List<ArgumentContext> argument() {
			return getRuleContexts(ArgumentContext.class);
		}
		public ArgumentContext argument(int i) {
			return getRuleContext(ArgumentContext.class,i);
		}
		public List<TerminalNode> COM() { return getTokens(simpleParser.COM); }
		public TerminalNode COM(int i) {
			return getToken(simpleParser.COM, i);
		}
		public ArgsListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argsList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof simpleListener ) ((simpleListener)listener).enterArgsList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof simpleListener ) ((simpleListener)listener).exitArgsList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof simpleVisitor ) return ((simpleVisitor<? extends T>)visitor).visitArgsList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgsListContext argsList() throws RecognitionException {
		ArgsListContext _localctx = new ArgsListContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_argsList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(326);
			argument();
			setState(331);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COM) {
				{
				{
				setState(327);
				match(COM);
				setState(328);
				argument();
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

	public static class FunctionCallContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(simpleParser.RPAREN, 0); }
		public TerminalNode LPAREN() { return getToken(simpleParser.LPAREN, 0); }
		public ArgsListContext argsList() {
			return getRuleContext(ArgsListContext.class,0);
		}
		public FunctionCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof simpleListener ) ((simpleListener)listener).enterFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof simpleListener ) ((simpleListener)listener).exitFunctionCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof simpleVisitor ) return ((simpleVisitor<? extends T>)visitor).visitFunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionCallContext functionCall() throws RecognitionException {
		FunctionCallContext _localctx = new FunctionCallContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_functionCall);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(334);
			identifier();
			setState(335);
			match(RPAREN);
			setState(337);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				{
				setState(336);
				argsList();
				}
				break;
			}
			setState(339);
			match(LPAREN);
			}
		}
		catch (RecognitionException re) {
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
		public SimpleExpressionContext simpleExpression() {
			return getRuleContext(SimpleExpressionContext.class,0);
		}
		public ArgumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof simpleListener ) ((simpleListener)listener).enterArgument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof simpleListener ) ((simpleListener)listener).exitArgument(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof simpleVisitor ) return ((simpleVisitor<? extends T>)visitor).visitArgument(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentContext argument() throws RecognitionException {
		ArgumentContext _localctx = new ArgumentContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_argument);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(341);
			simpleExpression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\61\u015a\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\7\3V\n\3\f\3\16\3Y\13\3\3\3\3\3\3\4\3\4\3\4\3\4\5\4a\n\4\3\4\3\4\3"+
		"\5\3\5\3\5\3\5\3\5\7\5j\n\5\f\5\16\5m\13\5\3\6\3\6\3\7\3\7\3\7\3\7\3\7"+
		"\5\7v\n\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\13\3\13\5\13\u0082\n\13"+
		"\3\13\3\13\3\f\3\f\3\f\5\f\u0089\n\f\3\r\3\r\3\r\3\r\3\r\7\r\u0090\n\r"+
		"\f\r\16\r\u0093\13\r\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\7\17\u009f\n\17\f\17\16\17\u00a2\13\17\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\7\20\u00aa\n\20\f\20\16\20\u00ad\13\20\3\21\3\21\3\21\3\21\5\21\u00b3"+
		"\n\21\3\21\3\21\3\22\3\22\3\22\3\22\5\22\u00bb\n\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\7\22\u00c3\n\22\f\22\16\22\u00c6\13\22\3\23\3\23\3\23\3\23"+
		"\3\23\7\23\u00cd\n\23\f\23\16\23\u00d0\13\23\3\23\3\23\3\24\3\24\3\24"+
		"\3\24\7\24\u00d8\n\24\f\24\16\24\u00db\13\24\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\5\25\u00e4\n\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27"+
		"\3\27\3\27\3\30\3\30\3\30\7\30\u00f4\n\30\f\30\16\30\u00f7\13\30\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\5\31\u00ff\n\31\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\5\33\u0111\n\33\3\34"+
		"\3\34\3\34\3\35\3\35\3\35\5\35\u0119\n\35\3\36\3\36\3\36\3\36\5\36\u011f"+
		"\n\36\3\37\3\37\3\37\7\37\u0124\n\37\f\37\16\37\u0127\13\37\3 \3 \3 \7"+
		" \u012c\n \f \16 \u012f\13 \3!\3!\3!\7!\u0134\n!\f!\16!\u0137\13!\3\""+
		"\5\"\u013a\n\"\3\"\3\"\3#\3#\3#\3#\3#\3#\3#\3#\3#\5#\u0147\n#\3$\3$\3"+
		"$\7$\u014c\n$\f$\16$\u014f\13$\3%\3%\3%\5%\u0154\n%\3%\3%\3&\3&\3&\2\2"+
		"\'\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BD"+
		"FHJ\2\b\3\2-.\3\2()\3\2\r\17\4\2!\"$\'\4\2\20\20()\4\2\21\21*+\u015c\2"+
		"L\3\2\2\2\4O\3\2\2\2\6\\\3\2\2\2\bd\3\2\2\2\nn\3\2\2\2\fu\3\2\2\2\16w"+
		"\3\2\2\2\20y\3\2\2\2\22{\3\2\2\2\24}\3\2\2\2\26\u0088\3\2\2\2\30\u008a"+
		"\3\2\2\2\32\u0094\3\2\2\2\34\u0096\3\2\2\2\36\u00a3\3\2\2\2 \u00ae\3\2"+
		"\2\2\"\u00b6\3\2\2\2$\u00c7\3\2\2\2&\u00d3\3\2\2\2(\u00dc\3\2\2\2*\u00e5"+
		"\3\2\2\2,\u00ec\3\2\2\2.\u00f5\3\2\2\2\60\u00fe\3\2\2\2\62\u0100\3\2\2"+
		"\2\64\u0106\3\2\2\2\66\u0112\3\2\2\28\u0115\3\2\2\2:\u011a\3\2\2\2<\u0120"+
		"\3\2\2\2>\u0128\3\2\2\2@\u0130\3\2\2\2B\u0139\3\2\2\2D\u0146\3\2\2\2F"+
		"\u0148\3\2\2\2H\u0150\3\2\2\2J\u0157\3\2\2\2LM\5\4\3\2MN\5*\26\2N\3\3"+
		"\2\2\2OP\7\4\2\2PQ\7\35\2\2QW\7\27\2\2RV\5\6\4\2SV\5\24\13\2TV\5 \21\2"+
		"UR\3\2\2\2US\3\2\2\2UT\3\2\2\2VY\3\2\2\2WU\3\2\2\2WX\3\2\2\2XZ\3\2\2\2"+
		"YW\3\2\2\2Z[\7\30\2\2[\5\3\2\2\2\\]\7\5\2\2]^\7\35\2\2^`\7\27\2\2_a\5"+
		"\b\5\2`_\3\2\2\2`a\3\2\2\2ab\3\2\2\2bc\7\30\2\2c\7\3\2\2\2de\5\n\6\2e"+
		"f\7!\2\2fg\5\f\7\2gk\7\36\2\2hj\5\b\5\2ih\3\2\2\2jm\3\2\2\2ki\3\2\2\2"+
		"kl\3\2\2\2l\t\3\2\2\2mk\3\2\2\2no\7,\2\2o\13\3\2\2\2pv\5\16\b\2qr\5\20"+
		"\t\2rs\5\16\b\2sv\3\2\2\2tv\5\22\n\2up\3\2\2\2uq\3\2\2\2ut\3\2\2\2v\r"+
		"\3\2\2\2wx\t\2\2\2x\17\3\2\2\2yz\t\3\2\2z\21\3\2\2\2{|\7\60\2\2|\23\3"+
		"\2\2\2}~\7\6\2\2~\177\7\35\2\2\177\u0081\7\27\2\2\u0080\u0082\5\26\f\2"+
		"\u0081\u0080\3\2\2\2\u0081\u0082\3\2\2\2\u0082\u0083\3\2\2\2\u0083\u0084"+
		"\7\30\2\2\u0084\25\3\2\2\2\u0085\u0089\5\30\r\2\u0086\u0089\5\34\17\2"+
		"\u0087\u0089\5\36\20\2\u0088\u0085\3\2\2\2\u0088\u0086\3\2\2\2\u0088\u0087"+
		"\3\2\2\2\u0089\27\3\2\2\2\u008a\u008b\5\n\6\2\u008b\u008c\7\35\2\2\u008c"+
		"\u008d\5\32\16\2\u008d\u0091\7\36\2\2\u008e\u0090\5\26\f\2\u008f\u008e"+
		"\3\2\2\2\u0090\u0093\3\2\2\2\u0091\u008f\3\2\2\2\u0091\u0092\3\2\2\2\u0092"+
		"\31\3\2\2\2\u0093\u0091\3\2\2\2\u0094\u0095\t\4\2\2\u0095\33\3\2\2\2\u0096"+
		"\u0097\7\b\2\2\u0097\u0098\5\n\6\2\u0098\u0099\7\n\2\2\u0099\u009a\7-"+
		"\2\2\u009a\u009b\7\35\2\2\u009b\u009c\5\32\16\2\u009c\u00a0\7\36\2\2\u009d"+
		"\u009f\5\26\f\2\u009e\u009d\3\2\2\2\u009f\u00a2\3\2\2\2\u00a0\u009e\3"+
		"\2\2\2\u00a0\u00a1\3\2\2\2\u00a1\35\3\2\2\2\u00a2\u00a0\3\2\2\2\u00a3"+
		"\u00a4\7\t\2\2\u00a4\u00a5\5\n\6\2\u00a5\u00a6\7\n\2\2\u00a6\u00a7\5\32"+
		"\16\2\u00a7\u00ab\7\36\2\2\u00a8\u00aa\5\26\f\2\u00a9\u00a8\3\2\2\2\u00aa"+
		"\u00ad\3\2\2\2\u00ab\u00a9\3\2\2\2\u00ab\u00ac\3\2\2\2\u00ac\37\3\2\2"+
		"\2\u00ad\u00ab\3\2\2\2\u00ae\u00af\7\7\2\2\u00af\u00b0\7\35\2\2\u00b0"+
		"\u00b2\7\27\2\2\u00b1\u00b3\5\"\22\2\u00b2\u00b1\3\2\2\2\u00b2\u00b3\3"+
		"\2\2\2\u00b3\u00b4\3\2\2\2\u00b4\u00b5\7\30\2\2\u00b5!\3\2\2\2\u00b6\u00b7"+
		"\5\32\16\2\u00b7\u00b8\5\n\6\2\u00b8\u00ba\7\31\2\2\u00b9\u00bb\5&\24"+
		"\2\u00ba\u00b9\3\2\2\2\u00ba\u00bb\3\2\2\2\u00bb\u00bc\3\2\2\2\u00bc\u00bd"+
		"\7\32\2\2\u00bd\u00be\7\27\2\2\u00be\u00bf\5$\23\2\u00bf\u00c0\5*\26\2"+
		"\u00c0\u00c4\7\30\2\2\u00c1\u00c3\5\"\22\2\u00c2\u00c1\3\2\2\2\u00c3\u00c6"+
		"\3\2\2\2\u00c4\u00c2\3\2\2\2\u00c4\u00c5\3\2\2\2\u00c5#\3\2\2\2\u00c6"+
		"\u00c4\3\2\2\2\u00c7\u00c8\7\4\2\2\u00c8\u00c9\7\35\2\2\u00c9\u00ce\7"+
		"\27\2\2\u00ca\u00cd\5\6\4\2\u00cb\u00cd\5\24\13\2\u00cc\u00ca\3\2\2\2"+
		"\u00cc\u00cb\3\2\2\2\u00cd\u00d0\3\2\2\2\u00ce\u00cc\3\2\2\2\u00ce\u00cf"+
		"\3\2\2\2\u00cf\u00d1\3\2\2\2\u00d0\u00ce\3\2\2\2\u00d1\u00d2\7\30\2\2"+
		"\u00d2%\3\2\2\2\u00d3\u00d4\5\32\16\2\u00d4\u00d9\5\n\6\2\u00d5\u00d6"+
		"\7\37\2\2\u00d6\u00d8\5&\24\2\u00d7\u00d5\3\2\2\2\u00d8\u00db\3\2\2\2"+
		"\u00d9\u00d7\3\2\2\2\u00d9\u00da\3\2\2\2\u00da\'\3\2\2\2\u00db\u00d9\3"+
		"\2\2\2\u00dc\u00e3\5\n\6\2\u00dd\u00de\7\33\2\2\u00de\u00df\5> \2\u00df"+
		"\u00e0\7\34\2\2\u00e0\u00e4\3\2\2\2\u00e1\u00e2\7 \2\2\u00e2\u00e4\5\n"+
		"\6\2\u00e3\u00dd\3\2\2\2\u00e3\u00e1\3\2\2\2\u00e3\u00e4\3\2\2\2\u00e4"+
		")\3\2\2\2\u00e5\u00e6\7\3\2\2\u00e6\u00e7\7\35\2\2\u00e7\u00e8\7\27\2"+
		"\2\u00e8\u00e9\5.\30\2\u00e9\u00ea\5,\27\2\u00ea\u00eb\7\30\2\2\u00eb"+
		"+\3\2\2\2\u00ec\u00ed\7\25\2\2\u00ed\u00ee\5> \2\u00ee\u00ef\7\36\2\2"+
		"\u00ef-\3\2\2\2\u00f0\u00f1\5\60\31\2\u00f1\u00f2\7\36\2\2\u00f2\u00f4"+
		"\3\2\2\2\u00f3\u00f0\3\2\2\2\u00f4\u00f7\3\2\2\2\u00f5\u00f3\3\2\2\2\u00f5"+
		"\u00f6\3\2\2\2\u00f6/\3\2\2\2\u00f7\u00f5\3\2\2\2\u00f8\u00ff\5:\36\2"+
		"\u00f9\u00ff\5\66\34\2\u00fa\u00ff\58\35\2\u00fb\u00ff\5H%\2\u00fc\u00ff"+
		"\5\64\33\2\u00fd\u00ff\5\62\32\2\u00fe\u00f8\3\2\2\2\u00fe\u00f9\3\2\2"+
		"\2\u00fe\u00fa\3\2\2\2\u00fe\u00fb\3\2\2\2\u00fe\u00fc\3\2\2\2\u00fe\u00fd"+
		"\3\2\2\2\u00ff\61\3\2\2\2\u0100\u0101\7\24\2\2\u0101\u0102\5<\37\2\u0102"+
		"\u0103\7\27\2\2\u0103\u0104\5.\30\2\u0104\u0105\7\30\2\2\u0105\63\3\2"+
		"\2\2\u0106\u0107\7\13\2\2\u0107\u0108\5<\37\2\u0108\u0109\7\27\2\2\u0109"+
		"\u010a\5.\30\2\u010a\u0110\7\30\2\2\u010b\u010c\7\f\2\2\u010c\u010d\7"+
		"\27\2\2\u010d\u010e\5.\30\2\u010e\u010f\7\30\2\2\u010f\u0111\3\2\2\2\u0110"+
		"\u010b\3\2\2\2\u0110\u0111\3\2\2\2\u0111\65\3\2\2\2\u0112\u0113\7\23\2"+
		"\2\u0113\u0114\5(\25\2\u0114\67\3\2\2\2\u0115\u0118\7\22\2\2\u0116\u0119"+
		"\5(\25\2\u0117\u0119\5\22\n\2\u0118\u0116\3\2\2\2\u0118\u0117\3\2\2\2"+
		"\u01199\3\2\2\2\u011a\u011b\5(\25\2\u011b\u011e\7\26\2\2\u011c\u011f\5"+
		"> \2\u011d\u011f\5\22\n\2\u011e\u011c\3\2\2\2\u011e\u011d\3\2\2\2\u011f"+
		";\3\2\2\2\u0120\u0125\5> \2\u0121\u0122\t\5\2\2\u0122\u0124\5> \2\u0123"+
		"\u0121\3\2\2\2\u0124\u0127\3\2\2\2\u0125\u0123\3\2\2\2\u0125\u0126\3\2"+
		"\2\2\u0126=\3\2\2\2\u0127\u0125\3\2\2\2\u0128\u012d\5@!\2\u0129\u012a"+
		"\t\6\2\2\u012a\u012c\5@!\2\u012b\u0129\3\2\2\2\u012c\u012f\3\2\2\2\u012d"+
		"\u012b\3\2\2\2\u012d\u012e\3\2\2\2\u012e?\3\2\2\2\u012f\u012d\3\2\2\2"+
		"\u0130\u0135\5B\"\2\u0131\u0132\t\7\2\2\u0132\u0134\5B\"\2\u0133\u0131"+
		"\3\2\2\2\u0134\u0137\3\2\2\2\u0135\u0133\3\2\2\2\u0135\u0136\3\2\2\2\u0136"+
		"A\3\2\2\2\u0137\u0135\3\2\2\2\u0138\u013a\t\3\2\2\u0139\u0138\3\2\2\2"+
		"\u0139\u013a\3\2\2\2\u013a\u013b\3\2\2\2\u013b\u013c\5D#\2\u013cC\3\2"+
		"\2\2\u013d\u0147\5(\25\2\u013e\u013f\7\32\2\2\u013f\u0140\5> \2\u0140"+
		"\u0141\7\31\2\2\u0141\u0147\3\2\2\2\u0142\u0147\5H%\2\u0143\u0147\5\16"+
		"\b\2\u0144\u0145\7#\2\2\u0145\u0147\5D#\2\u0146\u013d\3\2\2\2\u0146\u013e"+
		"\3\2\2\2\u0146\u0142\3\2\2\2\u0146\u0143\3\2\2\2\u0146\u0144\3\2\2\2\u0147"+
		"E\3\2\2\2\u0148\u014d\5J&\2\u0149\u014a\7\37\2\2\u014a\u014c\5J&\2\u014b"+
		"\u0149\3\2\2\2\u014c\u014f\3\2\2\2\u014d\u014b\3\2\2\2\u014d\u014e\3\2"+
		"\2\2\u014eG\3\2\2\2\u014f\u014d\3\2\2\2\u0150\u0151\5\n\6\2\u0151\u0153"+
		"\7\31\2\2\u0152\u0154\5F$\2\u0153\u0152\3\2\2\2\u0153\u0154\3\2\2\2\u0154"+
		"\u0155\3\2\2\2\u0155\u0156\7\32\2\2\u0156I\3\2\2\2\u0157\u0158\5> \2\u0158"+
		"K\3\2\2\2\37UW`ku\u0081\u0088\u0091\u00a0\u00ab\u00b2\u00ba\u00c4\u00cc"+
		"\u00ce\u00d9\u00e3\u00f5\u00fe\u0110\u0118\u011e\u0125\u012d\u0135\u0139"+
		"\u0146\u014d\u0153";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}