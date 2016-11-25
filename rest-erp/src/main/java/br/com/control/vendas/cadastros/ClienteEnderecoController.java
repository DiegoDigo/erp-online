package br.com.control.vendas.cadastros;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.control.cadastro.ClienteEnderecoService;
import br.com.control.integracao.MensagemRecebida;
import br.com.control.integracao.MensagemRetorno;
import br.com.control.rotas.RotasRest;
import br.com.control.vendas.cadastro.modelo.cliente.ClienteEndereco;

@RestController
@RequestMapping(RotasRest.RAIZ_CLIENTE + RotasRest.RAIZ_ENDERECO)
public class ClienteEnderecoController extends AbstractController {

	@Autowired
	private ClienteEnderecoService clienteEnderecoService;

	@RequestMapping(value = RotasRest.LISTAR, method = RequestMethod.GET, headers = "Accept=application/json")
	public MensagemRetorno listar(@RequestParam("mensagem") MensagemRecebida<ClienteEndereco> mensagem) {
		return new MensagemRetorno(HttpStatus.OK, "Endereços clientes listado com sucesso !", clienteEnderecoService.listarEndereco(), mensagem.getIdentificacao());
	}

}
