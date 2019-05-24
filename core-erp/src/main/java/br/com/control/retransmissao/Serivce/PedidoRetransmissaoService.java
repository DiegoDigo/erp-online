package br.com.control.retransmissao.Serivce;

import br.com.control.portal.mensageria.to.PedidoCapaTO;
import br.com.control.retransmissao.PedidoRetransmissao;

import java.util.List;

public interface PedidoRetransmissaoService {
    PedidoRetransmissao salvar(PedidoRetransmissao pedidoRetransmissao);

    void transmitido(long recId);

    List<PedidoCapaTO> verificar();
}
