package br.com.control.repositorio.mappers;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import br.com.control.vendas.cadastro.modelo.RestricaoFinanceira;

public class RestricaoFinanceiraRowMapper implements RowMapper<RestricaoFinanceira> {

	@Override
	public RestricaoFinanceira mapRow(ResultSet rs, int rowNum) throws SQLException {
		RestricaoFinanceira financeira = new RestricaoFinanceira();
		financeira.setAtivo(rs.getBoolean("ativo"));
		financeira.setCodigoRestricaoFinanceira(rs.getString("codigo_restricao_financeira"));
		financeira.setCondicaoPagamento(rs.getLong("codigo_condicao_pagamento_rec_id"));
		financeira.setDesconto(rs.getFloat("desconto"));
		financeira.setDescontoMaximo(rs.getFloat("desconto_maximo"));
		financeira.setTaxa(rs.getFloat("taxa"));
		financeira.setTipoCobranca(rs.getLong("codigo_tipo_cobranca_rec_id"));
		financeira.setValorMaximoPedido(rs.getFloat("valor_maximo_pedido"));
		financeira.setValorMinimoPedido(rs.getFloat("valor_minimo_pedido"));
		return financeira;
	}

}
