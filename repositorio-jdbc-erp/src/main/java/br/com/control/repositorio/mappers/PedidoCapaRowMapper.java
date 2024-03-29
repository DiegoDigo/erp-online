//package br.com.control.repositorio.mappers;
//
//import java.math.BigDecimal;
//import java.sql.ResultSet;
//import java.sql.SQLException;
//
//import org.springframework.jdbc.core.RowMapper;
//
//import br.com.control.portal.mensageria.to.PedidoCapaTO;
//
//public class PedidoCapaRowMapper implements RowMapper<PedidoCapaTO> {
//
//	@Override
//	public PedidoCapaTO mapRow(ResultSet rs, int rowNum) throws SQLException {
//		PedidoCapaTO pedido = new PedidoCapaTO();
////		private int codigoEmpresa;
////		private String codigoTabelaPreco;
////		private String codigoClienteErp;
////		private String cpfCnpj;
////		private String origem;
////		private String codigoVendedor;
////		private String tipoCobranca;
////		private String condicaoPagamento;
////		private float desconto;
////		private float percTaxaFinanc;
////		private BigDecimal valorLiquido;
////		private int dataEmissao;
////		private long numeroPrePedidoGestao;
////		private int statusRetorno;
////		private String msgRetorno;
//		
//		pedido.setCodigoEmpresa(codigoEmpresa);
//		
//		pedido.setAtivo(rs.getBoolean("ativo"));
//		pedido.setCodigoClienteErp(rs.getString("codigo_cliente_rec_id"));
//		pedido.setCondicaoPagamento(rs.getString("codigo_condicao_pagamento_rec_id"));
//		pedido.setDataHoraEmissao(rs.getTimestamp("data_hora_emissao"));
//		pedido.setDataPrimeiraParcela(rs.getDate("data_primeira_parcela"));
//		pedido.setNumeroPrePedidoGestao(rs.getLong("numero_pedido_gestao"));
//		pedido.setObservacao(rs.getString("observacao"));
//		pedido.setPedidoAberto(rs.getBoolean("pedido_aberto"));
//		pedido.setPedidoBloqueado(rs.getBoolean("pedido_bloqueado"));
//		pedido.setPedidoTransmitido(rs.getBoolean("pedido_transmitido"));
//		pedido.setPercDesconto(rs.getInt("perc_desconto"));
//		pedido.setPercTaxaFinanc(rs.getFloat("perc_taxa_financ"));
//		pedido.setPermiteErpAjustarPedido(rs.getBoolean("permite_erp_ajustar_pedido"));
//		pedido.setQtdeAvulsa(rs.getInt("qtde_avulsa"));
//		pedido.setQtdeCaixa(rs.getInt("qtde_caixa"));
//		pedido.setRecId(rs.getLong("rec_id"));
//		pedido.setTipoEntrega(rs.getInt("tipo_entrega"));
//		pedido.setValorBonificado(rs.getBigDecimal("valor_bonificado"));
//		pedido.setValorBruto(rs.getBigDecimal("valor_bruto"));
//		pedido.setValorDesconto(rs.getBigDecimal("valor_desconto"));
//		pedido.setValorFinal(rs.getBigDecimal("valor_final"));
//		pedido.setValorLiquido(rs.getBigDecimal("valor_liquido"));
//		pedido.setValorVerba(rs.getBigDecimal("valor_verba"));
//		return pedido;
//	}
//
//}
