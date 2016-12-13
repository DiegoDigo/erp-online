import com.iscobol.rts.IscobolCall;
import com.iscobol.types.NumericVar;

import br.com.control.rest.client.ClienteRestService;

public class SINALIZADOR implements IscobolCall {

	public Object call(Object[] argv) {
		System.out.println("ENTROU NO JAVA ");
		System.out.println(argv[0].toString());

		String linguicona = argv[0].toString();
		String[] valoresQuebrados = linguicona.split("|");
		
		System.out.println(valoresQuebrados[0]);
//		if (valoresQuebrados[0].equals("PEDIDO")) {
			ClienteRestService clienteRestService = new ClienteRestService();
			System.out.println("instanciou clienteRestService ");
			clienteRestService.sinalizaPortalAcompanhamentoPedido("x");
//		}else if (valoresQuebrados[0].equals("CADASTRO")) {
//			//ATULIZA FILA DE CADASTROS
//		}
		
		
		return NumericVar.literal (1, false);
	}
	

	public void finalize() {}
	public void perform(int begin, int end) {}

}
