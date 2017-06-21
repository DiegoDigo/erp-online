package br.com.control.vendas.cadastro.modelo.pedido;

public class PedidoSugestao {

	private String produtoRecId;
	private String clienteRecId;
	private String canalRecId;
	private Integer quantidadeCaixa;
	private Integer quantidadeAvusla;

	public String getProdutoRecId() {
		return produtoRecId;
	}
	public void setProdutoRecId(String produtoRecId) {
		this.produtoRecId = produtoRecId;
	}
	public String getClienteRecId() {
		return clienteRecId;
	}
	public void setClienteRecId(String clienteRecId) {
		this.clienteRecId = clienteRecId;
	}
	public String getCanalRecId() {
		return canalRecId;
	}
	public void setCanalRecId(String canalRecId) {
		this.canalRecId = canalRecId;
	}
	public Integer getQuantidadeCaixa() {
		return quantidadeCaixa;
	}
	public void setQuantidadeCaixa(Integer quantidadeCaixa) {
		this.quantidadeCaixa = quantidadeCaixa;
	}
	public Integer getQuantidadeAvusla() {
		return quantidadeAvusla;
	}
	public void setQuantidadeAvusla(Integer quantidadeAvusla) {
		this.quantidadeAvusla = quantidadeAvusla;
	}

}
