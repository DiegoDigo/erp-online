package br.com.control.dao;

import java.sql.CallableStatement;
import java.sql.SQLException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import br.com.control.portal.integracao.ProcedureIntegracao;
import br.com.control.portal.mensageria.to.AcompanhamentoPedidoTO;
import br.com.control.portal.mensageria.to.PedidoCapaTO;

@Repository
public class PedidoCapaDao extends JdbcDao<PedidoCapaTO> {

	private static Logger logger = LoggerFactory.getLogger(PedidoCapaDao.class);
	
	@Transactional
	public AcompanhamentoPedidoTO salvarCapaPedido(PedidoCapaTO pedido) {

		AcompanhamentoPedidoTO pedidoTO = new AcompanhamentoPedidoTO();
		try {
			logger.info("### CHAMANDO PROCEDURE PEDIDO CAPA");
			CallableStatement stmt = preparaChamadaProcedure(ProcedureIntegracao.INSERT_CAPA_PRE_PEDIDO);
			preparaExecucaoProcedure(pedido, stmt);
			pedidoTO.setRecId(pedido.getRecId());
			pedidoTO.setNumeroPedidoGestao(String.valueOf(stmt.getLong(44)));
			
			logger.info("--> PRÉ PEDIDO SALVO NO DBMAKER: "+pedidoTO.getNumeroPedidoGestao());
			
			//FIXME: rever o valor do status de acompanhamento de pedido. Está 1 fake abaixo
			pedidoTO.setStatusAcompanhamentoPedido(1L);
			stmt.close();
			return pedidoTO;
		} catch (SQLException | RuntimeException e) {
			logger.error("--> ERRO AO TENTAR SALVAR O PRE PEDIDO COM REC ID: "+pedido.getRecId()+" VINDO DO "+ pedido.getOrigem());
			logger.error("--> "+e.getMessage());
		} finally{
			closeConnection();
		}
		
		return null;

	}
}
