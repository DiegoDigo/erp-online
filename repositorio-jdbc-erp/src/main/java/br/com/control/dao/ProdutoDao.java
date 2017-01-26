package br.com.control.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import br.com.control.integracao.TabelasIntegracao;
import br.com.control.repositorio.mappers.ProdutoRowMapper;
import br.com.control.vendas.cadastro.modelo.produto.Produto;

@Repository
@Transactional
public class ProdutoDao extends JdbcDao<Produto> {

	public List<Produto> listarProdutos() {
		String declare = "DECLARE set date @CODIGO_PROD = 0;";
		getJdbcTemplate().update(declare);		
		return selectViewSemWhere(TabelasIntegracao.CADASTRO_PRODUTO, new ProdutoRowMapper());
	}

}
