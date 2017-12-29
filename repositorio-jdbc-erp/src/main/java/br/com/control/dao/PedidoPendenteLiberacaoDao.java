package br.com.control.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import br.com.control.portal.integracao.ViewsIntegracaoERP;
import br.com.control.repositorio.mappers.PedidoPendenteLiberacaoRowMapper;
import br.com.control.vendas.cadastro.modelo.pedido.PedidoPendenteLiberacao;



@Repository
@Transactional
public class PedidoPendenteLiberacaoDao extends JdbcDao<PedidoPendenteLiberacao> {

	public List<PedidoPendenteLiberacao> listaTodosPedidoBloqueado() {
		String declare = "DECLARE SET VARCHAR(12) @CODIGO_PEDIDO = '' ";
		getJdbcTemplate().update(declare);
		return selectViewSemWhere(ViewsIntegracaoERP.VW_PEDIDO_PENDENTE_LIBERACAO, new PedidoPendenteLiberacaoRowMapper());
	}
	
	public PedidoPendenteLiberacao buscarPedidoBloqueado(String codigoPedidoERP) {
		String declare = String.format("DECLARE SET VARCHAR(12) @CODIGO_PEDIDO = '%s'", codigoPedidoERP);
		getJdbcTemplate().update(declare);
		return selectViewSingle(ViewsIntegracaoERP.VW_PEDIDO_PENDENTE_LIBERACAO, new PedidoPendenteLiberacaoRowMapper());
	}
	
}
