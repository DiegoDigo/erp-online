package br.com.control.vendas.cadastro.modelo;

import java.io.Serializable;

@SuppressWarnings("serial")
public class RestricaoComercialItem implements Serializable {

	private Long recId;
	private String codigoTebelaPrecoERP;
	private String codigoRestricaoComercialERP;
	

	public Long getRecId() {
		return recId;
	}

	public void setRecId(Long recId) {
		this.recId = recId;
	}

	public String getCodigoTebelaPrecoERP() {
		return codigoTebelaPrecoERP;
	}

	public void setCodigoTebelaPrecoERP(String codigoTebelaPrecoERP) {
		this.codigoTebelaPrecoERP = codigoTebelaPrecoERP;
	}

	public String getCodigoRestricaoComercialERP() {
		return codigoRestricaoComercialERP;
	}

	public void setCodigoRestricaoComercialERP(String codigoRestricaoComercialERP) {
		this.codigoRestricaoComercialERP = codigoRestricaoComercialERP;
	}

}