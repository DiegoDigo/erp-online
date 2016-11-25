package br.com.control.repositorio.mappers;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import br.com.control.vendas.cadastro.modelo.RestricaoComercialItem;

public class RestricaoComercialItemRowMapper implements RowMapper<RestricaoComercialItem> {

	@Override
	public RestricaoComercialItem mapRow(ResultSet rs, int rowNum) throws SQLException {
		RestricaoComercialItem restricao = new RestricaoComercialItem();
		restricao.setCodigoRetricaoComercialRecId(rs.getLong("codigo_retricao_comercial_rec_id"));
		restricao.setCodigoTebelaPreco(rs.getString("codigo_tabela_preco"));
		restricao.setRecId(rs.getLong("rec_id"));
		return restricao;
	}

}
