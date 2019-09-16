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
		String declare = "DECLARE set bigint @numero_pedido = 0 " ;
		getJdbcTemplate().update(declare);	
		return selectViewSemWhere(ViewsIntegracaoERP.VW_HISTORICO_PEDIDO_ITEM, new HistoricoPedidoItemRowMapper());
	}
	
	public List<HistoricoPedidoItem> listarPedidoItemDaCapa(String numeroPedido) {
		String declare = String.format("DECLARE set bigint @numero_pedido = %f ", Float.parseFloat(numeroPedido)) ;
		getJdbcTemplate().update(declare);	
		return selectViewSemWhere(ViewsIntegracaoERP.VW_HISTORICO_PEDIDO_ITEM, new HistoricoPedidoItemRowMapper());
	}
	
	public Integer count() {
		String declare = "DECLARE set bigint @numero_pedido = 0 " ;
		getJdbcTemplate().update(declare);
		String sql = "select count(*) from "+ getSchemaDatabase() + "." + ViewsIntegracaoERP.VW_HISTORICO_PEDIDO_ITEM;
		return contaRegistros(sql);
	}

}
