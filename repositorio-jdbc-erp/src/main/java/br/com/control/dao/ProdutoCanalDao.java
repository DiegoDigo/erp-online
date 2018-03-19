package br.com.control.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import br.com.control.portal.integracao.ViewsIntegracaoERP;
import br.com.control.repositorio.mappers.ProdutoCanalRowMapper;
import br.com.control.vendas.cadastro.modelo.produto.ProdutoCanal;

@Repository
@Transactional
public class ProdutoCanalDao extends JdbcDao<ProdutoCanal> {

	public List<ProdutoCanal> listarProdutosCanal() {
		String declare = "declare set  bigint @ID = 0;";
		getJdbcTemplate().update(declare);
		return selectViewSemWhere(ViewsIntegracaoERP.VW_PRODUTOS_POR_CANAL, new ProdutoCanalRowMapper());
	}
	
	public ProdutoCanal recuperaProdutoCanal(String codigoErp) {
		String declare = "declare set  bigint @ID = "+codigoErp+";";
		getJdbcTemplate().update(declare);
		return selectViewSingle(ViewsIntegracaoERP.VW_PRODUTOS_POR_CANAL, new ProdutoCanalRowMapper());
	}
	
	public Integer count() {
		String declare = "declare set  bigint @ID = 0;";
		getJdbcTemplate().update(declare);
		String sql = "select count(*) from "+ getSchemaDatabase() + "." + ViewsIntegracaoERP.VW_PRODUTOS_POR_CANAL;
		return contaRegistros(sql);
	}

}
