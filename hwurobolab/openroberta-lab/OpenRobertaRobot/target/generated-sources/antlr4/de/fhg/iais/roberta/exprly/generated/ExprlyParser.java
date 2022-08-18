// Generated from de/fhg/iais/roberta/exprly/generated/Exprly.g4 by ANTLR 4.7.2
package de.fhg.iais.roberta.exprly.generated;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ExprlyParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, NEWLINE=11, WS=12, FNAME=13, CONST=14, NULL=15, INT=16, FLOAT=17, 
		BOOL=18, COLOR=19, HEX=20, VAR=21, STR=22, AND=23, OR=24, NOT=25, EQUAL=26, 
		NEQUAL=27, GET=28, LET=29, GEQ=30, LEQ=31, MOD=32, POW=33, MUL=34, DIV=35, 
		ADD=36, SUB=37;
	public static final int
		RULE_expression = 0, RULE_expr = 1, RULE_literal = 2, RULE_connExpr = 3, 
		RULE_funCall = 4;
	private static String[] makeRuleNames() {
		return new String[] {
			"expression", "expr", "literal", "connExpr", "funCall"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "')'", "'?'", "':'", "'\"'", "'.'", "'['", "','", "']'", 
			"'connect'", null, null, null, null, "'null'", null, null, null, null, 
			null, null, null, "'&&'", "'||'", "'!'", "'=='", "'!='", "'>'", "'<'", 
			"'>='", "'<='", "'%'", "'^'", "'*'", "'/'", "'+'", "'-'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, "NEWLINE", 
			"WS", "FNAME", "CONST", "NULL", "INT", "FLOAT", "BOOL", "COLOR", "HEX", 
			"VAR", "STR", "AND", "OR", "NOT", "EQUAL", "NEQUAL", "GET", "LET", "GEQ", 
			"LEQ", "MOD", "POW", "MUL", "DIV", "ADD", "SUB"
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
	public String getGrammarFileName() { return "Exprly.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ExprlyParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ExpressionContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode EOF() { return getToken(ExprlyParser.EOF, 0); }
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprlyListener ) ((ExprlyListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprlyListener ) ((ExprlyListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprlyVisitor ) return ((ExprlyVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(10);
			expr(0);
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

	public static class ExprContext extends ParserRuleContext {
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	 
		public ExprContext() { }
		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class LiteralExpContext extends ExprContext {
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public LiteralExpContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprlyListener ) ((ExprlyListener)listener).enterLiteralExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprlyListener ) ((ExprlyListener)listener).exitLiteralExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprlyVisitor ) return ((ExprlyVisitor<? extends T>)visitor).visitLiteralExp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IfElseOpContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public IfElseOpContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprlyListener ) ((ExprlyListener)listener).enterIfElseOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprlyListener ) ((ExprlyListener)listener).exitIfElseOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprlyVisitor ) return ((ExprlyVisitor<? extends T>)visitor).visitIfElseOp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UnaryBContext extends ExprContext {
		public Token op;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode NOT() { return getToken(ExprlyParser.NOT, 0); }
		public UnaryBContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprlyListener ) ((ExprlyListener)listener).enterUnaryB(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprlyListener ) ((ExprlyListener)listener).exitUnaryB(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprlyVisitor ) return ((ExprlyVisitor<? extends T>)visitor).visitUnaryB(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BinaryBContext extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode AND() { return getToken(ExprlyParser.AND, 0); }
		public TerminalNode OR() { return getToken(ExprlyParser.OR, 0); }
		public TerminalNode EQUAL() { return getToken(ExprlyParser.EQUAL, 0); }
		public TerminalNode NEQUAL() { return getToken(ExprlyParser.NEQUAL, 0); }
		public TerminalNode GET() { return getToken(ExprlyParser.GET, 0); }
		public TerminalNode LET() { return getToken(ExprlyParser.LET, 0); }
		public TerminalNode GEQ() { return getToken(ExprlyParser.GEQ, 0); }
		public TerminalNode LEQ() { return getToken(ExprlyParser.LEQ, 0); }
		public BinaryBContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprlyListener ) ((ExprlyListener)listener).enterBinaryB(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprlyListener ) ((ExprlyListener)listener).exitBinaryB(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprlyVisitor ) return ((ExprlyVisitor<? extends T>)visitor).visitBinaryB(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UnaryNContext extends ExprContext {
		public Token op;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode ADD() { return getToken(ExprlyParser.ADD, 0); }
		public TerminalNode SUB() { return getToken(ExprlyParser.SUB, 0); }
		public UnaryNContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprlyListener ) ((ExprlyListener)listener).enterUnaryN(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprlyListener ) ((ExprlyListener)listener).exitUnaryN(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprlyVisitor ) return ((ExprlyVisitor<? extends T>)visitor).visitUnaryN(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BinaryNContext extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode POW() { return getToken(ExprlyParser.POW, 0); }
		public TerminalNode MOD() { return getToken(ExprlyParser.MOD, 0); }
		public TerminalNode MUL() { return getToken(ExprlyParser.MUL, 0); }
		public TerminalNode DIV() { return getToken(ExprlyParser.DIV, 0); }
		public TerminalNode ADD() { return getToken(ExprlyParser.ADD, 0); }
		public TerminalNode SUB() { return getToken(ExprlyParser.SUB, 0); }
		public BinaryNContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprlyListener ) ((ExprlyListener)listener).enterBinaryN(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprlyListener ) ((ExprlyListener)listener).exitBinaryN(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprlyVisitor ) return ((ExprlyVisitor<? extends T>)visitor).visitBinaryN(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VarNameContext extends ExprContext {
		public TerminalNode VAR() { return getToken(ExprlyParser.VAR, 0); }
		public VarNameContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprlyListener ) ((ExprlyListener)listener).enterVarName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprlyListener ) ((ExprlyListener)listener).exitVarName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprlyVisitor ) return ((ExprlyVisitor<? extends T>)visitor).visitVarName(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ParentheseContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ParentheseContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprlyListener ) ((ExprlyListener)listener).enterParenthese(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprlyListener ) ((ExprlyListener)listener).exitParenthese(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprlyVisitor ) return ((ExprlyVisitor<? extends T>)visitor).visitParenthese(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MathConstContext extends ExprContext {
		public TerminalNode CONST() { return getToken(ExprlyParser.CONST, 0); }
		public MathConstContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprlyListener ) ((ExprlyListener)listener).enterMathConst(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprlyListener ) ((ExprlyListener)listener).exitMathConst(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprlyVisitor ) return ((ExprlyVisitor<? extends T>)visitor).visitMathConst(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ConnExpContext extends ExprContext {
		public ConnExprContext connExpr() {
			return getRuleContext(ConnExprContext.class,0);
		}
		public ConnExpContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprlyListener ) ((ExprlyListener)listener).enterConnExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprlyListener ) ((ExprlyListener)listener).exitConnExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprlyVisitor ) return ((ExprlyVisitor<? extends T>)visitor).visitConnExp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FuncExpContext extends ExprContext {
		public FunCallContext funCall() {
			return getRuleContext(FunCallContext.class,0);
		}
		public FuncExpContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprlyListener ) ((ExprlyListener)listener).enterFuncExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprlyListener ) ((ExprlyListener)listener).exitFuncExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprlyVisitor ) return ((ExprlyVisitor<? extends T>)visitor).visitFuncExp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NullConstContext extends ExprContext {
		public TerminalNode NULL() { return getToken(ExprlyParser.NULL, 0); }
		public NullConstContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprlyListener ) ((ExprlyListener)listener).enterNullConst(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprlyListener ) ((ExprlyListener)listener).exitNullConst(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprlyVisitor ) return ((ExprlyVisitor<? extends T>)visitor).visitNullConst(this);
			else return visitor.visitChildren(this);
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
		int _startState = 2;
		enterRecursionRule(_localctx, 2, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(28);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NULL:
				{
				_localctx = new NullConstContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(14);
				match(NULL);
				}
				break;
			case CONST:
				{
				_localctx = new MathConstContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(15);
				match(CONST);
				}
				break;
			case VAR:
				{
				_localctx = new VarNameContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(16);
				match(VAR);
				}
				break;
			case T__4:
			case T__6:
			case INT:
			case FLOAT:
			case BOOL:
			case COLOR:
				{
				_localctx = new LiteralExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(17);
				literal();
				}
				break;
			case T__9:
				{
				_localctx = new ConnExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(18);
				connExpr();
				}
				break;
			case FNAME:
				{
				_localctx = new FuncExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(19);
				funCall();
				}
				break;
			case T__0:
				{
				_localctx = new ParentheseContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(20);
				match(T__0);
				setState(21);
				expr(0);
				setState(22);
				match(T__1);
				}
				break;
			case ADD:
			case SUB:
				{
				_localctx = new UnaryNContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(24);
				((UnaryNContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==ADD || _la==SUB) ) {
					((UnaryNContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(25);
				expr(15);
				}
				break;
			case NOT:
				{
				_localctx = new UnaryBContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(26);
				((UnaryBContext)_localctx).op = match(NOT);
				setState(27);
				expr(14);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(74);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(72);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
					case 1:
						{
						_localctx = new BinaryNContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(30);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(31);
						((BinaryNContext)_localctx).op = match(POW);
						setState(32);
						expr(13);
						}
						break;
					case 2:
						{
						_localctx = new BinaryNContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(33);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(34);
						((BinaryNContext)_localctx).op = match(MOD);
						setState(35);
						expr(12);
						}
						break;
					case 3:
						{
						_localctx = new BinaryNContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(36);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(37);
						((BinaryNContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==MUL || _la==DIV) ) {
							((BinaryNContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(38);
						expr(12);
						}
						break;
					case 4:
						{
						_localctx = new BinaryNContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(39);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(40);
						((BinaryNContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==ADD || _la==SUB) ) {
							((BinaryNContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(41);
						expr(11);
						}
						break;
					case 5:
						{
						_localctx = new BinaryBContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(42);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(43);
						((BinaryBContext)_localctx).op = match(AND);
						setState(44);
						expr(10);
						}
						break;
					case 6:
						{
						_localctx = new BinaryBContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(45);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(46);
						((BinaryBContext)_localctx).op = match(OR);
						setState(47);
						expr(9);
						}
						break;
					case 7:
						{
						_localctx = new BinaryBContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(48);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(49);
						((BinaryBContext)_localctx).op = match(EQUAL);
						setState(50);
						expr(8);
						}
						break;
					case 8:
						{
						_localctx = new BinaryBContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(51);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(52);
						((BinaryBContext)_localctx).op = match(NEQUAL);
						setState(53);
						expr(7);
						}
						break;
					case 9:
						{
						_localctx = new BinaryBContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(54);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(55);
						((BinaryBContext)_localctx).op = match(GET);
						setState(56);
						expr(6);
						}
						break;
					case 10:
						{
						_localctx = new BinaryBContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(57);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(58);
						((BinaryBContext)_localctx).op = match(LET);
						setState(59);
						expr(5);
						}
						break;
					case 11:
						{
						_localctx = new BinaryBContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(60);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(61);
						((BinaryBContext)_localctx).op = match(GEQ);
						setState(62);
						expr(4);
						}
						break;
					case 12:
						{
						_localctx = new BinaryBContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(63);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(64);
						((BinaryBContext)_localctx).op = match(LEQ);
						setState(65);
						expr(3);
						}
						break;
					case 13:
						{
						_localctx = new IfElseOpContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(66);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(67);
						match(T__2);
						setState(68);
						expr(0);
						setState(69);
						match(T__3);
						setState(70);
						expr(2);
						}
						break;
					}
					} 
				}
				setState(76);
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

	public static class LiteralContext extends ParserRuleContext {
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
	 
		public LiteralContext() { }
		public void copyFrom(LiteralContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ColContext extends LiteralContext {
		public TerminalNode COLOR() { return getToken(ExprlyParser.COLOR, 0); }
		public ColContext(LiteralContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprlyListener ) ((ExprlyListener)listener).enterCol(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprlyListener ) ((ExprlyListener)listener).exitCol(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprlyVisitor ) return ((ExprlyVisitor<? extends T>)visitor).visitCol(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BoolConstBContext extends LiteralContext {
		public TerminalNode BOOL() { return getToken(ExprlyParser.BOOL, 0); }
		public BoolConstBContext(LiteralContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprlyListener ) ((ExprlyListener)listener).enterBoolConstB(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprlyListener ) ((ExprlyListener)listener).exitBoolConstB(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprlyVisitor ) return ((ExprlyVisitor<? extends T>)visitor).visitBoolConstB(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ListExprContext extends LiteralContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ListExprContext(LiteralContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprlyListener ) ((ExprlyListener)listener).enterListExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprlyListener ) ((ExprlyListener)listener).exitListExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprlyVisitor ) return ((ExprlyVisitor<? extends T>)visitor).visitListExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ConstStrContext extends LiteralContext {
		public ConstStrContext(LiteralContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprlyListener ) ((ExprlyListener)listener).enterConstStr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprlyListener ) ((ExprlyListener)listener).exitConstStr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprlyVisitor ) return ((ExprlyVisitor<? extends T>)visitor).visitConstStr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IntConstContext extends LiteralContext {
		public TerminalNode INT() { return getToken(ExprlyParser.INT, 0); }
		public IntConstContext(LiteralContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprlyListener ) ((ExprlyListener)listener).enterIntConst(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprlyListener ) ((ExprlyListener)listener).exitIntConst(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprlyVisitor ) return ((ExprlyVisitor<? extends T>)visitor).visitIntConst(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FloatConstContext extends LiteralContext {
		public TerminalNode FLOAT() { return getToken(ExprlyParser.FLOAT, 0); }
		public FloatConstContext(LiteralContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprlyListener ) ((ExprlyListener)listener).enterFloatConst(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprlyListener ) ((ExprlyListener)listener).exitFloatConst(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprlyVisitor ) return ((ExprlyVisitor<? extends T>)visitor).visitFloatConst(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_literal);
		int _la;
		try {
			int _alt;
			setState(106);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				_localctx = new IntConstContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(77);
				match(INT);
				}
				break;
			case FLOAT:
				_localctx = new FloatConstContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(78);
				match(FLOAT);
				}
				break;
			case BOOL:
				_localctx = new BoolConstBContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(79);
				match(BOOL);
				}
				break;
			case T__4:
				_localctx = new ConstStrContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(80);
				match(T__4);
				setState(89);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
				case 1:
					{
					setState(84);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
					while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1+1 ) {
							{
							{
							setState(81);
							matchWildcard();
							}
							} 
						}
						setState(86);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
					}
					}
					break;
				case 2:
					{
					setState(87);
					match(T__5);
					}
					break;
				case 3:
					{
					setState(88);
					match(T__2);
					}
					break;
				}
				setState(91);
				match(T__4);
				}
				break;
			case COLOR:
				_localctx = new ColContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(92);
				match(COLOR);
				}
				break;
			case T__6:
				_localctx = new ListExprContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(93);
				match(T__6);
				setState(99);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(94);
						expr(0);
						setState(95);
						match(T__7);
						}
						} 
					}
					setState(101);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
				}
				setState(103);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__4) | (1L << T__6) | (1L << T__9) | (1L << FNAME) | (1L << CONST) | (1L << NULL) | (1L << INT) | (1L << FLOAT) | (1L << BOOL) | (1L << COLOR) | (1L << VAR) | (1L << NOT) | (1L << ADD) | (1L << SUB))) != 0)) {
					{
					setState(102);
					expr(0);
					}
				}

				setState(105);
				match(T__8);
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

	public static class ConnExprContext extends ParserRuleContext {
		public ConnExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_connExpr; }
	 
		public ConnExprContext() { }
		public void copyFrom(ConnExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ConnContext extends ConnExprContext {
		public Token op0;
		public Token op1;
		public List<TerminalNode> STR() { return getTokens(ExprlyParser.STR); }
		public TerminalNode STR(int i) {
			return getToken(ExprlyParser.STR, i);
		}
		public List<TerminalNode> VAR() { return getTokens(ExprlyParser.VAR); }
		public TerminalNode VAR(int i) {
			return getToken(ExprlyParser.VAR, i);
		}
		public ConnContext(ConnExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprlyListener ) ((ExprlyListener)listener).enterConn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprlyListener ) ((ExprlyListener)listener).exitConn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprlyVisitor ) return ((ExprlyVisitor<? extends T>)visitor).visitConn(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConnExprContext connExpr() throws RecognitionException {
		ConnExprContext _localctx = new ConnExprContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_connExpr);
		int _la;
		try {
			_localctx = new ConnContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(108);
			match(T__9);
			setState(109);
			((ConnContext)_localctx).op0 = _input.LT(1);
			_la = _input.LA(1);
			if ( !(_la==VAR || _la==STR) ) {
				((ConnContext)_localctx).op0 = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(110);
			match(T__7);
			setState(111);
			((ConnContext)_localctx).op1 = _input.LT(1);
			_la = _input.LA(1);
			if ( !(_la==VAR || _la==STR) ) {
				((ConnContext)_localctx).op1 = (Token)_errHandler.recoverInline(this);
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

	public static class FunCallContext extends ParserRuleContext {
		public FunCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funCall; }
	 
		public FunCallContext() { }
		public void copyFrom(FunCallContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class FuncContext extends FunCallContext {
		public TerminalNode FNAME() { return getToken(ExprlyParser.FNAME, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public FuncContext(FunCallContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprlyListener ) ((ExprlyListener)listener).enterFunc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprlyListener ) ((ExprlyListener)listener).exitFunc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprlyVisitor ) return ((ExprlyVisitor<? extends T>)visitor).visitFunc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunCallContext funCall() throws RecognitionException {
		FunCallContext _localctx = new FunCallContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_funCall);
		int _la;
		try {
			_localctx = new FuncContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(113);
			match(FNAME);
			setState(114);
			match(T__0);
			setState(123);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__4) | (1L << T__6) | (1L << T__9) | (1L << FNAME) | (1L << CONST) | (1L << NULL) | (1L << INT) | (1L << FLOAT) | (1L << BOOL) | (1L << COLOR) | (1L << VAR) | (1L << NOT) | (1L << ADD) | (1L << SUB))) != 0)) {
				{
				setState(115);
				expr(0);
				setState(120);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__7) {
					{
					{
					setState(116);
					match(T__7);
					setState(117);
					expr(0);
					}
					}
					setState(122);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(125);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
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
		case 1:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 13);
		case 1:
			return precpred(_ctx, 12);
		case 2:
			return precpred(_ctx, 11);
		case 3:
			return precpred(_ctx, 10);
		case 4:
			return precpred(_ctx, 9);
		case 5:
			return precpred(_ctx, 8);
		case 6:
			return precpred(_ctx, 7);
		case 7:
			return precpred(_ctx, 6);
		case 8:
			return precpred(_ctx, 5);
		case 9:
			return precpred(_ctx, 4);
		case 10:
			return precpred(_ctx, 3);
		case 11:
			return precpred(_ctx, 2);
		case 12:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\'\u0082\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3\37\n\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\7\3K\n\3\f\3\16\3N\13\3\3\4\3\4\3\4\3\4\3\4\7\4U\n\4\f\4\16\4X\13\4"+
		"\3\4\3\4\5\4\\\n\4\3\4\3\4\3\4\3\4\3\4\3\4\7\4d\n\4\f\4\16\4g\13\4\3\4"+
		"\5\4j\n\4\3\4\5\4m\n\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\7\6y\n"+
		"\6\f\6\16\6|\13\6\5\6~\n\6\3\6\3\6\3\6\3V\3\4\7\2\4\6\b\n\2\5\3\2&\'\3"+
		"\2$%\3\2\27\30\2\u009d\2\f\3\2\2\2\4\36\3\2\2\2\6l\3\2\2\2\bn\3\2\2\2"+
		"\ns\3\2\2\2\f\r\5\4\3\2\r\16\7\2\2\3\16\3\3\2\2\2\17\20\b\3\1\2\20\37"+
		"\7\21\2\2\21\37\7\20\2\2\22\37\7\27\2\2\23\37\5\6\4\2\24\37\5\b\5\2\25"+
		"\37\5\n\6\2\26\27\7\3\2\2\27\30\5\4\3\2\30\31\7\4\2\2\31\37\3\2\2\2\32"+
		"\33\t\2\2\2\33\37\5\4\3\21\34\35\7\33\2\2\35\37\5\4\3\20\36\17\3\2\2\2"+
		"\36\21\3\2\2\2\36\22\3\2\2\2\36\23\3\2\2\2\36\24\3\2\2\2\36\25\3\2\2\2"+
		"\36\26\3\2\2\2\36\32\3\2\2\2\36\34\3\2\2\2\37L\3\2\2\2 !\f\17\2\2!\"\7"+
		"#\2\2\"K\5\4\3\17#$\f\16\2\2$%\7\"\2\2%K\5\4\3\16&\'\f\r\2\2\'(\t\3\2"+
		"\2(K\5\4\3\16)*\f\f\2\2*+\t\2\2\2+K\5\4\3\r,-\f\13\2\2-.\7\31\2\2.K\5"+
		"\4\3\f/\60\f\n\2\2\60\61\7\32\2\2\61K\5\4\3\13\62\63\f\t\2\2\63\64\7\34"+
		"\2\2\64K\5\4\3\n\65\66\f\b\2\2\66\67\7\35\2\2\67K\5\4\3\t89\f\7\2\29:"+
		"\7\36\2\2:K\5\4\3\b;<\f\6\2\2<=\7\37\2\2=K\5\4\3\7>?\f\5\2\2?@\7 \2\2"+
		"@K\5\4\3\6AB\f\4\2\2BC\7!\2\2CK\5\4\3\5DE\f\3\2\2EF\7\5\2\2FG\5\4\3\2"+
		"GH\7\6\2\2HI\5\4\3\4IK\3\2\2\2J \3\2\2\2J#\3\2\2\2J&\3\2\2\2J)\3\2\2\2"+
		"J,\3\2\2\2J/\3\2\2\2J\62\3\2\2\2J\65\3\2\2\2J8\3\2\2\2J;\3\2\2\2J>\3\2"+
		"\2\2JA\3\2\2\2JD\3\2\2\2KN\3\2\2\2LJ\3\2\2\2LM\3\2\2\2M\5\3\2\2\2NL\3"+
		"\2\2\2Om\7\22\2\2Pm\7\23\2\2Qm\7\24\2\2R[\7\7\2\2SU\13\2\2\2TS\3\2\2\2"+
		"UX\3\2\2\2VW\3\2\2\2VT\3\2\2\2W\\\3\2\2\2XV\3\2\2\2Y\\\7\b\2\2Z\\\7\5"+
		"\2\2[V\3\2\2\2[Y\3\2\2\2[Z\3\2\2\2\\]\3\2\2\2]m\7\7\2\2^m\7\25\2\2_e\7"+
		"\t\2\2`a\5\4\3\2ab\7\n\2\2bd\3\2\2\2c`\3\2\2\2dg\3\2\2\2ec\3\2\2\2ef\3"+
		"\2\2\2fi\3\2\2\2ge\3\2\2\2hj\5\4\3\2ih\3\2\2\2ij\3\2\2\2jk\3\2\2\2km\7"+
		"\13\2\2lO\3\2\2\2lP\3\2\2\2lQ\3\2\2\2lR\3\2\2\2l^\3\2\2\2l_\3\2\2\2m\7"+
		"\3\2\2\2no\7\f\2\2op\t\4\2\2pq\7\n\2\2qr\t\4\2\2r\t\3\2\2\2st\7\17\2\2"+
		"t}\7\3\2\2uz\5\4\3\2vw\7\n\2\2wy\5\4\3\2xv\3\2\2\2y|\3\2\2\2zx\3\2\2\2"+
		"z{\3\2\2\2{~\3\2\2\2|z\3\2\2\2}u\3\2\2\2}~\3\2\2\2~\177\3\2\2\2\177\u0080"+
		"\7\4\2\2\u0080\13\3\2\2\2\f\36JLV[eilz}";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}