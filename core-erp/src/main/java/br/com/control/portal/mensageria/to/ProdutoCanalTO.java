package br.com.control.portal.mensageria.to;

import java.io.Serializable;

import br.com.control.vendas.cadastro.modelo.produto.ProdutoCanal;

public class ProdutoCanalTO implements Serializable {

	private static final long serialVersionUID = 1L;

	private String codigoCanalErp;

	private String codigoClienteErp;
	
	private String codigoProdutoErp;
	
	public String getCodigoCanalErp() {
		return codigoCanalErp;
	}

	public void setCodigoCanalErp(String codigoCanalErp) {
		this.codigoCanalErp = codigoCanalErp;
	}

	public String getCodigoClienteErp() {
		return codigoClienteErp;
	}

	public void setCodigoClienteErp(String codigoClienteErp) {
		this.codigoClienteErp = codigoClienteErp;
	}

	public String getCodigoProdutoErp() {
		return codigoProdutoErp;
	}

	public void setCodigoProdutoErp(String codigoProdutoErp) {
		this.codigoProdutoErp = codigoProdutoErp;
	}

	public ProdutoCanalTO(ProdutoCanal produtoCanal) {
		this.setCodigoCanalErp(produtoCanal.getCodigoCanalErp());
		this.setCodigoClienteErp(produtoCanal.getCodigoClienteErp());
		this.setCodigoProdutoErp(produtoCanal.getCodigoProdutoErp());
	}
}