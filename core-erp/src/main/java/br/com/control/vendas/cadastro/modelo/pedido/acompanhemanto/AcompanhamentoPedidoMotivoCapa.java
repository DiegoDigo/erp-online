package br.com.control.vendas.cadastro.modelo.pedido.acompanhemanto;

import java.io.Serializable;

@SuppressWarnings("serial")
public class AcompanhamentoPedidoMotivoCapa implements Serializable {

	private Long recId;
	private String codigoMotivoCapa;
	private Long codigoAcompanhamentoPedidoRecId;

	public Long getRecId() {
		return recId;
	}

	public void setRecId(Long recId) {
		this.recId = recId;
	}

	public String getCodigoMotivoCapa() {
		return codigoMotivoCapa;
	}

	public void setCodigoMotivoCapa(String codigoMotivoCapa) {
		this.codigoMotivoCapa = codigoMotivoCapa;
	}

	public Long getCodigoAcompanhamentoPedidoRecId() {
		return codigoAcompanhamentoPedidoRecId;
	}

	public void setCodigoAcompanhamentoPedidoRecId(Long codigoAcompanhamentoPedidoRecId) {
		this.codigoAcompanhamentoPedidoRecId = codigoAcompanhamentoPedidoRecId;
	}

}
