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
		restricao.setCanalVenda(rs.getLong("codigo_canal_rec_id"));
		restricao.setCliente(rs.getLong("codigo_cliente_rec_id"));
		restricao.setCodigoGrupoCanal(rs.getString("codigo_grupo_canal"));
		restricao.setCodigoRestricaoComercial(rs.getString("codigo_restricao_comercial"));
		restricao.setCondicaoPagamento(rs.getLong("codigo_condicao_pagamento_rec_id"));
		restricao.setDivisaoCanal(rs.getString("divisao_canal"));
		restricao.setRecId(rs.getLong("rec_id"));
		restricao.setTipoCobranca(rs.getLong("codigo_tipo_cobranca_rec_id"));
		restricao.setValorMinimoPedido(rs.getInt("valor_minimo_pedido"));
		return restricao;
	}

}
