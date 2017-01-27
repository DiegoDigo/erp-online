package br.com.control.controllers.cadastros;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.control.cadastro.SisTipoOcorrenciaService;
import br.com.control.controllers.AbstractController;
import br.com.control.portal.integracao.MensagemRecebida;
import br.com.control.portal.integracao.MensagemRetorno;
import br.com.control.rotas.RotasRest;
import br.com.control.vendas.cadastro.modelo.ocorrencia.SisTipoOCorrencia;

@RestController
@RequestMapping(RotasRest.RAIZ_TIPO + RotasRest.RAIZ_OCORRENCIA)
public class SisTipoOcorrenciaController extends AbstractController {

	@Autowired
	private SisTipoOcorrenciaService sisTipoOcorrenciaService;

	@RequestMapping(value = RotasRest.LISTAR, method = RequestMethod.GET, headers = "Accept=application/json")
	public MensagemRetorno listar(@RequestParam("mensagem") MensagemRecebida<SisTipoOCorrencia> mensagem) {
		return new MensagemRetorno(HttpStatus.OK, "Tipo Ocorrencia do sistema Listado com sucesso !",
				sisTipoOcorrenciaService.listarOcorrencia(), mensagem.getIdentificacao());
	}

}
