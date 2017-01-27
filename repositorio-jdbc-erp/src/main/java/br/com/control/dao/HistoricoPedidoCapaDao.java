package br.com.control.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import br.com.control.portal.integracao.TabelasIntegracao;
import br.com.control.repositorio.mappers.HistroricoPedidoCapaRowMapper;
import br.com.control.vendas.cadastro.modelo.pedido.HistoricoPedidoCapa;

@Repository
@Transactional
public class HistoricoPedidoCapaDao extends JdbcDao<HistoricoPedidoCapa> {
	public List<HistoricoPedidoCapa> listar() {
		return selectViewSemWhere(TabelasIntegracao.HISTORICO_PEDIDO_CAPA, new HistroricoPedidoCapaRowMapper());
	}
}
