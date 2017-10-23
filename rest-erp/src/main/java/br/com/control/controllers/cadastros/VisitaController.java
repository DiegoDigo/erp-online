package br.com.control.controllers.cadastros;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.control.cadastro.VisitaService;
import br.com.control.controllers.AbstractController;
import br.com.control.portal.integracao.MensagemRecebida;
import br.com.control.portal.integracao.MensagemRetorno;
import br.com.control.rotas.RotasRest;
import br.com.control.vendas.cadastro.modelo.cliente.Visita;
import br.com.control.vendas.cadastro.modelo.vendedor.Vendedor;

@RestController
@RequestMapping(RotasRest.RAIZ + RotasRest.RAIZ_VISITAS)
public class VisitaController extends AbstractController {

	@Autowired
	private VisitaService visitaService;

	@RequestMapping(value = RotasRest.LISTAR, method = RequestMethod.GET, headers = "Accept=application/json")
	public MensagemRetorno Listar(@RequestParam("mensagem") MensagemRecebida<Vendedor> mensagem) {
		List<Visita> visitas = visitaService.listarTodos();
		return new MensagemRetorno(HttpStatus.OK, "Dias de visita listados com sucesso !", visitas,
				mensagem.getIdentificacao());
	}
}
