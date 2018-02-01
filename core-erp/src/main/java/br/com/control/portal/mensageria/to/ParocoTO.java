package br.com.control.portal.mensageria.to;

import java.io.Serializable;

import br.com.control.vendas.cadastro.modelo.produto.Paroco;

public class ParocoTO implements Serializable {

	private static final long serialVersionUID = 1L;

	private String codigoErp;

	private String codigoTabelaPreco;

	private String codigoClienteErp;

	private String codigoEmpresaErp;
	
	private String senhaLiberacaoPedido;
	
	public String getSenhaLiberacaoPedido() {
		return senhaLiberacaoPedido;
	}

	public void setSenhaLiberacaoPedido(String senhaLiberacaoPedido) {
		this.senhaLiberacaoPedido = senhaLiberacaoPedido;
	}

	public ParocoTO() {
	}

	/**
	 * Construtor
	 * 
	 * @param paroco
	 */
	public ParocoTO(Paroco paroco) {
		this.setCodigoEmpresaErp(paroco.getCodigoEmpresaErp());
		this.setCodigoTabelaPreco(paroco.getCodigoTabelaPreco());
		this.setCodigoClienteErp(paroco.getCodigoClienteErp());
		this.setSenhaLiberacaoPedido(paroco.getSenhaLiberacaoPedido());
	}

	public String getCodigoErp() {
		return codigoErp;
	}

	public void setCodigoErp(String codigoErp) {
		this.codigoErp = codigoErp;
	}

	public String getCodigoTabelaPreco() {
		return codigoTabelaPreco;
	}

	public void setCodigoTabelaPreco(String codigoTabelaPreco) {
		this.codigoTabelaPreco = codigoTabelaPreco;
	}

	public String getCodigoClienteErp() {
		return codigoClienteErp;
	}

	public void setCodigoClienteErp(String codigoClienteErp) {
		this.codigoClienteErp = codigoClienteErp;
	}

	public String getCodigoEmpresaErp() {
		return codigoEmpresaErp;
	}

	public void setCodigoEmpresaErp(String codigoEmpresaErp) {
		this.codigoEmpresaErp = codigoEmpresaErp;
	}

}