package br.com.control.repositorio.mappers;

import br.com.control.vendas.cadastro.modelo.pedido.pagamento.Boleto;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class BoletoRowMapper implements RowMapper<Boleto> {

    @Override
    public Boleto mapRow(ResultSet rs, int rowNum) throws SQLException {
        Boleto boleto = new Boleto();
        boleto.setBancoBoleto(rs.getString("BANCO_BOLETO"));
        boleto.setLinhaDigitavelBoleto(rs.getString("LINHA_DIGITAVEL_BOLETO"));
        boleto.setNomeClienteBoleto(rs.getString("NOME_CLIENTE_BOLETO"));
        boleto.setBancoBoleto(rs.getString("BANCO_BOLETO"));
        boleto.setCodigoClienteErp(rs.getString("NUMERO_CLIENTE_BOLETO"));
        boleto.setDataEmissaoBoleto(rs.getString("DATA_EMISSAO_BOLETO"));
        boleto.setDataVencimentoBoleto(rs.getString("DATA_VENCIMENTO_BOLETO"));
        boleto.setAgenciaCodigoBeneficiarioBoleto(rs.getString("AGENCIA_CODIGO_BENEFICIARIO_BOLETO"));
        boleto.setNossoNumeroImpressaoBoleto(rs.getString("NOSSO_NUMERO_IMPRESSAO_BOLETO"));
        boleto.setNumeroDocumentoBoleto(rs.getString("NUMERO_DOCUMENTO_BOLETO"));
        boleto.setValorDocumentoBoleto(rs.getString("VALOR_DOCUMENTO_BOLETO"));
        boleto.setInstrucao1Boleto(rs.getString("INSTRUCAO1_BOLETO"));
        boleto.setInstrucao2Boleto(rs.getString("INSTRUCAO2_BOLETO"));
        boleto.setInstrucao3Boleto(rs.getString("INSTRUCAO3_BOLETO"));
        boleto.setInstrucao4Boleto(rs.getString("INSTRUCAO4_BOLETO"));
        boleto.setInstrucao5Boleto(rs.getString("INSTRUCAO5_BOLETO"));
        boleto.setInstrucao6Boleto(rs.getString("INSTRUCAO6_BOLETO"));
        boleto.setInstrucao7Boleto(rs.getString("INSTRUCAO7_BOLETO"));
        boleto.setInstrucao8Boleto(rs.getString("INSTRUCAO8_BOLETO"));
        boleto.setInstrucao9Boleto(rs.getString("INSTRUCAO9_BOLETO"));
        boleto.setLocalPagamentoBoleto(rs.getString("LOCAL_DE_PAGAMENTO_BOLETO"));
        boleto.setBeneficiarioBoleto(rs.getString("BENEFICIARIO_BOLETO"));
        boleto.setEnderecoBeneficiarioBoleto(rs.getString("ENDERECO_BENEFICIARIO_BOLETO"));
        boleto.setCnpjBeneficiadrioBoleto(rs.getString("CNPJ_BENEFICIARIO_BOLETO"));
        boleto.setDataBoleto(rs.getString("DATA_BOLETO"));
        boleto.setEspecieDocumentoBoleto(rs.getString("ESPECIE_DOCUMENTO_BOLETO"));
        boleto.setAceiteBoleto(rs.getString("ACEITE_BOLETO"));
        boleto.setDataProcessamentoBoleto(rs.getString("DATA_PROCESSAMENTO_BOLETO"));
        boleto.setUsoBancoBoleto(rs.getString("USO_DO_BANCO_BOLETO"));
        boleto.setCarteiraBoleto(rs.getString("CARTEIRA_BOLETO"));
        boleto.setEspecieMoedaBoleto(rs.getString("ESPECIE_MOEDA_BOLETO"));
        boleto.setQuantidadeMoedaBoleto(rs.getString("QUANTIDADE_MOEDA_BOLETO"));
        boleto.setValorMoedaBoleto(rs.getString("VALOR_MOEDA_BOLETO"));
        boleto.setInstrucoesBoleto(rs.getString("INSTRUCOES_BOLETO"));
        boleto.setDescricaoDescontoBoleto(rs.getString("DESCRICAO_DESCONTO_BOLETO"));
        boleto.setDescricaoOutraDeducoes(rs.getString("DESCRICAO_OUTRAS_DEDUCOES_BOLETO"));
        boleto.setDescricaoMoraMultaBoleto(rs.getString("DESCRICAO_MORA_MULTA_BOLETO"));
        boleto.setDescricaoOutrosAcrescimosBoleto(rs.getString("DESCRICAO_OUTROS_ACRESCIMOS_BOLETO"));
        boleto.setEnderecoClienteBoleto(rs.getString("ENDERECO_CLIENTE_BOLETO"));
        boleto.setMunicipioUfBoleto(rs.getString("MUNICIPIO_UF_BOLETO"));
        boleto.setCepClienteBoleto(rs.getString("CEP_CLIENTE_BOLETO"));
        boleto.setPagadorAvalistaBoleto(rs.getString("PAGADOR_AVALISTA_BOLETO"));
        boleto.setLinhaSac1Boleto(rs.getString("LINHA_SAC1_BOLETO"));
        boleto.setLinhaSac2Boleto(rs.getString("LINHA_SAC2_BOLETO"));
        boleto.setLinhaSac3Boleto(rs.getString("LINHA_SAC3_BOLETO"));
        boleto.setLinhaSac4Boleto(rs.getString("LINHA_SAC4_BOLETO"));
        boleto.setCodigoBarrasBoleto(rs.getString("CODIGO_DE_BARRAS_BOLETO"));
        boleto.setValorDescontoBoleto(rs.getString("VALOR_DESCONTO_BOLETO"));
        boleto.setValorAcrescimoBoleto(rs.getString("VALOR_ACRESCIMO_BOLETO"));
        boleto.setValorCobradoBoleto(rs.getString("VALOR_COBRADO_BOLETO"));
        boleto.setSacadorPagadorBoleto(rs.getString("SACADOR_OU_PAGADOR_BOLETO"));
        boleto.setTamanhoCodigoBarras(rs.getString("TAMANHO_CODIGO_BARRAS"));

        return boleto;
    }

}
