package br.com.control.portal.Service.Impl;

import br.com.control.portal.Model.PedidoCapaPortal;
import br.com.control.portal.Model.PedidoItemPortal;
import br.com.control.portal.Repository.PedidoCapaPortalRepository;
import br.com.control.portal.Service.PedidoCapaPortalService;
import br.com.control.portal.mensageria.to.PedidoCapaTO;
import br.com.control.portal.mensageria.to.PedidoItemTO;
import br.com.control.retransmissao.PedidoRetransmissao;
import br.com.control.retransmissao.Serivce.PedidoRetransmissaoService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class PedidoCapaPortalServiceImpl implements PedidoCapaPortalService {

    @Autowired
    PedidoCapaPortalRepository pedidoCapaPortalRepository;

    @Autowired
    PedidoRetransmissaoService pedidoRetransmissaoService;

    @Override
    public PedidoCapaPortal salvar(PedidoCapaTO pedido, String exception) {

        PedidoCapaPortal pedidoCapaPortal = new PedidoCapaPortal();
        List<PedidoItemPortal> pedidoItens = new ArrayList<>();

    	BeanUtils.copyProperties(pedido, pedidoCapaPortal, "id, itens");
        for (PedidoItemTO item: pedido.getItens()) {
            PedidoItemPortal pedidoItemPortal = new PedidoItemPortal();
            BeanUtils.copyProperties(item, pedidoItemPortal, "id");
            pedidoItens.add(pedidoItemPortal);
        }

        pedidoCapaPortal.setItens(pedidoItens);
        System.out.println(pedidoCapaPortal.toString());

        pedidoRetransmissaoService.salvar(new PedidoRetransmissao(pedidoCapaPortal, exception, false));

        return pedidoCapaPortalRepository.saveAndFlush(pedidoCapaPortal);
    }

    @Override
    public Optional<PedidoCapaPortal> buscarPorRecId(long recId) {
        return pedidoCapaPortalRepository.findByRecId(recId);
    }
}
