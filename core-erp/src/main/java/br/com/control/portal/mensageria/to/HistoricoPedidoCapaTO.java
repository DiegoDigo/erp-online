package br.com.control.portal.mensageria.to;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import br.com.control.vendas.cadastro.modelo.pedido.HistoricoPedidoCapa;

public class HistoricoPedidoCapaTO implements Serializable {

	private static final long serialVersionUID = 1L;

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
	private String codigoClienteERP;
	private String condicaoPagamentoERP;
	private String tipoCobrancaERP;

	private List<HistoricoPedidoItemTO> historicoPedidoItens = new ArrayList<>();

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

	public HistoricoPedidoCapaTO() {
	}

	public HistoricoPedidoCapaTO(HistoricoPedidoCapa historicoPedidoCapa) {
		this.ativo = historicoPedidoCapa.getAtivo();
		this.codigoMotivoDevolucao = historicoPedidoCapa.getCodigoMotivoDevolucao();
		this.dataHoraEmissaoPedido = (Timestamp) historicoPedidoCapa.getDataHoraEmissaoPedido();
		this.dataVencimento = (Timestamp) historicoPedidoCapa.getDataVencimento();
		this.descontoFinanceiro = historicoPedidoCapa.getDescontoFinanceiro();
		this.numeroPedido = historicoPedidoCapa.getNumeroPedido();
		this.percentualDesconto = historicoPedidoCapa.getPercentualDesconto();
		this.statusPedido = historicoPedidoCapa.getStatusPedido();
		this.taxaFinanceira = historicoPedidoCapa.getTaxaFinanceira();
		this.valorDevolucao = historicoPedidoCapa.getValorDevolucao();
		this.valorPedido = historicoPedidoCapa.getValorPedido();
		this.codigoClienteERP = historicoPedidoCapa.getCodigoClienteERP();
		this.condicaoPagamentoERP = historicoPedidoCapa.getCondicaoPagamentoERP();
		this.tipoCobrancaERP = historicoPedidoCapa.getTipoCobrancaERP();
	}

	public List<HistoricoPedidoItemTO> getHistoricoPedidoItens() {
		return historicoPedidoItens;
	}

	public void setHistoricoPedidoItens(List<HistoricoPedidoItemTO> historicoPedidoItens) {
		this.historicoPedidoItens = historicoPedidoItens;
	}

}
