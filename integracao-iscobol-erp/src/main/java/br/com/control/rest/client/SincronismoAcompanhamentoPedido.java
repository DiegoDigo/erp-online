package br.com.control.rest.client;

public class SincronismoAcompanhamentoPedido extends ClienteRestSincronismo {

	@Override
	public String defineCodigoErp(String conteudo) {
		String[] split = conteudo.split("\\|");
		return split[1];
	}

	@Override
	public String getServicoSincronismo() {
		return "/servicos/erp/sinaliza/acompanhamento";
	}
}