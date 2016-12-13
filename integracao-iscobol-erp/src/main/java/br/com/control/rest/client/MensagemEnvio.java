package br.com.control.rest.client;

import java.io.Serializable;

public class MensagemEnvio implements Serializable {

	private static final long serialVersionUID = 1L;

	private Identificacao identificacao;
	private Object conteudo;

	public Identificacao getIdentificacao() {
		return identificacao;
	}

	public void setIdentificacao(Identificacao identificacao) {
		this.identificacao = identificacao;
	}

	public Object getConteudo() {
		return conteudo;
	}

	public void setConteudo(Object conteudo) {
		this.conteudo = conteudo;
	}
	
	
}
