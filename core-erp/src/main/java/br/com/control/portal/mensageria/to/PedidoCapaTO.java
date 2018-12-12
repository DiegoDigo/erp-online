package br.com.control.portal.mensageria.to;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import br.com.control.annotation.SequenciaParametrosProcedure;

public class PedidoCapaTO implements Serializable {
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

	@SequenciaParametrosProcedure(index = 12)
	private int regiao;
	@SequenciaParametrosProcedure(index = 13)
	private int dia;
	@SequenciaParametrosProcedure(index = 14)
	private int carga;
	@SequenciaParametrosProcedure(index = 15)
	private String rota;
	@SequenciaParametrosProcedure(index = 16)
	private BigDecimal valorBruto;
	@SequenciaParametrosProcedure(index = 17)
	private BigDecimal valorLiquidoSFA;
	@SequenciaParametrosProcedure(index = 18)
	private BigDecimal valorBonificado;
	@SequenciaParametrosProcedure(index = 19)
	private BigDecimal valorDesconto;
	@SequenciaParametrosProcedure(index = 20)
	private BigDecimal valorVerba;
	@SequenciaParametrosProcedure(index = 21)
	private BigDecimal valorFinal;
	@SequenciaParametrosProcedure(index = 22)
	private String codigoMotivoNaoCompra;
	@SequenciaParametrosProcedure(index = 23)
	private Long horaInicialPedido;
	@SequenciaParametrosProcedure(index = 24)
	private Long horaFinalPedido;
	@SequenciaParametrosProcedure(index = 25)
	private String statusTransmitidoWebService;
	@SequenciaParametrosProcedure(index = 26)
	private String pedidoAberto;
	@SequenciaParametrosProcedure(index = 27)
	private String pedidoBloqueado;
	@SequenciaParametrosProcedure(index = 28)
	private int duracaoPedido;
	@SequenciaParametrosProcedure(index = 29)
	private BigDecimal gpsLatitude;
	@SequenciaParametrosProcedure(index = 30)
	private BigDecimal gpsLongitude;
	@SequenciaParametrosProcedure(index = 31)
	private String tecnologiaUtiliz;
	@SequenciaParametrosProcedure(index = 32)
	private int distanciaGPS;
	@SequenciaParametrosProcedure(index = 33)
	private int qtdSatelites;
	@SequenciaParametrosProcedure(index = 34)
	private String imediato;
	@SequenciaParametrosProcedure(index = 35)
	private BigDecimal bonusUtilizado;
	@SequenciaParametrosProcedure(index = 36)
	private String observacao;
	@SequenciaParametrosProcedure(index = 37)
	private BigDecimal valorImpostoBarreira;
	@SequenciaParametrosProcedure(index = 38)
	private BigDecimal valorVerbaGeradaGL;
	@SequenciaParametrosProcedure(index = 39)
	private BigDecimal valorVerbaUtilizadaGL;
	@SequenciaParametrosProcedure(index = 40)
	private int pedidoTransmitido;
	@SequenciaParametrosProcedure(index = 41)
	private int desbloqueioGPSERP;
	
	@SequenciaParametrosProcedure(index = 42)
	private int dataPrimeiraParcela=0;

	@SequenciaParametrosProcedure(index = 43)
	private int codigoErpTerceiro=0;

	@SequenciaParametrosProcedure(index = 44, isRetornoProcedure = true)
	private long numeroPrePedidoGestao;
	@SequenciaParametrosProcedure(index = 45, isRetornoProcedure = true)
	private int statusRetorno;
	@SequenciaParametrosProcedure(index = 46, isRetornoProcedure = true)
	private String msgRetorno = "";

	private List<PedidoItemTO> itens = new ArrayList<>();

