package br.com.control.portal.mensageria.to;

import br.com.control.vendas.cadastro.modelo.pedido.pagamento.BoletoPedido;

import java.io.Serializable;

public class BoletoPedidoTO implements Serializable {

    private static final long serialVersionUID = 1L;

    private String codigoBancoBoletoPedido;
    private String codigoNossoNumeroBoletoPedido;
    private String sequenciaBoletoPedido;
    private String numeroPedidoBoletoPedido;
    private String numeroNotaFiscalBoletoPedido;
    private String serieNotaFiscalBoletoPedido;
    private String codigoClienteBoletoPedido;
    private String dataEmissaoBoletoPedido;
    private String dataVencimentoBoletoPedido;

    public BoletoPedidoTO(String codigoBancoBoletoPedido, String codigoNossoNumeroBoletoPedido, String sequenciaBoletoPedido, String numeroPedidoBoletoPedido, String numeroNotaFiscalBoletoPedido, String serieNotaFiscalBoletoPedido, String codigoClienteBoletoPedido, String dataEmissaoBoletoPedido, String dataVencimentoBoletoPedido) {
        this.codigoBancoBoletoPedido = codigoBancoBoletoPedido;
        this.codigoNossoNumeroBoletoPedido = codigoNossoNumeroBoletoPedido;
        this.sequenciaBoletoPedido = sequenciaBoletoPedido;
        this.numeroPedidoBoletoPedido = numeroPedidoBoletoPedido;
        this.numeroNotaFiscalBoletoPedido = numeroNotaFiscalBoletoPedido;
        this.serieNotaFiscalBoletoPedido = serieNotaFiscalBoletoPedido;
        this.codigoClienteBoletoPedido = codigoClienteBoletoPedido;
        this.dataEmissaoBoletoPedido = dataEmissaoBoletoPedido;
        this.dataVencimentoBoletoPedido = dataVencimentoBoletoPedido;
    }

    public BoletoPedidoTO(BoletoPedido boletoPedido){
        this.codigoBancoBoletoPedido = boletoPedido.getCodigoBancoBoletoPedido();
        this.codigoNossoNumeroBoletoPedido = boletoPedido.getCodigoNossoNumeroBoletoPedido();
        this.sequenciaBoletoPedido = boletoPedido.getSequenciaBoletoPedido();
        this.numeroPedidoBoletoPedido = boletoPedido.getNumeroPedidoBoletoPedido();
        this.numeroNotaFiscalBoletoPedido = boletoPedido.getNumeroNotaFiscalBoletoPedido();
        this.serieNotaFiscalBoletoPedido = boletoPedido.getSerieNotaFiscalBoletoPedido();
        this.codigoClienteBoletoPedido = boletoPedido.getCodigoClienteBoletoPedido();
        this.dataEmissaoBoletoPedido = boletoPedido.getDataEmissaoBoletoPedido();
        this.dataVencimentoBoletoPedido = boletoPedido.getDataVencimentoBoletoPedido();
    }

    public BoletoPedidoTO() {
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
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
