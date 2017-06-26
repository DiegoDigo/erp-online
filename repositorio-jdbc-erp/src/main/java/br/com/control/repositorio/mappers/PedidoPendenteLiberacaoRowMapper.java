package br.com.control.repositorio.mappers;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;

import org.springframework.jdbc.core.RowMapper;

import br.com.control.portal.enums.StatusLiberacaoPedido;
import br.com.control.util.FormatacaoUtil;
import br.com.control.vendas.cadastro.modelo.pedido.PedidoPendenteLiberacao;

public class PedidoPendenteLiberacaoRowMapper  implements RowMapper<PedidoPendenteLiberacao> {

	@Override
	public PedidoPendenteLiberacao mapRow(ResultSet rs, int rowNum) throws SQLException {
		PedidoPendenteLiberacao pedidoLiberacao = new PedidoPendenteLiberacao();
		try {
			pedidoLiberacao.setAtivo(rs.getBoolean("ativo"));
			pedidoLiberacao.setCodigoClienteERP(rs.getString("codigo_cliente_rec_id"));
//			pedidoLiberacao.setCodigoMotivoDevolucao(rs.getString("codigo_motivo_devolucao"));
			pedidoLiberacao.setCondicaoPagamentoERP(String.valueOf(rs.getLong("codigo_condicao_pagamento_rec_id")));
			pedidoLiberacao.setDataHoraEmissaoPedido(FormatacaoUtil.converterStringTimeStamp(rs.getString("data_hora_emissao_pedido")));
			pedidoLiberacao.setDataVencimento(FormatacaoUtil.converterStringTimeStamp(rs.getString("data_hora_emissao_pedido")));
			pedidoLiberacao.setDescontoFinanceiro(rs.getInt("desconto_financeiro"));
			pedidoLiberacao.setNumeroPedido(rs.getString("numero_pedido"));
			pedidoLiberacao.setPercentualDesconto(rs.getFloat("percentual_desconto"));
			pedidoLiberacao.setStatusPedido(StatusLiberacaoPedido.recuperaPorNome(rs.getString("status_pedido")));
			pedidoLiberacao.setTaxaFinanceira(rs.getFloat("taxa_financeiro"));
			pedidoLiberacao.setTipoCobrancaERP(String.valueOf(rs.getLong("codigo_tipo_cobranca_rec_id")));
			pedidoLiberacao.setValorDevolucao(rs.getFloat("valor_devolucao"));
			pedidoLiberacao.setValorPedido(rs.getFloat("valor_pedido"));
			pedidoLiberacao.setCodigoVendedor(rs.getString("CODIGO_VENDEDOR") != null ? rs.getString("CODIGO_VENDEDOR").trim() : null);
			pedidoLiberacao.setNomeVendedor(rs.getString("NOME_VENDEDOR") != null ? rs.getString("NOME_VENDEDOR").trim() : null);
			pedidoLiberacao.setDescricaoBloqueio(rs.getString("DESCRICAO_BLOQUEIO") != null ? rs.getString("DESCRICAO_BLOQUEIO").trim() : null);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return pedidoLiberacao;
	}
	
	

}
