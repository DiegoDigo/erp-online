package br.com.control.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import br.com.control.portal.integracao.TabelasIntegracao;
import br.com.control.repositorio.mappers.DetalheComboProdutoRowMapper;
import br.com.control.vendas.cadastro.modelo.produto.DetalheComboProduto;

@Repository
@Transactional
public class DetalheComboProdutoDao extends JdbcDao<DetalheComboProduto> {

	

	public List<DetalheComboProduto> listaTodosOsCombos() {
		String declare = "DECLARE set int @CODIGO_COMBO = 0;";
		getJdbcTemplate().update(declare);
		return selectViewSemWhere(TabelasIntegracao.CADASTRO_DETALHE_PRODUTO_COMBO, new DetalheComboProdutoRowMapper());
	}
	
	public List<DetalheComboProduto> recuperarComboProduto(String codigoProdutoComboErp) {
		String declare = "DECLARE set int @CODIGO_COMBO = " + codigoProdutoComboErp;
		getJdbcTemplate().update(declare);
		return selectViewSemWhere(TabelasIntegracao.CADASTRO_DETALHE_PRODUTO_COMBO, new DetalheComboProdutoRowMapper());
	}
}
