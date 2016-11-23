package br.com.control.dao;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import br.com.control.vendas.cadastro.modelo.condicaoPagamento.CondicaoPagamento;

@Repository
@Transactional
public class CondicaoPagamentoDao extends JdbcDao<CondicaoPagamento>{

		
}
