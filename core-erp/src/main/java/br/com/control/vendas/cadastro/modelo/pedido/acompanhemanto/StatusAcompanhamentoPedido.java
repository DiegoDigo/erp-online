package br.com.control.vendas.cadastro.modelo.pedido.acompanhemanto;

import java.io.Serializable;

@SuppressWarnings("serial")
public class StatusAcompanhamentoPedido implements Serializable {
	
	private Long recId;
	private Boolean ativo;
	private String descricaoStatus;
	private String impedimento;
	private String nivelAnalise;
	private String siglaStatus;
	private Boolean permiteReativarPedido;
	private String matriculaRecId;
	
	public String getSiglaStatus() {
		return siglaStatus;
	}
	public void setSiglaStatus(String siglaStatus) {
		this.siglaStatus = siglaStatus;
	}
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
	public String getDescricaoStatus() {
		return descricaoStatus;
	}
	public void setDescricaoStatus(String descricaoStatus) {
		this.descricaoStatus = descricaoStatus;
	}
	public String getImpedimento() {
		return impedimento;
	}
	public void setImpedimento(String impedimento) {
		this.impedimento = impedimento;
	}
	public String getNivelAnalise() {
		return nivelAnalise;
	}
	public void setNivelAnalise(String nivelAnalise) {
		this.nivelAnalise = nivelAnalise;
	}
	public Boolean getPermiteReativarPedido() {
		return permiteReativarPedido;
	}
	public void setPermiteReativarPedido(Boolean permiteReativarPedido) {
		this.permiteReativarPedido = permiteReativarPedido;
	}
	public String getMatriculaRecId() {
		return matriculaRecId;
	}
	public void setMatriculaRecId(String matriculaRecId) {
		this.matriculaRecId = matriculaRecId;
	}
	
	
	
	
}
