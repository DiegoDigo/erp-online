package br.com.control.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import br.com.control.portal.integracao.TabelasIntegracao;
import br.com.control.repositorio.mappers.ClienteRowMapper;
import br.com.control.vendas.cadastro.modelo.cliente.Cliente;

@Repository
@Transactional
public class ClienteDao extends JdbcDao<Cliente> {

	public List<Cliente> listaTodosClientesDaMatricula() {
		String declare = "DECLARE set int @CODIGO_CLIENTE = 0";
		getJdbcTemplate().update(declare);
		return selectViewSemWhere(TabelasIntegracao.CADASTRO_CLIENTE, new ClienteRowMapper());
	}

	public Cliente recuperarCliente(String codigoClienteErp) {
		String declare = "DECLARE set int @CODIGO_CLIENTE =  " + codigoClienteErp + ";";
		getJdbcTemplate().update(declare);
		return selectViewSingle(TabelasIntegracao.CADASTRO_CLIENTE, new ClienteRowMapper());
	}

}
