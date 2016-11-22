package br.com.control.repositorio.mappers;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import br.com.control.vendas.cadastro.modelo.vendedor.Vendedor;

public class VendedorRowMapper implements RowMapper<Vendedor>{

	@Override
	public Vendedor mapRow(ResultSet rs, int rowNum) throws SQLException {
		Vendedor vendedor = new Vendedor();
		vendedor.setRecId(rs.getLong("rec_id"));
		vendedor.setAtivo(rs.getBoolean("ativo"));
		vendedor.setCodigoVendedor(rs.getString("codigo_vendedor"));
		vendedor.setTelefone_ddd(rs.getString("telefone_ddd"));
		vendedor.setTelefone_tronco(rs.getString("telefone_tronco"));
		vendedor.setTipo(rs.getString("tipo"));
		return vendedor;
	}

}
