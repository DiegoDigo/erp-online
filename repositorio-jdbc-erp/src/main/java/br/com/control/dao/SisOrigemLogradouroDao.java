package br.com.control.dao;

import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import br.com.control.vendas.cadastro.modelo.cliente.SisOrigemLogradouro;

@Repository
@Transactional
public class SisOrigemLogradouroDao extends JdbcDao<SisOrigemLogradouro> {

}
