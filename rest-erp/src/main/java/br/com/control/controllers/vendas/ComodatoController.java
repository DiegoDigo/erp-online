package br.com.control.controllers.vendas;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.control.cadastro.ComodatoService;
import br.com.control.controllers.AbstractController;
import br.com.control.portal.dto.ComodatoDTO;
import br.com.control.portal.integracao.MensagemRecebida;
import br.com.control.portal.integracao.MensagemRetorno;
import br.com.control.rotas.RotasRest;
import br.com.control.vendas.cadastro.modelo.Comodato;

@RestController
@RequestMapping(RotasRest.RAIZ + RotasRest.RAIZ_COMODATO)
public class ComodatoController extends AbstractController {

	@Autowired
	private ComodatoService comodatoService;

	@RequestMapping(value = RotasRest.LISTAR, method = RequestMethod.GET, headers = "Accept=application/json")
	public MensagemRetorno listar(@RequestParam("mensagem") MensagemRecebida<Comodato> mensagem) {
		return new MensagemRetorno(HttpStatus.OK, "Comodatos Listado com sucessos !", comodatoService.listarComodato(),
				mensagem.getIdentificacao());
	}

	@RequestMapping(value = RotasRest.RETIRAR, method = RequestMethod.GET, headers = "Accept=application/json")
	public MensagemRetorno solicitarRetirada(@RequestParam("mensagem") MensagemRecebida<List<ComodatoDTO>> mensagem) {

		List<ComodatoDTO> listaComodatos = mensagem.getConteudo();

		return new MensagemRetorno(HttpStatus.OK, "Solicitacão de retirada de comodato feita com sucesso !",
				comodatoService.retirarComodato(listaComodatos), mensagem.getIdentificacao());
	}

}
