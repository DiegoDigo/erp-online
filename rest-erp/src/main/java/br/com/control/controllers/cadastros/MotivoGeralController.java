package br.com.control.controllers.cadastros;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.control.cadastro.MotivoGeralService;
import br.com.control.controllers.AbstractController;
import br.com.control.integracao.MensagemRecebida;
import br.com.control.integracao.MensagemRetorno;
import br.com.control.rotas.RotasRest;
import br.com.control.vendas.cadastro.modelo.MotivoGeral;

@RestController
@RequestMapping(RotasRest.RAIZ_MOTIVO + RotasRest.RAIZ_GERAL)
public class MotivoGeralController extends AbstractController {

	@Autowired
	private MotivoGeralService motivoGeralService;

	@RequestMapping(value = RotasRest.LISTAR, method = RequestMethod.GET, headers = "Accept=application/json")
	public MensagemRetorno listar(@RequestParam("mensagem") MensagemRecebida<MotivoGeral> mensagem) {
		return new MensagemRetorno(HttpStatus.OK, "Motivos Gerais listado com sucesso !", motivoGeralService.listarMotivos(), mensagem.getIdentificacao());
	}

}
