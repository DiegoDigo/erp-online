package br.com.control.portal.mensageria.to;

import java.io.Serializable;

import br.com.control.vendas.cadastro.modelo.produto.Marca;

public class MarcaTO implements Serializable {

	private static final long serialVersionUID = 1L;

	private String codigoErp;

	private String descricao;

	public String getCodigoErp() {
		return codigoErp;
	}

	public void setCodigoErp(String codigoErp) {
		this.codigoErp = codigoErp;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public MarcaTO() {
	}

	/**
	 * Construtor
	 * 
	 * @param marca
	 */
	public MarcaTO(Marca marca) {
		this.setCodigoErp(marca.getCodigoErp());
		this.setDescricao(marca.getDescricao());
	}

}