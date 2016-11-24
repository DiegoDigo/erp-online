package br.com.control.cadastro.acompanhamentopedido;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.control.dao.SiglaAcompanhamentoPedidoDao;
import br.com.control.integracao.TabelasIntegracaoPortal;
import br.com.control.repositorio.mappers.SiglaAcompanhamentoPedidoRowMapper;
import br.com.control.vendas.cadastro.modelo.pedido.acompanhemanto.StatusAcompanhamentoPedido;

@Service

public class SiglaAcompanhamentoPedidoService {

	@Autowired
	private SiglaAcompanhamentoPedidoDao siglaAcompanhamentoPedidoDao;

	public List<StatusAcompanhamentoPedido> listaSigla(String sigla) {
		return siglaAcompanhamentoPedidoDao.selectViewSemWhere(
				TabelasIntegracaoPortal.CADASTRO_SIGLA_ACOMPANHAMENTO_PEDIDO, new SiglaAcompanhamentoPedidoRowMapper());

	}

}
