package br.com.control.vendas;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.control.cadastro.ClienteService;
import br.com.control.integracao.MensagemHttp;
import br.com.control.vendas.cadastro.modelo.cliente.Cliente;

@RestController
@RequestMapping("/cliente")
public class ClienteController {

	@Autowired
	private ClienteService servicoCliente;
	
	@RequestMapping("/salvar")
	public MensagemHttp salvar(Cliente cliente) {
		Cliente clienteSalvo = servicoCliente.salvar(cliente);
		return new MensagemHttp(HttpStatus.OK, "Cliente Salvo com Sucesso", clienteSalvo.getId().toString());
	}

}
