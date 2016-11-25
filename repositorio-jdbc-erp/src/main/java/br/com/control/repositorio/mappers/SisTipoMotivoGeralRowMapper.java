package br.com.control.repositorio.mappers;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import br.com.control.vendas.cadastro.modelo.SisTipoMotivoGeral;

public class SisTipoMotivoGeralRowMapper implements RowMapper<SisTipoMotivoGeral> {

	@Override
	public SisTipoMotivoGeral mapRow(ResultSet rs, int rowNum) throws SQLException {
		SisTipoMotivoGeral tipoGeral = new SisTipoMotivoGeral();
		tipoGeral.setAtivo(rs.getBoolean("ativo"));
		tipoGeral.setDescricao(rs.getString("descricao"));
		tipoGeral.setRecId(rs.getLong("rec_id"));
		tipoGeral.setTipoMotivoGeral(rs.getString("Tipo_motivo_geral"));
		return tipoGeral;
	}

}
