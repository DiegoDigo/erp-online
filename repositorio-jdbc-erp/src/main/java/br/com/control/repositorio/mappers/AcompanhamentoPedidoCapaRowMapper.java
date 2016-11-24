package br.com.control.repositorio.mappers;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import br.com.control.vendas.cadastro.modelo.pedido.acompanhemanto.AcompanhamentoPedidoCapa;

public class AcompanhamentoPedidoCapaRowMapper implements RowMapper<AcompanhamentoPedidoCapa> {

	@Override
	public AcompanhamentoPedidoCapa mapRow(ResultSet rs, int rowNum) throws SQLException {
		AcompanhamentoPedidoCapa acompanhamento = new AcompanhamentoPedidoCapa();
		acompanhamento.setCodigoPedidoRecId(rs.getLong("codigo_pedido_rec_id"));
		acompanhamento.setDataHoraAlteracaiStatus(rs.getTimestamp("data_hora_alteracao_status"));
		acompanhamento.setNivelAnaliseRecId(rs.getLong("nivel_analise_rec_id"));
		acompanhamento.setNumeroPedidoGestao(rs.getString("numero_pedido_gestao"));
		acompanhamento.setRecId(rs.getLong("rec_id"));
		return acompanhamento;
	}

}
