package br.com.control.repositorio.mappers;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import br.com.control.vendas.cadastro.modelo.pedido.PedidoSugestao;

public class PedidoSugestaoRowMapper implements RowMapper<PedidoSugestao> {

	@Override
	public PedidoSugestao mapRow(ResultSet rs, int rowNum) throws SQLException {
		PedidoSugestao sugestao = new PedidoSugestao();
		sugestao.setCodigoClienteErp(rs.getString("cod_cliente") == "0" ? null : rs.getString("cod_cliente"));
		sugestao.setCodigoCanalErp(rs.getString("cod_canal") == "00" ? null : rs.getString("cod_canal"));
		sugestao.setCodigoProdutoErp(rs.getString("cod_produto_reduzido"));
		sugestao.setQuantidadeCaixa(rs.getInt("qtd_cx"));
		sugestao.setQuantidadeAvusla(rs.getInt("qtd_av"));
		return sugestao;
	}

}
