package br.com.control.modelo;

public enum Sistema {
	SFA("222"), PORTAL_VENDAS("111");
	
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
