// Generated from C:/Users/CRhod_000/IdeaProjects/FormaleSprachen/Aufgabe4/src/main/java/de/thl/fs/actions\Actions.g4 by ANTLR 4.7
package de.thl.fs.actions;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;

import java.util.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ActionsParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, ID=17, 
		INT=18, NEWLINE=19, WS=20;
	public static final int
		RULE_prog = 0, RULE_stat = 1, RULE_expr = 2;
	public static final String[] ruleNames = {
		"prog", "stat", "expr"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'='", "'^'", "'*'", "'/'", "'+'", "'-'", "'=='", "'<'", "'>'", 
		"'?'", "':'", "'if('", "')'", "' '", "'else'", "'('"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, "ID", "INT", "NEWLINE", "WS"
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
	public String getGrammarFileName() { return "Actions.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


	    Map<String, Integer> memory = new HashMap<String, Integer>();

	    int eval(int left, int op, int right) {
	        switch ( op ) {
	        case 4 : return left + right;
	        case 5 : return left - right;
	        case 2 : return left * right;
	        case 3 : return left / right;
	    }
	    return 0;
	  }

	public ActionsParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgContext extends ParserRuleContext {
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ActionsListener ) ((ActionsListener)listener).enterProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ActionsListener ) ((ActionsListener)listener).exitProg(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(7); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(6);
				stat();
				}
				}
				setState(9); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__11) | (1L << T__15) | (1L << ID) | (1L << INT) | (1L << NEWLINE))) != 0) );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatContext extends ParserRuleContext {
		public ExprContext expr;
		public Token ID;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode ID() { return getToken(ActionsParser.ID, 0); }
		public TerminalNode NEWLINE() { return getToken(ActionsParser.NEWLINE, 0); }
		public StatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ActionsListener ) ((ActionsListener)listener).enterStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ActionsListener ) ((ActionsListener)listener).exitStat(this);
		}
	}

	public final StatContext stat() throws RecognitionException {
		StatContext _localctx = new StatContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_stat);
		try {
			setState(21);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(11);
				((StatContext)_localctx).expr = expr(0);
				System.out.println(((StatContext)_localctx).expr.value);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(14);
				((StatContext)_localctx).ID = match(ID);
				setState(15);
				match(T__0);
				setState(16);
				((StatContext)_localctx).expr = expr(0);
				setState(17);
				match(NEWLINE);
				memory.put((((StatContext)_localctx).ID!=null?((StatContext)_localctx).ID.getText():null), ((StatContext)_localctx).expr.value);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(20);
				match(NEWLINE);
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

	public static class ExprContext extends ParserRuleContext {
		public int value;
		public ExprContext a;
		public ExprContext expr;
		public ExprContext b;
		public ExprContext c;
		public Token INT;
		public Token ID;
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode INT() { return getToken(ActionsParser.INT, 0); }
		public TerminalNode ID() { return getToken(ActionsParser.ID, 0); }
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ActionsListener ) ((ActionsListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ActionsListener ) ((ActionsListener)listener).exitExpr(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 4;
		enterRecursionRule(_localctx, 4, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(42);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__11:
				{
				setState(24);
				match(T__11);
				setState(25);
				((ExprContext)_localctx).a = ((ExprContext)_localctx).expr = expr(0);
				setState(26);
				match(T__12);
				setState(27);
				((ExprContext)_localctx).b = ((ExprContext)_localctx).expr = expr(0);
				setState(28);
				match(T__13);
				setState(29);
				match(T__14);
				setState(30);
				((ExprContext)_localctx).c = ((ExprContext)_localctx).expr = expr(4);
				((ExprContext)_localctx).value = ((ExprContext)_localctx).a.value == 1? ((ExprContext)_localctx).b.value : ((ExprContext)_localctx).c.value;
				}
				break;
			case INT:
				{
				setState(33);
				((ExprContext)_localctx).INT = match(INT);
				((ExprContext)_localctx).value =  (((ExprContext)_localctx).INT!=null?Integer.valueOf(((ExprContext)_localctx).INT.getText()):0);
				}
				break;
			case ID:
				{
				setState(35);
				((ExprContext)_localctx).ID = match(ID);

				            String id = (((ExprContext)_localctx).ID!=null?((ExprContext)_localctx).ID.getText():null);
				            System.out.println("ID ist: " + id);
				            if(id != "clear") {((ExprContext)_localctx).value =  memory.containsKey(id) ? memory.get(id) : 0;}
				             memory = new HashMap<String, Integer>();
				        
				}
				break;
			case T__15:
				{
				setState(37);
				match(T__15);
				setState(38);
				((ExprContext)_localctx).expr = expr(0);
				setState(39);
				match(T__12);
				((ExprContext)_localctx).value =  ((ExprContext)_localctx).expr.value;
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(73);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(71);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.a = _prevctx;
						_localctx.a = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(44);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(45);
						match(T__1);
						setState(46);
						((ExprContext)_localctx).b = ((ExprContext)_localctx).expr = expr(9);
						((ExprContext)_localctx).value =  (int)Math.pow(((ExprContext)_localctx).a.value, ((ExprContext)_localctx).b.value);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.a = _prevctx;
						_localctx.a = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(49);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(50);
						((ExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__2 || _la==T__3) ) {
							((ExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(51);
						((ExprContext)_localctx).b = ((ExprContext)_localctx).expr = expr(9);
						if((((ExprContext)_localctx).op!=null?((ExprContext)_localctx).op.getType():0) == 3)((ExprContext)_localctx).value =  ((ExprContext)_localctx).a.value*((ExprContext)_localctx).b.value;
						                                           else ((ExprContext)_localctx).value =  (int)((ExprContext)_localctx).a.value/((ExprContext)_localctx).b.value;
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.a = _prevctx;
						_localctx.a = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(54);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(55);
						((ExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__4 || _la==T__5) ) {
							((ExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(56);
						((ExprContext)_localctx).b = ((ExprContext)_localctx).expr = expr(8);
						if((((ExprContext)_localctx).op!=null?((ExprContext)_localctx).op.getType():0) == 5)((ExprContext)_localctx).value =  ((ExprContext)_localctx).a.value+((ExprContext)_localctx).b.value;
						                                           else ((ExprContext)_localctx).value =  (int)((ExprContext)_localctx).a.value-((ExprContext)_localctx).b.value;
						}
						break;
					case 4:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.a = _prevctx;
						_localctx.a = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(59);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(60);
						((ExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__7) | (1L << T__8))) != 0)) ) {
							((ExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(61);
						((ExprContext)_localctx).b = ((ExprContext)_localctx).expr = expr(7);
						if((((ExprContext)_localctx).op!=null?((ExprContext)_localctx).op.getType():0) == 7) ((ExprContext)_localctx).value =  ((ExprContext)_localctx).a.value == ((ExprContext)_localctx).b.value ? 1 : 0;
						                                                 else if((((ExprContext)_localctx).op!=null?((ExprContext)_localctx).op.getType():0) == 8) ((ExprContext)_localctx).value =  ((ExprContext)_localctx).a.value < ((ExprContext)_localctx).b.value ? 1 : 0;
						                                                 else ((ExprContext)_localctx).value =  ((ExprContext)_localctx).a.value > ((ExprContext)_localctx).b.value ? 1:0;
						}
						break;
					case 5:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.a = _prevctx;
						_localctx.a = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(64);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(65);
						match(T__9);
						setState(66);
						((ExprContext)_localctx).b = ((ExprContext)_localctx).expr = expr(0);
						setState(67);
						match(T__10);
						setState(68);
						((ExprContext)_localctx).c = ((ExprContext)_localctx).expr = expr(6);
						((ExprContext)_localctx).value =  ((ExprContext)_localctx).a.value == 1 ? ((ExprContext)_localctx).b.value : ((ExprContext)_localctx).c.value;
						}
						break;
					}
					} 
				}
				setState(75);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
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
		case 2:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 9);
		case 1:
			return precpred(_ctx, 8);
		case 2:
			return precpred(_ctx, 7);
		case 3:
			return precpred(_ctx, 6);
		case 4:
			return precpred(_ctx, 5);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\26O\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\3\2\6\2\n\n\2\r\2\16\2\13\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\5\3\30\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\5\4-\n\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\7\4J\n\4\f\4\16\4M\13\4\3\4\2\3\6\5\2\4\6\2\5\3\2\5\6\3\2\7\b\3\2\t"+
		"\13\2V\2\t\3\2\2\2\4\27\3\2\2\2\6,\3\2\2\2\b\n\5\4\3\2\t\b\3\2\2\2\n\13"+
		"\3\2\2\2\13\t\3\2\2\2\13\f\3\2\2\2\f\3\3\2\2\2\r\16\5\6\4\2\16\17\b\3"+
		"\1\2\17\30\3\2\2\2\20\21\7\23\2\2\21\22\7\3\2\2\22\23\5\6\4\2\23\24\7"+
		"\25\2\2\24\25\b\3\1\2\25\30\3\2\2\2\26\30\7\25\2\2\27\r\3\2\2\2\27\20"+
		"\3\2\2\2\27\26\3\2\2\2\30\5\3\2\2\2\31\32\b\4\1\2\32\33\7\16\2\2\33\34"+
		"\5\6\4\2\34\35\7\17\2\2\35\36\5\6\4\2\36\37\7\20\2\2\37 \7\21\2\2 !\5"+
		"\6\4\6!\"\b\4\1\2\"-\3\2\2\2#$\7\24\2\2$-\b\4\1\2%&\7\23\2\2&-\b\4\1\2"+
		"\'(\7\22\2\2()\5\6\4\2)*\7\17\2\2*+\b\4\1\2+-\3\2\2\2,\31\3\2\2\2,#\3"+
		"\2\2\2,%\3\2\2\2,\'\3\2\2\2-K\3\2\2\2./\f\13\2\2/\60\7\4\2\2\60\61\5\6"+
		"\4\13\61\62\b\4\1\2\62J\3\2\2\2\63\64\f\n\2\2\64\65\t\2\2\2\65\66\5\6"+
		"\4\13\66\67\b\4\1\2\67J\3\2\2\289\f\t\2\29:\t\3\2\2:;\5\6\4\n;<\b\4\1"+
		"\2<J\3\2\2\2=>\f\b\2\2>?\t\4\2\2?@\5\6\4\t@A\b\4\1\2AJ\3\2\2\2BC\f\7\2"+
		"\2CD\7\f\2\2DE\5\6\4\2EF\7\r\2\2FG\5\6\4\bGH\b\4\1\2HJ\3\2\2\2I.\3\2\2"+
		"\2I\63\3\2\2\2I8\3\2\2\2I=\3\2\2\2IB\3\2\2\2JM\3\2\2\2KI\3\2\2\2KL\3\2"+
		"\2\2L\7\3\2\2\2MK\3\2\2\2\7\13\27,IK";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}