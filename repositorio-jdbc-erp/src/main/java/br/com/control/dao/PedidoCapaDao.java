package br.com.control.dao;

import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import br.com.control.vendas.cadastro.modelo.pedido.PedidoCapa;

@Repository
@Transactional
public class PedidoCapaDao extends JdbcDao<PedidoCapa> {

}
