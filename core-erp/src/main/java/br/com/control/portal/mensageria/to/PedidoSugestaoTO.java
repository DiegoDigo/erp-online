package br.com.control.portal.mensageria.to;

import java.io.Serializable;

import br.com.control.vendas.cadastro.modelo.pedido.PedidoSugestao;

public class PedidoSugestaoTO implements Serializable {

	private static final long serialVersionUID = 1L;

	private int quantidadeCaixa;
	private int quantidadeAvulsa;
	private String codigoCanalErp;
	private String codigoProdutoErp;
	private String codigoClienteErp;
	
	public PedidoSugestaoTO(PedidoSugestao pedidoSugestao){
		this.quantidadeAvulsa = pedidoSugestao.getQuantidadeAvulsa();
		this.quantidadeCaixa = pedidoSugestao.getQuantidadeCaixa();
		this.codigoCanalErp = pedidoSugestao.getCodigoCanalErp();
		this.codigoProdutoErp = pedidoSugestao.getCodigoProdutoErp();
		this.codigoClienteErp = pedidoSugestao.getCodigoClienteErp();
	}
	
	public int getQuantidadeCaixa() {
		return quantidadeCaixa;
	}
	public void setQuantidadeCaixa(int quantidadeCaixa) {
		this.quantidadeCaixa = quantidadeCaixa;
	}
	public int getQuantidadeAvulsa() {
		return quantidadeAvulsa;
	}
	public void setQuantidadeAvulsa(int quantidadeAvulsa) {
		this.quantidadeAvulsa = quantidadeAvulsa;
	}
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
}