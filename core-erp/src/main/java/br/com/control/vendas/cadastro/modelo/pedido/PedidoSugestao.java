package br.com.control.vendas.cadastro.modelo.pedido;

public class PedidoSugestao {

	private Long recId;
	private Long matriculaRecId;
	private Long produtoRecId;
	private Long clienteRecId;
	private Long canalRecId;
	private Integer quantidadeCaixa;
	private Integer quantidadeAvusla;

	public Long getRecId() {
		return recId;
	}

	public void setRecId(Long recId) {
		this.recId = recId;
	}

	public Long getMatriculaRecId() {
		return matriculaRecId;
	}

	public void setMatriculaRecId(Long matriculaRecId) {
		this.matriculaRecId = matriculaRecId;
	}

	public Long getProdutoRecId() {
		return produtoRecId;
	}

	public void setProdutoRecId(Long produtoRecId) {
		this.produtoRecId = produtoRecId;
	}

	public Long getClienteRecId() {
		return clienteRecId;
	}

	public void setClienteRecId(Long clienteRecId) {
		this.clienteRecId = clienteRecId;
	}

	public Long getCanalRecId() {
		return canalRecId;
	}

	public void setCanalRecId(Long canalRecId) {
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
