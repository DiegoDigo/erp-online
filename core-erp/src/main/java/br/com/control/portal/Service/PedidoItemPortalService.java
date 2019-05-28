package br.com.control.portal.Service;

import br.com.control.portal.Model.PedidoItemPortal;
import br.com.control.portal.Repository.PedidoItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PedidoItemPortalService {

    @Autowired
    PedidoItemRepository pedidoItemRepository;

    public PedidoItemPortal salvar(PedidoItemPortal pedidoItem) {
        return pedidoItemRepository.save(pedidoItem);
    }

    public List<PedidoItemPortal> salvar(List<PedidoItemPortal> pedidoItens) {
        return pedidoItemRepository.save(pedidoItens);
    }
}
