package br.com.control.dao;

import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import br.com.control.vendas.cadastro.modelo.produto.DetalheComboProduto;

@Repository
@Transactional
public class DetalheComboProdutoDao extends JdbcDao<DetalheComboProduto>{
	
	
	
}
