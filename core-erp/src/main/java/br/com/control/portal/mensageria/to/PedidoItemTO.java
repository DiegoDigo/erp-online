package br.com.control.portal.mensageria.to;

import java.io.Serializable;
import java.math.BigDecimal;

import br.com.control.annotation.SequenciaParametrosProcedure;

public class PedidoItemTO implements Serializable {
	private static final long serialVersionUID = 1L;

	private long recId;

	@SequenciaParametrosProcedure(index = 1)
	private int codigoEmpresa;

	@SequenciaParametrosProcedure(index = 2)
	private long numeroPrePedidoGestao;

	@SequenciaParametrosProcedure(index = 3)
	private int sequenciaItem;

	@SequenciaParametrosProcedure(index = 4)
	private int codigoOcorrencia;

	@SequenciaParametrosProcedure(index = 5)
	private long codigoReduzidoProduto;

	@SequenciaParametrosProcedure(index = 6)
	private int quantidadeCaixa;

	@SequenciaParametrosProcedure(index = 7)
	private int quantidadeAvulsa;

	@SequenciaParametrosProcedure(index = 8)
	private int codigoTabelaPreco;

	@SequenciaParametrosProcedure(index = 9)
	private BigDecimal desconto;

	@SequenciaParametrosProcedure(index = 10)
	private BigDecimal valorLiquido;

	@SequenciaParametrosProcedure(index = 11)
	private BigDecimal valorBruto;

	@SequenciaParametrosProcedure(index = 12)
	private BigDecimal precoUnitarioCaixa;

	@SequenciaParametrosProcedure(index = 13)
	private BigDecimal precoUnitarioAvulso;

//	@SequenciaParametrosProcedure(index = 14)
//	private String combo;

	
	@SequenciaParametrosProcedure(index = 14)
	private int carga;
	@SequenciaParametrosProcedure(index = 15)
	private BigDecimal valorBonificado;
	@SequenciaParametrosProcedure(index = 16)
	private BigDecimal valorDesconto;
	@SequenciaParametrosProcedure(index = 17)
	private BigDecimal valorVerba;
	@SequenciaParametrosProcedure(index = 18)
	private String numAtivoCev;
	@SequenciaParametrosProcedure(index = 19)
	private String codigoMotivoOcorrencia;
	@SequenciaParametrosProcedure(index = 20)
    private String flagDev;
	@SequenciaParametrosProcedure(index = 21)
    private String codigoBandaPreco;
	@SequenciaParametrosProcedure(index = 22)
    private String codigoAcaoSolavanco;
	@SequenciaParametrosProcedure(index = 23)
    private int itemAlteradoBandaPreco;
	@SequenciaParametrosProcedure(index = 24)
    private int itemOrigemAcaoSolavanco;
	@SequenciaParametrosProcedure(index = 25)
    private String tipoRecolhimento;
	@SequenciaParametrosProcedure(index = 26)
    private String permiteAlterarQtdBonificada;
	@SequenciaParametrosProcedure(index = 27)
    private int acaoQtdAutorizada;
	@SequenciaParametrosProcedure(index = 28)
    private BigDecimal bonusGerado;
	@SequenciaParametrosProcedure(index = 29)
    private BigDecimal valorImpostoBarreira;
	@SequenciaParametrosProcedure(index = 30)
    private BigDecimal bonusUtilizado;
	@SequenciaParametrosProcedure(index = 31)
    private int faixaBandaOrigem;
	@SequenciaParametrosProcedure(index = 32)
    private int perfilTabela;
	@SequenciaParametrosProcedure(index = 33)
    private BigDecimal valorVerbaUtilizadaGL;
	@SequenciaParametrosProcedure(index = 34)
    private int codigoVerbaGeradaGL;
	@SequenciaParametrosProcedure(index = 35)
    private String itemValidadoBonificaoAutomatica;
	@SequenciaParametrosProcedure(index = 36)
    private int horaInicialPedido;
	@SequenciaParametrosProcedure(index = 37)
	private String ultimoItem;


	@SequenciaParametrosProcedure(index = 38, isRetornoProcedure = true)
	private int statusRetorno;

	@SequenciaParametrosProcedure(index = 39, isRetornoProcedure = true)
	private String msgRetorno;

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

	@Override
	public String toString() {
		return "PedidoItemTO [recId=" + recId + ", codigoEmpresa=" + codigoEmpresa + ", numeroPrePedidoGestao="
				+ numeroPrePedidoGestao + ", sequenciaItem=" + sequenciaItem + ", codigoOcorrencia=" + codigoOcorrencia
				+ ", codigoReduzidoProduto=" + codigoReduzidoProduto + ", quantidadeCaixa=" + quantidadeCaixa
				+ ", quantidadeAvulsa=" + quantidadeAvulsa + ", codigoTabelaPreco=" + codigoTabelaPreco + ", desconto="
				+ desconto + ", valorLiquido=" + valorLiquido + ", valorBruto=" + valorBruto + ", precoUnitarioCaixa="
				+ precoUnitarioCaixa + ", precoUnitarioAvulso=" + precoUnitarioAvulso + ", carga=" + carga
				+ ", valorBonificado=" + valorBonificado + ", valorDesconto=" + valorDesconto + ", valorVerba="
				+ valorVerba + ", numAtivoCev=" + numAtivoCev + ", codigoMotivoOcorrencia=" + codigoMotivoOcorrencia
				+ ", flagDev=" + flagDev + ", codigoBandaPreco=" + codigoBandaPreco + ", codigoAcaoSolavanco="
				+ codigoAcaoSolavanco + ", itemAlteradoBandaPreco=" + itemAlteradoBandaPreco
				+ ", itemOrigemAcaoSolavanco=" + itemOrigemAcaoSolavanco + ", tipoRecolhimento=" + tipoRecolhimento
				+ ", permiteAlterarQtdBonificada=" + permiteAlterarQtdBonificada + ", acaoQtdAutorizada="
				+ acaoQtdAutorizada + ", bonusGerado=" + bonusGerado + ", valorImpostoBarreira=" + valorImpostoBarreira
				+ ", bonusUtilizado=" + bonusUtilizado + ", faixaBandaOrigem=" + faixaBandaOrigem + ", perfilTabela="
				+ perfilTabela + ", valorVerbaUtilizadaGL=" + valorVerbaUtilizadaGL + ", codigoVerbaGeradaGL="
				+ codigoVerbaGeradaGL + ", itemValidadoBonificaoAutomatica=" + itemValidadoBonificaoAutomatica
				+ ", horaInicialPedido=" + horaInicialPedido + ", statusRetorno=" + statusRetorno + ", msgRetorno="
				+ msgRetorno + "]";
	}

	
	
	
}