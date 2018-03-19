package br.com.control.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import br.com.control.portal.integracao.ViewsIntegracaoERP;
import br.com.control.repositorio.mappers.RestricaoFinanceiraItemRowMapper;
import br.com.control.vendas.cadastro.modelo.RestricaoFinanceiraItem;

@Repository
public class RestricaoFinanceiraItemDao extends JdbcDao<RestricaoFinanceiraItem> {

	public List<RestricaoFinanceiraItem> listar() {
		String variavelSql = String.format("DECLARE SET varchar(255) @CODIGO_RESTRICAO = ''");
		getJdbcTemplate().update(variavelSql);
		return selectViewSemWhere(ViewsIntegracaoERP.VW_RESTRICAO_FINANCEIRA_ITEM,
				new RestricaoFinanceiraItemRowMapper());
	}

	public List<RestricaoFinanceiraItem> buscarPorCodigoErp(String codigoRestricaoFinanceiraErp) {
		String variavelSql = String.format("DECLARE SET varchar(255) @CODIGO_RESTRICAO = '%s' ",
				codigoRestricaoFinanceiraErp);
		getJdbcTemplate().update(variavelSql);
		return selectViewSemWhere(ViewsIntegracaoERP.VW_RESTRICAO_FINANCEIRA_ITEM,
				new RestricaoFinanceiraItemRowMapper());
	}
	
	
	public Integer count() {
		String variavelSql = String.format("DECLARE SET varchar(255) @CODIGO_RESTRICAO = ''");
		getJdbcTemplate().update(variavelSql);
		String sql = "select count(*) from "+ getSchemaDatabase() + "." + ViewsIntegracaoERP.VW_RESTRICAO_FINANCEIRA_ITEM;
		return contaRegistros(sql);
	}
	

}
