package br.com.control.repositorio.mappers;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import br.com.control.vendas.cadastro.modelo.pedido.PedidoBloqueados;

public class PedidoBloqueadosRowMapper  implements RowMapper<PedidoBloqueados> {

	@Override
	public PedidoBloqueados mapRow(ResultSet rs, int rowNum) throws SQLException {
			return null;
	}
	
	

}
