package br.com.control.portal.mensageria.to;

import br.com.control.vendas.cadastro.modelo.pedido.pagamento.Boleto;

import java.io.Serializable;

public class BoletoTO implements Serializable {

    private static final long serialVersionUID = 1L;

    private String bancoBoleto;
    private String linhaDigitavelBoleto;
    private String nomeClienteBoleto;
    private String codigoClienteErp;
    private String dataEmissaoBoleto;
    private String dataVencimentoBoleto;
    private String agenciaCodigoBeneficiarioBoleto;
    private String nossoNumeroImpressaoBoleto;
    private String numeroDocumentoBoleto;
    private String valorDocumentoBoleto;
    private String instrucao1Boleto;
    private String instrucao2Boleto;
    private String instrucao3Boleto;
    private String instrucao4Boleto;
    private String instrucao5Boleto;
    private String instrucao6Boleto;
    private String instrucao7Boleto;
    private String instrucao8Boleto;
    private String instrucao9Boleto;
    private String localPagamentoBoleto;
    private String beneficiarioBoleto;
    private String enderecoBeneficiarioBoleto;
    private String cnpjBeneficiadrioBoleto;
    private String dataBoleto;
    private String especieDocumentoBoleto;
    private String aceiteBoleto;
    private String dataProcessamentoBoleto;
    private String usoBancoBoleto;
    private String carteiraBoleto;
    private String especieMoedaBoleto;
    private String quantidadeMoedaBoleto;
    private String valorMoedaBoleto;
    private String instrucoesBoleto;
    private String descricaoDescontoBoleto;
    private String descricaoOutraDeducoes;
    private String descricaoMoraMultaBoleto;
    private String descricaoOutrosAcrescimosBoleto;
    private String cnpjClienteBoleto;
    private String enderecoClienteBoleto;
    private String municipioUfBoleto;
    private String cepClienteBoleto;
    private String pagadorAvalistaBoleto;
    private String cnpjPagadorAvalistaBoleto;
    private String linhaSac1Boleto;
    private String linhaSac2Boleto;
    private String linhaSac3Boleto;
    private String linhaSac4Boleto;
    private String codigoBarrasBoleto;
    private String cnpjPagadorBoleto;
    private String valorDescontoBoleto;
    private String valorAcrescimoBoleto;
    private String valorCobradoBoleto;
    private String sacadorPagadorBoleto;
    private String tamanhoCodigoBarras;
    private String sequenciaBoletoGeracao;
    private String numeroBancoCnab;
    private String nossoNumero;

    public BoletoTO() {
    }

