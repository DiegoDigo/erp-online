package br.com.control.portal.mensageria.to;

import java.io.Serializable;

import br.com.control.vendas.cadastro.modelo.cliente.TipoEndereco;

public class TipoEnderecoTO implements Serializable {

	private static final long serialVersionUID = 1L;

	private Long recId;

	private Boolean ativo;

	private String descricaoLogradouro;

	private String siglaLogradouro;

	public TipoEnderecoTO() {
	}

	public TipoEnderecoTO(String siglaLogradouro, String descricaoLogradouro, Boolean ativo) {
		super();
		this.siglaLogradouro = siglaLogradouro;
		this.descricaoLogradouro = descricaoLogradouro;
		this.ativo = ativo;
	}

	public TipoEnderecoTO(TipoEndereco tipoEndereco) {
		super();
		this.siglaLogradouro = tipoEndereco.getSiglaLogradouro();
		this.descricaoLogradouro = tipoEndereco.getDescricaoLogradouro();
		this.ativo = tipoEndereco.getAtivo();
	}
	public Boolean getAtivo() {
		return ativo;
	}

	public void setAtivo(Boolean ativo) {
		this.ativo = ativo;
	}

	public Long getRecId() {
		return this.recId;
	}

	public void setRecId(Long recId) {
		this.recId = recId;
	}

	public String getDescricaoLogradouro() {
		return this.descricaoLogradouro;
	}

	public void setDescricaoLogradouro(String descricaoLogradouro) {
		this.descricaoLogradouro = descricaoLogradouro;
	}

	public String getSiglaLogradouro() {
		return this.siglaLogradouro;
	}

	public void setSiglaLogradouro(String siglaLogradouro) {
		this.siglaLogradouro = siglaLogradouro;
	}

	
}
