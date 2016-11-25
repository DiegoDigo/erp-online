package br.com.control.repositorio.mappers;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import br.com.control.vendas.cadastro.modelo.pedido.acompanhemanto.AcompanhamentoPedidoMotivoCapa;

public class AcompanhamentoPedidoMotivoCapaRowMapper implements RowMapper<AcompanhamentoPedidoMotivoCapa> {

	@Override
	public AcompanhamentoPedidoMotivoCapa mapRow(ResultSet rs, int rowNum) throws SQLException {
		AcompanhamentoPedidoMotivoCapa motivo = new AcompanhamentoPedidoMotivoCapa();
		motivo.setCodigoAcompanhamentoPedidoRecId(rs.getLong("codigo_acompanhamento_pedido_rec_id"));
		motivo.setCodigoMotivoCapa(rs.getString("codigo_motivo_capa"));
		motivo.setRecId(rs.getLong("rec_id"));
		return motivo;
	}

}
