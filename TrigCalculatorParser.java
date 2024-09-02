// Generated from TrigCalculator.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class TrigCalculatorParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		NUMERO=1, ADD=2, SUB=3, MUL=4, DIV=5, POW=6, EQUAL=7, LPAREN=8, RPAREN=9, 
		SIN=10, COS=11, TAN=12, WS=13;
	public static final int
		RULE_inicio = 0, RULE_printExpr = 1, RULE_expresion = 2, RULE_termino = 3, 
		RULE_factor = 4, RULE_base = 5, RULE_trigFunc = 6;
	private static String[] makeRuleNames() {
		return new String[] {
			"inicio", "printExpr", "expresion", "termino", "factor", "base", "trigFunc"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, "'+'", "'-'", "'*'", "'/'", "'^'", "'='", "'('", "')'", "'sin'", 
			"'cos'", "'tan'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "NUMERO", "ADD", "SUB", "MUL", "DIV", "POW", "EQUAL", "LPAREN", 
			"RPAREN", "SIN", "COS", "TAN", "WS"
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
	public String getGrammarFileName() { return "TrigCalculator.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public TrigCalculatorParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class InicioContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(TrigCalculatorParser.EOF, 0); }
		public List<PrintExprContext> printExpr() {
			return getRuleContexts(PrintExprContext.class);
		}
		public PrintExprContext printExpr(int i) {
			return getRuleContext(PrintExprContext.class,i);
		}
		public InicioContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inicio; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrigCalculatorVisitor ) return ((TrigCalculatorVisitor<? extends T>)visitor).visitInicio(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InicioContext inicio() throws RecognitionException {
		InicioContext _localctx = new InicioContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_inicio);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(17);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 7434L) != 0)) {
				{
				{
				setState(14);
				printExpr();
				}
				}
				setState(19);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(20);
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

	@SuppressWarnings("CheckReturnValue")
	public static class PrintExprContext extends ParserRuleContext {
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public PrintExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_printExpr; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrigCalculatorVisitor ) return ((TrigCalculatorVisitor<? extends T>)visitor).visitPrintExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintExprContext printExpr() throws RecognitionException {
		PrintExprContext _localctx = new PrintExprContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_printExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(22);
			expresion();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExpresionContext extends ParserRuleContext {
		public List<TerminoContext> termino() {
			return getRuleContexts(TerminoContext.class);
		}
		public TerminoContext termino(int i) {
			return getRuleContext(TerminoContext.class,i);
		}
		public List<TerminalNode> ADD() { return getTokens(TrigCalculatorParser.ADD); }
		public TerminalNode ADD(int i) {
			return getToken(TrigCalculatorParser.ADD, i);
		}
		public List<TerminalNode> SUB() { return getTokens(TrigCalculatorParser.SUB); }
		public TerminalNode SUB(int i) {
			return getToken(TrigCalculatorParser.SUB, i);
		}
		public ExpresionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expresion; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrigCalculatorVisitor ) return ((TrigCalculatorVisitor<? extends T>)visitor).visitExpresion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpresionContext expresion() throws RecognitionException {
		ExpresionContext _localctx = new ExpresionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_expresion);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(24);
			termino();
			setState(29);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(25);
					_la = _input.LA(1);
					if ( !(_la==ADD || _la==SUB) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(26);
					termino();
					}
					} 
				}
				setState(31);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class TerminoContext extends ParserRuleContext {
		public List<FactorContext> factor() {
			return getRuleContexts(FactorContext.class);
		}
		public FactorContext factor(int i) {
			return getRuleContext(FactorContext.class,i);
		}
		public List<TerminalNode> MUL() { return getTokens(TrigCalculatorParser.MUL); }
		public TerminalNode MUL(int i) {
			return getToken(TrigCalculatorParser.MUL, i);
		}
		public List<TerminalNode> DIV() { return getTokens(TrigCalculatorParser.DIV); }
		public TerminalNode DIV(int i) {
			return getToken(TrigCalculatorParser.DIV, i);
		}
		public TerminoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_termino; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrigCalculatorVisitor ) return ((TrigCalculatorVisitor<? extends T>)visitor).visitTermino(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TerminoContext termino() throws RecognitionException {
		TerminoContext _localctx = new TerminoContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_termino);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(32);
			factor();
			setState(37);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MUL || _la==DIV) {
				{
				{
				setState(33);
				_la = _input.LA(1);
				if ( !(_la==MUL || _la==DIV) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(34);
				factor();
				}
				}
				setState(39);
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

	@SuppressWarnings("CheckReturnValue")
	public static class FactorContext extends ParserRuleContext {
		public BaseContext base() {
			return getRuleContext(BaseContext.class,0);
		}
		public TerminalNode SUB() { return getToken(TrigCalculatorParser.SUB, 0); }
		public TerminalNode POW() { return getToken(TrigCalculatorParser.POW, 0); }
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public FactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrigCalculatorVisitor ) return ((TrigCalculatorVisitor<? extends T>)visitor).visitFactor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_factor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(41);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SUB) {
				{
				setState(40);
				match(SUB);
				}
			}

			setState(43);
			base();
			setState(46);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==POW) {
				{
				setState(44);
				match(POW);
				setState(45);
				factor();
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

	@SuppressWarnings("CheckReturnValue")
	public static class BaseContext extends ParserRuleContext {
		public TerminalNode NUMERO() { return getToken(TrigCalculatorParser.NUMERO, 0); }
		public TerminalNode LPAREN() { return getToken(TrigCalculatorParser.LPAREN, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(TrigCalculatorParser.RPAREN, 0); }
		public TrigFuncContext trigFunc() {
			return getRuleContext(TrigFuncContext.class,0);
		}
		public BaseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_base; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrigCalculatorVisitor ) return ((TrigCalculatorVisitor<? extends T>)visitor).visitBase(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BaseContext base() throws RecognitionException {
		BaseContext _localctx = new BaseContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_base);
		try {
			setState(54);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMERO:
				enterOuterAlt(_localctx, 1);
				{
				setState(48);
				match(NUMERO);
				}
				break;
			case LPAREN:
				enterOuterAlt(_localctx, 2);
				{
				setState(49);
				match(LPAREN);
				setState(50);
				expresion();
				setState(51);
				match(RPAREN);
				}
				break;
			case SIN:
			case COS:
			case TAN:
				enterOuterAlt(_localctx, 3);
				{
				setState(53);
				trigFunc();
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

	@SuppressWarnings("CheckReturnValue")
	public static class TrigFuncContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(TrigCalculatorParser.LPAREN, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(TrigCalculatorParser.RPAREN, 0); }
		public TerminalNode SIN() { return getToken(TrigCalculatorParser.SIN, 0); }
		public TerminalNode COS() { return getToken(TrigCalculatorParser.COS, 0); }
		public TerminalNode TAN() { return getToken(TrigCalculatorParser.TAN, 0); }
		public TrigFuncContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_trigFunc; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrigCalculatorVisitor ) return ((TrigCalculatorVisitor<? extends T>)visitor).visitTrigFunc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TrigFuncContext trigFunc() throws RecognitionException {
		TrigFuncContext _localctx = new TrigFuncContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_trigFunc);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(56);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 7168L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(57);
			match(LPAREN);
			setState(58);
			expresion();
			setState(59);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
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
		"\u0004\u0001\r>\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0001\u0000\u0005\u0000\u0010"+
		"\b\u0000\n\u0000\f\u0000\u0013\t\u0000\u0001\u0000\u0001\u0000\u0001\u0001"+
		"\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0005\u0002\u001c\b\u0002"+
		"\n\u0002\f\u0002\u001f\t\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0005"+
		"\u0003$\b\u0003\n\u0003\f\u0003\'\t\u0003\u0001\u0004\u0003\u0004*\b\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004/\b\u0004\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005"+
		"7\b\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0000\u0000\u0007\u0000\u0002\u0004\u0006\b\n\f\u0000\u0003"+
		"\u0001\u0000\u0002\u0003\u0001\u0000\u0004\u0005\u0001\u0000\n\f=\u0000"+
		"\u0011\u0001\u0000\u0000\u0000\u0002\u0016\u0001\u0000\u0000\u0000\u0004"+
		"\u0018\u0001\u0000\u0000\u0000\u0006 \u0001\u0000\u0000\u0000\b)\u0001"+
		"\u0000\u0000\u0000\n6\u0001\u0000\u0000\u0000\f8\u0001\u0000\u0000\u0000"+
		"\u000e\u0010\u0003\u0002\u0001\u0000\u000f\u000e\u0001\u0000\u0000\u0000"+
		"\u0010\u0013\u0001\u0000\u0000\u0000\u0011\u000f\u0001\u0000\u0000\u0000"+
		"\u0011\u0012\u0001\u0000\u0000\u0000\u0012\u0014\u0001\u0000\u0000\u0000"+
		"\u0013\u0011\u0001\u0000\u0000\u0000\u0014\u0015\u0005\u0000\u0000\u0001"+
		"\u0015\u0001\u0001\u0000\u0000\u0000\u0016\u0017\u0003\u0004\u0002\u0000"+
		"\u0017\u0003\u0001\u0000\u0000\u0000\u0018\u001d\u0003\u0006\u0003\u0000"+
		"\u0019\u001a\u0007\u0000\u0000\u0000\u001a\u001c\u0003\u0006\u0003\u0000"+
		"\u001b\u0019\u0001\u0000\u0000\u0000\u001c\u001f\u0001\u0000\u0000\u0000"+
		"\u001d\u001b\u0001\u0000\u0000\u0000\u001d\u001e\u0001\u0000\u0000\u0000"+
		"\u001e\u0005\u0001\u0000\u0000\u0000\u001f\u001d\u0001\u0000\u0000\u0000"+
		" %\u0003\b\u0004\u0000!\"\u0007\u0001\u0000\u0000\"$\u0003\b\u0004\u0000"+
		"#!\u0001\u0000\u0000\u0000$\'\u0001\u0000\u0000\u0000%#\u0001\u0000\u0000"+
		"\u0000%&\u0001\u0000\u0000\u0000&\u0007\u0001\u0000\u0000\u0000\'%\u0001"+
		"\u0000\u0000\u0000(*\u0005\u0003\u0000\u0000)(\u0001\u0000\u0000\u0000"+
		")*\u0001\u0000\u0000\u0000*+\u0001\u0000\u0000\u0000+.\u0003\n\u0005\u0000"+
		",-\u0005\u0006\u0000\u0000-/\u0003\b\u0004\u0000.,\u0001\u0000\u0000\u0000"+
		"./\u0001\u0000\u0000\u0000/\t\u0001\u0000\u0000\u000007\u0005\u0001\u0000"+
		"\u000012\u0005\b\u0000\u000023\u0003\u0004\u0002\u000034\u0005\t\u0000"+
		"\u000047\u0001\u0000\u0000\u000057\u0003\f\u0006\u000060\u0001\u0000\u0000"+
		"\u000061\u0001\u0000\u0000\u000065\u0001\u0000\u0000\u00007\u000b\u0001"+
		"\u0000\u0000\u000089\u0007\u0002\u0000\u00009:\u0005\b\u0000\u0000:;\u0003"+
		"\u0004\u0002\u0000;<\u0005\t\u0000\u0000<\r\u0001\u0000\u0000\u0000\u0006"+
		"\u0011\u001d%).6";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}