package br.com.control.repositorio.mappers;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import br.com.control.vendas.cadastro.modelo.pedido.PedidoSugestao;

public class PedidoSugestaoRowMapper implements RowMapper<PedidoSugestao> {

	@Override
	public PedidoSugestao mapRow(ResultSet rs, int rowNum) throws SQLException {
		PedidoSugestao sugestao = new PedidoSugestao();
		sugestao.setClienteRecId(rs.getString("cod_cliente"));
		sugestao.setCanalRecId(rs.getString("cod_canal"));
		sugestao.setProdutoRecId(rs.getString("cod_produto_reduzido"));
		sugestao.setQuantidadeCaixa(rs.getInt("qtd_cx"));
		sugestao.setQuantidadeAvusla(rs.getInt("qtd_av"));
		return sugestao;
	}

}
