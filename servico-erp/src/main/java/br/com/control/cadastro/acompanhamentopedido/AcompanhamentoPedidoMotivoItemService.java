package br.com.control.cadastro.acompanhamentopedido;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.control.dao.AcompanhamentoPedidoMotivoItemDao;
import br.com.control.integracao.TabelasIntegracaoPortal;
import br.com.control.repositorio.mappers.AcompanhamentoPedidoMotivoItemRowMapper;
import br.com.control.vendas.cadastro.modelo.pedido.acompanhemanto.AcompanhamentoPedidoMotivoItem;

@Service
public class AcompanhamentoPedidoMotivoItemService {

	@Autowired
	private AcompanhamentoPedidoMotivoItemDao acompanhamentoPedidoMotivoItemDao;

	public List<AcompanhamentoPedidoMotivoItem> listarMotivoItem() {
		return acompanhamentoPedidoMotivoItemDao.selectViewSemWhere(TabelasIntegracaoPortal.ACOMPANHAMENTO_PEDIDO_MOTIVO_ITEM, new AcompanhamentoPedidoMotivoItemRowMapper());
	}

}
