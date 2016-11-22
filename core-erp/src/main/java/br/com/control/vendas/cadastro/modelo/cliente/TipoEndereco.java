package br.com.control.vendas.cadastro.modelo.cliente;

import java.io.Serializable;

@SuppressWarnings("serial")
public class TipoEndereco implements Serializable{
	
	private Long recId;
	private Boolean ativo;
	private String descricaoLogradouro;
	private String siglaLogradouro;
	private Long matriculaRecId;
	
	
	public Long getMatriculaRecId() {
		return matriculaRecId;
	}
	public void setMatriculaRecId(Long matriculaRecId) {
		this.matriculaRecId = matriculaRecId;
	}
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
