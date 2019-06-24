package br.com.control.portal.mensageria.to;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

import br.com.control.annotation.SequenciaParametrosProcedure;
import br.com.control.vendas.cadastro.modelo.cliente.Cliente;

/**
 * @author rasa.lariguet
 *
 */
public class ClienteTO implements Serializable {

	private static final long serialVersionUID = 1L;

	@SequenciaParametrosProcedure(index = 1)
	private int codigoEmpresa;
	@SequenciaParametrosProcedure(index = 2)
	private String contato = "";
	@SequenciaParametrosProcedure(index = 3)
	private String email = "";
	@SequenciaParametrosProcedure(index = 4)
	private String cargo;
	@SequenciaParametrosProcedure(index = 5)
	private int telefoneDdd;
	@SequenciaParametrosProcedure(index = 6)
	private int telefoneTronco;
	@SequenciaParametrosProcedure(index = 7)
	private int celularDdd;
	@SequenciaParametrosProcedure(index = 8)
	private  String celular = "";
	@SequenciaParametrosProcedure(index = 9)
	private String razaoSocial;
	@SequenciaParametrosProcedure(index = 10)
	private String sigla = "";
	@SequenciaParametrosProcedure(index = 11)
	private String cpfCnpj;
	@SequenciaParametrosProcedure(index = 12)
	private String rg = "";

	// ENDERECO FATURAMENTO
	@SequenciaParametrosProcedure(index = 13)
	private String tipoLogradouroFaturamento;
	@SequenciaParametrosProcedure(index = 14)
	private String enderecoFaturamento;
	@SequenciaParametrosProcedure(index = 15)
	private String numeroFaturamento;
	@SequenciaParametrosProcedure(index = 16)
	private String pontoReferenciaFaturamento;
	@SequenciaParametrosProcedure(index = 17)
	private String bairroFaturamento;
	@SequenciaParametrosProcedure(index = 18)
	private String municipioFaturamento;
	@SequenciaParametrosProcedure(index = 19)
	private String ufEnderecoFaturamento;
	@SequenciaParametrosProcedure(index = 20)
	private int cepEnderecoFaturamento;

	// ENDERECO COBRANCA
	@SequenciaParametrosProcedure(index = 21)
	private String tipoLogradouroCobranca;
	@SequenciaParametrosProcedure(index = 22)
	private String enderecoCobranca;
	@SequenciaParametrosProcedure(index = 23)
	private String numeroCobranca;
	@SequenciaParametrosProcedure(index = 24)
	private String pontoReferenciaCobranca;
	@SequenciaParametrosProcedure(index = 25)
	private String bairroCobranca;
	@SequenciaParametrosProcedure(index = 26)
	private String municipioCobranca;
	@SequenciaParametrosProcedure(index = 27)
	private String ufEnderecoCobranca;
	@SequenciaParametrosProcedure(index = 28)
	private int cepEnderecoCobranca;

	// ENDERECO ENTREGA
	@SequenciaParametrosProcedure(index = 29)
	private String tipoLogradouroEntrega;
	@SequenciaParametrosProcedure(index = 30)
	private String enderecoEntrega;
	@SequenciaParametrosProcedure(index = 31)
	private String numeroEntrega;
	@SequenciaParametrosProcedure(index = 32)
	private String pontoReferenciaEntrega;
	@SequenciaParametrosProcedure(index = 33)
	private String bairroEntrega;
	@SequenciaParametrosProcedure(index = 34)
	private String municipioEntrega;
	@SequenciaParametrosProcedure(index = 35)
	private String ufEnderecoEntrega;
	@SequenciaParametrosProcedure(index = 36)
	private int cepEnderecoEntrega;

