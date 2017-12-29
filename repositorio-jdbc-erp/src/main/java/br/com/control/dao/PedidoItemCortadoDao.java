package br.com.control.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import br.com.control.portal.integracao.ViewsIntegracaoERP;
import br.com.control.repositorio.mappers.PedidoItemCortadoRowMapper;
import br.com.control.vendas.cadastro.modelo.pedido.PedidoItemCortado;

@Repository
public class PedidoItemCortadoDao extends JdbcDao<PedidoItemCortado> {

	public List<PedidoItemCortado> listar() {
		String declare = "DECLARE set bigint @COD_PRE_PEDIDO = 0;";
		getJdbcTemplate().update(declare);
		return selectViewSemWhere(ViewsIntegracaoERP.VW_ITEM_CORTADO_PREPEDIDO, new PedidoItemCortadoRowMapper());
	}

	public List<PedidoItemCortado> recuperarItensCortados(String numeroPrePedido) {
		String declare = "DECLARE set bigint @COD_PRE_PEDIDO = "  + numeroPrePedido + ";";
		getJdbcTemplate().update(declare);
		return selectViewSemWhere(ViewsIntegracaoERP.VW_ITEM_CORTADO_PREPEDIDO, new PedidoItemCortadoRowMapper());
	}

}
