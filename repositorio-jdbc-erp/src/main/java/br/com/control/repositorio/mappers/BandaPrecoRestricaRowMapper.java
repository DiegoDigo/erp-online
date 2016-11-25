package br.com.control.repositorio.mappers;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import br.com.control.vendas.cadastro.modelo.preco.BandaPrecoRestricao;

public class BandaPrecoRestricaRowMapper implements RowMapper<BandaPrecoRestricao> {

	@Override
	public BandaPrecoRestricao mapRow(ResultSet rs, int rowNum) throws SQLException {
		BandaPrecoRestricao banda = new BandaPrecoRestricao();
		banda.setAtivo(rs.getBoolean("ativo"));
		banda.setCodigoBandaPrecoRecId(rs.getLong("codigo_banda_preco_rec_id"));
		banda.setCodigoVendedorRecId(rs.getLong("codigo_vendedor_rec_id"));
		banda.setRecId(rs.getLong("rec_id"));
		return banda;
	}

}
