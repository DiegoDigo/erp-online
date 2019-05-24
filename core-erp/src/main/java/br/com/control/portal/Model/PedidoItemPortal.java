package br.com.control.portal.Model;

import br.com.control.annotation.SequenciaParametrosProcedure;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.math.BigDecimal;

@Entity
public class PedidoItemPortal {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private long recId;
    private int codigoEmpresa;
    private long numeroPrePedidoGestao;
    private int sequenciaItem;
    private int codigoOcorrencia;
    private long codigoReduzidoProduto;
    private int quantidadeCaixa;
    private int quantidadeAvulsa;
    private int codigoTabelaPreco;
    private BigDecimal desconto;
    private BigDecimal valorLiquido;
    private BigDecimal valorBruto;
    private BigDecimal precoUnitarioCaixa;
    private BigDecimal precoUnitarioAvulso;

//	private String combo;

    private int carga;
    private BigDecimal valorBonificado;
    private BigDecimal valorDesconto;
    private BigDecimal valorVerba;
    private String numAtivoCev;
    private String codigoMotivoOcorrencia;
    private String flagDev;
    private String codigoBandaPreco;
    private String codigoAcaoSolavanco;
    private int itemAlteradoBandaPreco;
    private int itemOrigemAcaoSolavanco;
    private String tipoRecolhimento;
    private String permiteAlterarQtdBonificada;
    private int acaoQtdAutorizada;
    private BigDecimal bonusGerado;
    private BigDecimal valorImpostoBarreira;
    private BigDecimal bonusUtilizado;
    private int faixaBandaOrigem;
    private int perfilTabela;
    private BigDecimal valorVerbaUtilizadaGL;
    private int codigoVerbaGeradaGL;
    private String itemValidadoBonificaoAutomatica;
    private int horaInicialPedido;
    private String ultimoItem;
    private int statusRetorno;
    private String msgRetorno;


    public PedidoItemPortal() {
    }

