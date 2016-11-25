package br.com.control.dao;

import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import br.com.control.vendas.cadastro.modelo.pedido.acompanhemanto.AcompanhamentoPedidoMotivoCapa;

@Repository
@Transactional
public class AcompanhamentoPedidoMotivoCapaDao extends JdbcDao<AcompanhamentoPedidoMotivoCapa> {

}
