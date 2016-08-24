package br.com.control.integracao;

import java.io.Serializable;

import org.springframework.http.HttpStatus;

public class MensagemHttp implements Serializable {
	private static final long serialVersionUID = 1L;

	private HttpStatus status;
	private String mensagem;
	private Object conteudo;
	
	
	public MensagemHttp(HttpStatus status, String mensagem, Object conteudo) {
		this.status = status;
		this.mensagem = mensagem;
		this.conteudo = conteudo;
	}

	public HttpStatus getStatus() {
		return status;
	}
	public void setStatus(HttpStatus status) {
		this.status = status;
	}
	public String getMensagem() {
		return mensagem;
	}
	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}

	public Object getConteudo() {
		return conteudo;
	}

	public void setConteudo(Object conteudo) {
		this.conteudo = conteudo;
	}
	
}
