package br.com.control.portal.mensageria.to;

import java.io.Serializable;

import br.com.control.vendas.cadastro.modelo.tipoCobranca.TipoCobranca;

public class TipoCobrancaTO implements Serializable {

	private static final long serialVersionUID = 1L;

	private Boolean ativo;
	private String codigoErp;
	private String descricao;
	private Integer prazo;
	private Integer red;
	private Integer redF;

	public Boolean getAtivo() {
		return ativo;
	}

	public void setAtivo(Boolean ativo) {
		this.ativo = ativo;
	}

	public String getCodigoErp() {
		return codigoErp;
	}

	public void setCodigoErp(String codigoErp) {
		this.codigoErp = codigoErp;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Integer getPrazo() {
		return prazo;
	}

	public void setPrazo(Integer prazo) {
		this.prazo = prazo;
	}

	public Integer getRed() {
		return red;
	}

	public void setRed(Integer red) {
		this.red = red;
	}

	public Integer getRedF() {
		return redF;
	}

	public void setRedF(Integer redF) {
		this.redF = redF;
	}

	/**
	 * @param tipoCobranca
	 */
	public TipoCobrancaTO(TipoCobranca tipoCobranca) {
		this.setAtivo(tipoCobranca.getAtivo());
		this.setCodigoErp(tipoCobranca.getCodigoErp());
		this.setDescricao(tipoCobranca.getDescricao());
		this.setPrazo(tipoCobranca.getPrazo());
		this.setRed(tipoCobranca.getRed());
		this.setRedF(tipoCobranca.getRedF());

	}
}