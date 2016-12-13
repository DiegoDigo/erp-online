package br.com.control.rest.client;

public enum Sistema {
	ERP("001"), PORTAL_VENDAS("002"), SFA("003");
	
	private String segredo;

	private Sistema(String segredo) {
		this.segredo = segredo;
	}

	public String getSegredo() {
		return segredo;
	}

	public void setSegredo(String segredo) {
		this.segredo = segredo;
	}
	
	
}
