package br.com.control.rest.client;

public class SincronismoCadastroDetalheProdutoCombo extends ClienteRestSincronismo {

	@Override
	public String defineCodigoErp(String conteudo) {
		String[] split = conteudo.split("\\|");
		return split[2].substring(3, 13);
	}

	@Override
	public String getServicoSincronismo() {
		return "/servicos/erp/sinaliza/cadastro/detalhe/combo";
	}
}
