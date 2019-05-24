package br.com.control.portal.Service;

import br.com.control.portal.Model.PedidoCapaPortal;
import br.com.control.portal.mensageria.to.PedidoCapaTO;

import java.util.Optional;

public interface PedidoCapaPortalService {
    public PedidoCapaPortal salvar(PedidoCapaTO pedido, String exception);

    Optional<PedidoCapaPortal> buscarPorRecId(long recId);
}
