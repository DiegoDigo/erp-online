package br.com.control.controllers.cadastros;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.control.cadastro.ClienteService;
import br.com.control.controllers.AbstractController;
import br.com.control.portal.integracao.MensagemRecebida;
import br.com.control.portal.integracao.MensagemRetorno;
import br.com.control.rotas.RotasRest;
import br.com.control.vendas.cadastro.modelo.cliente.Cliente;

@RestController
@RequestMapping(RotasRest.RAIZ + RotasRest.RAIZ_CLIENTE)
public class ClienteController extends AbstractController{

	@Autowired
	private ClienteService servicoCliente;
	
	@RequestMapping(value=RotasRest.LISTAR, method=RequestMethod.GET, headers="Accept=application/json")
	public MensagemRetorno listar(@RequestParam(value = "mensagem") MensagemRecebida<Cliente> mensagem) {
		List<Cliente> clientesEncontrados = servicoCliente.listarTodos();
		return new MensagemRetorno(HttpStatus.OK, "Listagem retornada com Sucesso", clientesEncontrados, mensagem.getIdentificacao());
	}
}
