package br.com.control.repositorio.mappers;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;

import org.springframework.jdbc.core.RowMapper;

import br.com.control.vendas.cadastro.modelo.pedido.HistoricoPedidoCapa;

public class HistroricoPedidoCapaRowMapper implements RowMapper<HistoricoPedidoCapa> {

	@Override
	public HistoricoPedidoCapa mapRow(ResultSet rs, int rowNum) throws SQLException {
		HistoricoPedidoCapa historico = new HistoricoPedidoCapa();
		historico.setAtivo(rs.getBoolean("ativo"));
		historico.setCliente(rs.getLong("codigo_cliente_rec_id"));
		historico.setCodigoMotivoDevolucao(rs.getString("codigo_motivo_devolucao").trim());
		historico.setCondicaoPagamento(rs.getLong("codigo_condicao_pagamento_rec_id"));
		historico.setDataHoraEmissaoPedido(new Timestamp(0)); // rs.getTimestamp("data_hora_emissao_pedido"));
		historico.setDataVencimento(new Timestamp(0)); // rs.getTimestamp("data_hora_emissao_pedido"));
		historico.setDescontoFinanceiro(rs.getInt("desconto_financeiro"));
		historico.setNumeroPedido(rs.getString("numero_pedido"));
		historico.setPercentualDesconto(rs.getFloat("percentual_desconto"));
		historico.setStatusPedido(rs.getString("status_pedido"));
		historico.setTaxaFinanceira(rs.getFloat("taxa_financeiro"));
		historico.setTipoCobranca(rs.getLong("codigo_tipo_cobranca_rec_id"));
		historico.setValorDevolucao(rs.getFloat("valor_devolucao"));
		historico.setValorPedido(rs.getFloat("valor_pedido"));
		return historico;
	}

}
