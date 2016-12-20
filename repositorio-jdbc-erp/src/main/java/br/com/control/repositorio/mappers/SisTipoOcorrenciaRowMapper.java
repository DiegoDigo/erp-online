package br.com.control.repositorio.mappers;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import br.com.control.vendas.cadastro.modelo.ocorrencia.SisTipoOCorrencia;

public class SisTipoOcorrenciaRowMapper implements RowMapper<SisTipoOCorrencia> {

	@Override
	public SisTipoOCorrencia mapRow(ResultSet rs, int rowNum) throws SQLException {
		SisTipoOCorrencia tipoOCorrencia = new SisTipoOCorrencia();
//		tipoOCorrencia.setRecId(rs.getLong("rec_id"));
		tipoOCorrencia.setAtivo(rs.getBoolean("ativo"));
		tipoOCorrencia.setDescricao(rs.getString("descricao"));
		tipoOCorrencia.setTipoOcorrencia(rs.getString("tipo_ocorrencia"));
		return tipoOCorrencia;
	}

}
