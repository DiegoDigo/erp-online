package br.com.control.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import br.com.control.portal.integracao.ViewsIntegracaoERP;
import br.com.control.repositorio.mappers.BandaPrecoRowMapper;
import br.com.control.vendas.cadastro.modelo.preco.BandaPreco;

@Repository
@Transactional
public class BandaPrecoDao extends JdbcDao<BandaPreco> {

	public List<BandaPreco> listarBanda() {
		String variavelSql = "DECLARE SET INTEGER @CODIGO_BANDA = 0 ";
		getJdbcTemplate().update(variavelSql);
		return selectViewSemWhere(ViewsIntegracaoERP.VW_BANDA_PRECO_CAPA, new BandaPrecoRowMapper());
	}

	public BandaPreco buscarBanda(String codigoBanda) {
		String variavelSql = String.format("DECLARE SET INTEGER @CODIGO_BANDA = %s ", codigoBanda);
		getJdbcTemplate().update(variavelSql);
		return selectViewSingle(ViewsIntegracaoERP.VW_BANDA_PRECO_CAPA, new BandaPrecoRowMapper());
	}

}
