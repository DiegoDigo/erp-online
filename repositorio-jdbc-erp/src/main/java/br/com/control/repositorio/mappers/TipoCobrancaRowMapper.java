package br.com.control.repositorio.mappers;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import br.com.control.vendas.cadastro.modelo.tipoCobranca.TipoCobranca;

public class TipoCobrancaRowMapper implements RowMapper<TipoCobranca> {

	@Override
	public TipoCobranca mapRow(ResultSet rs, int rowNum) throws SQLException {
		TipoCobranca tipoCobranca = new TipoCobranca();
		tipoCobranca.setCodigoErp(rs.getString("codigo_tipo_cobranca_erp"));
		tipoCobranca.setDescricao(rs.getString("descricao"));
		tipoCobranca.setPrazo(rs.getInt("prazo"));
		tipoCobranca.setRed(rs.getInt("red"));
		tipoCobranca.setRedF(rs.getInt("red_f"));
		tipoCobranca.setAtivo(rs.getBoolean("ativo"));
		return tipoCobranca;
	}

}
