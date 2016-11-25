package br.com.control.vendas.cadastro.modelo;

import java.io.Serializable;

@SuppressWarnings("serial")
public class RestricaoComercial implements Serializable {

	private Long recId;
	private Boolean ativo;
	private String codigoGrupoCanal;
	private String codigoRestricaoComercial;
	private String divisaoCanal;
	private float valorMinimoPedido;
	private Long canalVenda;
	private Long cliente;
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

	public String getCodigoGrupoCanal() {
		return codigoGrupoCanal;
	}

	public void setCodigoGrupoCanal(String codigoGrupoCanal) {
		this.codigoGrupoCanal = codigoGrupoCanal;
	}

	public String getCodigoRestricaoComercial() {
		return codigoRestricaoComercial;
	}

	public void setCodigoRestricaoComercial(String codigoRestricaoComercial) {
		this.codigoRestricaoComercial = codigoRestricaoComercial;
	}

	public String getDivisaoCanal() {
		return divisaoCanal;
	}

	public void setDivisaoCanal(String divisaoCanal) {
		this.divisaoCanal = divisaoCanal;
	}

	public float getValorMinimoPedido() {
		return valorMinimoPedido;
	}

	public void setValorMinimoPedido(float valorMinimoPedido) {
		this.valorMinimoPedido = valorMinimoPedido;
	}

	public Long getCanalVenda() {
		return canalVenda;
	}

	public void setCanalVenda(Long canalVenda) {
		this.canalVenda = canalVenda;
	}

	public Long getCliente() {
		return cliente;
	}

	public void setCliente(Long cliente) {
		this.cliente = cliente;
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
