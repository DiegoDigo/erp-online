package br.com.control.repositorio.mappers;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import br.com.control.vendas.cadastro.modelo.pedido.PedidoItemCortado;

public class PedidoItemCortadoRowMapper implements RowMapper<PedidoItemCortado> {

	@Override
	public PedidoItemCortado mapRow(ResultSet rs, int rowNum) throws SQLException {
		PedidoItemCortado itemCortado = new PedidoItemCortado();
		itemCortado.setCodigoProdutoErp(rs.getString("CODIGO_PRODUTO_ERP"));
		itemCortado.setNumeroPrepedido(rs.getString("PRE_PEDIDO"));
		itemCortado.setQuantidadeCaixa(rs.getInt("QTDS_PRODUTO"));
		itemCortado.setQuantidadeAvulsa(rs.getInt("QTD_PRODUTO"));
		itemCortado.setMotivo(rs.getString("MOTIVO"));
		itemCortado.setItem(rs.getInt("ITEM"));
		return itemCortado;
	}

}
