package br.com.control.dao;

import java.util.List;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import br.com.control.integracao.TabelasIntegracaoPortal;
import br.com.control.repositorio.mappers.CondicaoPagamentoRowMapper;
import br.com.control.vendas.cadastro.modelo.condicaoPagamento.CondicaoPagamento;

@Repository
@Transactional
public class CondicaoPagamentoDao extends JdbcDao{

	public List<CondicaoPagamento> listarCondicao(){
		String sql = "select * from " + TabelasIntegracaoPortal.CADASTRO_CONDICAO_PAGAMENTO.getViewERP();
		List<CondicaoPagamento> condicoes = getJdbcTemplate().query(sql, new CondicaoPagamentoRowMapper());
		return condicoes;
	}
	
	public CondicaoPagamento buscarPorId(Long id){
		String sql = "select * from "+ TabelasIntegracaoPortal.CADASTRO_CONDICAO_PAGAMENTO.getTabelaERP() +" where rec_id = "+ id;
		CondicaoPagamento condicao = getJdbcTemplate().queryForObject(sql, new CondicaoPagamentoRowMapper());
		return condicao;
	}
	
}
