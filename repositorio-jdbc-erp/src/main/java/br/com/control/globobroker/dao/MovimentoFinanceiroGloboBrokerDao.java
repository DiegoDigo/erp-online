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
	public MovimentoFinanceiroGloboBroker gravaTituloBaixado(MovimentoFinanceiroGloboBroker movimentoFinanceiroGloboBroker) {
		try {

			CallableStatement stmt = preparaChamadaProcedure(ProcedureIntegracao.TITULOS_BAIXADOS_ERP_TERCEIROS);
			preparaExecucaoProcedure(movimentoFinanceiroGloboBroker, stmt);

//			logger.info("--> CODIGO ERRO PROC: "+stmt.getString(8));
//			logger.info("--> MSG RETORNO PROC: "+stmt.getString(9));

			movimentoFinanceiroGloboBroker.setCodigoErro(stmt.getString(8));
			movimentoFinanceiroGloboBroker.setMensagemRetorno(stmt.getString(9));
			stmt.close();

			return movimentoFinanceiroGloboBroker;
		} catch (SQLException e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		}
	}
}
