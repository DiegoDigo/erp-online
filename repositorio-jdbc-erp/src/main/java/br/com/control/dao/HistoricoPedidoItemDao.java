package br.com.control.dao;

import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import br.com.control.vendas.cadastro.modelo.pedido.HistoricoPedidoItem;

@Repository
@Transactional
public class HistoricoPedidoItemDao extends JdbcDao<HistoricoPedidoItem> {

}
