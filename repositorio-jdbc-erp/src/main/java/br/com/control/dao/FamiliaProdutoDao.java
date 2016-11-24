package br.com.control.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import br.com.control.integracao.TabelasIntegracaoPortal;
import br.com.control.repositorio.mappers.FamiliaRowMapper;
import br.com.control.vendas.cadastro.modelo.produto.Familia;

@Repository
public class FamiliaProdutoDao extends JdbcDao<Familia> {

	public List<Familia> listaTodasAsFamiliasDaMatricula(String matricula) {
		String declare = "DECLARE set date @ALTEDT_FAMILIA_PRODUTO = 0;";
		getJdbcTemplate().update(declare);
		return selectViewSemWhere(TabelasIntegracaoPortal.CADASTRO_FAMILIA_PRODUTO, new FamiliaRowMapper());
	}
}