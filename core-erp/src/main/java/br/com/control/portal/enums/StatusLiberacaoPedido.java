package br.com.control.portal.enums;

public enum StatusLiberacaoPedido {
	LIBERADO("0"), RECUSADO("9"), BLOQUEADO("7");

	private String status;

	private StatusLiberacaoPedido(String status) {
		this.status = status;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public static StatusLiberacaoPedido recuperaPorNome(String nome) {
		for (StatusLiberacaoPedido status : StatusLiberacaoPedido.values()) {
			if (status.toString().equals(nome)) {
				return status;
			}
		}
		return null;
	}

	public static StatusLiberacaoPedido recuperaPorCodigo(String codigo) {
		for (StatusLiberacaoPedido status : StatusLiberacaoPedido.values()) {
			if (status.getStatus().equals(codigo)) {
				return status;
			}
		}
		return null;
	}
}
