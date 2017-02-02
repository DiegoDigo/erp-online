package br.com.control.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import br.com.control.portal.integracao.TabelasIntegracao;
import br.com.control.repositorio.mappers.CanalRowMapper;
import br.com.control.vendas.cadastro.modelo.canal.Canal;

@Repository
@Transactional
public class CanalDao extends JdbcDao<Canal> {

	public List<Canal> listarCanal() {
		String declare = "DECLARE set char(2) @CODIGO_CANAL  = '';";
		getJdbcTemplate().update(declare);
		return selectViewSemWhere(TabelasIntegracao.CADASTRO_CANAL, new CanalRowMapper());
	}

	public Canal recuperarCanal(String codigoCanalErp) {
		String declare = String.format("DECLARE set char(2) @CODIGO_CANAL= '%s';", codigoCanalErp );
		getJdbcTemplate().update(declare);
		return selectViewSingle(TabelasIntegracao.CADASTRO_CANAL, new CanalRowMapper());
	}

}
