package br.com.control.dao;

import org.springframework.stereotype.Repository;

import br.com.control.vendas.cadastro.modelo.produto.Produto;

@Repository
public class ProdutoDao extends JdbcDao<Produto> {

}
