package br.com.control.repositorio.mappers;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import br.com.control.vendas.cadastro.modelo.produto.DetalheComboProduto;

public class DetalheComboProdutoRowMapper implements RowMapper<DetalheComboProduto> {

	@Override
	public DetalheComboProduto mapRow(ResultSet rs, int rowNum) throws SQLException {
		DetalheComboProduto detalhe = new DetalheComboProduto();
//		detalhe.setRecId(rs.getLong("rec_id"));
		detalhe.setCodigoProdutoComboERP(rs.getString("CODIGO_PRODUTO_COMBO_ERP"));
		detalhe.setCodigoProdutoERP(rs.getString("CODIGO_PRODUTO_ERP"));
		detalhe.setQuantidadeCaixa(rs.getInt("quantidade_caixa"));
		detalhe.setQuantidadeAvulso(rs.getInt("quantidade_avulso"));
		return detalhe;
	}
	
	

}
