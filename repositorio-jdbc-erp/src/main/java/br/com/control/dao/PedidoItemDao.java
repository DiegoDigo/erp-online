package br.com.control.dao;

import java.sql.CallableStatement;
import java.sql.SQLException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import br.com.control.portal.integracao.ProcedureIntegracao;
import br.com.control.portal.mensageria.to.AcompanhamentoPedidoTO;
import br.com.control.portal.mensageria.to.PedidoItemTO;
import br.com.control.vendas.cadastro.modelo.pedido.PedidoItem;

@Repository
public class PedidoItemDao extends JdbcDao<PedidoItem> {

	private static final Logger logger = LoggerFactory.getLogger(PedidoItemDao.class);
	
	public AcompanhamentoPedidoTO salvarItemPedido(PedidoItemTO pedidoItem) {

		try {
			logger.info("### PREPARANDO CHAMADA PROCEDURE: "+ProcedureIntegracao.INSERT_ITEM_PRE_PEDIDO.getProcedure());
			CallableStatement stmt = preparaChamadaProcedure(ProcedureIntegracao.INSERT_ITEM_PRE_PEDIDO);
			preparaExecucaoProcedure(pedidoItem, stmt);
			stmt.close();
		} catch (SQLException | RuntimeException e) {
			logger.error("--> ERRO AO TENTAR SALVAR O ITEM DA SEQUENCIA: "+pedidoItem.getSequenciaItem());
			logger.error("-->"+ e.getMessage());
		} finally {
			closeConnection();
		}
		AcompanhamentoPedidoTO pedidoTO = new AcompanhamentoPedidoTO();
		pedidoTO.setRecId(pedidoItem.getRecId());
		return pedidoTO;

	}

}
