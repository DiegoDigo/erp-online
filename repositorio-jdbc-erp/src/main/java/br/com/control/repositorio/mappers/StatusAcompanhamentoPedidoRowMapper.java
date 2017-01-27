package br.com.control.repositorio.mappers;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import br.com.control.vendas.cadastro.modelo.pedido.acompanhemanto.StatusAcompanhamentoPedido;

public class StatusAcompanhamentoPedidoRowMapper implements RowMapper<StatusAcompanhamentoPedido> {

	@Override
	public StatusAcompanhamentoPedido mapRow(ResultSet rs, int rowNum) throws SQLException {
		StatusAcompanhamentoPedido acompanhamento = new StatusAcompanhamentoPedido();
		acompanhamento.setNumeroPedidoErp(rs.getString("NUMERO_PEDIDO_GESTAO"));
		acompanhamento.setSituacaoPedidoErp(rs.getString("SITUACAO_PEDIDO_GESTAO"));
		acompanhamento.setNumeroPrePedidoErp(rs.getString("NUMERO_PRE_PEDIDO_GESTAO"));
		acompanhamento.setNumeroRomaneio(rs.getString("NUMERO_ROMANEIO"));
		acompanhamento.setSituacaoRomaneio(rs.getString("SITUACAO_ROMANEIO"));
		acompanhamento.setSerieNFE(rs.getString("SERIE_NFISCAL"));
		acompanhamento.setNumeroNFE(rs.getString("NUMERO_NFISCAL"));
		acompanhamento.setCodigoBloqueioPedido(rs.getString("CODIGO_BLOQ_PEDIDO"));
		return acompanhamento;
	}

}
