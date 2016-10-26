package br.com.control.integracao;

import java.io.Serializable;

public class MensagemEnvio implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private Object conteudo;
	private Identificacao identificacao;
	
	public Identificacao getIdentificacao() {
		return identificacao;
	}

	public MensagemEnvio(Object conteudo, Identificacao identificacao) {
		super();
		this.conteudo = conteudo;
		this.identificacao = identificacao;
	}



	public Object getConteudo() {
		return conteudo;
	}

	public void setConteudo(Object conteudo) {
		this.conteudo = conteudo;
	}
}
