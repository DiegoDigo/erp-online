package br.com.control.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import br.com.control.integracao.TabelasIntegracaoPortal;
import br.com.control.repositorio.mappers.CanalRowMapper;
import br.com.control.vendas.cadastro.modelo.canal.Canal;

@Repository
@Transactional
public class CanalDao extends JdbcDao{	
	

	public List<Canal> listarCanais(){
		String sql = "select * from " + TabelasIntegracaoPortal.CADASTRO_CANAL.getViewERP();
		List<Canal> canais = getJdbcTemplate().query(sql, new CanalRowMapper());
		return canais;
	}
	
	public Canal buscaCanalPorID(Long id){
		String sql = "select * from " + TabelasIntegracaoPortal.CADASTRO_CANAL.getTabelaERP() + " where rec_id = "+id;
		Canal canal = getJdbcTemplate().queryForObject(sql, new CanalRowMapper());
		return canal; 
	}
}
