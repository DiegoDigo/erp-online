package br.com.control.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import br.com.control.integracao.TabelasIntegracaoPortal;
import br.com.control.repositorio.mappers.MarcaRowMapper;
import br.com.control.vendas.cadastro.modelo.produto.Marca;

@Repository
@Transactional
public class MarcaProdutoDao extends JdbcDao {

	public List<Marca> listaTodasAsFamiliasDaMatricula(String matricula) {
		String declare = "DECLARE set date @CODIGO_MARCA_PRODUTO = 0;";
		getJdbcTemplate().update(declare);
		String sql = "SELECT * FROM " + TabelasIntegracaoPortal.CADASTRO_MARCA_PRODUTO.getViewERP();
		List<Marca> marcas = getJdbcTemplate().query(sql, new MarcaRowMapper());
		return marcas;
	}
}
