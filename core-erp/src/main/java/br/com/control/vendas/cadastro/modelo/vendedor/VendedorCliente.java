package br.com.control.vendas.cadastro.modelo.vendedor;

import java.io.Serializable;

@SuppressWarnings("serial")
public class VendedorCliente implements Serializable {


    private Boolean ativo;
    private String codigoClienteERP;
    private String codigoVendedorERP;
    private int vendedor;

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

    public int getVendedor() {
        return vendedor;
    }

    public void setVendedor(int vendedor) {
        this.vendedor = vendedor;
    }
}
