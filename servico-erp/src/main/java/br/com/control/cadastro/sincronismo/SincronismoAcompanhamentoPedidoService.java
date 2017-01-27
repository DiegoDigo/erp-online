package br.com.control.cadastro.sincronismo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.control.dao.AcompanhamentoPedidoDao;
import br.com.control.mensageria.produtor.PedidoCapaProducer;
import br.com.control.portal.mensageria.to.StatusAcompanhamentoPedidoTO;
import br.com.control.vendas.cadastro.modelo.pedido.acompanhemanto.StatusAcompanhamentoPedido;

@Service
public class SincronismoAcompanhamentoPedidoService {

	@Autowired
	private AcompanhamentoPedidoDao acompanhamentoPedidoDao;

	@Autowired
	private PedidoCapaProducer pedidoCapaProducer;

	public List<StatusAcompanhamentoPedido> listaStatusPedidos() {
		return acompanhamentoPedidoDao.listaAcompanhamentoPedido();
	}

	public StatusAcompanhamentoPedido recuperaStatusPedidos(String codigoPrePedidoERP) {
		return acompanhamentoPedidoDao.recuperaAcompanhamentoPedido(codigoPrePedidoERP);
	}

	public void enviaParaOPortal(String codigoPrePedidoERP) {
		StatusAcompanhamentoPedido status = recuperaStatusPedidos(codigoPrePedidoERP);
		StatusAcompanhamentoPedidoTO to = new StatusAcompanhamentoPedidoTO(status);
		pedidoCapaProducer.sendMessage(to);
	}

}
