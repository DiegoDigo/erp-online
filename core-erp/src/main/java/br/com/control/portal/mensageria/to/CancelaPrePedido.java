package br.com.control.portal.mensageria.to;

import br.com.control.annotation.SequenciaParametrosProcedure;

import java.io.Serializable;

public class CancelaPrePedido implements Serializable {
    private static final long serialVersionUID = 1L;

    private long recId;
    @SequenciaParametrosProcedure(index = 1)
    private int codigoEmpresa;
    @SequenciaParametrosProcedure(index = 2)
    private long numeroPedido;
    @SequenciaParametrosProcedure(index = 3, isRetornoProcedure = true)
    private long numeroPrePedidoGestao;
    @SequenciaParametrosProcedure(index = 4, isRetornoProcedure = true)
    private int statusRetorno;
    @SequenciaParametrosProcedure(index = 5, isRetornoProcedure = true)
    private String msgRetorno = "";

    public long getRecId() {
        return recId;
    }

    public void setRecId(long recId) {
        this.recId = recId;
    }

    public int getCodigoEmpresa() {
        return codigoEmpresa;
    }

    public void setCodigoEmpresa(int codigoEmpresa) {
        this.codigoEmpresa = codigoEmpresa;
    }

    public long getNumeroPedido() {
        return numeroPedido;
    }

    public void setNumeroPedido(long numeroPedido) {
        this.numeroPedido = numeroPedido;
    }

    public long getNumeroPrePedidoGestao() {
        return numeroPrePedidoGestao;
    }

    public void setNumeroPrePedidoGestao(long numeroPrePedidoGestao) {
        this.numeroPrePedidoGestao = numeroPrePedidoGestao;
    }

    public int getStatusRetorno() {
        return statusRetorno;
    }

    public void setStatusRetorno(int statusRetorno) {
        this.statusRetorno = statusRetorno;
    }

    public String getMsgRetorno() {
        return msgRetorno;
    }

    public void setMsgRetorno(String msgRetorno) {
        this.msgRetorno = msgRetorno;
    }

    @Override
    public String toString() {
        return "CancelaPrePedido{" +
                "recId=" + recId +
                ", codigoEmpresa=" + codigoEmpresa +
                ", numeroPedido=" + numeroPedido +
                ", numeroPrePedidoGestao=" + numeroPrePedidoGestao +
                ", statusRetorno=" + statusRetorno +
                ", msgRetorno='" + msgRetorno + '\'' +
                '}';
    }
}
