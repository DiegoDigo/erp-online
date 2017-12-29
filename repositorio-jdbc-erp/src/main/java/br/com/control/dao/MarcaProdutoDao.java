package br.com.control.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import br.com.control.portal.integracao.ViewsIntegracaoERP;
import br.com.control.repositorio.mappers.MarcaRowMapper;
import br.com.control.vendas.cadastro.modelo.produto.Marca;

@Repository
public class MarcaProdutoDao extends JdbcDao<Marca> {

	public List<Marca> listaTodasAsMarcasDaMatricula() {
		String declare = "DECLARE set int @CODIGO_MARCA_PRODUTO = 0;";
		getJdbcTemplate().update(declare);
		return selectViewSemWhere(ViewsIntegracaoERP.VW_MARCA_PRODUTO, new MarcaRowMapper());
	}

	public Marca recuperarMarca(String codigoMarcaErp) {
		String declare = "DECLARE set int @CODIGO_MARCA_PRODUTO = " + codigoMarcaErp + ";";
		getJdbcTemplate().update(declare);
		return selectViewSingle(ViewsIntegracaoERP.VW_MARCA_PRODUTO, new MarcaRowMapper());
	}
}
