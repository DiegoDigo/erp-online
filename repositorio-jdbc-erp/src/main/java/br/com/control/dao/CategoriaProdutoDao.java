package br.com.control.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import br.com.control.portal.integracao.ViewsIntegracaoERP;
import br.com.control.repositorio.mappers.CategoriaRowMapper;
import br.com.control.vendas.cadastro.modelo.produto.Categoria;

@Repository
@Transactional
public class CategoriaProdutoDao extends JdbcDao<Categoria> {

	public List<Categoria> listaTodasACategoriasDaMatricula() {
		String declare = "DECLARE set date @CODIGO_CATEGORIA_PRODUTO = 0;";
		getJdbcTemplate().update(declare);
		return selectViewSemWhere(ViewsIntegracaoERP.VW_CATEGORIA_PRODUTO, new CategoriaRowMapper());
	}

	public Categoria recuperarCategoria(String codigoCategoriaErp) {
		String declare = "DECLARE set int @CODIGO_CATEGORIA_PRODUTO = " + codigoCategoriaErp + ";";
		getJdbcTemplate().update(declare);
		return selectViewSingle(ViewsIntegracaoERP.VW_CATEGORIA_PRODUTO, new CategoriaRowMapper());
	}
}
