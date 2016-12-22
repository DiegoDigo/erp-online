package br.com.control.portal.mensageria.to;

import java.io.Serializable;
import java.math.BigDecimal;

import br.com.control.annotation.SequenciaParametrosProcedure;

public class PedidoItemTO implements Serializable {
	private static final long serialVersionUID = 1L;

	private long recId;

	@SequenciaParametrosProcedure(index = 1)
	private String numeroPrePedidoGestao;
	@SequenciaParametrosProcedure(index = 2)
	private long sequenciaItem;
	@SequenciaParametrosProcedure(index = 3)
	private String codigoOcorrencia;
	@SequenciaParametrosProcedure(index = 4)
	private String codigoReduzidoProduto;
	@SequenciaParametrosProcedure(index = 5)
	private long quantidadeCaixa;
	@SequenciaParametrosProcedure(index = 6)
	private long quantidadeAvulsa;
	@SequenciaParametrosProcedure(index = 7)
	private BigDecimal desconto;
	@SequenciaParametrosProcedure(index = 8)
	private String codigoTabelaPreco;
	@SequenciaParametrosProcedure(index = 9)
	private BigDecimal valorTotal;
	@SequenciaParametrosProcedure(index = 10)
	private BigDecimal valorCaixa;
	@SequenciaParametrosProcedure(index = 11)
	private BigDecimal valorAvulso;
	@SequenciaParametrosProcedure(index = 12, isRetornoProcedure = true)
	private long codigoCapaPedido = 0;
	@SequenciaParametrosProcedure(index = 13, isRetornoProcedure = true)
	private long dataPedido = 0;
	@SequenciaParametrosProcedure(index = 14, isRetornoProcedure = true)
	private long sequenciaPedido = 0;
	public long getRecId() {
		return recId;
	}
	public void setRecId(long recId) {
		this.recId = recId;
	}
	public String getNumeroPrePedidoGestao() {
		return numeroPrePedidoGestao;
	}
	public void setNumeroPrePedidoGestao(String numeroPrePedidoGestao) {
		this.numeroPrePedidoGestao = numeroPrePedidoGestao;
	}
	public long getSequenciaItem() {
		return sequenciaItem;
	}
	public void setSequenciaItem(long sequenciaItem) {
		this.sequenciaItem = sequenciaItem;
	}
	public String getCodigoOcorrencia() {
		return codigoOcorrencia;
	}
	public void setCodigoOcorrencia(String codigoOcorrencia) {
		this.codigoOcorrencia = codigoOcorrencia;
	}
	public String getCodigoReduzidoProduto() {
		return codigoReduzidoProduto;
	}
	public void setCodigoReduzidoProduto(String codigoReduzidoProduto) {
		this.codigoReduzidoProduto = codigoReduzidoProduto;
	}
	public long getQuantidadeCaixa() {
		return quantidadeCaixa;
	}
	public void setQuantidadeCaixa(long quantidadeCaixa) {
		this.quantidadeCaixa = quantidadeCaixa;
	}
	public long getQuantidadeAvulsa() {
		return quantidadeAvulsa;
	}
	public void setQuantidadeAvulsa(long quantidadeAvulsa) {
		this.quantidadeAvulsa = quantidadeAvulsa;
	}
	public BigDecimal getDesconto() {
		return desconto;
	}
	public void setDesconto(BigDecimal desconto) {
		this.desconto = desconto;
	}
	public String getCodigoTabelaPreco() {
		return codigoTabelaPreco;
	}
	public void setCodigoTabelaPreco(String codigoTabelaPreco) {
		this.codigoTabelaPreco = codigoTabelaPreco;
	}
	public BigDecimal getValorTotal() {
		return valorTotal;
	}
	public void setValorTotal(BigDecimal valorTotal) {
		this.valorTotal = valorTotal;
	}
	public BigDecimal getValorCaixa() {
		return valorCaixa;
	}
	public void setValorCaixa(BigDecimal valorCaixa) {
		this.valorCaixa = valorCaixa;
	}
	public BigDecimal getValorAvulso() {
		return valorAvulso;
	}
	public void setValorAvulso(BigDecimal valorAvulso) {
		this.valorAvulso = valorAvulso;
	}
	public long getCodigoCapaPedido() {
		return codigoCapaPedido;
	}
	public void setCodigoCapaPedido(long codigoCapaPedido) {
		this.codigoCapaPedido = codigoCapaPedido;
	}
	public long getDataPedido() {
		return dataPedido;
	}
	public void setDataPedido(long dataPedido) {
		this.dataPedido = dataPedido;
	}
	public long getSequenciaPedido() {
		return sequenciaPedido;
	}
	public void setSequenciaPedido(long sequenciaPedido) {
		this.sequenciaPedido = sequenciaPedido;
	}
}