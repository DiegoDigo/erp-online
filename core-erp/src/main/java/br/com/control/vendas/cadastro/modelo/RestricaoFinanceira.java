package br.com.control.vendas.cadastro.modelo;

import java.io.Serializable;

@SuppressWarnings("serial")
public class RestricaoFinanceira implements Serializable {

	private Long recId;
	private Boolean ativo;
	private String codigoRestricaoFinanceiraERP;
	private float descontoItem;
	private float descontoMaximo;
	private float taxa;
	private float valorMaximoPedido;
	private float valorMinimoPedido;
	private Long codigoCondicaoPagamentoERP;
	private Long codigoTipoCobrancaERP;

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

	public String getCodigoRestricaoFinanceiraERP() {
		return codigoRestricaoFinanceiraERP;
	}

	public void setCodigoRestricaoFinanceiraERP(String codigoRestricaoFinanceiraERP) {
		this.codigoRestricaoFinanceiraERP = codigoRestricaoFinanceiraERP;
	}

	public float getDescontoItem() {
		return descontoItem;
	}

	public void setDescontoItem(float descontoItem) {
		this.descontoItem = descontoItem;
	}

	public float getDescontoMaximo() {
		return descontoMaximo;
	}

	public void setDescontoMaximo(float descontoMaximo) {
		this.descontoMaximo = descontoMaximo;
	}

	public float getTaxa() {
		return taxa;
	}

	public void setTaxa(float taxa) {
		this.taxa = taxa;
	}

	public float getValorMaximoPedido() {
		return valorMaximoPedido;
	}

	public void setValorMaximoPedido(float valorMaximoPedido) {
		this.valorMaximoPedido = valorMaximoPedido;
	}

	public float getValorMinimoPedido() {
		return valorMinimoPedido;
	}

	public void setValorMinimoPedido(float valorMinimoPedido) {
		this.valorMinimoPedido = valorMinimoPedido;
	}

	public Long getCodigoCondicaoPagamentoERP() {
		return codigoCondicaoPagamentoERP;
	}

	public void setCodigoCondicaoPagamentoERP(Long codigoCondicaoPagamentoERP) {
		this.codigoCondicaoPagamentoERP = codigoCondicaoPagamentoERP;
	}

	public Long getCodigoTipoCobrancaERP() {
		return codigoTipoCobrancaERP;
	}

	public void setCodigoTipoCobrancaERP(Long codigoTipoCobrancaERP) {
		this.codigoTipoCobrancaERP = codigoTipoCobrancaERP;
	}

}
