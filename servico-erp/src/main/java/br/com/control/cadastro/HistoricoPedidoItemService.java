package br.com.control.cadastro;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import br.com.control.dao.HistoricoPedidoItemDao;
import br.com.control.vendas.cadastro.modelo.pedido.HistoricoPedidoItem;

@Repository
public class HistoricoPedidoItemService {

	@Autowired
	private HistoricoPedidoItemDao historicoPedidoItemDao;

	public List<HistoricoPedidoItem> listarPedidoItem() {
		return historicoPedidoItemDao.listarPedidoItem();
	}

	public List<HistoricoPedidoItem> buscarItemPedido(String numeroPedido) {
		return historicoPedidoItemDao.listarPedidoItemDaCapa(numeroPedido);
	}
	
	public Integer count() {
		return historicoPedidoItemDao.count();
	}

}
