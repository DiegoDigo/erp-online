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
		getJdbcTemplate().update("DECLARE set varchar(27) @CODIGO_COMBO = '0'");
		getJdbcTemplate().update("DECLARE set varchar(27) @CODIGO_PRODUTO_ERP = '0'");
		getJdbcTemplate().update("DECLARE set varchar(27) @CODIGO_OCORRENCIA_ERP = '0'");
		return selectViewSemWhere(ViewsIntegracaoERP.VW_COMBO_PRODUTO, new DetalheComboProdutoRowMapper());
	}
	
	public DetalheComboProduto recuperarComboProduto(String codigoComboERP, String codigoProdutoERP, String codigoOcorrencia) {
		String codigoCombo = String.format("DECLARE set varchar(27) @CODIGO_COMBO = '%s'", codigoComboERP);
		String codigoProduto = String.format("DECLARE set varchar(27) @CODIGO_PRODUTO_ERP = '%s'", codigoProdutoERP);
		String ocorrencia = String.format("DECLARE set varchar(27) @CODIGO_OCORRENCIA_ERP = '%s'", codigoOcorrencia);

		getJdbcTemplate().update(codigoCombo);
		getJdbcTemplate().update(codigoProduto);
		getJdbcTemplate().update(ocorrencia);

		return selectViewSingle(ViewsIntegracaoERP.VW_COMBO_PRODUTO, new DetalheComboProdutoRowMapper());
	}
	
	public Integer count() {
		getJdbcTemplate().update("DECLARE set varchar(27) @CODIGO_COMBO = '0'");
		getJdbcTemplate().update("DECLARE set varchar(27) @CODIGO_PRODUTO_ERP = '0'");
		getJdbcTemplate().update("DECLARE set varchar(27) @CODIGO_OCORRENCIA_ERP = '0'");
		String sql = "select count(*) from "+ getSchemaDatabase() + "." + ViewsIntegracaoERP.VW_COMBO_PRODUTO;
		return contaRegistros(sql);
	}
}
