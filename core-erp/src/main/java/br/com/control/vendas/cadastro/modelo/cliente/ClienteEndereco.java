package br.com.control.vendas.cadastro.modelo.cliente;

import java.io.Serializable;

import br.com.control.portal.mensageria.to.ClienteEnderecoTO;

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
	private String origemLogradouroERP;
	private String codigoClienteERP;
	private String CodigoTipoEnderecoERP;
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
	public String getOrigemLogradouroERP() {
		return origemLogradouroERP;
	}
	public void setOrigemLogradouroERP(String origemLogradouroERP) {
		this.origemLogradouroERP = origemLogradouroERP;
	}
	public String getCodigoClienteERP() {
		return codigoClienteERP;
	}
	public void setCodigoClienteERP(String codigoClienteERP) {
		this.codigoClienteERP = codigoClienteERP;
	}
	public String getCodigoTipoEnderecoERP() {
		return CodigoTipoEnderecoERP;
	}
	public void setCodigoTipoEnderecoERP(String codigoTipoEnderecoERP) {
		CodigoTipoEnderecoERP = codigoTipoEnderecoERP;

	}
	
	public ClienteEndereco() {}
	
	public ClienteEndereco(ClienteEnderecoTO clienteEnderecoTO) {		
		this.bairro = clienteEnderecoTO.getBairro();
		this.cepEndereco = clienteEnderecoTO.getCepEndereco();
		this.endereco = clienteEnderecoTO.getEndereco();
		this.municipio = clienteEnderecoTO.getMunicipio();
		this.numero = clienteEnderecoTO.getNumero();
		this.pontoReferencia = clienteEnderecoTO.getPontoReferencia();
		this.ufEndereco = clienteEnderecoTO.getUfEndereco();
		this.origemLogradouroERP = clienteEnderecoTO.getOrigemLogradouroERP();
		this.codigoClienteERP = clienteEnderecoTO.getCodigoClienteERP();
		this.CodigoTipoEnderecoERP = clienteEnderecoTO.getCodigoTipoEnderecoERP();
	}
	
	
	
	
}
