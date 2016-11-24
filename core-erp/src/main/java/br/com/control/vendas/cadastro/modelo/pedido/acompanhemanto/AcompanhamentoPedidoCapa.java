package br.com.control.vendas.cadastro.modelo.pedido.acompanhemanto;

import java.io.Serializable;
import java.sql.Timestamp;

@SuppressWarnings("serial")
public class AcompanhamentoPedidoCapa implements Serializable {

	private Long RecId;
	private Timestamp dataHoraAlteracaiStatus;
	private String numeroPedidoGestao;
	private Long codigoPedidoRecId;
	private Long nivelAnaliseRecId;

	public Long getRecId() {
		return RecId;
	}

	public void setRecId(Long recId) {
		RecId = recId;
	}

	public Timestamp getDataHoraAlteracaiStatus() {
		return dataHoraAlteracaiStatus;
	}

	public void setDataHoraAlteracaiStatus(Timestamp dataHoraAlteracaiStatus) {
		this.dataHoraAlteracaiStatus = dataHoraAlteracaiStatus;
	}

	public String getNumeroPedidoGestao() {
		return numeroPedidoGestao;
	}

	public void setNumeroPedidoGestao(String numeroPedidoGestao) {
		this.numeroPedidoGestao = numeroPedidoGestao;
	}

	public Long getCodigoPedidoRecId() {
		return codigoPedidoRecId;
	}

	public void setCodigoPedidoRecId(Long codigoPedidoRecId) {
		this.codigoPedidoRecId = codigoPedidoRecId;
	}

	public Long getNivelAnaliseRecId() {
		return nivelAnaliseRecId;
	}

	public void setNivelAnaliseRecId(Long nivelAnaliseRecId) {
		this.nivelAnaliseRecId = nivelAnaliseRecId;
	}

}
