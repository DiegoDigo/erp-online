package br.com.control.vendas.cadastro.modelo.cliente;

import java.io.Serializable;

@SuppressWarnings("serial")
public class SisOrigemLogradouro implements Serializable {

	private Long recId;
	private Boolean ativo;
	private String descricao;
	private String ogiremLogradouro;

	public Long getRecId() {
		return recId;
	}

	public void setRecId(Long recId) {
		this.recId = recId;
	}

	public Boolean getAtivo() {
		return ativo;
	}

	public void setAtivo(Boolean ativo) {
		this.ativo = ativo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getOgiremLogradouro() {
		return ogiremLogradouro;
	}

	public void setOgiremLogradouro(String ogiremLogradouro) {
		this.ogiremLogradouro = ogiremLogradouro;
	}

}
