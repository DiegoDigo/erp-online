package br.com.control.portal.mensageria.to;

import java.io.Serializable;

import br.com.control.vendas.cadastro.modelo.preco.BandaPrecoItem;

public class BandaPrecoItemTO implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private Long recId;
	private String codigoTabelaPrecoERP;
	private Float descontoMaximo;
	private Integer quantidade;
	private String codigoBandaPrecoERP;
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
	
	public Float getDescontoMaximo() {
		return descontoMaximo;
	}
	public void setDescontoMaximo(Float descontoMaximo) {
		this.descontoMaximo = descontoMaximo;
	}
	public Integer getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}
	public String getCodigoBandaPrecoERP() {
		return codigoBandaPrecoERP;
	}
	public void setCodigoBandaPrecoERP(String codigoBandaPrecoERP) {
		this.codigoBandaPrecoERP = codigoBandaPrecoERP;
	}
	public BandaPrecoItemTO(BandaPrecoItem bandaPrecoItem) {
		super();
		this.setCodigoTabelaPrecoERP(bandaPrecoItem.getCodigoTabelaPreco());
		this.setDescontoMaximo(bandaPrecoItem.getDescontoMaximo());
		this.setQuantidade(bandaPrecoItem.getQuantidade());
		this.setCodigoBandaPrecoERP(bandaPrecoItem.getCodigoBandaPrecoERP());
	}
	
	
	

	
}
