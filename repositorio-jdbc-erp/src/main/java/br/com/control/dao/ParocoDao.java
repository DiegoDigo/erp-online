package br.com.control.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import br.com.control.portal.integracao.TabelasIntegracao;
import br.com.control.repositorio.mappers.ParocoRowMapper;
import br.com.control.vendas.cadastro.modelo.produto.Paroco;

@Repository
public class ParocoDao extends JdbcDao<Paroco> {

	public List<Paroco> listaTodas() {
		String declare = "DECLARE set int @CODIGO_EMPRESA = 0;";
		getJdbcTemplate().update(declare);
		return selectViewSemWhere(TabelasIntegracao.CADASTRO_PAROCO, new ParocoRowMapper());
	}

	public Paroco recuperarParoco(String codigoParocoErp) {
		String declare = "DECLARE set int @CODIGO_EMPRESA = " + codigoParocoErp + ";";
		getJdbcTemplate().update(declare);
		return selectViewSingle(TabelasIntegracao.CADASTRO_PAROCO, new ParocoRowMapper());
	}
}