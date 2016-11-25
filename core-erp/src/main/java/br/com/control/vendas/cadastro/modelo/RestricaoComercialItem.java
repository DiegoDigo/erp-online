package br.com.control.vendas.cadastro.modelo;

import java.io.Serializable;

@SuppressWarnings("serial")
public class RestricaoComercialItem implements Serializable {

	private Long recId;
	private String codigoTebelaPreco;
	private Long codigoRetricaoComercialRecId;

	public Long getRecId() {
		return recId;
	}

	public void setRecId(Long recId) {
		this.recId = recId;
	}

	public String getCodigoTebelaPreco() {
		return codigoTebelaPreco;
	}

	public void setCodigoTebelaPreco(String codigoTebelaPreco) {
		this.codigoTebelaPreco = codigoTebelaPreco;
	}

	public Long getCodigoRetricaoComercialRecId() {
		return codigoRetricaoComercialRecId;
	}

	public void setCodigoRetricaoComercialRecId(Long codigoRetricaoComercialRecId) {
		this.codigoRetricaoComercialRecId = codigoRetricaoComercialRecId;
	}

}
