package br.com.control.dao;

import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import br.com.control.vendas.cadastro.modelo.pedido.acompanhemanto.StatusAcompanhamentoPedido;

@Repository
@Transactional
public class SiglaAcompanhamentoPedidoDao extends JdbcDao<StatusAcompanhamentoPedido> {

}
