package br.com.control.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import br.com.control.integracao.TabelasIntegracaoPortal;
import br.com.control.repositorio.mappers.ProdutoRowMapper;
import br.com.control.vendas.cadastro.modelo.produto.Produto;

@Repository
@Transactional
public class ProdutoDao extends JdbcDao {

	public List<Produto> listarProduto() {
		String sql = "select * from " + TabelasIntegracaoPortal.CADASTRO_PRODUTO.getViewERP();
		return getJdbcTemplate().query(sql, new ProdutoRowMapper());
	}

}
