package br.com.control.vendas.cadastros;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.control.cadastro.VendedorClienteService;
import br.com.control.integracao.MensagemRecebida;
import br.com.control.integracao.MensagemRetorno;
import br.com.control.rotas.RotasRest;
import br.com.control.vendas.cadastro.modelo.vendedor.VendedorCliente;

@RestController
@RequestMapping(RotasRest.RAIZ_VENDEDOR + RotasRest.RAIZ_CLIENTE)
public class VendedorClienteController extends AbstractController {

	@Autowired
	private VendedorClienteService vendedorClienteService;

	@RequestMapping(value = RotasRest.LISTAR, method = RequestMethod.GET, headers = "Accept=application/json")
	public MensagemRetorno listar(@RequestParam("mensagem") MensagemRecebida<VendedorCliente> mensagem) {
		return new MensagemRetorno(HttpStatus.OK, "Vendedor cliente listado com sucesso !", vendedorClienteService.listar(), mensagem.getIdentificacao());
	}

}
