package br.com.control.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import br.com.control.portal.integracao.ViewsIntegracaoERP;
import br.com.control.repositorio.mappers.ProdutoRowMapper;
import br.com.control.vendas.cadastro.modelo.produto.Produto;

@Repository
@Transactional
public class ProdutoDao extends JdbcDao<Produto> {

	public List<Produto> listarProdutos() {
		String declare = "DECLARE set date @CODIGO_PROD = 0;";
		getJdbcTemplate().update(declare);
		String declare2 = "DECLARE set date @CODIGO_FAMILIA = 0;";
		getJdbcTemplate().update(declare2);
		String declare3 = "DECLARE set date @CODIGO_SEQUENCIA = 0;";
		getJdbcTemplate().update(declare3);
		String declare4 = "DECLARE set int @DISP_PORTAL_WEB = 1;";
		getJdbcTemplate().update(declare4);
		return selectViewSemWhere(ViewsIntegracaoERP.VW_PRODUTO, new ProdutoRowMapper());
	}

	public Produto recuperarProduto(String codigoErp) {
		String declare = "DECLARE set int @CODIGO_PROD= " + codigoErp + ";";
		getJdbcTemplate().update(declare);
		String declare2 = "DECLARE set date @CODIGO_FAMILIA = 0;";
		getJdbcTemplate().update(declare2);
		String declare3 = "DECLARE set date @CODIGO_SEQUENCIA = 0;";
		getJdbcTemplate().update(declare3);		
		//2 para TODOS, ativos e não
		String declare4 = "DECLARE set int @DISP_PORTAL_WEB = 2;";
		getJdbcTemplate().update(declare4);		
		return selectViewSingle(ViewsIntegracaoERP.VW_PRODUTO, new ProdutoRowMapper());
	}

}
