package br.com.control.repositorio.mappers;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import br.com.control.vendas.cadastro.modelo.cliente.ClienteEndereco;

public class ClienteEnderecoRowMapper implements RowMapper<ClienteEndereco> {

	@Override
	public ClienteEndereco mapRow(ResultSet rs, int rowNum) throws SQLException {
		ClienteEndereco endereco = new ClienteEndereco();
		endereco.setBairro(rs.getString("bairro"));
		endereco.setCepEndereco(rs.getString("cep_endereco"));
		endereco.setCodigoClienteERP(rs.getString("CODIGO_CLIENTE_ERP"));
		endereco.setEndereco(rs.getString("endereco"));
		endereco.setMunicipio(rs.getString("municipio"));
		endereco.setNumero(rs.getInt("numero"));
		endereco.setOrigemLogradouroERP(rs.getString("ORIGEM_LOGRADOURO_ERP"));
		endereco.setPontoReferencia(rs.getString("PONTO_REFERENCIA"));
//		endereco.setRecId(rs.getLong("rec_id"));
		endereco.setCodigoTipoEnderecoERP(rs.getString("SIGLA_LOGRADOURO_ERP"));
		endereco.setUfEndereco(rs.getString("UTF_ENDERECO"));
		return endereco;
	}

}
