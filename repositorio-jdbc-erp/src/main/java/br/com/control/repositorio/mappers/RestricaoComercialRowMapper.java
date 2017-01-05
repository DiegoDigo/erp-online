package br.com.control.repositorio.mappers;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import br.com.control.vendas.cadastro.modelo.RestricaoComercial;

public class RestricaoComercialRowMapper implements RowMapper<RestricaoComercial> {

	@Override
	public RestricaoComercial mapRow(ResultSet rs, int rowNum) throws SQLException {
		RestricaoComercial restricao = new RestricaoComercial();
		restricao.setAtivo(rs.getBoolean("ativo"));
		restricao.setCodigoCanalVendaERP(rs.getString("codigo_canal_ERP"));
		restricao.setCodigoClienteERP(rs.getString("codigo_cliente_ERP"));
		restricao.setCodigoGrupoCanalERP(rs.getString("codigo_grupo_canal_ERP"));
		restricao.setCodigoRestricaoComercialERP(rs.getString("codigo_restricao_comercial_ERP"));
		restricao.setCodigoCondicaoPagamentoERP(rs.getString("codigo_condicao_pagamento_ERP"));
		restricao.setDivisaoCanal(rs.getString("divisao_canal"));
//		restricao.setRecId(rs.getLong("rec_id"));
		restricao.setCodigoTipoCobrancaERP(rs.getString("codigo_tipo_cobranca_ERP"));
		restricao.setValorMinimoPedido(rs.getInt("valor_minimo_pedido"));
		return restricao;
	}

}
