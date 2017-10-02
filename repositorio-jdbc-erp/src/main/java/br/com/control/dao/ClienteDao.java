package br.com.control.dao;

import java.sql.CallableStatement;
import java.sql.SQLException;
import java.util.List;

import javax.transaction.Transactional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import br.com.control.portal.integracao.ProcedureIntegracao;
import br.com.control.portal.integracao.TabelasIntegracao;
import br.com.control.portal.mensageria.to.ClienteTO;
import br.com.control.repositorio.mappers.ClienteRowMapper;
import br.com.control.vendas.cadastro.modelo.cliente.Cliente;

@Repository
@Transactional
public class ClienteDao extends JdbcDao<Cliente> {

	private static final Logger logger = LoggerFactory.getLogger(ClienteDao.class);

	public List<Cliente> listaTodosClientesDaMatricula() {
		String declare = "DECLARE set int @CODIGO_CLIENTE = 0";
		getJdbcTemplate().update(declare);
		return selectViewSemWhere(TabelasIntegracao.CADASTRO_CLIENTE, new ClienteRowMapper());
	}

	public Cliente recuperarCliente(int codigoClienteErp) {
		String declare = "DECLARE SET INT @CODIGO_CLIENTE = " + codigoClienteErp;
		getJdbcTemplate().update(declare);
		return selectViewSingle(TabelasIntegracao.CADASTRO_CLIENTE, new ClienteRowMapper());
	}

	@Transactional
	public void salvarOuAlterar(ClienteTO cliente) {
		cliente.setCargo("");
		CallableStatement stmt = preparaChamadaProcedure(ProcedureIntegracao.INSERE_ALTERA_CLIENTE);
		preparaExecucaoProcedure(cliente, stmt);
		try {
			logger.info("PROC INSERT/UPDATE PDV - CODIGO RETORNO: " + stmt.getInt(38));
			logger.info("PROC INSERT/UPDATE PDV - MSG RETORNO: " + stmt.getString(39));
			stmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
			e.getMessage();
		}
	}

}
