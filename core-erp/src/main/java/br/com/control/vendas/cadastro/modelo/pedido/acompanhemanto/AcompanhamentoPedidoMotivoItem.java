package br.com.control.vendas.cadastro.modelo.pedido.acompanhemanto;

import java.io.Serializable;

@SuppressWarnings("serial")
public class AcompanhamentoPedidoMotivoItem implements Serializable {

	private Long recId;
	private String codigoMotivoItem;
	private Long AcompanhamentoMotivoPedidoCapaRecId;
	private Long pedidoItemRecId;

	public Long getRecId() {
		return recId;
	}

	public void setRecId(Long recId) {
		this.recId = recId;
	}

	public String getCodigoMotivoItem() {
		return codigoMotivoItem;
	}

	public void setCodigoMotivoItem(String codigoMotivoItem) {
		this.codigoMotivoItem = codigoMotivoItem;
	}

	public Long getAcompanhamentoMotivoPedidoCapaRecId() {
		return AcompanhamentoMotivoPedidoCapaRecId;
	}

	public void setAcompanhamentoMotivoPedidoCapaRecId(Long acompanhamentoMotivoPedidoCapaRecId) {
		AcompanhamentoMotivoPedidoCapaRecId = acompanhamentoMotivoPedidoCapaRecId;
	}

	public Long getPedidoItemRecId() {
		return pedidoItemRecId;
	}

	public void setPedidoItemRecId(Long pedidoItemRecId) {
		this.pedidoItemRecId = pedidoItemRecId;
	}

}
