package br.com.control.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import br.com.control.portal.integracao.TabelasIntegracao;
import br.com.control.repositorio.mappers.SisTipoOcorrenciaRowMapper;
import br.com.control.vendas.cadastro.modelo.ocorrencia.SisTipoOCorrencia;

@Repository
@Transactional
public class SisTipoOcorrenciaDao extends JdbcDao<SisTipoOCorrencia> {

	public List<SisTipoOCorrencia> listarOcorrencias() {
		String declare = "DECLARE set date @ATIVO = 1;";
		getJdbcTemplate().update(declare);
		return selectViewSemWhere(TabelasIntegracao.SIS_CADASTRO_TIPO_OCORRENCIA, new SisTipoOcorrenciaRowMapper());
	}

}
