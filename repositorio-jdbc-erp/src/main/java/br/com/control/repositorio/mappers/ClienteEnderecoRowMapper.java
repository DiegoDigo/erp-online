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
		endereco.setCliente(rs.getLong("codigo_cliente_rec_id"));
		endereco.setEndereco(rs.getString("endereco"));
		endereco.setMunicipio(rs.getString("municipio"));
		endereco.setNumero(rs.getInt("numero"));
		endereco.setOrigemLogradouro(rs.getLong("ogirem_logradouro_rec_id"));
		endereco.setPontoReferencia(rs.getString("ponto_referencia"));
		endereco.setRecId(rs.getLong("rec_id"));
		endereco.setTipoEndereco(rs.getLong("sigla_logradouro_rec_id"));
		endereco.setUfEndereco(rs.getString("uf_endereco"));
		return endereco;
	}

}
