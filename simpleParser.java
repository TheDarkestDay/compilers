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
		RULE_args = 17, RULE_variable = 18, RULE_code = 19, RULE_returnStatement = 20, 
		RULE_statementSequence = 21, RULE_statement = 22, RULE_loop = 23, RULE_condition = 24, 
		RULE_input = 25, RULE_output = 26, RULE_assign = 27, RULE_expression = 28, 
		RULE_simpleExpression = 29, RULE_term = 30, RULE_signedFactor = 31, RULE_factor = 32, 
		RULE_argsList = 33, RULE_functionCall = 34, RULE_argument = 35;
	public static final String[] ruleNames = {
		"program", "declarations", "constantBlock", "constDefinition", "identifier", 
		"constant", "unsignedNumber", "sign", "string", "variableBlock", "variableDefinition", 
		"atomicDefinition", "type", "arrayDefinition", "dictDefinition", "functionBlock", 
		"functionDefinition", "args", "variable", "code", "returnStatement", "statementSequence", 
		"statement", "loop", "condition", "input", "output", "assign", "expression", 
		"simpleExpression", "term", "signedFactor", "factor", "argsList", "functionCall", 
		"argument"
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
			setState(72);
			declarations();
			setState(73);
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
			setState(75);
			match(HEAD);
			setState(76);
			match(COL);
			setState(77);
			match(RCURL);
			setState(83);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CONST) | (1L << VARS) | (1L << SUBS))) != 0)) {
				{
				setState(81);
				switch (_input.LA(1)) {
				case CONST:
					{
					setState(78);
					constantBlock();
					}
					break;
				case VARS:
					{
					setState(79);
					variableBlock();
					}
					break;
				case SUBS:
					{
					setState(80);
					functionBlock();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(85);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(86);
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
			setState(88);
			match(CONST);
			setState(89);
			match(COL);
			setState(90);
			match(RCURL);
			setState(92);
			_la = _input.LA(1);
			if (_la==IDENT) {
				{
				setState(91);
				constDefinition();
				}
			}

			setState(94);
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
			setState(96);
			identifier();
			setState(97);
			match(EQUAL);
			setState(98);
			constant();
			setState(99);
			match(SEMI);
			setState(103);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(100);
					constDefinition();
					}
					} 
				}
				setState(105);
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
			setState(106);
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
			setState(113);
			switch (_input.LA(1)) {
			case NUM_INT:
			case NUM_REAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(108);
				unsignedNumber();
				}
				break;
			case PLUS:
			case MINUS:
				enterOuterAlt(_localctx, 2);
				{
				setState(109);
				sign();
				setState(110);
				unsignedNumber();
				}
				break;
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(112);
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
			setState(115);
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
			setState(117);
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
			setState(119);
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
			setState(121);
			match(VARS);
			setState(122);
			match(COL);
			setState(123);
			match(RCURL);
			setState(125);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << COLLECTION) | (1L << DICTIONARY) | (1L << IDENT))) != 0)) {
				{
				setState(124);
				variableDefinition();
				}
			}

			setState(127);
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
			setState(132);
			switch (_input.LA(1)) {
			case IDENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(129);
				atomicDefinition();
				}
				break;
			case COLLECTION:
				enterOuterAlt(_localctx, 2);
				{
				setState(130);
				arrayDefinition();
				}
				break;
			case DICTIONARY:
				enterOuterAlt(_localctx, 3);
				{
				setState(131);
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
			setState(134);
			identifier();
			setState(135);
			match(COL);
			setState(136);
			type();
			setState(137);
			match(SEMI);
			setState(141);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(138);
					variableDefinition();
					}
					} 
				}
				setState(143);
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
			setState(144);
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
			setState(146);
			match(COLLECTION);
			setState(147);
			identifier();
			setState(148);
			match(OF);
			setState(149);
			match(NUM_INT);
			setState(150);
			match(COL);
			setState(151);
			type();
			setState(152);
			match(SEMI);
			setState(156);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(153);
					variableDefinition();
					}
					} 
				}
				setState(158);
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
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public TerminalNode COM() { return getToken(simpleParser.COM, 0); }
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
			setState(159);
			match(DICTIONARY);
			setState(160);
			identifier();
			setState(161);
			match(OF);
			setState(162);
			type();
			setState(163);
			match(COM);
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
		public ProgramContext program() {
			return getRuleContext(ProgramContext.class,0);
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
			program();
			setState(189);
			match(LCURL);
			setState(193);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(190);
					functionDefinition();
					}
					} 
				}
				setState(195);
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
		enterRule(_localctx, 34, RULE_args);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(196);
			type();
			setState(197);
			identifier();
			setState(202);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(198);
					match(COM);
					setState(199);
					args();
					}
					} 
				}
				setState(204);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
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
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
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
		enterRule(_localctx, 36, RULE_variable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(205);
			identifier();
			setState(212);
			switch (_input.LA(1)) {
			case RBRACK:
				{
				setState(206);
				match(RBRACK);
				setState(207);
				expression();
				setState(208);
				match(LBRACK);
				}
				break;
			case DOT:
				{
				setState(210);
				match(DOT);
				setState(211);
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
		enterRule(_localctx, 38, RULE_code);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(214);
			match(BODY);
			setState(215);
			match(COL);
			setState(216);
			match(RCURL);
			setState(217);
			statementSequence();
			setState(218);
			returnStatement();
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

	public static class ReturnStatementContext extends ParserRuleContext {
		public TerminalNode RET() { return getToken(simpleParser.RET, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
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
		enterRule(_localctx, 40, RULE_returnStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(221);
			match(RET);
			setState(222);
			expression();
			setState(223);
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
		enterRule(_localctx, 42, RULE_statementSequence);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(230);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << PRINT) | (1L << GET) | (1L << WHILE) | (1L << IDENT))) != 0)) {
				{
				{
				setState(225);
				statement();
				setState(226);
				match(SEMI);
				}
				}
				setState(232);
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
		enterRule(_localctx, 44, RULE_statement);
		try {
			setState(239);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(233);
				assign();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(234);
				input();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(235);
				output();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(236);
				functionCall();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(237);
				condition();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(238);
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
		enterRule(_localctx, 46, RULE_loop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(241);
			match(WHILE);
			setState(242);
			expression();
			setState(243);
			match(RCURL);
			setState(244);
			statementSequence();
			setState(245);
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
		enterRule(_localctx, 48, RULE_condition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(247);
			match(IF);
			setState(248);
			expression();
			setState(249);
			match(RCURL);
			setState(250);
			statementSequence();
			setState(251);
			match(LCURL);
			setState(257);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(252);
				match(ELSE);
				setState(253);
				match(RCURL);
				setState(254);
				statementSequence();
				setState(255);
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
		enterRule(_localctx, 50, RULE_input);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(259);
			match(GET);
			setState(260);
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
		enterRule(_localctx, 52, RULE_output);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(262);
			match(PRINT);
			setState(265);
			switch (_input.LA(1)) {
			case IDENT:
				{
				setState(263);
				variable();
				}
				break;
			case STRING_LITERAL:
				{
				setState(264);
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
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
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
		enterRule(_localctx, 54, RULE_assign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(267);
			variable();
			setState(268);
			match(ASSIGN);
			setState(271);
			switch (_input.LA(1)) {
			case LPAREN:
			case NOT:
			case PLUS:
			case MINUS:
			case IDENT:
			case NUM_INT:
			case NUM_REAL:
				{
				setState(269);
				expression();
				}
				break;
			case STRING_LITERAL:
				{
				setState(270);
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
		enterRule(_localctx, 56, RULE_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(273);
			simpleExpression();
			setState(278);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EQUAL) | (1L << NOT_EQUAL) | (1L << LT) | (1L << LE) | (1L << GT) | (1L << GE))) != 0)) {
				{
				{
				setState(274);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EQUAL) | (1L << NOT_EQUAL) | (1L << LT) | (1L << LE) | (1L << GT) | (1L << GE))) != 0)) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(275);
				simpleExpression();
				}
				}
				setState(280);
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
		enterRule(_localctx, 58, RULE_simpleExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(281);
			term();
			setState(286);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OR) | (1L << PLUS) | (1L << MINUS))) != 0)) {
				{
				{
				setState(282);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OR) | (1L << PLUS) | (1L << MINUS))) != 0)) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(283);
				term();
				}
				}
				setState(288);
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
		enterRule(_localctx, 60, RULE_term);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(289);
			signedFactor();
			setState(294);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AND) | (1L << STAR) | (1L << SLASH))) != 0)) {
				{
				{
				setState(290);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AND) | (1L << STAR) | (1L << SLASH))) != 0)) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(291);
				signedFactor();
				}
				}
				setState(296);
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
		enterRule(_localctx, 62, RULE_signedFactor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(298);
			_la = _input.LA(1);
			if (_la==PLUS || _la==MINUS) {
				{
				setState(297);
				_la = _input.LA(1);
				if ( !(_la==PLUS || _la==MINUS) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
			}

			setState(300);
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
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
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
		enterRule(_localctx, 64, RULE_factor);
		try {
			setState(311);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(302);
				variable();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(303);
				match(LPAREN);
				setState(304);
				expression();
				setState(305);
				match(RPAREN);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(307);
				functionCall();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(308);
				unsignedNumber();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(309);
				match(NOT);
				setState(310);
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
		enterRule(_localctx, 66, RULE_argsList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(313);
			argument();
			setState(318);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COM) {
				{
				{
				setState(314);
				match(COM);
				setState(315);
				argument();
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
		enterRule(_localctx, 68, RULE_functionCall);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(321);
			identifier();
			setState(322);
			match(RPAREN);
			setState(324);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				{
				setState(323);
				argsList();
				}
				break;
			}
			setState(326);
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
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
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
		enterRule(_localctx, 70, RULE_argument);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(328);
			expression();
			}
		}
		catch (RecognitionException re) {
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\61\u014d\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\7\3"+
		"T\n\3\f\3\16\3W\13\3\3\3\3\3\3\4\3\4\3\4\3\4\5\4_\n\4\3\4\3\4\3\5\3\5"+
		"\3\5\3\5\3\5\7\5h\n\5\f\5\16\5k\13\5\3\6\3\6\3\7\3\7\3\7\3\7\3\7\5\7t"+
		"\n\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\13\3\13\5\13\u0080\n\13\3\13"+
		"\3\13\3\f\3\f\3\f\5\f\u0087\n\f\3\r\3\r\3\r\3\r\3\r\7\r\u008e\n\r\f\r"+
		"\16\r\u0091\13\r\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\7\17"+
		"\u009d\n\17\f\17\16\17\u00a0\13\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\7\20\u00aa\n\20\f\20\16\20\u00ad\13\20\3\21\3\21\3\21\3\21\5\21"+
		"\u00b3\n\21\3\21\3\21\3\22\3\22\3\22\3\22\5\22\u00bb\n\22\3\22\3\22\3"+
		"\22\3\22\3\22\7\22\u00c2\n\22\f\22\16\22\u00c5\13\22\3\23\3\23\3\23\3"+
		"\23\7\23\u00cb\n\23\f\23\16\23\u00ce\13\23\3\24\3\24\3\24\3\24\3\24\3"+
		"\24\3\24\5\24\u00d7\n\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26"+
		"\3\26\3\26\3\27\3\27\3\27\7\27\u00e7\n\27\f\27\16\27\u00ea\13\27\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\5\30\u00f2\n\30\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\5\32\u0104\n\32\3\33"+
		"\3\33\3\33\3\34\3\34\3\34\5\34\u010c\n\34\3\35\3\35\3\35\3\35\5\35\u0112"+
		"\n\35\3\36\3\36\3\36\7\36\u0117\n\36\f\36\16\36\u011a\13\36\3\37\3\37"+
		"\3\37\7\37\u011f\n\37\f\37\16\37\u0122\13\37\3 \3 \3 \7 \u0127\n \f \16"+
		" \u012a\13 \3!\5!\u012d\n!\3!\3!\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\5"+
		"\"\u013a\n\"\3#\3#\3#\7#\u013f\n#\f#\16#\u0142\13#\3$\3$\3$\5$\u0147\n"+
		"$\3$\3$\3%\3%\3%\2\2&\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,."+
		"\60\62\64\668:<>@BDFH\2\b\3\2-.\3\2()\3\2\r\17\4\2!\"$\'\4\2\20\20()\4"+
		"\2\21\21*+\u014e\2J\3\2\2\2\4M\3\2\2\2\6Z\3\2\2\2\bb\3\2\2\2\nl\3\2\2"+
		"\2\fs\3\2\2\2\16u\3\2\2\2\20w\3\2\2\2\22y\3\2\2\2\24{\3\2\2\2\26\u0086"+
		"\3\2\2\2\30\u0088\3\2\2\2\32\u0092\3\2\2\2\34\u0094\3\2\2\2\36\u00a1\3"+
		"\2\2\2 \u00ae\3\2\2\2\"\u00b6\3\2\2\2$\u00c6\3\2\2\2&\u00cf\3\2\2\2(\u00d8"+
		"\3\2\2\2*\u00df\3\2\2\2,\u00e8\3\2\2\2.\u00f1\3\2\2\2\60\u00f3\3\2\2\2"+
		"\62\u00f9\3\2\2\2\64\u0105\3\2\2\2\66\u0108\3\2\2\28\u010d\3\2\2\2:\u0113"+
		"\3\2\2\2<\u011b\3\2\2\2>\u0123\3\2\2\2@\u012c\3\2\2\2B\u0139\3\2\2\2D"+
		"\u013b\3\2\2\2F\u0143\3\2\2\2H\u014a\3\2\2\2JK\5\4\3\2KL\5(\25\2L\3\3"+
		"\2\2\2MN\7\4\2\2NO\7\35\2\2OU\7\27\2\2PT\5\6\4\2QT\5\24\13\2RT\5 \21\2"+
		"SP\3\2\2\2SQ\3\2\2\2SR\3\2\2\2TW\3\2\2\2US\3\2\2\2UV\3\2\2\2VX\3\2\2\2"+
		"WU\3\2\2\2XY\7\30\2\2Y\5\3\2\2\2Z[\7\5\2\2[\\\7\35\2\2\\^\7\27\2\2]_\5"+
		"\b\5\2^]\3\2\2\2^_\3\2\2\2_`\3\2\2\2`a\7\30\2\2a\7\3\2\2\2bc\5\n\6\2c"+
		"d\7!\2\2de\5\f\7\2ei\7\36\2\2fh\5\b\5\2gf\3\2\2\2hk\3\2\2\2ig\3\2\2\2"+
		"ij\3\2\2\2j\t\3\2\2\2ki\3\2\2\2lm\7,\2\2m\13\3\2\2\2nt\5\16\b\2op\5\20"+
		"\t\2pq\5\16\b\2qt\3\2\2\2rt\5\22\n\2sn\3\2\2\2so\3\2\2\2sr\3\2\2\2t\r"+
		"\3\2\2\2uv\t\2\2\2v\17\3\2\2\2wx\t\3\2\2x\21\3\2\2\2yz\7\60\2\2z\23\3"+
		"\2\2\2{|\7\6\2\2|}\7\35\2\2}\177\7\27\2\2~\u0080\5\26\f\2\177~\3\2\2\2"+
		"\177\u0080\3\2\2\2\u0080\u0081\3\2\2\2\u0081\u0082\7\30\2\2\u0082\25\3"+
		"\2\2\2\u0083\u0087\5\30\r\2\u0084\u0087\5\34\17\2\u0085\u0087\5\36\20"+
		"\2\u0086\u0083\3\2\2\2\u0086\u0084\3\2\2\2\u0086\u0085\3\2\2\2\u0087\27"+
		"\3\2\2\2\u0088\u0089\5\n\6\2\u0089\u008a\7\35\2\2\u008a\u008b\5\32\16"+
		"\2\u008b\u008f\7\36\2\2\u008c\u008e\5\26\f\2\u008d\u008c\3\2\2\2\u008e"+
		"\u0091\3\2\2\2\u008f\u008d\3\2\2\2\u008f\u0090\3\2\2\2\u0090\31\3\2\2"+
		"\2\u0091\u008f\3\2\2\2\u0092\u0093\t\4\2\2\u0093\33\3\2\2\2\u0094\u0095"+
		"\7\b\2\2\u0095\u0096\5\n\6\2\u0096\u0097\7\n\2\2\u0097\u0098\7-\2\2\u0098"+
		"\u0099\7\35\2\2\u0099\u009a\5\32\16\2\u009a\u009e\7\36\2\2\u009b\u009d"+
		"\5\26\f\2\u009c\u009b\3\2\2\2\u009d\u00a0\3\2\2\2\u009e\u009c\3\2\2\2"+
		"\u009e\u009f\3\2\2\2\u009f\35\3\2\2\2\u00a0\u009e\3\2\2\2\u00a1\u00a2"+
		"\7\t\2\2\u00a2\u00a3\5\n\6\2\u00a3\u00a4\7\n\2\2\u00a4\u00a5\5\32\16\2"+
		"\u00a5\u00a6\7\37\2\2\u00a6\u00a7\5\32\16\2\u00a7\u00ab\7\36\2\2\u00a8"+
		"\u00aa\5\26\f\2\u00a9\u00a8\3\2\2\2\u00aa\u00ad\3\2\2\2\u00ab\u00a9\3"+
		"\2\2\2\u00ab\u00ac\3\2\2\2\u00ac\37\3\2\2\2\u00ad\u00ab\3\2\2\2\u00ae"+
		"\u00af\7\7\2\2\u00af\u00b0\7\35\2\2\u00b0\u00b2\7\27\2\2\u00b1\u00b3\5"+
		"\"\22\2\u00b2\u00b1\3\2\2\2\u00b2\u00b3\3\2\2\2\u00b3\u00b4\3\2\2\2\u00b4"+
		"\u00b5\7\30\2\2\u00b5!\3\2\2\2\u00b6\u00b7\5\32\16\2\u00b7\u00b8\5\n\6"+
		"\2\u00b8\u00ba\7\31\2\2\u00b9\u00bb\5$\23\2\u00ba\u00b9\3\2\2\2\u00ba"+
		"\u00bb\3\2\2\2\u00bb\u00bc\3\2\2\2\u00bc\u00bd\7\32\2\2\u00bd\u00be\7"+
		"\27\2\2\u00be\u00bf\5\2\2\2\u00bf\u00c3\7\30\2\2\u00c0\u00c2\5\"\22\2"+
		"\u00c1\u00c0\3\2\2\2\u00c2\u00c5\3\2\2\2\u00c3\u00c1\3\2\2\2\u00c3\u00c4"+
		"\3\2\2\2\u00c4#\3\2\2\2\u00c5\u00c3\3\2\2\2\u00c6\u00c7\5\32\16\2\u00c7"+
		"\u00cc\5\n\6\2\u00c8\u00c9\7\37\2\2\u00c9\u00cb\5$\23\2\u00ca\u00c8\3"+
		"\2\2\2\u00cb\u00ce\3\2\2\2\u00cc\u00ca\3\2\2\2\u00cc\u00cd\3\2\2\2\u00cd"+
		"%\3\2\2\2\u00ce\u00cc\3\2\2\2\u00cf\u00d6\5\n\6\2\u00d0\u00d1\7\33\2\2"+
		"\u00d1\u00d2\5:\36\2\u00d2\u00d3\7\34\2\2\u00d3\u00d7\3\2\2\2\u00d4\u00d5"+
		"\7 \2\2\u00d5\u00d7\5\n\6\2\u00d6\u00d0\3\2\2\2\u00d6\u00d4\3\2\2\2\u00d6"+
		"\u00d7\3\2\2\2\u00d7\'\3\2\2\2\u00d8\u00d9\7\3\2\2\u00d9\u00da\7\35\2"+
		"\2\u00da\u00db\7\27\2\2\u00db\u00dc\5,\27\2\u00dc\u00dd\5*\26\2\u00dd"+
		"\u00de\7\30\2\2\u00de)\3\2\2\2\u00df\u00e0\7\25\2\2\u00e0\u00e1\5:\36"+
		"\2\u00e1\u00e2\7\36\2\2\u00e2+\3\2\2\2\u00e3\u00e4\5.\30\2\u00e4\u00e5"+
		"\7\36\2\2\u00e5\u00e7\3\2\2\2\u00e6\u00e3\3\2\2\2\u00e7\u00ea\3\2\2\2"+
		"\u00e8\u00e6\3\2\2\2\u00e8\u00e9\3\2\2\2\u00e9-\3\2\2\2\u00ea\u00e8\3"+
		"\2\2\2\u00eb\u00f2\58\35\2\u00ec\u00f2\5\64\33\2\u00ed\u00f2\5\66\34\2"+
		"\u00ee\u00f2\5F$\2\u00ef\u00f2\5\62\32\2\u00f0\u00f2\5\60\31\2\u00f1\u00eb"+
		"\3\2\2\2\u00f1\u00ec\3\2\2\2\u00f1\u00ed\3\2\2\2\u00f1\u00ee\3\2\2\2\u00f1"+
		"\u00ef\3\2\2\2\u00f1\u00f0\3\2\2\2\u00f2/\3\2\2\2\u00f3\u00f4\7\24\2\2"+
		"\u00f4\u00f5\5:\36\2\u00f5\u00f6\7\27\2\2\u00f6\u00f7\5,\27\2\u00f7\u00f8"+
		"\7\30\2\2\u00f8\61\3\2\2\2\u00f9\u00fa\7\13\2\2\u00fa\u00fb\5:\36\2\u00fb"+
		"\u00fc\7\27\2\2\u00fc\u00fd\5,\27\2\u00fd\u0103\7\30\2\2\u00fe\u00ff\7"+
		"\f\2\2\u00ff\u0100\7\27\2\2\u0100\u0101\5,\27\2\u0101\u0102\7\30\2\2\u0102"+
		"\u0104\3\2\2\2\u0103\u00fe\3\2\2\2\u0103\u0104\3\2\2\2\u0104\63\3\2\2"+
		"\2\u0105\u0106\7\23\2\2\u0106\u0107\5&\24\2\u0107\65\3\2\2\2\u0108\u010b"+
		"\7\22\2\2\u0109\u010c\5&\24\2\u010a\u010c\5\22\n\2\u010b\u0109\3\2\2\2"+
		"\u010b\u010a\3\2\2\2\u010c\67\3\2\2\2\u010d\u010e\5&\24\2\u010e\u0111"+
		"\7\26\2\2\u010f\u0112\5:\36\2\u0110\u0112\5\22\n\2\u0111\u010f\3\2\2\2"+
		"\u0111\u0110\3\2\2\2\u01129\3\2\2\2\u0113\u0118\5<\37\2\u0114\u0115\t"+
		"\5\2\2\u0115\u0117\5<\37\2\u0116\u0114\3\2\2\2\u0117\u011a\3\2\2\2\u0118"+
		"\u0116\3\2\2\2\u0118\u0119\3\2\2\2\u0119;\3\2\2\2\u011a\u0118\3\2\2\2"+
		"\u011b\u0120\5> \2\u011c\u011d\t\6\2\2\u011d\u011f\5> \2\u011e\u011c\3"+
		"\2\2\2\u011f\u0122\3\2\2\2\u0120\u011e\3\2\2\2\u0120\u0121\3\2\2\2\u0121"+
		"=\3\2\2\2\u0122\u0120\3\2\2\2\u0123\u0128\5@!\2\u0124\u0125\t\7\2\2\u0125"+
		"\u0127\5@!\2\u0126\u0124\3\2\2\2\u0127\u012a\3\2\2\2\u0128\u0126\3\2\2"+
		"\2\u0128\u0129\3\2\2\2\u0129?\3\2\2\2\u012a\u0128\3\2\2\2\u012b\u012d"+
		"\t\3\2\2\u012c\u012b\3\2\2\2\u012c\u012d\3\2\2\2\u012d\u012e\3\2\2\2\u012e"+
		"\u012f\5B\"\2\u012fA\3\2\2\2\u0130\u013a\5&\24\2\u0131\u0132\7\32\2\2"+
		"\u0132\u0133\5:\36\2\u0133\u0134\7\31\2\2\u0134\u013a\3\2\2\2\u0135\u013a"+
		"\5F$\2\u0136\u013a\5\16\b\2\u0137\u0138\7#\2\2\u0138\u013a\5B\"\2\u0139"+
		"\u0130\3\2\2\2\u0139\u0131\3\2\2\2\u0139\u0135\3\2\2\2\u0139\u0136\3\2"+
		"\2\2\u0139\u0137\3\2\2\2\u013aC\3\2\2\2\u013b\u0140\5H%\2\u013c\u013d"+
		"\7\37\2\2\u013d\u013f\5H%\2\u013e\u013c\3\2\2\2\u013f\u0142\3\2\2\2\u0140"+
		"\u013e\3\2\2\2\u0140\u0141\3\2\2\2\u0141E\3\2\2\2\u0142\u0140\3\2\2\2"+
		"\u0143\u0144\5\n\6\2\u0144\u0146\7\31\2\2\u0145\u0147\5D#\2\u0146\u0145"+
		"\3\2\2\2\u0146\u0147\3\2\2\2\u0147\u0148\3\2\2\2\u0148\u0149\7\32\2\2"+
		"\u0149G\3\2\2\2\u014a\u014b\5:\36\2\u014bI\3\2\2\2\35SU^is\177\u0086\u008f"+
		"\u009e\u00ab\u00b2\u00ba\u00c3\u00cc\u00d6\u00e8\u00f1\u0103\u010b\u0111"+
		"\u0118\u0120\u0128\u012c\u0139\u0140\u0146";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}