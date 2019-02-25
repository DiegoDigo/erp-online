package br.com.control.dao;

import br.com.control.portal.integracao.ProcedureIntegracao;
import br.com.control.portal.mensageria.to.AcompanhamentoPedidoTO;
import br.com.control.portal.mensageria.to.PedidoCapaTO;
import br.com.control.portal.mensageria.to.PedidoComodatoTO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.sql.CallableStatement;
import java.sql.SQLException;

@Repository
public class PedidoRecolhaComodatoCapaDao extends JdbcDao<PedidoCapaTO> {

	private static Logger logger = LoggerFactory.getLogger(PedidoRecolhaComodatoCapaDao.class);
	
	@Transactional
	public AcompanhamentoPedidoTO salvarCapaPedidoComodato(PedidoComodatoTO pedido) {

		AcompanhamentoPedidoTO pedidoTO = new AcompanhamentoPedidoTO();
		try {
			logger.info("### CHAMANDO PROCEDURE PEDIDO COMODATO");
			CallableStatement stmt = preparaChamadaProcedure(ProcedureIntegracao.INSERT_PEDIDO_RETIRADA_COMODATO);
			preparaExecucaoProcedure(pedido, stmt);
			pedidoTO.setRecId(pedido.getRecId());
			pedidoTO.setNumeroPedidoGestao(String.valueOf(stmt.getLong(12)));
			
			logger.info("--> PRÉ PEDIDO COMODATO SALVO NO DBMAKER: "+pedidoTO.getNumeroPedidoGestao());

			pedidoTO.setStatusAcompanhamentoPedido(1L);
			stmt.close();
			return pedidoTO;
		} catch (SQLException | RuntimeException e) {
			logger.error("--> ERRO AO TENTAR SALVAR O PRE PEDIDO COMODATO COM REC ID: "+pedido.getRecId()+" VINDO DO "+ pedido.getOrigem());
			logger.error("--> "+e.getMessage());
		} finally{
			closeConnection();
		}
		return null;
	}

}
