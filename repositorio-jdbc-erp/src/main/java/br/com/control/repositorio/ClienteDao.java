package br.com.control.repositorio;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import br.com.control.autenticacao.mapper.ClienteRowMapper;
import br.com.control.vendas.cadastro.modelo.cliente.Cliente;

@Repository
public class ClienteDao{

	private DataSource dataSource;

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Autowired
	@Qualifier("secondaryDataSource")
	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}

	public List<Cliente> listaTodosClientesDaMatricula(String matricula) {
		jdbcTemplate = new JdbcTemplate(dataSource);
		String sql = "SELECT * FROM cadastro_cliente WHERE matricula_associada = " + matricula;

		List<Cliente> clientes = jdbcTemplate.query(sql, new ClienteRowMapper());

		return clientes;
	}
}
