package br.com.control.autenticacao.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import br.com.control.vendas.cadastro.modelo.cliente.Cliente;

public class ClienteRowMapper implements RowMapper<Cliente> {

    @Override
    public Cliente mapRow(ResultSet rs, int rowNum) throws SQLException {

    	Cliente cliente = new Cliente();

    	//FIXME: fazer aqui o parse dos atributos do cliente
    	
        return cliente;
    }

}