    public PedidoItemPortal(Long id, long recId, int codigoEmpresa, long numeroPrePedidoGestao, int sequenciaItem, int codigoOcorrencia, long codigoReduzidoProduto, int quantidadeCaixa, int quantidadeAvulsa, int codigoTabelaPreco, BigDecimal desconto, BigDecimal valorLiquido, BigDecimal valorBruto, BigDecimal precoUnitarioCaixa, BigDecimal precoUnitarioAvulso, int carga, BigDecimal valorBonificado, BigDecimal valorDesconto, BigDecimal valorVerba, String numAtivoCev, String codigoMotivoOcorrencia, String flagDev, String codigoBandaPreco, String codigoAcaoSolavanco, int itemAlteradoBandaPreco, int itemOrigemAcaoSolavanco, String tipoRecolhimento, String permiteAlterarQtdBonificada, int acaoQtdAutorizada, BigDecimal bonusGerado, BigDecimal valorImpostoBarreira, BigDecimal bonusUtilizado, int faixaBandaOrigem, int perfilTabela, BigDecimal valorVerbaUtilizadaGL, int codigoVerbaGeradaGL, String itemValidadoBonificaoAutomatica, int horaInicialPedido, String ultimoItem, int statusRetorno, String msgRetorno) {
        this.id = id;
        this.recId = recId;
        this.codigoEmpresa = codigoEmpresa;
        this.numeroPrePedidoGestao = numeroPrePedidoGestao;
        this.sequenciaItem = sequenciaItem;
        this.codigoOcorrencia = codigoOcorrencia;
        this.codigoReduzidoProduto = codigoReduzidoProduto;
        this.quantidadeCaixa = quantidadeCaixa;
        this.quantidadeAvulsa = quantidadeAvulsa;
        this.codigoTabelaPreco = codigoTabelaPreco;
        this.desconto = desconto;
        this.valorLiquido = valorLiquido;
        this.valorBruto = valorBruto;
        this.precoUnitarioCaixa = precoUnitarioCaixa;
        this.precoUnitarioAvulso = precoUnitarioAvulso;
        this.carga = carga;
        this.valorBonificado = valorBonificado;
        this.valorDesconto = valorDesconto;
        this.valorVerba = valorVerba;
        this.numAtivoCev = numAtivoCev;
        this.codigoMotivoOcorrencia = codigoMotivoOcorrencia;
        this.flagDev = flagDev;
        this.codigoBandaPreco = codigoBandaPreco;
        this.codigoAcaoSolavanco = codigoAcaoSolavanco;
        this.itemAlteradoBandaPreco = itemAlteradoBandaPreco;
        this.itemOrigemAcaoSolavanco = itemOrigemAcaoSolavanco;
        this.tipoRecolhimento = tipoRecolhimento;
        this.permiteAlterarQtdBonificada = permiteAlterarQtdBonificada;
        this.acaoQtdAutorizada = acaoQtdAutorizada;
        this.bonusGerado = bonusGerado;
        this.valorImpostoBarreira = valorImpostoBarreira;
        this.bonusUtilizado = bonusUtilizado;
        this.faixaBandaOrigem = faixaBandaOrigem;
        this.perfilTabela = perfilTabela;
        this.valorVerbaUtilizadaGL = valorVerbaUtilizadaGL;
        this.codigoVerbaGeradaGL = codigoVerbaGeradaGL;
        this.itemValidadoBonificaoAutomatica = itemValidadoBonificaoAutomatica;
        this.horaInicialPedido = horaInicialPedido;
        this.ultimoItem = ultimoItem;
        this.statusRetorno = statusRetorno;
        this.msgRetorno = msgRetorno;
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

    public long getNumeroPrePedidoGestao() {
        return numeroPrePedidoGestao;
    }

    public void setNumeroPrePedidoGestao(long numeroPrePedidoGestao) {
        this.numeroPrePedidoGestao = numeroPrePedidoGestao;
    }

    public int getSequenciaItem() {
        return sequenciaItem;
    }

    public void setSequenciaItem(int sequenciaItem) {
        this.sequenciaItem = sequenciaItem;
    }

    public int getCodigoOcorrencia() {
        return codigoOcorrencia;
    }

    public void setCodigoOcorrencia(int codigoOcorrencia) {
        this.codigoOcorrencia = codigoOcorrencia;
    }

    public long getCodigoReduzidoProduto() {
        return codigoReduzidoProduto;
    }

    public void setCodigoReduzidoProduto(long codigoReduzidoProduto) {
        this.codigoReduzidoProduto = codigoReduzidoProduto;
    }

    public int getQuantidadeCaixa() {
        return quantidadeCaixa;
    }

    public void setQuantidadeCaixa(int quantidadeCaixa) {
        this.quantidadeCaixa = quantidadeCaixa;
    }

    public int getQuantidadeAvulsa() {
        return quantidadeAvulsa;
    }

    public void setQuantidadeAvulsa(int quantidadeAvulsa) {
        this.quantidadeAvulsa = quantidadeAvulsa;
    }

    public int getCodigoTabelaPreco() {
        return codigoTabelaPreco;
    }

    public void setCodigoTabelaPreco(int codigoTabelaPreco) {
        this.codigoTabelaPreco = codigoTabelaPreco;
    }

    public BigDecimal getDesconto() {
        return desconto;
    }

    public void setDesconto(BigDecimal desconto) {
        this.desconto = desconto;
    }

    public BigDecimal getValorLiquido() {
        return valorLiquido;
    }

    public void setValorLiquido(BigDecimal valorLiquido) {
        this.valorLiquido = valorLiquido;
    }

    public BigDecimal getValorBruto() {
        return valorBruto;
    }

    public void setValorBruto(BigDecimal valorBruto) {
        this.valorBruto = valorBruto;
    }

    public BigDecimal getPrecoUnitarioCaixa() {
        return precoUnitarioCaixa;
    }

    public void setPrecoUnitarioCaixa(BigDecimal precoUnitarioCaixa) {
        this.precoUnitarioCaixa = precoUnitarioCaixa;
    }

    public BigDecimal getPrecoUnitarioAvulso() {
        return precoUnitarioAvulso;
    }

    public void setPrecoUnitarioAvulso(BigDecimal precoUnitarioAvulso) {
        this.precoUnitarioAvulso = precoUnitarioAvulso;
    }

    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }

