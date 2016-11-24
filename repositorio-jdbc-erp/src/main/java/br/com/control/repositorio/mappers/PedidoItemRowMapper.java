package br.com.control.repositorio.mappers;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import br.com.control.vendas.cadastro.modelo.pedido.PedidoItem;

public class PedidoItemRowMapper implements RowMapper<PedidoItem> {

	@Override
	public PedidoItem mapRow(ResultSet rs, int rowNum) throws SQLException {
		PedidoItem item = new PedidoItem();
		item.setCodigoBandaPrecoRecId(rs.getLong("codigo_banda_preco_rec_id"));
		item.setCodigoMotivoOcorrencia(rs.getString("codigo_motivo_ocorrencia"));
		item.setCodigoOcorrenciaRecId(rs.getLong("codigo_ocorrencia_rec_id"));
		item.setCodigoPedidoRecId(rs.getLong("codigo_pedido_rec_id"));
		item.setCodigoProdutoRecId(rs.getLong("codigo_produto_rec_id"));
		item.setCodigoRestricaoComercialRecId(rs.getLong("codigo_restricao_comercial_rec_id"));
		item.setCodigoTabelaPrecoRecId(rs.getLong("codigo_tabela_preco_rec_id"));
		item.setItemAlteradoBandaPreco(rs.getBoolean("item_alterado_banda_preco"));
		item.setPercDesconto(rs.getInt("perc_desconto"));
		item.setPermiteAlterarQtdBonificada(rs.getBoolean("permite_alterar_qtd_bonificada"));
		item.setPrecoUn(rs.getBigDecimal("preco_un"));
		item.setQtdeAvulsa(rs.getInt("qtde_avulsa"));
		item.setQtdeCaixa(rs.getInt("qtde_caixa"));
		item.setRecId(rs.getLong("rec_id"));
		item.setValorBonificado(rs.getBigDecimal("valor_bonificado"));
		item.setValorBruto(rs.getBigDecimal("valor_bruto"));
		item.setValorDesconto(rs.getBigDecimal("valor_desconto"));
		item.setValorLiquido(rs.getBigDecimal("valor_liquido"));
		item.setValorVerba(rs.getBigDecimal("valor_verba"));
		return item;
	}

}
