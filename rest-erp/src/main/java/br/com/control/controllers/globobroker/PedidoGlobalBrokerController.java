package br.com.control.controllers.globobroker;

import br.com.control.controllers.AbstractController;
import br.com.control.globobroker.PedidoCapaGloboBrokerService;
import br.com.control.globobroker.PedidoItemGloboBrokerService;
import br.com.control.portal.integracao.MensagemRecebida;
import br.com.control.rotas.RotasRest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(RotasRest.GLOBO_BROKER + RotasRest.RAIZ_PEDIDO)
public class PedidoGlobalBrokerController extends AbstractController {

	private static final Logger logger = LoggerFactory.getLogger(PedidoGlobalBrokerController.class);

	@Autowired
	private PedidoCapaGloboBrokerService pedidoCapaGloboBrokerService;

	@Autowired
	private PedidoItemGloboBrokerService pedidoItemGloboBrokerService;

	@RequestMapping(method = RequestMethod.POST, headers = "Accept=application/json")
	public void sinalizaPortalSincronismoCadastroGrupo(@RequestParam("mensagem") MensagemRecebida<String> mensagem) {

	}
}
