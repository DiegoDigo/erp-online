package br.com.control.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import br.com.control.portal.integracao.ViewsIntegracaoERP;
import br.com.control.repositorio.mappers.HistroricoPedidoCapaRowMapper;
import br.com.control.vendas.cadastro.modelo.pedido.HistoricoPedidoCapa;

@Repository
@Transactional
public class HistoricoPedidoCapaDao extends JdbcDao<HistoricoPedidoCapa> {

	public List<HistoricoPedidoCapa> listar() {
		String declare = "DECLARE set varchar(12) @numero_pedido = '' ";
		getJdbcTemplate().update(declare);
		return selectViewSemWhere(ViewsIntegracaoERP.VW_HISTORICO_PEDIDO_CAPA, new HistroricoPedidoCapaRowMapper());
	}

	public HistoricoPedidoCapa buscarHistoricoPedidoCapa(String codigoERP) {
		String declare = String.format("DECLARE set varchar(12) @numero_pedido = '%s' ", codigoERP);
		getJdbcTemplate().update(declare);
		return selectViewSingle(ViewsIntegracaoERP.VW_HISTORICO_PEDIDO_CAPA, new HistroricoPedidoCapaRowMapper());
	}
	
	public Integer count() {
		String declare = "DECLARE set varchar(12) @numero_pedido = '' ";
		getJdbcTemplate().update(declare);
		String sql = "select count(*) from "+ getSchemaDatabase() + "." + ViewsIntegracaoERP.VW_HISTORICO_PEDIDO_CAPA;
		return contaRegistros(sql);
	}
}
