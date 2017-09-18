package br.com.control.portal.integracao;

public enum TabelasIntegracao {
	CADASTRO_GRUPO_PRODUTO("GRPPRD01", "VW_CADASTRO_GRUPO_PRODUTO"), CADASTRO_FAMILIA_PRODUTO("CADFAM01",
			"VW_CADASTRO_FAMILIA_PRODUTO"), CADASTRO_CATEGORIA_PRODUTO("CATPRD01",
					"VW_CADASTRO_CATEGORIA_PRODUTO"), CADASTRO_MARCA_PRODUTO("MARPRD01",
							"VW_CADASTRO_MARCA_PRODUTO"), CADASTRO_SIGLA_ACOMPANHAMENTO_PEDIDO("CADSTATUSACOMPEDEDIDO",
									"VW_STATUS_PEDIDO"), CADASTRO_TIPO_COBRANCA("CADTIPOCOB",
											" VW_CAD_TIPO_COBRANCA"), CADASTRO_CONDICAO_PAGAMENTO("CADCONDPAG",
													"VW_CAD_CONDICAO_PAGAMENTO"), CADASTRO_CANAL("CADCANAL",
															" VW_CAD_CANAL"), CADASTRO_CLIENTE("CADCLIENTE",
																	" VW_CADASTRO_CLIENTE"), CADASTRO_VENDEDOR(
																			"CADVENDEDOR",
																			"VW_CADASTRO_VENDEDOR"), CADASTRO_TIPO_ENDERECO(
																					"TIPOENDERECO",
																					"VW_TIPO_ENDERECO"), CADASTRO_PRODUTO(
																							"CADPRODUTO",
																							"VW_CADASTRO_PRODUTO"), CADASTRO_DETALHE_PRODUTO_COMBO(
																									"CADDETALHECOMBOPROD",
																									"VW_CADASTRO_DETALHE_PRODUTO_COMBO"), CADASTRO_PRECO(
																											"CADPRECO",
																											"VW_CADASTRO_PRECO"), SIS_CADASTRO_TIPO_OCORRENCIA(
																													"SISCADTIPOOCORRENCIA",
																													"VW_CADASTRO_TIPO_OCORRENCIA"), CADASTRO_OCORRENCIA(
																															"CADOCORRENCIA",
																															"VW_CADASTRO_OCORRENCIA"), CADASTRO_PEDIDO_CAPA(
																																	"CADPEDCAPA",
																																	"VW_CAD_PEDIDO_CAPA"), STATUS_ACOMPANHAMENTO_PEDIDO(
																																			"VDPEDFLC",
																																			"VW_STATUS_PEDIDO"), CADASTRO_BANDA_PRECO(
																																					"CADBANDAPRECO",
																																					"VW_CADASTRO_BANDA_PRECO"), PEDIDO_ITEM(
																																							"PEDIDOITEM",
																																							"VW_PEDIDO_ITEM"), HISTORICO_PEDIDO_CAPA(
																																									"HISTORICOPEDCAPA",
																																									"VW_HISTORICO_PEDIDO_CAPA"), HISTORICO_PEDIDO_ITEM(
																																											"HISTORICOPEDITEM",
																																											"VW_HISTORICO_PEDIDO_ITEM"), SIS_ORIGEM_LOGRADOURO(
																																													"SISORIGEMLOGRA",
																																													"VW_SIS_ORIGEM_LOGRADOURO"), CADASTRO_CLIENTE_ENDERECO(
																																															"CADCLIENTEEND",
																																															"VW_CADASTRO_CLIENTE_ENDERECO"), TIPO_COBRANCA_CLIENTE(
																																																	"TIPOCOBRANCACLIETE",
																																																	"VW_CADASTRO_TIPO_COBRANCA_CLIENTE"), CADASTRO_MOTIVO_GERAL(
																																																			"MOTIVOGERAL",
																																																			"VW_CADASTRO_MOTIVO_GERAL"), ACOMPANHAMENTO_PEDIDO_MOTIVO_CAPA(
																																																					"ACOMPEDIDOMOTCAPA",
																																																					"VW_ACOMP_PEDIDO_MOTIVO_CAPA"), ACOMPANHAMENTO_PEDIDO_MOTIVO_ITEM(
																																																							"ACOMPEDIDOMOTITEM",
																																																							"VW_ACOMP_PEDIDO_MOTIVO_ITEM"), CADASTRO_VENDEDOR_CLIENTE(
																																																									"CADVENDEDORCLIENTE",
																																																									"VW_CADASTRO_VENDEDOR_CLIENTE"), MOVIMENTO_FINANCEIRO(
																																																											"MOVIFINANCEIRO",
																																																											"VW_MOVIMENTO_FINANCEIRO"), COMODATO(
																																																													"COMODATO",
																																																													"VW_COMODATO"), CADASTRO_BANDA_PRECO_RESTRICAO(
																																																															"CADBANDAPRECOREST",
																																																															"VW_CAD_BANDA_PRECO_REST"), CADASTRO_RESTRICAO_COMERCIAL(
																																																																	"CADRESTCOMERCIAL",
																																																																	"VW_CADASTRO_RESTRICAO_COMERCIAL"), CADASTRO_RESTRICAO_COMERCIAL_ITEM(
																																																																			"CADRESTCOMITEM",
																																																																			"VW_CADASTRO_RESTRICAO_COMERCIAL_ITEM"), CADASTRO_BANDA_PRECO_ITEM(
																																																																					"CADBANDAPRECOITEM",
																																																																					"VW_CADASTRO_BANDA_PRECO_ITEM"), CADASTRO_RESTRICAO_FINANCEIRA(
																																																																							"RESTRICAOFINANCEIRA",
																																																																							"VW_CAD_REST_FINANCEIRA"), CADASTRO_RESTRICAO_FINANCEIRA_ITEM(
																																																																									"RESTRICAOFINANCEIRAITEM",
																																																																									"VW_CAD_REST_FINANCEIRA_ITEM"), VENDA_PEDIDO_LIBERADO(
																																																																											"PEDIDOLIBERADO",
																																																																											"VW_PEDIDO_LIBERADO"), VENDA_PEDIDO_RECUSADO(
																																																																													"PEDIDORECUSADO",
																																																																													"VW_PEDIDO_RECUSADO"), TESTE(
																																																																															"",
																																																																															""), PEDIDO_BLOQUEADO(
																																																																																	"PEDCP01",
																																																																																	"VW_PEDIDO_BLOQUEADO"), VENDA_PEDIDO_SUGESTAO(
																																																																																			"",
																																																																																			"VW_SUGESTAO_PEDIDO"), CADASTRO_PRODUTO_CANAL(
																																																																																					"",
																																																																																					"VW_CANAL_VS_PRODUTO"), CADASTRO_PAROCO(
																																																																																							"",
																																																																																							"VW_PAROCO");

	private String tabelaERP;
	private String viewERP;

	private TabelasIntegracao(String tabelaERP, String viewERP) {
		this.tabelaERP = tabelaERP;
		this.viewERP = viewERP;
	}

	public String getTabelaERP() {
		return tabelaERP;
	}

	public void setTabelaERP(String tabelaERP) {
		this.tabelaERP = tabelaERP;
	}

	public String getViewERP() {
		return viewERP;
	}

	public void setViewERP(String viewERP) {
		this.viewERP = viewERP;
	}
}
