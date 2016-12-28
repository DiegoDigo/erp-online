package br.com.control.vendas.cadastro.modelo.produto;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Grupo implements Serializable {

	private int codigoErp;

	private String descricao;

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public int getCodigoErp() {
		return codigoErp;
	}

	public void setCodigoErp(int codigoErp) {
		this.codigoErp = codigoErp;
	}

}
