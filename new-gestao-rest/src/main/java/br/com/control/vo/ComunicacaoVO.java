package br.com.control.vo;

public class ComunicacaoVO {

	private final long id;

	private final String conteudo;

	public long getId() {
		return id;
	}

	public String getConteudo() {
		return conteudo;
	}

	public ComunicacaoVO(long id, String conteudo) {
		this.id = id;
		this.conteudo = conteudo;
	}

}
