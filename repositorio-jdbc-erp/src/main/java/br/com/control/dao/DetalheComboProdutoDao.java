package br.com.control.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import br.com.control.portal.integracao.ViewsIntegracaoERP;
import br.com.control.repositorio.mappers.DetalheComboProdutoRowMapper;
import br.com.control.vendas.cadastro.modelo.produto.DetalheComboProduto;

@Repository
@Transactional
public class DetalheComboProdutoDao extends JdbcDao<DetalheComboProduto> {

	

	public List<DetalheComboProduto> listaTodosOsCombos() {
		String declare = "DECLARE set varchar(27) @CODIGO_COMBO = '';";
		getJdbcTemplate().update(declare);
		return selectViewSemWhere(ViewsIntegracaoERP.VW_COMBO_PRODUTO, new DetalheComboProdutoRowMapper());
	}
	
	public DetalheComboProduto recuperarComboProduto(String codigoProdutoComboErp) {
		String declare = String.format("DECLARE set varchar(27) @CODIGO_COMBO = '%s'", codigoProdutoComboErp);
		getJdbcTemplate().update(declare);
		return selectViewSingle(ViewsIntegracaoERP.VW_COMBO_PRODUTO, new DetalheComboProdutoRowMapper());
	}
	
	public Integer count() {
		String declare = "DECLARE set varchar(27) @CODIGO_COMBO = '';";
		getJdbcTemplate().update(declare);
		String sql = "select count(*) from "+ getSchemaDatabase() + "." + ViewsIntegracaoERP.VW_COMBO_PRODUTO;
		return contaRegistros(sql);
	}
}
