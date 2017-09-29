package br.com.control.repositorio.mappers;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import br.com.control.portal.enums.StatusLiberacaoPedido;
import br.com.control.vendas.cadastro.modelo.pedido.PedidoLiberado;

public class PedidoLiberadoRowMapper implements RowMapper<PedidoLiberado> {

	@Override
	public PedidoLiberado mapRow(ResultSet rs, int rowNum) throws SQLException {
		PedidoLiberado pedido = new PedidoLiberado();
		pedido.setCodigoPedidoRecID(rs.getLong("codigo_pedido_rec_id"));
		pedido.setDataHoraLiberacao(rs.getTimestamp("data_hora_liberacao"));
		pedido.setStatusPedido(StatusLiberacaoPedido.recuperaPorNome(rs.getString("status_pedido")));
		pedido.setRecId(rs.getLong("rec_id"));
		return pedido;
	}

}
