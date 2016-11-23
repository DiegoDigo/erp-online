package br.com.control.repositorio.mappers;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import br.com.control.vendas.cadastro.modelo.produto.DetalheComboProduto;

public class DetalheComboProdutoRowMapper implements RowMapper<DetalheComboProduto> {

	@Override
	public DetalheComboProduto mapRow(ResultSet rs, int rowNum) throws SQLException {
		DetalheComboProduto detalhe = new DetalheComboProduto();
		detalhe.setRecId(rs.getLong("rec_id"));
		detalhe.setCodigoProdutoComboCodigo(rs.getLong("codigo_produto_combo"));
		detalhe.setCodigoProdutoCodigo(rs.getLong("codigo_produto"));
		detalhe.setQuantidade(rs.getInt("quantidade"));
		return detalhe;
	}
	
	

}
