package br.com.control.vendas.cadastro.modelo.cliente;

import java.io.Serializable;

@SuppressWarnings("serial")
public class TipoCobrancaCliente implements Serializable {

	private Long recId;
	private Boolean ativo;
	private Long codigoClienteRecId;
	private Long CodigoTipoCobrancaRecId;

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

	public Long getCodigoClienteRecId() {
		return codigoClienteRecId;
	}

	public void setCodigoClienteRecId(Long codigoClienteRecId) {
		this.codigoClienteRecId = codigoClienteRecId;
	}

	public Long getCodigoTipoCobrancaRecId() {
		return CodigoTipoCobrancaRecId;
	}

	public void setCodigoTipoCobrancaRecId(Long codigoTipoCobrancaRecId) {
		CodigoTipoCobrancaRecId = codigoTipoCobrancaRecId;
	}

}