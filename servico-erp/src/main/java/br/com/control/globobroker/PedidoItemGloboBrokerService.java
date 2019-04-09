package br.com.control.globobroker;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.control.globobroker.dao.PedidoItemGloboBrokerDao;
import br.com.control.globobroker.model.envio.PedidoItemGloboBroker;

@Service
public class PedidoItemGloboBrokerService {

	@Autowired
	private PedidoItemGloboBrokerDao pedidoItemDao;

	public List<PedidoItemGloboBroker> listar() {
		return pedidoItemDao.listarItensPedidosBroker();
	}

	public Integer count() {
		return pedidoItemDao.count();
	}
}
