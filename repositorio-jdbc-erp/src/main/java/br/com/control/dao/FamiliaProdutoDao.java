package br.com.control.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import br.com.control.portal.integracao.ViewsIntegracaoERP;
import br.com.control.repositorio.mappers.FamiliaRowMapper;
import br.com.control.vendas.cadastro.modelo.produto.Familia;

@Repository
@Transactional
public class FamiliaProdutoDao extends JdbcDao<Familia> {

	public List<Familia> listaTodasAsFamiliasDaMatricula() {
		String declare = "DECLARE set date @CODIGO_FAMILIA = 0;";
		getJdbcTemplate().update(declare);
		return selectViewSemWhere(ViewsIntegracaoERP.VW_FAMILIA_PRODUTO, new FamiliaRowMapper());
	}
	
	public Familia recuperaFamilia(String codigoErp) {
		String declare = "DECLARE set date @CODIGO_FAMILIA = "+codigoErp+";";
		getJdbcTemplate().update(declare);
		return selectViewSingle(ViewsIntegracaoERP.VW_FAMILIA_PRODUTO, new FamiliaRowMapper());
	}
	
	public Integer count() {
		String declare = "DECLARE set date @CODIGO_FAMILIA = 0;";
		getJdbcTemplate().update(declare);
		String sql = "select count(*) from "+ getSchemaDatabase() + "." + ViewsIntegracaoERP.VW_FAMILIA_PRODUTO;
		return contaRegistros(sql);
	}
}
