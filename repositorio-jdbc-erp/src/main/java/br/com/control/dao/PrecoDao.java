package br.com.control.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import br.com.control.integracao.TabelasIntegracao;
import br.com.control.repositorio.mappers.PrecoRowMapper;
import br.com.control.vendas.cadastro.modelo.preco.Preco;

@Repository
@Transactional
public class PrecoDao extends JdbcDao<Preco> {

	public List<Preco> listarPreco() {
		String declare = "DECLARE set date @TABELA_ANO = 2016;";
		String declare2 = "DECLARE set date @TABELA_MES = 10;";
		String declare3 = "DECLARE set date @TABELA_NMES  = 1;";
		getJdbcTemplate().update(declare);
		getJdbcTemplate().update(declare2);
		getJdbcTemplate().update(declare3);
		return selectViewSemWhere(TabelasIntegracao.CADASTRO_PRECO, new PrecoRowMapper());
	}

}
