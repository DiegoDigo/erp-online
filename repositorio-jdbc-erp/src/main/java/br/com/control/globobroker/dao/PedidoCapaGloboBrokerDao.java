package br.com.control.globobroker.dao;

import java.sql.CallableStatement;
import java.sql.SQLException;
import java.util.List;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import br.com.control.globobroker.ViewsIntegracaoGloboBroker;
import br.com.control.globobroker.mappers.PedidoCapaGloboBrokerRowMapper;
import br.com.control.globobroker.model.envio.ConfirmarEnvioErpTerceiroTO;
import br.com.control.globobroker.model.envio.PedidoCapaGloboBroker;
import br.com.control.portal.integracao.ProcedureIntegracao;

@Repository
public class PedidoCapaGloboBrokerDao extends GloboBrokerJdbcDao<PedidoCapaGloboBroker> {

	public List<PedidoCapaGloboBroker> listarPedidosBroker() {
		return selectViewSemWhere(ViewsIntegracaoGloboBroker.VW_PEDIDO_ERPTERC_CAPA,
				new PedidoCapaGloboBrokerRowMapper());
	}

	public Integer count() {
		String sql = "select count(*) from " + getSchemaDatabase() + "."
				+ ViewsIntegracaoGloboBroker.VW_PEDIDO_ERPTERC_CAPA;
		return contaRegistros(sql);
	}

	@Transactional
	public void confirmarEnvio(ConfirmarEnvioErpTerceiroTO pedido) {
		try {
			System.out.println("VAI CHAMAR A PROC " + ProcedureIntegracao.CONFIRMACAO_ENVIO_PEDIDO_ERPTERC);
			System.out.println("NumeroPedidoJcontrol " + pedido.getNumeroPedidoJcontrol());
			System.out.println("NumeroPedidoErpTerc" + pedido.getNumeroPedidoErpTerc());
			System.out.println("Mensagem Erro" + pedido.getMensagemErro());

			CallableStatement stmt = preparaChamadaProcedure(ProcedureIntegracao.CONFIRMACAO_ENVIO_PEDIDO_ERPTERC);
			preparaExecucaoProcedure(pedido, stmt);
			stmt.close();
		} catch (SQLException e) {
			System.out.println("ERRO NA CHAMADA DA PROCEDURE " + e.getMessage());
			System.out.println("XXX " + e.getCause());
			System.out.println("XXX " + e.getSQLState());
		} finally {
			closeConnection();
		}
	}
}
