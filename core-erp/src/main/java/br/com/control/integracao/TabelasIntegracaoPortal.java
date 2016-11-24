package br.com.control.integracao;

public enum TabelasIntegracaoPortal {
	CADASTRO_GRUPO_PRODUTO("DBCONTROL9999999.GRPPRD01", "DBCONTROL1049999.VW_CADASTRO_GRUPO_PRODUTO"),
	CADASTRO_FAMILIA_PRODUTO("DBCONTROL2959001.CADFAM01", "DBCONTROL1049999.VW_CADASTRO_FAMILIA_PRODUTO"),
	CADASTRO_CATEGORIA_PRODUTO("DBCONTROL9999999.CATPRD01", "DBCONTROL1049999.VW_CADASTRO_CATEGORIA_PRODUTO"),
	CADASTRO_MARCA_PRODUTO("DBCONTROL2959001.MARPRD01", "DBCONTROL1049999.VW_CADASTRO_MARCA_PRODUTO"),
	CADASTRO_SIGLA_ACOMPANHAMENTO_PEDIDO("DBCONTROL1049999.CADSTATUSACOMPEDEDIDO"," DBCONTROL1049999.VW_STATUSPEDIDO"),
	CADASTRO_TIPO_COBRANCA("DBCONTROL1049999.CADTIPOCOB"," DBCONTROL1049999.VW_CAD_TIPO_CABRANCA"),
	CADASTRO_CONDICAO_PAGAMENTO("DBCONTROL1049999.CADCONDPAG"," DBCONTROL1049999.VW_CAD_CONDICAO_PAGAMENTO"),
	CADASTRO_CANAL("DBCONTROL1049999.CADCANAL"," DBCONTROL1049999.VW_CAD_CANAL"),
	CADASTRO_CLIENTE("DBCONTROL1049999.CADCLIENTE"," DBCONTROL1049999.VW_CAD_CLIENTE"),
	CADASTRO_VENDEDOR("DBCONTROL1049999.CADVENDEDOR"," DBCONTROL1049999.VW_CAD_VENDEDOR"),
	CADASTRO_TIPO_ENDERECO("DBCONTROL1049999.TIPOENDERECO","DBCONTROL1049999.VW_TIPO_ENDERECO"),
	CADASTRO_PRODUTO("DBCONTROL1049999.CADPRODUTO","DBCONTROL1049999.VW_CAD_PRODUTO"),
	CADASTRO_DETALHE_PRODUTO_COMBO("DBCONTROL1049999.CADDETALHECOMBOPROD","DBCONTROL1049999.VW_CAD_DETALHE_COMBO_PRODUTO"),
	CADASTRO_PRECO("DBCONTROL1049999.CADPRECO","DBCONTROL1049999.VW_CAD_PRECO"),
	SIS_CADASTRO_TIPO_OCORRENCIA("DBCONTROL1049999.SISCADTIPOOCORRENCIA","DBCONTROL1049999.VW_SIS_CAD_TIPO_OCORRENCIA"),
	CADASTRO_OCORRENCIA("DBCONTROL1049999.CADOCORRENCIA","DBCONTROL1049999.VW_CAD_OCORRENCIA"),
	CADASTRO_PEDIDO_CAPA("DBCONTROL1049999.CADPEDCAPA","DBCONTROL1049999.VW_CAD_PEDIDO_CAPA"),
	ACOMPANHAMENTO_PEDIDO_CAPA("DBCONTROL1049999.ACOMPEDIDOCAPA","DBCONTROL1049999.VW_ACOM_PEDIDO_CAPA"),
	CADASTRO_BANDA_PRECO("DBCONTROL1049999.CADBANDAPRECO","DBCONTROL1049999.VW_CAD_BANDA_PRECO"),
	PEDIDO_ITEM("DBCONTROL1049999.PEDIDOITEM","DBCONTROL1049999.VW_PEDIDO_ITEM"),
	HISTORICO_PEDIDO_CAPA("DBCONTROL1049999.HISTORICOPEDCAPA","DBCONTROL1049999.VW_HISTORICO_PEDIDO_CAPA");
	
	private String tabelaERP;
	private String viewERP;

	private TabelasIntegracaoPortal(String tabelaERP, String viewERP) {
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