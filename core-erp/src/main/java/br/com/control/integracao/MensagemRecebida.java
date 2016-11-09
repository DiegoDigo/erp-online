package br.com.control.integracao;

import java.io.Serializable;

import org.springframework.stereotype.Component;

@Component
public class MensagemRecebida<T> implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private T conteudo;
	
	private Identificacao identificacao;
	
	public Identificacao getIdentificacao() {
		return identificacao;
	}
	
	public MensagemRecebida() {
	}

	public MensagemRecebida(T conteudo, Identificacao identificacao) {
		this.conteudo = conteudo;
		this.identificacao = identificacao;
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
	
	
}
