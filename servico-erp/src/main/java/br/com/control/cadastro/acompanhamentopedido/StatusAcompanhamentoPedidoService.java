package br.com.control.cadastro.acompanhamentopedido;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.control.dao.StatusAcompanhamentoPedidoDao;
import br.com.control.vendas.cadastro.modelo.pedido.acompanhemanto.StatusAcompanhamentoPedido;

@Service


public class StatusAcompanhamentoPedidoService {
	@Autowired
	private StatusAcompanhamentoPedidoDao statusAcompanhamentoPedidoDao;

	public StatusAcompanhamentoPedido recuperaStatusDoPedido(String numeroPrePedidoErp) {
		return statusAcompanhamentoPedidoDao.recuperaStatusPedido(numeroPrePedidoErp);

	}

}
