package br.com.control.cadastro.sincronismo;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.control.dao.AcompanhamentoPedidoDao;
import br.com.control.mensageria.produtor.PedidoCapaProducer;
import br.com.control.portal.mensageria.to.StatusAcompanhamentoPedidoTO;
import br.com.control.vendas.cadastro.modelo.pedido.acompanhemanto.StatusAcompanhamentoPedido;

@Service
public class SincronismoAcompanhamentoPedidoService {

	private static final Logger LOG = Logger.getLogger(SincronismoAcompanhamentoPedidoService.class);
	
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
		if (status != null) {
			StatusAcompanhamentoPedidoTO to = new StatusAcompanhamentoPedidoTO(status);
			LOG.info("--> status pedido: "+codigoPrePedidoERP+" : "+ to.recuperaStatus());
			pedidoCapaProducer.sendMessage(to);
			LOG.info("--> enviou o pedido: "+codigoPrePedidoERP+" para o portal");
		}else{
			LOG.error("Nao foi encontrado nenhum pedido com o codigo de pre pedido: "+codigoPrePedidoERP);
		}
	}

}
