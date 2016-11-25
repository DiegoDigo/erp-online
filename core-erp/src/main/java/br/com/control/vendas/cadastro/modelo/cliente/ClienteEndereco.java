package br.com.control.vendas.cadastro.modelo.cliente;

import java.io.Serializable;

@SuppressWarnings("serial")
public class ClienteEndereco implements Serializable {

	private Long recId;
	private String bairro;
	private String cepEndereco;
	private String endereco;
	private String municipio;
	private Integer numero;
	private String pontoReferencia;
	private String ufEndereco;
	private Long origemLogradouro;
	private Long cliente;
	private Long tipoEndereco;

	public Long getRecId() {
		return recId;
	}

	public void setRecId(Long recId) {
		this.recId = recId;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getCepEndereco() {
		return cepEndereco;
	}

	public void setCepEndereco(String cepEndereco) {
		this.cepEndereco = cepEndereco;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getMunicipio() {
		return municipio;
	}

	public void setMunicipio(String municipio) {
		this.municipio = municipio;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public Long getOrigemLogradouro() {
		return origemLogradouro;
	}

	public void setOrigemLogradouro(Long origemLogradouro) {
		this.origemLogradouro = origemLogradouro;
	}

	public String getPontoReferencia() {
		return pontoReferencia;
	}

	public void setPontoReferencia(String pontoReferencia) {
		this.pontoReferencia = pontoReferencia;
	}

	public String getUfEndereco() {
		return ufEndereco;
	}

	public void setUfEndereco(String ufEndereco) {
		this.ufEndereco = ufEndereco;
	}

	public Long getCliente() {
		return cliente;
	}

	public void setCliente(Long cliente) {
		this.cliente = cliente;
	}

	public Long getTipoEndereco() {
		return tipoEndereco;
	}

	public void setTipoEndereco(Long tipoEndereco) {
		this.tipoEndereco = tipoEndereco;
	}

}
