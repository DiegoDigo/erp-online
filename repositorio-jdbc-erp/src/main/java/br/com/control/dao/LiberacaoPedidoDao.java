package br.com.control.dao;

import java.sql.CallableStatement;
import java.sql.SQLException;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import br.com.control.portal.integracao.ProcedureIntegracao;
import br.com.control.portal.mensageria.to.LiberacaoPedidoTO;

@Repository
public class LiberacaoPedidoDao extends JdbcDao<LiberacaoPedidoTO> {

	@Transactional
	public void liberarPedido(LiberacaoPedidoTO liberacao) {
		try {
			CallableStatement stmt = preparaChamadaProcedure(ProcedureIntegracao.LIBERACAO_PEDIDO);
			preparaExecucaoProcedure(liberacao, stmt);
			stmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		} finally{
			closeConnection();
		}

	}
}
