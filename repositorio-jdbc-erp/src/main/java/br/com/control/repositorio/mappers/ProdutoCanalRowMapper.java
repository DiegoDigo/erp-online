package br.com.control.repositorio.mappers;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import br.com.control.vendas.cadastro.modelo.produto.ProdutoCanal;

public class ProdutoCanalRowMapper implements RowMapper<ProdutoCanal> {

	@Override
	public ProdutoCanal mapRow(ResultSet rs, int rowNum) throws SQLException {
		ProdutoCanal sugestao = new ProdutoCanal();
		sugestao.setCodigoClienteErp(rs.getString("cod_cliente"));
		sugestao.setCodigoCanalErp(rs.getString("erp_canal"));
		sugestao.setCodigoProdutoErp(rs.getString("cod_produto"));
		return sugestao;
	}

}
