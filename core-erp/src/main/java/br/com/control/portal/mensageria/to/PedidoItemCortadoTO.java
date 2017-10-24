package br.com.control.portal.mensageria.to;

import java.io.Serializable;

import br.com.control.vendas.cadastro.modelo.pedido.PedidoItemCortado;

public class PedidoItemCortadoTO implements Serializable {

	private static final long serialVersionUID = 1L;

	private String numeroPrepedido;
	private Integer item;
	private String codigoProdutoErp;
	private Integer quantidadeAvulsa;
	private Integer quantidadeCaixa;
	private String motivo;

	public PedidoItemCortadoTO(PedidoItemCortado pedidoItemCortado) {
		this.numeroPrepedido = pedidoItemCortado.getNumeroPrepedido();
		this.item = pedidoItemCortado.getItem();
		this.codigoProdutoErp = pedidoItemCortado.getCodigoProdutoErp();
		this.quantidadeAvulsa = pedidoItemCortado.getQuantidadeAvulsa();
		this.quantidadeCaixa = pedidoItemCortado.getQuantidadeCaixa();
		this.motivo = pedidoItemCortado.getMotivo();
	}

	public String getNumeroPrepedido() {
		return numeroPrepedido;
	}

	public void setNumeroPrepedido(String numeroPrepedido) {
		this.numeroPrepedido = numeroPrepedido;
	}

	public Integer getItem() {
		return item;
	}

	public void setItem(Integer item) {
		this.item = item;
	}

	public String getCodigoProdutoErp() {
		return codigoProdutoErp;
	}

	public void setCodigoProdutoErp(String codigoProdutoErp) {
		this.codigoProdutoErp = codigoProdutoErp;
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

	public String getMotivo() {
		return motivo;
	}

	public void setMotivo(String motivo) {
		this.motivo = motivo;
	}

}
