package br.com.control.cadastro;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.control.dao.PedidoSugestaoDao;
import br.com.control.portal.integracao.TabelasIntegracao;
import br.com.control.repositorio.mappers.PedidoSugestaoRowMapper;
import br.com.control.vendas.cadastro.modelo.pedido.PedidoSugestao;

@Service
public class PedidoSugestaoService {

	@Autowired
	private PedidoSugestaoDao pedidoSugestaoDao;

	public List<PedidoSugestao> listar() {
		return pedidoSugestaoDao.selectViewSemWhere(TabelasIntegracao.VENDA_PEDIDO_SUGESTAO,
				new PedidoSugestaoRowMapper());
	}

}
