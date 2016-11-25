package br.com.control.repositorio.mappers;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import br.com.control.vendas.cadastro.modelo.pedido.acompanhemanto.AcompanhamentoPedidoMotivoItem;

public class AcompanhamentoPedidoMotivoItemRowMapper implements RowMapper<AcompanhamentoPedidoMotivoItem> {

	@Override
	public AcompanhamentoPedidoMotivoItem mapRow(ResultSet rs, int rowNum) throws SQLException {
		AcompanhamentoPedidoMotivoItem motivoItem = new AcompanhamentoPedidoMotivoItem();
		motivoItem.setAcompanhamentoMotivoPedidoCapaRecId(rs.getLong("codigo_acompanhamento_pedido_rec_id"));
		motivoItem.setCodigoMotivoItem(rs.getString("codigo_motivo_item"));
		motivoItem.setPedidoItemRecId(rs.getLong("codigo_item_pedido_rec_id"));
		motivoItem.setRecId(rs.getLong("rec_id"));
		return motivoItem;
	}

}
