package br.com.control.portal.mensageria;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PedidoCapa implements Serializable {

	private static final long serialVersionUID = 1L;

	private Long recId;

	 private Boolean ativo = false;
	
	 private Timestamp dataHoraEmissao;
	
	 private Date dataPrimeiraParcela;

	private String numeroPedidoGestao;

	 private String observacao = "";
	
	 private Boolean pedidoAberto = false;
	
	 private Boolean pedidoTransmitido = false;
	
	 private float percDesconto = 0;
	
	 private float percTaxaFinanc = 0;
	
	 private Boolean permiteErpAjustarPedido = false;
	
	 private Integer qtdeAvulsa = 0;
	
	 private Integer qtdeCaixa = 0;
	
	 private Integer tipoEntrega = 0;
	
	 private BigDecimal valorBonificado = BigDecimal.ZERO;
	
	 private BigDecimal valorBruto = BigDecimal.ZERO;
	
	 private BigDecimal valorDesconto = BigDecimal.ZERO;
	
	 private BigDecimal valorFinal = BigDecimal.ZERO;
	
	 private BigDecimal valorLiquido = BigDecimal.ZERO;
	
	 private BigDecimal valorVerba = BigDecimal.ZERO;

	 private CondicaoPagamento condicaoPagamento;
	
	 private TipoCobranca tipoCobranca;
	
	 private MatriculaEmpresa matriculaEmpresa;
	
	 private List<PedidoItem> pedidoItems = new ArrayList<>();

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

	 public CondicaoPagamento getCondicaoPagamento() {
	 return condicaoPagamento;
	 }
	
	 public void setCondicaoPagamento(CondicaoPagamento condicaoPagamento) {
	 this.condicaoPagamento = condicaoPagamento;
	 }
	
	 public TipoCobranca getTipoCobranca() {
	 return tipoCobranca;
	 }
	
	 public void setTipoCobranca(TipoCobranca tipoCobranca) {
	 this.tipoCobranca = tipoCobranca;
	 }
	
	 public List<PedidoItem> getPedidoItems() {
	 return pedidoItems;
	 }
	
	 public void setPedidoItems(List<PedidoItem> pedidoItems) {
	 this.pedidoItems = pedidoItems;
	 }
	
	 public MatriculaEmpresa getMatriculaEmpresa() {
	 return matriculaEmpresa;
	 }
	
	 public void setMatriculaEmpresa(MatriculaEmpresa matriculaEmpresa) {
	 this.matriculaEmpresa = matriculaEmpresa;
	 }

	@Override
	public String toString() {
		return "PedidoCapa [recId=" + recId + ", numeroPedidoGestao=" + numeroPedidoGestao + "]";
	}

}
