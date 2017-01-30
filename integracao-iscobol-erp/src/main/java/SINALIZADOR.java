import com.iscobol.rts.IscobolCall;
import com.iscobol.types.NumericVar;

import br.com.control.portal.enums.CadastrosEnum;
import br.com.control.rest.client.SincronismoAcompanhamentoPedido;
import br.com.control.rest.client.SincronismoCadastroCanalProduto;
import br.com.control.rest.client.SincronismoCadastroCategoriaProduto;
import br.com.control.rest.client.SincronismoCadastroCondicaoPagamento;
import br.com.control.rest.client.SincronismoCadastroFamiliaProduto;
import br.com.control.rest.client.SincronismoCadastroGrupoProduto;
import br.com.control.rest.client.SincronismoCadastroMarcaProduto;
import br.com.control.rest.client.SincronismoCadastroOcorrencia;
import br.com.control.rest.client.SincronismoCadastroProduto;
import br.com.control.rest.client.SincronismoCadastroTipoCobranca;

public class SINALIZADOR implements IscobolCall {

	public static void main(String[] args) {
		SINALIZADOR sinalizador = new SINALIZADOR();
		String[] param = { "CADASTRO|" + CadastrosEnum.CONDICAO_PAGAMENTO + "|1" };
		sinalizador.call(param);
	}

	@Override
	public Object call(Object[] argv) {

		try {
			System.out.println("### ENTROU NO SINALIZADOR ###");

			String parametroRecebido = argv[0].toString();
			System.out.println("--> Parametro Recebido: " + parametroRecebido);

			String[] valoresQuebrados = parametroRecebido.split("\\|");
			String acao = valoresQuebrados[0];
			System.out.println("--> Ação: ATUALIZAÇÃO DE " + acao);

			if (acao.equals("PEDIDO")) {
				SincronismoAcompanhamentoPedido clienteREST = new SincronismoAcompanhamentoPedido();
				clienteREST.sinalizaPortalAtualizacao(parametroRecebido, null);
			} else if (acao.equals("CADASTRO")) {

				String nomeCadastro = valoresQuebrados[1];
				CadastrosEnum cadastro = CadastrosEnum.recuperaCadastro(nomeCadastro);

				if (CadastrosEnum.GRUPO_PRODUTO == cadastro) {
					SincronismoCadastroGrupoProduto rest = new SincronismoCadastroGrupoProduto();
					rest.sinalizaPortalAtualizacao(parametroRecebido, CadastrosEnum.GRUPO_PRODUTO);
				}
				if (CadastrosEnum.FAMILIA_PRODUTO == cadastro) {
					SincronismoCadastroFamiliaProduto rest = new SincronismoCadastroFamiliaProduto();
					rest.sinalizaPortalAtualizacao(parametroRecebido, CadastrosEnum.FAMILIA_PRODUTO);
				}
				if (CadastrosEnum.MARCA_PRODUTO == cadastro) {
					SincronismoCadastroMarcaProduto rest = new SincronismoCadastroMarcaProduto();
					rest.sinalizaPortalAtualizacao(parametroRecebido, CadastrosEnum.MARCA_PRODUTO);
				}
				if (CadastrosEnum.CATEGORIA_PRODUTO == cadastro) {
					SincronismoCadastroCategoriaProduto rest = new SincronismoCadastroCategoriaProduto();
					rest.sinalizaPortalAtualizacao(parametroRecebido, CadastrosEnum.CATEGORIA_PRODUTO);
				}
				if (CadastrosEnum.PRODUTO == cadastro) {
					SincronismoCadastroProduto rest = new SincronismoCadastroProduto();
					rest.sinalizaPortalAtualizacao(parametroRecebido, CadastrosEnum.PRODUTO);
				}
				if (CadastrosEnum.CANAL == cadastro) {
					SincronismoCadastroCanalProduto rest = new SincronismoCadastroCanalProduto();
					rest.sinalizaPortalAtualizacao(parametroRecebido, CadastrosEnum.CANAL);
				}
				if (CadastrosEnum.TIPO_COBRANCA == cadastro) {
					SincronismoCadastroTipoCobranca rest = new SincronismoCadastroTipoCobranca();
					rest.sinalizaPortalAtualizacao(parametroRecebido, CadastrosEnum.TIPO_COBRANCA);
				}
				if (CadastrosEnum.OCORRENCIA == cadastro) {
					SincronismoCadastroOcorrencia rest = new SincronismoCadastroOcorrencia();
					rest.sinalizaPortalAtualizacao(parametroRecebido, CadastrosEnum.OCORRENCIA);
				}
				if (CadastrosEnum.CONDICAO_PAGAMENTO == cadastro) {
					SincronismoCadastroCondicaoPagamento rest = new SincronismoCadastroCondicaoPagamento();
					rest.sinalizaPortalAtualizacao(parametroRecebido, CadastrosEnum.CONDICAO_PAGAMENTO);
				}
			}

			System.out.println("### SAIU DO SINALIZADOR SEM ERROS ###");
			return NumericVar.literal(0, false);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("### SAIU DO SINALIZADOR COM ERROS ###");
			return NumericVar.literal(1, false);
		}

	}

	@Override
	public void finalize() {
	}

	@Override
	public void perform(int begin, int end) {
	}

}
