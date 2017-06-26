package br.com.control.portal.mensageria.to;

import java.io.Serializable;
import java.util.Date;

import br.com.control.portal.enums.StatusLiberacaoPedido;
import br.com.control.vendas.cadastro.modelo.pedido.PedidoPendenteLiberacao;

public class PedidoPendenteLiberacaoTO implements Serializable {

	private static final long serialVersionUID = 1L;

	private Boolean ativo;
	private Date dataHoraEmissaoPedido;
	private Date dataVencimento;
	private float descontoFinanceiro;
	private String numeroPedido;
	private float percentualDesconto;
	private StatusLiberacaoPedido statusPedido;
	private float taxaFinanceira;
	private float valorDevolucao;
	private float valorPedido;
	private String codigoClienteERP;
	private String condicaoPagamentoERP;
	private String tipoCobrancaERP;
	private String codigoVendedor;
	private String nomeVendedor;
	private String descricaoBloqueio;
	
	public PedidoPendenteLiberacaoTO(PedidoPendenteLiberacao pedidoPendenteLiberacao) {
		setAtivo(pedidoPendenteLiberacao.getAtivo());
		setDataHoraEmissaoPedido(pedidoPendenteLiberacao.getDataHoraEmissaoPedido());
		setDataVencimento(pedidoPendenteLiberacao.getDataVencimento());
		setDescontoFinanceiro(pedidoPendenteLiberacao.getDescontoFinanceiro());
		setNumeroPedido(pedidoPendenteLiberacao.getNumeroPedido());
		setTaxaFinanceira(pedidoPendenteLiberacao.getTaxaFinanceira());
		setValorDevolucao(pedidoPendenteLiberacao.getValorDevolucao());
		setValorPedido(pedidoPendenteLiberacao.getValorPedido());
		setCodigoClienteERP(pedidoPendenteLiberacao.getCodigoClienteERP());
		setCondicaoPagamentoERP(pedidoPendenteLiberacao.getCondicaoPagamentoERP());
		setTipoCobrancaERP(pedidoPendenteLiberacao.getTipoCobrancaERP());
		setCodigoVendedor(pedidoPendenteLiberacao.getCodigoVendedor());
		setNomeVendedor(pedidoPendenteLiberacao.getNomeVendedor());
		setDescricaoBloqueio(pedidoPendenteLiberacao.getDescricaoBloqueio());
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


	public Date getDataVencimento() {
		return dataVencimento;
	}

	public void setDataVencimento(Date dataVencimento) {
		this.dataVencimento = dataVencimento;
	}

	public void setDataHoraEmissaoPedido(Date dataHoraEmissaoPedido) {
		this.dataHoraEmissaoPedido = dataHoraEmissaoPedido;
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
	public String getCondicaoPagamentoERP() {
		return condicaoPagamentoERP;
	}

	public void setCondicaoPagamentoERP(String condicaoPagamentoERP) {
		this.condicaoPagamentoERP = condicaoPagamentoERP;
	}

	public String getTipoCobrancaERP() {
		return tipoCobrancaERP;
	}

	public void setTipoCobrancaERP(String tipoCobrancaERP) {
		this.tipoCobrancaERP = tipoCobrancaERP;
	}

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

}