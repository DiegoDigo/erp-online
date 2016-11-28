package br.com.control.vendas.cadastro.modelo.preco;

import java.io.Serializable;

@SuppressWarnings("serial")
public class BandaPrecoItem implements Serializable {
	private Long recId;
	private String codigoTabelaPreco;
	private Float desconto_maximo;
	private Integer quantidade;
	private Long codigoBandaPrecoRecId;

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

	public Float getDesconto_maximo() {
		return desconto_maximo;
	}

	public void setDesconto_maximo(Float desconto_maximo) {
		this.desconto_maximo = desconto_maximo;
	}

	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}

	public Long getCodigoBandaPrecoRecId() {
		return codigoBandaPrecoRecId;
	}

	public void setCodigoBandaPrecoRecId(Long codigoBandaPrecoRecId) {
		this.codigoBandaPrecoRecId = codigoBandaPrecoRecId;
	}

}
