package br.com.control.repositorio.mappers;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import br.com.control.vendas.cadastro.modelo.pedido.PedidoRecusado;

public class PedidoRecusadoRowMapper implements RowMapper<PedidoRecusado> {

	@Override
	public PedidoRecusado mapRow(ResultSet rs, int rowNum) throws SQLException {
		PedidoRecusado pedido = new PedidoRecusado();
		pedido.setCodigoPedidoRecId(rs.getLong("codigo_pedido_rec_id"));
		pedido.setDataHoraRecusa(rs.getTimestamp("data_hora_recusa"));
		pedido.setRecId(rs.getLong("rec_id"));
		return pedido;
	}

}
