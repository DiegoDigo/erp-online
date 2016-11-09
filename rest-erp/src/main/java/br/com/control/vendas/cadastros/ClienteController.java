package br.com.control.vendas.cadastros;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.control.cadastro.ClienteService;
import br.com.control.integracao.MensagemRecebida;
import br.com.control.integracao.MensagemRetorno;
import br.com.control.rotas.RotasRest;
import br.com.control.vendas.cadastro.modelo.cliente.Cliente;
import br.com.control.vendas.cadastro.modelo.cliente.Estado;
import br.com.control.vendas.cadastro.modelo.cliente.TipoDocumento;
import br.com.control.vendas.cadastro.modelo.cliente.TipoEstabelecimento;
import br.com.control.vendas.cadastro.modelo.cliente.TipoLogradouro;

@RestController
@RequestMapping(RotasRest.RAIZ_CLIENTE)
public class ClienteController extends AbstractController{

	@Autowired
	private ClienteService servicoCliente;

	@RequestMapping(value=RotasRest.ESTABELECIMENTOS_TIPOS, method=RequestMethod.GET, headers="Accept=application/json")
	public ResponseEntity<TipoEstabelecimento[]> recuperaTiposEstabelecimentos(@RequestParam(value = "mensagem") MensagemRecebida<Cliente> mensagem) {
		return new ResponseEntity<TipoEstabelecimento[]>(TipoEstabelecimento.values(), HttpStatus.OK);
	}

	@RequestMapping(value=RotasRest.DOCUMENTOS_TIPOS, method=RequestMethod.GET, headers="Accept=application/json")
	public MensagemRetorno recuperaTiposDocumentos(@RequestParam(value = "mensagem") MensagemRecebida<Cliente> mensagem) {
		return new MensagemRetorno(HttpStatus.OK, "sucesso", TipoDocumento.values(), mensagem.getIdentificacao());
	}

	@RequestMapping(value=RotasRest.LOGRADOUROS_TIPOS, method=RequestMethod.GET, headers="Accept=application/json")
	public ResponseEntity<List<String>> recuberaTiposLogradouros(@RequestParam(value = "mensagem") MensagemRecebida<Cliente> mensagem) {
		return new ResponseEntity<List<String>>(TipoLogradouro.recuperaNomes(), HttpStatus.OK);
	}
	
	@RequestMapping(value=RotasRest.ESTADOS, method=RequestMethod.GET, headers="Accept=application/json")
	public MensagemRetorno recuberaEstados(@RequestParam(value = "mensagem") MensagemRecebida<Cliente> mensagem) {
		return new MensagemRetorno(HttpStatus.OK, "sucesso", Estado.recuperaEstados(), mensagem.getIdentificacao());
	}

	@RequestMapping(value=RotasRest.SALVAR, method=RequestMethod.POST, headers="Accept=application/json")
	public MensagemRetorno salvar(@RequestBody MensagemRecebida<Cliente> mensagem) {
		Cliente clienteSalvo = servicoCliente.salvar((Cliente) mensagem.getConteudo());
		return new MensagemRetorno(HttpStatus.OK, "Cliente Salvo com Sucesso", clienteSalvo.getId().toString(), mensagem.getIdentificacao());
	}
	
	@RequestMapping(value=RotasRest.LISTAR, method=RequestMethod.GET, headers="Accept=application/json")
	public MensagemRetorno listar(@RequestParam(value = "mensagem") MensagemRecebida<Cliente> mensagem) {
		List<Cliente> clientesEncontrados = servicoCliente.listarTodos();
		return new MensagemRetorno(HttpStatus.OK, "Listagem retornada com Sucesso", clientesEncontrados, mensagem.getIdentificacao());
	}

}
