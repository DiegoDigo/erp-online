package br.com.control.repositorio.mappers;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import br.com.control.vendas.cadastro.modelo.pedido.HistoricoPedidoItem;

public class HistoricoPedidoItemRowMapper implements RowMapper<HistoricoPedidoItem> {

	@Override
	public HistoricoPedidoItem mapRow(ResultSet rs, int rowNum) throws SQLException {
		HistoricoPedidoItem historico = new HistoricoPedidoItem();
		historico.setHistoricoPedidoCapaErp(rs.getString("numero_pedido_rec_id"));
		historico.setNumeroItemPedido(rs.getString("numero_item_pedido"));
		historico.setCodigoOcorrenciaErp(rs.getString("codigo_ocorrencia_rec_id"));
		historico.setCodigoPrecoErp(rs.getString("codigo_tabela_preco_rec_id"));
		historico.setPrecoItemTotal(rs.getFloat("preco_item_total"));
		historico.setCodigoProdutoErp(rs.getString("codigo_produto_rec_id"));
		historico.setQuantidadeAvulsa(rs.getInt("quantidade_avulsa"));
		historico.setQuantidadeCaixa(rs.getInt("quantidade_caixa"));
		historico.setDescricaoProduto(rs.getString("descricao_produto").trim());
		historico.setDescricaoOcorrencia(rs.getString("descricao_ocorrencia").trim());
		return historico;
	}

}
