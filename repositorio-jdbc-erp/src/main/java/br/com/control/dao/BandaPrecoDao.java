package br.com.control.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import br.com.control.portal.integracao.TabelasIntegracao;
import br.com.control.repositorio.mappers.BandaPrecoRowMapper;
import br.com.control.vendas.cadastro.modelo.preco.BandaPreco;

@Repository
@Transactional
public class BandaPrecoDao extends JdbcDao<BandaPreco> {

	public List<BandaPreco> listarBanda() {	
		String variavelSql = "DECLARE SET VARCHAR(255) @CODIGO_BANDA = '' ";
		getJdbcTemplate().update(variavelSql);		
		return selectViewSemWhere(TabelasIntegracao.CADASTRO_BANDA_PRECO,
				new BandaPrecoRowMapper());
	}

	public BandaPreco buscarBanda(String codigoBanda) {
		String variavelSql = String.format("DECLARE SET VARCHAR(255) @CODIGO_BANDA = '%s' ",codigoBanda);
		getJdbcTemplate().update(variavelSql);	
		return selectViewSingle(TabelasIntegracao.CADASTRO_BANDA_PRECO,
				new BandaPrecoRowMapper());
	}

}
