package br.com.control.repositorio.mappers;

import br.com.control.vendas.cadastro.modelo.pedido.pagamento.Boleto;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class BoletoRowMapper implements RowMapper<Boleto> {

    @Override
    public Boleto mapRow(ResultSet rs, int rowNum) throws SQLException {
        Boleto boleto = new Boleto();
        boleto.setBancoBoleto(rs.getString("BANCO_BOLETO").trim());
        boleto.setLinhaDigitavelBoleto(rs.getString("LINHA_DIGITAVEL_BOLETO").trim());
        boleto.setNomeClienteBoleto(rs.getString("NOME_CLIENTE_BOLETO").trim());
        boleto.setBancoBoleto(rs.getString("BANCO_BOLETO").trim());
        boleto.setCodigoClienteErp(rs.getString("NUMERO_CLIENTE_BOLETO").trim());
        boleto.setDataEmissaoBoleto(rs.getString("DATA_EMISSAO_BOLETO").trim());
        boleto.setDataVencimentoBoleto(rs.getString("DATA_VENCIMENTO_BOLETO").trim());
        boleto.setAgenciaCodigoBeneficiarioBoleto(rs.getString("AGENCIA_CODIGO_BENEFICIARIO_BOLETO").trim());
        boleto.setNossoNumeroImpressaoBoleto(rs.getString("NOSSO_NUMERO_IMPRESSAO_BOLETO").trim());
        boleto.setNumeroDocumentoBoleto(rs.getString("NUMERO_DOCUMENTO_BOLETO").trim());
        boleto.setValorDocumentoBoleto(rs.getString("VALOR_DOCUMENTO_BOLETO").trim());
        boleto.setInstrucao1Boleto(rs.getString("INSTRUCAO1_BOLETO").trim());
        boleto.setInstrucao2Boleto(rs.getString("INSTRUCAO2_BOLETO").trim());
        boleto.setInstrucao3Boleto(rs.getString("INSTRUCAO3_BOLETO").trim());
        boleto.setInstrucao4Boleto(rs.getString("INSTRUCAO4_BOLETO").trim());
        boleto.setInstrucao5Boleto(rs.getString("INSTRUCAO5_BOLETO").trim());
        boleto.setInstrucao6Boleto(rs.getString("INSTRUCAO6_BOLETO").trim());
        boleto.setInstrucao7Boleto(rs.getString("INSTRUCAO7_BOLETO").trim());
        boleto.setInstrucao8Boleto(rs.getString("INSTRUCAO8_BOLETO").trim());
        boleto.setInstrucao9Boleto(rs.getString("INSTRUCAO9_BOLETO").trim());
        boleto.setLocalPagamentoBoleto(rs.getString("LOCAL_DE_PAGAMENTO_BOLETO").trim());
        boleto.setBeneficiarioBoleto(rs.getString("BENEFICIARIO_BOLETO").trim());
        boleto.setEnderecoBeneficiarioBoleto(rs.getString("ENDERECO_BENEFICIARIO_BOLETO").trim());
        boleto.setCnpjBeneficiadrioBoleto(rs.getString("CNPJ_BENEFICIARIO_BOLETO").trim());
        boleto.setDataBoleto(rs.getString("DATA_BOLETO").trim());
        boleto.setEspecieDocumentoBoleto(rs.getString("ESPECIE_DOCUMENTO_BOLETO").trim());
        boleto.setAceiteBoleto(rs.getString("ACEITE_BOLETO").trim());
        boleto.setDataProcessamentoBoleto(rs.getString("DATA_PROCESSAMENTO_BOLETO").trim());
        boleto.setUsoBancoBoleto(rs.getString("USO_DO_BANCO_BOLETO").trim());
        boleto.setCarteiraBoleto(rs.getString("CARTEIRA_BOLETO").trim());
        boleto.setEspecieMoedaBoleto(rs.getString("ESPECIE_MOEDA_BOLETO").trim());
        boleto.setQuantidadeMoedaBoleto(rs.getString("QUANTIDADE_MOEDA_BOLETO").trim());
        boleto.setValorMoedaBoleto(rs.getString("VALOR_MOEDA_BOLETO").trim());
        boleto.setInstrucoesBoleto(rs.getString("INSTRUCOES_BOLETO").trim());
        boleto.setDescricaoDescontoBoleto(rs.getString("DESCRICAO_DESCONTO_BOLETO").trim());
        boleto.setDescricaoOutraDeducoes(rs.getString("DESCRICAO_OUTRAS_DEDUCOES_BOLETO").trim());
        boleto.setDescricaoMoraMultaBoleto(rs.getString("DESCRICAO_MORA_MULTA_BOLETO").trim());
        boleto.setDescricaoOutrosAcrescimosBoleto(rs.getString("DESCRICAO_OUTROS_ACRESCIMOS_BOLETO").trim());
        boleto.setEnderecoClienteBoleto(rs.getString("ENDERECO_CLIENTE_BOLETO").trim());
        boleto.setMunicipioUfBoleto(rs.getString("MUNICIPIO_UF_BOLETO").trim());
        boleto.setCepClienteBoleto(rs.getString("CEP_CLIENTE_BOLETO").trim());
        boleto.setPagadorAvalistaBoleto(rs.getString("PAGADOR_AVALISTA_BOLETO").trim());
        boleto.setLinhaSac1Boleto(rs.getString("LINHA_SAC1_BOLETO").trim());
        boleto.setLinhaSac2Boleto(rs.getString("LINHA_SAC2_BOLETO").trim());
        boleto.setLinhaSac3Boleto(rs.getString("LINHA_SAC3_BOLETO").trim());
        boleto.setLinhaSac4Boleto(rs.getString("LINHA_SAC4_BOLETO").trim());
        boleto.setCodigoBarrasBoleto(rs.getString("CODIGO_DE_BARRAS_BOLETO").trim());
        boleto.setValorDescontoBoleto(rs.getString("VALOR_DESCONTO_BOLETO").trim());
        boleto.setValorAcrescimoBoleto(rs.getString("VALOR_ACRESCIMO_BOLETO").trim());
        boleto.setValorCobradoBoleto(rs.getString("VALOR_COBRADO_BOLETO").trim());
        boleto.setSacadorPagadorBoleto(rs.getString("SACADOR_OU_PAGADOR_BOLETO").trim());
        boleto.setTamanhoCodigoBarras(rs.getString("TAMANHO_CODIGO_BARRAS").trim());
        boleto.setNumeroBancoCnab(rs.getString("NUMERO_BANCO_CNAB").trim());
        boleto.setSequenciaBoletoGeracao(rs.getString("SEQUENCIA_BOLETO_GERACAO").trim());
        boleto.setNossoNumero(rs.getString("NOSSO_NUMERO").trim());

        return boleto;
    }

}