	@Override
	public String toString() {
		return "PedidoCapaTO [recId=" + recId + ", codigoEmpresa=" + codigoEmpresa + ", codigoClienteErp="
				+ codigoClienteErp + ", cpfCnpj=" + cpfCnpj + ", origem=" + origem + ", codigoVendedor="
				+ codigoVendedor + ", tipoCobranca=" + tipoCobranca + ", condicaoPagamento=" + condicaoPagamento
				+ ", desconto=" + desconto + ", percTaxaFinanc=" + percTaxaFinanc + ", valorLiquido=" + valorLiquido
				+ ", dataEmissao=" + dataEmissao + ", regiao=" + regiao + ", dia=" + dia + ", carga=" + carga
				+ ", rota=" + rota + ", valorBruto=" + valorBruto + ", valorLiquidoSFA=" + valorLiquidoSFA
				+ ", valorBonificado=" + valorBonificado + ", valorDesconto=" + valorDesconto + ", valorVerba="
				+ valorVerba + ", valorFinal=" + valorFinal + ", codigoMotivoNaoCompra=" + codigoMotivoNaoCompra
				+ ", horaInicialPedido=" + horaInicialPedido + ", horaFinalPedido=" + horaFinalPedido
				+ ", statusTransmitidoWebService=" + statusTransmitidoWebService + ", pedidoAberto=" + pedidoAberto
				+ ", pedidoBloqueado=" + pedidoBloqueado + ", duracaoPedido=" + duracaoPedido + ", gpsLatitude="
				+ gpsLatitude + ", gpsLongitude=" + gpsLongitude + ", tecnologiaUtiliz=" + tecnologiaUtiliz
				+ ", distanciaGPS=" + distanciaGPS + ", qtdSatelites=" + qtdSatelites + ", imediato=" + imediato
				+ ", bonusUtilizado=" + bonusUtilizado + ", observacao=" + observacao + ", valorImpostoBarreira="
				+ valorImpostoBarreira + ", valorVerbaGeradaGL=" + valorVerbaGeradaGL + ", valorVerbaUtilizadaGL="
				+ valorVerbaUtilizadaGL + ", pedidoTransmitido=" + pedidoTransmitido +  ", desbloqueioGPSERP="
				+ desbloqueioGPSERP + ", numeroPrePedidoGestao=" + numeroPrePedidoGestao + ", statusRetorno="
				+ statusRetorno + ", msgRetorno=" + msgRetorno + ", itens=" + itens + "]";
	}

	public int getRegiao() {
		return regiao;
	}

	public void setRegiao(int regiao) {
		this.regiao = regiao;
	}

	public int getDia() {
		return dia;
	}

	public void setDia(int dia) {
		this.dia = dia;
	}

	public int getCarga() {
		return carga;
	}

	public void setCarga(int carga) {
		this.carga = carga;
	}

	public String getRota() {
		return rota;
	}

	public void setRota(String rota) {
		this.rota = rota;
	}

	public BigDecimal getValorBruto() {
		return valorBruto;
	}

	public void setValorBruto(BigDecimal valorBruto) {
		this.valorBruto = valorBruto;
	}

	public BigDecimal getValorLiquidoSFA() {
		return valorLiquidoSFA;
	}

