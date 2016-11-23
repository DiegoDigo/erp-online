package br.com.control.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import br.com.control.integracao.TabelasIntegracaoPortal;
import br.com.control.repositorio.mappers.CanalRowMapper;
import br.com.control.vendas.cadastro.modelo.canal.Canal;

@Repository
@Transactional
public class CanalDao extends JdbcDao<Canal>{	
	
	public List<Canal> listarCanais(){
		return selectViewSemWhere(TabelasIntegracaoPortal.CADASTRO_CANAL, new CanalRowMapper());
	}
	
}
