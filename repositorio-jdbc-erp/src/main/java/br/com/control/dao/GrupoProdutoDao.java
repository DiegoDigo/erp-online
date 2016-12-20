package br.com.control.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import br.com.control.integracao.TabelasIntegracao;
import br.com.control.repositorio.mappers.GrupoRowMapper;
import br.com.control.vendas.cadastro.modelo.produto.Grupo;

@Repository
@Transactional
public class GrupoProdutoDao extends JdbcDao<Grupo> {

	public List<Grupo> listaTodasGrupos() {
		String declare = "DECLARE set int @CODIGO_GRUPO_PRODUTO = 0;";
		getJdbcTemplate().update(declare);
		return selectViewSemWhere(TabelasIntegracao.CADASTRO_GRUPO_PRODUTO, new GrupoRowMapper());
	}

}
