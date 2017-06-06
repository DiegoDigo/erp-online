package br.com.control.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import br.com.control.portal.integracao.TabelasIntegracao;
import br.com.control.repositorio.mappers.PrecoRowMapper;
import br.com.control.vendas.cadastro.modelo.preco.Preco;

@Repository
@Transactional
public class PrecoDao extends JdbcDao<Preco> {

	public List<Preco> listarPreco(Integer codigoEmpresa) {
		String declare = "DECLARE set int @TABELA_ANO = 2016;";
		String declare2 = "DECLARE set int @TABELA_MES = 07;";
		String codEmp = "DECLARE set int @CODDEMP =" + codigoEmpresa + ";";
		getJdbcTemplate().update(declare);
		getJdbcTemplate().update(declare2);
		getJdbcTemplate().update(codEmp);
		return selectViewSemWhere(TabelasIntegracao.CADASTRO_PRECO, new PrecoRowMapper());
	}

}
