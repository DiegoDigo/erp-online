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

	public List<DetalheComboProduto> recuperarComboProduto(String codigoProdutoComboErp) {
		String declare = "DECLARE set date @CODIGO_COMBO = " + codigoProdutoComboErp;
		getJdbcTemplate().update(declare);
		return selectViewSemWhere(TabelasIntegracao.CADASTRO_DETALHE_PRODUTO_COMBO,
				new DetalheComboProdutoRowMapper());
	
	}
	
}
