package br.com.control.autenticacao.modelo;

public enum Sistema {
	PORTAL_VENDAS("001"), SFA("002");
	
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
