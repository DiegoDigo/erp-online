package br.com.control.vendas.cadastro.modelo.canal;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Canal implements Serializable{
	private Long recId;
	private Boolean ativo;
	private String autoServico;
	private String codigoCanal;
	private String codigoGrupoCanal;
	private String descricao;
	private String descricaoComplemetar;
	private String divisaoCanal;
	private Long matriculaRecId;
	
	
	public Long getRecId() {
		return recId;
	}
	public void setRecId(Long redId) {
		this.recId = redId;
	}
	public Boolean getAtivo() {
		return ativo;
	}
	public void setAtivo(Boolean ativo) {
		this.ativo = ativo;
	}
	public String getAutoServico() {
		return autoServico;
	}
	public void setAutoServico(String autoServico) {
		this.autoServico = autoServico;
	}
	public String getCodigoCanal() {
		return codigoCanal;
	}
	public void setCodigoCanal(String codigoCanal) {
		this.codigoCanal = codigoCanal;
	}
	public String getCodigoGrupoCanal() {
		return codigoGrupoCanal;
	}
	public void setCodigoGrupoCanal(String codigoGrupoCcanal) {
		this.codigoGrupoCanal = codigoGrupoCcanal;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getDescricaoComplemeta() {
		return descricaoComplemetar;
	}
	public void setDescricaoComplemeta(String descricaoComplemetar) {
		this.descricaoComplemetar = descricaoComplemetar;
	}
	public String getDivisaoCanal() {
		return divisaoCanal;
	}
	public void setDivisaoCanal(String divisaoCanal) {
		this.divisaoCanal = divisaoCanal;
	}
	public Long getMatriculaRecId() {
		return matriculaRecId;
	}
	public void setMatriculaRecId(Long matriculaRecId) {
		this.matriculaRecId = matriculaRecId;
	}
	
	
}
