package br.com.control.portal.integracao;

import br.com.control.portal.mensageria.to.ClienteTO;
import br.com.control.portal.mensageria.to.LiberacaoPedidoTO;
import br.com.control.portal.mensageria.to.PedidoCapaTO;
import br.com.control.portal.mensageria.to.PedidoItemTO;

public enum ProcedureIntegracao {
	INSERT_PEDIDO_CAPA("SP_INSERT_PREPEDIDO_CP", PedidoCapaTO.class),
	INSERT_PEDIDO_ITEM("SP_INSERT_PREPEDIDO_ITEM", PedidoItemTO.class),
	LIBERACAO_PEDIDO("LIB_PEDIDO", LiberacaoPedidoTO.class),
	INSERT_PRE_CADASTRO_CLIENTE("",ClienteTO.class),
	ALTERACAO_PRE_CADASTRO_CLIENTE("",ClienteTO.class);

	private String procedure;
	private Class<?> classe;

	private ProcedureIntegracao(String procedure, Class<?> classe) {
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