package br.com.control.globobroker.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import br.com.control.globobroker.ViewsIntegracaoGloboBroker;
import br.com.control.globobroker.mappers.PedidoItemGloboBrokerRowMapper;
import br.com.control.globobroker.model.envio.PedidoItemGloboBroker;

@Repository
public class PedidoItemGloboBrokerDao extends GloboBrokerJdbcDao<PedidoItemGloboBroker> {

	public List<PedidoItemGloboBroker> listarItensPedidosBroker() {
		return selectViewSemWhere(ViewsIntegracaoGloboBroker.VW_PEDIDO_ERPTERC_ITEM, new PedidoItemGloboBrokerRowMapper());
	}

	public Integer count() {
		String sql = "select count(*) from " + getSchemaDatabase() + "." + ViewsIntegracaoGloboBroker.VW_PEDIDO_ERPTERC_ITEM;
		return contaRegistros(sql);
	}

}
