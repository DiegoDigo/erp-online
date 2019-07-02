package br.com.control.components;

import br.com.control.dao.PedidoCapaDao;
import br.com.control.mensageria.consumidor.portal.PedidoCapaConsumer;
import br.com.control.mensageria.produtor.PedidoCapaProducer;
import br.com.control.portal.mensageria.to.AcompanhamentoPedidoTO;
import br.com.control.portal.mensageria.to.PedidoCapaTO;
import br.com.control.portal.mensageria.to.StatusAcompanhamentoPedidoTO;
import br.com.control.retransmissao.Serivce.PedidoRetransmissaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class RetransmissaoService {

    @Autowired
    PedidoRetransmissaoService pedidoRetransmissaoService;

    @Autowired
    PedidoCapaProducer producer;

    @Autowired
    PedidoCapaDao pedidoCapaDao;

    @Async("threadPoolTaskExecutor")
    @Scheduled(cron = "0 0 * * * *")
    protected void verificarPedidosReTransmissao() {
        System.out.println("Buscando pedidos não transmitidos");
        List<PedidoCapaTO> pedidosNaoTransmitidos = pedidoRetransmissaoService.verificar();

        pedidosNaoTransmitidos.forEach(pedidoCapa -> {
            try {
                AcompanhamentoPedidoTO acompanhamentoPedidoTO = pedidoCapaDao.salvarCapaPedido(pedidoCapa);
                pedidoRetransmissaoService.transmitido(pedidoCapa.getRecId());
                StatusAcompanhamentoPedidoTO status = new StatusAcompanhamentoPedidoTO();
                status.setNumeroPrePedidoErp(acompanhamentoPedidoTO.getNumeroPedidoGestao());
                status.setRecId(acompanhamentoPedidoTO.getRecId());
                System.out.println(("--> status pedido: " + status.recuperaStatus()));
                System.out.println(("___________________________________________________________"));

                producer.sendMessage(status);
            } catch (Exception e) {
                System.out.println("Não foi possivel retransmitir o pedido. Causa: " + e.getMessage());
            }
        });
    }
}
