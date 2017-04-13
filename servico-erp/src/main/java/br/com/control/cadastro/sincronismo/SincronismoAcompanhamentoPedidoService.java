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
			LOG.info("------> STATUS PEDIDO: "+codigoPrePedidoERP+" é: "+ to);
			pedidoCapaProducer.sendMessage(to);
			LOG.debug("------> ENVIOU O PEDIDO "+codigoPrePedidoERP+" PARA O PORTAL");
		}else{
			LOG.error("Não foi encontrado nenhum pedido com o código de pré pedido: "+codigoPrePedidoERP);
		}
	}

}
