// Generated from C:/Users/Maria-Theresa/IdeaProjects/SPO\SpoGrammar.g4 by ANTLR 4.7.2
package gen;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SpoGrammarParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		Plus=1, Lparen=2, Rparen=3, FI=4, OD=5, IF=6, Semi=7, While=8, Begin=9, 
		End=10, Else=11, DO=12, Assign=13, NUM=14, ID=15, WS=16;
	public static final int
		RULE_start = 0, RULE_stmt = 1, RULE_stmts = 2, RULE_e = 3, RULE_t = 4;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "stmt", "stmts", "e", "t"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'+'", "'('", "')'", "'fi'", "'od'", "'if'", "';'", "'while'", 
			"'{'", "'}'", "'else'", "'do'", "'='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "Plus", "Lparen", "Rparen", "FI", "OD", "IF", "Semi", "While", 
			"Begin", "End", "Else", "DO", "Assign", "NUM", "ID", "WS"
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
	public String getGrammarFileName() { return "SpoGrammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public SpoGrammarParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class StartContext extends ParserRuleContext {
		public StmtContext stmt() {
			return getRuleContext(StmtContext.class,0);
		}
		public TerminalNode EOF() { return getToken(SpoGrammarParser.EOF, 0); }
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SpoGrammarListener ) ((SpoGrammarListener)listener).enterStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SpoGrammarListener ) ((SpoGrammarListener)listener).exitStart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SpoGrammarVisitor ) return ((SpoGrammarVisitor<? extends T>)visitor).visitStart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(10);
			stmt();
			setState(11);
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

	public static class StmtContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(SpoGrammarParser.ID, 0); }
		public TerminalNode Assign() { return getToken(SpoGrammarParser.Assign, 0); }
		public EContext e() {
			return getRuleContext(EContext.class,0);
		}
		public TerminalNode IF() { return getToken(SpoGrammarParser.IF, 0); }
		public TerminalNode Lparen() { return getToken(SpoGrammarParser.Lparen, 0); }
		public TerminalNode Rparen() { return getToken(SpoGrammarParser.Rparen, 0); }
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public TerminalNode Else() { return getToken(SpoGrammarParser.Else, 0); }
		public TerminalNode FI() { return getToken(SpoGrammarParser.FI, 0); }
		public TerminalNode While() { return getToken(SpoGrammarParser.While, 0); }
		public TerminalNode DO() { return getToken(SpoGrammarParser.DO, 0); }
		public TerminalNode OD() { return getToken(SpoGrammarParser.OD, 0); }
		public TerminalNode Begin() { return getToken(SpoGrammarParser.Begin, 0); }
		public StmtsContext stmts() {
			return getRuleContext(StmtsContext.class,0);
		}
		public TerminalNode End() { return getToken(SpoGrammarParser.End, 0); }
		public StmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SpoGrammarListener ) ((SpoGrammarListener)listener).enterStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SpoGrammarListener ) ((SpoGrammarListener)listener).exitStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SpoGrammarVisitor ) return ((SpoGrammarVisitor<? extends T>)visitor).visitStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StmtContext stmt() throws RecognitionException {
		StmtContext _localctx = new StmtContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_stmt);
		try {
			setState(44);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(13);
				match(ID);
				setState(14);
				match(Assign);
				setState(15);
				e(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(16);
				match(IF);
				setState(17);
				match(Lparen);
				setState(18);
				e(0);
				setState(19);
				match(Rparen);
				setState(20);
				stmt();
				setState(21);
				match(Else);
				setState(22);
				stmt();
				setState(23);
				match(FI);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(25);
				match(IF);
				setState(26);
				match(Lparen);
				setState(27);
				e(0);
				setState(28);
				match(Rparen);
				setState(29);
				stmt();
				setState(30);
				match(FI);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(32);
				match(While);
				setState(33);
				match(Lparen);
				setState(34);
				e(0);
				setState(35);
				match(Rparen);
				setState(36);
				match(DO);
				setState(37);
				stmt();
				setState(38);
				match(OD);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(40);
				match(Begin);
				setState(41);
				stmts(0);
				setState(42);
				match(End);
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

	public static class StmtsContext extends ParserRuleContext {
		public StmtContext stmt() {
			return getRuleContext(StmtContext.class,0);
		}
		public StmtsContext stmts() {
			return getRuleContext(StmtsContext.class,0);
		}
		public TerminalNode Semi() { return getToken(SpoGrammarParser.Semi, 0); }
		public StmtsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmts; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SpoGrammarListener ) ((SpoGrammarListener)listener).enterStmts(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SpoGrammarListener ) ((SpoGrammarListener)listener).exitStmts(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SpoGrammarVisitor ) return ((SpoGrammarVisitor<? extends T>)visitor).visitStmts(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StmtsContext stmts() throws RecognitionException {
		return stmts(0);
	}

	private StmtsContext stmts(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		StmtsContext _localctx = new StmtsContext(_ctx, _parentState);
		StmtsContext _prevctx = _localctx;
		int _startState = 4;
		enterRecursionRule(_localctx, 4, RULE_stmts, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(47);
			stmt();
			}
			_ctx.stop = _input.LT(-1);
			setState(54);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new StmtsContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_stmts);
					setState(49);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(50);
					match(Semi);
					setState(51);
					stmt();
					}
					} 
				}
				setState(56);
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
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class EContext extends ParserRuleContext {
		public TContext t() {
			return getRuleContext(TContext.class,0);
		}
		public EContext e() {
			return getRuleContext(EContext.class,0);
		}
		public TerminalNode Plus() { return getToken(SpoGrammarParser.Plus, 0); }
		public EContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_e; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SpoGrammarListener ) ((SpoGrammarListener)listener).enterE(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SpoGrammarListener ) ((SpoGrammarListener)listener).exitE(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SpoGrammarVisitor ) return ((SpoGrammarVisitor<? extends T>)visitor).visitE(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EContext e() throws RecognitionException {
		return e(0);
	}

	private EContext e(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		EContext _localctx = new EContext(_ctx, _parentState);
		EContext _prevctx = _localctx;
		int _startState = 6;
		enterRecursionRule(_localctx, 6, RULE_e, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(58);
			t();
			}
			_ctx.stop = _input.LT(-1);
			setState(65);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new EContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_e);
					setState(60);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(61);
					match(Plus);
					setState(62);
					t();
					}
					} 
				}
				setState(67);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
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

	public static class TContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(SpoGrammarParser.ID, 0); }
		public TerminalNode NUM() { return getToken(SpoGrammarParser.NUM, 0); }
		public TContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_t; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SpoGrammarListener ) ((SpoGrammarListener)listener).enterT(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SpoGrammarListener ) ((SpoGrammarListener)listener).exitT(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SpoGrammarVisitor ) return ((SpoGrammarVisitor<? extends T>)visitor).visitT(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TContext t() throws RecognitionException {
		TContext _localctx = new TContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_t);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(68);
			_la = _input.LA(1);
			if ( !(_la==NUM || _la==ID) ) {
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 2:
			return stmts_sempred((StmtsContext)_localctx, predIndex);
		case 3:
			return e_sempred((EContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean stmts_sempred(StmtsContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean e_sempred(EContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\22I\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\5\3/\n\3\3\4\3\4\3\4\3\4\3\4\3\4\7\4\67\n\4\f\4"+
		"\16\4:\13\4\3\5\3\5\3\5\3\5\3\5\3\5\7\5B\n\5\f\5\16\5E\13\5\3\6\3\6\3"+
		"\6\2\4\6\b\7\2\4\6\b\n\2\3\3\2\20\21\2I\2\f\3\2\2\2\4.\3\2\2\2\6\60\3"+
		"\2\2\2\b;\3\2\2\2\nF\3\2\2\2\f\r\5\4\3\2\r\16\7\2\2\3\16\3\3\2\2\2\17"+
		"\20\7\21\2\2\20\21\7\17\2\2\21/\5\b\5\2\22\23\7\b\2\2\23\24\7\4\2\2\24"+
		"\25\5\b\5\2\25\26\7\5\2\2\26\27\5\4\3\2\27\30\7\r\2\2\30\31\5\4\3\2\31"+
		"\32\7\6\2\2\32/\3\2\2\2\33\34\7\b\2\2\34\35\7\4\2\2\35\36\5\b\5\2\36\37"+
		"\7\5\2\2\37 \5\4\3\2 !\7\6\2\2!/\3\2\2\2\"#\7\n\2\2#$\7\4\2\2$%\5\b\5"+
		"\2%&\7\5\2\2&\'\7\16\2\2\'(\5\4\3\2()\7\7\2\2)/\3\2\2\2*+\7\13\2\2+,\5"+
		"\6\4\2,-\7\f\2\2-/\3\2\2\2.\17\3\2\2\2.\22\3\2\2\2.\33\3\2\2\2.\"\3\2"+
		"\2\2.*\3\2\2\2/\5\3\2\2\2\60\61\b\4\1\2\61\62\5\4\3\2\628\3\2\2\2\63\64"+
		"\f\4\2\2\64\65\7\t\2\2\65\67\5\4\3\2\66\63\3\2\2\2\67:\3\2\2\28\66\3\2"+
		"\2\289\3\2\2\29\7\3\2\2\2:8\3\2\2\2;<\b\5\1\2<=\5\n\6\2=C\3\2\2\2>?\f"+
		"\4\2\2?@\7\3\2\2@B\5\n\6\2A>\3\2\2\2BE\3\2\2\2CA\3\2\2\2CD\3\2\2\2D\t"+
		"\3\2\2\2EC\3\2\2\2FG\t\2\2\2G\13\3\2\2\2\5.8C";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}