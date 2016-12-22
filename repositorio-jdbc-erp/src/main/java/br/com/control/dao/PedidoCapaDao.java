package br.com.control.dao;

import java.sql.CallableStatement;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import br.com.control.integracao.ProcedureIntegracao;
import br.com.control.portal.mensageria.to.AcompanhamentoPedidoTO;
import br.com.control.portal.mensageria.to.PedidoCapaTO;
import br.com.control.util.FormatacaoUtil;

@Repository
public class PedidoCapaDao extends JdbcDao<PedidoCapaTO> {

	@Autowired
	private FormatacaoUtil formatacaoUtil;
	
	@Transactional
	public AcompanhamentoPedidoTO salvarCapaPedido(PedidoCapaTO pedido) {
		CallableStatement stmt = preparaChamadaProcedure(ProcedureIntegracao.INSERT_PEDIDO_CAPA);
		preparaExecucaoProcedure(pedido, stmt);

		try {
			AcompanhamentoPedidoTO pedidoTO = new AcompanhamentoPedidoTO();
			pedidoTO.setRecId(pedido.getRecId());
			pedidoTO.setNumeroPedidoGestao(formatacaoUtil.formataData(pedido.getDataHoraEmissao(), "yyyyMMdd") + String.valueOf(stmt.getLong(12)));
			
			//FIXME: rever o valor do status de acompanhamento de pedido. Está 1 fake abaixo
			pedidoTO.setStatusAcompanhamentoPedido(1L);
			stmt.close();
			return pedidoTO;
		} catch (SQLException e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		} finally{
			closeConnection();
		}

	}
}
