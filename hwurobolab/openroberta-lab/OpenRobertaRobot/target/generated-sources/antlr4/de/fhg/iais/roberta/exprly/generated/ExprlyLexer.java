// Generated from de/fhg/iais/roberta/exprly/generated/Exprly.g4 by ANTLR 4.7.2
package de.fhg.iais.roberta.exprly.generated;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ExprlyLexer extends Lexer {
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
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "NEWLINE", "WS", "FNAME", "CONST", "NULL", "INT", "FLOAT", "BOOL", 
			"COLOR", "HEX", "VAR", "STR", "AND", "OR", "NOT", "EQUAL", "NEQUAL", 
			"GET", "LET", "GEQ", "LEQ", "MOD", "POW", "MUL", "DIV", "ADD", "SUB"
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


	public ExprlyLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Exprly.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\'\u03c7\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3"+
		"\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\f\5\fi\n\f\3\f\3\f\3\f\3\f\3\r\6\rp\n\r\r\r\16\rq\3\r\3\r\3"+
		"\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u034b\n\16"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u0363\n\17\3\20\3\20\3\20"+
		"\3\20\3\20\3\21\6\21\u036b\n\21\r\21\16\21\u036c\3\22\6\22\u0370\n\22"+
		"\r\22\16\22\u0371\3\22\3\22\7\22\u0376\n\22\f\22\16\22\u0379\13\22\3\22"+
		"\3\22\6\22\u037d\n\22\r\22\16\22\u037e\5\22\u0381\n\22\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u038c\n\23\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\25\3\25\3\26\3\26\7\26\u039a\n\26\f\26\16\26\u039d\13"+
		"\26\3\27\6\27\u03a0\n\27\r\27\16\27\u03a1\3\30\3\30\3\30\3\31\3\31\3\31"+
		"\3\32\3\32\3\33\3\33\3\33\3\34\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37"+
		"\3\37\3 \3 \3 \3!\3!\3\"\3\"\3#\3#\3$\3$\3%\3%\3&\3&\2\2\'\3\3\5\4\7\5"+
		"\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23"+
		"%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G"+
		"%I&K\'\3\2\6\4\2\13\13\"\"\4\2\62;CH\6\2\62;C\\aac|\5\2\62;C\\c|\2\u0419"+
		"\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2"+
		"\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2"+
		"\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2"+
		"\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2"+
		"\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3"+
		"\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2"+
		"\2\2I\3\2\2\2\2K\3\2\2\2\3M\3\2\2\2\5O\3\2\2\2\7Q\3\2\2\2\tS\3\2\2\2\13"+
		"U\3\2\2\2\rW\3\2\2\2\17Y\3\2\2\2\21[\3\2\2\2\23]\3\2\2\2\25_\3\2\2\2\27"+
		"h\3\2\2\2\31o\3\2\2\2\33\u034a\3\2\2\2\35\u0362\3\2\2\2\37\u0364\3\2\2"+
		"\2!\u036a\3\2\2\2#\u0380\3\2\2\2%\u038b\3\2\2\2\'\u038d\3\2\2\2)\u0395"+
		"\3\2\2\2+\u0397\3\2\2\2-\u039f\3\2\2\2/\u03a3\3\2\2\2\61\u03a6\3\2\2\2"+
		"\63\u03a9\3\2\2\2\65\u03ab\3\2\2\2\67\u03ae\3\2\2\29\u03b1\3\2\2\2;\u03b3"+
		"\3\2\2\2=\u03b5\3\2\2\2?\u03b8\3\2\2\2A\u03bb\3\2\2\2C\u03bd\3\2\2\2E"+
		"\u03bf\3\2\2\2G\u03c1\3\2\2\2I\u03c3\3\2\2\2K\u03c5\3\2\2\2MN\7*\2\2N"+
		"\4\3\2\2\2OP\7+\2\2P\6\3\2\2\2QR\7A\2\2R\b\3\2\2\2ST\7<\2\2T\n\3\2\2\2"+
		"UV\7$\2\2V\f\3\2\2\2WX\7\60\2\2X\16\3\2\2\2YZ\7]\2\2Z\20\3\2\2\2[\\\7"+
		".\2\2\\\22\3\2\2\2]^\7_\2\2^\24\3\2\2\2_`\7e\2\2`a\7q\2\2ab\7p\2\2bc\7"+
		"p\2\2cd\7g\2\2de\7e\2\2ef\7v\2\2f\26\3\2\2\2gi\7\17\2\2hg\3\2\2\2hi\3"+
		"\2\2\2ij\3\2\2\2jk\7\f\2\2kl\3\2\2\2lm\b\f\2\2m\30\3\2\2\2np\t\2\2\2o"+
		"n\3\2\2\2pq\3\2\2\2qo\3\2\2\2qr\3\2\2\2rs\3\2\2\2st\b\r\2\2t\32\3\2\2"+
		"\2uv\7u\2\2vw\7k\2\2w\u034b\7p\2\2xy\7e\2\2yz\7q\2\2z\u034b\7u\2\2{|\7"+
		"v\2\2|}\7c\2\2}\u034b\7p\2\2~\177\7c\2\2\177\u0080\7u\2\2\u0080\u0081"+
		"\7k\2\2\u0081\u034b\7p\2\2\u0082\u0083\7c\2\2\u0083\u0084\7e\2\2\u0084"+
		"\u0085\7q\2\2\u0085\u034b\7u\2\2\u0086\u0087\7c\2\2\u0087\u0088\7v\2\2"+
		"\u0088\u0089\7c\2\2\u0089\u034b\7p\2\2\u008a\u008b\7g\2\2\u008b\u008c"+
		"\7z\2\2\u008c\u034b\7r\2\2\u008d\u008e\7u\2\2\u008e\u008f\7s\2\2\u008f"+
		"\u0090\7w\2\2\u0090\u0091\7c\2\2\u0091\u0092\7t\2\2\u0092\u034b\7g\2\2"+
		"\u0093\u0094\7u\2\2\u0094\u0095\7s\2\2\u0095\u0096\7t\2\2\u0096\u034b"+
		"\7v\2\2\u0097\u0098\7c\2\2\u0098\u0099\7d\2\2\u0099\u034b\7u\2\2\u009a"+
		"\u009b\7n\2\2\u009b\u009c\7q\2\2\u009c\u009d\7i\2\2\u009d\u009e\7\63\2"+
		"\2\u009e\u034b\7\62\2\2\u009f\u00a0\7n\2\2\u00a0\u034b\7p\2\2\u00a1\u00a2"+
		"\7t\2\2\u00a2\u00a3\7c\2\2\u00a3\u00a4\7p\2\2\u00a4\u00a5\7f\2\2\u00a5"+
		"\u00a6\7K\2\2\u00a6\u00a7\7p\2\2\u00a7\u034b\7v\2\2\u00a8\u00a9\7t\2\2"+
		"\u00a9\u00aa\7c\2\2\u00aa\u00ab\7p\2\2\u00ab\u00ac\7f\2\2\u00ac\u00ad"+
		"\7H\2\2\u00ad\u00ae\7n\2\2\u00ae\u00af\7q\2\2\u00af\u00b0\7c\2\2\u00b0"+
		"\u034b\7v\2\2\u00b1\u00b2\7t\2\2\u00b2\u00b3\7c\2\2\u00b3\u00b4\7p\2\2"+
		"\u00b4\u00b5\7f\2\2\u00b5\u00b6\7K\2\2\u00b6\u00b7\7v\2\2\u00b7\u00b8"+
		"\7g\2\2\u00b8\u034b\7o\2\2\u00b9\u00ba\7t\2\2\u00ba\u00bb\7q\2\2\u00bb"+
		"\u00bc\7w\2\2\u00bc\u00bd\7p\2\2\u00bd\u00be\7f\2\2\u00be\u00bf\7F\2\2"+
		"\u00bf\u00c0\7q\2\2\u00c0\u00c1\7y\2\2\u00c1\u034b\7p\2\2\u00c2\u00c3"+
		"\7t\2\2\u00c3\u00c4\7q\2\2\u00c4\u00c5\7w\2\2\u00c5\u00c6\7p\2\2\u00c6"+
		"\u00c7\7f\2\2\u00c7\u00c8\7W\2\2\u00c8\u034b\7r\2\2\u00c9\u00ca\7t\2\2"+
		"\u00ca\u00cb\7q\2\2\u00cb\u00cc\7w\2\2\u00cc\u00cd\7p\2\2\u00cd\u034b"+
		"\7f\2\2\u00ce\u00cf\7k\2\2\u00cf\u00d0\7u\2\2\u00d0\u00d1\7G\2\2\u00d1"+
		"\u00d2\7x\2\2\u00d2\u00d3\7g\2\2\u00d3\u034b\7p\2\2\u00d4\u00d5\7k\2\2"+
		"\u00d5\u00d6\7u\2\2\u00d6\u00d7\7Q\2\2\u00d7\u00d8\7f\2\2\u00d8\u034b"+
		"\7f\2\2\u00d9\u00da\7k\2\2\u00da\u00db\7u\2\2\u00db\u00dc\7R\2\2\u00dc"+
		"\u00dd\7t\2\2\u00dd\u00de\7k\2\2\u00de\u00df\7o\2\2\u00df\u034b\7g\2\2"+
		"\u00e0\u00e1\7k\2\2\u00e1\u00e2\7u\2\2\u00e2\u00e3\7Y\2\2\u00e3\u00e4"+
		"\7j\2\2\u00e4\u00e5\7q\2\2\u00e5\u00e6\7n\2\2\u00e6\u034b\7g\2\2\u00e7"+
		"\u00e8\7k\2\2\u00e8\u00e9\7u\2\2\u00e9\u00ea\7G\2\2\u00ea\u00eb\7o\2\2"+
		"\u00eb\u00ec\7r\2\2\u00ec\u00ed\7v\2\2\u00ed\u034b\7{\2\2\u00ee\u00ef"+
		"\7k\2\2\u00ef\u00f0\7u\2\2\u00f0\u00f1\7R\2\2\u00f1\u00f2\7q\2\2\u00f2"+
		"\u00f3\7u\2\2\u00f3\u00f4\7k\2\2\u00f4\u00f5\7v\2\2\u00f5\u00f6\7k\2\2"+
		"\u00f6\u00f7\7x\2\2\u00f7\u034b\7g\2\2\u00f8\u00f9\7k\2\2\u00f9\u00fa"+
		"\7u\2\2\u00fa\u00fb\7P\2\2\u00fb\u00fc\7g\2\2\u00fc\u00fd\7i\2\2\u00fd"+
		"\u00fe\7c\2\2\u00fe\u00ff\7v\2\2\u00ff\u0100\7k\2\2\u0100\u0101\7x\2\2"+
		"\u0101\u034b\7g\2\2\u0102\u0103\7k\2\2\u0103\u0104\7u\2\2\u0104\u0105"+
		"\7F\2\2\u0105\u0106\7k\2\2\u0106\u0107\7x\2\2\u0107\u0108\7k\2\2\u0108"+
		"\u0109\7u\2\2\u0109\u010a\7k\2\2\u010a\u010b\7d\2\2\u010b\u010c\7n\2\2"+
		"\u010c\u010d\7g\2\2\u010d\u010e\7D\2\2\u010e\u034b\7{\2\2\u010f\u0110"+
		"\7u\2\2\u0110\u0111\7w\2\2\u0111\u034b\7o\2\2\u0112\u0113\7o\2\2\u0113"+
		"\u0114\7c\2\2\u0114\u034b\7z\2\2\u0115\u0116\7o\2\2\u0116\u0117\7k\2\2"+
		"\u0117\u034b\7p\2\2\u0118\u0119\7c\2\2\u0119\u011a\7x\2\2\u011a\u034b"+
		"\7i\2\2\u011b\u011c\7o\2\2\u011c\u011d\7g\2\2\u011d\u011e\7f\2\2\u011e"+
		"\u011f\7k\2\2\u011f\u0120\7c\2\2\u0120\u034b\7p\2\2\u0121\u0122\7u\2\2"+
		"\u0122\u034b\7f\2\2\u0123\u0124\7n\2\2\u0124\u0125\7g\2\2\u0125\u0126"+
		"\7p\2\2\u0126\u0127\7i\2\2\u0127\u0128\7v\2\2\u0128\u0129\7j\2\2\u0129"+
		"\u012a\7Q\2\2\u012a\u034b\7h\2\2\u012b\u012c\7k\2\2\u012c\u012d\7p\2\2"+
		"\u012d\u012e\7f\2\2\u012e\u012f\7g\2\2\u012f\u0130\7z\2\2\u0130\u0131"+
		"\7Q\2\2\u0131\u0132\7h\2\2\u0132\u0133\7H\2\2\u0133\u0134\7k\2\2\u0134"+
		"\u0135\7t\2\2\u0135\u0136\7u\2\2\u0136\u034b\7v\2\2\u0137\u0138\7k\2\2"+
		"\u0138\u0139\7p\2\2\u0139\u013a\7f\2\2\u013a\u013b\7g\2\2\u013b\u013c"+
		"\7z\2\2\u013c\u013d\7Q\2\2\u013d\u013e\7h\2\2\u013e\u013f\7N\2\2\u013f"+
		"\u0140\7c\2\2\u0140\u0141\7u\2\2\u0141\u034b\7v\2\2\u0142\u0143\7u\2\2"+
		"\u0143\u0144\7g\2\2\u0144\u0145\7v\2\2\u0145\u0146\7K\2\2\u0146\u0147"+
		"\7p\2\2\u0147\u0148\7f\2\2\u0148\u0149\7g\2\2\u0149\u034b\7z\2\2\u014a"+
		"\u014b\7u\2\2\u014b\u014c\7g\2\2\u014c\u014d\7v\2\2\u014d\u014e\7K\2\2"+
		"\u014e\u014f\7p\2\2\u014f\u0150\7f\2\2\u0150\u0151\7g\2\2\u0151\u0152"+
		"\7z\2\2\u0152\u0153\7H\2\2\u0153\u0154\7t\2\2\u0154\u0155\7q\2\2\u0155"+
		"\u0156\7o\2\2\u0156\u0157\7G\2\2\u0157\u0158\7p\2\2\u0158\u034b\7f\2\2"+
		"\u0159\u015a\7u\2\2\u015a\u015b\7g\2\2\u015b\u015c\7v\2\2\u015c\u015d"+
		"\7K\2\2\u015d\u015e\7p\2\2\u015e\u015f\7f\2\2\u015f\u0160\7g\2\2\u0160"+
		"\u0161\7z\2\2\u0161\u0162\7H\2\2\u0162\u0163\7k\2\2\u0163\u0164\7t\2\2"+
		"\u0164\u0165\7u\2\2\u0165\u034b\7v\2\2\u0166\u0167\7u\2\2\u0167\u0168"+
		"\7g\2\2\u0168\u0169\7v\2\2\u0169\u016a\7K\2\2\u016a\u016b\7p\2\2\u016b"+
		"\u016c\7f\2\2\u016c\u016d\7g\2\2\u016d\u016e\7z\2\2\u016e\u016f\7N\2\2"+
		"\u016f\u0170\7c\2\2\u0170\u0171\7u\2\2\u0171\u034b\7v\2\2\u0172\u0173"+
		"\7k\2\2\u0173\u0174\7p\2\2\u0174\u0175\7u\2\2\u0175\u0176\7g\2\2\u0176"+
		"\u0177\7t\2\2\u0177\u0178\7v\2\2\u0178\u0179\7K\2\2\u0179\u017a\7p\2\2"+
		"\u017a\u017b\7f\2\2\u017b\u017c\7g\2\2\u017c\u034b\7z\2\2\u017d\u017e"+
		"\7k\2\2\u017e\u017f\7p\2\2\u017f\u0180\7u\2\2\u0180\u0181\7g\2\2\u0181"+
		"\u0182\7t\2\2\u0182\u0183\7v\2\2\u0183\u0184\7K\2\2\u0184\u0185\7p\2\2"+
		"\u0185\u0186\7f\2\2\u0186\u0187\7g\2\2\u0187\u0188\7z\2\2\u0188\u0189"+
		"\7H\2\2\u0189\u018a\7t\2\2\u018a\u018b\7q\2\2\u018b\u018c\7o\2\2\u018c"+
		"\u018d\7G\2\2\u018d\u018e\7p\2\2\u018e\u034b\7f\2\2\u018f\u0190\7k\2\2"+
		"\u0190\u0191\7p\2\2\u0191\u0192\7u\2\2\u0192\u0193\7g\2\2\u0193\u0194"+
		"\7t\2\2\u0194\u0195\7v\2\2\u0195\u0196\7K\2\2\u0196\u0197\7p\2\2\u0197"+
		"\u0198\7f\2\2\u0198\u0199\7g\2\2\u0199\u019a\7z\2\2\u019a\u019b\7H\2\2"+
		"\u019b\u019c\7k\2\2\u019c\u019d\7t\2\2\u019d\u019e\7u\2\2\u019e\u034b"+
		"\7v\2\2\u019f\u01a0\7k\2\2\u01a0\u01a1\7p\2\2\u01a1\u01a2\7u\2\2\u01a2"+
		"\u01a3\7g\2\2\u01a3\u01a4\7t\2\2\u01a4\u01a5\7v\2\2\u01a5\u01a6\7K\2\2"+
		"\u01a6\u01a7\7p\2\2\u01a7\u01a8\7f\2\2\u01a8\u01a9\7g\2\2\u01a9\u01aa"+
		"\7z\2\2\u01aa\u01ab\7N\2\2\u01ab\u01ac\7c\2\2\u01ac\u01ad\7u\2\2\u01ad"+
		"\u034b\7v\2\2\u01ae\u01af\7i\2\2\u01af\u01b0\7g\2\2\u01b0\u01b1\7v\2\2"+
		"\u01b1\u01b2\7K\2\2\u01b2\u01b3\7p\2\2\u01b3\u01b4\7f\2\2\u01b4\u01b5"+
		"\7g\2\2\u01b5\u034b\7z\2\2\u01b6\u01b7\7i\2\2\u01b7\u01b8\7g\2\2\u01b8"+
		"\u01b9\7v\2\2\u01b9\u01ba\7K\2\2\u01ba\u01bb\7p\2\2\u01bb\u01bc\7f\2\2"+
		"\u01bc\u01bd\7g\2\2\u01bd\u01be\7z\2\2\u01be\u01bf\7H\2\2\u01bf\u01c0"+
		"\7t\2\2\u01c0\u01c1\7q\2\2\u01c1\u01c2\7o\2\2\u01c2\u01c3\7G\2\2\u01c3"+
		"\u01c4\7p\2\2\u01c4\u034b\7f\2\2\u01c5\u01c6\7i\2\2\u01c6\u01c7\7g\2\2"+
		"\u01c7\u01c8\7v\2\2\u01c8\u01c9\7K\2\2\u01c9\u01ca\7p\2\2\u01ca\u01cb"+
		"\7f\2\2\u01cb\u01cc\7g\2\2\u01cc\u01cd\7z\2\2\u01cd\u01ce\7H\2\2\u01ce"+
		"\u01cf\7k\2\2\u01cf\u01d0\7t\2\2\u01d0\u01d1\7u\2\2\u01d1\u034b\7v\2\2"+
		"\u01d2\u01d3\7i\2\2\u01d3\u01d4\7g\2\2\u01d4\u01d5\7v\2\2\u01d5\u01d6"+
		"\7K\2\2\u01d6\u01d7\7p\2\2\u01d7\u01d8\7f\2\2\u01d8\u01d9\7g\2\2\u01d9"+
		"\u01da\7z\2\2\u01da\u01db\7N\2\2\u01db\u01dc\7c\2\2\u01dc\u01dd\7u\2\2"+
		"\u01dd\u034b\7v\2\2\u01de\u01df\7i\2\2\u01df\u01e0\7g\2\2\u01e0\u01e1"+
		"\7v\2\2\u01e1\u01e2\7C\2\2\u01e2\u01e3\7p\2\2\u01e3\u01e4\7f\2\2\u01e4"+
		"\u01e5\7T\2\2\u01e5\u01e6\7g\2\2\u01e6\u01e7\7o\2\2\u01e7\u01e8\7q\2\2"+
		"\u01e8\u01e9\7x\2\2\u01e9\u01ea\7g\2\2\u01ea\u01eb\7K\2\2\u01eb\u01ec"+
		"\7p\2\2\u01ec\u01ed\7f\2\2\u01ed\u01ee\7g\2\2\u01ee\u034b\7z\2\2\u01ef"+
		"\u01f0\7i\2\2\u01f0\u01f1\7g\2\2\u01f1\u01f2\7v\2\2\u01f2\u01f3\7C\2\2"+
		"\u01f3\u01f4\7p\2\2\u01f4\u01f5\7f\2\2\u01f5\u01f6\7T\2\2\u01f6\u01f7"+
		"\7g\2\2\u01f7\u01f8\7o\2\2\u01f8\u01f9\7q\2\2\u01f9\u01fa\7x\2\2\u01fa"+
		"\u01fb\7g\2\2\u01fb\u01fc\7K\2\2\u01fc\u01fd\7p\2\2\u01fd\u01fe\7f\2\2"+
		"\u01fe\u01ff\7g\2\2\u01ff\u0200\7z\2\2\u0200\u0201\7H\2\2\u0201\u0202"+
		"\7t\2\2\u0202\u0203\7q\2\2\u0203\u0204\7o\2\2\u0204\u0205\7G\2\2\u0205"+
		"\u0206\7p\2\2\u0206\u034b\7f\2\2\u0207\u0208\7i\2\2\u0208\u0209\7g\2\2"+
		"\u0209\u020a\7v\2\2\u020a\u020b\7C\2\2\u020b\u020c\7p\2\2\u020c\u020d"+
		"\7f\2\2\u020d\u020e\7T\2\2\u020e\u020f\7g\2\2\u020f\u0210\7o\2\2\u0210"+
		"\u0211\7q\2\2\u0211\u0212\7x\2\2\u0212\u0213\7g\2\2\u0213\u0214\7K\2\2"+
		"\u0214\u0215\7p\2\2\u0215\u0216\7f\2\2\u0216\u0217\7g\2\2\u0217\u0218"+
		"\7z\2\2\u0218\u0219\7H\2\2\u0219\u021a\7k\2\2\u021a\u021b\7t\2\2\u021b"+
		"\u021c\7u\2\2\u021c\u034b\7v\2\2\u021d\u021e\7i\2\2\u021e\u021f\7g\2\2"+
		"\u021f\u0220\7v\2\2\u0220\u0221\7C\2\2\u0221\u0222\7p\2\2\u0222\u0223"+
		"\7f\2\2\u0223\u0224\7T\2\2\u0224\u0225\7g\2\2\u0225\u0226\7o\2\2\u0226"+
		"\u0227\7q\2\2\u0227\u0228\7x\2\2\u0228\u0229\7g\2\2\u0229\u022a\7K\2\2"+
		"\u022a\u022b\7p\2\2\u022b\u022c\7f\2\2\u022c\u022d\7g\2\2\u022d\u022e"+
		"\7z\2\2\u022e\u022f\7N\2\2\u022f\u0230\7c\2\2\u0230\u0231\7u\2\2\u0231"+
		"\u034b\7v\2\2\u0232\u0233\7t\2\2\u0233\u0234\7g\2\2\u0234\u0235\7o\2\2"+
		"\u0235\u0236\7q\2\2\u0236\u0237\7x\2\2\u0237\u0238\7g\2\2\u0238\u0239"+
		"\7K\2\2\u0239\u023a\7p\2\2\u023a\u023b\7f\2\2\u023b\u023c\7g\2\2\u023c"+
		"\u034b\7z\2\2\u023d\u023e\7t\2\2\u023e\u023f\7g\2\2\u023f\u0240\7o\2\2"+
		"\u0240\u0241\7q\2\2\u0241\u0242\7x\2\2\u0242\u0243\7g\2\2\u0243\u0244"+
		"\7K\2\2\u0244\u0245\7p\2\2\u0245\u0246\7f\2\2\u0246\u0247\7g\2\2\u0247"+
		"\u0248\7z\2\2\u0248\u0249\7H\2\2\u0249\u024a\7t\2\2\u024a\u024b\7q\2\2"+
		"\u024b\u024c\7o\2\2\u024c\u024d\7G\2\2\u024d\u024e\7p\2\2\u024e\u034b"+
		"\7f\2\2\u024f\u0250\7t\2\2\u0250\u0251\7g\2\2\u0251\u0252\7o\2\2\u0252"+
		"\u0253\7q\2\2\u0253\u0254\7x\2\2\u0254\u0255\7g\2\2\u0255\u0256\7K\2\2"+
		"\u0256\u0257\7p\2\2\u0257\u0258\7f\2\2\u0258\u0259\7g\2\2\u0259\u025a"+
		"\7z\2\2\u025a\u025b\7H\2\2\u025b\u025c\7k\2\2\u025c\u025d\7t\2\2\u025d"+
		"\u025e\7u\2\2\u025e\u034b\7v\2\2\u025f\u0260\7t\2\2\u0260\u0261\7g\2\2"+
		"\u0261\u0262\7o\2\2\u0262\u0263\7q\2\2\u0263\u0264\7x\2\2\u0264\u0265"+
		"\7g\2\2\u0265\u0266\7K\2\2\u0266\u0267\7p\2\2\u0267\u0268\7f\2\2\u0268"+
		"\u0269\7g\2\2\u0269\u026a\7z\2\2\u026a\u026b\7N\2\2\u026b\u026c\7c\2\2"+
		"\u026c\u026d\7u\2\2\u026d\u034b\7v\2\2\u026e\u026f\7t\2\2\u026f\u0270"+
		"\7g\2\2\u0270\u0271\7r\2\2\u0271\u0272\7g\2\2\u0272\u0273\7c\2\2\u0273"+
		"\u0274\7v\2\2\u0274\u0275\7N\2\2\u0275\u0276\7k\2\2\u0276\u0277\7u\2\2"+
		"\u0277\u034b\7v\2\2\u0278\u0279\7u\2\2\u0279\u027a\7w\2\2\u027a\u027b"+
		"\7d\2\2\u027b\u027c\7N\2\2\u027c\u027d\7k\2\2\u027d\u027e\7u\2\2\u027e"+
		"\u034b\7v\2\2\u027f\u0280\7u\2\2\u0280\u0281\7w\2\2\u0281\u0282\7d\2\2"+
		"\u0282\u0283\7N\2\2\u0283\u0284\7k\2\2\u0284\u0285\7u\2\2\u0285\u0286"+
		"\7v\2\2\u0286\u0287\7H\2\2\u0287\u0288\7t\2\2\u0288\u0289\7q\2\2\u0289"+
		"\u028a\7o\2\2\u028a\u028b\7K\2\2\u028b\u028c\7p\2\2\u028c\u028d\7f\2\2"+
		"\u028d\u028e\7g\2\2\u028e\u028f\7z\2\2\u028f\u0290\7V\2\2\u0290\u0291"+
		"\7q\2\2\u0291\u0292\7N\2\2\u0292\u0293\7c\2\2\u0293\u0294\7u\2\2\u0294"+
		"\u034b\7v\2\2\u0295\u0296\7u\2\2\u0296\u0297\7w\2\2\u0297\u0298\7d\2\2"+
		"\u0298\u0299\7N\2\2\u0299\u029a\7k\2\2\u029a\u029b\7u\2\2\u029b\u029c"+
		"\7v\2\2\u029c\u029d\7H\2\2\u029d\u029e\7t\2\2\u029e\u029f\7q\2\2\u029f"+
		"\u02a0\7o\2\2\u02a0\u02a1\7K\2\2\u02a1\u02a2\7p\2\2\u02a2\u02a3\7f\2\2"+
		"\u02a3\u02a4\7g\2\2\u02a4\u02a5\7z\2\2\u02a5\u02a6\7V\2\2\u02a6\u02a7"+
		"\7q\2\2\u02a7\u02a8\7G\2\2\u02a8\u02a9\7p\2\2\u02a9\u034b\7f\2\2\u02aa"+
		"\u02ab\7u\2\2\u02ab\u02ac\7w\2\2\u02ac\u02ad\7d\2\2\u02ad\u02ae\7N\2\2"+
		"\u02ae\u02af\7k\2\2\u02af\u02b0\7u\2\2\u02b0\u02b1\7v\2\2\u02b1\u02b2"+
		"\7H\2\2\u02b2\u02b3\7t\2\2\u02b3\u02b4\7q\2\2\u02b4\u02b5\7o\2\2\u02b5"+
		"\u02b6\7H\2\2\u02b6\u02b7\7k\2\2\u02b7\u02b8\7t\2\2\u02b8\u02b9\7u\2\2"+
		"\u02b9\u02ba\7v\2\2\u02ba\u02bb\7V\2\2\u02bb\u02bc\7q\2\2\u02bc\u02bd"+
		"\7K\2\2\u02bd\u02be\7p\2\2\u02be\u02bf\7f\2\2\u02bf\u02c0\7g\2\2\u02c0"+
		"\u034b\7z\2\2\u02c1\u02c2\7u\2\2\u02c2\u02c3\7w\2\2\u02c3\u02c4\7d\2\2"+
		"\u02c4\u02c5\7N\2\2\u02c5\u02c6\7k\2\2\u02c6\u02c7\7u\2\2\u02c7\u02c8"+
		"\7v\2\2\u02c8\u02c9\7H\2\2\u02c9\u02ca\7t\2\2\u02ca\u02cb\7q\2\2\u02cb"+
		"\u02cc\7o\2\2\u02cc\u02cd\7H\2\2\u02cd\u02ce\7k\2\2\u02ce\u02cf\7t\2\2"+
		"\u02cf\u02d0\7u\2\2\u02d0\u02d1\7v\2\2\u02d1\u02d2\7V\2\2\u02d2\u02d3"+
		"\7q\2\2\u02d3\u02d4\7N\2\2\u02d4\u02d5\7c\2\2\u02d5\u02d6\7u\2\2\u02d6"+
		"\u034b\7v\2\2\u02d7\u02d8\7u\2\2\u02d8\u02d9\7w\2\2\u02d9\u02da\7d\2\2"+
		"\u02da\u02db\7N\2\2\u02db\u02dc\7k\2\2\u02dc\u02dd\7u\2\2\u02dd\u02de"+
		"\7v\2\2\u02de\u02df\7H\2\2\u02df\u02e0\7t\2\2\u02e0\u02e1\7q\2\2\u02e1"+
		"\u02e2\7o\2\2\u02e2\u02e3\7H\2\2\u02e3\u02e4\7k\2\2\u02e4\u02e5\7t\2\2"+
		"\u02e5\u02e6\7u\2\2\u02e6\u02e7\7v\2\2\u02e7\u02e8\7V\2\2\u02e8\u02e9"+
		"\7q\2\2\u02e9\u02ea\7G\2\2\u02ea\u02eb\7p\2\2\u02eb\u034b\7f\2\2\u02ec"+
		"\u02ed\7u\2\2\u02ed\u02ee\7w\2\2\u02ee\u02ef\7d\2\2\u02ef\u02f0\7N\2\2"+
		"\u02f0\u02f1\7k\2\2\u02f1\u02f2\7u\2\2\u02f2\u02f3\7v\2\2\u02f3\u02f4"+
		"\7H\2\2\u02f4\u02f5\7t\2\2\u02f5\u02f6\7q\2\2\u02f6\u02f7\7o\2\2\u02f7"+
		"\u02f8\7G\2\2\u02f8\u02f9\7p\2\2\u02f9\u02fa\7f\2\2\u02fa\u02fb\7V\2\2"+
		"\u02fb\u02fc\7q\2\2\u02fc\u02fd\7K\2\2\u02fd\u02fe\7p\2\2\u02fe\u02ff"+
		"\7f\2\2\u02ff\u0300\7g\2\2\u0300\u034b\7z\2\2\u0301\u0302\7u\2\2\u0302"+
		"\u0303\7w\2\2\u0303\u0304\7d\2\2\u0304\u0305\7N\2\2\u0305\u0306\7k\2\2"+
		"\u0306\u0307\7u\2\2\u0307\u0308\7v\2\2\u0308\u0309\7H\2\2\u0309\u030a"+
		"\7t\2\2\u030a\u030b\7q\2\2\u030b\u030c\7o\2\2\u030c\u030d\7G\2\2\u030d"+
		"\u030e\7p\2\2\u030e\u030f\7f\2\2\u030f\u0310\7V\2\2\u0310\u0311\7q\2\2"+
		"\u0311\u0312\7G\2\2\u0312\u0313\7p\2\2\u0313\u034b\7f\2\2\u0314\u0315"+
		"\7u\2\2\u0315\u0316\7w\2\2\u0316\u0317\7d\2\2\u0317\u0318\7N\2\2\u0318"+
		"\u0319\7k\2\2\u0319\u031a\7u\2\2\u031a\u031b\7v\2\2\u031b\u031c\7H\2\2"+
		"\u031c\u031d\7t\2\2\u031d\u031e\7q\2\2\u031e\u031f\7o\2\2\u031f\u0320"+
		"\7G\2\2\u0320\u0321\7p\2\2\u0321\u0322\7f\2\2\u0322\u0323\7V\2\2\u0323"+
		"\u0324\7q\2\2\u0324\u0325\7N\2\2\u0325\u0326\7c\2\2\u0326\u0327\7u\2\2"+
		"\u0327\u034b\7v\2\2\u0328\u0329\7r\2\2\u0329\u032a\7t\2\2\u032a\u032b"+
		"\7k\2\2\u032b\u032c\7p\2\2\u032c\u034b\7v\2\2\u032d\u032e\7e\2\2\u032e"+
		"\u032f\7t\2\2\u032f\u0330\7g\2\2\u0330\u0331\7c\2\2\u0331\u0332\7v\2\2"+
		"\u0332\u0333\7g\2\2\u0333\u0334\7V\2\2\u0334\u0335\7g\2\2\u0335\u0336"+
		"\7z\2\2\u0336\u0337\7v\2\2\u0337\u0338\7Y\2\2\u0338\u0339\7k\2\2\u0339"+
		"\u033a\7v\2\2\u033a\u034b\7j\2\2\u033b\u033c\7e\2\2\u033c\u033d\7q\2\2"+
		"\u033d\u033e\7p\2\2\u033e\u033f\7u\2\2\u033f\u0340\7v\2\2\u0340\u0341"+
		"\7t\2\2\u0341\u0342\7c\2\2\u0342\u0343\7k\2\2\u0343\u034b\7p\2\2\u0344"+
		"\u0345\7i\2\2\u0345\u0346\7g\2\2\u0346\u0347\7v\2\2\u0347\u0348\7T\2\2"+
		"\u0348\u0349\7I\2\2\u0349\u034b\7D\2\2\u034au\3\2\2\2\u034ax\3\2\2\2\u034a"+
		"{\3\2\2\2\u034a~\3\2\2\2\u034a\u0082\3\2\2\2\u034a\u0086\3\2\2\2\u034a"+
		"\u008a\3\2\2\2\u034a\u008d\3\2\2\2\u034a\u0093\3\2\2\2\u034a\u0097\3\2"+
		"\2\2\u034a\u009a\3\2\2\2\u034a\u009f\3\2\2\2\u034a\u00a1\3\2\2\2\u034a"+
		"\u00a8\3\2\2\2\u034a\u00b1\3\2\2\2\u034a\u00b9\3\2\2\2\u034a\u00c2\3\2"+
		"\2\2\u034a\u00c9\3\2\2\2\u034a\u00ce\3\2\2\2\u034a\u00d4\3\2\2\2\u034a"+
		"\u00d9\3\2\2\2\u034a\u00e0\3\2\2\2\u034a\u00e7\3\2\2\2\u034a\u00ee\3\2"+
		"\2\2\u034a\u00f8\3\2\2\2\u034a\u0102\3\2\2\2\u034a\u010f\3\2\2\2\u034a"+
		"\u0112\3\2\2\2\u034a\u0115\3\2\2\2\u034a\u0118\3\2\2\2\u034a\u011b\3\2"+
		"\2\2\u034a\u0121\3\2\2\2\u034a\u0123\3\2\2\2\u034a\u012b\3\2\2\2\u034a"+
		"\u0137\3\2\2\2\u034a\u0142\3\2\2\2\u034a\u014a\3\2\2\2\u034a\u0159\3\2"+
		"\2\2\u034a\u0166\3\2\2\2\u034a\u0172\3\2\2\2\u034a\u017d\3\2\2\2\u034a"+
		"\u018f\3\2\2\2\u034a\u019f\3\2\2\2\u034a\u01ae\3\2\2\2\u034a\u01b6\3\2"+
		"\2\2\u034a\u01c5\3\2\2\2\u034a\u01d2\3\2\2\2\u034a\u01de\3\2\2\2\u034a"+
		"\u01ef\3\2\2\2\u034a\u0207\3\2\2\2\u034a\u021d\3\2\2\2\u034a\u0232\3\2"+
		"\2\2\u034a\u023d\3\2\2\2\u034a\u024f\3\2\2\2\u034a\u025f\3\2\2\2\u034a"+
		"\u026e\3\2\2\2\u034a\u0278\3\2\2\2\u034a\u027f\3\2\2\2\u034a\u0295\3\2"+
		"\2\2\u034a\u02aa\3\2\2\2\u034a\u02c1\3\2\2\2\u034a\u02d7\3\2\2\2\u034a"+
		"\u02ec\3\2\2\2\u034a\u0301\3\2\2\2\u034a\u0314\3\2\2\2\u034a\u0328\3\2"+
		"\2\2\u034a\u032d\3\2\2\2\u034a\u033b\3\2\2\2\u034a\u0344\3\2\2\2\u034b"+
		"\34\3\2\2\2\u034c\u034d\7r\2\2\u034d\u034e\7j\2\2\u034e\u0363\7k\2\2\u034f"+
		"\u0350\7r\2\2\u0350\u0363\7k\2\2\u0351\u0363\7g\2\2\u0352\u0353\7u\2\2"+
		"\u0353\u0354\7s\2\2\u0354\u0355\7t\2\2\u0355\u0356\7v\2\2\u0356\u0363"+
		"\7\64\2\2\u0357\u0358\7u\2\2\u0358\u0359\7s\2\2\u0359\u035a\7t\2\2\u035a"+
		"\u035b\7v\2\2\u035b\u035c\7a\2\2\u035c\u035d\7\63\2\2\u035d\u035e\7a\2"+
		"\2\u035e\u0363\7\64\2\2\u035f\u0360\7k\2\2\u0360\u0361\7p\2\2\u0361\u0363"+
		"\7h\2\2\u0362\u034c\3\2\2\2\u0362\u034f\3\2\2\2\u0362\u0351\3\2\2\2\u0362"+
		"\u0352\3\2\2\2\u0362\u0357\3\2\2\2\u0362\u035f\3\2\2\2\u0363\36\3\2\2"+
		"\2\u0364\u0365\7p\2\2\u0365\u0366\7w\2\2\u0366\u0367\7n\2\2\u0367\u0368"+
		"\7n\2\2\u0368 \3\2\2\2\u0369\u036b\4\62;\2\u036a\u0369\3\2\2\2\u036b\u036c"+
		"\3\2\2\2\u036c\u036a\3\2\2\2\u036c\u036d\3\2\2\2\u036d\"\3\2\2\2\u036e"+
		"\u0370\5!\21\2\u036f\u036e\3\2\2\2\u0370\u0371\3\2\2\2\u0371\u036f\3\2"+
		"\2\2\u0371\u0372\3\2\2\2\u0372\u0373\3\2\2\2\u0373\u0377\7\60\2\2\u0374"+
		"\u0376\5!\21\2\u0375\u0374\3\2\2\2\u0376\u0379\3\2\2\2\u0377\u0375\3\2"+
		"\2\2\u0377\u0378\3\2\2\2\u0378\u0381\3\2\2\2\u0379\u0377\3\2\2\2\u037a"+
		"\u037c\7\60\2\2\u037b\u037d\5!\21\2\u037c\u037b\3\2\2\2\u037d\u037e\3"+
		"\2\2\2\u037e\u037c\3\2\2\2\u037e\u037f\3\2\2\2\u037f\u0381\3\2\2\2\u0380"+
		"\u036f\3\2\2\2\u0380\u037a\3\2\2\2\u0381$\3\2\2\2\u0382\u0383\7v\2\2\u0383"+
		"\u0384\7t\2\2\u0384\u0385\7w\2\2\u0385\u038c\7g\2\2\u0386\u0387\7h\2\2"+
		"\u0387\u0388\7c\2\2\u0388\u0389\7n\2\2\u0389\u038a\7u\2\2\u038a\u038c"+
		"\7g\2\2\u038b\u0382\3\2\2\2\u038b\u0386\3\2\2\2\u038c&\3\2\2\2\u038d\u038e"+
		"\7%\2\2\u038e\u038f\5)\25\2\u038f\u0390\5)\25\2\u0390\u0391\5)\25\2\u0391"+
		"\u0392\5)\25\2\u0392\u0393\5)\25\2\u0393\u0394\5)\25\2\u0394(\3\2\2\2"+
		"\u0395\u0396\t\3\2\2\u0396*\3\2\2\2\u0397\u039b\4c|\2\u0398\u039a\t\4"+
		"\2\2\u0399\u0398\3\2\2\2\u039a\u039d\3\2\2\2\u039b\u0399\3\2\2\2\u039b"+
		"\u039c\3\2\2\2\u039c,\3\2\2\2\u039d\u039b\3\2\2\2\u039e\u03a0\t\5\2\2"+
		"\u039f\u039e\3\2\2\2\u03a0\u03a1\3\2\2\2\u03a1\u039f\3\2\2\2\u03a1\u03a2"+
		"\3\2\2\2\u03a2.\3\2\2\2\u03a3\u03a4\7(\2\2\u03a4\u03a5\7(\2\2\u03a5\60"+
		"\3\2\2\2\u03a6\u03a7\7~\2\2\u03a7\u03a8\7~\2\2\u03a8\62\3\2\2\2\u03a9"+
		"\u03aa\7#\2\2\u03aa\64\3\2\2\2\u03ab\u03ac\7?\2\2\u03ac\u03ad\7?\2\2\u03ad"+
		"\66\3\2\2\2\u03ae\u03af\7#\2\2\u03af\u03b0\7?\2\2\u03b08\3\2\2\2\u03b1"+
		"\u03b2\7@\2\2\u03b2:\3\2\2\2\u03b3\u03b4\7>\2\2\u03b4<\3\2\2\2\u03b5\u03b6"+
		"\7@\2\2\u03b6\u03b7\7?\2\2\u03b7>\3\2\2\2\u03b8\u03b9\7>\2\2\u03b9\u03ba"+
		"\7?\2\2\u03ba@\3\2\2\2\u03bb\u03bc\7\'\2\2\u03bcB\3\2\2\2\u03bd\u03be"+
		"\7`\2\2\u03beD\3\2\2\2\u03bf\u03c0\7,\2\2\u03c0F\3\2\2\2\u03c1\u03c2\7"+
		"\61\2\2\u03c2H\3\2\2\2\u03c3\u03c4\7-\2\2\u03c4J\3\2\2\2\u03c5\u03c6\7"+
		"/\2\2\u03c6L\3\2\2\2\17\2hq\u034a\u0362\u036c\u0371\u0377\u037e\u0380"+
		"\u038b\u039b\u03a1\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}