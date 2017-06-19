package br.com.control.portal.enums;

public enum StatusPedidoEnum {

	ANALISE(1, "Análise", "Estamos analisando seu pedido!"), APROVADO(2, "Aprovado", "Aprovamos seu pedido"), SEPARACAO(
			3, "Separação", "Estamos separando seu pedido para entrega!"), DESPACHADO(4, "Despachado",
					"Seu pedido saiu para entrega!"), ENTREGUE(5, "Entregue", "Pedido entregue");

	private String status;
	private String descricao;
	private int sequencia;

	private StatusPedidoEnum(int sequencia, String status, String descricao) {
		this.sequencia = sequencia;
		this.status = status;
		this.descricao = descricao;
	}

	public int getSequencia() {
		return sequencia;
	}

	public void setSequencia(int sequencia) {
		this.sequencia = sequencia;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
}
