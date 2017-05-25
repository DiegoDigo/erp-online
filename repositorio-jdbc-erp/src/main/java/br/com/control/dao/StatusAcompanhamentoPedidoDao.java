package br.com.control.dao;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

import br.com.control.portal.integracao.TabelasIntegracao;
import br.com.control.repositorio.mappers.SiglaAcompanhamentoPedidoRowMapper;
import br.com.control.vendas.cadastro.modelo.pedido.acompanhemanto.StatusAcompanhamentoPedido;

@Repository
@Transactional
public class StatusAcompanhamentoPedidoDao extends JdbcDao<StatusAcompanhamentoPedido> {

	@Value("${schema_database}")
	private String schemaDatabase;
	
	public StatusAcompanhamentoPedido recuperaStatusPedido(String numeroPrePedidoErp) {
		String declare = "DECLARE set varchar @PRE_PEDIDO = "+numeroPrePedidoErp;
		getJdbcTemplate().update(declare);
		
		String sql = "select * from " + schemaDatabase+"."+TabelasIntegracao.CADASTRO_SIGLA_ACOMPANHAMENTO_PEDIDO.getViewERP();
		StatusAcompanhamentoPedido status = getJdbcTemplate().queryForObject(sql, new SiglaAcompanhamentoPedidoRowMapper());
		return status;
	}
	
}
