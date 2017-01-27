package br.com.control.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import br.com.control.portal.integracao.TabelasIntegracao;
import br.com.control.repositorio.mappers.OcorrenciaRowMapper;
import br.com.control.vendas.cadastro.modelo.ocorrencia.Ocorrencia;

@Repository
@Transactional
public class OcorrenciaDao extends JdbcDao<Ocorrencia> {

	public List<Ocorrencia> listarOcorrencia(){
		String declare = "DECLARE set char @CODIGO_OCORRENCIA  = '';";
		getJdbcTemplate().update(declare);
		return selectViewSemWhere(TabelasIntegracao.CADASTRO_OCORRENCIA, new OcorrenciaRowMapper());
	}
	
}
