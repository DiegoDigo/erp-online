package br.com.control.repositorio.mappers;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import br.com.control.vendas.cadastro.modelo.pedido.acompanhemanto.SiglaAcompanhamentoPedido;

public class SiglaAcompanhamentoPedidoRowMapper implements RowMapper<SiglaAcompanhamentoPedido>{

	@Override
	public SiglaAcompanhamentoPedido mapRow(ResultSet rs, int rowNum) throws SQLException {
		
		SiglaAcompanhamentoPedido siglaAcompanhamentoPedido = new SiglaAcompanhamentoPedido();
		siglaAcompanhamentoPedido.setRecId(rs.getLong("rec_id"));
		siglaAcompanhamentoPedido.setAtivo(rs.getBoolean("ativo"));
		siglaAcompanhamentoPedido.setDescricaoStatus(rs.getString("descricao_status").trim());
		siglaAcompanhamentoPedido.setImpedimento(rs.getString("impedimento".trim()));
		siglaAcompanhamentoPedido.setNivelAnalise(rs.getString("nivel_analise").trim());
		siglaAcompanhamentoPedido.setPermiteReativarPedido(rs.getBoolean("permite_reativar_pedido"));
		siglaAcompanhamentoPedido.setSiglaStatus(rs.getString("sigla_status").trim());		
		
		return siglaAcompanhamentoPedido;
	}

	 

}
