package br.com.control.repositorio.mappers;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import br.com.control.vendas.cadastro.modelo.cliente.TipoCobrancaCliente;

public class TipoCobrancaClienteRowMapper implements RowMapper<TipoCobrancaCliente> {

	@Override
	public TipoCobrancaCliente mapRow(ResultSet rs, int rowNum) throws SQLException {
		TipoCobrancaCliente cobranca = new TipoCobrancaCliente();
		cobranca.setAtivo(rs.getBoolean("ativo"));
		cobranca.setCodigoClienteERP(rs.getString("CODIGO_CLIENTE_ERP"));
		cobranca.setCodigoTipoConbrancaERP(rs.getString("CODIGO_TIPO_COBRANCA_ERP"));
		return cobranca;
	}

}