    public BigDecimal getValorBonificado() {
        return valorBonificado;
    }

    public void setValorBonificado(BigDecimal valorBonificado) {
        this.valorBonificado = valorBonificado;
    }

    public BigDecimal getValorDesconto() {
        return valorDesconto;
    }

    public void setValorDesconto(BigDecimal valorDesconto) {
        this.valorDesconto = valorDesconto;
    }

    public BigDecimal getValorVerba() {
        return valorVerba;
    }

    public void setValorVerba(BigDecimal valorVerba) {
        this.valorVerba = valorVerba;
    }

    public String getNumAtivoCev() {
        return numAtivoCev;
    }

    public void setNumAtivoCev(String numAtivoCev) {
        this.numAtivoCev = numAtivoCev;
    }

    public String getCodigoMotivoOcorrencia() {
        return codigoMotivoOcorrencia;
    }

    public void setCodigoMotivoOcorrencia(String codigoMotivoOcorrencia) {
        this.codigoMotivoOcorrencia = codigoMotivoOcorrencia;
    }

    public String getFlagDev() {
        return flagDev;
    }

    public void setFlagDev(String flagDev) {
        this.flagDev = flagDev;
    }

    public String getCodigoBandaPreco() {
        return codigoBandaPreco;
    }

    public void setCodigoBandaPreco(String codigoBandaPreco) {
        this.codigoBandaPreco = codigoBandaPreco;
    }

    public String getCodigoAcaoSolavanco() {
        return codigoAcaoSolavanco;
    }

    public void setCodigoAcaoSolavanco(String codigoAcaoSolavanco) {
        this.codigoAcaoSolavanco = codigoAcaoSolavanco;
    }

    public int getItemAlteradoBandaPreco() {
        return itemAlteradoBandaPreco;
    }

    public void setItemAlteradoBandaPreco(int itemAlteradoBandaPreco) {
        this.itemAlteradoBandaPreco = itemAlteradoBandaPreco;
    }

    public int getItemOrigemAcaoSolavanco() {
        return itemOrigemAcaoSolavanco;
    }

    public void setItemOrigemAcaoSolavanco(int itemOrigemAcaoSolavanco) {
        this.itemOrigemAcaoSolavanco = itemOrigemAcaoSolavanco;
    }

    public String getTipoRecolhimento() {
        return tipoRecolhimento;
    }

    public void setTipoRecolhimento(String tipoRecolhimento) {
        this.tipoRecolhimento = tipoRecolhimento;
    }

    public String getPermiteAlterarQtdBonificada() {
        return permiteAlterarQtdBonificada;
    }

    public void setPermiteAlterarQtdBonificada(String permiteAlterarQtdBonificada) {
        this.permiteAlterarQtdBonificada = permiteAlterarQtdBonificada;
    }

    public int getAcaoQtdAutorizada() {
        return acaoQtdAutorizada;
    }

    public void setAcaoQtdAutorizada(int acaoQtdAutorizada) {
        this.acaoQtdAutorizada = acaoQtdAutorizada;
    }

    public BigDecimal getBonusGerado() {
        return bonusGerado;
    }

    public void setBonusGerado(BigDecimal bonusGerado) {
        this.bonusGerado = bonusGerado;
    }

    public BigDecimal getValorImpostoBarreira() {
        return valorImpostoBarreira;
    }

    public void setValorImpostoBarreira(BigDecimal valorImpostoBarreira) {
        this.valorImpostoBarreira = valorImpostoBarreira;
    }

    public BigDecimal getBonusUtilizado() {
        return bonusUtilizado;
    }

    public void setBonusUtilizado(BigDecimal bonusUtilizado) {
        this.bonusUtilizado = bonusUtilizado;
    }

    public int getFaixaBandaOrigem() {
        return faixaBandaOrigem;
    }

    public void setFaixaBandaOrigem(int faixaBandaOrigem) {
        this.faixaBandaOrigem = faixaBandaOrigem;
    }

    public int getPerfilTabela() {
        return perfilTabela;
    }

