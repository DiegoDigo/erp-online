package br.com.control.portal.mensageria.to;

import java.io.Serializable;

import br.com.control.vendas.cadastro.modelo.produto.Grupo;

public class GrupoTO implements Serializable {

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

	
	public GrupoTO() {
	}

	/**
	 * Construtor de GRUPO_TO
	 * 
	 * @param grupo
	 */
	public GrupoTO(Grupo grupo) {
		this.setCodigoErp(grupo.getCodigoErp());
		this.setDescricao(grupo.getDescricao());
	}

}