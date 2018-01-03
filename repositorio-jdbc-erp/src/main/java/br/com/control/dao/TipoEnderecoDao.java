package br.com.control.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import br.com.control.portal.integracao.ViewsIntegracaoERP;
import br.com.control.repositorio.mappers.TipoEnderecoRowMapper;
import br.com.control.vendas.cadastro.modelo.cliente.TipoEndereco;
  
@Repository
@Transactional
public class TipoEnderecoDao extends JdbcDao<TipoEndereco> {
	
	public List<TipoEndereco> listarTipoEndereco() {
		String declare = "DECLARE set int @ATIVO = 1";
		getJdbcTemplate().update(declare);		
		String declare2 = "DECLARE set varchar(255) @sigla = '' ";
		getJdbcTemplate().update(declare2);		
		return selectViewSemWhere(ViewsIntegracaoERP.VW_TIPO_ENDERECO,
				new TipoEnderecoRowMapper());
	}
	
	public TipoEndereco recuperaTipoEndereco(String sigla) {
		String declare = "DECLARE set int @ATIVO = 1";
		getJdbcTemplate().update(declare);
		String declare2 = String.format("DECLARE set varchar(255) @sigla = '%s'", sigla);
		getJdbcTemplate().update(declare2);
		return selectViewSingle(ViewsIntegracaoERP.VW_TIPO_ENDERECO,
				new TipoEnderecoRowMapper());
	}
}
