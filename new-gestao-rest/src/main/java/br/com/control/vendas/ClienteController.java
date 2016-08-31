package br.com.control.vendas;

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
import br.com.control.integracao.MensagemHttp;
import br.com.control.rotas.RotasRest;
import br.com.control.vendas.cadastro.modelo.cliente.Cliente;
import br.com.control.vendas.cadastro.modelo.cliente.Estado;
import br.com.control.vendas.cadastro.modelo.cliente.TipoDocumento;
import br.com.control.vendas.cadastro.modelo.cliente.TipoEstabelecimento;
import br.com.control.vendas.cadastro.modelo.cliente.TipoLogradouro;

@RestController
@RequestMapping(RotasRest.RAIZ_CLIENTE)
public class ClienteController {

	@Autowired
	private ClienteService servicoCliente;

	@RequestMapping(RotasRest.ESTABELECIMENTOS_TIPOS)
	public ResponseEntity<TipoEstabelecimento[]> recuperaTiposEstabelecimentos() {
		return new ResponseEntity<TipoEstabelecimento[]>(TipoEstabelecimento.values(), HttpStatus.OK);
	}

	@RequestMapping(RotasRest.DOCUMENTOS_TIPOS)
	public ResponseEntity<TipoDocumento[]> recuperaTiposDocumentos() {
		return new ResponseEntity<TipoDocumento[]>(TipoDocumento.values(), HttpStatus.OK);
	}

	@RequestMapping(RotasRest.LOGRADOUROS_TIPOS)
	public ResponseEntity<List<String>> recuberaTiposLogradouros() {
		return new ResponseEntity<List<String>>(TipoLogradouro.recuperaNomes(), HttpStatus.OK);
	}
	
	@RequestMapping(RotasRest.ESTADOS)
	public ResponseEntity<List<String>> recuberaEstados() {
		return new ResponseEntity<List<String>>(Estado.recuperaEstados(), HttpStatus.OK);
	}

	@RequestMapping(value=RotasRest.SALVAR, method=RequestMethod.POST, headers="Accept=application/json")
	public MensagemHttp salvar(@RequestBody Cliente cliente) {
		Cliente clienteSalvo = servicoCliente.salvar(cliente);
		return new MensagemHttp(HttpStatus.OK, "Cliente Salvo com Sucesso", clienteSalvo.getId().toString());
	}

}
