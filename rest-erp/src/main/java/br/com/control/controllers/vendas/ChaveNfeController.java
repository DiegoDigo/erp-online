package br.com.control.controllers.vendas;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.control.cadastro.NFEChaveService;
import br.com.control.controllers.AbstractController;
import br.com.control.rotas.RotasRest;

@RestController
@RequestMapping(RotasRest.RAIZ + RotasRest.RAIZ_NFE)
public class ChaveNfeController extends AbstractController {

	@Autowired
	private NFEChaveService nfeChaveService;

//	@RequestMapping(value = RotasRest.LISTAR, method = RequestMethod.GET, headers = "Accept=application/json")
//	public MensagemRetorno listar(@RequestParam("mensagem") MensagemRecebida<NfeChave> mensagem) {
//		return new MensagemRetorno(HttpStatus.OK, "Historico pedidos capa listado com sucesso !",
//				historicoPedidoCapaService.listarHistoricoCapa(), mensagem.getIdentificacao());
//	}

}
