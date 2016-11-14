package br.com.control.portal.mensageria;

import java.io.Serializable;

public class TipoCobranca implements Serializable {

	private static final long serialVersionUID = 1L;

	private Long recId;

	private String codigoTipoCobranca;

	private String descricao;

	private Integer prazo;

	private Integer red;

	private Integer redF;

	private Boolean ativo;

	public Long getRecId() {
		return recId;
	}

	public void setRecId(Long recId) {
		this.recId = recId;
	}

	public String getCodigoTipoCobranca() {
		return codigoTipoCobranca;
	}

	public void setCodigoTipoCobranca(String codigoTipoCobranca) {
		this.codigoTipoCobranca = codigoTipoCobranca;
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

	public Boolean getAtivo() {
		return ativo;
	}

	public void setAtivo(Boolean ativo) {
		this.ativo = ativo;
	}

}
