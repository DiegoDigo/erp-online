package br.com.control.portal.integracao;

public enum ViewsIntegracaoERP {
	VW_GRUPO_PRODUTO("VW_GRUPO_PRODUTO"),
	VW_FAMILIA_PRODUTO("VW_FAMILIA_PRODUTO"),
	VW_CATEGORIA_PRODUTO("VW_CATEGORIA_PRODUTO"),
	VW_MARCA_PRODUTO("VW_MARCA_PRODUTO"),
	VW_TIPO_COBRANCA("VW_TIPO_COBRANCA"),
	VW_CONDICAO_PAGAMENTO("VW_CONDICAO_PAGAMENTO"),
	VW_CANAL_VENDA("VW_CANAL_VENDA"),
	VW_CLIENTE("VW_CLIENTE"),
	VW_VENDEDOR("VW_VENDEDOR"),
	VW_TIPO_ENDERECO("VW_TIPO_ENDERECO"),
	VW_PRODUTO("VW_PRODUTO"),
	VW_COMBO_PRODUTO("VW_COMBO_PRODUTO"),
	VW_PRECO_PRODUTO("VW_PRECO_PRODUTO"),
	VW_OCORRENCIA("VW_OCORRENCIA"),
	VW_ACOMPANHAMENTO_PEDIDO("VW_ACOMPANHAMENTO_PEDIDO"),
	VW_BANDA_PRECO_CAPA("VW_BANDA_PRECO_CAPA"),
	VW_BANDA_PRECO_ITEM("VW_BANDA_PRECO_ITEM"),
	VW_RESTRICAO_FINANCEIRA_CAPA("VW_RESTRICAO_FINANCEIRA_CAPA"),
	VW_RESTRICAO_FINANCEIRA_ITEM("VW_RESTRICAO_FINANCEIRA_ITEM"),
	VW_HISTORICO_PEDIDO_CAPA("VW_HISTORICO_PEDIDO_CAPA"),
	VW_HISTORICO_PEDIDO_ITEM("VW_HISTORICO_PEDIDO_ITEM"),
	VW_ENDERECO("VW_ENDERECO"),
	VW_TIPO_COBRANCA_CLIENTE("VW_TIPO_COBRANCA_CLIENTE"),
	VW_MOTIVO_GERAL("VW_MOTIVO_GERAL"),
	VW_VENDEDOR_CLIENTE("VW_VENDEDOR_CLIENTE"),
	VW_MOVIMENTO_FINANCEIRO("VW_MOVIMENTO_FINANCEIRO"),
	VW_COMODATO("VW_COMODATO"),
	VW_PEDIDO_PENDENTE_LIBERACAO("VW_PEDIDO_PENDENTE_LIBERACAO"),
	VW_PEDIDO_SUGESTAO("VW_PEDIDO_SUGESTAO"),
	VW_PRODUTOS_POR_CANAL("VW_PRODUTOS_POR_CANAL"),
	VW_PAROCO("VW_PAROCO"),
	VW_DIAS_VISITA_VENDEDOR("VW_DIAS_VISITA_VENDEDOR"),
	VW_ITEM_CORTADO_PRE_PEDIDO("VW_ITEM_CORTADO_PRE_PEDIDO"),
	VW_CH_NFISCAL("VW_CH_NFISCAL"),
	VW_CADASTRO_RESTRICAO_COMERCIAL_ITEM("VW_CADASTRO_RESTRICAO_COMERCIAL_ITEM"),
	VW_CADASTRO_RESTRICAO_COMERCIAL("VW_CADASTRO_RESTRICAO_COMERCIAL"),
	VW_BOLETO_POR_PEDIDO("VW_BOLETO_POR_PEDIDO"),
	VW_BOLETO("VW_BOLETO");
	//	VENDA_PEDIDO_LIBERADO("VW_PEDIDO_LIBERADO"),
//	VENDA_PEDIDO_RECUSADO("VW_PEDIDO_RECUSADO"),
//	VW_PEDIDO_ITEM("VW_PEDIDO_ITEM"),
//	CADASTRO_BANDA_PRECO_RESTRICAO("VW_CAD_BANDA_PRECO_REST"),

	private String viewERP;

	private ViewsIntegracaoERP(String viewERP) {
		this.viewERP = viewERP;
	}


	public String getViewERP() {
		return viewERP;
	}

	public void setViewERP(String viewERP) {
		this.viewERP = viewERP;
	}
}
