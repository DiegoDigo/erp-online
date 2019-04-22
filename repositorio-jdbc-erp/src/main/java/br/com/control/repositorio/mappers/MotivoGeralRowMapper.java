package br.com.control.repositorio.mappers;

import br.com.control.vendas.cadastro.modelo.MotivoGeral;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class MotivoGeralRowMapper implements RowMapper<MotivoGeral> {

	@Override
	public MotivoGeral mapRow(ResultSet rs, int rowNum) throws SQLException {
		MotivoGeral geral = new MotivoGeral();
		geral.setAtivo(rs.getBoolean("ativo"));
		geral.setCodigoMotivoGeralERP(rs.getString("codigo_motivo_geral"));
		geral.setDescricao(rs.getString("descricao").trim());
		geral.setDescricaoReduzida(rs.getString("descricao_reduzida"));
		geral.setInfluiVenda(rs.getBoolean("INFUI_VENDA"));
		geral.setPermiteVenda(rs.getBoolean("permite_venda"));
//		geral.setRecId(rs.getLong("rec_id"));
		geral.setCodigoTipoMotivoGeralERP(rs.getString("tipo_motivo_geral_rec_id").trim());
		return geral;
	}

}
