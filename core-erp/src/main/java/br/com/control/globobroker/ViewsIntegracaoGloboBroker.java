package br.com.control.globobroker;

public enum ViewsIntegracaoGloboBroker {

	VW_PEDIDO_ERPTERC_CAPA("VW_PEDIDO_ERPTERC_CAPA"), VW_PEDIDO_ERPTERC_ITEM("VW_PEDIDO_ERPTERC_ITEM");

	private String viewERP;

	private ViewsIntegracaoGloboBroker(String viewERP) {
		this.viewERP = viewERP;
	}

	public String getViewERP() {
		return viewERP;
	}

	public void setViewERP(String viewERP) {
		this.viewERP = viewERP;
	}
}
