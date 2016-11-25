package br.com.control.vendas.cadastro.modelo;

import java.io.Serializable;

@SuppressWarnings("serial")
public class RestricaoFinanceiraItem implements Serializable {

	private Long recId;
	private String codigoTabelaPreco;
	private Long restricaoFinanceira;

	public Long getRecId() {
		return recId;
	}

	public void setRecId(Long recId) {
		this.recId = recId;
	}

	public String getCodigoTabelaPreco() {
		return codigoTabelaPreco;
	}

	public void setCodigoTabelaPreco(String codigoTabelaPreco) {
		this.codigoTabelaPreco = codigoTabelaPreco;
	}

	public Long getRestricaoFinanceira() {
		return restricaoFinanceira;
	}

	public void setRestricaoFinanceira(Long restricaoFinanceira) {
		this.restricaoFinanceira = restricaoFinanceira;
	}

}
