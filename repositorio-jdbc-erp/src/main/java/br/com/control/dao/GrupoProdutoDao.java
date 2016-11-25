package br.com.control.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import br.com.control.integracao.TabelasIntegracaoPortal;
import br.com.control.repositorio.mappers.GrupoRowMapper;
import br.com.control.vendas.cadastro.modelo.produto.Grupo;

@Repository
@Transactional
public class GrupoProdutoDao extends JdbcDao<Grupo> {

	public List<Grupo> listaTodasAsFamiliasDaMatricula(String matricula) {
		String declare = "DECLARE set int @CODIGO_GRUPO_PRODUTO = 98;";
		getJdbcTemplate().update(declare);
		return selectViewSemWhere(TabelasIntegracaoPortal.CADASTRO_GRUPO_PRODUTO, new GrupoRowMapper());
	}

}
