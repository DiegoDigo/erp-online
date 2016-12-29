package br.com.control.vendas.cadastro.modelo.vendedor;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Vendedor implements Serializable {

	private Long recId;
	private Boolean ativo;
	private String nome;
	private String codigoVendedor;
	private String telefoneDdd;
	private String telefoneTronco;
	private String tipo;

	public Long getRecId() {
		return recId;
	}

	public void setRecId(Long recId) {
		this.recId = recId;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
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

	public String getTelefoneDdd() {
		return telefoneDdd;
	}

	public void setTelefoneDdd(String telefoneDdd) {
		this.telefoneDdd = telefoneDdd;
	}

	public String getTelefoneTronco() {
		return telefoneTronco;
	}

	public void setTelefoneTronco(String telefoneTronco) {
		this.telefoneTronco = telefoneTronco;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

}
