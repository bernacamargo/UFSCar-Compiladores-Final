// Generated from br/ufscar/compiladores/LSQL.g4 by ANTLR 4.3
package br.ufscar.compiladores;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class LSQLLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		INICIO=1, FIM=2, MOSTRA=3, CRIA=4, ONDE=5, TODOS=6, DOIS_PONTOS=7, OP_MAIS=8, 
		OP_MENOS=9, OP_MULT=10, OP_DIV=11, OP_PORCENTAGEM=12, OP_MAIOR=13, OP_MENOR=14, 
		OP_MAIOR_IGUAL=15, OP_MENOR_IGUAL=16, OP_DIFERENTE=17, OP_IGUAL=18, ABRE_PARENTESE=19, 
		FECHA_PARENTESE=20, VIRGULA=21, PONTO=22, PONTO_E_VIRGULA=23, ABRE_COLCHETE=24, 
		FECHA_COLCHETE=25, SETA=26, VERDADEIRO=27, FALSO=28, VARCHAR=29, LITERAL=30, 
		INTEIRO=31, REAL=32, LOGICO=33, IDENT=34, COMENTARIO=35, ESC_SEQ=36, CADEIA=37, 
		NUM_INT=38, NUM_REAL=39, WS=40, UNDEFINED_CHAR=41;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"'\\u0000'", "'\\u0001'", "'\\u0002'", "'\\u0003'", "'\\u0004'", "'\\u0005'", 
		"'\\u0006'", "'\\u0007'", "'\b'", "'\t'", "'\n'", "'\\u000B'", "'\f'", 
		"'\r'", "'\\u000E'", "'\\u000F'", "'\\u0010'", "'\\u0011'", "'\\u0012'", 
		"'\\u0013'", "'\\u0014'", "'\\u0015'", "'\\u0016'", "'\\u0017'", "'\\u0018'", 
		"'\\u0019'", "'\\u001A'", "'\\u001B'", "'\\u001C'", "'\\u001D'", "'\\u001E'", 
		"'\\u001F'", "' '", "'!'", "'\"'", "'#'", "'$'", "'%'", "'&'", "'''", 
		"'('", "')'"
	};
	public static final String[] ruleNames = {
		"INICIO", "FIM", "MOSTRA", "CRIA", "ONDE", "TODOS", "DOIS_PONTOS", "OP_MAIS", 
		"OP_MENOS", "OP_MULT", "OP_DIV", "OP_PORCENTAGEM", "OP_MAIOR", "OP_MENOR", 
		"OP_MAIOR_IGUAL", "OP_MENOR_IGUAL", "OP_DIFERENTE", "OP_IGUAL", "ABRE_PARENTESE", 
		"FECHA_PARENTESE", "VIRGULA", "PONTO", "PONTO_E_VIRGULA", "ABRE_COLCHETE", 
		"FECHA_COLCHETE", "SETA", "VERDADEIRO", "FALSO", "VARCHAR", "LITERAL", 
		"INTEIRO", "REAL", "LOGICO", "IDENT", "COMENTARIO", "ESC_SEQ", "CADEIA", 
		"NUM_INT", "NUM_REAL", "WS", "UNDEFINED_CHAR"
	};


	public LSQLLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "LSQL.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 39: WS_action((RuleContext)_localctx, actionIndex); break;
		}
	}
	private void WS_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0: skip(); break;
		}
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2+\u010c\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3"+
		"\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\t"+
		"\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3"+
		"\20\3\21\3\21\3\21\3\22\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3"+
		"\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\33\3\34\3\34\3"+
		"\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3"+
		"\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3"+
		"\37\3 \3 \3 \3 \3 \3 \3 \3 \3!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3\"\3\""+
		"\3#\3#\7#\u00d9\n#\f#\16#\u00dc\13#\3$\3$\7$\u00e0\n$\f$\16$\u00e3\13"+
		"$\3$\3$\3$\3$\3%\3%\3%\3&\3&\3&\7&\u00ef\n&\f&\16&\u00f2\13&\3&\3&\3\'"+
		"\6\'\u00f7\n\'\r\'\16\'\u00f8\3(\6(\u00fc\n(\r(\16(\u00fd\3(\3(\6(\u0102"+
		"\n(\r(\16(\u0103\5(\u0106\n(\3)\3)\3)\3*\3*\2\2+\3\3\5\4\7\5\t\6\13\7"+
		"\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25"+
		")\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O"+
		")Q*S+\3\2\7\5\2C\\aac|\6\2\62;C\\aac|\5\2\f\f\17\17\177\177\4\2\f\f$$"+
		"\5\2\13\f\17\17\"\"\u0113\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2"+
		"\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2"+
		"\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3"+
		"\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2"+
		"\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67"+
		"\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2"+
		"\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2"+
		"\2Q\3\2\2\2\2S\3\2\2\2\3U\3\2\2\2\5\\\3\2\2\2\7`\3\2\2\2\tg\3\2\2\2\13"+
		"l\3\2\2\2\rq\3\2\2\2\17w\3\2\2\2\21y\3\2\2\2\23{\3\2\2\2\25}\3\2\2\2\27"+
		"\177\3\2\2\2\31\u0081\3\2\2\2\33\u0083\3\2\2\2\35\u0085\3\2\2\2\37\u0087"+
		"\3\2\2\2!\u008a\3\2\2\2#\u008d\3\2\2\2%\u0090\3\2\2\2\'\u0092\3\2\2\2"+
		")\u0094\3\2\2\2+\u0096\3\2\2\2-\u0098\3\2\2\2/\u009a\3\2\2\2\61\u009c"+
		"\3\2\2\2\63\u009e\3\2\2\2\65\u00a0\3\2\2\2\67\u00a3\3\2\2\29\u00ae\3\2"+
		"\2\2;\u00b4\3\2\2\2=\u00bc\3\2\2\2?\u00c2\3\2\2\2A\u00ca\3\2\2\2C\u00cf"+
		"\3\2\2\2E\u00d6\3\2\2\2G\u00dd\3\2\2\2I\u00e8\3\2\2\2K\u00eb\3\2\2\2M"+
		"\u00f6\3\2\2\2O\u00fb\3\2\2\2Q\u0107\3\2\2\2S\u010a\3\2\2\2UV\7k\2\2V"+
		"W\7p\2\2WX\7k\2\2XY\7e\2\2YZ\7k\2\2Z[\7q\2\2[\4\3\2\2\2\\]\7h\2\2]^\7"+
		"k\2\2^_\7o\2\2_\6\3\2\2\2`a\7o\2\2ab\7q\2\2bc\7u\2\2cd\7v\2\2de\7t\2\2"+
		"ef\7c\2\2f\b\3\2\2\2gh\7e\2\2hi\7t\2\2ij\7k\2\2jk\7c\2\2k\n\3\2\2\2lm"+
		"\7q\2\2mn\7p\2\2no\7f\2\2op\7g\2\2p\f\3\2\2\2qr\7v\2\2rs\7q\2\2st\7f\2"+
		"\2tu\7q\2\2uv\7u\2\2v\16\3\2\2\2wx\7<\2\2x\20\3\2\2\2yz\7-\2\2z\22\3\2"+
		"\2\2{|\7/\2\2|\24\3\2\2\2}~\7,\2\2~\26\3\2\2\2\177\u0080\7\61\2\2\u0080"+
		"\30\3\2\2\2\u0081\u0082\7\'\2\2\u0082\32\3\2\2\2\u0083\u0084\7@\2\2\u0084"+
		"\34\3\2\2\2\u0085\u0086\7>\2\2\u0086\36\3\2\2\2\u0087\u0088\7@\2\2\u0088"+
		"\u0089\7?\2\2\u0089 \3\2\2\2\u008a\u008b\7>\2\2\u008b\u008c\7?\2\2\u008c"+
		"\"\3\2\2\2\u008d\u008e\7>\2\2\u008e\u008f\7@\2\2\u008f$\3\2\2\2\u0090"+
		"\u0091\7?\2\2\u0091&\3\2\2\2\u0092\u0093\7*\2\2\u0093(\3\2\2\2\u0094\u0095"+
		"\7+\2\2\u0095*\3\2\2\2\u0096\u0097\7.\2\2\u0097,\3\2\2\2\u0098\u0099\7"+
		"\60\2\2\u0099.\3\2\2\2\u009a\u009b\7=\2\2\u009b\60\3\2\2\2\u009c\u009d"+
		"\7]\2\2\u009d\62\3\2\2\2\u009e\u009f\7_\2\2\u009f\64\3\2\2\2\u00a0\u00a1"+
		"\7/\2\2\u00a1\u00a2\7@\2\2\u00a2\66\3\2\2\2\u00a3\u00a4\7x\2\2\u00a4\u00a5"+
		"\7g\2\2\u00a5\u00a6\7t\2\2\u00a6\u00a7\7f\2\2\u00a7\u00a8\7c\2\2\u00a8"+
		"\u00a9\7f\2\2\u00a9\u00aa\7g\2\2\u00aa\u00ab\7k\2\2\u00ab\u00ac\7t\2\2"+
		"\u00ac\u00ad\7q\2\2\u00ad8\3\2\2\2\u00ae\u00af\7h\2\2\u00af\u00b0\7c\2"+
		"\2\u00b0\u00b1\7n\2\2\u00b1\u00b2\7u\2\2\u00b2\u00b3\7q\2\2\u00b3:\3\2"+
		"\2\2\u00b4\u00b5\7x\2\2\u00b5\u00b6\7c\2\2\u00b6\u00b7\7t\2\2\u00b7\u00b8"+
		"\7e\2\2\u00b8\u00b9\7j\2\2\u00b9\u00ba\7c\2\2\u00ba\u00bb\7t\2\2\u00bb"+
		"<\3\2\2\2\u00bc\u00bd\7v\2\2\u00bd\u00be\7g\2\2\u00be\u00bf\7z\2\2\u00bf"+
		"\u00c0\7v\2\2\u00c0\u00c1\7q\2\2\u00c1>\3\2\2\2\u00c2\u00c3\7k\2\2\u00c3"+
		"\u00c4\7p\2\2\u00c4\u00c5\7v\2\2\u00c5\u00c6\7g\2\2\u00c6\u00c7\7k\2\2"+
		"\u00c7\u00c8\7t\2\2\u00c8\u00c9\7q\2\2\u00c9@\3\2\2\2\u00ca\u00cb\7t\2"+
		"\2\u00cb\u00cc\7g\2\2\u00cc\u00cd\7c\2\2\u00cd\u00ce\7n\2\2\u00ceB\3\2"+
		"\2\2\u00cf\u00d0\7n\2\2\u00d0\u00d1\7q\2\2\u00d1\u00d2\7i\2\2\u00d2\u00d3"+
		"\7k\2\2\u00d3\u00d4\7e\2\2\u00d4\u00d5\7q\2\2\u00d5D\3\2\2\2\u00d6\u00da"+
		"\t\2\2\2\u00d7\u00d9\t\3\2\2\u00d8\u00d7\3\2\2\2\u00d9\u00dc\3\2\2\2\u00da"+
		"\u00d8\3\2\2\2\u00da\u00db\3\2\2\2\u00dbF\3\2\2\2\u00dc\u00da\3\2\2\2"+
		"\u00dd\u00e1\7}\2\2\u00de\u00e0\n\4\2\2\u00df\u00de\3\2\2\2\u00e0\u00e3"+
		"\3\2\2\2\u00e1\u00df\3\2\2\2\u00e1\u00e2\3\2\2\2\u00e2\u00e4\3\2\2\2\u00e3"+
		"\u00e1\3\2\2\2\u00e4\u00e5\7\177\2\2\u00e5\u00e6\3\2\2\2\u00e6\u00e7\b"+
		"$\2\2\u00e7H\3\2\2\2\u00e8\u00e9\7^\2\2\u00e9\u00ea\7$\2\2\u00eaJ\3\2"+
		"\2\2\u00eb\u00f0\7$\2\2\u00ec\u00ef\5I%\2\u00ed\u00ef\n\5\2\2\u00ee\u00ec"+
		"\3\2\2\2\u00ee\u00ed\3\2\2\2\u00ef\u00f2\3\2\2\2\u00f0\u00ee\3\2\2\2\u00f0"+
		"\u00f1\3\2\2\2\u00f1\u00f3\3\2\2\2\u00f2\u00f0\3\2\2\2\u00f3\u00f4\7$"+
		"\2\2\u00f4L\3\2\2\2\u00f5\u00f7\4\62;\2\u00f6\u00f5\3\2\2\2\u00f7\u00f8"+
		"\3\2\2\2\u00f8\u00f6\3\2\2\2\u00f8\u00f9\3\2\2\2\u00f9N\3\2\2\2\u00fa"+
		"\u00fc\4\62;\2\u00fb\u00fa\3\2\2\2\u00fc\u00fd\3\2\2\2\u00fd\u00fb\3\2"+
		"\2\2\u00fd\u00fe\3\2\2\2\u00fe\u0105\3\2\2\2\u00ff\u0101\7\60\2\2\u0100"+
		"\u0102\4\62;\2\u0101\u0100\3\2\2\2\u0102\u0103\3\2\2\2\u0103\u0101\3\2"+
		"\2\2\u0103\u0104\3\2\2\2\u0104\u0106\3\2\2\2\u0105\u00ff\3\2\2\2\u0105"+
		"\u0106\3\2\2\2\u0106P\3\2\2\2\u0107\u0108\t\6\2\2\u0108\u0109\b)\3\2\u0109"+
		"R\3\2\2\2\u010a\u010b\13\2\2\2\u010bT\3\2\2\2\13\2\u00da\u00e1\u00ee\u00f0"+
		"\u00f8\u00fd\u0103\u0105\4\b\2\2\3)\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}