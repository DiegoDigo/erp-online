package br.com.control.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import br.com.control.repositorio.mappers.ClienteRowMapper;
import br.com.control.vendas.cadastro.modelo.cliente.Cliente;

@Repository
public class ClienteDao extends JdbcDao<Cliente> {

	public List<Cliente> listaTodosClientesDaMatricula(String matricula) {
		String sql = "SELECT * FROM cadastro_cliente WHERE matricula_associada = " + matricula;
		List<Cliente> clientes = getJdbcTemplate().query(sql, new ClienteRowMapper());
		return clientes;
	}

}