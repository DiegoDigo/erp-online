package br.com.control.dao;

import java.util.List;

import javax.sql.DataSource;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import br.com.control.autenticacao.mapper.GrupoRowMapper;
import br.com.control.vendas.cadastro.modelo.produto.Grupo;

@Repository
@Transactional
public class GrupoProdutoDao {

	private DataSource dataSource;

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Autowired
	@Qualifier("secondaryDataSource")
	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}

	public List<Grupo> listaTodasAsFamiliasDaMatricula(String matricula) {
		jdbcTemplate = new JdbcTemplate(dataSource);
		String sql = "SELECT * FROM cadastro_grupo_produto WHERE matricula_associada = " + matricula;

		List<Grupo> grupos = jdbcTemplate.query(sql, new GrupoRowMapper());

		return grupos;
	}

}
