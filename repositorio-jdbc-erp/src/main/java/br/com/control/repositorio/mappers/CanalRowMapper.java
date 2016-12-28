package br.com.control.repositorio.mappers;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import br.com.control.vendas.cadastro.modelo.canal.Canal;

public class CanalRowMapper implements RowMapper<Canal>{

	@Override
	public Canal mapRow(ResultSet rs, int rowNum) throws SQLException {
		Canal canal = new Canal();
		canal.setAtivo(rs.getBoolean("ativo"));
		canal.setCodigoErp(rs.getString("codigo_canal").trim());
		canal.setAutoServico(rs.getString("auto_servico").trim());
		canal.setCodigoGrupoCanal(rs.getString("codigo_grupo_canal").trim());
		canal.setDescricao(rs.getString("descricao").trim());
		canal.setDescricaoComplementar(rs.getString("DESCRICAO_COMPLEMENTAR").trim());
		canal.setDivisaoCanal(rs.getString("divisao_canal").trim());
			
		return canal;
	}

}
