// Generated from br/ufscar/compiladores/LSQL.g4 by ANTLR 4.3
package br.ufscar.compiladores;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link LSQLParser}.
 */
public interface LSQLListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link LSQLParser#corpo}.
	 * @param ctx the parse tree
	 */
	void enterCorpo(@NotNull LSQLParser.CorpoContext ctx);
	/**
	 * Exit a parse tree produced by {@link LSQLParser#corpo}.
	 * @param ctx the parse tree
	 */
	void exitCorpo(@NotNull LSQLParser.CorpoContext ctx);

	/**
	 * Enter a parse tree produced by {@link LSQLParser#cmd_cria}.
	 * @param ctx the parse tree
	 */
	void enterCmd_cria(@NotNull LSQLParser.Cmd_criaContext ctx);
	/**
	 * Exit a parse tree produced by {@link LSQLParser#cmd_cria}.
	 * @param ctx the parse tree
	 */
	void exitCmd_cria(@NotNull LSQLParser.Cmd_criaContext ctx);

	/**
	 * Enter a parse tree produced by {@link LSQLParser#programa}.
	 * @param ctx the parse tree
	 */
	void enterPrograma(@NotNull LSQLParser.ProgramaContext ctx);
	/**
	 * Exit a parse tree produced by {@link LSQLParser#programa}.
	 * @param ctx the parse tree
	 */
	void exitPrograma(@NotNull LSQLParser.ProgramaContext ctx);

	/**
	 * Enter a parse tree produced by {@link LSQLParser#expressao_relacional}.
	 * @param ctx the parse tree
	 */
	void enterExpressao_relacional(@NotNull LSQLParser.Expressao_relacionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link LSQLParser#expressao_relacional}.
	 * @param ctx the parse tree
	 */
	void exitExpressao_relacional(@NotNull LSQLParser.Expressao_relacionalContext ctx);

	/**
	 * Enter a parse tree produced by {@link LSQLParser#tipos_basicos}.
	 * @param ctx the parse tree
	 */
	void enterTipos_basicos(@NotNull LSQLParser.Tipos_basicosContext ctx);
	/**
	 * Exit a parse tree produced by {@link LSQLParser#tipos_basicos}.
	 * @param ctx the parse tree
	 */
	void exitTipos_basicos(@NotNull LSQLParser.Tipos_basicosContext ctx);

	/**
	 * Enter a parse tree produced by {@link LSQLParser#colunas}.
	 * @param ctx the parse tree
	 */
	void enterColunas(@NotNull LSQLParser.ColunasContext ctx);
	/**
	 * Exit a parse tree produced by {@link LSQLParser#colunas}.
	 * @param ctx the parse tree
	 */
	void exitColunas(@NotNull LSQLParser.ColunasContext ctx);

	/**
	 * Enter a parse tree produced by {@link LSQLParser#op2}.
	 * @param ctx the parse tree
	 */
	void enterOp2(@NotNull LSQLParser.Op2Context ctx);
	/**
	 * Exit a parse tree produced by {@link LSQLParser#op2}.
	 * @param ctx the parse tree
	 */
	void exitOp2(@NotNull LSQLParser.Op2Context ctx);

	/**
	 * Enter a parse tree produced by {@link LSQLParser#expressao_aritmetica}.
	 * @param ctx the parse tree
	 */
	void enterExpressao_aritmetica(@NotNull LSQLParser.Expressao_aritmeticaContext ctx);
	/**
	 * Exit a parse tree produced by {@link LSQLParser#expressao_aritmetica}.
	 * @param ctx the parse tree
	 */
	void exitExpressao_aritmetica(@NotNull LSQLParser.Expressao_aritmeticaContext ctx);

	/**
	 * Enter a parse tree produced by {@link LSQLParser#termo}.
	 * @param ctx the parse tree
	 */
	void enterTermo(@NotNull LSQLParser.TermoContext ctx);
	/**
	 * Exit a parse tree produced by {@link LSQLParser#termo}.
	 * @param ctx the parse tree
	 */
	void exitTermo(@NotNull LSQLParser.TermoContext ctx);

	/**
	 * Enter a parse tree produced by {@link LSQLParser#op1}.
	 * @param ctx the parse tree
	 */
	void enterOp1(@NotNull LSQLParser.Op1Context ctx);
	/**
	 * Exit a parse tree produced by {@link LSQLParser#op1}.
	 * @param ctx the parse tree
	 */
	void exitOp1(@NotNull LSQLParser.Op1Context ctx);

	/**
	 * Enter a parse tree produced by {@link LSQLParser#cmd_mostra}.
	 * @param ctx the parse tree
	 */
	void enterCmd_mostra(@NotNull LSQLParser.Cmd_mostraContext ctx);
	/**
	 * Exit a parse tree produced by {@link LSQLParser#cmd_mostra}.
	 * @param ctx the parse tree
	 */
	void exitCmd_mostra(@NotNull LSQLParser.Cmd_mostraContext ctx);

	/**
	 * Enter a parse tree produced by {@link LSQLParser#op_relacional}.
	 * @param ctx the parse tree
	 */
	void enterOp_relacional(@NotNull LSQLParser.Op_relacionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link LSQLParser#op_relacional}.
	 * @param ctx the parse tree
	 */
	void exitOp_relacional(@NotNull LSQLParser.Op_relacionalContext ctx);

	/**
	 * Enter a parse tree produced by {@link LSQLParser#fator}.
	 * @param ctx the parse tree
	 */
	void enterFator(@NotNull LSQLParser.FatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link LSQLParser#fator}.
	 * @param ctx the parse tree
	 */
	void exitFator(@NotNull LSQLParser.FatorContext ctx);

	/**
	 * Enter a parse tree produced by {@link LSQLParser#cmd}.
	 * @param ctx the parse tree
	 */
	void enterCmd(@NotNull LSQLParser.CmdContext ctx);
	/**
	 * Exit a parse tree produced by {@link LSQLParser#cmd}.
	 * @param ctx the parse tree
	 */
	void exitCmd(@NotNull LSQLParser.CmdContext ctx);

	/**
	 * Enter a parse tree produced by {@link LSQLParser#identificador}.
	 * @param ctx the parse tree
	 */
	void enterIdentificador(@NotNull LSQLParser.IdentificadorContext ctx);
	/**
	 * Exit a parse tree produced by {@link LSQLParser#identificador}.
	 * @param ctx the parse tree
	 */
	void exitIdentificador(@NotNull LSQLParser.IdentificadorContext ctx);
}