package br.com.control.globobroker.dao;

import br.com.control.globobroker.model.envio.ConfirmarEnvioErpTerceiroTO;
import br.com.control.portal.integracao.ProcedureIntegracao;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.sql.CallableStatement;
import java.sql.SQLException;

@Repository
@Transactional
public class ConfirmacaoEnvioErpTerceiroDao extends GloboBrokerJdbcDao<ConfirmarEnvioErpTerceiroTO> {

    @Transactional
    public void confirmarEnvio(ConfirmarEnvioErpTerceiroTO pedido) {
        try {
            System.out.println("VAI CHAMAR A PROC " + ProcedureIntegracao.CONFIRMACAO_ENVIO_PEDIDO_ERPTERC);
            System.out.println("NumeroPedidoJcontrol: " + pedido.getNumeroPedidoJcontrol());
            System.out.println("NumeroPedidoErpTerc: " + pedido.getNumeroPedidoErpTerc());
            System.out.println("Mensagem Erro: " + pedido.getMensagemErro());

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
