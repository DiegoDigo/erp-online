package br.com.control.vendas.cadastro.modelo.pedido;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Date;

/**
 * @author rodrigo.galante
 *
 */
@SuppressWarnings("serial")
public class HistoricoPedidoCapa implements Serializable {

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
	private String codigoClienteErp;
	private String cnpjCpf;
	private String razaoSocial;
	private String condicaoPagamentoErp;
	private String descricaoCondicaoPagamento;
	private String tipoCobrancaErp;
	private String descricaoTipoCobranca;
	private String notaFiscalInicial;
	private String notaFiscalFinal;
	private String serieFiscal;

	public String getCnpjCpf() {
		return cnpjCpf;
	}

	public void setCnpjCpf(String cnpjCpf) {
		this.cnpjCpf = cnpjCpf;
	}

	public String getRazaoSocial() {
		return razaoSocial;
	}

	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}

	public String getDescricaoCondicaoPagamento() {
		return descricaoCondicaoPagamento;
	}

	public void setDescricaoCondicaoPagamento(String descricaoCondicaoPagamento) {
		this.descricaoCondicaoPagamento = descricaoCondicaoPagamento;
	}

	public String getDescricaoTipoCobranca() {
		return descricaoTipoCobranca;
	}

	public void setDescricaoTipoCobranca(String descricaoTipoCobranca) {
		this.descricaoTipoCobranca = descricaoTipoCobranca;
	}

	public String getNotaFiscalInicial() {
		return notaFiscalInicial;
	}

	public void setNotaFiscalInicial(String notaFiscalInicial) {
		this.notaFiscalInicial = notaFiscalInicial;
	}

	public String getNotaFiscalFinal() {
		return notaFiscalFinal;
	}

	public void setNotaFiscalFinal(String notaFiscalFinal) {
		this.notaFiscalFinal = notaFiscalFinal;
	}

	public String getSerieFiscal() {
		return serieFiscal;
	}

	public void setSerieFiscal(String serieFiscal) {
		this.serieFiscal = serieFiscal;
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

	public String getCodigoClienteErp() {
		return codigoClienteErp;
	}

	public void setCodigoClienteErp(String codigoClienteErp) {
		this.codigoClienteErp = codigoClienteErp;
	}

	public String getCondicaoPagamentoErp() {
		return condicaoPagamentoErp;
	}

	public void setCondicaoPagamentoErp(String condicaoPagamentoErp) {
		this.condicaoPagamentoErp = condicaoPagamentoErp;
	}

	public String getTipoCobrancaErp() {
		return tipoCobrancaErp;
	}

	public void setTipoCobrancaErp(String tipoCobrancaErp) {
		this.tipoCobrancaErp = tipoCobrancaErp;
	}
}
