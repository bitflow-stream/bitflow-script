// Generated from Bitflow.g4 by ANTLR 4.7.1
package bitflow4j.script.generated;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class BitflowLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		OPEN=1, CLOSE=2, EOP=3, NEXT=4, OPEN_PARAMS=5, CLOSE_PARAMS=6, EQ=7, SEP=8, 
		OPEN_HINTS=9, CLOSE_HINTS=10, STRING=11, IDENTIFIER=12, COMMENT=13, NEWLINE=14, 
		WHITESPACE=15, TAB=16;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"OPEN", "CLOSE", "EOP", "NEXT", "OPEN_PARAMS", "CLOSE_PARAMS", "EQ", "SEP", 
		"OPEN_HINTS", "CLOSE_HINTS", "STRING", "IDENTIFIER", "COMMENT", "NEWLINE", 
		"WHITESPACE", "TAB"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'{'", "'}'", "';'", "'->'", "'('", "')'", "'='", "','", "'['", 
		"']'", null, null, null, null, null, "'\t'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "OPEN", "CLOSE", "EOP", "NEXT", "OPEN_PARAMS", "CLOSE_PARAMS", "EQ", 
		"SEP", "OPEN_HINTS", "CLOSE_HINTS", "STRING", "IDENTIFIER", "COMMENT", 
		"NEWLINE", "WHITESPACE", "TAB"
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


	public BitflowLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Bitflow.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\22t\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\3\2\3\2\3"+
		"\3\3\3\3\4\3\4\3\5\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13"+
		"\3\13\3\f\3\f\7\f;\n\f\f\f\16\f>\13\f\3\f\3\f\3\f\7\fC\n\f\f\f\16\fF\13"+
		"\f\3\f\3\f\3\f\7\fK\n\f\f\f\16\fN\13\f\3\f\5\fQ\n\f\3\r\6\rT\n\r\r\r\16"+
		"\rU\3\16\3\16\7\16Z\n\16\f\16\16\16]\13\16\3\16\3\16\3\16\3\16\3\17\3"+
		"\17\3\17\5\17f\n\17\3\17\3\17\3\20\3\20\3\20\5\20m\n\20\3\20\3\20\3\21"+
		"\3\21\3\21\3\21\5<DL\2\22\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25"+
		"\f\27\r\31\16\33\17\35\20\37\21!\22\3\2\4\n\2\'(,-/<AAC\\^^aac|\4\2\f"+
		"\f\17\17\2|\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2"+
		"\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27"+
		"\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2"+
		"\2\3#\3\2\2\2\5%\3\2\2\2\7\'\3\2\2\2\t)\3\2\2\2\13,\3\2\2\2\r.\3\2\2\2"+
		"\17\60\3\2\2\2\21\62\3\2\2\2\23\64\3\2\2\2\25\66\3\2\2\2\27P\3\2\2\2\31"+
		"S\3\2\2\2\33W\3\2\2\2\35e\3\2\2\2\37l\3\2\2\2!p\3\2\2\2#$\7}\2\2$\4\3"+
		"\2\2\2%&\7\177\2\2&\6\3\2\2\2\'(\7=\2\2(\b\3\2\2\2)*\7/\2\2*+\7@\2\2+"+
		"\n\3\2\2\2,-\7*\2\2-\f\3\2\2\2./\7+\2\2/\16\3\2\2\2\60\61\7?\2\2\61\20"+
		"\3\2\2\2\62\63\7.\2\2\63\22\3\2\2\2\64\65\7]\2\2\65\24\3\2\2\2\66\67\7"+
		"_\2\2\67\26\3\2\2\28<\7$\2\29;\13\2\2\2:9\3\2\2\2;>\3\2\2\2<=\3\2\2\2"+
		"<:\3\2\2\2=?\3\2\2\2><\3\2\2\2?Q\7$\2\2@D\7)\2\2AC\13\2\2\2BA\3\2\2\2"+
		"CF\3\2\2\2DE\3\2\2\2DB\3\2\2\2EG\3\2\2\2FD\3\2\2\2GQ\7)\2\2HL\7b\2\2I"+
		"K\13\2\2\2JI\3\2\2\2KN\3\2\2\2LM\3\2\2\2LJ\3\2\2\2MO\3\2\2\2NL\3\2\2\2"+
		"OQ\7b\2\2P8\3\2\2\2P@\3\2\2\2PH\3\2\2\2Q\30\3\2\2\2RT\t\2\2\2SR\3\2\2"+
		"\2TU\3\2\2\2US\3\2\2\2UV\3\2\2\2V\32\3\2\2\2W[\7%\2\2XZ\n\3\2\2YX\3\2"+
		"\2\2Z]\3\2\2\2[Y\3\2\2\2[\\\3\2\2\2\\^\3\2\2\2][\3\2\2\2^_\5\35\17\2_"+
		"`\3\2\2\2`a\b\16\2\2a\34\3\2\2\2bf\t\3\2\2cd\7\17\2\2df\7\f\2\2eb\3\2"+
		"\2\2ec\3\2\2\2fg\3\2\2\2gh\b\17\2\2h\36\3\2\2\2im\7\"\2\2jk\7^\2\2km\7"+
		"u\2\2li\3\2\2\2lj\3\2\2\2mn\3\2\2\2no\b\20\2\2o \3\2\2\2pq\7\13\2\2qr"+
		"\3\2\2\2rs\b\21\2\2s\"\3\2\2\2\13\2<DLPU[el\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}