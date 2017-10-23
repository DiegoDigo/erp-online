package br.com.control.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import br.com.control.portal.integracao.TabelasIntegracao;
import br.com.control.repositorio.mappers.PedidoItemCortadoRowMapper;
import br.com.control.vendas.cadastro.modelo.pedido.PedidoItemCortado;

@Repository
public class PedidoItemCortadoDao extends JdbcDao<PedidoItemCortado> {

	public List<PedidoItemCortado> listar() {
		String declare = "DECLARE set bigint @COD_PRE_PEDIDO = 0;";
		getJdbcTemplate().update(declare);
		return selectViewSemWhere(TabelasIntegracao.PEDIDO_ITEM_CORTADO, new PedidoItemCortadoRowMapper());
	}

	public List<PedidoItemCortado> recuperarItensCortados(String numeroPrePedido) {
		String declare = "DECLARE set bigint @COD_PRE_PEDIDO = "  + numeroPrePedido + ";";
		getJdbcTemplate().update(declare);
		return selectViewSemWhere(TabelasIntegracao.PEDIDO_ITEM_CORTADO, new PedidoItemCortadoRowMapper());
	}

}
