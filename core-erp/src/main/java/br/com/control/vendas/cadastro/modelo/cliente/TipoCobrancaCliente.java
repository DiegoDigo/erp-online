package br.com.control.vendas.cadastro.modelo.cliente;

import java.io.Serializable;

@SuppressWarnings("serial")
public class TipoCobrancaCliente implements Serializable {

	private Long recId;
	private Boolean ativo;
	private String codigoClienteERP;
	private String codigoTipoConbrancaERP;

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

	public String getCodigoClienteERP() {
		return codigoClienteERP;
	}

	public void setCodigoClienteERP(String codigoClienteERP) {
		this.codigoClienteERP = codigoClienteERP;
	}

	public String getCodigoTipoConbrancaERP() {
		return codigoTipoConbrancaERP;
	}

	public void setCodigoTipoConbrancaERP(String codigoTipoConbrancaERP) {
		this.codigoTipoConbrancaERP = codigoTipoConbrancaERP;
	}

}