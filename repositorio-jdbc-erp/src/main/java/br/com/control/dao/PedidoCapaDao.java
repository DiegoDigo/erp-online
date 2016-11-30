package br.com.control.dao;

import java.sql.CallableStatement;
import java.sql.SQLException;

import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import br.com.control.integracao.ProcedureIntegracao;
import br.com.control.portal.mensageria.to.PedidoCapaTO;
import br.com.control.portal.mensageria.to.AcompanhamentoPedidoTO;

@Repository
@Transactional
public class PedidoCapaDao extends JdbcDao<PedidoCapaTO> {

	public AcompanhamentoPedidoTO salvarCapaPedido(PedidoCapaTO pedido) {
		CallableStatement stmt = preparaChamadaProcedure(ProcedureIntegracao.INSERT_PEDIDO_CAPA);
		preparaExecucaoProcedure(pedido, stmt);

		try {
			AcompanhamentoPedidoTO pedidoTO = new AcompanhamentoPedidoTO();
			pedidoTO.setRecId(pedido.getRecId());
			pedidoTO.setNumeroPedidoGestao(stmt.getLong(12));
			pedidoTO.setStatusAcompanhamentoPedido(1L);

			return pedidoTO;
		} catch (SQLException e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		}

	}

}
