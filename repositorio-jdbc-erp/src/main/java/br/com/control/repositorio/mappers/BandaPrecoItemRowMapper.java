package br.com.control.repositorio.mappers;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import br.com.control.vendas.cadastro.modelo.preco.BandaPrecoItem;

public class BandaPrecoItemRowMapper implements RowMapper<BandaPrecoItem> {

	@Override
	public BandaPrecoItem mapRow(ResultSet rs, int rowNum) throws SQLException {
		BandaPrecoItem banda = new BandaPrecoItem();
		banda.setCodigoBandaPrecoRecId(rs.getLong("codigo_banda_preco_rec_id"));
		banda.setCodigoTabelaPreco(rs.getString("codigo_tabela_preco "));
		banda.setDesconto_maximo(rs.getFloat("desconto_maximo"));
		banda.setQuantidade(rs.getInt("quantidade"));
		banda.setRecId(rs.getLong("rec_id"));
		return banda;
	}

}
