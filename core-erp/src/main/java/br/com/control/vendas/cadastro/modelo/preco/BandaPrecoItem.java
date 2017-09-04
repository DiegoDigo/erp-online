package br.com.control.vendas.cadastro.modelo.preco;

import java.io.Serializable;

@SuppressWarnings("serial")
public class BandaPrecoItem implements Serializable {
	private Long recId;
	private String codigoTabelaPreco;
	private float descontoMaximo;
	private Integer quantidade;
	private Integer codigoBandaPrecoERP;

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

	public float getDescontoMaximo() {
		return descontoMaximo;
	}

	public void setDescontoMaximo(float descontoMaximo) {
		this.descontoMaximo = descontoMaximo;
	}

	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}

	public Integer getCodigoBandaPrecoERP() {
		return codigoBandaPrecoERP;
	}

	public void setCodigoBandaPrecoERP(Integer codigoBandaPrecoERP) {
		this.codigoBandaPrecoERP = codigoBandaPrecoERP;
	}

}
