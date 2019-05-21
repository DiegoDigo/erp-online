package br.com.control.retransmissao.Serivce.Impl;

import br.com.control.portal.Model.PedidoCapaPortal;
import br.com.control.portal.Service.PedidoCapaPortalService;
import br.com.control.portal.Service.PedidoItemPortalService;
import br.com.control.portal.mensageria.to.PedidoCapaTO;
import br.com.control.portal.mensageria.to.PedidoItemTO;
import br.com.control.retransmissao.PedidoRetransmissao;
import br.com.control.retransmissao.Repository.PedidoRetransmissaoRepository;
import br.com.control.retransmissao.Serivce.PedidoRetransmissaoService;
import org.codehaus.jackson.map.util.BeanUtil;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.JmsException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PedidoRetransmissaoServiceImpl implements PedidoRetransmissaoService {

    @Autowired
    PedidoRetransmissaoRepository pedidoRetransmissaoRepository;

    @Autowired
    PedidoCapaPortalService pedidoCapaPortalService;

    @Override
    public PedidoRetransmissao salvar(PedidoRetransmissao pedidoRetransmissao) {
        return pedidoRetransmissaoRepository.save(pedidoRetransmissao);
    }

    @Override
    public void transmitido(long recId) {
        PedidoRetransmissao pedidoRetransmissao = pedidoRetransmissaoRepository.buscarPorRecId(recId);
        pedidoRetransmissao.setTransmitido(true);
        this.salvar(pedidoRetransmissao);
    }

    @Override
    public List<PedidoCapaTO>  verificar() {

        List<PedidoRetransmissao> retransmissoes = pedidoRetransmissaoRepository.findAllByTransmitido(false);
        List<PedidoCapaTO> pedidosNaoTransmitidos = new ArrayList<>();

        retransmissoes.forEach(retransmitir -> {
            PedidoCapaPortal pedidoCapa = pedidoCapaPortalService.buscarPorRecId(retransmitir.getPedidoCapaPortal().getRecId()).get();
            if(pedidoCapa != null){
                PedidoCapaTO pedidoCapaTO = new PedidoCapaTO();
                List<PedidoItemTO> itens = new ArrayList<>();

                BeanUtils.copyProperties(pedidoCapa, pedidoCapaTO, "id, itens");

                pedidoCapa.getItens().forEach(item -> {
                    PedidoItemTO pedidoItemTO = new PedidoItemTO();
                    BeanUtils.copyProperties(item, pedidoItemTO, "id");
                    itens.add(pedidoItemTO);
                });
                pedidoCapaTO.setItens(itens);

                pedidosNaoTransmitidos.add(pedidoCapaTO);
            }
        });

        return pedidosNaoTransmitidos;
    }
}
