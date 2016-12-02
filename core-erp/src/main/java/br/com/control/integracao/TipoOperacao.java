package br.com.control.integracao;

/**
 * @author rasa.lariguet
 *
 *
 *         Representa os verbos HTTP das chamadas de serviços, e são usados para
 *         auditoria.
 */
public enum TipoOperacao {
	PUT, POST, DELETE, GET;

	public static TipoOperacao recuperaPorMethod(String method) {
		if ("POST".equals(method)) {
			return TipoOperacao.POST;
		} else if ("GET".equals(method)) {
			return TipoOperacao.GET;
		} else if ("PUT".equals(method)) {
			return TipoOperacao.PUT;
		} else if ("DELETE".equals(method)) {
			return TipoOperacao.DELETE;
		}
		throw new IllegalArgumentException(method + "não é um tipo de Método HTTP válido!");
	}
}
