package br.com.control.dao;

import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import br.com.control.vendas.cadastro.modelo.condicaoPagamento.CondicaoPagamento;

@Repository
@Transactional
public class CondicaoPagamentoDao extends JdbcDao<CondicaoPagamento> {

}
