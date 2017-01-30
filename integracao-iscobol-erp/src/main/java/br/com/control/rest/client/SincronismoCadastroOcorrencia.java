package br.com.control.rest.client;

public class SincronismoCadastroOcorrencia extends ClienteRestSincronismo {

	@Override
	public String defineCodigoErp(String conteudo) {
		String[] split = conteudo.split("\\|");
		return split[2];
	}

	@Override
	public String getServicoSincronismo() {
		return "/servicos/erp/servicos/erp/sinaliza/cadastro/ocorrencia";
	}
}
