package br.com.control.portal.integracao;

import br.com.control.portal.mensageria.to.ClienteTO;
import br.com.control.portal.mensageria.to.LiberacaoPedidoTO;
import br.com.control.portal.mensageria.to.PedidoCapaTO;
import br.com.control.portal.mensageria.to.PedidoItemTO;
import br.com.control.portal.mensageria.to.VisitaTO;

public enum ProcedureIntegracao {
	// REMOVER ESSAS DUAS APOS HOMOLOGAR AS NOVAS PROCS
	INSERT_PEDIDO_CAPA(	"SP_INSERT_PREPEDIDO_CP",
						PedidoCapaTO.class),
	INSERT_PEDIDO_ITEM(	"SP_INSERT_PREPEDIDO_ITEM",
						PedidoItemTO.class),

	INSERT_CAPA_PRE_PEDIDO(	"SP_INSERT_CAPAPREPEDIDO",
							PedidoCapaTO.class),
	INSERT_ITEM_PRE_PEDIDO(	"SP_INSERT_ITEMPREPEDIDO",
							PedidoItemTO.class),
	LIBERACAO_PEDIDO(	"SP_LIBERA_PEDIDO",
						LiberacaoPedidoTO.class),
	INSERE_ALTERA_CLIENTE(	"SP_CRIA_ATUALIZA_CLIENTE",
							ClienteTO.class),

	ATUALIZAR_VISITAS(	"SP_CRIA_VISITA",
						VisitaTO.class);

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