package br.com.control.integracao;

public enum TabelasIntegracaoPortal {
	CADASTRO_GRUPO_PRODUTO("DBCONTROL9999999.GRPPRD01", "DBCONTROL1049999.VW_CADASTRO_GRUPO_PRODUTO"),
	CADASTRO_FAMILIA_PRODUTO("DBCONTROL2959001.CADFAM01", "DBCONTROL1049999.VW_CADASTRO_FAMILIA_PRODUTO"),
	CADASTRO_CATEGORIA_PRODUTO("DBCONTROL9999999.CADFAM01", "DBCONTROL1049999.VW_CADASTRO_CATEGORIA_PRODUTO"),
	CADASTRO_MARCA_PRODUTO("DBCONTROL2959001.CADFAM01", "DBCONTROL1049999.VW_CADASTRO_MARCA_PRODUTO");
	
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
