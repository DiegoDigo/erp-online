package br.com.control.controllers.vendas;

import br.com.control.BoletoService;
import br.com.control.controllers.AbstractController;
import br.com.control.portal.integracao.MensagemRecebida;
import br.com.control.portal.integracao.MensagemRetorno;
import br.com.control.rotas.RotasRest;
import br.com.control.vendas.cadastro.modelo.pedido.pagamento.Boleto;
import br.com.control.vendas.cadastro.modelo.pedido.pagamento.BoletoPedido;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(RotasRest.RAIZ + RotasRest.BOLETO)
public class BoletoController extends AbstractController {

    @Autowired
    private BoletoService boletoService;

    @RequestMapping(value = RotasRest.LISTAR, method = RequestMethod.GET, headers = "Accept=application/json")
    public MensagemRetorno listarBoleto(@RequestParam("mensagem") MensagemRecebida<Boleto> mensagem) {
        return new MensagemRetorno(
                HttpStatus.OK,
                "Boleto listado com sucesso !",
                boletoService.listar(), mensagem.getIdentificacao()
        );
    }

    @RequestMapping(value = RotasRest.LISTAR + RotasRest.RAIZ_PEDIDO,  method = RequestMethod.GET, headers = "Accept=application/json")
    public MensagemRetorno listarBoletoPedido(@RequestParam("mensagem") MensagemRecebida<BoletoPedido> mensagem) {
        System.out.println(mensagem.getIdentificacao());
        return new MensagemRetorno(
                HttpStatus.OK,
                "Boleto Pedido listado com sucesso !",
                boletoService.listarBoletoPedido(), mensagem.getIdentificacao()
        );
    }
}
