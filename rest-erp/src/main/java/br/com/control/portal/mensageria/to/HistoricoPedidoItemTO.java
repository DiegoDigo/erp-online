package br.com.control.portal.mensageria.to;

import java.io.Serializable;

import br.com.control.vendas.cadastro.modelo.pedido.HistoricoPedidoItem;

public class HistoricoPedidoItemTO implements Serializable {
	
	private static final long serialVersionUID = 1L;

	private String numeroItemPedido;
	private float precoProduto;
	private Integer quantidadeAvulsa;
	private Integer quantidadeCaixa;
	private Long codigoOcorrenciaErp;
	private Long codigoPrecoErp;
	private Long codigoProdutoErp;
	private Long historicoPedidoCapaErp;

	public String getNumeroItemPedido() {
		return numeroItemPedido;
	}

	public void setNumeroItemPedido(String numeroItemPedido) {
		this.numeroItemPedido = numeroItemPedido;
	}

	public float getPrecoProduto() {
		return precoProduto;
	}

	public void setPrecoProduto(float precoProduto) {
		this.precoProduto = precoProduto;
	}

	public Integer getQuantidadeAvulsa() {
		return quantidadeAvulsa;
	}

	public void setQuantidadeAvulsa(Integer quantidadeAvulsa) {
		this.quantidadeAvulsa = quantidadeAvulsa;
	}

	public Integer getQuantidadeCaixa() {
		return quantidadeCaixa;
	}

	public void setQuantidadeCaixa(Integer quantidadeCaixa) {
		this.quantidadeCaixa = quantidadeCaixa;
	}

	public Long getCodigoPrecoErp() {
		return codigoPrecoErp;
	}

	public void setCodigoPrecoErp(Long codigoPrecoErp) {
		this.codigoPrecoErp = codigoPrecoErp;
	}

	public Long getCodigoOcorrenciaErp() {
		return codigoOcorrenciaErp;
	}

	public void setCodigoOcorrenciaErp(Long codigoOcorrenciaErp) {
		this.codigoOcorrenciaErp = codigoOcorrenciaErp;
	}

	public Long getCodigoProdutoErp() {
		return codigoProdutoErp;
	}

	public void setCodigoProdutoErp(Long codigoProdutoErp) {
		this.codigoProdutoErp = codigoProdutoErp;
	}

	public Long getHistoricoPedidoCapaErp() {
		return historicoPedidoCapaErp;
	}

	public void setHistoricoPedidoCapaErp(Long historicoPedidoCapaErp) {
		this.historicoPedidoCapaErp = historicoPedidoCapaErp;
	}

	public HistoricoPedidoItemTO(HistoricoPedidoItem historicoPedidoItem) {
		this.numeroItemPedido = historicoPedidoItem.getNumeroItemPedido();
		this.quantidadeAvulsa = historicoPedidoItem.getQuantidadeAvulsa();
		this.quantidadeCaixa = historicoPedidoItem.getQuantidadeCaixa();
		this.codigoOcorrenciaErp = historicoPedidoItem.getCodigoOcorrenciaErp();
		this.codigoPrecoErp = historicoPedidoItem.getCodigoPrecoErp();
		this.codigoProdutoErp = historicoPedidoItem.getCodigoProdutoErp();
		this.historicoPedidoCapaErp = historicoPedidoItem.getHistoricoPedidoCapaErp();
	}
	
	

}