	@SequenciaParametrosProcedure(index = 37)
	private int codigoTabpreco;
	
	
	@SequenciaParametrosProcedure(index = 38)
	private String origem;
	@SequenciaParametrosProcedure(index = 39)
	private String canal = "";
	@SequenciaParametrosProcedure(index = 40)
	private String motivoBloqueio = "";
	@SequenciaParametrosProcedure(index = 41)
	private String inscricaoEstadual = "";
	@SequenciaParametrosProcedure(index = 42)
	private int condicaoPagamento;
	@SequenciaParametrosProcedure(index = 43)
	private int tipoCobranca;
	@SequenciaParametrosProcedure(index = 44)
	private int subCanal;
	@SequenciaParametrosProcedure(index = 45)
	private BigDecimal latitude;
	@SequenciaParametrosProcedure(index = 46)
	private BigDecimal longitude;
	@SequenciaParametrosProcedure(index = 47)
	private String vendedor = "";
	@SequenciaParametrosProcedure(index = 48)
	private int codigoPasta;
	@SequenciaParametrosProcedure(index = 49)
	private int sequenciaPasta;
	@SequenciaParametrosProcedure(index = 50)
	private int regiaoInclusao;
	@SequenciaParametrosProcedure(index = 51)
	private int classe;
	@SequenciaParametrosProcedure(index = 52)
	private int alterado;

	@SequenciaParametrosProcedure(index = 53, isRetornoProcedure = true)
	private int statusMsg;

	@SequenciaParametrosProcedure(index = 54, isRetornoProcedure = true)
	private String msg;
	
	

	private String codigoErp;
	private Boolean abateIcms;
	private Boolean ativo;
	private float bonusDisponivel;
	private Boolean desprezaTaxaFinanceira;
	private String diaSemana;
	private int diasEntrega;
	private Boolean ignoraBandaPreco;
	private float limiteCredito;
	private String motivoBloqClasse20;
	private String motivoBloqueioJuridico;
	private String numeroCliente;
	private int pasta;

	private String regiaoCliente;
	private int registroAlterado;
	private Boolean restricaoComercial;
	private String inconformidadeCadastro;


	private int usoVerbaRestritoProduto;
	private String codigoErpCanal;
	private String codigoErpCondicaoPagamento;
	private String codigoErpTipoCobranca;
	
	
	private TipoCobrancaClienteTO tipoCobrancaClienteTO;
	private List<VendedorClienteTO> vendedoresClienteTO;
	private List<ClienteEnderecoTO> enderecosClienteTO;
	
	
	public List<ClienteEnderecoTO> getEnderecosClienteTO() {
		return enderecosClienteTO;
	}

	public void setEnderecosClienteTO(List<ClienteEnderecoTO> enderecosClienteTO) {
		this.enderecosClienteTO = enderecosClienteTO;
	}

	public TipoCobrancaClienteTO getTipoCobrancaClienteTO() {
		return tipoCobrancaClienteTO;
	}

	public void setTipoCobrancaClienteTO(TipoCobrancaClienteTO tipoCobrancaClienteTO) {
		this.tipoCobrancaClienteTO = tipoCobrancaClienteTO;
	}


	public List<VendedorClienteTO> getVendedoresClienteTO() {
		return vendedoresClienteTO;
	}

	public void setVendedoresClienteTO(List<VendedorClienteTO> vendedoresClienteTO) {
		this.vendedoresClienteTO = vendedoresClienteTO;
	}

	public int getStatusMsg() {
		return statusMsg;
	}

	public void setStatusMsg(int statusMsg) {
		this.statusMsg = statusMsg;
	}

