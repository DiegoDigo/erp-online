package br.com.control.vendas.cadastros;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.control.auditoria.Auditavel;
import br.com.control.cadastro.GrupoService;
import br.com.control.integracao.MensagemRecebida;
import br.com.control.integracao.MensagemRetorno;
import br.com.control.rotas.RotasRest;
import br.com.control.vendas.cadastro.modelo.produto.Grupo;

@RestController
@RequestMapping(RotasRest.RAIZ_GRUPO)
@Auditavel
public class GrupoController {

	@Autowired
	private GrupoService servicoGrupo;
	
	@RequestMapping(value=RotasRest.LISTAR, method=RequestMethod.POST, headers="Accept=application/json")
	public MensagemRetorno listar(@RequestBody MensagemRecebida<Grupo> mensagem) {
		List<Grupo> familiasEncontradas = servicoGrupo.listarTodos(mensagem.getIdentificacao().getMatriculaAssociada());
		return new MensagemRetorno(HttpStatus.OK, "Listagem retornada com Sucesso", familiasEncontradas, mensagem.getIdentificacao());
	}

}
