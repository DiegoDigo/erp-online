package br.com.control.dao;

import java.util.List;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import br.com.control.integracao.TabelasIntegracaoPortal;
import br.com.control.repositorio.mappers.TipoCobrancaRowMapper;
import br.com.control.vendas.cadastro.modelo.tipoCobranca.TipoCobranca;

@Repository
@Transactional
public class TipoCobrancaDao extends JdbcDao{
	
	public List<TipoCobranca> listarTipoCobranca(){
		String sql = "SELECT * FROM "+TabelasIntegracaoPortal.CADASTRO_TIPO_COBRANCA.getViewERP();
		List<TipoCobranca> tiposCobrancas = getJdbcTemplate().query(sql, new TipoCobrancaRowMapper());
		return tiposCobrancas;
		
	}
	
	public TipoCobranca buscarPorId(Long id){
		String sql = "select * from " + TabelasIntegracaoPortal.CADASTRO_TIPO_COBRANCA.getTabelaERP() + " where rec_id = " + id;
		return getJdbcTemplate().queryForObject(sql, new TipoCobrancaRowMapper());
	}

}
