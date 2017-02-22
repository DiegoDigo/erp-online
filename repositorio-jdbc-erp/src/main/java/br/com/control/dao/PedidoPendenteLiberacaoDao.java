package br.com.control.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import br.com.control.portal.integracao.TabelasIntegracao;
import br.com.control.repositorio.mappers.PedidoPendenteLiberacaoRowMapper;
import br.com.control.vendas.cadastro.modelo.pedido.PedidoPendenteLiberacao;



@Repository
@Transactional
public class PedidoPendenteLiberacaoDao extends JdbcDao<PedidoPendenteLiberacao> {

	public List<PedidoPendenteLiberacao> listaTodosPedidoBloqueado() {
		String declare = "DECLARE SET VARCHAR(12) @CODIGO_PEDIDO = '' ";
		getJdbcTemplate().update(declare);
		return selectViewSemWhere(TabelasIntegracao.PEDIDO_BLOQUEADO, new PedidoPendenteLiberacaoRowMapper());
	}
	
	public List<PedidoPendenteLiberacao> buscarPedidoBloqueado(String codigoPedidoERP) {
		String declare = String.format("DECLARE SET VARCHAR(12) @CODIGO_PEDIDO = '%s'", codigoPedidoERP);
		getJdbcTemplate().update(declare);
		return selectViewSemWhere(TabelasIntegracao.PEDIDO_BLOQUEADO, new PedidoPendenteLiberacaoRowMapper());
	}
	
}
