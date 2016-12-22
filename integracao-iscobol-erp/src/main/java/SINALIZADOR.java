import com.iscobol.rts.IscobolCall;
import com.iscobol.types.NumericVar;

import br.com.control.rest.client.ClienteRestService;

public class SINALIZADOR implements IscobolCall {

	public Object call(Object[] argv) {

		try {
			System.out.println("### ENTROU NO SINALIZADOR ###");

			String parametroRecebido = argv[0].toString();
			System.out.println("--> Parametro Recebido: " + parametroRecebido);

			String[] valoresQuebrados = parametroRecebido.split("\\|");
			String acao = valoresQuebrados[0];
			System.out.println("--> Ação: ATUALIZAÇÃO DE " + acao);

			if (acao.equals("PEDIDO")) {
				ClienteRestService clienteREST = new ClienteRestService();
				clienteREST.sinalizaPortalAcompanhamentoPedido(parametroRecebido);
			} else if (acao.equals("CADASTRO")) {
				ClienteRestService clienteREST = new ClienteRestService();
				clienteREST.sinalizaPortalAtualizacaoCadastral(parametroRecebido);
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
