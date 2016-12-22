package br.com.control.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import br.com.control.integracao.TabelasIntegracao;
import br.com.control.repositorio.mappers.MarcaRowMapper;
import br.com.control.vendas.cadastro.modelo.produto.Marca;

@Repository
public class MarcaProdutoDao extends JdbcDao<Marca> {

	public List<Marca> listaTodasAsMarcasDaMatricula(String matricula) {
		String declare = "DECLARE set date @CODIGO_MARCA_PRODUTO = 0;";
		getJdbcTemplate().update(declare);
		return selectViewSemWhere(TabelasIntegracao.CADASTRO_MARCA_PRODUTO, new MarcaRowMapper());
	}
}
