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
		cobranca.setCodigoClienteRecId(rs.getLong("codigo_cliente_rec_id"));
		cobranca.setCodigoTipoCobrancaRecId(rs.getLong("Codigo_tipo_Cobranca_rec_id"));
		cobranca.setRecId(rs.getLong("rec_id"));
		return cobranca;
	}

}
