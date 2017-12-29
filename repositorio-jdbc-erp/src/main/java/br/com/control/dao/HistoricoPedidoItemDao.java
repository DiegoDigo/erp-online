package br.com.control.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import br.com.control.portal.integracao.ViewsIntegracaoERP;
import br.com.control.repositorio.mappers.HistoricoPedidoItemRowMapper;
import br.com.control.vendas.cadastro.modelo.pedido.HistoricoPedidoItem;

@Repository
@Transactional
public class HistoricoPedidoItemDao extends JdbcDao<HistoricoPedidoItem> {

	public List<HistoricoPedidoItem> listarPedidoItem() {
		String declare = "DECLARE set varchar(12) @numero_pedido = '' " ;
		getJdbcTemplate().update(declare);	
		return selectViewSemWhere(ViewsIntegracaoERP.VW_HISTORICO_PEDIDO_ITEM, new HistoricoPedidoItemRowMapper());
	}
	
	public List<HistoricoPedidoItem> listarPedidoItemDaCapa(String numeroPedido) {
		String declare = String.format("DECLARE set varchar(12) @numero_pedido = '%s' ",numeroPedido) ;
		getJdbcTemplate().update(declare);	
		return selectViewSemWhere(ViewsIntegracaoERP.VW_HISTORICO_PEDIDO_ITEM, new HistoricoPedidoItemRowMapper());
	}

}
