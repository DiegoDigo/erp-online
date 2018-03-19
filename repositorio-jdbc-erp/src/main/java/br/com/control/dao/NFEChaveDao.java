package br.com.control.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import br.com.control.portal.integracao.ViewsIntegracaoERP;
import br.com.control.portal.mensageria.to.NfeChaveTO;
import br.com.control.repositorio.mappers.NFEChaveRowMapper;
import br.com.control.vendas.cadastro.modelo.pedido.ChaveNfe;

@Repository
@Transactional
public class NFEChaveDao extends JdbcDao<NfeChaveTO> {

	public List<NfeChaveTO> listaTodos() {
		String declare = "DECLARE set int @NNF = 0;";
		String declare1 = "DECLARE set char(10) @SNF = '';";
		getJdbcTemplate().update(declare);
		getJdbcTemplate().update(declare1);
		return selectViewSemWhere(ViewsIntegracaoERP.VW_CH_NFISCAL, new NFEChaveRowMapper());
	}

	public NfeChaveTO recuperaPorNumeroNota(String numeroNFE, String sequencia) {
		String declare = "DECLARE set int @NNF = "+numeroNFE+";";
		String declare1 = "DECLARE set char(10) @SNF = '"+sequencia+"';";
		getJdbcTemplate().update(declare);
		getJdbcTemplate().update(declare1);
		return selectViewSingle(ViewsIntegracaoERP.VW_CH_NFISCAL, new NFEChaveRowMapper());
	}
	
	public Integer count() {
		String declare = "DECLARE set int @NNF = 0;";
		String declare1 = "DECLARE set char(10) @SNF = '';";
		getJdbcTemplate().update(declare);
		getJdbcTemplate().update(declare1);
		String sql = "select count(*) from "+ getSchemaDatabase() + "." + ViewsIntegracaoERP.VW_CH_NFISCAL;
		return contaRegistros(sql);
	}

}
