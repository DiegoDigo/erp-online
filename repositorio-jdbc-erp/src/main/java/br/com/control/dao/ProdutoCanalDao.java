package br.com.control.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import br.com.control.portal.integracao.TabelasIntegracao;
import br.com.control.repositorio.mappers.ProdutoCanalRowMapper;
import br.com.control.vendas.cadastro.modelo.produto.ProdutoCanal;

@Repository
@Transactional
public class ProdutoCanalDao extends JdbcDao<ProdutoCanal> {

	public List<ProdutoCanal> listarProdutosCanal() {
		String declare = "declare set  bigint @ID = 0;";
		getJdbcTemplate().update(declare);
		return selectViewSemWhere(TabelasIntegracao.CADASTRO_PRODUTO_CANAL, new ProdutoCanalRowMapper());
	}

}