    public BoletoTO(String bancoBoleto, String linhaDigitavelBoleto, String nomeClienteBoleto, String codigoClienteErp, String dataEmissaoBoleto, String dataVencimentoBoleto, String agenciaCodigoBeneficiarioBoleto, String nossoNumeroImpressaoBoleto, String numeroDocumentoBoleto, String valorDocumentoBoleto, String instrucao1Boleto, String instrucao2Boleto, String instrucao3Boleto, String instrucao4Boleto, String instrucao5Boleto, String instrucao6Boleto, String instrucao7Boleto, String instrucao8Boleto, String instrucao9Boleto, String localPagamentoBoleto, String beneficiarioBoleto, String enderecoBeneficiarioBoleto, String cnpjBeneficiadrioBoleto, String dataBoleto, String especieDocumentoBoleto, String aceiteBoleto, String dataProcessamentoBoleto, String usoBancoBoleto, String carteiraBoleto, String especieMoedaBoleto, String quantidadeMoedaBoleto, String valorMoedaBoleto, String instrucoesBoleto, String descricaoDescontoBoleto, String descricaoOutraDeducoes, String descricaoMoraMultaBoleto, String descricaoOutrosAcrescimosBoleto, String cnpjClienteBoleto, String enderecoClienteBoleto, String municipioUfBoleto, String cepClienteBoleto, String pagadorAvalistaBoleto, String cnpjPagadorAvalistaBoleto, String linhaSac1Boleto, String linhaSac2Boleto, String linhaSac3Boleto, String linhaSac4Boleto, String codigoBarrasBoleto, String cnpjPagadorBoleto, String valorDescontoBoleto, String valorAcrescimoBoleto, String valorCobradoBoleto, String sacadorPagadorBoleto, String tamanhoCodigoBarras, String sequenciaBoletoGeracao, String numeroBancoCnab, String nossoNumero) {
        this.bancoBoleto = bancoBoleto;
        this.linhaDigitavelBoleto = linhaDigitavelBoleto;
        this.nomeClienteBoleto = nomeClienteBoleto;
        this.codigoClienteErp = codigoClienteErp;
        this.dataEmissaoBoleto = dataEmissaoBoleto;
        this.dataVencimentoBoleto = dataVencimentoBoleto;
        this.agenciaCodigoBeneficiarioBoleto = agenciaCodigoBeneficiarioBoleto;
        this.nossoNumeroImpressaoBoleto = nossoNumeroImpressaoBoleto;
        this.numeroDocumentoBoleto = numeroDocumentoBoleto;
        this.valorDocumentoBoleto = valorDocumentoBoleto;
        this.instrucao1Boleto = instrucao1Boleto;
        this.instrucao2Boleto = instrucao2Boleto;
        this.instrucao3Boleto = instrucao3Boleto;
        this.instrucao4Boleto = instrucao4Boleto;
        this.instrucao5Boleto = instrucao5Boleto;
        this.instrucao6Boleto = instrucao6Boleto;
        this.instrucao7Boleto = instrucao7Boleto;
        this.instrucao8Boleto = instrucao8Boleto;
        this.instrucao9Boleto = instrucao9Boleto;
        this.localPagamentoBoleto = localPagamentoBoleto;
        this.beneficiarioBoleto = beneficiarioBoleto;
        this.enderecoBeneficiarioBoleto = enderecoBeneficiarioBoleto;
        this.cnpjBeneficiadrioBoleto = cnpjBeneficiadrioBoleto;
        this.dataBoleto = dataBoleto;
        this.especieDocumentoBoleto = especieDocumentoBoleto;
        this.aceiteBoleto = aceiteBoleto;
        this.dataProcessamentoBoleto = dataProcessamentoBoleto;
        this.usoBancoBoleto = usoBancoBoleto;
        this.carteiraBoleto = carteiraBoleto;
        this.especieMoedaBoleto = especieMoedaBoleto;
        this.quantidadeMoedaBoleto = quantidadeMoedaBoleto;
        this.valorMoedaBoleto = valorMoedaBoleto;
        this.instrucoesBoleto = instrucoesBoleto;
        this.descricaoDescontoBoleto = descricaoDescontoBoleto;
        this.descricaoOutraDeducoes = descricaoOutraDeducoes;
        this.descricaoMoraMultaBoleto = descricaoMoraMultaBoleto;
        this.descricaoOutrosAcrescimosBoleto = descricaoOutrosAcrescimosBoleto;
        this.cnpjClienteBoleto = cnpjClienteBoleto;
        this.enderecoClienteBoleto = enderecoClienteBoleto;
        this.municipioUfBoleto = municipioUfBoleto;
        this.cepClienteBoleto = cepClienteBoleto;
        this.pagadorAvalistaBoleto = pagadorAvalistaBoleto;
        this.cnpjPagadorAvalistaBoleto = cnpjPagadorAvalistaBoleto;
        this.linhaSac1Boleto = linhaSac1Boleto;
        this.linhaSac2Boleto = linhaSac2Boleto;
        this.linhaSac3Boleto = linhaSac3Boleto;
        this.linhaSac4Boleto = linhaSac4Boleto;
        this.codigoBarrasBoleto = codigoBarrasBoleto;
        this.cnpjPagadorBoleto = cnpjPagadorBoleto;
        this.valorDescontoBoleto = valorDescontoBoleto;
        this.valorAcrescimoBoleto = valorAcrescimoBoleto;
        this.valorCobradoBoleto = valorCobradoBoleto;
        this.sacadorPagadorBoleto = sacadorPagadorBoleto;
        this.tamanhoCodigoBarras = tamanhoCodigoBarras;
        this.sequenciaBoletoGeracao = sequenciaBoletoGeracao;
        this.numeroBancoCnab = numeroBancoCnab;
        this.nossoNumero = nossoNumero;
    }


