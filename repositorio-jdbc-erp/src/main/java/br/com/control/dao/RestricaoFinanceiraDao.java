package br.com.control.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import br.com.control.portal.integracao.TabelasIntegracao;
import br.com.control.repositorio.mappers.RestricaoFinanceiraRowMapper;
import br.com.control.vendas.cadastro.modelo.RestricaoFinanceira;

@Repository
public class RestricaoFinanceiraDao extends JdbcDao<RestricaoFinanceira> {

	public List<RestricaoFinanceira> listar() {
		String variavelSql = String.format("DECLARE SET varchar(255) @CODIGO_RESTRICAO = ''");
		getJdbcTemplate().update(variavelSql);
		return selectViewSemWhere(TabelasIntegracao.CADASTRO_RESTRICAO_FINANCEIRA, new RestricaoFinanceiraRowMapper());
	}

	public RestricaoFinanceira buscarPorCodigoErp(String codigoErp) {
		String variavelSql = String.format("DECLARE SET varchar(255) @CODIGO_RESTRICAO = '%s' ", codigoErp);
		getJdbcTemplate().update(variavelSql);
		return selectViewSingle(TabelasIntegracao.CADASTRO_RESTRICAO_FINANCEIRA, new RestricaoFinanceiraRowMapper());
	}
}
