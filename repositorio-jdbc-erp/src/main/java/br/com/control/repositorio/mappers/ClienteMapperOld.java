package br.com.control.repositorio.mappers;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import br.com.control.vendas.cadastro.modelo.clienteOld.Cliente;

public class ClienteMapperOld implements RowMapper<Cliente> {
	
	@Override
	public Cliente mapRow(ResultSet rs, int rowNum) throws SQLException {
		Cliente cliente = new Cliente();
		cliente.setCodigo(rs.getString("codigo"));
		cliente.setNomeFantasia(rs.getString("nome_fantasia"));
		return cliente;
	}
}