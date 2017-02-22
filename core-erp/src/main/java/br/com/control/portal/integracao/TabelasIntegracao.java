package br.com.control.portal.integracao;

public enum TabelasIntegracao {
	CADASTRO_GRUPO_PRODUTO("DBCONTROL9999999.GRPPRD01", "DBCONTROL1049999.VW_CADASTRO_GRUPO_PRODUTO"),
	CADASTRO_FAMILIA_PRODUTO("DBCONTROL2959001.CADFAM01", "DBCONTROL1049999.VW_CADASTRO_FAMILIA_PRODUTO"),
	CADASTRO_CATEGORIA_PRODUTO("DBCONTROL9999999.CATPRD01", "DBCONTROL1049999.VW_CADASTRO_CATEGORIA_PRODUTO"),
	CADASTRO_MARCA_PRODUTO("DBCONTROL2959001.MARPRD01", "DBCONTROL1049999.VW_CADASTRO_MARCA_PRODUTO"),
	CADASTRO_SIGLA_ACOMPANHAMENTO_PEDIDO("DBCONTROL1049999.CADSTATUSACOMPEDEDIDO"," DBCONTROL10	49999.VW_STATUS_PEDIDO"),
	CADASTRO_TIPO_COBRANCA("DBCONTROL1049999.CADTIPOCOB"," DBCONTROL1049999.VW_CAD_TIPO_COBRANCA"),
	CADASTRO_CONDICAO_PAGAMENTO("DBCONTROL1049999.CADCONDPAG"," DBCONTROL1049999.VW_CAD_CONDICAO_PAGAMENTO"),
	CADASTRO_CANAL("DBCONTROL1049999.CADCANAL"," DBCONTROL1049999.VW_CAD_CANAL"),
	CADASTRO_CLIENTE("DBCONTROL1049999.CADCLIENTE"," DBCONTROL1049999.VW_CADASTRO_CLIENTE"),
	CADASTRO_VENDEDOR("DBCONTROL1049999.CADVENDEDOR","DBCONTROL1049999.VW_CADASTRO_VENDEDOR"),
	CADASTRO_TIPO_ENDERECO("DBCONTROL1049999.TIPOENDERECO","DBCONTROL1049999.VW_TIPO_ENDERECO"),
	CADASTRO_PRODUTO("DBCONTROL1049999.CADPRODUTO","DBCONTROL1049999.VW_CADASTRO_PRODUTO"),
	CADASTRO_DETALHE_PRODUTO_COMBO("DBCONTROL1049999.CADDETALHECOMBOPROD","DBCONTROL1049999.VW_CADASTRO_DETALHE_PRODUTO_COMBO"),
	CADASTRO_PRECO("DBCONTROL1049999.CADPRECO","DBCONTROL1049999.VW_CADASTRO_PRECO"),
	SIS_CADASTRO_TIPO_OCORRENCIA("DBCONTROL1049999.SISCADTIPOOCORRENCIA","DBCONTROL1049999.VW_CADASTRO_TIPO_OCORRENCIA"),
	CADASTRO_OCORRENCIA("DBCONTROL1049999.CADOCORRENCIA","DBCONTROL1049999.VW_CADASTRO_OCORRENCIA"),
	CADASTRO_PEDIDO_CAPA("DBCONTROL1049999.CADPEDCAPA","DBCONTROL1049999.VW_CAD_PEDIDO_CAPA"),
	STATUS_ACOMPANHAMENTO_PEDIDO("DBCONTROL1049999.VDPEDFLC","DBCONTROL1049999.VW_STATUS_PEDIDO"),
	CADASTRO_BANDA_PRECO("DBCONTROL1049999.CADBANDAPRECO","DBCONTROL1049999.VW_CADASTRO_BANDA_PRECO"),
	PEDIDO_ITEM("DBCONTROL1049999.PEDIDOITEM","DBCONTROL1049999.VW_PEDIDO_ITEM"),
	HISTORICO_PEDIDO_CAPA("DBCONTROL1049999.HISTORICOPEDCAPA","DBCONTROL1049999.VW_HISTORICO_PEDIDO_CAPA"),
	HISTORICO_PEDIDO_ITEM("DBCONTROL1049999.HISTORICOPEDITEM","DBCONTROL1049999.VW_HISTORICO_PEDIDO_ITEM"),
	SIS_ORIGEM_LOGRADOURO("DBCONTROL1049999.SISORIGEMLOGRA","DBCONTROL1049999.VW_SIS_ORIGEM_LOGRADOURO"),
	CADASTRO_CLIENTE_ENDERECO("DBCONTROL1049999.CADCLIENTEEND","DBCONTROL1049999.VW_CADASTRO_CLIENTE_ENDERECO"),
	TIPO_COBRANCA_CLIENTE("DBCONTROL1049999.TIPOCOBRANCACLIETE","DBCONTROL1049999.VW_CADASTRO_TIPO_COBRANCA_CLIENTE"),
	CADASTRO_MOTIVO_GERAL("DBCONTROL1049999.MOTIVOGERAL","DBCONTROL1049999.VW_CADASTRO_MOTIVO_GERAL"),
	ACOMPANHAMENTO_PEDIDO_MOTIVO_CAPA("DBCONTROL1049999.ACOMPEDIDOMOTCAPA","DBCONTROL1049999.VW_ACOMP_PEDIDO_MOTIVO_CAPA"),
	ACOMPANHAMENTO_PEDIDO_MOTIVO_ITEM("DBCONTROL1049999.ACOMPEDIDOMOTITEM","DBCONTROL1049999.VW_ACOMP_PEDIDO_MOTIVO_ITEM"),
	CADASTRO_VENDEDOR_CLIENTE("DBCONTROL1049999.CADVENDEDORCLIENTE","DBCONTROL1049999.VW_CADASTRO_VENDEDOR_CLIENTE"),
	MOVIMENTO_FINANCEIRO("DBCONTROL1049999.MOVIFINANCEIRO","DBCONTROL1049999.VW_MOVIMENTO_FINANCEIRO"),
	COMODATO("DBCONTROL1049999.COMODATO","DBCONTROL1049999.VW_COMODATO"),
	CADASTRO_BANDA_PRECO_RESTRICAO("DBCONTROL1049999.CADBANDAPRECOREST","DBCONTROL1049999.VW_CAD_BANDA_PRECO_REST"),
	CADASTRO_RESTRICAO_COMERCIAL("DBCONTROL1049999.CADRESTCOMERCIAL","DBCONTROL1049999.VW_CADASTRO_RESTRICAO_COMERCIAL"),
	CADASTRO_RESTRICAO_COMERCIAL_ITEM("DBCONTROL1049999.CADRESTCOMITEM","DBCONTROL1049999.VW_CADASTRO_RESTRICAO_COMERCIAL_ITEM"),
	CADASTRO_BANDA_PRECO_ITEM("DBCONTROL1049999.CADBANDAPRECOITEM","DBCONTROL1049999.VW_CADASTRO_BANDA_PRECO_ITEM"),
	CADASTRO_RESTRICAO_FINANCEIRA("DBCONTROL1049999.RESTRICAOFINANCEIRA","DBCONTROL1049999.VW_CAD_REST_FINANCEIRA"),
	CADASTRO_RESTRICAO_FINANCEIRA_ITEM("DBCONTROL1049999.RESTRICAOFINANCEIRAITEM","DBCONTROL1049999.VW_CAD_REST_FINANCEIRA_ITEM"),
	VENDA_PEDIDO_LIBERADO("DBCONTROL1049999.PEDIDOLIBERADO","DBCONTROL1049999.VW_PEDIDO_LIBERADO"),
	VENDA_PEDIDO_RECUSADO("DBCONTROL1049999.PEDIDORECUSADO","DBCONTROL1049999.VW_PEDIDO_RECUSADO"),
	TESTE("",""),
	PEDIDO_BLOQUEADO("DBCONTROL1049999.PEDCP01","VW_PEDIDO_BLOQUEADO");
	
	
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
