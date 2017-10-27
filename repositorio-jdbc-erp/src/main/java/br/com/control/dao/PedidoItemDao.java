package br.com.control.dao;

import java.sql.CallableStatement;
import java.sql.SQLException;

import org.springframework.stereotype.Repository;

import br.com.control.portal.integracao.ProcedureIntegracao;
import br.com.control.portal.mensageria.to.AcompanhamentoPedidoTO;
import br.com.control.portal.mensageria.to.PedidoItemTO;
import br.com.control.vendas.cadastro.modelo.pedido.PedidoItem;

@Repository
public class PedidoItemDao extends JdbcDao<PedidoItem> {

	public AcompanhamentoPedidoTO salvarItemPedido(PedidoItemTO pedidoItem) {

		try {
			CallableStatement stmt = preparaChamadaProcedure(ProcedureIntegracao.INSERT_ITEM_PRE_PEDIDO);
			preparaExecucaoProcedure(pedidoItem, stmt);
			stmt.close();
		} catch (SQLException | RuntimeException e) {
			e.printStackTrace();
		} finally {
			closeConnection();
		}
		AcompanhamentoPedidoTO pedidoTO = new AcompanhamentoPedidoTO();
		pedidoTO.setRecId(pedidoItem.getRecId());
		return pedidoTO;

	}

}
