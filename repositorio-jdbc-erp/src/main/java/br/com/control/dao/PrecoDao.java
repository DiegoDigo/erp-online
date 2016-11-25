package br.com.control.dao;

import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import br.com.control.vendas.cadastro.modelo.preco.Preco;

@Repository
@Transactional
public class PrecoDao extends JdbcDao<Preco> {

}
