package br.com.control.controllers.sincronismo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.control.auditoria.Auditoria;
import br.com.control.cadastro.sincronismo.AuditoriaSincronismoService;
import br.com.control.controllers.AbstractController;
import br.com.control.portal.integracao.MensagemRecebida;
import br.com.control.portal.integracao.MensagemRetorno;

@RestController
@RequestMapping(value = "/auditoria")
public class AuditoriaController extends AbstractController{	
	
	@Autowired
	private AuditoriaSincronismoService auditoriaService;
	
	@RequestMapping(value="listar/{matricula}",method = RequestMethod.GET , headers="Accept=application/json")
	public MensagemRetorno  listarAuditoria(@PathVariable("matricula") String matricula,@RequestParam(value = "mensagem") MensagemRecebida<Auditoria> mensagem){
		return new MensagemRetorno(HttpStatus.OK, "Auditorias Listados com sucesso !", auditoriaService.buscarAuditoriaPorMatricula(matricula), mensagem.getIdentificacao());
	}
	
}
