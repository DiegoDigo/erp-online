package br.com.control.cadastro.acompanhamentopedido;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.control.dao.AcompanhamentoPedidoDao;
import br.com.control.integracao.TabelasIntegracao;
import br.com.control.repositorio.mappers.AcompanhamentoPedidoCapaRowMapper;
import br.com.control.vendas.cadastro.modelo.pedido.acompanhemanto.AcompanhamentoPedidoCapa;

@Service
public class AcompanhamentoCapaPedidoService {

	@Autowired
	private AcompanhamentoPedidoDao acompanhamentoPedidoDao;

	public List<AcompanhamentoPedidoCapa> listarAcomapanhamentos() {
		return acompanhamentoPedidoDao.selectViewSemWhere(TabelasIntegracao.ACOMPANHAMENTO_PEDIDO_CAPA,
				new AcompanhamentoPedidoCapaRowMapper());
	}

}
