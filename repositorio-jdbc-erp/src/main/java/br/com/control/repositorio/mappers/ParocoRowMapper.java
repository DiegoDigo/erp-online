package br.com.control.repositorio.mappers;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import br.com.control.vendas.cadastro.modelo.produto.Paroco;

@Component
public class ParocoRowMapper implements RowMapper<Paroco> {

	@Override
	public Paroco mapRow(ResultSet rs, int rowNum) throws SQLException {
		Paroco paroco = new Paroco();
		paroco.setCodigoTabelaPreco(rs.getString("CODIGO_TABELA_PRECO_ERP").trim());
		paroco.setCodigoClienteErp(rs.getString("CODIGO_CLIENTE_ERP").trim());
		paroco.setCodigoEmpresaErp(rs.getString("CODIGO_EMPRESA").trim());

		return paroco;
	}

}