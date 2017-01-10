package br.com.control.vendas.cadastro.modelo.cliente;

import java.io.Serializable;

@SuppressWarnings("serial")
public class TipoEndereco implements Serializable{
	
	
	private Boolean ativo;
	private String descricaoLogradouro;
	private String siglaLogradouro;
	
	
	
	
	public Boolean getAtivo() {
		return ativo;
	}
	public void setAtivo(Boolean ativo) {
		this.ativo = ativo;
	}
	public String getDescricaoLogradouro() {
		return descricaoLogradouro;
	}
	public void setDescricaoLogradouro(String descricaoLogradouro) {
		this.descricaoLogradouro = descricaoLogradouro;
	}
	public String getSiglaLogradouro() {
		return siglaLogradouro;
	}
	public void setSiglaLogradouro(String siglaLogradouro) {
		this.siglaLogradouro = siglaLogradouro;
	}
	
	
	

}
