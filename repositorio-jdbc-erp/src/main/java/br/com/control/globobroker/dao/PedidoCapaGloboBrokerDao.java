package br.com.control.globobroker.dao;

import br.com.control.globobroker.ViewsIntegracaoGloboBroker;
import br.com.control.globobroker.mappers.PedidoCapaGloboBrokerRowMapper;
import br.com.control.globobroker.model.envio.PedidoCapaGloboBroker;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@Transactional
public class PedidoCapaGloboBrokerDao extends GloboBrokerJdbcDao<PedidoCapaGloboBroker> {

    public List<PedidoCapaGloboBroker> listarPedidosBroker() {
        return selectViewSemWhere(ViewsIntegracaoGloboBroker.VW_PEDIDO_ERPTERC_CAPA,
                new PedidoCapaGloboBrokerRowMapper());
    }

    public Integer count() {
        String sql = "select count(*) from " + getSchemaDatabase() + "."
                + ViewsIntegracaoGloboBroker.VW_PEDIDO_ERPTERC_CAPA;
        return contaRegistros(sql);
    }
}