	public String getMsg() {
		if (msg == null) {
			msg = "";
		}
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public String getRg() {
		if (rg == null) {
			rg = "";
		}
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public String getTipoLogradouroFaturamento() {
		return tipoLogradouroFaturamento;
	}

	public void setTipoLogradouroFaturamento(String tipoLogradouroFaturamento) {
		this.tipoLogradouroFaturamento = tipoLogradouroFaturamento;
	}

	public String getTipoLogradouroEntrega() {
		return tipoLogradouroEntrega;
	}

	public void setTipoLogradouroEntrega(String tipoLogradouroEntrega) {
		this.tipoLogradouroEntrega = tipoLogradouroEntrega;
	}

	public String getTipoLogradouroCobranca() {
		return tipoLogradouroCobranca;
	}

	public void setTipoLogradouroCobranca(String tipoLogradouroCobranca) {
		this.tipoLogradouroCobranca = tipoLogradouroCobranca;
	}

	public int getCodigoEmpresa() {
		return codigoEmpresa;
	}

	public void setCodigoEmpresa(int codigoEmpresa) {
		this.codigoEmpresa = codigoEmpresa;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo == null ? "-" : cargo;
	}

	public String getBairroEntrega() {
		return bairroEntrega;
	}

	public void setBairroEntrega(String bairroEntrega) {
		this.bairroEntrega = bairroEntrega;
	}

	public int getCepEnderecoEntrega() {
		return cepEnderecoEntrega;
	}

	public void setCepEnderecoEntrega(int cepEnderecoEntrega) {
		this.cepEnderecoEntrega = cepEnderecoEntrega;
	}

	public String getEnderecoEntrega() {
		return enderecoEntrega;
	}

	public void setEnderecoEntrega(String enderecoEntrega) {
		this.enderecoEntrega = enderecoEntrega;
	}

	public String getMunicipioEntrega() {
		return municipioEntrega;
	}

	public void setMunicipioEntrega(String municipioEntrega) {
		this.municipioEntrega = municipioEntrega;
	}

	public String getNumeroEntrega() {
		return numeroEntrega;
	}

	public void setNumeroEntrega(String numeroEntrega) {
		this.numeroEntrega = numeroEntrega;
	}

	public String getPontoReferenciaEntrega() {
		if (pontoReferenciaEntrega == null) {
			pontoReferenciaEntrega = "";
		}
		return pontoReferenciaEntrega;
	}

	public void setPontoReferenciaEntrega(String pontoReferenciaEntrega) {
		this.pontoReferenciaEntrega = pontoReferenciaEntrega;
	}

	public String getUfEnderecoEntrega() {
		return ufEnderecoEntrega;
	}

	public void setUfEnderecoEntrega(String ufEnderecoEntrega) {
		this.ufEnderecoEntrega = ufEnderecoEntrega;
	}

	public String getBairroCobranca() {
		return bairroCobranca;
	}

	public void setBairroCobranca(String bairroCobranca) {
		this.bairroCobranca = bairroCobranca;
	}

	public int getCepEnderecoCobranca() {
		return cepEnderecoCobranca;
	}

	public void setCepEnderecoCobranca(int cepEnderecoCobranca) {
		this.cepEnderecoCobranca = cepEnderecoCobranca;
	}

	public String getEnderecoCobranca() {
		return enderecoCobranca;
	}

	public void setEnderecoCobranca(String enderecoCobranca) {
		this.enderecoCobranca = enderecoCobranca;
	}

	public String getMunicipioCobranca() {
		return municipioCobranca;
	}

	public void setMunicipioCobranca(String municipioCobranca) {
		this.municipioCobranca = municipioCobranca;
	}

	public String getNumeroCobranca() {
		return numeroCobranca;
	}

	public void setNumeroCobranca(String numeroCobranca) {
		this.numeroCobranca = numeroCobranca;
	}

	public String getPontoReferenciaCobranca() {
		if (pontoReferenciaCobranca == null) {
			pontoReferenciaCobranca = "";
		}
		return pontoReferenciaCobranca;
	}

	public void setPontoReferenciaCobranca(String pontoReferenciaCobranca) {
		this.pontoReferenciaCobranca = pontoReferenciaCobranca;
	}

	public String getUfEnderecoCobranca() {
		return ufEnderecoCobranca;
	}

	public void setUfEnderecoCobranca(String ufEnderecoCobranca) {
		this.ufEnderecoCobranca = ufEnderecoCobranca;
	}

	public String getBairroFaturamento() {
		return bairroFaturamento;
	}

	public void setBairroFaturamento(String bairroFaturamento) {
		this.bairroFaturamento = bairroFaturamento;
	}

	public int getCepEnderecoFaturamento() {
		return cepEnderecoFaturamento;
	}

	public void setCepEnderecoFaturamento(int cepEnderecoFaturamento) {
		this.cepEnderecoFaturamento = cepEnderecoFaturamento;
	}

	public String getEnderecoFaturamento() {
		return enderecoFaturamento;
	}

	public void setEnderecoFaturamento(String enderecoFaturamento) {
		this.enderecoFaturamento = enderecoFaturamento;
	}

	public String getMunicipioFaturamento() {
		return municipioFaturamento;
	}

	public void setMunicipioFaturamento(String municipioFaturamento) {
		this.municipioFaturamento = municipioFaturamento;
	}

	public String getNumeroFaturamento() {
		return numeroFaturamento;
	}

	public void setNumeroFaturamento(String numeroFaturamento) {
		this.numeroFaturamento = numeroFaturamento;
	}

	public String getPontoReferenciaFaturamento() {
		if (pontoReferenciaFaturamento == null) {
			pontoReferenciaFaturamento = "";
		}
		return pontoReferenciaFaturamento;
	}

	public void setPontoReferenciaFaturamento(String pontoReferenciaFaturamento) {
		this.pontoReferenciaFaturamento = pontoReferenciaFaturamento;
	}

	public String getUfEnderecoFaturamento() {
		return ufEnderecoFaturamento;
	}

	public void setUfEnderecoFaturamento(String ufEnderecoFaturamento) {
		this.ufEnderecoFaturamento = ufEnderecoFaturamento;
	}

	public int getCelularDdd() {
		return celularDdd;
	}

	public void setCelularDdd(int celularDdd) {
		this.celularDdd = celularDdd;
	}

	public String getCelular() {
		return celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}

	public String getCodigoErp() {
		return codigoErp;
	}

	public void setCodigoErp(String codigoErp) {
		this.codigoErp = codigoErp;
	}

	public Boolean getAbateIcms() {
		return abateIcms;
	}

	public void setAbateIcms(Boolean abateIcms) {
		this.abateIcms = abateIcms;
	}

	public Boolean getAtivo() {
		return ativo;
	}

	public void setAtivo(Boolean ativo) {
		this.ativo = ativo;
	}

	public float getBonusDisponivel() {
		return bonusDisponivel;
	}

	public void setBonusDisponivel(float bonusDisponivel) {
		this.bonusDisponivel = bonusDisponivel;
	}

	public int getCodigoTabpreco() {
		return codigoTabpreco;
	}

	public void setCodigoTabpreco(int codigoTabpreco) {
		this.codigoTabpreco = codigoTabpreco;
	}

	public String getContato() {
		return contato;
	}

	public void setContato(String contato) {
		this.contato = contato;
	}

	public String getCpfCnpj() {
		return cpfCnpj;
	}

	public void setCpfCnpj(String cpfCnpj) {
		this.cpfCnpj = cpfCnpj;
	}

	public Boolean getDesprezaTaxaFinanceira() {
		return desprezaTaxaFinanceira;
	}

	public void setDesprezaTaxaFinanceira(Boolean desprezaTaxaFinanceira) {
		this.desprezaTaxaFinanceira = desprezaTaxaFinanceira;
	}

	public String getDiaSemana() {
		return diaSemana;
	}

	public void setDiaSemana(String diaSemana) {
		this.diaSemana = diaSemana;
	}

	public int getDiasEntrega() {
		return diasEntrega;
	}

	public void setDiasEntrega(int diasEntrega) {
		this.diasEntrega = diasEntrega;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Boolean getIgnoraBandaPreco() {
		return ignoraBandaPreco;
	}

	public void setIgnoraBandaPreco(Boolean ignoraBandaPreco) {
		this.ignoraBandaPreco = ignoraBandaPreco;
	}

	public float getLimiteCredito() {
		return limiteCredito;
	}

	public void setLimiteCredito(float limiteCredito) {
		this.limiteCredito = limiteCredito;
	}

	public String getMotivoBloqClasse20() {
		return motivoBloqClasse20;
	}

	public void setMotivoBloqClasse20(String motivoBloqClasse20) {
		this.motivoBloqClasse20 = motivoBloqClasse20;
	}

	public String getMotivoBloqueioJuridico() {
		return motivoBloqueioJuridico;
	}

	public void setMotivoBloqueioJuridico(String motivoBloqueioJuridico) {
		this.motivoBloqueioJuridico = motivoBloqueioJuridico;
	}

	public String getNumeroCliente() {
		return numeroCliente;
	}

	public void setNumeroCliente(String numeroCliente) {
		this.numeroCliente = numeroCliente;
	}

	public int getPasta() {
		return pasta;
	}

	public void setPasta(int pasta) {
		this.pasta = pasta;
	}

	public String getRazaoSocial() {
		return razaoSocial;
	}

	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}

	public String getRegiaoCliente() {
		return regiaoCliente;
	}

	public void setRegiaoCliente(String regiaoCliente) {
		this.regiaoCliente = regiaoCliente;
	}

	public int getRegistroAlterado() {
		return registroAlterado;
	}

	public void setRegistroAlterado(int registroAlterado) {
		this.registroAlterado = registroAlterado;
	}

	public Boolean getRestricaoComercial() {
		return restricaoComercial;
	}

	public void setRestricaoComercial(Boolean restricaoComercial) {
		this.restricaoComercial = restricaoComercial;
	}

	public String getInconformidadeCadastro() {
		return inconformidadeCadastro;
	}

	public void setInconformidadeCadastro(String inconformidadeCadastro) {
		this.inconformidadeCadastro = inconformidadeCadastro;
	}

	public String getSigla() {
		return sigla;
	}

	public void setSigla(String sigla) {
		this.sigla = sigla;
	}


	public int getTelefoneDdd() {
		return telefoneDdd;
	}

	public void setTelefoneDdd(int telefoneDdd) {
		this.telefoneDdd = telefoneDdd;
	}

	public int getTelefoneTronco() {
		return telefoneTronco;
	}

	public void setTelefoneTronco(int telefoneTronco) {
		this.telefoneTronco = telefoneTronco;
	}

	public int getUsoVerbaRestritoProduto() {
		return usoVerbaRestritoProduto;
	}

	public void setUsoVerbaRestritoProduto(int usoVerbaRestritoProduto) {
		this.usoVerbaRestritoProduto = usoVerbaRestritoProduto;
	}

	public String getCodigoErpCanal() {
		return codigoErpCanal;
	}

	public void setCodigoErpCanal(String codigoErpCanal) {
		this.codigoErpCanal = codigoErpCanal;
	}

	public String getCodigoErpCondicaoPagamento() {
		return codigoErpCondicaoPagamento;
	}

	public void setCodigoErpCondicaoPagamento(String codigoErpCondicaoPagamento) {
		this.codigoErpCondicaoPagamento = codigoErpCondicaoPagamento;
	}

	public String getCodigoErpTipoCobranca() {
		return codigoErpTipoCobranca;
	}

	public void setCodigoErpTipoCobranca(String codigoErpTipoCobranca) {
		this.codigoErpTipoCobranca = codigoErpTipoCobranca;
	}

	public ClienteTO() {
	}

	public ClienteTO(Cliente cliente) {

		this.codigoErp = cliente.getCodigoErp();
		this.abateIcms = cliente.getAbateIcms();
		this.ativo = cliente.getAtivo();
		this.bonusDisponivel = cliente.getBonusDisponivel();
		this.classe = Integer.valueOf(cliente.getClasse());
		this.codigoTabpreco = Integer.valueOf(cliente.getCodigoTabpreco());
		this.contato = cliente.getContato();
		this.cpfCnpj = cliente.getCpfCnpj();
		this.desprezaTaxaFinanceira = cliente.getDesprezaTaxaFinanceira();
		this.diaSemana = cliente.getDiaSemana();
		this.diasEntrega = cliente.getDiasEntrega();
		this.email = cliente.getEmail();
		this.ignoraBandaPreco = cliente.getIgnoraBandaPreco();
		this.limiteCredito = cliente.getLimiteCredito();
		this.motivoBloqClasse20 = cliente.getMotivoBloqClasse20();
		this.motivoBloqueioJuridico = cliente.getMotivoBloqueioJuridico();
		this.numeroCliente = cliente.getNumeroCliente();
		this.pasta = cliente.getPasta();
		this.razaoSocial = cliente.getRazaoSocial();
		this.regiaoCliente = cliente.getRegiaoCliente();
		this.registroAlterado = cliente.getRegistroAlterado();
		this.restricaoComercial = cliente.getRestricaoComercial();
		this.inconformidadeCadastro = cliente.getInconformidadeCadastro();
		this.sigla = cliente.getSigla();
		this.subCanal = Integer.valueOf(cliente.getSubCanal());
		this.telefoneDdd = Integer.valueOf(cliente.getTelefoneDdd());
		this.telefoneTronco = Integer.valueOf(cliente.getTelefoneTronco());
		this.usoVerbaRestritoProduto = cliente.getUsoVerbaRestritoProduto();
		this.codigoErpCanal = cliente.getCodigoErpCanal();
		this.codigoErpCondicaoPagamento = cliente.getCodigoErpCondicaoPagamento();
		this.codigoErpTipoCobranca = cliente.getCodigoErpTipoCobranca();
		this.celular = cliente.getCelular();
		this.cargo = "teste";
	}

	public String getOrigem() {
		return origem;
	}

	public void setOrigem(String origem) {
		this.origem = origem;
	}

	public String getCanal() {
		return canal;
	}

	public void setCanal(String canal) {
		this.canal = canal;
	}

	public String getMotivoBloqueio() {
		return motivoBloqueio;
	}

	public void setMotivoBloqueio(String motivoBloqueio) {
		this.motivoBloqueio = motivoBloqueio;
	}

	public String getInscricaoEstadual() {
		return inscricaoEstadual;
	}

	public void setInscricaoEstadual(String inscricaoEstadual) {
		this.inscricaoEstadual = inscricaoEstadual;
	}

	public int getCondicaoPagamento() {
		return condicaoPagamento;
	}

	public void setCondicaoPagamento(int condicaoPagamento) {
		this.condicaoPagamento = condicaoPagamento;
	}

	public int getTipoCobranca() {
		return tipoCobranca;
	}

	public void setTipoCobranca(int tipoCobranca) {
		this.tipoCobranca = tipoCobranca;
	}

	public int getSubCanal() {
		return subCanal;
	}

	public void setSubCanal(int subCanal) {
		this.subCanal = subCanal;
	}

	public BigDecimal getLatitude() {
		return latitude;
	}

	public void setLatitude(BigDecimal latitude) {
		this.latitude = latitude;
	}

	public BigDecimal getLongitude() {
		return longitude;
	}

	public void setLongitude(BigDecimal longitude) {
		this.longitude = longitude;
	}

	public String getVendedor() {
		return vendedor;
	}

	public void setVendedor(String vendedor) {
		this.vendedor = vendedor;
	}

	public int getCodigoPasta() {
		return codigoPasta;
	}

	public void setCodigoPasta(int codigoPasta) {
		this.codigoPasta = codigoPasta;
	}

	public int getSequenciaPasta() {
		return sequenciaPasta;
	}

	public void setSequenciaPasta(int sequenciaPasta) {
		this.sequenciaPasta = sequenciaPasta;
	}

	public int getRegiaoInclusao() {
		return regiaoInclusao;
	}

	public void setRegiaoInclusao(int regiaoInclusao) {
		this.regiaoInclusao = regiaoInclusao;
	}

	public int getClasse() {
		return classe;
	}

	public void setClasse(int classe) {
		this.classe = classe;
	}

	public int getAlterado() {
		return alterado;
	}

	public void setAlterado(int alterado) {
		this.alterado = alterado;
	}

	@Override
	public String toString() {
		return "ClienteTO [codigoEmpresa=" + codigoEmpresa + ", contato=" + contato + ", email=" + email + ", cargo="
				+ cargo + ", telefoneDdd=" + telefoneDdd + ", telefoneTronco=" + telefoneTronco + ", celularDdd="
				+ celularDdd + ", celular=" + celular + ", razaoSocial=" + razaoSocial + ", sigla=" + sigla
				+ ", cpfCnpj=" + cpfCnpj + ", rg=" + rg + ", tipoLogradouroFaturamento=" + tipoLogradouroFaturamento
				+ ", enderecoFaturamento=" + enderecoFaturamento + ", numeroFaturamento=" + numeroFaturamento
				+ ", pontoReferenciaFaturamento=" + pontoReferenciaFaturamento + ", bairroFaturamento="
				+ bairroFaturamento + ", municipioFaturamento=" + municipioFaturamento + ", ufEnderecoFaturamento="
				+ ufEnderecoFaturamento + ", cepEnderecoFaturamento=" + cepEnderecoFaturamento
				+ ", tipoLogradouroCobranca=" + tipoLogradouroCobranca + ", enderecoCobranca=" + enderecoCobranca
				+ ", numeroCobranca=" + numeroCobranca + ", pontoReferenciaCobranca=" + pontoReferenciaCobranca
				+ ", bairroCobranca=" + bairroCobranca + ", municipioCobranca=" + municipioCobranca
				+ ", ufEnderecoCobranca=" + ufEnderecoCobranca + ", cepEnderecoCobranca=" + cepEnderecoCobranca
				+ ", tipoLogradouroEntrega=" + tipoLogradouroEntrega + ", enderecoEntrega=" + enderecoEntrega
				+ ", numeroEntrega=" + numeroEntrega + ", pontoReferenciaEntrega=" + pontoReferenciaEntrega
				+ ", bairroEntrega=" + bairroEntrega + ", municipioEntrega=" + municipioEntrega + ", ufEnderecoEntrega="
				+ ufEnderecoEntrega + ", cepEnderecoEntrega=" + cepEnderecoEntrega + ", codigoTabpreco="
				+ codigoTabpreco + ", origem=" + origem + ", canal=" + canal + ", motivoBloqueio=" + motivoBloqueio
				+ ", inscricaoEstadual=" + inscricaoEstadual + ", condicaoPagamento=" + condicaoPagamento
				+ ", tipoCobranca=" + tipoCobranca + ", subCanal=" + subCanal + ", latitude=" + latitude
				+ ", longitude=" + longitude + ", vendedor=" + vendedor + ", codigoPasta=" + codigoPasta
				+ ", sequenciaPasta=" + sequenciaPasta + ", regiaoInclusao=" + regiaoInclusao + ", classe=" + classe
				+ ", alterado=" + alterado + ", statusMsg=" + statusMsg + ", msg=" + msg + ", codigoErp=" + codigoErp
				+ ", abateIcms=" + abateIcms + ", ativo=" + ativo + ", bonusDisponivel=" + bonusDisponivel
				+ ", desprezaTaxaFinanceira=" + desprezaTaxaFinanceira + ", diaSemana=" + diaSemana + ", diasEntrega="
				+ diasEntrega + ", ignoraBandaPreco=" + ignoraBandaPreco + ", limiteCredito=" + limiteCredito
				+ ", motivoBloqClasse20=" + motivoBloqClasse20 + ", motivoBloqueioJuridico=" + motivoBloqueioJuridico
				+ ", numeroCliente=" + numeroCliente + ", pasta=" + pasta + ", regiaoCliente=" + regiaoCliente
				+ ", registroAlterado=" + registroAlterado + ", restricaoComercial=" + restricaoComercial
				+ ", inconformidadeCadastro=" + inconformidadeCadastro + ", usoVerbaRestritoProduto="
				+ usoVerbaRestritoProduto + ", codigoErpCanal=" + codigoErpCanal + ", codigoErpCondicaoPagamento="
				+ codigoErpCondicaoPagamento + ", codigoErpTipoCobranca=" + codigoErpTipoCobranca + "]";
	}
	
	
	
	

}
