package br.com.control.portal.mensageria.to;

import java.io.Serializable;

import br.com.control.vendas.cadastro.modelo.produto.Familia;

public class FamiliaTO implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private String codigoErp;

	private String descricao;
	
	private String codigoFameb;

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getCodigoFameb() {
		return codigoFameb;
	}

	public void setCodigoFameb(String codigoFameb) {
		this.codigoFameb = codigoFameb;
	}

	public String getCodigoErp() {
		return codigoErp;
	}

	public void setCodigoErp(String codigoErp) {
		this.codigoErp = codigoErp;
	}
	
	/**
	 * Construtor
	 * 
	 * @param familia
	 */
	public FamiliaTO(Familia familia) {
		this.setCodigoErp(familia.getCodigoErp());
		this.setDescricao(familia.getDescricao());
		this.setCodigoFameb(familia.getCodigoFameb());
	}
	
}