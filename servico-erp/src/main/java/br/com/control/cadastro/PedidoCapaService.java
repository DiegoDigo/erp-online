package br.com.control.cadastro;

import br.com.control.portal.Service.PedidoCapaPortalService;
import br.com.control.portal.mensageria.to.CancelaPrePedido;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.control.dao.PedidoCapaDao;
import br.com.control.portal.mensageria.to.AcompanhamentoPedidoTO;
import br.com.control.portal.mensageria.to.PedidoCapaTO;

@Service
public class PedidoCapaService {

	@Autowired
	private PedidoCapaDao pedidoCapaDao;

	@Autowired
	PedidoCapaPortalService pedidoCapaPortalService;

//	public List<PedidoCapaTO> listarPedido() {
//		return pedidoCapaDao.selectViewSemWhere(TabelasIntegracao.CADASTRO_PEDIDO_CAPA, new PedidoCapaRowMapper());
//
//	}

	public AcompanhamentoPedidoTO salvarCapa(PedidoCapaTO pedidoCapa) {

		try {
			return pedidoCapaDao.salvarCapaPedido(pedidoCapa);

		}
		catch (Exception ex) {
			pedidoCapaPortalService.salvar(pedidoCapa, ex.getMessage());
			System.out.println(">>>>>>>>>>>>>>>>>>>>>> " + ex.getLocalizedMessage());


		System.out.println("--> ERRO AO TENTAR SALVAR O PRE PEDIDO COM REC ID: "+pedidoCapa.getRecId()+" VINDO DO "+ pedidoCapa.getOrigem());
		System.out.println("--> "+ex.getMessage());
		}

		return null;
	}

	public AcompanhamentoPedidoTO CancelarPedido(CancelaPrePedido pedidoCapa) {
		return pedidoCapaDao.cancelarPrePedido(pedidoCapa);
	}

}
