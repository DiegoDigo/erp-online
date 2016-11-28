package br.com.control.controllers.cadastros;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.control.cadastro.OcorrenciaService;
import br.com.control.controllers.AbstractController;
import br.com.control.integracao.MensagemRecebida;
import br.com.control.integracao.MensagemRetorno;
import br.com.control.rotas.RotasRest;
import br.com.control.vendas.cadastro.modelo.ocorrencia.Ocorrencia;

@RestController
@RequestMapping(RotasRest.RAIZ_OCORRENCIA)
public class OcorrenciaController extends AbstractController {

	@Autowired
	private OcorrenciaService ocorrenciaService;

	@RequestMapping(value = RotasRest.LISTAR, method = RequestMethod.GET, headers = "Accept=application/json")
	public MensagemRetorno listar(@RequestParam("mensagem") MensagemRecebida<Ocorrencia> mensagem) {
		return new MensagemRetorno(HttpStatus.OK, "Ocorrencia Listada com sucesso !",
				ocorrenciaService.listarOcorrencias(), mensagem.getIdentificacao());
	}

}
