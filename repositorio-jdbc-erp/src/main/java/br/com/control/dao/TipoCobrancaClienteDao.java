package br.com.control.dao;

import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import br.com.control.vendas.cadastro.modelo.cliente.TipoCobrancaCliente;

@Repository
@Transactional
public class TipoCobrancaClienteDao extends JdbcDao<TipoCobrancaCliente> {

}
