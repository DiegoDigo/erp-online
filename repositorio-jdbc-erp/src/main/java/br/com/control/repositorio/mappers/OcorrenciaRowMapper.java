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
		ocorrencia.setCodigoOcorrencia(rs.getString("codigo_ocorrencia"));
		ocorrencia.setDescricao(rs.getString("descricao"));
		ocorrencia.setDescricaoReduzida(rs.getString("descricao_reduzida"));
		ocorrencia.setDesdobro(rs.getString("desdobro"));
		ocorrencia.setEmpresa(rs.getString("empresa"));
		ocorrencia.setGeraMotivoFinanc(rs.getBoolean("gera_motivo_financ"));
		ocorrencia.setNaturezaOperacao(rs.getInt("natureza_operacao"));
		ocorrencia.setNaturezaOperacaoO(rs.getInt("natureza_operacao_o"));
		ocorrencia.setNaturezaOperacaoM(rs.getInt("natureza_operacao_m"));
		ocorrencia.setOcorrDispPortal(rs.getBoolean("ocorr_disp_portal"));
		ocorrencia.setRecId(rs.getLong("rec_id"));
		ocorrencia.setSinal(rs.getString("sinal"));
		ocorrencia.setTipo(rs.getString("tipo"));
		ocorrencia.setTipoOcorrenciaRecId(rs.getLong("tipo_ocorrencia_rec_id"));
		ocorrencia.setTipoProduto(rs.getString("tipo_produto"));
		return ocorrencia;
	}

}
