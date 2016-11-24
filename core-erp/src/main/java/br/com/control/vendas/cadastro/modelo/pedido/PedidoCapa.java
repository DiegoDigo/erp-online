package br.com.control.vendas.cadastro.modelo.pedido;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Date;

public class PedidoCapa {

	private Long recId;
	private Boolean ativo;
	private Timestamp dataHoraEmissao;
	private Date dataPrimeiraParcela;
	private String numeroPedidoGestao;
	private String observacao;
	private Boolean pedidoAberto;
	private Boolean pedidoBloqueado;
	private Boolean pedidoTransmitido;
	private float percDesconto;
	private float percTaxaFinanc;
	private Boolean permiteErpAjustarPedido;
	private Integer qtdeAvulsa;
	private Integer qtdeCaixa;
	private Integer tipoEntrega;
	private BigDecimal valorBonificado;
	private BigDecimal valorBruto;
	private BigDecimal valorDesconto;
	private BigDecimal valorFinal;
	private BigDecimal valorLiquido;
	private BigDecimal valorVerba;
	private Long cliente;
	private Long condicaoPagamento;

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

	public Timestamp getDataHoraEmissao() {
		return dataHoraEmissao;
	}

	public void setDataHoraEmissao(Timestamp dataHoraEmissao) {
		this.dataHoraEmissao = dataHoraEmissao;
	}

	public Date getDataPrimeiraParcela() {
		return dataPrimeiraParcela;
	}

	public void setDataPrimeiraParcela(Date dataPrimeiraParcela) {
		this.dataPrimeiraParcela = dataPrimeiraParcela;
	}

	public String getNumeroPedidoGestao() {
		return numeroPedidoGestao;
	}

	public void setNumeroPedidoGestao(String numeroPedidoGestao) {
		this.numeroPedidoGestao = numeroPedidoGestao;
	}

	public String getObservacao() {
		return observacao;
	}

	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}

	public Boolean getPedidoAberto() {
		return pedidoAberto;
	}

	public void setPedidoAberto(Boolean pedidoAberto) {
		this.pedidoAberto = pedidoAberto;
	}

	public Boolean getPedidoBloqueado() {
		return pedidoBloqueado;
	}

	public void setPedidoBloqueado(Boolean pedidoBloqueado) {
		this.pedidoBloqueado = pedidoBloqueado;
	}

	public Boolean getPedidoTransmitido() {
		return pedidoTransmitido;
	}

	public void setPedidoTransmitido(Boolean pedidoTransmitido) {
		this.pedidoTransmitido = pedidoTransmitido;
	}

	public float getPercDesconto() {
		return percDesconto;
	}

	public void setPercDesconto(float percDesconto) {
		this.percDesconto = percDesconto;
	}

	public float getPercTaxaFinanc() {
		return percTaxaFinanc;
	}

	public void setPercTaxaFinanc(float percTaxaFinanc) {
		this.percTaxaFinanc = percTaxaFinanc;
	}

	public Boolean getPermiteErpAjustarPedido() {
		return permiteErpAjustarPedido;
	}

	public void setPermiteErpAjustarPedido(Boolean permiteErpAjustarPedido) {
		this.permiteErpAjustarPedido = permiteErpAjustarPedido;
	}

	public Integer getQtdeAvulsa() {
		return qtdeAvulsa;
	}

	public void setQtdeAvulsa(Integer qtdeAvulsa) {
		this.qtdeAvulsa = qtdeAvulsa;
	}

	public Integer getQtdeCaixa() {
		return qtdeCaixa;
	}

	public void setQtdeCaixa(Integer qtdeCaixa) {
		this.qtdeCaixa = qtdeCaixa;
	}

	public Integer getTipoEntrega() {
		return tipoEntrega;
	}

	public void setTipoEntrega(Integer tipoEntrega) {
		this.tipoEntrega = tipoEntrega;
	}

	public BigDecimal getValorBonificado() {
		return valorBonificado;
	}

	public void setValorBonificado(BigDecimal valorBonificado) {
		this.valorBonificado = valorBonificado;
	}

	public BigDecimal getValorBruto() {
		return valorBruto;
	}

	public void setValorBruto(BigDecimal valorBruto) {
		this.valorBruto = valorBruto;
	}

	public BigDecimal getValorDesconto() {
		return valorDesconto;
	}

	public void setValorDesconto(BigDecimal valorDesconto) {
		this.valorDesconto = valorDesconto;
	}

	public BigDecimal getValorFinal() {
		return valorFinal;
	}

	public void setValorFinal(BigDecimal valorFinal) {
		this.valorFinal = valorFinal;
	}

	public BigDecimal getValorLiquido() {
		return valorLiquido;
	}

	public void setValorLiquido(BigDecimal valorLiquido) {
		this.valorLiquido = valorLiquido;
	}

	public BigDecimal getValorVerba() {
		return valorVerba;
	}

	public void setValorVerba(BigDecimal valorVerba) {
		this.valorVerba = valorVerba;
	}

	public Long getCliente() {
		return cliente;
	}

	public void setCliente(Long cliente) {
		this.cliente = cliente;
	}

	public Long getCondicaoPagamento() {
		return condicaoPagamento;
	}

	public void setCondicaoPagamento(Long condicaoPagamento) {
		this.condicaoPagamento = condicaoPagamento;
	}

}