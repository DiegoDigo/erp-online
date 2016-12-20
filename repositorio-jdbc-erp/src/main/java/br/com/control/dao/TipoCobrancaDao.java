package br.com.control.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import br.com.control.integracao.TabelasIntegracao;
import br.com.control.repositorio.mappers.TipoCobrancaRowMapper;
import br.com.control.vendas.cadastro.modelo.tipoCobranca.TipoCobranca;

@Repository
@Transactional
public class TipoCobrancaDao extends JdbcDao<TipoCobranca> {

	public List<TipoCobranca> listarTiposCobrancas() {
		String declare = "DECLARE set date @CODIGO_TIPO_COBRANCA  = 0;";
		getJdbcTemplate().update(declare);
		return selectViewSemWhere(TabelasIntegracao.CADASTRO_TIPO_COBRANCA,
				new TipoCobrancaRowMapper());
	}

}
