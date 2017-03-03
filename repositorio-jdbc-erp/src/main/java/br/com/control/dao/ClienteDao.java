package br.com.control.dao;

import java.sql.CallableStatement;
import java.sql.SQLException;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import br.com.control.portal.integracao.ProcedureIntegracao;
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

	public Cliente recuperarCliente(int codigoClienteErp) {
		String declare = "DECLARE SET INT @CODIGO_CLIENTE = " + codigoClienteErp;
		getJdbcTemplate().update(declare);
		return selectViewSingle(TabelasIntegracao.CADASTRO_CLIENTE, new ClienteRowMapper());
	}

	@Transactional
	public void salvar(Cliente cliente) {
		CallableStatement stmt = preparaChamadaProcedure(ProcedureIntegracao.INSERT_PRE_CADASTRO_CLIENTE);
		preparaExecucaoProcedure(cliente, stmt);
		try {
			stmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
			e.getMessage();
		}
	}
	
	@Transactional
	public void alterarDadosCadastrais(Cliente cliente) {
		CallableStatement stmt = preparaChamadaProcedure(ProcedureIntegracao.ALTERACAO_PRE_CADASTRO_CLIENTE);
		preparaExecucaoProcedure(cliente, stmt);
		try {
			stmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
			e.getMessage();
		}
	}

	// public AcompanhamentoPedidoTO salvarCapaPedido(PedidoCapaTO pedido) {
	// CallableStatement stmt =
	// preparaChamadaProcedure(ProcedureIntegracao.INSERT_PEDIDO_CAPA);
	// preparaExecucaoProcedure(pedido, stmt);
	//
	// try {
	// AcompanhamentoPedidoTO pedidoTO = new AcompanhamentoPedidoTO();
	// pedidoTO.setRecId(pedido.getRecId());
	// pedidoTO.setNumeroPedidoGestao(formatacaoUtil.formataData(pedido.getDataHoraEmissao(),
	// "yyyyMMdd")
	// + completaComZeros(String.valueOf(stmt.getLong(12))));
	//
	// // FIXME: rever o valor do status de acompanhamento de pedido. Está
	// // 1 fake abaixo
	// pedidoTO.setStatusAcompanhamentoPedido(1L);
	// stmt.close();
	// return pedidoTO;
	// } catch (SQLException e) {
	// e.printStackTrace();
	// throw new RuntimeException(e);
	// } finally {
	// closeConnection();
	// }
	//
	// }

}
