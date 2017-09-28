package br.com.control.portal.mensageria.to;

import java.io.Serializable;

import br.com.control.vendas.cadastro.modelo.pedido.HistoricoPedidoItem;

public class HistoricoPedidoItemTO implements Serializable {
	
	private static final long serialVersionUID = 1L;

	private String numeroItemPedido;
	private float precoProduto;
	private Integer quantidadeAvulsa;
	private Integer quantidadeCaixa;
	private String codigoOcorrenciaErp;
	private String codigoPrecoErp;
	private String codigoProdutoErp;
	private String historicoPedidoCapaErp;

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

	

	public String getCodigoOcorrenciaErp() {
		return codigoOcorrenciaErp;
	}

	public void setCodigoOcorrenciaErp(String codigoOcorrenciaErp) {
		this.codigoOcorrenciaErp = codigoOcorrenciaErp;
	}

	public String getCodigoPrecoErp() {
		return codigoPrecoErp;
	}

	public void setCodigoPrecoErp(String codigoPrecoErp) {
		this.codigoPrecoErp = codigoPrecoErp;
	}

	public String getCodigoProdutoErp() {
		return codigoProdutoErp;
	}

	public void setCodigoProdutoErp(String codigoProdutoErp) {
		this.codigoProdutoErp = codigoProdutoErp;
	}

	public String getHistoricoPedidoCapaErp() {
		return historicoPedidoCapaErp;
	}

	public void setHistoricoPedidoCapaErp(String historicoPedidoCapaErp) {
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
