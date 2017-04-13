package br.com.control.cadastro;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.control.dao.LiberacaoPedidoDao;
import br.com.control.portal.mensageria.to.LiberacaoPedidoTO;

@Service
public class LiberacaoPedidoService {

	@Autowired
	private LiberacaoPedidoDao liberacaoPedidoDao;

	public void liberarPedido(LiberacaoPedidoTO liberacao) {
		liberacaoPedidoDao.liberarPedido(liberacao);
	}

}
