package br.com.control.dao;

import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import br.com.control.vendas.cadastro.modelo.cliente.ClienteEndereco;

@Repository
@Transactional
public class ClienteEnderecoDao extends JdbcDao<ClienteEndereco> {

}
