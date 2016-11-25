package br.com.control.dao;

import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import br.com.control.vendas.cadastro.modelo.vendedor.Vendedor;

@Repository
@Transactional
public class VendedorDao extends JdbcDao<Vendedor> {

}
