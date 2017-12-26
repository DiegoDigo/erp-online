package br.com.control.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import br.com.control.portal.integracao.TabelasIntegracao;
import br.com.control.portal.mensageria.to.JControlConsumerTO;
import br.com.control.repositorio.mappers.StatusAcompanhamentoPedidoRowMapper;
import br.com.control.vendas.cadastro.modelo.pedido.acompanhemanto.StatusAcompanhamentoPedido;

@Repository
@Transactional
public class AcompanhamentoPedidoDao extends JdbcDao<StatusAcompanhamentoPedido> {
	
	public List<StatusAcompanhamentoPedido> listaAcompanhamentoPedido() {
		String declare = "DECLARE set bigint @codigopedido = 0";
		getJdbcTemplate().update(declare);
		return selectViewSemWhere(TabelasIntegracao.STATUS_ACOMPANHAMENTO_PEDIDO, new StatusAcompanhamentoPedidoRowMapper());
	}

	public StatusAcompanhamentoPedido recuperaAcompanhamentoPedido(String numeroPedido) {
		String declare = "DECLARE set bigint @codigopedido = "+numeroPedido+";";
		getJdbcTemplate().update(declare);
		List<StatusAcompanhamentoPedido> retorno = selectViewSemWhere(TabelasIntegracao.STATUS_ACOMPANHAMENTO_PEDIDO, new StatusAcompanhamentoPedidoRowMapper());
		if (retorno != null && !retorno.isEmpty()) {
			return retorno.get(0);
		}
		return null;
	}
	
	public StatusAcompanhamentoPedido recuperaAcompanhamentoPedido(JControlConsumerTO jcontrolConsumerTO) {
		String declare = "DECLARE set bigint @"+jcontrolConsumerTO.getNomeDoId()+"="+jcontrolConsumerTO.getValorDoId()+";";
		getJdbcTemplate().update(declare);
		List<StatusAcompanhamentoPedido> retorno = selectViewSemWhere(jcontrolConsumerTO.getNomeDaView(), new StatusAcompanhamentoPedidoRowMapper());
		if (retorno != null && !retorno.isEmpty()) {
			return retorno.get(0);
		}
		return null;
	}
}
