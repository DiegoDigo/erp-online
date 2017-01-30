package br.com.control.rest.client;

public class SincronismoCadastroCanalProduto extends ClienteRestSincronismo {

	@Override
	public String defineCodigoErp(String conteudo) {
		String[] split = conteudo.split("\\|");
		return split[2];
	}

	@Override
	public String getServicoSincronismo() {
		return "/servicos/erp/sinaliza/cadastro/categoria";
	}
}
