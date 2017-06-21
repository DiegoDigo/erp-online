package br.com.control.vendas.cadastro.modelo.produto;

import java.io.Serializable;

@SuppressWarnings("serial")
public class ProdutoCanal implements Serializable {

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
	

	
}
