package br.com.control.vendas.cadastro.modelo;

import java.io.Serializable;

@SuppressWarnings("serial")
public class RestricaoComercialItem implements Serializable {

	private Long recId;
	private String codigoTabelaPrecoERP;
	private String codigoRestricaoComercialERP;
	

	public Long getRecId() {
		return recId;
	}

	public void setRecId(Long recId) {
		this.recId = recId;
	}

		public String getCodigoTabelaPrecoERP() {
		return codigoTabelaPrecoERP;
	}

	public void setCodigoTabelaPrecoERP(String codigoTabelaPrecoERP) {
		this.codigoTabelaPrecoERP = codigoTabelaPrecoERP;
	}

		public String getCodigoRestricaoComercialERP() {
		return codigoRestricaoComercialERP;
	}

	public void setCodigoRestricaoComercialERP(String codigoRestricaoComercialERP) {
		this.codigoRestricaoComercialERP = codigoRestricaoComercialERP;
	}

}