package br.com.control.portal.mensageria.to;

import java.io.Serializable;

import br.com.control.vendas.cadastro.modelo.cliente.TipoCobrancaCliente;

public class TipoCobrancaClienteTO implements Serializable {

	private static final long serialVersionUID = 1L;

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

	/**
	 * @param tipoCobrancaCliente
	 */
	public TipoCobrancaClienteTO(TipoCobrancaCliente tipoCobrancaCliente) {
		this.setAtivo(tipoCobrancaCliente.getAtivo());
		this.setCodigoClienteERP(tipoCobrancaCliente.getCodigoClienteERP());
		this.setCodigoTipoConbrancaERP(tipoCobrancaCliente.getCodigoTipoConbrancaERP());
	}
}