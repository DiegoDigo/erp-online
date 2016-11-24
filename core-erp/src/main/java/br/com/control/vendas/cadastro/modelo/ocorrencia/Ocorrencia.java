package br.com.control.vendas.cadastro.modelo.ocorrencia;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Ocorrencia implements Serializable {

	private Long recId;
	private Boolean ativo;
	private String codigoOcorrencia;
	private String descricao;
	private String descricaoReduzida;
	private String desdobro;
	private String empresa;
	private Boolean geraMotivoFinanc;
	private Integer naturezaOperacao;
	private Integer naturezaOperacaoM;
	private Integer naturezaOperacaoO;
	private Boolean ocorrDispPortal;
	private String sinal;
	private String tipo;
	private String tipoProduto;
	private Long tipoOcorrenciaRecId;

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

	public String getCodigoOcorrencia() {
		return codigoOcorrencia;
	}

	public void setCodigoOcorrencia(String codigoOcorrencia) {
		this.codigoOcorrencia = codigoOcorrencia;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getDescricaoReduzida() {
		return descricaoReduzida;
	}

	public void setDescricaoReduzida(String descricaoReduzida) {
		this.descricaoReduzida = descricaoReduzida;
	}

	public String getDesdobro() {
		return desdobro;
	}

	public void setDesdobro(String desdobro) {
		this.desdobro = desdobro;
	}

	public String getEmpresa() {
		return empresa;
	}

	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}

	public Boolean getGeraMotivoFinanc() {
		return geraMotivoFinanc;
	}

	public void setGeraMotivoFinanc(Boolean geraMotivoFinanc) {
		this.geraMotivoFinanc = geraMotivoFinanc;
	}

	public Integer getNaturezaOperacao() {
		return naturezaOperacao;
	}

	public void setNaturezaOperacao(Integer naturezaOperacao) {
		this.naturezaOperacao = naturezaOperacao;
	}

	public Integer getNaturezaOperacaoM() {
		return naturezaOperacaoM;
	}

	public void setNaturezaOperacaoM(Integer naturezaOperacaoM) {
		this.naturezaOperacaoM = naturezaOperacaoM;
	}

	public Integer getNaturezaOperacaoO() {
		return naturezaOperacaoO;
	}

	public void setNaturezaOperacaoO(Integer naturezaOperacaoO) {
		this.naturezaOperacaoO = naturezaOperacaoO;
	}

	public Boolean getOcorrDispPortal() {
		return ocorrDispPortal;
	}

	public void setOcorrDispPortal(Boolean ocorrDispPortal) {
		this.ocorrDispPortal = ocorrDispPortal;
	}

	public String getSinal() {
		return sinal;
	}

	public void setSinal(String sinal) {
		this.sinal = sinal;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getTipoProduto() {
		return tipoProduto;
	}

	public void setTipoProduto(String tipoProduto) {
		this.tipoProduto = tipoProduto;
	}

	public Long getTipoOcorrenciaRecId() {
		return tipoOcorrenciaRecId;
	}

	public void setTipoOcorrenciaRecId(Long tipoOcorrenciaRecId) {
		this.tipoOcorrenciaRecId = tipoOcorrenciaRecId;
	}

}
