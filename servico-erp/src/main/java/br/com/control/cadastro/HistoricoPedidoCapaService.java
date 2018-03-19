package br.com.control.cadastro;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.control.dao.HistoricoPedidoCapaDao;
import br.com.control.vendas.cadastro.modelo.pedido.HistoricoPedidoCapa;

@Service
public class HistoricoPedidoCapaService {

	@Autowired
	private HistoricoPedidoCapaDao historicoPedidoCapaDao;

	public List<HistoricoPedidoCapa> listarHistoricoCapa() {
		return historicoPedidoCapaDao.listar();
	}
	
	public HistoricoPedidoCapa buscarHistoricoCapa(String CodigoERP) {
		return historicoPedidoCapaDao.buscarHistoricoPedidoCapa(CodigoERP);
	}
	
	public Integer count() {
		return historicoPedidoCapaDao.count();
	}
	

}
