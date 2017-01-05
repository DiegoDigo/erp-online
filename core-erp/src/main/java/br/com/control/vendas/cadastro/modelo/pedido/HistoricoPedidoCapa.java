package br.com.control.vendas.cadastro.modelo.pedido;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Date;

@SuppressWarnings("serial")
public class HistoricoPedidoCapa implements Serializable {

	private Long recId;
	private Boolean ativo;
	private String codigoMotivoDevolucao;
	private Timestamp dataHoraEmissaoPedido;
	private Timestamp dataVencimento;
	private float descontoFinanceiro;
	private String numeroPedido;
	private float percentualDesconto;
	private String statusPedido;
	private float taxaFinanceira;
	private float valorDevolucao;
	private float valorPedido;
	private Long codigoClienteERP;
	private Long condicaoPagamentoERP;
	private Long tipoCobrancaERP;

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

	public String getCodigoMotivoDevolucao() {
		return codigoMotivoDevolucao;
	}

	public void setCodigoMotivoDevolucao(String codigoMotivoDevolucao) {
		this.codigoMotivoDevolucao = codigoMotivoDevolucao;
	}

	public Date getDataHoraEmissaoPedido() {
		return dataHoraEmissaoPedido;
	}

	public void setDataHoraEmissaoPedido(Timestamp dataHoraEmissaoPedido) {
		this.dataHoraEmissaoPedido = dataHoraEmissaoPedido;
	}

	public Date getDataVencimento() {
		return dataVencimento;
	}

	public void setDataVencimento(Timestamp dataVencimento) {
		this.dataVencimento = dataVencimento;
	}

	public float getDescontoFinanceiro() {
		return descontoFinanceiro;
	}

	public void setDescontoFinanceiro(float descontoFinanceiro) {
		this.descontoFinanceiro = descontoFinanceiro;
	}

	public String getNumeroPedido() {
		return numeroPedido;
	}

	public void setNumeroPedido(String numeroPedido) {
		this.numeroPedido = numeroPedido;
	}

	public float getPercentualDesconto() {
		return percentualDesconto;
	}

	public void setPercentualDesconto(float percentualDesconto) {
		this.percentualDesconto = percentualDesconto;
	}

	public String getStatusPedido() {
		return statusPedido;
	}

	public void setStatusPedido(String statusPedido) {
		this.statusPedido = statusPedido;
	}

	public float getTaxaFinanceira() {
		return taxaFinanceira;
	}

	public void setTaxaFinanceira(float taxaFinanceira) {
		this.taxaFinanceira = taxaFinanceira;
	}

	public float getValorDevolucao() {
		return valorDevolucao;
	}

	public void setValorDevolucao(float valorDevolucao) {
		this.valorDevolucao = valorDevolucao;
	}

	public float getValorPedido() {
		return valorPedido;
	}

	public void setValorPedido(float valorPedido) {
		this.valorPedido = valorPedido;
	}

	public Long getCodigoClienteERP() {
		return codigoClienteERP;
	}

	public void setCodigoClienteERP(Long codigoClienteERP) {
		this.codigoClienteERP = codigoClienteERP;
	}

	public Long getCondicaoPagamentoERP() {
		return condicaoPagamentoERP;
	}

	public void setCondicaoPagamentoERP(Long condicaoPagamentoERP) {
		this.condicaoPagamentoERP = condicaoPagamentoERP;
	}

	public Long getTipoCobrancaERP() {
		return tipoCobrancaERP;
	}

	public void setTipoCobrancaERP(Long tipoCobrancaERP) {
		this.tipoCobrancaERP = tipoCobrancaERP;
	}

}
