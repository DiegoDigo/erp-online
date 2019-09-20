package br.com.control.repositorio.mappers;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import br.com.control.vendas.cadastro.modelo.condicaoPagamento.CondicaoPagamento;

public class CondicaoPagamentoRowMapper implements RowMapper<CondicaoPagamento>{

	@Override
	public CondicaoPagamento mapRow(ResultSet rs, int rowNum) throws SQLException {
		CondicaoPagamento condicaoPagamento = new CondicaoPagamento();
		condicaoPagamento.setAtivo(rs.getBoolean("ativo"));
		condicaoPagamento.setCodigoErp(rs.getString("codigo_condicao_pagamento_erp"));
		condicaoPagamento.setDescricao(rs.getString("descricao"));
		condicaoPagamento.setInformaPrimeiraParcela(rs.getBoolean("informa_primeira_parcela"));
		condicaoPagamento.setNumeroDias(rs.getInt("numero_dias"));
		condicaoPagamento.setPrazo(rs.getInt("prazo"));
		condicaoPagamento.setDisponivel(rs.getInt("DISPONIVEL") == 1);
		return condicaoPagamento;
	}

}
