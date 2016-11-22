package br.com.control.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import br.com.control.integracao.TabelasIntegracaoPortal;
import br.com.control.repositorio.mappers.ClienteRowMapper;
import br.com.control.vendas.cadastro.modelo.cliente.Cliente;

@Repository
public class ClienteDao extends JdbcDao{

	@Autowired
	private ClienteRowMapper rowMapper;
	
	public List<Cliente> listaTodosClientesDaMatricula(String matricula) {
		String sql = "SELECT * FROM cadastro_cliente WHERE matricula_associada = " + matricula;

		List<Cliente> clientes = getJdbcTemplate().query(sql, rowMapper);

		return clientes;
	}
	
	public List<Cliente> listarClientes() {
		String sql = "SELECT * FROM "+TabelasIntegracaoPortal.CADASTRO_CLIENTE.getViewERP();
		List<Cliente> clientes = getJdbcTemplate().query(sql, rowMapper);

		return clientes;
	}
}
