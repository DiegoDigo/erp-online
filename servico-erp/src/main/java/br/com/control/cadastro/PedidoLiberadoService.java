package br.com.control.cadastro;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.control.dao.PedidoLiberadoDao;
import br.com.control.integracao.TabelasIntegracao;
import br.com.control.repositorio.mappers.PedidoLiberadoRowMapper;
import br.com.control.vendas.cadastro.modelo.pedido.PedidoLiberado;

@Service
public class PedidoLiberadoService {

	@Autowired
	private PedidoLiberadoDao pedidoLiberadoDao;

	public List<PedidoLiberado> listar() {
		return pedidoLiberadoDao.selectViewSemWhere(TabelasIntegracao.VENDA_PEDIDO_LIBERADO, new PedidoLiberadoRowMapper());
	}

}
