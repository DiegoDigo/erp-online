package br.com.control.repositorio.mappers;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import br.com.control.vendas.cadastro.modelo.pedido.acompanhemanto.StatusAcompanhamentoPedido;

public class SiglaAcompanhamentoPedidoRowMapper implements RowMapper<StatusAcompanhamentoPedido>{

	@Override
	public StatusAcompanhamentoPedido mapRow(ResultSet rs, int rowNum) throws SQLException {
		
		StatusAcompanhamentoPedido siglaAcompanhamentoPedido = new StatusAcompanhamentoPedido();
		siglaAcompanhamentoPedido.setNumeroPedidoErp(rs.getString("NUMERO_PEDIDO_GESTAO"));
		siglaAcompanhamentoPedido.setSituacaoPedidoErp(rs.getString("SITUACAO_PEDIDO_GESTAO"));
		siglaAcompanhamentoPedido.setNumeroPrePedidoErp(rs.getString("NUMERO_PRE_PEDIDO_GESTAO").trim());
		siglaAcompanhamentoPedido.setNumeroRomaneio(rs.getString("NUMERO_ROMANEIO"));
		siglaAcompanhamentoPedido.setSituacaoRomaneio(rs.getString("SITUACAO_ROMANEIO"));
		siglaAcompanhamentoPedido.setSerieNFE(rs.getString("SERIE_NFISCAL"));
		siglaAcompanhamentoPedido.setNumeroNFE(rs.getString("NUMERO_NFISCAL"));		
		siglaAcompanhamentoPedido.setCodigoBloqueioPedido(rs.getString("CODIGO_BLOQ_PEDIDO"));		
		
		return siglaAcompanhamentoPedido;
	}

	 

}
