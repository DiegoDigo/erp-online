package br.com.control.portal.enums;

public enum CadastrosEnum {

	GRUPO_PRODUTO,
	FAMILIA_PRODUTO,
	CATEGORIA_PRODUTO,
	MARCA_PRODUTO,
	PRODUTO,
	PRODUTO_CANAL,
	PRODUTO_COMBO,
	TIPO_COBRANCA,
	CONDICAO_PAGAMENTO,
	CANAL,
	TIPO_ENDERECO,
	TIPO_OCORRENCIA,
	OCORRENCIA,
	ORIGEM_LOGRADOURO,
	CLIENTE,
	CLIENTE_ENDERECO,
	TIPO_MOTIVO_GERAL,
	VENDEDOR,
	VENDEDOR_CLIENTE,
	TIPO_COBRANCA_CLIENTE,
	MOVIMENTO_FINANCEIRO,
	HISTORICO_PEDIDO_CAPA,
	COMODATO,
	BANDA_PRECO,
	RESTRICAO_FINANCEIRA,
	TABELA_PRECO,
	PEDIDO_PENDENTE_LIBERACAO,
	PEDIDO_SUGESTAO,
	PAROCO,
	CORTE_ITEM_PREPEDIDO,
	VISITAS;

	public static CadastrosEnum recuperaCadastro(String nome) {
		for (CadastrosEnum cadastro : CadastrosEnum.values()) {
			if (cadastro.toString().equals(nome)) {
				return cadastro;
			}
		}
		return null;
	}
}
