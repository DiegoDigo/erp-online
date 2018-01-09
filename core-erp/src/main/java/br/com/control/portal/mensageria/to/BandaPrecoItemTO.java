package br.com.control.portal.mensageria.to;

import java.io.Serializable;

import br.com.control.vendas.cadastro.modelo.preco.BandaPrecoItem;

public class BandaPrecoItemTO implements Serializable {

	private static final long serialVersionUID = 1L;

	private Long recId;
	private Integer quantidade;
	private String codigoTabelaPrecoERP;
	private float descontoMaximo;
	private Integer codigoBandaPrecoERP;

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

	public float getDescontoMaximo() {
		return descontoMaximo;
	}

	public void setDescontoMaximo(float descontoMaximo) {
		this.descontoMaximo = descontoMaximo;
	}

	public BandaPrecoItemTO(BandaPrecoItem bandaPrecoItem) {
		super();
		this.setCodigoTabelaPrecoERP(bandaPrecoItem.getCodigoTabelaPreco());
		this.setDescontoMaximo(bandaPrecoItem.getDescontoMaximo());
		this.setQuantidade(bandaPrecoItem.getQuantidade());
		this.setCodigoBandaPrecoERP(bandaPrecoItem.getCodigoBandaPrecoERP());
	}

}
