package br.com.control.dao;

import java.sql.CallableStatement;
import java.sql.SQLException;
import java.util.List;

import javax.transaction.Transactional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import br.com.control.portal.integracao.ProcedureIntegracao;
import br.com.control.portal.integracao.ViewsIntegracaoERP;
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
		return selectViewSemWhere(ViewsIntegracaoERP.VW_CLIENTE, new ClienteRowMapper());
	}

	public Cliente recuperarCliente(int codigoClienteErp) {
		String declare = "DECLARE SET INT @CODIGO_CLIENTE = " + codigoClienteErp;
		getJdbcTemplate().update(declare);
		return selectViewSingle(ViewsIntegracaoERP.VW_CLIENTE, new ClienteRowMapper());
	}

	@Transactional
	public void salvarOuAlterar(ClienteTO cliente) {
		try {
			logger.info("### CHAMANDO PROCEDURE: "+ProcedureIntegracao.INSERE_ALTERA_CLIENTE.getProcedure());
			CallableStatement stmt = preparaChamadaProcedure(ProcedureIntegracao.INSERE_ALTERA_CLIENTE);
			preparaExecucaoProcedure(cliente, stmt);
			logger.info("--> CODIGO RETORNO PROC: "+stmt.getInt(53));
			logger.info("--> MSG RETORNO PROC: "+stmt.getString(54));
			logger.info("--> CLIENTE SALVO NO DBMAKER: "+cliente.getRazaoSocial());
			stmt.close();
		} catch (SQLException | RuntimeException e) {
			logger.error("--> ERRO AO TENTAR SALVAR O CLIENTE: "+cliente.getRazaoSocial());
			logger.error("--> "+e.getMessage());
		} finally{
			closeConnection();
		}
	}

}
