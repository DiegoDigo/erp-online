package br.com.control.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import br.com.control.portal.integracao.TabelasIntegracao;
import br.com.control.repositorio.mappers.MovimentoFinanceiroRowMapper;
import br.com.control.vendas.cadastro.modelo.MovimentoFinanceiro;

@Repository
public class MovimentoFinanceiroDao extends JdbcDao<MovimentoFinanceiro> {

	public MovimentoFinanceiro buscarMovimentoFinanceiro(Integer dataOperacao) {
		String declare = "DECLARE set int @CODIGO_PROD= " + dataOperacao + ";";
		getJdbcTemplate().update(declare);
		return selectViewSingle(TabelasIntegracao.MOVIMENTO_FINANCEIRO, new MovimentoFinanceiroRowMapper());

	}

	public List<MovimentoFinanceiro> listarMovimentoFinaceiro() {
		String declare = "DECLARE set int @CODIGO_PROD= 0";
		getJdbcTemplate().update(declare);
		return selectViewSemWhere(TabelasIntegracao.MOVIMENTO_FINANCEIRO, new MovimentoFinanceiroRowMapper());
	}

}
