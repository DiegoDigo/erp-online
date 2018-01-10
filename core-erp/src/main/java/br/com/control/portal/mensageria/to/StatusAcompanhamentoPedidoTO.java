package br.com.control.portal.mensageria.to;

import java.io.Serializable;

import br.com.control.portal.enums.StatusPedidoEnum;
import br.com.control.vendas.cadastro.modelo.pedido.acompanhemanto.StatusAcompanhamentoPedido;

public class StatusAcompanhamentoPedidoTO implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private Long recId;
	private String numeroPedidoErp;
	private String situacaoPedidoErp;
	private String numeroPrePedidoErp;
	private String numeroRomaneio;
	private String situacaoRomaneio;
	private String serieNFE;
	private String numeroNFE;
	private String codigoBloqueioPedido;
	
	public StatusPedidoEnum recuperaStatus() {
		if (getSituacaoPedidoErp() != null && getSituacaoPedidoErp().equals("8")) {
			return StatusPedidoEnum.ENTREGUE;
		} else if (getNumeroRomaneio() != null && !getNumeroRomaneio().equals("0")) {
			return StatusPedidoEnum.SEPARACAO;
		} else if (getSituacaoPedidoErp() != null && getSituacaoPedidoErp().equals("0")) {
			return StatusPedidoEnum.APROVADO;
		} else {
			return StatusPedidoEnum.ANALISE;
		}
	}
	
	public boolean pedidoEstaBloquado() {
		return situacaoPedidoErp.equals("5") || situacaoPedidoErp.equals("7");
	}
	
	
	public StatusAcompanhamentoPedidoTO() {
	}

	public StatusAcompanhamentoPedidoTO(StatusAcompanhamentoPedido status) {
		super();
		this.recId = status.getRecId();
		this.numeroPedidoErp = status.getNumeroPedidoErp();
		this.situacaoPedidoErp = status.getSituacaoPedidoErp();
		this.numeroPrePedidoErp = status.getNumeroPrePedidoErp();
		this.numeroRomaneio = status.getNumeroRomaneio();
		this.situacaoRomaneio = status.getSituacaoRomaneio();
		this.serieNFE = status.getSerieNFE();
		this.numeroNFE = status.getNumeroNFE();
		this.codigoBloqueioPedido = status.getCodigoBloqueioPedido();
	}
	public Long getRecId() {
		return recId;
	}
	public void setRecId(Long recId) {
		this.recId = recId;
	}
	public String getNumeroPedidoErp() {
		return numeroPedidoErp;
	}
	public void setNumeroPedidoErp(String numeroPedidoErp) {
		this.numeroPedidoErp = numeroPedidoErp;
	}
	public String getSituacaoPedidoErp() {
		return situacaoPedidoErp;
	}
	public void setSituacaoPedidoErp(String situacaoPedidoErp) {
		this.situacaoPedidoErp = situacaoPedidoErp;
	}
	public String getNumeroPrePedidoErp() {
		return numeroPrePedidoErp;
	}
	public void setNumeroPrePedidoErp(String numeroPrePedidoErp) {
		this.numeroPrePedidoErp = numeroPrePedidoErp;
	}
	public String getNumeroRomaneio() {
		return numeroRomaneio;
	}
	public void setNumeroRomaneio(String numeroRomaneio) {
		this.numeroRomaneio = numeroRomaneio;
	}
	public String getSituacaoRomaneio() {
		return situacaoRomaneio;
	}
	public void setSituacaoRomaneio(String situacaoRomaneio) {
		this.situacaoRomaneio = situacaoRomaneio;
	}
	public String getSerieNFE() {
		return serieNFE;
	}
	public void setSerieNFE(String serieNFE) {
		this.serieNFE = serieNFE;
	}
	public String getNumeroNFE() {
		return numeroNFE;
	}
	public void setNumeroNFE(String numeroNFE) {
		this.numeroNFE = numeroNFE;
	}
	public String getCodigoBloqueioPedido() {
		return codigoBloqueioPedido;
	}
	public void setCodigoBloqueioPedido(String codigoBloqueioPedido) {
		this.codigoBloqueioPedido = codigoBloqueioPedido;
	}

	@Override
	public String toString() {
		return "StatusAcompanhamentoPedidoTO [recId=" + recId + ", numeroPedidoErp=" + numeroPedidoErp
				+ ", situacaoPedidoErp=" + situacaoPedidoErp + ", numeroPrePedidoErp=" + numeroPrePedidoErp
				+ ", numeroRomaneio=" + numeroRomaneio + ", situacaoRomaneio=" + situacaoRomaneio + ", serieNFE="
				+ serieNFE + ", numeroNFE=" + numeroNFE + ", codigoBloqueioPedido=" + codigoBloqueioPedido + "]";
	}
	
	

}
