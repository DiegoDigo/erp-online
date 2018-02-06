package br.com.control.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import br.com.control.portal.integracao.ViewsIntegracaoERP;
import br.com.control.portal.mensageria.to.NfeChaveTO;
import br.com.control.repositorio.mappers.NFEChaveRowMapper;

@Repository
@Transactional
public class NFEChaveDao extends JdbcDao<NfeChaveTO> {

	private static final Logger logger = LoggerFactory.getLogger(NFEChaveDao.class);

	public List<NfeChaveTO> listaTodos() {
		String declare = "DECLARE set int @NNF = 0;";
		String declare1 = "DECLARE set int @SNF = '';";
		getJdbcTemplate().update(declare);
		getJdbcTemplate().update(declare1);
		return selectViewSemWhere(ViewsIntegracaoERP.VW_CH_NFISCAL, new NFEChaveRowMapper());
	}

	public NfeChaveTO recuperaPorNumeroNota(String numeroNFE, String sequencia) {
		String declare = "DECLARE set int @NNF = "+numeroNFE+";";
		String declare1 = "DECLARE set int @SNF = '"+sequencia+"';";
		getJdbcTemplate().update(declare);
		getJdbcTemplate().update(declare1);
		return selectViewSingle(ViewsIntegracaoERP.VW_CH_NFISCAL, new NFEChaveRowMapper());
	}

}