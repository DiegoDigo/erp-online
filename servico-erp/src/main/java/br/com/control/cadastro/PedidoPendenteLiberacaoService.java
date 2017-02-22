package br.com.control.cadastro;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.control.dao.PedidoPendenteLiberacaoDao;
import br.com.control.vendas.cadastro.modelo.pedido.PedidoPendenteLiberacao;

@Service
public class PedidoPendenteLiberacaoService {
	
	@Autowired
	private PedidoPendenteLiberacaoDao pedidoBloqueadosDao;
	
	public List<PedidoPendenteLiberacao> listarPedidoBloqueado(){
		return pedidoBloqueadosDao.listaTodosPedidoBloqueado();
	}

}
