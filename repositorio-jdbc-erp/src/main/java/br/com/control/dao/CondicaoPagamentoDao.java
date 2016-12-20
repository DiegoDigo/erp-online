package br.com.control.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import br.com.control.integracao.TabelasIntegracao;
import br.com.control.repositorio.mappers.CondicaoPagamentoRowMapper;
import br.com.control.vendas.cadastro.modelo.condicaoPagamento.CondicaoPagamento;

@Repository
@Transactional
public class CondicaoPagamentoDao extends JdbcDao<CondicaoPagamento> {

	public List<CondicaoPagamento> listarCondicoesPagamento() {
		String declare = "DECLARE set date @CODIGO_CONDICAO_PAGAMENTO  = 0;";
		getJdbcTemplate().update(declare);
		return selectViewSemWhere(TabelasIntegracao.CADASTRO_CONDICAO_PAGAMENTO,
				new CondicaoPagamentoRowMapper());
	}

}
