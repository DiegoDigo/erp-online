package br.com.control.cadastro;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.control.dao.PedidoCapaDao;
import br.com.control.portal.mensageria.to.AcompanhamentoPedidoTO;
import br.com.control.portal.mensageria.to.PedidoCapaTO;

@Service
public class PedidoCapaService {

	@Autowired
	private PedidoCapaDao pedidoCapaDao;

//	public List<PedidoCapaTO> listarPedido() {
//		return pedidoCapaDao.selectViewSemWhere(TabelasIntegracao.CADASTRO_PEDIDO_CAPA, new PedidoCapaRowMapper());
//
//	}

	public AcompanhamentoPedidoTO salvarCapa(PedidoCapaTO pedidoCapa) {
		return pedidoCapaDao.salvarCapaPedido(pedidoCapa);
	}

}