    public void setPerfilTabela(int perfilTabela) {
        this.perfilTabela = perfilTabela;
    }

    public BigDecimal getValorVerbaUtilizadaGL() {
        return valorVerbaUtilizadaGL;
    }

    public void setValorVerbaUtilizadaGL(BigDecimal valorVerbaUtilizadaGL) {
        this.valorVerbaUtilizadaGL = valorVerbaUtilizadaGL;
    }

    public int getCodigoVerbaGeradaGL() {
        return codigoVerbaGeradaGL;
    }

    public void setCodigoVerbaGeradaGL(int codigoVerbaGeradaGL) {
        this.codigoVerbaGeradaGL = codigoVerbaGeradaGL;
    }

    public String getItemValidadoBonificaoAutomatica() {
        return itemValidadoBonificaoAutomatica;
    }

    public void setItemValidadoBonificaoAutomatica(String itemValidadoBonificaoAutomatica) {
        this.itemValidadoBonificaoAutomatica = itemValidadoBonificaoAutomatica;
    }

    public int getHoraInicialPedido() {
        return horaInicialPedido;
    }

    public void setHoraInicialPedido(int horaInicialPedido) {
        this.horaInicialPedido = horaInicialPedido;
    }

    public String getUltimoItem() {
        return ultimoItem;
    }

    public void setUltimoItem(String ultimoItem) {
        this.ultimoItem = ultimoItem;
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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "PedidoItemPortal{" +
                "id=" + id +
                ", recId=" + recId +
                ", codigoEmpresa=" + codigoEmpresa +
                ", numeroPrePedidoGestao=" + numeroPrePedidoGestao +
                ", sequenciaItem=" + sequenciaItem +
                ", codigoOcorrencia=" + codigoOcorrencia +
                ", codigoReduzidoProduto=" + codigoReduzidoProduto +
                ", quantidadeCaixa=" + quantidadeCaixa +
                ", quantidadeAvulsa=" + quantidadeAvulsa +
                ", codigoTabelaPreco=" + codigoTabelaPreco +
                ", desconto=" + desconto +
                ", valorLiquido=" + valorLiquido +
                ", valorBruto=" + valorBruto +
                ", precoUnitarioCaixa=" + precoUnitarioCaixa +
                ", precoUnitarioAvulso=" + precoUnitarioAvulso +
                ", carga=" + carga +
                ", valorBonificado=" + valorBonificado +
                ", valorDesconto=" + valorDesconto +
                ", valorVerba=" + valorVerba +
                ", numAtivoCev='" + numAtivoCev + '\'' +
                ", codigoMotivoOcorrencia='" + codigoMotivoOcorrencia + '\'' +
                ", flagDev='" + flagDev + '\'' +
                ", codigoBandaPreco='" + codigoBandaPreco + '\'' +
                ", codigoAcaoSolavanco='" + codigoAcaoSolavanco + '\'' +
                ", itemAlteradoBandaPreco=" + itemAlteradoBandaPreco +
                ", itemOrigemAcaoSolavanco=" + itemOrigemAcaoSolavanco +
                ", tipoRecolhimento='" + tipoRecolhimento + '\'' +
                ", permiteAlterarQtdBonificada='" + permiteAlterarQtdBonificada + '\'' +
                ", acaoQtdAutorizada=" + acaoQtdAutorizada +
                ", bonusGerado=" + bonusGerado +
                ", valorImpostoBarreira=" + valorImpostoBarreira +
                ", bonusUtilizado=" + bonusUtilizado +
                ", faixaBandaOrigem=" + faixaBandaOrigem +
                ", perfilTabela=" + perfilTabela +
                ", valorVerbaUtilizadaGL=" + valorVerbaUtilizadaGL +
                ", codigoVerbaGeradaGL=" + codigoVerbaGeradaGL +
                ", itemValidadoBonificaoAutomatica='" + itemValidadoBonificaoAutomatica + '\'' +
                ", horaInicialPedido=" + horaInicialPedido +
                ", ultimoItem='" + ultimoItem + '\'' +
                ", statusRetorno=" + statusRetorno +
                ", msgRetorno='" + msgRetorno + '\'' +
                '}';
    }
}
