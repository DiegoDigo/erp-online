package br.com.control.auditoria;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import br.com.control.integracao.Identificacao;

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

	@OneToOne
	private Identificacao identificacao;

	private LocalDate dataInicioExecucaoServico;

	private LocalDate dataFimExecucaoServico;

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

	public LocalDate getDataInicioExecucaoServico() {
		return dataInicioExecucaoServico;
	}

	public void setDataInicioExecucaoServico(LocalDate dataInicioExecucaoServico) {
		this.dataInicioExecucaoServico = dataInicioExecucaoServico;
	}

	public LocalDate getDataFimExecucaoServico() {
		return dataFimExecucaoServico;
	}

	public void setDataFimExecucaoServico(LocalDate dataFimExecucaoServico) {
		this.dataFimExecucaoServico = dataFimExecucaoServico;
	}
}
