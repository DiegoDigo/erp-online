package br.com.control.repositorio.mappers;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import br.com.control.vendas.cadastro.modelo.vendedor.Vendedor;

public class VendedorRowMapper implements RowMapper<Vendedor> {

	@Override
	public Vendedor mapRow(ResultSet rs, int rowNum) throws SQLException {
		Vendedor vendedor = new Vendedor();
		vendedor.setAtivo(rs.getBoolean("ativo"));
		vendedor.setCodigoVendedor(rs.getString("codigo_vendedor_erp"));
		vendedor.setTelefoneDdd(rs.getString("TELEFONE_DD").trim());
		vendedor.setTelefoneTronco(rs.getString("TELEFONE_TRONCO"));
		vendedor.setTipo(rs.getString("tipo"));
		vendedor.setNome(rs.getString("nome"));
		return vendedor;
	}

}
