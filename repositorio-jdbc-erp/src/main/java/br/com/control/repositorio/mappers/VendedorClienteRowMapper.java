package br.com.control.repositorio.mappers;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import br.com.control.vendas.cadastro.modelo.vendedor.VendedorCliente;

public class VendedorClienteRowMapper implements RowMapper<VendedorCliente> {

	@Override
	public VendedorCliente mapRow(ResultSet rs, int rowNum) throws SQLException {
		VendedorCliente vendedor = new VendedorCliente();
		vendedor.setAtivo(rs.getBoolean("ativo"));
		vendedor.setCodigoClienteRecId(rs.getLong("codigo_cliente_rec_id"));
		vendedor.setCodigoVendedorRecID(rs.getLong("codigo_vendedor_rec_id"));
		vendedor.setRecId(rs.getLong("rec_id"));
		return vendedor;
	}

}
