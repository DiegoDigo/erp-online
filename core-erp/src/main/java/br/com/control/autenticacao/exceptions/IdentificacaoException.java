package br.com.control.autenticacao.exceptions;

public class IdentificacaoException  extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public IdentificacaoException(String message, Throwable cause) {
		super(message, cause);
	}

	public IdentificacaoException(String message) {
		super(message);
	}

	public IdentificacaoException() {
	}
}