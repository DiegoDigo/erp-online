package br.com.control.dao;

import java.sql.CallableStatement;
import java.sql.SQLException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import br.com.control.portal.integracao.ProcedureIntegracao;
import br.com.control.portal.mensageria.to.PrePagamentoTO;
import br.com.control.portal.mensageria.to.SfaPesquisaMensalTO;

@Repository
public class SfaPesquisaMensalDao extends JdbcDao<PrePagamentoTO> {

	private static Logger logger = LoggerFactory.getLogger(SfaPesquisaMensalDao.class);
	
	@Transactional
	public void salvarPesquisaMensalSfa(SfaPesquisaMensalTO sfaPesquisaMensal) {

		try {
			logger.info("### CHAMANDO PROCEDURE PESQUISA MENSAL SFA");
			CallableStatement stmt = preparaChamadaProcedure(ProcedureIntegracao.PESQUISA_MENSAL_SFA);
			preparaExecucaoProcedure(sfaPesquisaMensal, stmt);
			logger.info("--> PESQUISA MENSAL SFA SALVO NO DBMAKER: "+sfaPesquisaMensal.getCodigoPesquisa());
			stmt.close();
		} catch (SQLException | RuntimeException e) {
			logger.error("--> ERRO AO TENTAR SALVAR A PESQUISA MENSAL SFA COM NUMERO : "+sfaPesquisaMensal.getCodigoPesquisa());
			logger.error("--> "+e.getMessage());
		} finally{
			closeConnection();
		}
	}
}
