package br.com.control.repositorio.mappers;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import br.com.control.vendas.cadastro.modelo.pedido.PedidoSugestao;

public class PedidoSugestaoRowMapper implements RowMapper<PedidoSugestao> {

	@Override
	public PedidoSugestao mapRow(ResultSet rs, int rowNum) throws SQLException {
		PedidoSugestao sugestao = new PedidoSugestao();
		sugestao.setRecId(rs.getLong("rec_id"));
		sugestao.setClienteRecId(rs.getLong("cod_cliente"));
		sugestao.setCanalRecId(rs.getLong("cod_canal"));
		sugestao.setProdutoRecId(rs.getLong("cod_produto_sugestao"));
		sugestao.setQuantidadeCaixa(rs.getInt("qtd_cx"));
		sugestao.setQuantidadeAvusla(rs.getInt("qtd_av"));

		return sugestao;
	}

}
