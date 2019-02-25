package br.com.control.cadastro;

import br.com.control.dao.PedidoRecolhaComodatoCapaDao;
import br.com.control.portal.mensageria.to.AcompanhamentoPedidoTO;
import br.com.control.portal.mensageria.to.PedidoComodatoTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PedidoComodatoService {

	@Autowired
	private PedidoRecolhaComodatoCapaDao pedidoRecolhaComodatoCapaDao;

	public AcompanhamentoPedidoTO salvarPedidoComodato(PedidoComodatoTO pedidoComodato) {
		return pedidoRecolhaComodatoCapaDao.salvarCapaPedidoComodato(pedidoComodato);
	}

}
