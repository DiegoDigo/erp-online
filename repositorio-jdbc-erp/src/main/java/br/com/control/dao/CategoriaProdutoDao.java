package br.com.control.dao;

import java.util.List;
import javax.transaction.Transactional;
import org.springframework.stereotype.Repository;
import br.com.control.autenticacao.mapper.CategoriaRowMapper;
import br.com.control.integracao.TabelasIntegracaoPortal;
import br.com.control.vendas.cadastro.modelo.produto.Categoria;

@Repository
@Transactional
public class CategoriaProdutoDao extends JdbcDao {
	
	public List<Categoria> listaTodasAsFamiliasDaMatricula(String matricula) {
		String declare = "DECLARE set date @CODIGO_CATEGORIA_PRODUTO = 0;";
		getJdbcTemplate().update(declare);
		String sql = "SELECT * FROM "+TabelasIntegracaoPortal.CADASTRO_CATEGORIA_PRODUTO.getViewERP();
		List<Categoria> categorias = getJdbcTemplate().query(sql, new CategoriaRowMapper());
		return categorias;
	}

}
