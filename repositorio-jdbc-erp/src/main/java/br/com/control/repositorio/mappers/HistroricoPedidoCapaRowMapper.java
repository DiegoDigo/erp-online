package br.com.control.repositorio.mappers;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;

import org.springframework.jdbc.core.RowMapper;

import br.com.control.util.FormatacaoUtil;
import br.com.control.vendas.cadastro.modelo.pedido.HistoricoPedidoCapa;

public class HistroricoPedidoCapaRowMapper implements RowMapper<HistoricoPedidoCapa> {

	@Override
	public HistoricoPedidoCapa mapRow(ResultSet rs, int rowNum) throws SQLException {
		HistoricoPedidoCapa historico = new HistoricoPedidoCapa();
		try {		
			historico.setAtivo(rs.getBoolean("ativo"));
			historico.setCodigoClienteErp(rs.getString("codigo_cliente_rec_id"));
			historico.setCnpjCpf(rs.getString("CNPJ_CPF").trim());
			historico.setRazaoSocial(rs.getString("RAZAO_CLIENTE").trim());
			historico.setDescricaoCondicaoPagamento(rs.getString("DESCRICAO_CONDICAO_PAGAMENTO").trim());
			historico.setDescricaoTipoCobranca(rs.getString("DESCRICAO_TIPO_COBRANCA").trim());
			historico.setCodigoMotivoDevolucao(rs.getString("codigo_motivo_devolucao").trim());
			historico.setCondicaoPagamentoErp(rs.getString("codigo_condicao_pagamento_rec_id"));	
			historico.setDataHoraEmissaoPedido(FormatacaoUtil.converterStringTimeStamp(rs.getString("data_hora_emissao_pedido")));
			historico.setDataVencimento(FormatacaoUtil.converterStringTimeStamp(rs.getString("data_vencimento").equals("0") ? rs.getString("data_hora_emissao_pedido") : rs.getString("data_vencimento")));
			historico.setDescontoFinanceiro(rs.getInt("desconto_financeiro"));
			historico.setNumeroPedido(rs.getString("numero_pedido"));
			historico.setPercentualDesconto(rs.getFloat("percentual_desconto"));
			historico.setStatusPedido(rs.getString("status_pedido"));
			historico.setTaxaFinanceira(rs.getFloat("taxa_financeiro"));
			historico.setTipoCobrancaErp(rs.getString("codigo_tipo_cobranca_rec_id"));
			historico.setValorDevolucao(rs.getFloat("valor_devolucao"));
			historico.setValorPedido(rs.getFloat("valor_pedido"));
			historico.setSerieFiscal(rs.getString("SFISCAL"));
			historico.setNotaFiscalInicial(rs.getString("NFISCAL_INI"));
			historico.setNotaFiscalFinal(rs.getString("NFISCAL_ULT"));
			historico.setNumeroPedidoERPReprogramado(rs.getString("numero_pedido_erp_reprogramado"));
			
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return historico;
	}
	
	
	

}
