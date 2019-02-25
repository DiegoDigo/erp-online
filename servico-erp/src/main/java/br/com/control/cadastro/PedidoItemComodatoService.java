package br.com.control.cadastro;

import br.com.control.dao.PedidoItemDao;
import br.com.control.dao.PedidoRecolhaComodatoItemDao;
import br.com.control.portal.mensageria.to.AcompanhamentoPedidoTO;
import br.com.control.portal.mensageria.to.PedidoComodatoItemTO;
import br.com.control.portal.mensageria.to.PedidoItemTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PedidoItemComodatoService {

	@Autowired
	private PedidoRecolhaComodatoItemDao pedidoItemDao;

	public AcompanhamentoPedidoTO salvarItemComodato(PedidoComodatoItemTO pedidoItem, String numeroPrePedido) {
		return pedidoItemDao.salvarItemPedidoComodato(pedidoItem, numeroPrePedido);
	}
	
}
