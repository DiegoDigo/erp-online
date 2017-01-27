package br.com.control.controllers.cadastros;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.control.cadastro.SisTipoMotivoGeralService;
import br.com.control.controllers.AbstractController;
import br.com.control.portal.integracao.MensagemRecebida;
import br.com.control.portal.integracao.MensagemRetorno;
import br.com.control.rotas.RotasRest;
import br.com.control.vendas.cadastro.modelo.SisTipoMotivoGeral;

@RestController
@RequestMapping(RotasRest.RAIZ_TIPO +RotasRest.RAIZ_MOTIVO+ RotasRest.RAIZ_GERAL)
public class SisTipoMotivoGeralController extends AbstractController {

	@Autowired
	private SisTipoMotivoGeralService service;

	@RequestMapping(value = RotasRest.LISTAR, method = RequestMethod.GET, headers = "Accept=application/json")
	public MensagemRetorno listar(@RequestParam("mensagem") MensagemRecebida<SisTipoMotivoGeral> mensagem) {
		return new MensagemRetorno(HttpStatus.OK, "Motivos gerais listado com sucesso !", service.listar(), mensagem.getIdentificacao());
	}

}
