package br.com.control.cadastro;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.control.dao.PedidoRecusadoDao;
import br.com.control.portal.integracao.TabelasIntegracao;
import br.com.control.repositorio.mappers.PedidoRecusadoRowMapper;
import br.com.control.vendas.cadastro.modelo.pedido.PedidoRecusado;

@Service
public class PedidoRecusadoService {

	@Autowired
	private PedidoRecusadoDao pedidoRecusadoDao;

	public List<PedidoRecusado> listar() {
		return pedidoRecusadoDao.selectViewSemWhere(TabelasIntegracao.VENDA_PEDIDO_RECUSADO, new PedidoRecusadoRowMapper());
	}

}
