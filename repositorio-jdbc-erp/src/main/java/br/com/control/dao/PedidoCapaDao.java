package br.com.control.dao;

import java.sql.CallableStatement;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import br.com.control.portal.integracao.ProcedureIntegracao;
import br.com.control.portal.mensageria.to.AcompanhamentoPedidoTO;
import br.com.control.portal.mensageria.to.PedidoCapaTO;
import br.com.control.util.FormatacaoUtil;

@Repository
public class PedidoCapaDao extends JdbcDao<PedidoCapaTO> {

	@Autowired
	private FormatacaoUtil formatacaoUtil;
	
	private String completaComZeros(String valor){
		String zeros = "";
		if (valor.length() <= 3) {
			for (int i = valor.length(); i <= 3; i++) {
				zeros += "0";
			}
		}
		return zeros + valor;
	}
	
	@Transactional
	public AcompanhamentoPedidoTO salvarCapaPedido(PedidoCapaTO pedido) {

		try {
			CallableStatement stmt = preparaChamadaProcedure(ProcedureIntegracao.INSERT_CAPA_PRE_PEDIDO);
			preparaExecucaoProcedure(pedido, stmt);
			AcompanhamentoPedidoTO pedidoTO = new AcompanhamentoPedidoTO();
			pedidoTO.setRecId(pedido.getRecId());
			pedidoTO.setNumeroPedidoGestao(String.valueOf(stmt.getLong(42)));
			
			//FIXME: rever o valor do status de acompanhamento de pedido. Está 1 fake abaixo
			pedidoTO.setStatusAcompanhamentoPedido(1L);
			stmt.close();
			return pedidoTO;
		} catch (SQLException | RuntimeException e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		} finally{
			closeConnection();
		}

	}
}
