package br.com.control.dao;

import java.util.List;
import javax.transaction.Transactional;
import org.springframework.stereotype.Repository;

import br.com.control.integracao.TabelasIntegracaoPortal;
import br.com.control.repositorio.mappers.GrupoRowMapper;
import br.com.control.vendas.cadastro.modelo.produto.Grupo;

@Repository
@Transactional
public class GrupoProdutoDao extends JdbcDao {

	public List<Grupo> listaTodasAsFamiliasDaMatricula(String matricula) {
		String declare = "DECLARE set int @CODIGO_GRUPO_PRODUTO = 98;";
		getJdbcTemplate().update(declare);
		String sql = "SELECT * FROM "+TabelasIntegracaoPortal.CADASTRO_GRUPO_PRODUTO.getViewERP();
		List<Grupo> grupos = getJdbcTemplate().query(sql, new GrupoRowMapper());
		return grupos;
	}
	
	

}
