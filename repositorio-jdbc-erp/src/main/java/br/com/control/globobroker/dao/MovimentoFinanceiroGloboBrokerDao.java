package br.com.control.globobroker.dao;

import java.sql.CallableStatement;
import java.sql.SQLException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import br.com.control.dao.JdbcDao;
import br.com.control.globobroker.model.envio.MovimentoFinanceiroGloboBroker;
import br.com.control.portal.integracao.ProcedureIntegracao;

@Repository
public class MovimentoFinanceiroGloboBrokerDao extends JdbcDao<MovimentoFinanceiroGloboBroker> {

	private static final Logger logger = LoggerFactory.getLogger(MovimentoFinanceiroGloboBrokerDao.class);

	
	@Transactional
	public void gravaTituloBaixado(MovimentoFinanceiroGloboBroker movimentoFinanceiroGloboBroker) {
		try {
			CallableStatement stmt = preparaChamadaProcedure(ProcedureIntegracao.INSERT_MOVIMENTO_FINANCEIRO_GLOBAL_BROKER_TITULO_BAIXADO);
			preparaExecucaoProcedure(movimentoFinanceiroGloboBroker, stmt);
			logger.info("--> CODIGO ERRO PROC: "+stmt.getString(12));
			logger.info("--> MSG RETORNO PROC: "+stmt.getString(13));
			stmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		}
	}

	@Transactional
	public void gravaTituloAberto(MovimentoFinanceiroGloboBroker movimentoFinanceiroGlobalBroker) {
		try {
			CallableStatement stmt = preparaChamadaProcedure(ProcedureIntegracao.INSERT_MOVIMENTO_FINANCEIRO_GLOBAL_BROKER_TITULO_ABERTO);
			preparaExecucaoProcedure(movimentoFinanceiroGlobalBroker, stmt);
			logger.info("--> CODIGO ERRO PROC: "+stmt.getString(12));
			logger.info("--> MSG RETORNO PROC: "+stmt.getString(13));
			stmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		}
	}

}
