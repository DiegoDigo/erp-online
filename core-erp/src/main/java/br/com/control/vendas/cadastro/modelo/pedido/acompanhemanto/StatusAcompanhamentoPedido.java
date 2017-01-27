package br.com.control.vendas.cadastro.modelo.pedido.acompanhemanto;

import java.io.Serializable;

@SuppressWarnings("serial")
public class StatusAcompanhamentoPedido implements Serializable {
	
	private Long recId;
	private String numeroPedidoErp;
	private String situacaoPedidoErp;
	private String numeroPrePedidoErp;
	private String numeroRomaneio;
	private String situacaoRomaneio;
	private String serieNFE;
	private String numeroNFE;
	private String codigoBloqueioPedido;
	
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

}
