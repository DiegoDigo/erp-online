package br.com.control.portal.mensageria.to;

import java.io.Serializable;

import br.com.control.vendas.cadastro.modelo.cliente.ClienteEndereco;

public class ClienteEnderecoTO implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private String bairro;
	private String cepEndereco;
	private String endereco;
	private String municipio;
	private Integer numero;
	private String pontoReferencia;
	private String ufEndereco;
	private String origemLogradouroERP;
	private String codigoClienteERP;
	private String codigoTipoEnderecoERP;
	private String tipoEndereco;
	
	public String getTipoEndereco() {
		return tipoEndereco;
	}
	public void setTipoEndereco(String tipoEndereco) {
		this.tipoEndereco = tipoEndereco;
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
		return codigoTipoEnderecoERP;
	}
	public void setCodigoTipoEnderecoERP(String codigoTipoEnderecoERP) {
		codigoTipoEnderecoERP = codigoTipoEnderecoERP;
	}
	public ClienteEnderecoTO(ClienteEndereco clienteEndereco) {
		super();
		this.bairro = clienteEndereco.getBairro();
		this.cepEndereco = clienteEndereco.getCepEndereco();
		this.endereco = clienteEndereco.getEndereco();
		this.municipio = clienteEndereco.getMunicipio();
		this.numero = clienteEndereco.getNumero();
		this.pontoReferencia = clienteEndereco.getPontoReferencia();
		this.ufEndereco = clienteEndereco.getUfEndereco();
		this.origemLogradouroERP = clienteEndereco.getOrigemLogradouroERP();
		this.codigoClienteERP = clienteEndereco.getCodigoClienteERP();
		this.codigoTipoEnderecoERP = clienteEndereco.getCodigoTipoEnderecoERP();;
	}
	public ClienteEnderecoTO() {}
		
}
