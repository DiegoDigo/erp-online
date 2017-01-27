import com.iscobol.rts.IscobolCall;
import com.iscobol.types.NumericVar;

import br.com.control.portal.enums.CadastrosEnum;
import br.com.control.rest.client.SincronismoAcompanhamentoPedido;
import br.com.control.rest.client.SincronismoCadastroFamiliaProduto;
import br.com.control.rest.client.SincronismoCadastroGrupoProduto;

public class SINALIZADOR implements IscobolCall {

	public static void main(String[] args) {
		SINALIZADOR sinalizador = new SINALIZADOR();
		String[] param = {"CADASTRO|"+CadastrosEnum.FAMILIA_PRODUTO+"|1"};
		sinalizador.call(param);
	}
	
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
				
			}

			System.out.println("### SAIU DO SINALIZADOR SEM ERROS ###");
			return NumericVar.literal(0, false);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("### SAIU DO SINALIZADOR COM ERROS ###");
			return NumericVar.literal(1, false);
		}

	}

	public void finalize() {
	}

	public void perform(int begin, int end) {
	}

}
