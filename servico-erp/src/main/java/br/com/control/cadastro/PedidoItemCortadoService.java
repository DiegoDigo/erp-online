package br.com.control.cadastro;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.control.dao.PedidoItemCortadoDao;
import br.com.control.vendas.cadastro.modelo.pedido.PedidoItemCortado;

@Service
public class PedidoItemCortadoService {

	@Autowired
	private PedidoItemCortadoDao pedidoItemCortadoDao;

	public List<PedidoItemCortado> listar() {
		return pedidoItemCortadoDao.listar();
	}

	public List<PedidoItemCortado> recuperarItensCordados(String numeroPrePedido) {
		return pedidoItemCortadoDao.recuperarItensCortados(numeroPrePedido);
	}

}
