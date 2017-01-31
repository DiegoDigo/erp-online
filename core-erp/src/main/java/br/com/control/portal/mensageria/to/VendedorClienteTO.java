package br.com.control.portal.mensageria.to;

import java.io.Serializable;

import br.com.control.vendas.cadastro.modelo.vendedor.VendedorCliente;

public class VendedorClienteTO implements Serializable {

	private static final long serialVersionUID = 1L;

	private Boolean ativo;
	private String codigoClienteERP;
	private String codigoVendedorERP;

	public Boolean getAtivo() {
		return ativo;
	}

	public void setAtivo(Boolean ativo) {
		this.ativo = ativo;
	}

	public String getCodigoClienteERP() {
		return codigoClienteERP;
	}

	public void setCodigoClienteERP(String codigoClienteERP) {
		this.codigoClienteERP = codigoClienteERP;
	}

	public String getCodigoVendedorERP() {
		return codigoVendedorERP;
	}

	public void setCodigoVendedorERP(String codigoVendedorERP) {
		this.codigoVendedorERP = codigoVendedorERP;
	}

	public VendedorClienteTO(VendedorCliente vendedorCliente) {
		this.setCodigoClienteERP(vendedorCliente.getCodigoClienteERP());
		this.setCodigoVendedorERP(vendedorCliente.getCodigoVendedorERP());
		this.setAtivo(vendedorCliente.getAtivo());
	}

}