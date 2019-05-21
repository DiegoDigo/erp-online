package br.com.control.dao;

import java.sql.CallableStatement;
import java.sql.SQLException;

import br.com.control.portal.Service.Impl.PedidoCapaPortalServiceImpl;
import br.com.control.portal.Service.PedidoCapaPortalService;
import br.com.control.portal.Service.PedidoItemPortalService;
import br.com.control.portal.mensageria.to.CancelaPrePedido;
import br.com.control.retransmissao.Serivce.PedidoRetransmissaoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import br.com.control.portal.integracao.ProcedureIntegracao;
import br.com.control.portal.mensageria.to.AcompanhamentoPedidoTO;
import br.com.control.portal.mensageria.to.PedidoCapaTO;

@Repository
public class PedidoCapaDao extends JdbcDao<PedidoCapaTO> {

	private static Logger logger = LoggerFactory.getLogger(PedidoCapaDao.class);

	@Autowired
	PedidoRetransmissaoService pedidoRetransmissaoService;

	@Autowired
	PedidoCapaPortalService pedidoCapaPortalService;

	@Autowired
	PedidoItemPortalService pedidoItemPortalService;
	

	public AcompanhamentoPedidoTO salvarCapaPedido(PedidoCapaTO pedido) throws Exception {

		AcompanhamentoPedidoTO pedidoTO = new AcompanhamentoPedidoTO();

			logger.info("### CHAMANDO PROCEDURE PEDIDO CAPA");
			CallableStatement stmt = preparaChamadaProcedure(ProcedureIntegracao.INSERT_CAPA_PRE_PEDIDO);
			preparaExecucaoProcedure(pedido, stmt);
			pedidoTO.setRecId(pedido.getRecId());
			pedidoTO.setNumeroPedidoGestao(String.valueOf(stmt.getLong(44)));
			
			logger.info("--> PRÉ PEDIDO SALVO NO DBMAKER: "+pedidoTO.getNumeroPedidoGestao());
			
			//FIXME: rever o valor do status de acompanhamento de pedido. Está 1 fake abaixo
			pedidoTO.setStatusAcompanhamentoPedido(1L);
			stmt.close();

			closeConnection();
			return pedidoTO;



	}


	@Transactional
	public AcompanhamentoPedidoTO cancelarPrePedido(CancelaPrePedido pedido) {

		AcompanhamentoPedidoTO pedidoTO = new AcompanhamentoPedidoTO();
		try {
			logger.info("### CHAMANDO PROCEDURE PEDIDO CAPA");
			CallableStatement stmt = preparaChamadaProcedure(ProcedureIntegracao.CANCELAMENTO_PRE_PEDIDO);
			preparaExecucaoProcedure(pedido, stmt);
			pedidoTO.setRecId(pedido.getRecId());
			pedidoTO.setNumeroPedidoGestao(String.valueOf(stmt.getLong(3)));

			logger.info("--> PRÉ PEDIDO SALVO NO DBMAKER: "+pedidoTO.getNumeroPedidoGestao());

			//FIXME: rever o valor do status de acompanhamento de pedido. Está 1 fake abaixo
			pedidoTO.setStatusAcompanhamentoPedido(1L);
			stmt.close();
			return pedidoTO;
		} catch (SQLException | RuntimeException e) {
			logger.error("--> ERRO AO TENTAR SALVAR O PRE PEDIDO COM REC ID: "+pedido.getRecId()+" VINDO DO ");
			logger.error("--> "+e.getMessage());
		} finally{
			closeConnection();
		}

		return null;

	}
}
