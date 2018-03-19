package br.com.control.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import br.com.control.portal.integracao.ViewsIntegracaoERP;
import br.com.control.repositorio.mappers.BandaPrecoItemRowMapper;
import br.com.control.vendas.cadastro.modelo.preco.BandaPrecoItem;

@Repository
public class BandaPrecoItemDao extends JdbcDao<BandaPrecoItem> {

	public List<BandaPrecoItem> listar() {
		String variavelSql = "DECLARE SET INTEGER @CODIGO_BANDA = 0";
		getJdbcTemplate().update(variavelSql);
		return selectViewSemWhere(ViewsIntegracaoERP.VW_BANDA_PRECO_ITEM, new BandaPrecoItemRowMapper());
	}

	public List<BandaPrecoItem> buscarBandaItem(Integer codigoBandaPreco) {
		String variavelSql = String.format("DECLARE SET INTEGER @CODIGO_BANDA = %s ", codigoBandaPreco);
		getJdbcTemplate().update(variavelSql);
		return selectViewSemWhere(ViewsIntegracaoERP.VW_BANDA_PRECO_ITEM, new BandaPrecoItemRowMapper());
	}
	
	public Integer count() {
		String declare = "DECLARE SET INTEGER @CODIGO_BANDA = 0";
		getJdbcTemplate().update(declare);
		String sql = "select count(*) from "+ getSchemaDatabase() + "." + ViewsIntegracaoERP.VW_RESTRICAO_FINANCEIRA_ITEM;
		return contaRegistros(sql);
	}

}
