package br.com.control.retransmissao;


import br.com.control.portal.Model.PedidoCapaPortal;
import br.com.control.retransmissao.Model.Retransmissao;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToOne;

@Entity
public class PedidoRetransmissao extends Retransmissao {

    @OneToOne(cascade = CascadeType.ALL)
    private PedidoCapaPortal pedidoCapaPortal;

    public PedidoRetransmissao() {
    }

    public PedidoRetransmissao(PedidoCapaPortal pedidoCapaPortal, String motivo, boolean transmitido) {
        super(motivo, transmitido);
        this.pedidoCapaPortal = pedidoCapaPortal;
    }

    public PedidoCapaPortal getPedidoCapaPortal() {
        return pedidoCapaPortal;
    }

    public void setPedidoCapaPortal(PedidoCapaPortal pedidoCapaPortal) {
        this.pedidoCapaPortal = pedidoCapaPortal;
    }
}