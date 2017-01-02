package br.com.control.repositorio.mappers;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import br.com.control.vendas.cadastro.modelo.ocorrencia.Ocorrencia;

public class OcorrenciaRowMapper implements RowMapper<Ocorrencia> {

	@Override
	public Ocorrencia mapRow(ResultSet rs, int rowNum) throws SQLException {
		Ocorrencia ocorrencia = new Ocorrencia();
		ocorrencia.setAtivo(rs.getBoolean("ativo"));
		ocorrencia.setCodigoOcorrencia(rs.getString("codigo_ocorrencia_ERP").trim());
		ocorrencia.setDescricao(rs.getString("descricao").trim());
		ocorrencia.setDescricaoReduzida(rs.getString("descricao_reduzida").trim());
		ocorrencia.setDesdobro(rs.getString("desdobro").trim());
		ocorrencia.setEmpresa(rs.getString("empresa"));
		ocorrencia.setGeraMotivoFinanc(rs.getBoolean("gera_motivo_financ"));
		ocorrencia.setNaturezaOperacao(rs.getString("NATUREZA_OPERACAO").trim());
//		ocorrencia.setNaturezaOperacaoO(rs.getString("natureza_operacao_o"));
//		ocorrencia.setNaturezaOperacaoM(rs.getString("natureza_operacao_m"));
		ocorrencia.setOcorrDispPortal(rs.getBoolean("ocorr_disp_portal"));
		
		ocorrencia.setSinal(rs.getString("sinal").trim());
		ocorrencia.setTipo(rs.getString("tipo").trim());
		ocorrencia.setCodigoTipoOcorrenciaERP(rs.getString("CODIGO_TIPO_OCORRENCIA_ERP").trim());
		ocorrencia.setTipoProduto(rs.getString("tipo_produto").trim());
		return ocorrencia;
	}

}
