package br.com.control.dao;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import br.com.control.autenticacao.mapper.CategoriaRowMapper;
import br.com.control.vendas.cadastro.modelo.produto.Categoria;

@Repository
public class CategoriaProdutoDao {

	private DataSource dataSource;

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Autowired
	@Qualifier("secondaryDataSource")
	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}

	public List<Categoria> listaTodasAsFamiliasDaMatricula(String matricula) {
		jdbcTemplate = new JdbcTemplate(dataSource);
		String sql = "SELECT * FROM cadastro_categoria_produto WHERE matricula_associada = " + matricula;

		List<Categoria> categorias = jdbcTemplate.query(sql, new CategoriaRowMapper());

		return categorias;
	}

}
