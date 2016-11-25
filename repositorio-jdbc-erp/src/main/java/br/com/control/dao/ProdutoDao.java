package br.com.control.dao;

import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import br.com.control.vendas.cadastro.modelo.produto.Produto;

@Repository
@Transactional
public class ProdutoDao extends JdbcDao<Produto> {

}
