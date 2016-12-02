package br.com.control.repositorio.mappers;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import br.com.control.vendas.cadastro.modelo.pedido.HistoricoPedidoItem;

public class HistoricoPedidoItemRowMapper implements RowMapper<HistoricoPedidoItem> {

	@Override
	public HistoricoPedidoItem mapRow(ResultSet rs, int rowNum) throws SQLException {
		HistoricoPedidoItem historico = new HistoricoPedidoItem();
		historico.setHistoricoPedidoCapa(rs.getLong("numero_pedido_rec_id"));
		historico.setNumeroItemPedido(rs.getString("numero_item_pedido"));
		historico.setOcorrencia(rs.getLong("codigo_ocorrencia_rec_id"));
		historico.setPreco(rs.getLong("codigo_tabela_preco_rec_id"));
		historico.setPrecoProduto(rs.getFloat("preco_produto"));
		historico.setProduto(rs.getLong("codigo_produto_rec_id"));
		historico.setQuantidadeAvulsa(rs.getInt("quantidade_avulsa"));
		historico.setQuantidadeCaixa(rs.getInt("quantidade_caixa"));
		historico.setRecId(rs.getLong("rec_id"));
		return historico;
	}

}