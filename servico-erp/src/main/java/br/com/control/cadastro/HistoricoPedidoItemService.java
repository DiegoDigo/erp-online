package br.com.control.cadastro;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import br.com.control.dao.HistoricoPedidoItemDao;
import br.com.control.integracao.TabelasIntegracao;
import br.com.control.repositorio.mappers.HistoricoPedidoItemRowMapper;
import br.com.control.vendas.cadastro.modelo.pedido.HistoricoPedidoItem;

@Repository
public class HistoricoPedidoItemService {

	@Autowired
	private HistoricoPedidoItemDao historicoPedidoItemDao;

	public List<HistoricoPedidoItem> listarPedidoItem() {
		return historicoPedidoItemDao.selectViewSemWhere(TabelasIntegracao.HISTORICO_PEDIDO_ITEM, new HistoricoPedidoItemRowMapper());
	}

}
