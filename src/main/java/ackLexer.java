// Generated from /Users/guoyangqiao/Projects/java/antlr4-test/src/main/resources/ack.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ackLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, ID=19, POSITIVE_INT=20, NEWLINE=21, WS=22;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
			"T__17", "ID", "POSITIVE_INT", "NEWLINE", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'set'", "'='", "'select'", "'from'", "'where'", "'limit'", "'print'", 
			"'${'", "'}'", "'visit http'", "'http://'", "'.'", "','", "'join '", 
			"'on'", "'<>'", "'>'", "'<'", null, null, "';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, "ID", "POSITIVE_INT", "NEWLINE", 
			"WS"
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


	public ackLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "ack.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\30\u0096\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\3\2\3\2\3\2\3"+
		"\2\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3"+
		"\t\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\20\3\20\3\20\3\21\3\21\3\21\3\22\3\22\3\23\3\23\3\24\6\24\u0081"+
		"\n\24\r\24\16\24\u0082\3\25\3\25\3\25\6\25\u0088\n\25\r\25\16\25\u0089"+
		"\5\25\u008c\n\25\3\26\3\26\3\27\6\27\u0091\n\27\r\27\16\27\u0092\3\27"+
		"\3\27\2\2\30\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16"+
		"\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30\3\2\6\4\2C\\c|\3\2\63"+
		";\3\2\62;\4\2\13\f\"\"\2\u0099\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t"+
		"\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2"+
		"\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2"+
		"\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2"+
		"+\3\2\2\2\2-\3\2\2\2\3/\3\2\2\2\5\63\3\2\2\2\7\65\3\2\2\2\t<\3\2\2\2\13"+
		"A\3\2\2\2\rG\3\2\2\2\17M\3\2\2\2\21S\3\2\2\2\23V\3\2\2\2\25X\3\2\2\2\27"+
		"c\3\2\2\2\31k\3\2\2\2\33m\3\2\2\2\35o\3\2\2\2\37u\3\2\2\2!x\3\2\2\2#{"+
		"\3\2\2\2%}\3\2\2\2\'\u0080\3\2\2\2)\u008b\3\2\2\2+\u008d\3\2\2\2-\u0090"+
		"\3\2\2\2/\60\7u\2\2\60\61\7g\2\2\61\62\7v\2\2\62\4\3\2\2\2\63\64\7?\2"+
		"\2\64\6\3\2\2\2\65\66\7u\2\2\66\67\7g\2\2\678\7n\2\289\7g\2\29:\7e\2\2"+
		":;\7v\2\2;\b\3\2\2\2<=\7h\2\2=>\7t\2\2>?\7q\2\2?@\7o\2\2@\n\3\2\2\2AB"+
		"\7y\2\2BC\7j\2\2CD\7g\2\2DE\7t\2\2EF\7g\2\2F\f\3\2\2\2GH\7n\2\2HI\7k\2"+
		"\2IJ\7o\2\2JK\7k\2\2KL\7v\2\2L\16\3\2\2\2MN\7r\2\2NO\7t\2\2OP\7k\2\2P"+
		"Q\7p\2\2QR\7v\2\2R\20\3\2\2\2ST\7&\2\2TU\7}\2\2U\22\3\2\2\2VW\7\177\2"+
		"\2W\24\3\2\2\2XY\7x\2\2YZ\7k\2\2Z[\7u\2\2[\\\7k\2\2\\]\7v\2\2]^\7\"\2"+
		"\2^_\7j\2\2_`\7v\2\2`a\7v\2\2ab\7r\2\2b\26\3\2\2\2cd\7j\2\2de\7v\2\2e"+
		"f\7v\2\2fg\7r\2\2gh\7<\2\2hi\7\61\2\2ij\7\61\2\2j\30\3\2\2\2kl\7\60\2"+
		"\2l\32\3\2\2\2mn\7.\2\2n\34\3\2\2\2op\7l\2\2pq\7q\2\2qr\7k\2\2rs\7p\2"+
		"\2st\7\"\2\2t\36\3\2\2\2uv\7q\2\2vw\7p\2\2w \3\2\2\2xy\7>\2\2yz\7@\2\2"+
		"z\"\3\2\2\2{|\7@\2\2|$\3\2\2\2}~\7>\2\2~&\3\2\2\2\177\u0081\t\2\2\2\u0080"+
		"\177\3\2\2\2\u0081\u0082\3\2\2\2\u0082\u0080\3\2\2\2\u0082\u0083\3\2\2"+
		"\2\u0083(\3\2\2\2\u0084\u008c\t\3\2\2\u0085\u0087\t\3\2\2\u0086\u0088"+
		"\t\4\2\2\u0087\u0086\3\2\2\2\u0088\u0089\3\2\2\2\u0089\u0087\3\2\2\2\u0089"+
		"\u008a\3\2\2\2\u008a\u008c\3\2\2\2\u008b\u0084\3\2\2\2\u008b\u0085\3\2"+
		"\2\2\u008c*\3\2\2\2\u008d\u008e\7=\2\2\u008e,\3\2\2\2\u008f\u0091\t\5"+
		"\2\2\u0090\u008f\3\2\2\2\u0091\u0092\3\2\2\2\u0092\u0090\3\2\2\2\u0092"+
		"\u0093\3\2\2\2\u0093\u0094\3\2\2\2\u0094\u0095\b\27\2\2\u0095.\3\2\2\2"+
		"\7\2\u0082\u0089\u008b\u0092\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}