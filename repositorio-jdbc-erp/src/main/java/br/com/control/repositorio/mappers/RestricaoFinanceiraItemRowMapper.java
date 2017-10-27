package br.com.control.repositorio.mappers;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import br.com.control.vendas.cadastro.modelo.RestricaoFinanceiraItem;

public class RestricaoFinanceiraItemRowMapper implements RowMapper<RestricaoFinanceiraItem> {

	@Override
	public RestricaoFinanceiraItem mapRow(ResultSet rs, int rowNum) throws SQLException {
		RestricaoFinanceiraItem item = new RestricaoFinanceiraItem();
		item.setCodigoTabelaPreco(rs.getString("codigo_tabela_preco"));
		item.setRestricaoFinanceira(rs.getLong("codigo_retricao_financeira"));
		return item;
	}

}
