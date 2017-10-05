package br.com.control.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import br.com.control.portal.integracao.TabelasIntegracao;
import br.com.control.repositorio.mappers.PedidoItemCortadoRowMapper;
import br.com.control.vendas.cadastro.modelo.pedido.PedidoItemCortado;

@Repository
public class PedidoItensCortadosDao extends JdbcDao<PedidoItemCortado> {

	public List<PedidoItemCortado> listar() {
		return selectViewSemWhere(TabelasIntegracao.PEDIDO_ITEM_CORTADO, new PedidoItemCortadoRowMapper());
	}

}
