package br.com.control.portal.mensageria.to;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import br.com.control.vendas.cadastro.modelo.RestricaoFinanceira;

public class RestricaoFinanceiraTO implements Serializable {

	private static final long serialVersionUID = 1L;

	private Long recId;
	private Boolean ativo;
	private String codigoRestricaoFinanceira;
	private float descontoItem;
	private float descontoMaximo;
	private float taxa;
	private float valorMaximoPedido;
	private float valorMinimoPedido;
	private Long codigoCondicaoPagamentoERP;
	private Long codigoTipoCobrancaERP;
	private List<RestricaoFinanceiraItemTO> restricaoItens = new ArrayList<>();

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

	public String getCodigoRestricaoFinanceira() {
		return codigoRestricaoFinanceira;
	}

	public void setCodigoRestricaoFinanceira(String codigoRestricaoFinanceira) {
		this.codigoRestricaoFinanceira = codigoRestricaoFinanceira;
	}

	public float getDescontoItem() {
		return descontoItem;
	}

	public void setDescontoItem(float descontoItem) {
		this.descontoItem = descontoItem;
	}

	public float getDescontoMaximo() {
		return descontoMaximo;
	}

	public void setDescontoMaximo(float descontoMaximo) {
		this.descontoMaximo = descontoMaximo;
	}

	public float getTaxa() {
		return taxa;
	}

	public void setTaxa(float taxa) {
		this.taxa = taxa;
	}

	public float getValorMaximoPedido() {
		return valorMaximoPedido;
	}

	public void setValorMaximoPedido(float valorMaximoPedido) {
		this.valorMaximoPedido = valorMaximoPedido;
	}

	public float getValorMinimoPedido() {
		return valorMinimoPedido;
	}

	public void setValorMinimoPedido(float valorMinimoPedido) {
		this.valorMinimoPedido = valorMinimoPedido;
	}

	public List<RestricaoFinanceiraItemTO> getRestricaoItens() {
		return restricaoItens;
	}

	public void setRestricaoItens(List<RestricaoFinanceiraItemTO> restricaoItens) {
		this.restricaoItens = restricaoItens;
	}

	public RestricaoFinanceiraTO(RestricaoFinanceira restricaoFinanceira) {
		this.setAtivo(restricaoFinanceira.getAtivo());
		this.setCodigoRestricaoFinanceira(restricaoFinanceira.getCodigoRestricaoFinanceira());
		this.setCodigoTipoCobrancaERP(restricaoFinanceira.getCodigoTipoCobrancaERP());
		this.setCodigoCondicaoPagamentoERP(restricaoFinanceira.getCodigoCondicaoPagamentoERP());
		this.setDescontoItem(restricaoFinanceira.getDescontoItem());
		this.setDescontoMaximo(restricaoFinanceira.getDescontoMaximo());
		this.setTaxa(restricaoFinanceira.getTaxa());
		this.setValorMinimoPedido(restricaoFinanceira.getValorMinimoPedido());
		this.setValorMaximoPedido(restricaoFinanceira.getValorMaximoPedido());
	}

	public Long getCodigoCondicaoPagamentoERP() {
		return codigoCondicaoPagamentoERP;
	}

	public void setCodigoCondicaoPagamentoERP(Long codigoCondicaoPagamentoERP) {
		this.codigoCondicaoPagamentoERP = codigoCondicaoPagamentoERP;
	}

	public Long getCodigoTipoCobrancaERP() {
		return codigoTipoCobrancaERP;
	}

	public void setCodigoTipoCobrancaERP(Long codigoTipoCobrancaERP) {
		this.codigoTipoCobrancaERP = codigoTipoCobrancaERP;
	}

}
