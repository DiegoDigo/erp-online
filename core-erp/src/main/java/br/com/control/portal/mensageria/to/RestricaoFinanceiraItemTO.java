package br.com.control.portal.mensageria.to;

import java.io.Serializable;

import br.com.control.vendas.cadastro.modelo.RestricaoFinanceiraItem;

public class RestricaoFinanceiraItemTO implements Serializable {

	private static final long serialVersionUID = 1L;

	private Long recId;
	private String codigoTabelaPreco;
	private String restricaoFinanceira;

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

	public String getRestricaoFinanceira() {
		return restricaoFinanceira;
	}

	public void setRestricaoFinanceira(String restricaoFinanceira) {
		this.restricaoFinanceira = restricaoFinanceira;
	}

	public RestricaoFinanceiraItemTO(RestricaoFinanceiraItem restricaoFinanceiraItem) {
		this.setRestricaoFinanceira(restricaoFinanceiraItem.getRestricaoFinanceira());
		this.setCodigoTabelaPreco(restricaoFinanceiraItem.getCodigoTabelaPreco());
	}

}
