package br.com.control.dao;

import java.util.List;

import javax.sql.DataSource;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import br.com.control.autenticacao.mapper.MarcaRowMapper;
import br.com.control.vendas.cadastro.modelo.produto.Marca;

@Repository
@Transactional
public class MarcaProdutoDao {

	private DataSource dataSource;

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Autowired
	@Qualifier("secondaryDataSource")
	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}

	public List<Marca> listaTodasAsFamiliasDaMatricula(String matricula) {
		jdbcTemplate = new JdbcTemplate(dataSource);
		String sql = "SELECT * FROM cadastro_marca_produto WHERE matricula_associada = " + matricula;

		List<Marca> marcas = jdbcTemplate.query(sql, new MarcaRowMapper());

		return marcas;
	}

}
