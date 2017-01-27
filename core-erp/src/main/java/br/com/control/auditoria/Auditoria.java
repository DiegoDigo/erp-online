package br.com.control.auditoria;

import java.util.Calendar;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import br.com.control.portal.integracao.Identificacao;

/**
 * @author rasa.lariguet
 * 
 *         Classe responsável por auditar todas as chamadas de serviços, tanto
 *         as vindos das aplicações para o ERP quanto do ERP para as aplicações
 *         que consomem seus serviços a fim de manter um log de auditoria, bem
 *         como o tempo de duração da requisicao;
 *
 */
@Entity
public class Auditoria {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Embedded
	private Identificacao identificacao;

	@Temporal(TemporalType.TIMESTAMP)
	private Calendar dataInicioExecucaoServico;

	@Temporal(TemporalType.TIMESTAMP)
	private Calendar dataFimExecucaoServico;

	private String duracao;

	public String getDuracao() {
		return duracao;
	}

	public void setDuracao(String duracao) {
		this.duracao = duracao;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Identificacao getIdentificacao() {
		return identificacao;
	}

	public void setIdentificacao(Identificacao identificacao) {
		this.identificacao = identificacao;
	}

	public Calendar getDataInicioExecucaoServico() {
		return dataInicioExecucaoServico;
	}

	public void setDataInicioExecucaoServico(Calendar dataInicioExecucaoServico) {
		this.dataInicioExecucaoServico = dataInicioExecucaoServico;
	}

	public Calendar getDataFimExecucaoServico() {
		return dataFimExecucaoServico;
	}

	public void setDataFimExecucaoServico(Calendar dataFimExecucaoServico) {
		this.dataFimExecucaoServico = dataFimExecucaoServico;
	}
}
