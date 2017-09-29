package br.com.control.vendas.cadastro.modelo.pedido;

import java.io.Serializable;
import java.sql.Timestamp;

import br.com.control.portal.enums.StatusLiberacaoPedido;

@SuppressWarnings("serial")
public class PedidoLiberado implements Serializable {

	private Long RecId;
	private Timestamp dataHoraLiberacao;
	private Long codigoPedidoRecID;
	private Long CodigoUsuarioPortal;
	private StatusLiberacaoPedido statusPedido;
	private Long matricualRecID;

	public Long getRecId() {
		return RecId;
	}

	public void setRecId(Long recId) {
		RecId = recId;
	}

	public Timestamp getDataHoraLiberacao() {
		return dataHoraLiberacao;
	}

	public void setDataHoraLiberacao(Timestamp dataHoraLiberacao) {
		this.dataHoraLiberacao = dataHoraLiberacao;
	}

	public Long getCodigoPedidoRecID() {
		return codigoPedidoRecID;
	}

	public void setCodigoPedidoRecID(Long codigoPedidoRecID) {
		this.codigoPedidoRecID = codigoPedidoRecID;
	}

	public Long getCodigoUsuarioPortal() {
		return CodigoUsuarioPortal;
	}

	public void setCodigoUsuarioPortal(Long codigoUsuarioPortal) {
		CodigoUsuarioPortal = codigoUsuarioPortal;
	}

	public Long getMatricualRecID() {
		return matricualRecID;
	}

	public void setMatricualRecID(Long matricualRecID) {
		this.matricualRecID = matricualRecID;
	}

	public StatusLiberacaoPedido getStatusPedido() {
		return statusPedido;
	}

	public void setStatusPedido(StatusLiberacaoPedido statusPedido) {
		this.statusPedido = statusPedido;
	}

}
