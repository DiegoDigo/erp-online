package br.com.control.integracao;

import br.com.control.portal.mensageria.to.PedidoCapaTO;

public enum ProcedureIntegracao {
	INSERT_PEDIDO_CAPA("DBCONTROL1049999.SP_INSERT_PREPEDIDO_CP", PedidoCapaTO.class);

	private String procedure;
	private Class<?> classe;

	private ProcedureIntegracao(String procedure, Class classe) {
		this.procedure = procedure;
		this.classe = classe;
	}

	public String getProcedure() {
		return procedure;
	}

	public void setProcedure(String procedure) {
		this.procedure = procedure;
	}

	public Class<?> getClasse() {
		return classe;
	}

	public void setClasse(Class<?> classe) {
		this.classe = classe;
	}

}