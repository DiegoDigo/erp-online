package br.com.control.portal.enums;

public enum StatusLiberacaoPedido {
	LIBERADO, RECUSADO, BLOQUEADO;
	
	public static StatusLiberacaoPedido recuperaPorNome(String nome){
		for (StatusLiberacaoPedido status : StatusLiberacaoPedido.values()) {
			if (status.toString().equals(nome)) {
				return status;
			}
		}
		return null;
	}
}
