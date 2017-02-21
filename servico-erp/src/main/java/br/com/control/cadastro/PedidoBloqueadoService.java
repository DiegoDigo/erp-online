package br.com.control.cadastro;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.control.dao.PedidoBloqueadosDao;
import br.com.control.vendas.cadastro.modelo.pedido.PedidoBloqueados;

@Service
public class PedidoBloqueadoService {
	
	@Autowired
	private PedidoBloqueadosDao pedidoBloqueadosDao;
	
	public List<PedidoBloqueados> listarPedidoBloqueado(){
		return pedidoBloqueadosDao.listaTodosPedidoBloqueado();
	}

}
