package br.com.control.rest.client;

public class SincronismoHistoricoPedidoCapa extends ClienteRestSincronismo {

	@Override
	public String defineCodigoErp(String conteudo) {
		String[] split = conteudo.split("\\|");
		return split[2];
	}

	@Override
	public String getServicoSincronismo() {
		return "/servicos/erp/sinaliza/cadastro/historico/pedido/capa";
	}

}
