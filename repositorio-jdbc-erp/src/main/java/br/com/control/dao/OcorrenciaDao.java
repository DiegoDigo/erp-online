package br.com.control.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import br.com.control.portal.integracao.ViewsIntegracaoERP;
import br.com.control.repositorio.mappers.OcorrenciaRowMapper;
import br.com.control.vendas.cadastro.modelo.ocorrencia.Ocorrencia;

@Repository
@Transactional
public class OcorrenciaDao extends JdbcDao<Ocorrencia> {

	public List<Ocorrencia> listarOcorrencia() {
		String declare = "DECLARE set varchar(3) @CODIGO_OCORRENCIA  = '';";
		getJdbcTemplate().update(declare);
		return selectViewSemWhere(ViewsIntegracaoERP.VW_OCORRENCIA, new OcorrenciaRowMapper());
	}

	public Ocorrencia recuperarOcorrencia(String codigoOcorrenciaErp) {
		String declare = String.format("DECLARE set varchar(3) @CODIGO_OCORRENCIA = '%s' ;", codigoOcorrenciaErp);
		getJdbcTemplate().update(declare);
		return selectViewSingle(ViewsIntegracaoERP.VW_OCORRENCIA, new OcorrenciaRowMapper());
	}
	
	public Integer count() {
		String declare = "DECLARE set varchar(3) @CODIGO_OCORRENCIA  = '';";
		getJdbcTemplate().update(declare);
		String sql = "select count(*) from "+ getSchemaDatabase() + "." + ViewsIntegracaoERP.VW_OCORRENCIA;
		return contaRegistros(sql);
	}

}
