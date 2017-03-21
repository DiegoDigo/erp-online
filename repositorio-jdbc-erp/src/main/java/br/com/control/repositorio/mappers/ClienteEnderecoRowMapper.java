package br.com.control.repositorio.mappers;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import br.com.control.vendas.cadastro.modelo.cliente.ClienteEndereco;

public class ClienteEnderecoRowMapper implements RowMapper<ClienteEndereco> {

	@Override
	public ClienteEndereco mapRow(ResultSet rs, int rowNum) throws SQLException {
		ClienteEndereco endereco = new ClienteEndereco();
		endereco.setBairro(rs.getString("bairro").trim());
		endereco.setCepEndereco(rs.getString("cep_endereco").trim());
		endereco.setCodigoClienteERP(rs.getString("CODIGO_CLIENTE_ERP").trim());
		endereco.setEndereco(rs.getString("endereco").trim());
		endereco.setMunicipio(rs.getString("municipio").trim());
		endereco.setNumero(rs.getInt("numero"));
		endereco.setOrigemLogradouroERP(rs.getString("ORIGEM_LOGRADOURO_ERP").trim());
		endereco.setPontoReferencia(rs.getString("PONTO_REFERENCIA"));
//		endereco.setRecId(rs.getLong("rec_id"));
		endereco.setCodigoTipoEnderecoERP(rs.getString("SIGLA_LOGRADOURO_ERP").trim());
		endereco.setUfEndereco(rs.getString("UTF_ENDERECO").trim());
		return endereco;
	}

}
