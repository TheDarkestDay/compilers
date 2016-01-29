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
		RULE_compStatement = 24, RULE_subblock = 25, RULE_loop = 26, RULE_condition = 27, 
		RULE_elseBranch = 28, RULE_input = 29, RULE_output = 30, RULE_assign = 31, 
		RULE_expression = 32, RULE_relop = 33, RULE_simpleExpression = 34, RULE_lowop = 35, 
		RULE_term = 36, RULE_highop = 37, RULE_signedFactor = 38, RULE_factor = 39, 
		RULE_argsList = 40, RULE_functionCall = 41, RULE_argument = 42;
	public static final String[] ruleNames = {
		"program", "declarations", "constantBlock", "constDefinition", "identifier", 
		"constant", "unsignedNumber", "sign", "string", "variableBlock", "variableDefinition", 
		"atomicDefinition", "type", "arrayDefinition", "dictDefinition", "functionBlock", 
		"functionDefinition", "functionDecl", "args", "variable", "code", "returnStatement", 
		"statementSequence", "statement", "compStatement", "subblock", "loop", 
		"condition", "elseBranch", "input", "output", "assign", "expression", 
		"relop", "simpleExpression", "lowop", "term", "highop", "signedFactor", 
		"factor", "argsList", "functionCall", "argument"
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
			setState(86);
			declarations();
			setState(87);
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
			setState(89);
			match(HEAD);
			setState(90);
			match(COL);
			setState(91);
			match(RCURL);
			setState(97);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CONST) | (1L << VARS) | (1L << SUBS))) != 0)) {
				{
				setState(95);
				switch (_input.LA(1)) {
				case CONST:
					{
					setState(92);
					constantBlock();
					}
					break;
				case VARS:
					{
					setState(93);
					variableBlock();
					}
					break;
				case SUBS:
					{
					setState(94);
					functionBlock();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(99);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(100);
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
			setState(102);
			match(CONST);
			setState(103);
			match(COL);
			setState(104);
			match(RCURL);
			setState(106);
			_la = _input.LA(1);
			if (_la==IDENT) {
				{
				setState(105);
				constDefinition();
				}
			}

			setState(108);
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
			setState(110);
			identifier();
			setState(111);
			match(EQUAL);
			setState(112);
			constant();
			setState(113);
			match(SEMI);
			setState(117);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(114);
					constDefinition();
					}
					} 
				}
				setState(119);
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
			setState(120);
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
			setState(127);
			switch (_input.LA(1)) {
			case NUM_INT:
			case NUM_REAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(122);
				unsignedNumber();
				}
				break;
			case PLUS:
			case MINUS:
				enterOuterAlt(_localctx, 2);
				{
				setState(123);
				sign();
				setState(124);
				unsignedNumber();
				}
				break;
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(126);
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
			setState(129);
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
			setState(131);
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
			setState(133);
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
			setState(135);
			match(VARS);
			setState(136);
			match(COL);
			setState(137);
			match(RCURL);
			setState(139);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << COLLECTION) | (1L << DICTIONARY) | (1L << IDENT))) != 0)) {
				{
				setState(138);
				variableDefinition();
				}
			}

			setState(141);
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
			setState(146);
			switch (_input.LA(1)) {
			case IDENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(143);
				atomicDefinition();
				}
				break;
			case COLLECTION:
				enterOuterAlt(_localctx, 2);
				{
				setState(144);
				arrayDefinition();
				}
				break;
			case DICTIONARY:
				enterOuterAlt(_localctx, 3);
				{
				setState(145);
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
			setState(148);
			identifier();
			setState(149);
			match(COL);
			setState(150);
			type();
			setState(151);
			match(SEMI);
			setState(155);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(152);
					variableDefinition();
					}
					} 
				}
				setState(157);
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
			setState(158);
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
			setState(160);
			match(COLLECTION);
			setState(161);
			identifier();
			setState(162);
			match(OF);
			setState(163);
			match(NUM_INT);
			setState(164);
			match(COL);
			setState(165);
			type();
			setState(166);
			match(SEMI);
			setState(170);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(167);
					variableDefinition();
					}
					} 
				}
				setState(172);
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
			setState(173);
			match(DICTIONARY);
			setState(174);
			identifier();
			setState(175);
			match(OF);
			setState(176);
			type();
			setState(177);
			match(SEMI);
			setState(181);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(178);
					variableDefinition();
					}
					} 
				}
				setState(183);
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
			setState(184);
			match(SUBS);
			setState(185);
			match(COL);
			setState(186);
			match(RCURL);
			setState(188);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NUMBER) | (1L << REAL) | (1L << STRING))) != 0)) {
				{
				setState(187);
				functionDefinition();
				}
			}

			setState(190);
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
			setState(192);
			type();
			setState(193);
			identifier();
			setState(194);
			match(RPAREN);
			setState(196);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NUMBER) | (1L << REAL) | (1L << STRING))) != 0)) {
				{
				setState(195);
				args();
				}
			}

			setState(198);
			match(LPAREN);
			setState(199);
			match(RCURL);
			setState(200);
			functionDecl();
			setState(201);
			code();
			setState(202);
			match(LCURL);
			setState(206);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(203);
					functionDefinition();
					}
					} 
				}
				setState(208);
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
			setState(209);
			match(HEAD);
			setState(210);
			match(COL);
			setState(211);
			match(RCURL);
			setState(216);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CONST || _la==VARS) {
				{
				setState(214);
				switch (_input.LA(1)) {
				case CONST:
					{
					setState(212);
					constantBlock();
					}
					break;
				case VARS:
					{
					setState(213);
					variableBlock();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(218);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(219);
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
			setState(221);
			type();
			setState(222);
			identifier();
			setState(227);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(223);
					match(COM);
					setState(224);
					args();
					}
					} 
				}
				setState(229);
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
			setState(230);
			identifier();
			setState(237);
			switch (_input.LA(1)) {
			case RBRACK:
				{
				setState(231);
				match(RBRACK);
				setState(232);
				simpleExpression();
				setState(233);
				match(LBRACK);
				}
				break;
			case DOT:
				{
				setState(235);
				match(DOT);
				setState(236);
				identifier();
				}
				break;
			case OR:
			case AND:
			case ASSIGN:
			case RCURL:
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
			setState(239);
			match(BODY);
			setState(240);
			match(COL);
			setState(241);
			match(RCURL);
			setState(242);
			statementSequence();
			setState(243);
			returnStatement();
			setState(244);
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
			setState(246);
			match(RET);
			setState(247);
			simpleExpression();
			setState(248);
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
		public List<TerminalNode> SEMI() { return getTokens(simpleParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(simpleParser.SEMI, i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<CompStatementContext> compStatement() {
			return getRuleContexts(CompStatementContext.class);
		}
		public CompStatementContext compStatement(int i) {
			return getRuleContext(CompStatementContext.class,i);
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
			setState(258);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << PRINT) | (1L << GET) | (1L << WHILE) | (1L << IDENT))) != 0)) {
				{
				{
				setState(252);
				switch (_input.LA(1)) {
				case PRINT:
				case GET:
				case IDENT:
					{
					setState(250);
					statement();
					}
					break;
				case IF:
				case WHILE:
					{
					setState(251);
					compStatement();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(254);
				match(SEMI);
				}
				}
				setState(260);
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
			setState(265);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(261);
				assign();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(262);
				input();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(263);
				output();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(264);
				functionCall();
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

	public static class CompStatementContext extends ParserRuleContext {
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public LoopContext loop() {
			return getRuleContext(LoopContext.class,0);
		}
		public CompStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof simpleListener ) ((simpleListener)listener).enterCompStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof simpleListener ) ((simpleListener)listener).exitCompStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof simpleVisitor ) return ((simpleVisitor<? extends T>)visitor).visitCompStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompStatementContext compStatement() throws RecognitionException {
		CompStatementContext _localctx = new CompStatementContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_compStatement);
		try {
			setState(269);
			switch (_input.LA(1)) {
			case IF:
				enterOuterAlt(_localctx, 1);
				{
				setState(267);
				condition();
				}
				break;
			case WHILE:
				enterOuterAlt(_localctx, 2);
				{
				setState(268);
				loop();
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

	public static class SubblockContext extends ParserRuleContext {
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
		public SubblockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subblock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof simpleListener ) ((simpleListener)listener).enterSubblock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof simpleListener ) ((simpleListener)listener).exitSubblock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof simpleVisitor ) return ((simpleVisitor<? extends T>)visitor).visitSubblock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SubblockContext subblock() throws RecognitionException {
		SubblockContext _localctx = new SubblockContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_subblock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(276);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRINT) | (1L << GET) | (1L << IDENT))) != 0)) {
				{
				{
				setState(271);
				statement();
				setState(272);
				match(SEMI);
				}
				}
				setState(278);
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

	public static class LoopContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(simpleParser.WHILE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RCURL() { return getToken(simpleParser.RCURL, 0); }
		public SubblockContext subblock() {
			return getRuleContext(SubblockContext.class,0);
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
		enterRule(_localctx, 52, RULE_loop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(279);
			match(WHILE);
			setState(280);
			expression();
			setState(281);
			match(RCURL);
			setState(282);
			subblock();
			setState(283);
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
		public TerminalNode RCURL() { return getToken(simpleParser.RCURL, 0); }
		public SubblockContext subblock() {
			return getRuleContext(SubblockContext.class,0);
		}
		public TerminalNode LCURL() { return getToken(simpleParser.LCURL, 0); }
		public ElseBranchContext elseBranch() {
			return getRuleContext(ElseBranchContext.class,0);
		}
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
		enterRule(_localctx, 54, RULE_condition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(285);
			match(IF);
			setState(286);
			expression();
			setState(287);
			match(RCURL);
			setState(288);
			subblock();
			setState(289);
			match(LCURL);
			setState(291);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(290);
				elseBranch();
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

	public static class ElseBranchContext extends ParserRuleContext {
		public TerminalNode ELSE() { return getToken(simpleParser.ELSE, 0); }
		public TerminalNode RCURL() { return getToken(simpleParser.RCURL, 0); }
		public SubblockContext subblock() {
			return getRuleContext(SubblockContext.class,0);
		}
		public TerminalNode LCURL() { return getToken(simpleParser.LCURL, 0); }
		public ElseBranchContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseBranch; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof simpleListener ) ((simpleListener)listener).enterElseBranch(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof simpleListener ) ((simpleListener)listener).exitElseBranch(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof simpleVisitor ) return ((simpleVisitor<? extends T>)visitor).visitElseBranch(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElseBranchContext elseBranch() throws RecognitionException {
		ElseBranchContext _localctx = new ElseBranchContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_elseBranch);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(293);
			match(ELSE);
			setState(294);
			match(RCURL);
			setState(295);
			subblock();
			setState(296);
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
		enterRule(_localctx, 58, RULE_input);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(298);
			match(GET);
			setState(299);
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
		public SimpleExpressionContext simpleExpression() {
			return getRuleContext(SimpleExpressionContext.class,0);
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
		enterRule(_localctx, 60, RULE_output);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(301);
			match(PRINT);
			setState(304);
			switch (_input.LA(1)) {
			case RPAREN:
			case NOT:
			case PLUS:
			case MINUS:
			case IDENT:
			case NUM_INT:
			case NUM_REAL:
				{
				setState(302);
				simpleExpression();
				}
				break;
			case STRING_LITERAL:
				{
				setState(303);
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
		enterRule(_localctx, 62, RULE_assign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(306);
			variable();
			setState(307);
			match(ASSIGN);
			setState(310);
			switch (_input.LA(1)) {
			case RPAREN:
			case NOT:
			case PLUS:
			case MINUS:
			case IDENT:
			case NUM_INT:
			case NUM_REAL:
				{
				setState(308);
				simpleExpression();
				}
				break;
			case STRING_LITERAL:
				{
				setState(309);
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
		public List<RelopContext> relop() {
			return getRuleContexts(RelopContext.class);
		}
		public RelopContext relop(int i) {
			return getRuleContext(RelopContext.class,i);
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
		enterRule(_localctx, 64, RULE_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(312);
			simpleExpression();
			setState(318);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EQUAL) | (1L << NOT_EQUAL) | (1L << LT) | (1L << LE) | (1L << GT) | (1L << GE))) != 0)) {
				{
				{
				setState(313);
				relop();
				setState(314);
				simpleExpression();
				}
				}
				setState(320);
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

	public static class RelopContext extends ParserRuleContext {
		public TerminalNode EQUAL() { return getToken(simpleParser.EQUAL, 0); }
		public TerminalNode NOT_EQUAL() { return getToken(simpleParser.NOT_EQUAL, 0); }
		public TerminalNode GT() { return getToken(simpleParser.GT, 0); }
		public TerminalNode LT() { return getToken(simpleParser.LT, 0); }
		public TerminalNode GE() { return getToken(simpleParser.GE, 0); }
		public TerminalNode LE() { return getToken(simpleParser.LE, 0); }
		public RelopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof simpleListener ) ((simpleListener)listener).enterRelop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof simpleListener ) ((simpleListener)listener).exitRelop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof simpleVisitor ) return ((simpleVisitor<? extends T>)visitor).visitRelop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelopContext relop() throws RecognitionException {
		RelopContext _localctx = new RelopContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_relop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(321);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EQUAL) | (1L << NOT_EQUAL) | (1L << LT) | (1L << LE) | (1L << GT) | (1L << GE))) != 0)) ) {
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

	public static class SimpleExpressionContext extends ParserRuleContext {
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public List<LowopContext> lowop() {
			return getRuleContexts(LowopContext.class);
		}
		public LowopContext lowop(int i) {
			return getRuleContext(LowopContext.class,i);
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
		enterRule(_localctx, 68, RULE_simpleExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(323);
			term();
			setState(329);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OR) | (1L << PLUS) | (1L << MINUS))) != 0)) {
				{
				{
				setState(324);
				lowop();
				setState(325);
				term();
				}
				}
				setState(331);
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

	public static class LowopContext extends ParserRuleContext {
		public TerminalNode PLUS() { return getToken(simpleParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(simpleParser.MINUS, 0); }
		public TerminalNode OR() { return getToken(simpleParser.OR, 0); }
		public LowopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lowop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof simpleListener ) ((simpleListener)listener).enterLowop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof simpleListener ) ((simpleListener)listener).exitLowop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof simpleVisitor ) return ((simpleVisitor<? extends T>)visitor).visitLowop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LowopContext lowop() throws RecognitionException {
		LowopContext _localctx = new LowopContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_lowop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(332);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OR) | (1L << PLUS) | (1L << MINUS))) != 0)) ) {
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

	public static class TermContext extends ParserRuleContext {
		public List<SignedFactorContext> signedFactor() {
			return getRuleContexts(SignedFactorContext.class);
		}
		public SignedFactorContext signedFactor(int i) {
			return getRuleContext(SignedFactorContext.class,i);
		}
		public List<HighopContext> highop() {
			return getRuleContexts(HighopContext.class);
		}
		public HighopContext highop(int i) {
			return getRuleContext(HighopContext.class,i);
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
		enterRule(_localctx, 72, RULE_term);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(334);
			signedFactor();
			setState(340);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AND) | (1L << STAR) | (1L << SLASH))) != 0)) {
				{
				{
				setState(335);
				highop();
				setState(336);
				signedFactor();
				}
				}
				setState(342);
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

	public static class HighopContext extends ParserRuleContext {
		public TerminalNode STAR() { return getToken(simpleParser.STAR, 0); }
		public TerminalNode SLASH() { return getToken(simpleParser.SLASH, 0); }
		public TerminalNode AND() { return getToken(simpleParser.AND, 0); }
		public HighopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_highop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof simpleListener ) ((simpleListener)listener).enterHighop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof simpleListener ) ((simpleListener)listener).exitHighop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof simpleVisitor ) return ((simpleVisitor<? extends T>)visitor).visitHighop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HighopContext highop() throws RecognitionException {
		HighopContext _localctx = new HighopContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_highop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(343);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AND) | (1L << STAR) | (1L << SLASH))) != 0)) ) {
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
		enterRule(_localctx, 76, RULE_signedFactor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(346);
			_la = _input.LA(1);
			if (_la==PLUS || _la==MINUS) {
				{
				setState(345);
				_la = _input.LA(1);
				if ( !(_la==PLUS || _la==MINUS) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
			}

			setState(348);
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
		public TerminalNode RPAREN() { return getToken(simpleParser.RPAREN, 0); }
		public SimpleExpressionContext simpleExpression() {
			return getRuleContext(SimpleExpressionContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(simpleParser.LPAREN, 0); }
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
		enterRule(_localctx, 78, RULE_factor);
		try {
			setState(359);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(350);
				variable();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(351);
				match(RPAREN);
				setState(352);
				simpleExpression();
				setState(353);
				match(LPAREN);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(355);
				functionCall();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(356);
				unsignedNumber();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(357);
				match(NOT);
				setState(358);
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
		enterRule(_localctx, 80, RULE_argsList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(361);
			argument();
			setState(366);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COM) {
				{
				{
				setState(362);
				match(COM);
				setState(363);
				argument();
				}
				}
				setState(368);
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
		enterRule(_localctx, 82, RULE_functionCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(369);
			identifier();
			setState(370);
			match(RPAREN);
			setState(372);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << RPAREN) | (1L << NOT) | (1L << PLUS) | (1L << MINUS) | (1L << IDENT) | (1L << NUM_INT) | (1L << NUM_REAL))) != 0)) {
				{
				setState(371);
				argsList();
				}
			}

			setState(374);
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
		enterRule(_localctx, 84, RULE_argument);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(376);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\61\u017d\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\7\3b\n\3\f\3\16\3e\13\3\3\3\3"+
		"\3\3\4\3\4\3\4\3\4\5\4m\n\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\7\5v\n\5\f\5\16"+
		"\5y\13\5\3\6\3\6\3\7\3\7\3\7\3\7\3\7\5\7\u0082\n\7\3\b\3\b\3\t\3\t\3\n"+
		"\3\n\3\13\3\13\3\13\3\13\5\13\u008e\n\13\3\13\3\13\3\f\3\f\3\f\5\f\u0095"+
		"\n\f\3\r\3\r\3\r\3\r\3\r\7\r\u009c\n\r\f\r\16\r\u009f\13\r\3\16\3\16\3"+
		"\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\7\17\u00ab\n\17\f\17\16\17\u00ae"+
		"\13\17\3\20\3\20\3\20\3\20\3\20\3\20\7\20\u00b6\n\20\f\20\16\20\u00b9"+
		"\13\20\3\21\3\21\3\21\3\21\5\21\u00bf\n\21\3\21\3\21\3\22\3\22\3\22\3"+
		"\22\5\22\u00c7\n\22\3\22\3\22\3\22\3\22\3\22\3\22\7\22\u00cf\n\22\f\22"+
		"\16\22\u00d2\13\22\3\23\3\23\3\23\3\23\3\23\7\23\u00d9\n\23\f\23\16\23"+
		"\u00dc\13\23\3\23\3\23\3\24\3\24\3\24\3\24\7\24\u00e4\n\24\f\24\16\24"+
		"\u00e7\13\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\5\25\u00f0\n\25\3\26\3"+
		"\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\30\3\30\5\30\u00ff"+
		"\n\30\3\30\3\30\7\30\u0103\n\30\f\30\16\30\u0106\13\30\3\31\3\31\3\31"+
		"\3\31\5\31\u010c\n\31\3\32\3\32\5\32\u0110\n\32\3\33\3\33\3\33\7\33\u0115"+
		"\n\33\f\33\16\33\u0118\13\33\3\34\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3"+
		"\35\3\35\3\35\3\35\5\35\u0126\n\35\3\36\3\36\3\36\3\36\3\36\3\37\3\37"+
		"\3\37\3 \3 \3 \5 \u0133\n \3!\3!\3!\3!\5!\u0139\n!\3\"\3\"\3\"\3\"\7\""+
		"\u013f\n\"\f\"\16\"\u0142\13\"\3#\3#\3$\3$\3$\3$\7$\u014a\n$\f$\16$\u014d"+
		"\13$\3%\3%\3&\3&\3&\3&\7&\u0155\n&\f&\16&\u0158\13&\3\'\3\'\3(\5(\u015d"+
		"\n(\3(\3(\3)\3)\3)\3)\3)\3)\3)\3)\3)\5)\u016a\n)\3*\3*\3*\7*\u016f\n*"+
		"\f*\16*\u0172\13*\3+\3+\3+\5+\u0177\n+\3+\3+\3,\3,\3,\2\2-\2\4\6\b\n\f"+
		"\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTV\2\b\3"+
		"\2-.\3\2()\3\2\r\17\4\2!\"$\'\4\2\20\20()\4\2\21\21*+\u017a\2X\3\2\2\2"+
		"\4[\3\2\2\2\6h\3\2\2\2\bp\3\2\2\2\nz\3\2\2\2\f\u0081\3\2\2\2\16\u0083"+
		"\3\2\2\2\20\u0085\3\2\2\2\22\u0087\3\2\2\2\24\u0089\3\2\2\2\26\u0094\3"+
		"\2\2\2\30\u0096\3\2\2\2\32\u00a0\3\2\2\2\34\u00a2\3\2\2\2\36\u00af\3\2"+
		"\2\2 \u00ba\3\2\2\2\"\u00c2\3\2\2\2$\u00d3\3\2\2\2&\u00df\3\2\2\2(\u00e8"+
		"\3\2\2\2*\u00f1\3\2\2\2,\u00f8\3\2\2\2.\u0104\3\2\2\2\60\u010b\3\2\2\2"+
		"\62\u010f\3\2\2\2\64\u0116\3\2\2\2\66\u0119\3\2\2\28\u011f\3\2\2\2:\u0127"+
		"\3\2\2\2<\u012c\3\2\2\2>\u012f\3\2\2\2@\u0134\3\2\2\2B\u013a\3\2\2\2D"+
		"\u0143\3\2\2\2F\u0145\3\2\2\2H\u014e\3\2\2\2J\u0150\3\2\2\2L\u0159\3\2"+
		"\2\2N\u015c\3\2\2\2P\u0169\3\2\2\2R\u016b\3\2\2\2T\u0173\3\2\2\2V\u017a"+
		"\3\2\2\2XY\5\4\3\2YZ\5*\26\2Z\3\3\2\2\2[\\\7\4\2\2\\]\7\35\2\2]c\7\27"+
		"\2\2^b\5\6\4\2_b\5\24\13\2`b\5 \21\2a^\3\2\2\2a_\3\2\2\2a`\3\2\2\2be\3"+
		"\2\2\2ca\3\2\2\2cd\3\2\2\2df\3\2\2\2ec\3\2\2\2fg\7\30\2\2g\5\3\2\2\2h"+
		"i\7\5\2\2ij\7\35\2\2jl\7\27\2\2km\5\b\5\2lk\3\2\2\2lm\3\2\2\2mn\3\2\2"+
		"\2no\7\30\2\2o\7\3\2\2\2pq\5\n\6\2qr\7!\2\2rs\5\f\7\2sw\7\36\2\2tv\5\b"+
		"\5\2ut\3\2\2\2vy\3\2\2\2wu\3\2\2\2wx\3\2\2\2x\t\3\2\2\2yw\3\2\2\2z{\7"+
		",\2\2{\13\3\2\2\2|\u0082\5\16\b\2}~\5\20\t\2~\177\5\16\b\2\177\u0082\3"+
		"\2\2\2\u0080\u0082\5\22\n\2\u0081|\3\2\2\2\u0081}\3\2\2\2\u0081\u0080"+
		"\3\2\2\2\u0082\r\3\2\2\2\u0083\u0084\t\2\2\2\u0084\17\3\2\2\2\u0085\u0086"+
		"\t\3\2\2\u0086\21\3\2\2\2\u0087\u0088\7\60\2\2\u0088\23\3\2\2\2\u0089"+
		"\u008a\7\6\2\2\u008a\u008b\7\35\2\2\u008b\u008d\7\27\2\2\u008c\u008e\5"+
		"\26\f\2\u008d\u008c\3\2\2\2\u008d\u008e\3\2\2\2\u008e\u008f\3\2\2\2\u008f"+
		"\u0090\7\30\2\2\u0090\25\3\2\2\2\u0091\u0095\5\30\r\2\u0092\u0095\5\34"+
		"\17\2\u0093\u0095\5\36\20\2\u0094\u0091\3\2\2\2\u0094\u0092\3\2\2\2\u0094"+
		"\u0093\3\2\2\2\u0095\27\3\2\2\2\u0096\u0097\5\n\6\2\u0097\u0098\7\35\2"+
		"\2\u0098\u0099\5\32\16\2\u0099\u009d\7\36\2\2\u009a\u009c\5\26\f\2\u009b"+
		"\u009a\3\2\2\2\u009c\u009f\3\2\2\2\u009d\u009b\3\2\2\2\u009d\u009e\3\2"+
		"\2\2\u009e\31\3\2\2\2\u009f\u009d\3\2\2\2\u00a0\u00a1\t\4\2\2\u00a1\33"+
		"\3\2\2\2\u00a2\u00a3\7\b\2\2\u00a3\u00a4\5\n\6\2\u00a4\u00a5\7\n\2\2\u00a5"+
		"\u00a6\7-\2\2\u00a6\u00a7\7\35\2\2\u00a7\u00a8\5\32\16\2\u00a8\u00ac\7"+
		"\36\2\2\u00a9\u00ab\5\26\f\2\u00aa\u00a9\3\2\2\2\u00ab\u00ae\3\2\2\2\u00ac"+
		"\u00aa\3\2\2\2\u00ac\u00ad\3\2\2\2\u00ad\35\3\2\2\2\u00ae\u00ac\3\2\2"+
		"\2\u00af\u00b0\7\t\2\2\u00b0\u00b1\5\n\6\2\u00b1\u00b2\7\n\2\2\u00b2\u00b3"+
		"\5\32\16\2\u00b3\u00b7\7\36\2\2\u00b4\u00b6\5\26\f\2\u00b5\u00b4\3\2\2"+
		"\2\u00b6\u00b9\3\2\2\2\u00b7\u00b5\3\2\2\2\u00b7\u00b8\3\2\2\2\u00b8\37"+
		"\3\2\2\2\u00b9\u00b7\3\2\2\2\u00ba\u00bb\7\7\2\2\u00bb\u00bc\7\35\2\2"+
		"\u00bc\u00be\7\27\2\2\u00bd\u00bf\5\"\22\2\u00be\u00bd\3\2\2\2\u00be\u00bf"+
		"\3\2\2\2\u00bf\u00c0\3\2\2\2\u00c0\u00c1\7\30\2\2\u00c1!\3\2\2\2\u00c2"+
		"\u00c3\5\32\16\2\u00c3\u00c4\5\n\6\2\u00c4\u00c6\7\31\2\2\u00c5\u00c7"+
		"\5&\24\2\u00c6\u00c5\3\2\2\2\u00c6\u00c7\3\2\2\2\u00c7\u00c8\3\2\2\2\u00c8"+
		"\u00c9\7\32\2\2\u00c9\u00ca\7\27\2\2\u00ca\u00cb\5$\23\2\u00cb\u00cc\5"+
		"*\26\2\u00cc\u00d0\7\30\2\2\u00cd\u00cf\5\"\22\2\u00ce\u00cd\3\2\2\2\u00cf"+
		"\u00d2\3\2\2\2\u00d0\u00ce\3\2\2\2\u00d0\u00d1\3\2\2\2\u00d1#\3\2\2\2"+
		"\u00d2\u00d0\3\2\2\2\u00d3\u00d4\7\4\2\2\u00d4\u00d5\7\35\2\2\u00d5\u00da"+
		"\7\27\2\2\u00d6\u00d9\5\6\4\2\u00d7\u00d9\5\24\13\2\u00d8\u00d6\3\2\2"+
		"\2\u00d8\u00d7\3\2\2\2\u00d9\u00dc\3\2\2\2\u00da\u00d8\3\2\2\2\u00da\u00db"+
		"\3\2\2\2\u00db\u00dd\3\2\2\2\u00dc\u00da\3\2\2\2\u00dd\u00de\7\30\2\2"+
		"\u00de%\3\2\2\2\u00df\u00e0\5\32\16\2\u00e0\u00e5\5\n\6\2\u00e1\u00e2"+
		"\7\37\2\2\u00e2\u00e4\5&\24\2\u00e3\u00e1\3\2\2\2\u00e4\u00e7\3\2\2\2"+
		"\u00e5\u00e3\3\2\2\2\u00e5\u00e6\3\2\2\2\u00e6\'\3\2\2\2\u00e7\u00e5\3"+
		"\2\2\2\u00e8\u00ef\5\n\6\2\u00e9\u00ea\7\33\2\2\u00ea\u00eb\5F$\2\u00eb"+
		"\u00ec\7\34\2\2\u00ec\u00f0\3\2\2\2\u00ed\u00ee\7 \2\2\u00ee\u00f0\5\n"+
		"\6\2\u00ef\u00e9\3\2\2\2\u00ef\u00ed\3\2\2\2\u00ef\u00f0\3\2\2\2\u00f0"+
		")\3\2\2\2\u00f1\u00f2\7\3\2\2\u00f2\u00f3\7\35\2\2\u00f3\u00f4\7\27\2"+
		"\2\u00f4\u00f5\5.\30\2\u00f5\u00f6\5,\27\2\u00f6\u00f7\7\30\2\2\u00f7"+
		"+\3\2\2\2\u00f8\u00f9\7\25\2\2\u00f9\u00fa\5F$\2\u00fa\u00fb\7\36\2\2"+
		"\u00fb-\3\2\2\2\u00fc\u00ff\5\60\31\2\u00fd\u00ff\5\62\32\2\u00fe\u00fc"+
		"\3\2\2\2\u00fe\u00fd\3\2\2\2\u00ff\u0100\3\2\2\2\u0100\u0101\7\36\2\2"+
		"\u0101\u0103\3\2\2\2\u0102\u00fe\3\2\2\2\u0103\u0106\3\2\2\2\u0104\u0102"+
		"\3\2\2\2\u0104\u0105\3\2\2\2\u0105/\3\2\2\2\u0106\u0104\3\2\2\2\u0107"+
		"\u010c\5@!\2\u0108\u010c\5<\37\2\u0109\u010c\5> \2\u010a\u010c\5T+\2\u010b"+
		"\u0107\3\2\2\2\u010b\u0108\3\2\2\2\u010b\u0109\3\2\2\2\u010b\u010a\3\2"+
		"\2\2\u010c\61\3\2\2\2\u010d\u0110\58\35\2\u010e\u0110\5\66\34\2\u010f"+
		"\u010d\3\2\2\2\u010f\u010e\3\2\2\2\u0110\63\3\2\2\2\u0111\u0112\5\60\31"+
		"\2\u0112\u0113\7\36\2\2\u0113\u0115\3\2\2\2\u0114\u0111\3\2\2\2\u0115"+
		"\u0118\3\2\2\2\u0116\u0114\3\2\2\2\u0116\u0117\3\2\2\2\u0117\65\3\2\2"+
		"\2\u0118\u0116\3\2\2\2\u0119\u011a\7\24\2\2\u011a\u011b\5B\"\2\u011b\u011c"+
		"\7\27\2\2\u011c\u011d\5\64\33\2\u011d\u011e\7\30\2\2\u011e\67\3\2\2\2"+
		"\u011f\u0120\7\13\2\2\u0120\u0121\5B\"\2\u0121\u0122\7\27\2\2\u0122\u0123"+
		"\5\64\33\2\u0123\u0125\7\30\2\2\u0124\u0126\5:\36\2\u0125\u0124\3\2\2"+
		"\2\u0125\u0126\3\2\2\2\u01269\3\2\2\2\u0127\u0128\7\f\2\2\u0128\u0129"+
		"\7\27\2\2\u0129\u012a\5\64\33\2\u012a\u012b\7\30\2\2\u012b;\3\2\2\2\u012c"+
		"\u012d\7\23\2\2\u012d\u012e\5(\25\2\u012e=\3\2\2\2\u012f\u0132\7\22\2"+
		"\2\u0130\u0133\5F$\2\u0131\u0133\5\22\n\2\u0132\u0130\3\2\2\2\u0132\u0131"+
		"\3\2\2\2\u0133?\3\2\2\2\u0134\u0135\5(\25\2\u0135\u0138\7\26\2\2\u0136"+
		"\u0139\5F$\2\u0137\u0139\5\22\n\2\u0138\u0136\3\2\2\2\u0138\u0137\3\2"+
		"\2\2\u0139A\3\2\2\2\u013a\u0140\5F$\2\u013b\u013c\5D#\2\u013c\u013d\5"+
		"F$\2\u013d\u013f\3\2\2\2\u013e\u013b\3\2\2\2\u013f\u0142\3\2\2\2\u0140"+
		"\u013e\3\2\2\2\u0140\u0141\3\2\2\2\u0141C\3\2\2\2\u0142\u0140\3\2\2\2"+
		"\u0143\u0144\t\5\2\2\u0144E\3\2\2\2\u0145\u014b\5J&\2\u0146\u0147\5H%"+
		"\2\u0147\u0148\5J&\2\u0148\u014a\3\2\2\2\u0149\u0146\3\2\2\2\u014a\u014d"+
		"\3\2\2\2\u014b\u0149\3\2\2\2\u014b\u014c\3\2\2\2\u014cG\3\2\2\2\u014d"+
		"\u014b\3\2\2\2\u014e\u014f\t\6\2\2\u014fI\3\2\2\2\u0150\u0156\5N(\2\u0151"+
		"\u0152\5L\'\2\u0152\u0153\5N(\2\u0153\u0155\3\2\2\2\u0154\u0151\3\2\2"+
		"\2\u0155\u0158\3\2\2\2\u0156\u0154\3\2\2\2\u0156\u0157\3\2\2\2\u0157K"+
		"\3\2\2\2\u0158\u0156\3\2\2\2\u0159\u015a\t\7\2\2\u015aM\3\2\2\2\u015b"+
		"\u015d\t\3\2\2\u015c\u015b\3\2\2\2\u015c\u015d\3\2\2\2\u015d\u015e\3\2"+
		"\2\2\u015e\u015f\5P)\2\u015fO\3\2\2\2\u0160\u016a\5(\25\2\u0161\u0162"+
		"\7\31\2\2\u0162\u0163\5F$\2\u0163\u0164\7\32\2\2\u0164\u016a\3\2\2\2\u0165"+
		"\u016a\5T+\2\u0166\u016a\5\16\b\2\u0167\u0168\7#\2\2\u0168\u016a\5P)\2"+
		"\u0169\u0160\3\2\2\2\u0169\u0161\3\2\2\2\u0169\u0165\3\2\2\2\u0169\u0166"+
		"\3\2\2\2\u0169\u0167\3\2\2\2\u016aQ\3\2\2\2\u016b\u0170\5V,\2\u016c\u016d"+
		"\7\37\2\2\u016d\u016f\5V,\2\u016e\u016c\3\2\2\2\u016f\u0172\3\2\2\2\u0170"+
		"\u016e\3\2\2\2\u0170\u0171\3\2\2\2\u0171S\3\2\2\2\u0172\u0170\3\2\2\2"+
		"\u0173\u0174\5\n\6\2\u0174\u0176\7\31\2\2\u0175\u0177\5R*\2\u0176\u0175"+
		"\3\2\2\2\u0176\u0177\3\2\2\2\u0177\u0178\3\2\2\2\u0178\u0179\7\32\2\2"+
		"\u0179U\3\2\2\2\u017a\u017b\5F$\2\u017bW\3\2\2\2\"aclw\u0081\u008d\u0094"+
		"\u009d\u00ac\u00b7\u00be\u00c6\u00d0\u00d8\u00da\u00e5\u00ef\u00fe\u0104"+
		"\u010b\u010f\u0116\u0125\u0132\u0138\u0140\u014b\u0156\u015c\u0169\u0170"+
		"\u0176";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}