package br.com.control.globobroker.dao;

import java.sql.CallableStatement;
import java.sql.SQLException;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import br.com.control.dao.JdbcDao;
import br.com.control.globobroker.model.envio.MovimentoFinanceiroGloboBroker;
import br.com.control.portal.integracao.ProcedureIntegracao;

@Repository
public class MovimentoFinanceiroGloboBrokerDao extends JdbcDao<MovimentoFinanceiroGloboBroker> {

	@Transactional
	public String gravaTituloBaixado(MovimentoFinanceiroGloboBroker movimentoFinanceiroGloboBroker) {
		String mensagemRetorno = null;
		System.out.println("Vai gravar o movimento fincaneiro");
		try {
			CallableStatement stmt = preparaChamadaProcedure(
					ProcedureIntegracao.INSERT_MOVIMENTO_FINANCEIRO_GLOBAL_BROKER_TITULO_BAIXADO);
			preparaExecucaoProcedure(movimentoFinanceiroGloboBroker, stmt);

			System.out.println(stmt);

			stmt.close();
			mensagemRetorno = "Registro gravado com sucesso";
		} catch (SQLException e) {
			e.printStackTrace();
			mensagemRetorno = e.getMessage();
		}

		return mensagemRetorno;
	}

	@Transactional
	public String gravaTituloAberto(MovimentoFinanceiroGloboBroker movimentoFinanceiroGlobalBroker) {
		String mensagemRetorno = null;
		System.out.println("Vai gravar o movimento fincaneiro");
		try {
			CallableStatement stmt = preparaChamadaProcedure(
					ProcedureIntegracao.INSERT_MOVIMENTO_FINANCEIRO_GLOBAL_BROKER_TITULO_ABERTO);
			preparaExecucaoProcedure(movimentoFinanceiroGlobalBroker, stmt);

			System.out.println(stmt);

			stmt.close();
			mensagemRetorno = "Registro gravado com sucesso";
		} catch (SQLException e) {
			e.printStackTrace();
			mensagemRetorno = e.getMessage();
		}

		return mensagemRetorno;
	}

}
