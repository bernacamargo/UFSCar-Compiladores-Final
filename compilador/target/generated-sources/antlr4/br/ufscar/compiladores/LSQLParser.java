// Generated from br/ufscar/compiladores/LSQL.g4 by ANTLR 4.3
package br.ufscar.compiladores;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class LSQLParser extends Parser {
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
	public static final String[] tokenNames = {
		"<INVALID>", "'inicio'", "'fim'", "'mostra'", "'cria'", "'onde'", "'todos'", 
		"':'", "'+'", "'-'", "'*'", "'/'", "'%'", "'>'", "'<'", "'>='", "'<='", 
		"'<>'", "'='", "'('", "')'", "','", "'.'", "';'", "'['", "']'", "'->'", 
		"'verdadeiro'", "'falso'", "'varchar'", "'texto'", "'inteiro'", "'real'", 
		"'logico'", "IDENT", "COMENTARIO", "'\\\"'", "CADEIA", "NUM_INT", "NUM_REAL", 
		"WS", "UNDEFINED_CHAR"
	};
	public static final int
		RULE_programa = 0, RULE_corpo = 1, RULE_cmd = 2, RULE_cmd_cria = 3, RULE_identificador = 4, 
		RULE_tipos_basicos = 5, RULE_cmd_mostra = 6, RULE_colunas = 7, RULE_expressao_relacional = 8, 
		RULE_op_relacional = 9, RULE_expressao_aritmetica = 10, RULE_termo = 11, 
		RULE_fator = 12, RULE_op1 = 13, RULE_op2 = 14;
	public static final String[] ruleNames = {
		"programa", "corpo", "cmd", "cmd_cria", "identificador", "tipos_basicos", 
		"cmd_mostra", "colunas", "expressao_relacional", "op_relacional", "expressao_aritmetica", 
		"termo", "fator", "op1", "op2"
	};

	@Override
	public String getGrammarFileName() { return "LSQL.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public LSQLParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramaContext extends ParserRuleContext {
		public CorpoContext corpo() {
			return getRuleContext(CorpoContext.class,0);
		}
		public TerminalNode EOF() { return getToken(LSQLParser.EOF, 0); }
		public TerminalNode FIM() { return getToken(LSQLParser.FIM, 0); }
		public TerminalNode INICIO() { return getToken(LSQLParser.INICIO, 0); }
		public ProgramaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programa; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LSQLListener ) ((LSQLListener)listener).enterPrograma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LSQLListener ) ((LSQLListener)listener).exitPrograma(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LSQLVisitor ) return ((LSQLVisitor<? extends T>)visitor).visitPrograma(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramaContext programa() throws RecognitionException {
		ProgramaContext _localctx = new ProgramaContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_programa);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(30); match(INICIO);
			setState(31); corpo();
			setState(32); match(FIM);
			setState(33); match(EOF);
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

	public static class CorpoContext extends ParserRuleContext {
		public CmdContext cmd(int i) {
			return getRuleContext(CmdContext.class,i);
		}
		public List<CmdContext> cmd() {
			return getRuleContexts(CmdContext.class);
		}
		public CorpoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_corpo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LSQLListener ) ((LSQLListener)listener).enterCorpo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LSQLListener ) ((LSQLListener)listener).exitCorpo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LSQLVisitor ) return ((LSQLVisitor<? extends T>)visitor).visitCorpo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CorpoContext corpo() throws RecognitionException {
		CorpoContext _localctx = new CorpoContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_corpo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(38);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MOSTRA || _la==CRIA) {
				{
				{
				setState(35); cmd();
				}
				}
				setState(40);
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

	public static class CmdContext extends ParserRuleContext {
		public Cmd_criaContext cmd_cria() {
			return getRuleContext(Cmd_criaContext.class,0);
		}
		public Cmd_mostraContext cmd_mostra() {
			return getRuleContext(Cmd_mostraContext.class,0);
		}
		public CmdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmd; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LSQLListener ) ((LSQLListener)listener).enterCmd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LSQLListener ) ((LSQLListener)listener).exitCmd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LSQLVisitor ) return ((LSQLVisitor<? extends T>)visitor).visitCmd(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CmdContext cmd() throws RecognitionException {
		CmdContext _localctx = new CmdContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_cmd);
		try {
			setState(43);
			switch (_input.LA(1)) {
			case MOSTRA:
				enterOuterAlt(_localctx, 1);
				{
				setState(41); cmd_mostra();
				}
				break;
			case CRIA:
				enterOuterAlt(_localctx, 2);
				{
				setState(42); cmd_cria();
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

	public static class Cmd_criaContext extends ParserRuleContext {
		public TerminalNode ABRE_COLCHETE() { return getToken(LSQLParser.ABRE_COLCHETE, 0); }
		public List<IdentificadorContext> identificador() {
			return getRuleContexts(IdentificadorContext.class);
		}
		public TerminalNode CRIA() { return getToken(LSQLParser.CRIA, 0); }
		public IdentificadorContext identificador(int i) {
			return getRuleContext(IdentificadorContext.class,i);
		}
		public TerminalNode VIRGULA(int i) {
			return getToken(LSQLParser.VIRGULA, i);
		}
		public TerminalNode FECHA_COLCHETE() { return getToken(LSQLParser.FECHA_COLCHETE, 0); }
		public List<TerminalNode> VIRGULA() { return getTokens(LSQLParser.VIRGULA); }
		public TerminalNode IDENT() { return getToken(LSQLParser.IDENT, 0); }
		public Cmd_criaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmd_cria; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LSQLListener ) ((LSQLListener)listener).enterCmd_cria(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LSQLListener ) ((LSQLListener)listener).exitCmd_cria(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LSQLVisitor ) return ((LSQLVisitor<? extends T>)visitor).visitCmd_cria(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Cmd_criaContext cmd_cria() throws RecognitionException {
		Cmd_criaContext _localctx = new Cmd_criaContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_cmd_cria);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(45); match(CRIA);
			setState(46); match(IDENT);
			setState(47); match(ABRE_COLCHETE);
			setState(48); identificador();
			setState(53);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VIRGULA) {
				{
				{
				setState(49); match(VIRGULA);
				setState(50); identificador();
				}
				}
				setState(55);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(56); match(FECHA_COLCHETE);
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

	public static class IdentificadorContext extends ParserRuleContext {
		public Tipos_basicosContext tipos_basicos() {
			return getRuleContext(Tipos_basicosContext.class,0);
		}
		public TerminalNode SETA() { return getToken(LSQLParser.SETA, 0); }
		public TerminalNode IDENT() { return getToken(LSQLParser.IDENT, 0); }
		public IdentificadorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identificador; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LSQLListener ) ((LSQLListener)listener).enterIdentificador(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LSQLListener ) ((LSQLListener)listener).exitIdentificador(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LSQLVisitor ) return ((LSQLVisitor<? extends T>)visitor).visitIdentificador(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentificadorContext identificador() throws RecognitionException {
		IdentificadorContext _localctx = new IdentificadorContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_identificador);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(58); match(IDENT);
			setState(59); match(SETA);
			setState(60); tipos_basicos();
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

	public static class Tipos_basicosContext extends ParserRuleContext {
		public TerminalNode REAL() { return getToken(LSQLParser.REAL, 0); }
		public TerminalNode INTEIRO() { return getToken(LSQLParser.INTEIRO, 0); }
		public TerminalNode LITERAL() { return getToken(LSQLParser.LITERAL, 0); }
		public TerminalNode VARCHAR() { return getToken(LSQLParser.VARCHAR, 0); }
		public Tipos_basicosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipos_basicos; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LSQLListener ) ((LSQLListener)listener).enterTipos_basicos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LSQLListener ) ((LSQLListener)listener).exitTipos_basicos(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LSQLVisitor ) return ((LSQLVisitor<? extends T>)visitor).visitTipos_basicos(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Tipos_basicosContext tipos_basicos() throws RecognitionException {
		Tipos_basicosContext _localctx = new Tipos_basicosContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_tipos_basicos);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(62);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VARCHAR) | (1L << LITERAL) | (1L << INTEIRO) | (1L << REAL))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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

	public static class Cmd_mostraContext extends ParserRuleContext {
		public TerminalNode MOSTRA() { return getToken(LSQLParser.MOSTRA, 0); }
		public Expressao_relacionalContext expressao_relacional(int i) {
			return getRuleContext(Expressao_relacionalContext.class,i);
		}
		public ColunasContext colunas() {
			return getRuleContext(ColunasContext.class,0);
		}
		public TerminalNode ONDE() { return getToken(LSQLParser.ONDE, 0); }
		public TerminalNode VIRGULA(int i) {
			return getToken(LSQLParser.VIRGULA, i);
		}
		public List<Expressao_relacionalContext> expressao_relacional() {
			return getRuleContexts(Expressao_relacionalContext.class);
		}
		public List<TerminalNode> VIRGULA() { return getTokens(LSQLParser.VIRGULA); }
		public TerminalNode IDENT() { return getToken(LSQLParser.IDENT, 0); }
		public Cmd_mostraContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmd_mostra; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LSQLListener ) ((LSQLListener)listener).enterCmd_mostra(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LSQLListener ) ((LSQLListener)listener).exitCmd_mostra(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LSQLVisitor ) return ((LSQLVisitor<? extends T>)visitor).visitCmd_mostra(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Cmd_mostraContext cmd_mostra() throws RecognitionException {
		Cmd_mostraContext _localctx = new Cmd_mostraContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_cmd_mostra);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(64); match(MOSTRA);
			setState(65); colunas();
			setState(66); match(IDENT);
			setState(67); match(ONDE);
			setState(68); expressao_relacional();
			setState(73);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VIRGULA) {
				{
				{
				setState(69); match(VIRGULA);
				setState(70); expressao_relacional();
				}
				}
				setState(75);
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

	public static class ColunasContext extends ParserRuleContext {
		public TerminalNode TODOS() { return getToken(LSQLParser.TODOS, 0); }
		public TerminalNode VIRGULA(int i) {
			return getToken(LSQLParser.VIRGULA, i);
		}
		public TerminalNode IDENT(int i) {
			return getToken(LSQLParser.IDENT, i);
		}
		public List<TerminalNode> VIRGULA() { return getTokens(LSQLParser.VIRGULA); }
		public List<TerminalNode> IDENT() { return getTokens(LSQLParser.IDENT); }
		public ColunasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_colunas; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LSQLListener ) ((LSQLListener)listener).enterColunas(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LSQLListener ) ((LSQLListener)listener).exitColunas(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LSQLVisitor ) return ((LSQLVisitor<? extends T>)visitor).visitColunas(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColunasContext colunas() throws RecognitionException {
		ColunasContext _localctx = new ColunasContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_colunas);
		int _la;
		try {
			setState(85);
			switch (_input.LA(1)) {
			case IDENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(76); match(IDENT);
				setState(81);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==VIRGULA) {
					{
					{
					setState(77); match(VIRGULA);
					setState(78); match(IDENT);
					}
					}
					setState(83);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case TODOS:
				enterOuterAlt(_localctx, 2);
				{
				setState(84); match(TODOS);
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

	public static class Expressao_relacionalContext extends ParserRuleContext {
		public Op_relacionalContext op_relacional() {
			return getRuleContext(Op_relacionalContext.class,0);
		}
		public Expressao_aritmeticaContext expressao_aritmetica(int i) {
			return getRuleContext(Expressao_aritmeticaContext.class,i);
		}
		public List<Expressao_aritmeticaContext> expressao_aritmetica() {
			return getRuleContexts(Expressao_aritmeticaContext.class);
		}
		public Expressao_relacionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressao_relacional; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LSQLListener ) ((LSQLListener)listener).enterExpressao_relacional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LSQLListener ) ((LSQLListener)listener).exitExpressao_relacional(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LSQLVisitor ) return ((LSQLVisitor<? extends T>)visitor).visitExpressao_relacional(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expressao_relacionalContext expressao_relacional() throws RecognitionException {
		Expressao_relacionalContext _localctx = new Expressao_relacionalContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_expressao_relacional);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(87); expressao_aritmetica();
			{
			setState(88); op_relacional();
			setState(89); expressao_aritmetica();
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

	public static class Op_relacionalContext extends ParserRuleContext {
		public TerminalNode OP_DIFERENTE() { return getToken(LSQLParser.OP_DIFERENTE, 0); }
		public TerminalNode OP_MENOR_IGUAL() { return getToken(LSQLParser.OP_MENOR_IGUAL, 0); }
		public TerminalNode OP_MAIOR() { return getToken(LSQLParser.OP_MAIOR, 0); }
		public TerminalNode OP_MAIOR_IGUAL() { return getToken(LSQLParser.OP_MAIOR_IGUAL, 0); }
		public TerminalNode OP_MENOR() { return getToken(LSQLParser.OP_MENOR, 0); }
		public TerminalNode OP_IGUAL() { return getToken(LSQLParser.OP_IGUAL, 0); }
		public Op_relacionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_relacional; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LSQLListener ) ((LSQLListener)listener).enterOp_relacional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LSQLListener ) ((LSQLListener)listener).exitOp_relacional(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LSQLVisitor ) return ((LSQLVisitor<? extends T>)visitor).visitOp_relacional(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Op_relacionalContext op_relacional() throws RecognitionException {
		Op_relacionalContext _localctx = new Op_relacionalContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_op_relacional);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(91);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OP_MAIOR) | (1L << OP_MENOR) | (1L << OP_MAIOR_IGUAL) | (1L << OP_MENOR_IGUAL) | (1L << OP_DIFERENTE) | (1L << OP_IGUAL))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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

	public static class Expressao_aritmeticaContext extends ParserRuleContext {
		public List<Op1Context> op1() {
			return getRuleContexts(Op1Context.class);
		}
		public List<TermoContext> termo() {
			return getRuleContexts(TermoContext.class);
		}
		public TermoContext termo(int i) {
			return getRuleContext(TermoContext.class,i);
		}
		public Op1Context op1(int i) {
			return getRuleContext(Op1Context.class,i);
		}
		public Expressao_aritmeticaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressao_aritmetica; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LSQLListener ) ((LSQLListener)listener).enterExpressao_aritmetica(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LSQLListener ) ((LSQLListener)listener).exitExpressao_aritmetica(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LSQLVisitor ) return ((LSQLVisitor<? extends T>)visitor).visitExpressao_aritmetica(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expressao_aritmeticaContext expressao_aritmetica() throws RecognitionException {
		Expressao_aritmeticaContext _localctx = new Expressao_aritmeticaContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_expressao_aritmetica);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(93); termo();
			setState(99);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OP_MAIS || _la==OP_MENOS) {
				{
				{
				setState(94); op1();
				setState(95); termo();
				}
				}
				setState(101);
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

	public static class TermoContext extends ParserRuleContext {
		public Op2Context op2(int i) {
			return getRuleContext(Op2Context.class,i);
		}
		public List<FatorContext> fator() {
			return getRuleContexts(FatorContext.class);
		}
		public List<Op2Context> op2() {
			return getRuleContexts(Op2Context.class);
		}
		public FatorContext fator(int i) {
			return getRuleContext(FatorContext.class,i);
		}
		public TermoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_termo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LSQLListener ) ((LSQLListener)listener).enterTermo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LSQLListener ) ((LSQLListener)listener).exitTermo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LSQLVisitor ) return ((LSQLVisitor<? extends T>)visitor).visitTermo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TermoContext termo() throws RecognitionException {
		TermoContext _localctx = new TermoContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_termo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(102); fator();
			setState(108);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OP_MULT || _la==OP_DIV) {
				{
				{
				setState(103); op2();
				setState(104); fator();
				}
				}
				setState(110);
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

	public static class FatorContext extends ParserRuleContext {
		public TerminalNode NUM_REAL() { return getToken(LSQLParser.NUM_REAL, 0); }
		public TerminalNode NUM_INT() { return getToken(LSQLParser.NUM_INT, 0); }
		public FatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LSQLListener ) ((LSQLListener)listener).enterFator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LSQLListener ) ((LSQLListener)listener).exitFator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LSQLVisitor ) return ((LSQLVisitor<? extends T>)visitor).visitFator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FatorContext fator() throws RecognitionException {
		FatorContext _localctx = new FatorContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_fator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(111);
			_la = _input.LA(1);
			if ( !(_la==NUM_INT || _la==NUM_REAL) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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

	public static class Op1Context extends ParserRuleContext {
		public TerminalNode OP_MENOS() { return getToken(LSQLParser.OP_MENOS, 0); }
		public TerminalNode OP_MAIS() { return getToken(LSQLParser.OP_MAIS, 0); }
		public Op1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LSQLListener ) ((LSQLListener)listener).enterOp1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LSQLListener ) ((LSQLListener)listener).exitOp1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LSQLVisitor ) return ((LSQLVisitor<? extends T>)visitor).visitOp1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Op1Context op1() throws RecognitionException {
		Op1Context _localctx = new Op1Context(_ctx, getState());
		enterRule(_localctx, 26, RULE_op1);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(113);
			_la = _input.LA(1);
			if ( !(_la==OP_MAIS || _la==OP_MENOS) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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

	public static class Op2Context extends ParserRuleContext {
		public TerminalNode OP_DIV() { return getToken(LSQLParser.OP_DIV, 0); }
		public TerminalNode OP_MULT() { return getToken(LSQLParser.OP_MULT, 0); }
		public Op2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LSQLListener ) ((LSQLListener)listener).enterOp2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LSQLListener ) ((LSQLListener)listener).exitOp2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LSQLVisitor ) return ((LSQLVisitor<? extends T>)visitor).visitOp2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Op2Context op2() throws RecognitionException {
		Op2Context _localctx = new Op2Context(_ctx, getState());
		enterRule(_localctx, 28, RULE_op2);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(115);
			_la = _input.LA(1);
			if ( !(_la==OP_MULT || _la==OP_DIV) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3+x\4\2\t\2\4\3\t\3"+
		"\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4\f"+
		"\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\3\2\3\2\3\2\3\2\3\2\3\3\7\3"+
		"\'\n\3\f\3\16\3*\13\3\3\4\3\4\5\4.\n\4\3\5\3\5\3\5\3\5\3\5\3\5\7\5\66"+
		"\n\5\f\5\16\59\13\5\3\5\3\5\3\6\3\6\3\6\3\6\3\7\3\7\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\7\bJ\n\b\f\b\16\bM\13\b\3\t\3\t\3\t\7\tR\n\t\f\t\16\tU\13\t"+
		"\3\t\5\tX\n\t\3\n\3\n\3\n\3\n\3\13\3\13\3\f\3\f\3\f\3\f\7\fd\n\f\f\f\16"+
		"\fg\13\f\3\r\3\r\3\r\3\r\7\rm\n\r\f\r\16\rp\13\r\3\16\3\16\3\17\3\17\3"+
		"\20\3\20\3\20\2\2\21\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36\2\7\3\2\37"+
		"\"\3\2\17\24\3\2()\3\2\n\13\3\2\f\rp\2 \3\2\2\2\4(\3\2\2\2\6-\3\2\2\2"+
		"\b/\3\2\2\2\n<\3\2\2\2\f@\3\2\2\2\16B\3\2\2\2\20W\3\2\2\2\22Y\3\2\2\2"+
		"\24]\3\2\2\2\26_\3\2\2\2\30h\3\2\2\2\32q\3\2\2\2\34s\3\2\2\2\36u\3\2\2"+
		"\2 !\7\3\2\2!\"\5\4\3\2\"#\7\4\2\2#$\7\2\2\3$\3\3\2\2\2%\'\5\6\4\2&%\3"+
		"\2\2\2\'*\3\2\2\2(&\3\2\2\2()\3\2\2\2)\5\3\2\2\2*(\3\2\2\2+.\5\16\b\2"+
		",.\5\b\5\2-+\3\2\2\2-,\3\2\2\2.\7\3\2\2\2/\60\7\6\2\2\60\61\7$\2\2\61"+
		"\62\7\32\2\2\62\67\5\n\6\2\63\64\7\27\2\2\64\66\5\n\6\2\65\63\3\2\2\2"+
		"\669\3\2\2\2\67\65\3\2\2\2\678\3\2\2\28:\3\2\2\29\67\3\2\2\2:;\7\33\2"+
		"\2;\t\3\2\2\2<=\7$\2\2=>\7\34\2\2>?\5\f\7\2?\13\3\2\2\2@A\t\2\2\2A\r\3"+
		"\2\2\2BC\7\5\2\2CD\5\20\t\2DE\7$\2\2EF\7\7\2\2FK\5\22\n\2GH\7\27\2\2H"+
		"J\5\22\n\2IG\3\2\2\2JM\3\2\2\2KI\3\2\2\2KL\3\2\2\2L\17\3\2\2\2MK\3\2\2"+
		"\2NS\7$\2\2OP\7\27\2\2PR\7$\2\2QO\3\2\2\2RU\3\2\2\2SQ\3\2\2\2ST\3\2\2"+
		"\2TX\3\2\2\2US\3\2\2\2VX\7\b\2\2WN\3\2\2\2WV\3\2\2\2X\21\3\2\2\2YZ\5\26"+
		"\f\2Z[\5\24\13\2[\\\5\26\f\2\\\23\3\2\2\2]^\t\3\2\2^\25\3\2\2\2_e\5\30"+
		"\r\2`a\5\34\17\2ab\5\30\r\2bd\3\2\2\2c`\3\2\2\2dg\3\2\2\2ec\3\2\2\2ef"+
		"\3\2\2\2f\27\3\2\2\2ge\3\2\2\2hn\5\32\16\2ij\5\36\20\2jk\5\32\16\2km\3"+
		"\2\2\2li\3\2\2\2mp\3\2\2\2nl\3\2\2\2no\3\2\2\2o\31\3\2\2\2pn\3\2\2\2q"+
		"r\t\4\2\2r\33\3\2\2\2st\t\5\2\2t\35\3\2\2\2uv\t\6\2\2v\37\3\2\2\2\n(-"+
		"\67KSWen";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}