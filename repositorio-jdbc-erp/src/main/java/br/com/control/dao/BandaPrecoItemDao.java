package br.com.control.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import br.com.control.portal.integracao.TabelasIntegracao;
import br.com.control.repositorio.mappers.BandaPrecoItemRowMapper;
import br.com.control.vendas.cadastro.modelo.preco.BandaPrecoItem;

@Repository
public class BandaPrecoItemDao extends JdbcDao<BandaPrecoItem> {

	public List<BandaPrecoItem> listar() {
		String variavelSql = "DECLARE SET INTEGER @CODIGO_BANDA = 0 ";
		getJdbcTemplate().update(variavelSql);
		return selectViewSemWhere(TabelasIntegracao.CADASTRO_BANDA_PRECO_ITEM, new BandaPrecoItemRowMapper());
	}

	public List<BandaPrecoItem> buscarBandaItem(Integer codigoBandaPreco) {
		String variavelSql = String.format("DECLARE SET INTEGER @CODIGO_BANDA_PRECO = %s ", codigoBandaPreco);
		getJdbcTemplate().update(variavelSql);
		return selectViewSemWhere(TabelasIntegracao.CADASTRO_BANDA_PRECO_ITEM, new BandaPrecoItemRowMapper());
	}

}