    public BoletoTO(Boleto boleto) {
        this.bancoBoleto = boleto.getBancoBoleto();
        this.linhaDigitavelBoleto = boleto.getLinhaDigitavelBoleto();
        this.nomeClienteBoleto = boleto.getNomeClienteBoleto();
        this.codigoClienteErp = boleto.getCodigoClienteErp();
        this.dataEmissaoBoleto = boleto.getDataEmissaoBoleto();
        this.dataVencimentoBoleto = boleto.getDataVencimentoBoleto();
        this.agenciaCodigoBeneficiarioBoleto = boleto.getAgenciaCodigoBeneficiarioBoleto();
        this.nossoNumeroImpressaoBoleto = boleto.getNossoNumeroImpressaoBoleto();
        this.numeroDocumentoBoleto = boleto.getNumeroDocumentoBoleto();
        this.valorDocumentoBoleto = boleto.getValorDocumentoBoleto();
        this.instrucao1Boleto = boleto.getInstrucao1Boleto();
        this.instrucao2Boleto = boleto.getInstrucao2Boleto();
        this.instrucao3Boleto = boleto.getInstrucao3Boleto();
        this.instrucao4Boleto = boleto.getInstrucao4Boleto();
        this.instrucao5Boleto = boleto.getInstrucao5Boleto();
        this.instrucao6Boleto = boleto.getInstrucao6Boleto();
        this.instrucao7Boleto = boleto.getInstrucao7Boleto();
        this.instrucao8Boleto = boleto.getInstrucao8Boleto();
        this.instrucao9Boleto = boleto.getInstrucao9Boleto();
        this.localPagamentoBoleto = boleto.getLocalPagamentoBoleto();
        this.beneficiarioBoleto = boleto.getBeneficiarioBoleto();
        this.enderecoBeneficiarioBoleto = boleto.getEnderecoBeneficiarioBoleto();
        this.cnpjBeneficiadrioBoleto = boleto.getCnpjBeneficiadrioBoleto();
        this.dataBoleto = boleto.getDataBoleto();
        this.especieDocumentoBoleto = boleto.getEspecieDocumentoBoleto();
        this.aceiteBoleto = boleto.getAceiteBoleto();
        this.dataProcessamentoBoleto = boleto.getDataProcessamentoBoleto();
        this.usoBancoBoleto = boleto.getUsoBancoBoleto();
        this.carteiraBoleto = boleto.getCarteiraBoleto();
        this.especieMoedaBoleto = boleto.getEspecieMoedaBoleto();
        this.quantidadeMoedaBoleto = boleto.getQuantidadeMoedaBoleto();
        this.valorMoedaBoleto = boleto.getValorMoedaBoleto();
        this.instrucoesBoleto = boleto.getInstrucoesBoleto();
        this.descricaoDescontoBoleto = boleto.getDescricaoDescontoBoleto();
        this.descricaoOutraDeducoes = boleto.getDescricaoOutraDeducoes();
        this.descricaoMoraMultaBoleto = boleto.getDescricaoMoraMultaBoleto();
        this.descricaoOutrosAcrescimosBoleto = boleto.getDescricaoOutrosAcrescimosBoleto();
        this.cnpjClienteBoleto = boleto.getCnpjClienteBoleto();
        this.enderecoClienteBoleto = boleto.getEnderecoClienteBoleto();
        this.municipioUfBoleto = boleto.getMunicipioUfBoleto();
        this.cepClienteBoleto = boleto.getCepClienteBoleto();
        this.pagadorAvalistaBoleto = boleto.getPagadorAvalistaBoleto();
        this.cnpjPagadorAvalistaBoleto = boleto.getCnpjPagadorAvalistaBoleto();
        this.linhaSac1Boleto = boleto.getLinhaSac1Boleto();
        this.linhaSac2Boleto = boleto.getLinhaSac2Boleto();
        this.linhaSac3Boleto = boleto.getLinhaSac3Boleto();
        this.linhaSac4Boleto = boleto.getLinhaSac4Boleto();
        this.codigoBarrasBoleto = boleto.getCodigoBarrasBoleto();
        this.cnpjPagadorBoleto = boleto.getCnpjPagadorBoleto();
        this.valorDescontoBoleto = boleto.getValorDescontoBoleto();
        this.valorAcrescimoBoleto = boleto.getValorAcrescimoBoleto();
        this.valorCobradoBoleto = boleto.getValorCobradoBoleto();
        this.sacadorPagadorBoleto = boleto.getSacadorPagadorBoleto();
        this.tamanhoCodigoBarras = boleto.getTamanhoCodigoBarras();
        this.sequenciaBoletoGeracao = boleto.getSequenciaBoletoGeracao();
        this.numeroBancoCnab = boleto.getNumeroBancoCnab();
        this.nossoNumero = boleto.getNossoNumero();
    }

