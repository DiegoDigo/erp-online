package br.com.control.vendas.cadastro.modelo.pedido;

public class PedidoSugestao {

	private String codigoCanalErp;
	private String codigoProdutoErp;
	private String codigoClienteErp;
	private Integer quantidadeCaixa;
	private Integer quantidadeAvulsa;

	public String getCodigoCanalErp() {
		return codigoCanalErp;
	}

	public void setCodigoCanalErp(String codigoCanalErp) {
		this.codigoCanalErp = codigoCanalErp;
	}

	public String getCodigoProdutoErp() {
		return codigoProdutoErp;
	}

	public void setCodigoProdutoErp(String codigoProdutoErp) {
		this.codigoProdutoErp = codigoProdutoErp;
	}

	public String getCodigoClienteErp() {
		return codigoClienteErp;
	}

	public void setCodigoClienteErp(String codigoClienteErp) {
		this.codigoClienteErp = codigoClienteErp;
	}

	public Integer getQuantidadeCaixa() {
		return quantidadeCaixa;
	}

	public void setQuantidadeCaixa(Integer quantidadeCaixa) {
		this.quantidadeCaixa = quantidadeCaixa;
	}

	public Integer getQuantidadeAvulsa() {
		return quantidadeAvulsa;
	}

	public void setQuantidadeAvusla(Integer quantidadeAvulsa) {
		this.quantidadeAvulsa = quantidadeAvulsa;
	}

}
