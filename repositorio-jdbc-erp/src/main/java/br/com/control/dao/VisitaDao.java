package br.com.control.dao;

import java.sql.CallableStatement;
import java.sql.SQLException;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import br.com.control.portal.integracao.ProcedureIntegracao;
import br.com.control.portal.integracao.ViewsIntegracaoERP;
import br.com.control.portal.mensageria.to.VisitaTO;
import br.com.control.repositorio.mappers.VisitaRowMapper;
import br.com.control.vendas.cadastro.modelo.cliente.Visita;

@Repository
@Transactional
public class VisitaDao extends JdbcDao<Visita> {

	public List<Visita> listaTodas() {
		String declare = "DECLARE set int @pasta = 0;";
		getJdbcTemplate().update(declare);
		return selectViewSemWhere(ViewsIntegracaoERP.VW_DIAS_VISITA_VENDEDOR, new VisitaRowMapper());
	}

	public List<Visita> recuperaPorPasta(Integer numeroPasta) {
		String declare = "DECLARE set int @pasta = " + numeroPasta + ";";
		getJdbcTemplate().update(declare);
		return selectViewSemWhere(ViewsIntegracaoERP.VW_DIAS_VISITA_VENDEDOR, new VisitaRowMapper());
	}
	
	public Integer count() {
		String declare = "DECLARE set int @pasta = 0;";
		getJdbcTemplate().update(declare);
		String sql = "select count(*) from "+ getSchemaDatabase() + "." + ViewsIntegracaoERP.VW_DIAS_VISITA_VENDEDOR;
		return contaRegistros(sql);
	}

	public void processarVisitas(VisitaTO visita) {
		CallableStatement stmt = preparaChamadaProcedure(ProcedureIntegracao.ATUALIZAR_VISITAS);
		preparaExecucaoProcedure(visita, stmt);
		try {
			stmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
			e.getMessage();
		} finally {
			closeConnection();
		}
	}
}