    public String getBancoBoleto() {
        return bancoBoleto;
    }

    public void setBancoBoleto(String bancoBoleto) {
        this.bancoBoleto = bancoBoleto;
    }

    public String getLinhaDigitavelBoleto() {
        return linhaDigitavelBoleto;
    }

    public void setLinhaDigitavelBoleto(String linhaDigitavelBoleto) {
        this.linhaDigitavelBoleto = linhaDigitavelBoleto;
    }

    public String getNomeClienteBoleto() {
        return nomeClienteBoleto;
    }

    public void setNomeClienteBoleto(String nomeClienteBoleto) {
        this.nomeClienteBoleto = nomeClienteBoleto;
    }

    public String getCodigoClienteErp() {
        return codigoClienteErp;
    }

    public void setCodigoClienteErp(String codigoClienteErp) {
        this.codigoClienteErp = codigoClienteErp;
    }

    public String getDataEmissaoBoleto() {
        return dataEmissaoBoleto;
    }

    public void setDataEmissaoBoleto(String dataEmissaoBoleto) {
        this.dataEmissaoBoleto = dataEmissaoBoleto;
    }

    public String getDataVencimentoBoleto() {
        return dataVencimentoBoleto;
    }

    public void setDataVencimentoBoleto(String dataVencimentoBoleto) {
        this.dataVencimentoBoleto = dataVencimentoBoleto;
    }

    public String getAgenciaCodigoBeneficiarioBoleto() {
        return agenciaCodigoBeneficiarioBoleto;
    }

    public void setAgenciaCodigoBeneficiarioBoleto(String agenciaCodigoBeneficiarioBoleto) {
        this.agenciaCodigoBeneficiarioBoleto = agenciaCodigoBeneficiarioBoleto;
    }

    public String getNossoNumeroImpressaoBoleto() {
        return nossoNumeroImpressaoBoleto;
    }

    public void setNossoNumeroImpressaoBoleto(String nossoNumeroImpressaoBoleto) {
        this.nossoNumeroImpressaoBoleto = nossoNumeroImpressaoBoleto;
    }

    public String getNumeroDocumentoBoleto() {
        return numeroDocumentoBoleto;
    }

    public void setNumeroDocumentoBoleto(String numeroDocumentoBoleto) {
        this.numeroDocumentoBoleto = numeroDocumentoBoleto;
    }

    public String getValorDocumentoBoleto() {
        return valorDocumentoBoleto;
    }

