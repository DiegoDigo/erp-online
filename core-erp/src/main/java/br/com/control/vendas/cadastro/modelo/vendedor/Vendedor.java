package br.com.control.vendas.cadastro.modelo.vendedor;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Vendedor implements Serializable{

	private Long recId;
	private Boolean ativo;
	private String codigoVendedor;
	private String telefone_ddd;
	private String telefone_tronco;
	private String tipo;
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
	public String getCodigoVendedor() {
		return codigoVendedor;
	}
	public void setCodigoVendedor(String codigoVendedor) {
		this.codigoVendedor = codigoVendedor;
	}
	public String getTelefone_ddd() {
		return telefone_ddd;
	}
	public void setTelefone_ddd(String telefone_ddd) {
		this.telefone_ddd = telefone_ddd;
	}
	public String getTelefone_tronco() {
		return telefone_tronco;
	}
	public void setTelefone_tronco(String telefone_tronco) {
		this.telefone_tronco = telefone_tronco;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	
	
}
