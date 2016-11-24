package br.com.control.cadastro;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.control.dao.PedidoCapaDao;
import br.com.control.integracao.TabelasIntegracaoPortal;
import br.com.control.repositorio.mappers.PedidoCapaRowMapper;
import br.com.control.vendas.cadastro.modelo.pedido.PedidoCapa;

@Service
public class PedidoCapaService {

	@Autowired
	private PedidoCapaDao pedidoCapaDao;

	public List<PedidoCapa> listarPedido() {
		return pedidoCapaDao.selectViewSemWhere(TabelasIntegracaoPortal.CADASTRO_PEDIDO_CAPA,
				new PedidoCapaRowMapper());

	}

}