    public void setValorDocumentoBoleto(String valorDocumentoBoleto) {
        this.valorDocumentoBoleto = valorDocumentoBoleto;
    }

    public String getInstrucao1Boleto() {
        return instrucao1Boleto;
    }

    public void setInstrucao1Boleto(String instrucao1Boleto) {
        this.instrucao1Boleto = instrucao1Boleto;
    }

    public String getInstrucao2Boleto() {
        return instrucao2Boleto;
    }

    public void setInstrucao2Boleto(String instrucao2Boleto) {
        this.instrucao2Boleto = instrucao2Boleto;
    }

    public String getInstrucao3Boleto() {
        return instrucao3Boleto;
    }

    public void setInstrucao3Boleto(String instrucao3Boleto) {
        this.instrucao3Boleto = instrucao3Boleto;
    }

    public String getInstrucao4Boleto() {
        return instrucao4Boleto;
    }

    public void setInstrucao4Boleto(String instrucao4Boleto) {
        this.instrucao4Boleto = instrucao4Boleto;
    }

    public String getInstrucao5Boleto() {
        return instrucao5Boleto;
    }

    public void setInstrucao5Boleto(String instrucao5Boleto) {
        this.instrucao5Boleto = instrucao5Boleto;
    }

    public String getInstrucao6Boleto() {
        return instrucao6Boleto;
    }

    public void setInstrucao6Boleto(String instrucao6Boleto) {
        this.instrucao6Boleto = instrucao6Boleto;
    }

    public String getInstrucao7Boleto() {
        return instrucao7Boleto;
    }

    public void setInstrucao7Boleto(String instrucao7Boleto) {
        this.instrucao7Boleto = instrucao7Boleto;
    }

    public String getInstrucao8Boleto() {
        return instrucao8Boleto;
    }

    public void setInstrucao8Boleto(String instrucao8Boleto) {
        this.instrucao8Boleto = instrucao8Boleto;
    }

    public String getInstrucao9Boleto() {
        return instrucao9Boleto;
    }

    public void setInstrucao9Boleto(String instrucao9Boleto) {
        this.instrucao9Boleto = instrucao9Boleto;
    }

    public String getLocalPagamentoBoleto() {
        return localPagamentoBoleto;
    }

    public void setLocalPagamentoBoleto(String localPagamentoBoleto) {
        this.localPagamentoBoleto = localPagamentoBoleto;
    }

    public String getBeneficiarioBoleto() {
        return beneficiarioBoleto;
    }

    public void setBeneficiarioBoleto(String beneficiarioBoleto) {
        this.beneficiarioBoleto = beneficiarioBoleto;
    }

    public String getEnderecoBeneficiarioBoleto() {
        return enderecoBeneficiarioBoleto;
    }

    public void setEnderecoBeneficiarioBoleto(String enderecoBeneficiarioBoleto) {
        this.enderecoBeneficiarioBoleto = enderecoBeneficiarioBoleto;
    }

    public String getCnpjBeneficiadrioBoleto() {
        return cnpjBeneficiadrioBoleto;
    }

    public void setCnpjBeneficiadrioBoleto(String cnpjBeneficiadrioBoleto) {
        this.cnpjBeneficiadrioBoleto = cnpjBeneficiadrioBoleto;
    }

    public String getDataBoleto() {
        return dataBoleto;
    }

    public void setDataBoleto(String dataBoleto) {
        this.dataBoleto = dataBoleto;
    }

    public String getEspecieDocumentoBoleto() {
        return especieDocumentoBoleto;
    }

    public void setEspecieDocumentoBoleto(String especieDocumentoBoleto) {
        this.especieDocumentoBoleto = especieDocumentoBoleto;
    }

    public String getAceiteBoleto() {
        return aceiteBoleto;
    }

    public void setAceiteBoleto(String aceiteBoleto) {
        this.aceiteBoleto = aceiteBoleto;
    }

