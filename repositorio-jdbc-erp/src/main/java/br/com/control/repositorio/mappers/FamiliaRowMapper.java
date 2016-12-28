package br.com.control.repositorio.mappers;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import br.com.control.vendas.cadastro.modelo.produto.Familia;

@Component
public class FamiliaRowMapper implements RowMapper<Familia> {

	@Override
	public Familia mapRow(ResultSet rs, int rowNum) throws SQLException {
		Familia familia = new Familia();
		familia.setCodigoErp(rs.getString("codigo_familia_produto_erp").trim());
		familia.setCodigoFameb(rs.getString("codigo_fameb").trim());
		familia.setDescricao(rs.getString("descricao").trim());
		return familia;
	}

}