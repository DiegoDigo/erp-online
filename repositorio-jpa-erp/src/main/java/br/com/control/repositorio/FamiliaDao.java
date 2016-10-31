package br.com.control.repositorio;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import br.com.control.autenticacao.mapper.FamiliaRowMapper;
import br.com.control.vendas.cadastro.modelo.produto.Familia;

@Repository
public class FamiliaDao {

	private DataSource dataSource;

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Autowired
	@Qualifier("secondaryDataSource")
	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}

	public List<Familia> listaTodasAsFamiliasDaMatricula(String matricula) {
		jdbcTemplate = new JdbcTemplate(dataSource);
		String sql = "SELECT * FROM cadastro_familia_produto WHERE matricula_associada = " + matricula;

		List<Familia> familias = jdbcTemplate.query(sql, new FamiliaRowMapper());

		return familias;
	}

}
