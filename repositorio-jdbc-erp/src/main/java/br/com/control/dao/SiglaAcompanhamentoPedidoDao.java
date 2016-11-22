package br.com.control.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import br.com.control.integracao.TabelasIntegracaoPortal;
import br.com.control.repositorio.mappers.SiglaAcompanhamentoPedidoRowMapper;
import br.com.control.vendas.cadastro.modelo.pedido.acompanhemanto.SiglaAcompanhamentoPedido;

@Repository
@Transactional
public class SiglaAcompanhamentoPedidoDao extends JdbcDao {

	public List<SiglaAcompanhamentoPedido> listarSiglaAcomapanhamentoPedio(String sigla) {
		String sql = "SELECT * FROM " + TabelasIntegracaoPortal.CADASTRO_SIGLA_ACOMPANHAMENTO_PEDIDO.getViewERP();
		List<SiglaAcompanhamentoPedido> siglas = getJdbcTemplate().query(sql, new SiglaAcompanhamentoPedidoRowMapper());
		return siglas;
	}

}
