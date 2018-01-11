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
		String codemp = "DECLARE set int @codemp = 0;";
		getJdbcTemplate().update(declare);
		getJdbcTemplate().update(codemp);
		return selectViewSemWhere(ViewsIntegracaoERP.VW_ITEM_CORTADO_PREPEDIDO, new PedidoItemCortadoRowMapper());
	}

	public List<PedidoItemCortado> recuperarItensCortados(int codigo_empresa, String numeroPrePedido) {
		String pre_pedido = "DECLARE set bigint @COD_PRE_PEDIDO = "  + numeroPrePedido + ";";
		String codemp = "DECLARE set int @codemp = "  + codigo_empresa + ";";
		getJdbcTemplate().update(pre_pedido);
		getJdbcTemplate().update(codemp);
		return selectViewSemWhere(ViewsIntegracaoERP.VW_ITEM_CORTADO_PREPEDIDO, new PedidoItemCortadoRowMapper());
	}
}
