package br.com.control.portal.integracao;

import java.io.Serializable;
import java.util.Calendar;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class MensagemRecebida<T> implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private T conteudo;
	
	private Identificacao identificacao;
	
	private int pagina;
	
	private int quantidadePorPagina;

	private Calendar dataInicio;
	
	private Calendar dataFim;

	@Value("${numero_matricula_empresa}")
	private String matriculaAssociada;
	
	public Identificacao getIdentificacao() {
		return identificacao;
	}
	
	public MensagemRecebida() {
		
	}

	public MensagemRecebida(T conteudo, Identificacao identificacao) {
		this.conteudo = conteudo;
		this.identificacao = identificacao;
		this.identificacao.setMatriculaAssociada(matriculaAssociada);
	}

	public Calendar getDataInicio() {
		return dataInicio;
	}

	public void setDataInicio(Calendar dataInicio) {
		this.dataInicio = dataInicio;
	}

	public Calendar getDataFim() {
		return dataFim;
	}

	public void setDataFim(Calendar dataFim) {
		this.dataFim = dataFim;
	}

	public T getConteudo() {
		return conteudo;
	}

	public void setConteudo(T conteudo) {
		this.conteudo = conteudo;
	}

	public void setIdentificacao(Identificacao identificacao) {
		this.identificacao = identificacao;
	}

	public int getPagina() {
		return pagina;
	}

	public void setPagina(int pagina) {
		this.pagina = pagina;
	}

	public int getQuantidadePorPagina() {
		return quantidadePorPagina;
	}

	public void setQuantidadePorPagina(int quantidadePorPagina) {
		this.quantidadePorPagina = quantidadePorPagina;
	}
	
}