    public String getDataProcessamentoBoleto() {
        return dataProcessamentoBoleto;
    }

    public void setDataProcessamentoBoleto(String dataProcessamentoBoleto) {
        this.dataProcessamentoBoleto = dataProcessamentoBoleto;
    }

    public String getUsoBancoBoleto() {
        return usoBancoBoleto;
    }

    public void setUsoBancoBoleto(String usoBancoBoleto) {
        this.usoBancoBoleto = usoBancoBoleto;
    }

    public String getCarteiraBoleto() {
        return carteiraBoleto;
    }

    public void setCarteiraBoleto(String carteiraBoleto) {
        this.carteiraBoleto = carteiraBoleto;
    }

    public String getEspecieMoedaBoleto() {
        return especieMoedaBoleto;
    }

    public void setEspecieMoedaBoleto(String especieMoedaBoleto) {
        this.especieMoedaBoleto = especieMoedaBoleto;
    }

    public String getQuantidadeMoedaBoleto() {
        return quantidadeMoedaBoleto;
    }

    public void setQuantidadeMoedaBoleto(String quantidadeMoedaBoleto) {
        this.quantidadeMoedaBoleto = quantidadeMoedaBoleto;
    }

    public String getValorMoedaBoleto() {
        return valorMoedaBoleto;
    }

    public void setValorMoedaBoleto(String valorMoedaBoleto) {
        this.valorMoedaBoleto = valorMoedaBoleto;
    }

    public String getInstrucoesBoleto() {
        return instrucoesBoleto;
    }

    public void setInstrucoesBoleto(String instrucoesBoleto) {
        this.instrucoesBoleto = instrucoesBoleto;
    }

    public String getDescricaoDescontoBoleto() {
        return descricaoDescontoBoleto;
    }

    public void setDescricaoDescontoBoleto(String descricaoDescontoBoleto) {
        this.descricaoDescontoBoleto = descricaoDescontoBoleto;
    }

    public String getDescricaoOutraDeducoes() {
        return descricaoOutraDeducoes;
    }

    public void setDescricaoOutraDeducoes(String descricaoOutraDeducoes) {
        this.descricaoOutraDeducoes = descricaoOutraDeducoes;
    }

    public String getDescricaoMoraMultaBoleto() {
        return descricaoMoraMultaBoleto;
    }

    public void setDescricaoMoraMultaBoleto(String descricaoMoraMultaBoleto) {
        this.descricaoMoraMultaBoleto = descricaoMoraMultaBoleto;
    }

    public String getDescricaoOutrosAcrescimosBoleto() {
        return descricaoOutrosAcrescimosBoleto;
    }

    public void setDescricaoOutrosAcrescimosBoleto(String descricaoOutrosAcrescimosBoleto) {
        this.descricaoOutrosAcrescimosBoleto = descricaoOutrosAcrescimosBoleto;
    }

    public String getCnpjClienteBoleto() {
        return cnpjClienteBoleto;
    }

    public void setCnpjClienteBoleto(String cnpjClienteBoleto) {
        this.cnpjClienteBoleto = cnpjClienteBoleto;
    }

    public String getEnderecoClienteBoleto() {
        return enderecoClienteBoleto;
    }

    public void setEnderecoClienteBoleto(String enderecoClienteBoleto) {
        this.enderecoClienteBoleto = enderecoClienteBoleto;
    }

    public String getMunicipioUfBoleto() {
        return municipioUfBoleto;
    }

    public void setMunicipioUfBoleto(String municipioUfBoleto) {
        this.municipioUfBoleto = municipioUfBoleto;
    }

    public String getCepClienteBoleto() {
        return cepClienteBoleto;
    }

    public void setCepClienteBoleto(String cepClienteBoleto) {
        this.cepClienteBoleto = cepClienteBoleto;
    }

    public String getPagadorAvalistaBoleto() {
        return pagadorAvalistaBoleto;
    }

