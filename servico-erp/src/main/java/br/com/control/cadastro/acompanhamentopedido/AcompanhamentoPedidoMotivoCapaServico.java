package br.com.control.cadastro.acompanhamentopedido;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.control.dao.AcompanhamentoPedidoMotivoCapaDao;
import br.com.control.integracao.TabelasIntegracao;
import br.com.control.repositorio.mappers.AcompanhamentoPedidoMotivoCapaRowMapper;
import br.com.control.vendas.cadastro.modelo.pedido.acompanhemanto.AcompanhamentoPedidoMotivoCapa;

@Service
public class AcompanhamentoPedidoMotivoCapaServico {

	@Autowired
	private AcompanhamentoPedidoMotivoCapaDao acompanhamentoPedidoMotivoCapaDao;

	public List<AcompanhamentoPedidoMotivoCapa> listarAcompanhamento() {
		return acompanhamentoPedidoMotivoCapaDao.selectViewSemWhere(TabelasIntegracao.ACOMPANHAMENTO_PEDIDO_MOTIVO_CAPA, new AcompanhamentoPedidoMotivoCapaRowMapper());
	}

}
