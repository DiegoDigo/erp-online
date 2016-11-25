package br.com.control.vendas.cadastro.modelo.pedido;

public class HistoricoPedidoItem {

	private Long recId;
	private String numeroItemPedido;
	private float precoProduto;
	private Integer quantidadeAvulsa;
	private Integer quantidadeCaixa;
	private Long ocorrencia;
	private Long preco;
	private Long produto;
	private Long historicoPedidoCapa;

	public Long getRecId() {
		return recId;
	}

	public void setRecId(Long recId) {
		this.recId = recId;
	}

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

	public Long getOcorrencia() {
		return ocorrencia;
	}

	public void setOcorrencia(Long ocorrencia) {
		this.ocorrencia = ocorrencia;
	}

	public Long getPreco() {
		return preco;
	}

	public void setPreco(Long preco) {
		this.preco = preco;
	}

	public Long getProduto() {
		return produto;
	}

	public void setProduto(Long produto) {
		this.produto = produto;
	}

	public Long getHistoricoPedidoCapa() {
		return historicoPedidoCapa;
	}

	public void setHistoricoPedidoCapa(Long historicoPedidoCapa) {
		this.historicoPedidoCapa = historicoPedidoCapa;
	}

}
