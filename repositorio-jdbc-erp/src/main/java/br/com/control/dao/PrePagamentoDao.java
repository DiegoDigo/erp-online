package br.com.control.dao;

import java.sql.CallableStatement;
import java.sql.SQLException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import br.com.control.portal.integracao.ProcedureIntegracao;
import br.com.control.portal.mensageria.to.PrePagamentoTO;

@Repository
public class PrePagamentoDao extends JdbcDao<PrePagamentoTO> {

	private static Logger logger = LoggerFactory.getLogger(PrePagamentoDao.class);
	
	@Transactional
	public void salvarPrePagamento(PrePagamentoTO prePagamento) {

		try {
			logger.info("### CHAMANDO PROCEDURE PRE PAGAMENTO");
			CallableStatement stmt = preparaChamadaProcedure(ProcedureIntegracao.PRE_PAGAMENTO);
			preparaExecucaoProcedure(prePagamento, stmt);
			logger.info("--> PRE PAGAMENTO SALVO NO DBMAKER: "+prePagamento.getNumeroTitulo());
			stmt.close();
		} catch (SQLException | RuntimeException e) {
			logger.error("--> ERRO AO TENTAR SALVAR O PRE PAGAMENTO COM NUMERO TITULOS: "+prePagamento.getNumeroTitulo());
			logger.error("--> "+e.getMessage());
		} finally{
			closeConnection();
		}
	}
}
