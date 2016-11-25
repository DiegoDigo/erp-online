package br.com.control.repositorio.mappers;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import br.com.control.vendas.cadastro.modelo.MotivoGeral;

public class MotivoGeralRowMapper implements RowMapper<MotivoGeral> {

	@Override
	public MotivoGeral mapRow(ResultSet rs, int rowNum) throws SQLException {
		MotivoGeral geral = new MotivoGeral();
		geral.setAtivo(rs.getBoolean("ativo"));
		geral.setCodigoMotivoGeral(rs.getString("condigo_motivo_geral"));
		geral.setDescricao(rs.getString("descricao"));
		geral.setDescricaoReduzida(rs.getString("descricao_reduzida"));
		geral.setInfluiVenda(rs.getBoolean("influi_venda"));
		geral.setPermiteVenda(rs.getBoolean("permite_venda"));
		geral.setRecId(rs.getLong("rec_id"));
		geral.setTipoMotivoGeral(rs.getLong("tipo_motivo_geral"));
		return geral;
	}

}
