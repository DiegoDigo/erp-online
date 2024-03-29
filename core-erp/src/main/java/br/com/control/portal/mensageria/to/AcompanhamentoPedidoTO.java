package br.com.control.portal.mensageria.to;

import java.io.Serializable;

public class AcompanhamentoPedidoTO implements Serializable {
	private static final long serialVersionUID = 1L;
	private Long recId;
	private String numeroPedidoGestao;
	private Long statusAcompanhamentoPedido;

	public Long getRecId() {
		return recId;
	}

	public void setRecId(Long recId) {
		this.recId = recId;
	}

	public String getNumeroPedidoGestao() {
		return numeroPedidoGestao;
	}

	public void setNumeroPedidoGestao(String numeroPedidoGestao) {
		this.numeroPedidoGestao = numeroPedidoGestao;
	}

	public Long getStatusAcompanhamentoPedido() {
		return statusAcompanhamentoPedido;
	}

	public void setStatusAcompanhamentoPedido(Long statusAcompanhamentoPedido) {
		this.statusAcompanhamentoPedido = statusAcompanhamentoPedido;
	}

}
