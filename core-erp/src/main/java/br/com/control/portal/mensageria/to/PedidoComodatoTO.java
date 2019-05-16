package br.com.control.portal.mensageria.to;

import br.com.control.annotation.SequenciaParametrosProcedure;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class PedidoComodatoTO implements Serializable {
    private static final long serialVersionUID = 1L;

    private long recId;

    @SequenciaParametrosProcedure(index = 1)
    private int codigoEmpresa;
    @SequenciaParametrosProcedure(index = 2)
    private int codigoClienteErp;
    @SequenciaParametrosProcedure(index = 3)
    private String cpfCnpj;
    @SequenciaParametrosProcedure(index = 4)
    private String origem;
    @SequenciaParametrosProcedure(index = 5)
    private String codigoVendedor;
    @SequenciaParametrosProcedure(index = 6)
    private int tipoCobranca;
    @SequenciaParametrosProcedure(index = 7)
    private int condicaoPagamento;
    @SequenciaParametrosProcedure(index = 8)
    private float desconto;
    @SequenciaParametrosProcedure(index = 9)
    private float percTaxaFinanc;
    @SequenciaParametrosProcedure(index = 10)
    private BigDecimal valorLiquido;
    @SequenciaParametrosProcedure(index = 11)
    private int dataEmissao;
    @SequenciaParametrosProcedure(index = 12, isRetornoProcedure = true)
    private long numeroPrePedidoGestao;
    @SequenciaParametrosProcedure(index = 13, isRetornoProcedure = true)
    private int statusRetorno;
    @SequenciaParametrosProcedure(index = 14, isRetornoProcedure = true)
    private String msgRetorno = "";

    private List<PedidoComodatoItemTO> itens = new ArrayList<>();

    @Override
    public String toString() {
        return "PedidoCapaTO [recId=" + recId + ", codigoEmpresa=" + codigoEmpresa + ", codigoClienteErp="
                + codigoClienteErp + ", cpfCnpj=" + cpfCnpj + ", origem=" + origem + ", codigoVendedor="
                + codigoVendedor + ", tipoCobranca=" + tipoCobranca + ", condicaoPagamento=" + condicaoPagamento
                + ", desconto=" + desconto + ", percTaxaFinanc=" + percTaxaFinanc + ", valorLiquido=" + valorLiquido
                + ", dataEmissao=" + dataEmissao + ", numeroPrePedidoGestao=" + numeroPrePedidoGestao + ", statusRetorno="
                + statusRetorno + ", msgRetorno=" + msgRetorno + ", itens=" + itens;
    }


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

    public int getCodigoClienteErp() {
        return codigoClienteErp;
    }

    public void setCodigoClienteErp(int codigoClienteErp) {
        this.codigoClienteErp = codigoClienteErp;
    }

    public String getCpfCnpj() {
        return cpfCnpj;
    }

    public void setCpfCnpj(String cpfCnpj) {
        this.cpfCnpj = cpfCnpj;
    }

    public String getOrigem() {
        return origem;
    }

    public void setOrigem(String origem) {
        this.origem = origem;
    }

    public String getCodigoVendedor() {
        return codigoVendedor;
    }

    public void setCodigoVendedor(String codigoVendedor) {
        this.codigoVendedor = codigoVendedor;
    }

    public int getTipoCobranca() {
        return tipoCobranca;
    }

    public void setTipoCobranca(int tipoCobranca) {
        this.tipoCobranca = tipoCobranca;
    }

    public int getCondicaoPagamento() {
        return condicaoPagamento;
    }

    public void setCondicaoPagamento(int condicaoPagamento) {
        this.condicaoPagamento = condicaoPagamento;
    }

    public float getDesconto() {
        return desconto;
    }

    public void setDesconto(float desconto) {
        this.desconto = desconto;
    }

    public float getPercTaxaFinanc() {
        return percTaxaFinanc;
    }

    public void setPercTaxaFinanc(float percTaxaFinanc) {
        this.percTaxaFinanc = percTaxaFinanc;
    }

    public BigDecimal getValorLiquido() {
        return valorLiquido;
    }

    public void setValorLiquido(BigDecimal valorLiquido) {
        this.valorLiquido = valorLiquido;
    }

    public int getDataEmissao() {
        return dataEmissao;
    }

    public void setDataEmissao(int dataEmissao) {
        this.dataEmissao = dataEmissao;
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

    public List<PedidoComodatoItemTO> getItens() {
        return itens;
    }

    public void setItens(List<PedidoComodatoItemTO> itens) {
        this.itens = itens;
    }
}