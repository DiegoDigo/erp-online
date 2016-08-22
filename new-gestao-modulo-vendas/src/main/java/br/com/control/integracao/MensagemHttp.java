package br.com.control.integracao;

import org.springframework.http.HttpStatus;

public class MensagemHttp {
	private HttpStatus status;
	private String mensagem;
	private String conteudo;
	
	
	public MensagemHttp(HttpStatus status, String mensagem, String conteudo) {
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
	public String getConteudo() {
		return conteudo;
	}
	public void setConteudo(String conteudo) {
		this.conteudo = conteudo;
	}
}
