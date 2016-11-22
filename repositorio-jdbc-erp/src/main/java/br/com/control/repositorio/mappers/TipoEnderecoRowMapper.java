package br.com.control.repositorio.mappers;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import br.com.control.vendas.cadastro.modelo.cliente.TipoEndereco;

public class TipoEnderecoRowMapper implements RowMapper<TipoEndereco> {

	@Override
	public TipoEndereco mapRow(ResultSet rs, int rowNum) throws SQLException {
		TipoEndereco endereco = new TipoEndereco();
		endereco.setAtivo(rs.getBoolean("ativo"));
		endereco.setDescricaoLogradouro(rs.getString("descricao_logradouro"));
		endereco.setRecId(rs.getLong("rec_id"));
		endereco.setSiglaLogradouro(rs.getString("sigla_logradouro"));
		endereco.setMatriculaRecId(rs.getLong("matricula_rec_id"));		
		return endereco;
	}

}
