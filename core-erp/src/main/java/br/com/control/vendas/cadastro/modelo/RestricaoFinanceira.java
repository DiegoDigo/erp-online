package br.com.control.vendas.cadastro.modelo;

import java.io.Serializable;

@SuppressWarnings("serial")
public class RestricaoFinanceira implements Serializable {

	private Long recId;
	private Boolean ativo;
	private String codigoRestricaoFinanceira;
	private float desconto;
	private float descontoMaximo;
	private float taxa;
	private float valorMaximoPedido;
	private float valorMinimoPedido;
	private Long condicaoPagamento;
	private Long tipoCobranca;

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

	public float getDesconto() {
		return desconto;
	}

	public void setDesconto(float desconto) {
		this.desconto = desconto;
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

	public Long getCondicaoPagamento() {
		return condicaoPagamento;
	}

	public void setCondicaoPagamento(Long condicaoPagamento) {
		this.condicaoPagamento = condicaoPagamento;
	}

	public Long getTipoCobranca() {
		return tipoCobranca;
	}

	public void setTipoCobranca(Long tipoCobranca) {
		this.tipoCobranca = tipoCobranca;
	}

}