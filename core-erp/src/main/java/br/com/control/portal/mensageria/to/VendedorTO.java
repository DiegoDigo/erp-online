package br.com.control.portal.mensageria.to;

import java.io.Serializable;

import br.com.control.vendas.cadastro.modelo.vendedor.Vendedor;

public class VendedorTO implements Serializable {

	private static final long serialVersionUID = 1L;

	private Boolean ativo;
	private String nome;
	private String codigoVendedor;
	private String telefoneDdd;
	private String telefoneTronco;
	private String tipo;

	public Boolean getAtivo() {
		return ativo;
	}

	public void setAtivo(Boolean ativo) {
		this.ativo = ativo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
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

	/**
	 * Construtor
	 * 
	 * @param vendedor
	 */
	public VendedorTO(Vendedor vendedor) {
		this.setCodigoVendedor(vendedor.getCodigoVendedor());
		this.setNome(vendedor.getNome());
		this.setTelefoneDdd(vendedor.getTelefoneDdd());
		this.setTelefoneTronco(vendedor.getTelefoneTronco());
		this.setTipo(vendedor.getTipo());
		this.setAtivo(vendedor.getAtivo());
	}

}