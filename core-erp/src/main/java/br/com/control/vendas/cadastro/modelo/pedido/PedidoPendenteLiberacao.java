package br.com.control.vendas.cadastro.modelo.pedido;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Date;

import br.com.control.portal.enums.StatusLiberacaoPedido;

@SuppressWarnings("serial")
public class PedidoPendenteLiberacao implements Serializable {
	

	private Boolean ativo;
	private Timestamp dataHoraEmissaoPedido;
	private Timestamp dataVencimento;
	private float descontoFinanceiro;
	private String numeroPedido;
	private float percentualDesconto;
	private StatusLiberacaoPedido statusPedido;
	private float taxaFinanceira;
	private float valorDevolucao;
	private float valorPedido;
	private String codigoClienteERP;
	private Long condicaoPagamentoERP;
	private Long tipoCobrancaERP;
	private String codigoVendedor;
	private String nomeVendedor;
	private String descricaoBloqueio;


	public String getCodigoVendedor() {
		return codigoVendedor;
	}

	public void setCodigoVendedor(String codigoVendedor) {
		this.codigoVendedor = codigoVendedor;
	}

	public String getNomeVendedor() {
		return nomeVendedor;
	}

	public void setNomeVendedor(String nomeVendedor) {
		this.nomeVendedor = nomeVendedor;
	}

	public String getDescricaoBloqueio() {
		return descricaoBloqueio;
	}

	public void setDescricaoBloqueio(String descricaoBloqueio) {
		this.descricaoBloqueio = descricaoBloqueio;
	}

	public Boolean getAtivo() {
		return ativo;
	}

	public void setAtivo(Boolean ativo) {
		this.ativo = ativo;
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

	public StatusLiberacaoPedido getStatusPedido() {
		return statusPedido;
	}

	public void setStatusPedido(StatusLiberacaoPedido statusPedido) {
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

	public String getCodigoClienteERP() {
		return codigoClienteERP;
	}

	public void setCodigoClienteERP(String codigoClienteERP) {
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