    public void setPagadorAvalistaBoleto(String pagadorAvalistaBoleto) {
        this.pagadorAvalistaBoleto = pagadorAvalistaBoleto;
    }

    public String getCnpjPagadorAvalistaBoleto() {
        return cnpjPagadorAvalistaBoleto;
    }

    public void setCnpjPagadorAvalistaBoleto(String cnpjPagadorAvalistaBoleto) {
        this.cnpjPagadorAvalistaBoleto = cnpjPagadorAvalistaBoleto;
    }

    public String getLinhaSac1Boleto() {
        return linhaSac1Boleto;
    }

    public void setLinhaSac1Boleto(String linhaSac1Boleto) {
        this.linhaSac1Boleto = linhaSac1Boleto;
    }

    public String getLinhaSac2Boleto() {
        return linhaSac2Boleto;
    }

    public void setLinhaSac2Boleto(String linhaSac2Boleto) {
        this.linhaSac2Boleto = linhaSac2Boleto;
    }

    public String getLinhaSac3Boleto() {
        return linhaSac3Boleto;
    }

    public void setLinhaSac3Boleto(String linhaSac3Boleto) {
        this.linhaSac3Boleto = linhaSac3Boleto;
    }

    public String getLinhaSac4Boleto() {
        return linhaSac4Boleto;
    }

    public void setLinhaSac4Boleto(String linhaSac4Boleto) {
        this.linhaSac4Boleto = linhaSac4Boleto;
    }

    public String getCodigoBarrasBoleto() {
        return codigoBarrasBoleto;
    }

    public void setCodigoBarrasBoleto(String codigoBarrasBoleto) {
        this.codigoBarrasBoleto = codigoBarrasBoleto;
    }

    public String getCnpjPagadorBoleto() {
        return cnpjPagadorBoleto;
    }

    public void setCnpjPagadorBoleto(String cnpjPagadorBoleto) {
        this.cnpjPagadorBoleto = cnpjPagadorBoleto;
    }

    public String getValorDescontoBoleto() {
        return valorDescontoBoleto;
    }

    public void setValorDescontoBoleto(String valorDescontoBoleto) {
        this.valorDescontoBoleto = valorDescontoBoleto;
    }

    public String getValorAcrescimoBoleto() {
        return valorAcrescimoBoleto;
    }

    public void setValorAcrescimoBoleto(String valorAcrescimoBoleto) {
        this.valorAcrescimoBoleto = valorAcrescimoBoleto;
    }

    public String getValorCobradoBoleto() {
        return valorCobradoBoleto;
    }

    public void setValorCobradoBoleto(String valorCobradoBoleto) {
        this.valorCobradoBoleto = valorCobradoBoleto;
    }

    public String getSacadorPagadorBoleto() {
        return sacadorPagadorBoleto;
    }

    public void setSacadorPagadorBoleto(String sacadorPagadorBoleto) {
        this.sacadorPagadorBoleto = sacadorPagadorBoleto;
    }

    public String getTamanhoCodigoBarras() {
        return tamanhoCodigoBarras;
    }

    public void setTamanhoCodigoBarras(String tamanhoCodigoBarras) {
        this.tamanhoCodigoBarras = tamanhoCodigoBarras;
    }

    public String getSequenciaBoletoGeracao() {
        return sequenciaBoletoGeracao;
    }

    public void setSequenciaBoletoGeracao(String sequenciaBoletoGeracao) {
        this.sequenciaBoletoGeracao = sequenciaBoletoGeracao;
    }

    public String getNumeroBancoCnab() {
        return numeroBancoCnab;
    }

    public void setNumeroBancoCnab(String numeroBancoCnab) {
        this.numeroBancoCnab = numeroBancoCnab;
    }

    public String getNossoNumero() {
        return nossoNumero;
    }

    public void setNossoNumero(String nossoNumero) {
        this.nossoNumero = nossoNumero;
    }
}
