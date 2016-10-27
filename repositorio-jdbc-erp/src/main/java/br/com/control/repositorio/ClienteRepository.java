package br.com.control.repositorio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import br.com.control.repositorio.mappers.ClienteMapper;
import br.com.control.vendas.cadastro.modelo.cliente.Cliente;

@Repository("clienteJdbcRepository")
public class ClienteRepository extends AbstractCrudJdbc<Cliente> {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	public boolean salva(Cliente cliente) {
		return false;
	}

	public List<Cliente> lista() {
		String SQL = "select * from Cliente";
		List<Cliente> clientes = jdbcTemplate.query(SQL, new ClienteMapper());
		return clientes;
	}

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
}
