package br.com.control.globobroker;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.control.globobroker.dao.PedidoCapaGloboBrokerDao;
import br.com.control.globobroker.model.envio.ConfirmarEnvioErpTerceiroTO;
import br.com.control.globobroker.model.envio.PedidoCapaGloboBroker;

@Service
public class PedidoCapaGloboBrokerService {

	@Autowired
	private PedidoCapaGloboBrokerDao pedidoCapaDao;

	public List<PedidoCapaGloboBroker> listar() {
		return pedidoCapaDao.listarPedidosBroker();
	}

	public void confirmarEnvio(ConfirmarEnvioErpTerceiroTO pedidoTO) {
		pedidoCapaDao.confirmarEnvio(pedidoTO);
	}

	public Integer count() {
		return pedidoCapaDao.count();
	}
}
