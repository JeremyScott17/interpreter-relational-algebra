// Generated from RelationalAlgebra.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class RelationalAlgebraLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, LEFT_BRACKET=3, RIGHT_BRACKET=4, LEFT_SQUARE_BRACKET=5, 
		RIGHT_SQUARE_BRACKET=6, SINGLE_QUOTE=7, NAME=8, PROJECTION=9, RENAMING=10, 
		PRODUCT=11, UNION=12, UNION_MAX=13, INTERSECTION=14, DIFFERENCE=15, ELIMINATE=16, 
		SELECT=17, AND=18, OR=19, EQUALITY=20, INEQUALITY=21, LESS=22, LESS_EQUAL=23, 
		GREATER=24, GREATER_EQUAL=25, NOT=26, WS=27;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "DIGIT", "LETTER", "LEFT_BRACKET", "RIGHT_BRACKET", "LEFT_SQUARE_BRACKET", 
			"RIGHT_SQUARE_BRACKET", "SINGLE_QUOTE", "NAME", "PROJECTION", "RENAMING", 
			"PRODUCT", "UNION", "UNION_MAX", "INTERSECTION", "DIFFERENCE", "ELIMINATE", 
			"SELECT", "AND", "OR", "EQUALITY", "INEQUALITY", "LESS", "LESS_EQUAL", 
			"GREATER", "GREATER_EQUAL", "NOT", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "','", "'->'", "'('", "')'", "'['", "']'", "'''", null, "':PROJECT:'", 
			"':RENAME:'", "':PRODUCT:'", "':UPLUS:'", "':UMAX:'", "':INTERSECT:'", 
			"':DIFF:'", "':ELIM:'", "':SELECT:'", "':AND:'", "':OR:'", "':=:'", "':!=:'", 
			"':<:'", "':<=:'", "':>:'", "':>=:'", "':NOT:'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, "LEFT_BRACKET", "RIGHT_BRACKET", "LEFT_SQUARE_BRACKET", 
			"RIGHT_SQUARE_BRACKET", "SINGLE_QUOTE", "NAME", "PROJECTION", "RENAMING", 
			"PRODUCT", "UNION", "UNION_MAX", "INTERSECTION", "DIFFERENCE", "ELIMINATE", 
			"SELECT", "AND", "OR", "EQUALITY", "INEQUALITY", "LESS", "LESS_EQUAL", 
			"GREATER", "GREATER_EQUAL", "NOT", "WS"
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


	public RelationalAlgebraLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "RelationalAlgebra.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\35\u00de\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\3\2\3\2\3\3\3"+
		"\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3"+
		"\13\3\13\7\13T\n\13\f\13\16\13W\13\13\3\13\6\13Z\n\13\r\13\16\13[\5\13"+
		"^\n\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3"+
		"\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3"+
		"\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3"+
		"\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3"+
		"\24\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3"+
		"\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\31\3"+
		"\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\34\3\34\3"+
		"\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\2\2\37"+
		"\3\3\5\4\7\2\t\2\13\5\r\6\17\7\21\b\23\t\25\n\27\13\31\f\33\r\35\16\37"+
		"\17!\20#\21%\22\'\23)\24+\25-\26/\27\61\30\63\31\65\32\67\339\34;\35\3"+
		"\2\5\3\2\62;\4\2C\\c|\5\2\13\f\17\17\"\"\2\u00df\2\3\3\2\2\2\2\5\3\2\2"+
		"\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25"+
		"\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2"+
		"\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2"+
		"\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3"+
		"\2\2\2\29\3\2\2\2\2;\3\2\2\2\3=\3\2\2\2\5?\3\2\2\2\7B\3\2\2\2\tD\3\2\2"+
		"\2\13F\3\2\2\2\rH\3\2\2\2\17J\3\2\2\2\21L\3\2\2\2\23N\3\2\2\2\25]\3\2"+
		"\2\2\27_\3\2\2\2\31i\3\2\2\2\33r\3\2\2\2\35|\3\2\2\2\37\u0084\3\2\2\2"+
		"!\u008b\3\2\2\2#\u0097\3\2\2\2%\u009e\3\2\2\2\'\u00a5\3\2\2\2)\u00ae\3"+
		"\2\2\2+\u00b4\3\2\2\2-\u00b9\3\2\2\2/\u00bd\3\2\2\2\61\u00c2\3\2\2\2\63"+
		"\u00c6\3\2\2\2\65\u00cb\3\2\2\2\67\u00cf\3\2\2\29\u00d4\3\2\2\2;\u00da"+
		"\3\2\2\2=>\7.\2\2>\4\3\2\2\2?@\7/\2\2@A\7@\2\2A\6\3\2\2\2BC\t\2\2\2C\b"+
		"\3\2\2\2DE\t\3\2\2E\n\3\2\2\2FG\7*\2\2G\f\3\2\2\2HI\7+\2\2I\16\3\2\2\2"+
		"JK\7]\2\2K\20\3\2\2\2LM\7_\2\2M\22\3\2\2\2NO\7)\2\2O\24\3\2\2\2PU\5\t"+
		"\5\2QT\5\t\5\2RT\5\7\4\2SQ\3\2\2\2SR\3\2\2\2TW\3\2\2\2US\3\2\2\2UV\3\2"+
		"\2\2V^\3\2\2\2WU\3\2\2\2XZ\5\7\4\2YX\3\2\2\2Z[\3\2\2\2[Y\3\2\2\2[\\\3"+
		"\2\2\2\\^\3\2\2\2]P\3\2\2\2]Y\3\2\2\2^\26\3\2\2\2_`\7<\2\2`a\7R\2\2ab"+
		"\7T\2\2bc\7Q\2\2cd\7L\2\2de\7G\2\2ef\7E\2\2fg\7V\2\2gh\7<\2\2h\30\3\2"+
		"\2\2ij\7<\2\2jk\7T\2\2kl\7G\2\2lm\7P\2\2mn\7C\2\2no\7O\2\2op\7G\2\2pq"+
		"\7<\2\2q\32\3\2\2\2rs\7<\2\2st\7R\2\2tu\7T\2\2uv\7Q\2\2vw\7F\2\2wx\7W"+
		"\2\2xy\7E\2\2yz\7V\2\2z{\7<\2\2{\34\3\2\2\2|}\7<\2\2}~\7W\2\2~\177\7R"+
		"\2\2\177\u0080\7N\2\2\u0080\u0081\7W\2\2\u0081\u0082\7U\2\2\u0082\u0083"+
		"\7<\2\2\u0083\36\3\2\2\2\u0084\u0085\7<\2\2\u0085\u0086\7W\2\2\u0086\u0087"+
		"\7O\2\2\u0087\u0088\7C\2\2\u0088\u0089\7Z\2\2\u0089\u008a\7<\2\2\u008a"+
		" \3\2\2\2\u008b\u008c\7<\2\2\u008c\u008d\7K\2\2\u008d\u008e\7P\2\2\u008e"+
		"\u008f\7V\2\2\u008f\u0090\7G\2\2\u0090\u0091\7T\2\2\u0091\u0092\7U\2\2"+
		"\u0092\u0093\7G\2\2\u0093\u0094\7E\2\2\u0094\u0095\7V\2\2\u0095\u0096"+
		"\7<\2\2\u0096\"\3\2\2\2\u0097\u0098\7<\2\2\u0098\u0099\7F\2\2\u0099\u009a"+
		"\7K\2\2\u009a\u009b\7H\2\2\u009b\u009c\7H\2\2\u009c\u009d\7<\2\2\u009d"+
		"$\3\2\2\2\u009e\u009f\7<\2\2\u009f\u00a0\7G\2\2\u00a0\u00a1\7N\2\2\u00a1"+
		"\u00a2\7K\2\2\u00a2\u00a3\7O\2\2\u00a3\u00a4\7<\2\2\u00a4&\3\2\2\2\u00a5"+
		"\u00a6\7<\2\2\u00a6\u00a7\7U\2\2\u00a7\u00a8\7G\2\2\u00a8\u00a9\7N\2\2"+
		"\u00a9\u00aa\7G\2\2\u00aa\u00ab\7E\2\2\u00ab\u00ac\7V\2\2\u00ac\u00ad"+
		"\7<\2\2\u00ad(\3\2\2\2\u00ae\u00af\7<\2\2\u00af\u00b0\7C\2\2\u00b0\u00b1"+
		"\7P\2\2\u00b1\u00b2\7F\2\2\u00b2\u00b3\7<\2\2\u00b3*\3\2\2\2\u00b4\u00b5"+
		"\7<\2\2\u00b5\u00b6\7Q\2\2\u00b6\u00b7\7T\2\2\u00b7\u00b8\7<\2\2\u00b8"+
		",\3\2\2\2\u00b9\u00ba\7<\2\2\u00ba\u00bb\7?\2\2\u00bb\u00bc\7<\2\2\u00bc"+
		".\3\2\2\2\u00bd\u00be\7<\2\2\u00be\u00bf\7#\2\2\u00bf\u00c0\7?\2\2\u00c0"+
		"\u00c1\7<\2\2\u00c1\60\3\2\2\2\u00c2\u00c3\7<\2\2\u00c3\u00c4\7>\2\2\u00c4"+
		"\u00c5\7<\2\2\u00c5\62\3\2\2\2\u00c6\u00c7\7<\2\2\u00c7\u00c8\7>\2\2\u00c8"+
		"\u00c9\7?\2\2\u00c9\u00ca\7<\2\2\u00ca\64\3\2\2\2\u00cb\u00cc\7<\2\2\u00cc"+
		"\u00cd\7@\2\2\u00cd\u00ce\7<\2\2\u00ce\66\3\2\2\2\u00cf\u00d0\7<\2\2\u00d0"+
		"\u00d1\7@\2\2\u00d1\u00d2\7?\2\2\u00d2\u00d3\7<\2\2\u00d38\3\2\2\2\u00d4"+
		"\u00d5\7<\2\2\u00d5\u00d6\7P\2\2\u00d6\u00d7\7Q\2\2\u00d7\u00d8\7V\2\2"+
		"\u00d8\u00d9\7<\2\2\u00d9:\3\2\2\2\u00da\u00db\t\4\2\2\u00db\u00dc\3\2"+
		"\2\2\u00dc\u00dd\b\36\2\2\u00dd<\3\2\2\2\7\2SU[]\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}