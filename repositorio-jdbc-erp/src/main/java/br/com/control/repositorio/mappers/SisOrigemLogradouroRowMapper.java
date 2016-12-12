package br.com.control.repositorio.mappers;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import br.com.control.vendas.cadastro.modelo.cliente.SisOrigemLogradouro;

public class SisOrigemLogradouroRowMapper implements RowMapper<SisOrigemLogradouro> {

	@Override
	public SisOrigemLogradouro mapRow(ResultSet rs, int rowNum) throws SQLException {
		SisOrigemLogradouro sis = new SisOrigemLogradouro();
		sis.setAtivo(rs.getBoolean("ativo"));
		sis.setDescricao(rs.getString("descricao"));
		sis.setOrigemLogradouro(rs.getString("origem_logradouro"));
		sis.setRecId(rs.getLong("rec_id"));
		return sis;
	}

}
