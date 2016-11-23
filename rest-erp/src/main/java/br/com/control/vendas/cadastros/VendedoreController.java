package br.com.control.vendas.cadastros;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.control.cadastro.VendedorService;
import br.com.control.integracao.MensagemRecebida;
import br.com.control.integracao.MensagemRetorno;
import br.com.control.rotas.RotasRest;
import br.com.control.vendas.cadastro.modelo.vendedor.Vendedor;

@RestController
@RequestMapping(RotasRest.RAIZ_VENDEDOR)
public class VendedoreController extends AbstractController{

	@Autowired
	private VendedorService vendedorService ;
	
	@RequestMapping(value = RotasRest.LISTAR, method=RequestMethod.GET ,headers="Accept=application/json")
	public MensagemRetorno Listar(@RequestParam("mensagem") MensagemRecebida<Vendedor> mensagem){
		List<Vendedor> vendedores = vendedorService.listar();
		return new MensagemRetorno(HttpStatus.OK, "Vendedores Listado com sucesso !", vendedores, mensagem.getIdentificacao());
		
	}
	
//	@RequestMapping(value = RotasRest.TESTE, method=RequestMethod.GET ,headers="Accept=application/json")
//	public MensagemRetorno ListarTeste(@RequestParam("mensagem") MensagemRecebida<Vendedor> mensagem){
//		List<Vendedor> vendedores = vendedorService.listarTeste();
//		return new MensagemRetorno(HttpStatus.OK, "Vendedores Listado com sucesso !", vendedores, mensagem.getIdentificacao());
//		
//	}
}