	public void setValorLiquidoSFA(BigDecimal valorLiquidoSFA) {
		this.valorLiquidoSFA = valorLiquidoSFA;
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

	public BigDecimal getValorFinal() {
		return valorFinal;
	}

	public void setValorFinal(BigDecimal valorFinal) {
		this.valorFinal = valorFinal;
	}

	public String getCodigoMotivoNaoCompra() {
		return codigoMotivoNaoCompra;
	}

	public void setCodigoMotivoNaoCompra(String codigoMotivoNaoCompra) {
		this.codigoMotivoNaoCompra = codigoMotivoNaoCompra;
	}

	public String getStatusTransmitidoWebService() {
		return statusTransmitidoWebService;
	}

	public void setStatusTransmitidoWebService(String statusTransmitidoWebService) {
		this.statusTransmitidoWebService = statusTransmitidoWebService;
	}

	public String getPedidoAberto() {
		return pedidoAberto;
	}

	public void setPedidoAberto(String pedidoAberto) {
		this.pedidoAberto = pedidoAberto;
	}

	public String getPedidoBloqueado() {
		return pedidoBloqueado;
	}

	public void setPedidoBloqueado(String pedidoBloqueado) {
		this.pedidoBloqueado = pedidoBloqueado;
	}

	public int getDuracaoPedido() {
		return duracaoPedido;
	}

	public void setDuracaoPedido(int duracaoPedido) {
		this.duracaoPedido = duracaoPedido;
	}

	public BigDecimal getGpsLatitude() {
		return gpsLatitude;
	}

	public void setGpsLatitude(BigDecimal gpsLatitude) {
		this.gpsLatitude = gpsLatitude;
	}

	public BigDecimal getGpsLongitude() {
		return gpsLongitude;
	}

	public void setGpsLongitude(BigDecimal gpsLongitude) {
		this.gpsLongitude = gpsLongitude;
	}

	public String getTecnologiaUtiliz() {
		return tecnologiaUtiliz;
	}

	public void setTecnologiaUtiliz(String tecnologiaUtiliz) {
		this.tecnologiaUtiliz = tecnologiaUtiliz;
	}

	public int getDistanciaGPS() {
		return distanciaGPS;
	}

	public void setDistanciaGPS(int distanciaGPS) {
		this.distanciaGPS = distanciaGPS;
	}

	public int getQtdSatelites() {
		return qtdSatelites;
	}

	public void setQtdSatelites(int qtdSatelites) {
		this.qtdSatelites = qtdSatelites;
	}

	public String getImediato() {
		return imediato;
	}

	public void setImediato(String imediato) {
		this.imediato = imediato;
	}

	public BigDecimal getBonusUtilizado() {
		return bonusUtilizado;
	}

	public void setBonusUtilizado(BigDecimal bonusUtilizado) {
		this.bonusUtilizado = bonusUtilizado;
	}

	public String getObservacao() {
		return observacao;
	}

	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}

	public BigDecimal getValorImpostoBarreira() {
		return valorImpostoBarreira;
	}

	public void setValorImpostoBarreira(BigDecimal valorImpostoBarreira) {
		this.valorImpostoBarreira = valorImpostoBarreira;
	}

	public BigDecimal getValorVerbaGeradaGL() {
		return valorVerbaGeradaGL;
	}

	public void setValorVerbaGeradaGL(BigDecimal valorVerbaGeradaGL) {
		this.valorVerbaGeradaGL = valorVerbaGeradaGL;
	}

	public BigDecimal getValorVerbaUtilizadaGL() {
		return valorVerbaUtilizadaGL;
	}

	public void setValorVerbaUtilizadaGL(BigDecimal valorVerbaUtilizadaGL) {
		this.valorVerbaUtilizadaGL = valorVerbaUtilizadaGL;
	}

	public int getPedidoTransmitido() {
		return pedidoTransmitido;
	}

	public void setPedidoTransmitido(int pedidoTransmitido) {
		this.pedidoTransmitido = pedidoTransmitido;
	}


	public int getDesbloqueioGPSERP() {
		return desbloqueioGPSERP;
	}

	public void setDesbloqueioGPSERP(int desbloqueioGPSERP) {
		this.desbloqueioGPSERP = desbloqueioGPSERP;
	}

	public List<PedidoItemTO> getItens() {
		return itens;
	}

	public void setItens(List<PedidoItemTO> itens) {
		this.itens = itens;
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

	public Long getHoraInicialPedido() {
		return horaInicialPedido;
	}

	public void setHoraInicialPedido(Long horaInicialPedido) {
		this.horaInicialPedido = horaInicialPedido;
	}

	public Long getHoraFinalPedido() {
		return horaFinalPedido;
	}

	public void setHoraFinalPedido(Long horaFinalPedido) {
		this.horaFinalPedido = horaFinalPedido;
	}

	public int getDataPrimeiraParcela() {
		return dataPrimeiraParcela;
	}

	public void setDataPrimeiraParcela(int dataPrimeiraParcela) {
		this.dataPrimeiraParcela = dataPrimeiraParcela;
	}

	public int getCodigoErpTerceiro() {
		return codigoErpTerceiro;
	}

	public void setCodigoErpTerceiro(int codigoErpTerceiro) {
		this.codigoErpTerceiro = codigoErpTerceiro;
	}
}