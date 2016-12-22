package br.com.control.controllers.vendas;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

import br.com.control.cadastro.acompanhamentopedido.AcompanhamentoCapaPedidoService;
import br.com.control.controllers.AbstractController;
import br.com.control.integracao.MensagemRecebida;
import br.com.control.integracao.MensagemRetorno;
import br.com.control.portal.mensageria.to.AcompanhamentoPedidoTO;
import br.com.control.rotas.RotasRest;

@RestController
@RequestMapping(RotasRest.RAIZ_SINALIZA_PORTAL_PEDIDOS)
public class SinalizadorPortalController extends AbstractController {
	
	@Autowired
	private AcompanhamentoCapaPedidoService acompanhamentoCapaPedidoService;
	
	@RequestMapping(value = RotasRest.RAIZ_ACOMPANHAMENTO, method = RequestMethod.GET, headers = "Accept=application/json")
	public MensagemRetorno sinalizaPortal(@RequestParam("mensagem") MensagemRecebida<AcompanhamentoPedidoTO> mensagem) {

		ObjectMapper mapper = new ObjectMapper();
		mapper.configure(MapperFeature.DEFAULT_VIEW_INCLUSION, true);

		AcompanhamentoPedidoTO acompanhamentoPedidoTO = mapper.convertValue(mensagem.getConteudo(), new TypeReference<AcompanhamentoPedidoTO>() {
		});
		
		acompanhamentoCapaPedidoService.enviaParaOPortal(acompanhamentoPedidoTO);
		
		return null;
	}

}
