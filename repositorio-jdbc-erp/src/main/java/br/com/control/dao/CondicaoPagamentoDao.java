package br.com.control.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import br.com.control.portal.integracao.ViewsIntegracaoERP;
import br.com.control.repositorio.mappers.CondicaoPagamentoRowMapper;
import br.com.control.vendas.cadastro.modelo.condicaoPagamento.CondicaoPagamento;

@Repository
@Transactional
public class CondicaoPagamentoDao extends JdbcDao<CondicaoPagamento> {

	public List<CondicaoPagamento> listarCondicoesPagamento() {
		String declare = "DECLARE set date @CODIGO_CONDICAO_PAGAMENTO  = 0;";
		getJdbcTemplate().update(declare);
		return selectViewSemWhere(ViewsIntegracaoERP.VW_CONDICAO_PAGAMENTO, new CondicaoPagamentoRowMapper());
	}

	public CondicaoPagamento recuperarCondicaoPagamento(String codigoCondicaoPagamentoErp) {
		String declare = "DECLARE set int @CODIGO_CONDICAO_PAGAMENTO= " + codigoCondicaoPagamentoErp + ";";
		getJdbcTemplate().update(declare);
		return selectViewSingle(ViewsIntegracaoERP.VW_CONDICAO_PAGAMENTO, new CondicaoPagamentoRowMapper());
	}

}
