package br.com.control.vendas.cadastro.modelo;

import java.io.Serializable;

@SuppressWarnings("serial")
public class RestricaoComercial implements Serializable {

	private Long recId;
	private Boolean ativo;
	private String codigoGrupoCanalERP;
	private String codigoRestricaoComercialERP;
	private String divisaoCanal;
	private float valorMinimoPedido;
	private String codigoCanalVendaERP;
	private String codigoClienteERP;
	private String codigoCondicaoPagamentoERP;
	private String codigoTipoCobrancaERP;

	public Long getRecId() {
		return recId;
	}

	public void setRecId(Long recId) {
		this.recId = recId;
	}

	public Boolean getAtivo() {
		return ativo;
	}

	public void setAtivo(Boolean ativo) {
		this.ativo = ativo;
	}

	
	public String getDivisaoCanal() {
		return divisaoCanal;
	}

	public void setDivisaoCanal(String divisaoCanal) {
		this.divisaoCanal = divisaoCanal;
	}

	public float getValorMinimoPedido() {
		return valorMinimoPedido;
	}

	public void setValorMinimoPedido(float valorMinimoPedido) {
		this.valorMinimoPedido = valorMinimoPedido;
	}

	public String getCodigoGrupoCanalERP() {
		return codigoGrupoCanalERP;
	}

	public void setCodigoGrupoCanalERP(String codigoGrupoCanalERP) {
		this.codigoGrupoCanalERP = codigoGrupoCanalERP;
	}

	public String getCodigoRestricaoComercialERP() {
		return codigoRestricaoComercialERP;
	}

	public void setCodigoRestricaoComercialERP(String codigoRestricaoComercialERP) {
		this.codigoRestricaoComercialERP = codigoRestricaoComercialERP;
	}

	public String getCodigoCanalVendaERP() {
		return codigoCanalVendaERP;
	}

	public void setCodigoCanalVendaERP(String codigoCanalVendaERp) {
		this.codigoCanalVendaERP = codigoCanalVendaERp;
	}

	public String getCodigoClienteERP() {
		return codigoClienteERP;
	}

	public void setCodigoClienteERP(String codigoClienteERP) {
		this.codigoClienteERP = codigoClienteERP;
	}

	public String getCodigoCondicaoPagamentoERP() {
		return codigoCondicaoPagamentoERP;
	}

	public void setCodigoCondicaoPagamentoERP(String codigoCondicaoPagamentoERP) {
		this.codigoCondicaoPagamentoERP = codigoCondicaoPagamentoERP;
	}

	public String getCodigoTipoCobrancaERP() {
		return codigoTipoCobrancaERP;
	}

	public void setCodigoTipoCobrancaERP(String codigoTipoCobrancaERP) {
		this.codigoTipoCobrancaERP = codigoTipoCobrancaERP;
	}

	
}
