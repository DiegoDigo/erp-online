package br.com.control.dao;

import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import br.com.control.vendas.cadastro.modelo.pedido.PedidoItem;

@Repository
@Transactional
public class PedidoItemDao extends JdbcDao<PedidoItem> {

}
