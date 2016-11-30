package br.com.control.cadastro;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.control.dao.PedidoItemDao;
import br.com.control.integracao.TabelasIntegracao;
import br.com.control.repositorio.mappers.PedidoItemRowMapper;
import br.com.control.vendas.cadastro.modelo.pedido.PedidoItem;

@Service
public class PedidoItemService {

	@Autowired
	private PedidoItemDao pedidoItemDao;

	public List<PedidoItem> listarPedidoItem() {
		return pedidoItemDao.selectViewSemWhere(TabelasIntegracao.PEDIDO_ITEM, new PedidoItemRowMapper());
	}

}
