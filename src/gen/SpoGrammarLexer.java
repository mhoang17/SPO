// Generated from C:/Users/Maria-Theresa/IdeaProjects/SPO\SpoGrammar.g4 by ANTLR 4.7.2
package gen;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SpoGrammarLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		Plus=1, Lparen=2, Rparen=3, FI=4, OD=5, IF=6, Semi=7, While=8, Begin=9, 
		End=10, Else=11, DO=12, Assign=13, NUM=14, ID=15, WS=16;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"Plus", "Lparen", "Rparen", "FI", "OD", "IF", "Semi", "While", "Begin", 
			"End", "Else", "DO", "Assign", "NUM", "ID", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'+'", "'('", "')'", "'fi'", "'od'", "'if'", "';'", "'while'", 
			"'begin'", "'end'", "'else'", "'do'", "'='"
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


	public SpoGrammarLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "SpoGrammar.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\22\\\b\1\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\3\2\3\2"+
		"\3\3\3\3\3\4\3\4\3\5\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\f\3\f\3\f"+
		"\3\f\3\f\3\r\3\r\3\r\3\16\3\16\3\17\6\17P\n\17\r\17\16\17Q\3\20\6\20U"+
		"\n\20\r\20\16\20V\3\21\3\21\3\21\3\21\2\2\22\3\3\5\4\7\5\t\6\13\7\r\b"+
		"\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22\3\2\5\3\2\62;\3"+
		"\2c|\5\2\13\f\17\17\"\"\2]\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2"+
		"\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2"+
		"\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3"+
		"\2\2\2\2!\3\2\2\2\3#\3\2\2\2\5%\3\2\2\2\7\'\3\2\2\2\t)\3\2\2\2\13,\3\2"+
		"\2\2\r/\3\2\2\2\17\62\3\2\2\2\21\64\3\2\2\2\23:\3\2\2\2\25@\3\2\2\2\27"+
		"D\3\2\2\2\31I\3\2\2\2\33L\3\2\2\2\35O\3\2\2\2\37T\3\2\2\2!X\3\2\2\2#$"+
		"\7-\2\2$\4\3\2\2\2%&\7*\2\2&\6\3\2\2\2\'(\7+\2\2(\b\3\2\2\2)*\7h\2\2*"+
		"+\7k\2\2+\n\3\2\2\2,-\7q\2\2-.\7f\2\2.\f\3\2\2\2/\60\7k\2\2\60\61\7h\2"+
		"\2\61\16\3\2\2\2\62\63\7=\2\2\63\20\3\2\2\2\64\65\7y\2\2\65\66\7j\2\2"+
		"\66\67\7k\2\2\678\7n\2\289\7g\2\29\22\3\2\2\2:;\7d\2\2;<\7g\2\2<=\7i\2"+
		"\2=>\7k\2\2>?\7p\2\2?\24\3\2\2\2@A\7g\2\2AB\7p\2\2BC\7f\2\2C\26\3\2\2"+
		"\2DE\7g\2\2EF\7n\2\2FG\7u\2\2GH\7g\2\2H\30\3\2\2\2IJ\7f\2\2JK\7q\2\2K"+
		"\32\3\2\2\2LM\7?\2\2M\34\3\2\2\2NP\t\2\2\2ON\3\2\2\2PQ\3\2\2\2QO\3\2\2"+
		"\2QR\3\2\2\2R\36\3\2\2\2SU\t\3\2\2TS\3\2\2\2UV\3\2\2\2VT\3\2\2\2VW\3\2"+
		"\2\2W \3\2\2\2XY\t\4\2\2YZ\3\2\2\2Z[\b\21\2\2[\"\3\2\2\2\5\2QV\3\2\3\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}