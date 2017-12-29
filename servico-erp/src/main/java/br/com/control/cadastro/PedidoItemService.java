package br.com.control.cadastro;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.control.dao.PedidoItemDao;
import br.com.control.portal.mensageria.to.AcompanhamentoPedidoTO;
import br.com.control.portal.mensageria.to.PedidoItemTO;

@Service
public class PedidoItemService {

	@Autowired
	private PedidoItemDao pedidoItemDao;

	public AcompanhamentoPedidoTO salvarItem(PedidoItemTO pedidoItem) {
		return pedidoItemDao.salvarItemPedido(pedidoItem);
	}
	
}
