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
		vendedor.setCodigoClienteERP(rs.getString("CODIGO_CLIENTE_ERP").trim());
		vendedor.setVendedor(rs.getInt("VENDEDOR"));
		vendedor.setCodigoVendedorERP(rs.getString("CODIGO_VENDEDOR_ERP").trim());
		return vendedor;
	}

}
