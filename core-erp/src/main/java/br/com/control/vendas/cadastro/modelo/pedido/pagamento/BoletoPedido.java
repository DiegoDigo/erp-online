package br.com.control.vendas.cadastro.modelo.pedido.pagamento;

import java.io.Serializable;


public class BoletoPedido implements Serializable {

    private String codigoBancoBoletoPedido;
    private String codigoNossoNumeroBoletoPedido;
    private String sequenciaBoletoPedido;
    private String numeroPedidoBoletoPedido;
    private String numeroNotaFiscalBoletoPedido;
    private String serieNotaFiscalBoletoPedido;
    private String codigoClienteBoletoPedido;
    private String dataEmissaoBoletoPedido;
    private String dataVencimentoBoletoPedido;


    public BoletoPedido() {
    }

    public String getCodigoBancoBoletoPedido() {
        return codigoBancoBoletoPedido;
    }

    public void setCodigoBancoBoletoPedido(String codigoBancoBoletoPedido) {
        this.codigoBancoBoletoPedido = codigoBancoBoletoPedido;
    }

    public String getCodigoNossoNumeroBoletoPedido() {
        return codigoNossoNumeroBoletoPedido;
    }

    public void setCodigoNossoNumeroBoletoPedido(String codigoNossoNumeroBoletoPedido) {
        this.codigoNossoNumeroBoletoPedido = codigoNossoNumeroBoletoPedido;
    }

    public String getSequenciaBoletoPedido() {
        return sequenciaBoletoPedido;
    }

    public void setSequenciaBoletoPedido(String sequenciaBoletoPedido) {
        this.sequenciaBoletoPedido = sequenciaBoletoPedido;
    }

    public String getNumeroPedidoBoletoPedido() {
        return numeroPedidoBoletoPedido;
    }

    public void setNumeroPedidoBoletoPedido(String numeroPedidoBoletoPedido) {
        this.numeroPedidoBoletoPedido = numeroPedidoBoletoPedido;
    }

    public String getNumeroNotaFiscalBoletoPedido() {
        return numeroNotaFiscalBoletoPedido;
    }

    public void setNumeroNotaFiscalBoletoPedido(String numeroNotaFiscalBoletoPedido) {
        this.numeroNotaFiscalBoletoPedido = numeroNotaFiscalBoletoPedido;
    }

    public String getSerieNotaFiscalBoletoPedido() {
        return serieNotaFiscalBoletoPedido;
    }

    public void setSerieNotaFiscalBoletoPedido(String serieNotaFiscalBoletoPedido) {
        this.serieNotaFiscalBoletoPedido = serieNotaFiscalBoletoPedido;
    }

    public String getCodigoClienteBoletoPedido() {
        return codigoClienteBoletoPedido;
    }

    public void setCodigoClienteBoletoPedido(String codigoClienteBoletoPedido) {
        this.codigoClienteBoletoPedido = codigoClienteBoletoPedido;
    }

    public String getDataEmissaoBoletoPedido() {
        return dataEmissaoBoletoPedido;
    }

    public void setDataEmissaoBoletoPedido(String dataEmissaoBoletoPedido) {
        this.dataEmissaoBoletoPedido = dataEmissaoBoletoPedido;
    }

    public String getDataVencimentoBoletoPedido() {
        return dataVencimentoBoletoPedido;
    }

    public void setDataVencimentoBoletoPedido(String dataVencimentoBoletoPedido) {
        this.dataVencimentoBoletoPedido = dataVencimentoBoletoPedido;
    }
}

