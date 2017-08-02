package br.com.control.dao;

import java.sql.CallableStatement;
import java.sql.SQLException;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import br.com.control.portal.integracao.ProcedureIntegracao;
import br.com.control.portal.integracao.TabelasIntegracao;
import br.com.control.repositorio.mappers.ClienteEnderecoRowMapper;
import br.com.control.vendas.cadastro.modelo.cliente.ClienteEndereco;

@Repository
@Transactional
public class ClienteEnderecoDao extends JdbcDao<ClienteEndereco> {

	public List<ClienteEndereco> recuperarTipoEndereco(String codigoTipoEnderecoERP) {
		String declare = "DECLARE set date @CODIGO_CLIENTE = " + Integer.valueOf(codigoTipoEnderecoERP);
		getJdbcTemplate().update(declare);
		return selectViewSemWhere(TabelasIntegracao.CADASTRO_CLIENTE_ENDERECO, new ClienteEnderecoRowMapper());
		
	}

	public List<ClienteEndereco> listarEnderecoCliente() {
		String declare = "DECLARE set date @CODIGO_CLIENTE = 0";
		getJdbcTemplate().update(declare);
		return selectViewSemWhere(TabelasIntegracao.CADASTRO_CLIENTE_ENDERECO, new ClienteEnderecoRowMapper());
	}

	@Transactional
	public void alterarEndereco(ClienteEndereco clienteEndereco) {
		CallableStatement stmt = preparaChamadaProcedure(ProcedureIntegracao.INSERE_ALTERA_CLIENTE);
		preparaExecucaoProcedure(clienteEndereco, stmt);
		try {
			stmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
			e.getMessage();
		}
	}

}
