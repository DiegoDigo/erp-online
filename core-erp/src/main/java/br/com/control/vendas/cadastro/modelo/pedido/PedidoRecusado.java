package br.com.control.vendas.cadastro.modelo.pedido;

import java.sql.Timestamp;

public class PedidoRecusado {

	private Long recId;
	private Timestamp dataHoraRecusa;
	private Long matricualRecId;
	private Long codigoPedidoRecId;
	private Long codigoUsuarioPortalRecId;

	public Long getRecId() {
		return recId;
	}

	public void setRecId(Long recId) {
		this.recId = recId;
	}

	public Timestamp getDataHoraRecusa() {
		return dataHoraRecusa;
	}

	public void setDataHoraRecusa(Timestamp dataHoraRecusa) {
		this.dataHoraRecusa = dataHoraRecusa;
	}

	public Long getMatricualRecId() {
		return matricualRecId;
	}

	public void setMatricualRecId(Long matricualRecId) {
		this.matricualRecId = matricualRecId;
	}

	public Long getCodigoPedidoRecId() {
		return codigoPedidoRecId;
	}

	public void setCodigoPedidoRecId(Long codigoPedidoRecId) {
		this.codigoPedidoRecId = codigoPedidoRecId;
	}

	public Long getCodigoUsuarioPortalRecId() {
		return codigoUsuarioPortalRecId;
	}

	public void setCodigoUsuarioPortalRecId(Long codigoUsuarioPortalRecId) {
		this.codigoUsuarioPortalRecId = codigoUsuarioPortalRecId;
	}

}
