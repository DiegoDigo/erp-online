package br.com.control.rest.client;

import java.io.Serializable;

public class AcompanhamentoPedidoTO implements Serializable {
	private static final long serialVersionUID = 1L;
	private Long recId;
	private Long numeroPedidoGestao;
	private Long statusAcompanhamentoPedido;

	public Long getRecId() {
		return recId;
	}

	public void setRecId(Long recId) {
		this.recId = recId;
	}

	public Long getNumeroPedidoGestao() {
		return numeroPedidoGestao;
	}

	public void setNumeroPedidoGestao(Long numeroPedidoGestao) {
		this.numeroPedidoGestao = numeroPedidoGestao;
	}

	public Long getStatusAcompanhamentoPedido() {
		return statusAcompanhamentoPedido;
	}

	public void setStatusAcompanhamentoPedido(Long statusAcompanhamentoPedido) {
		this.statusAcompanhamentoPedido = statusAcompanhamentoPedido;
	}

}
