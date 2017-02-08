package br.com.control.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import br.com.control.portal.integracao.TabelasIntegracao;
import br.com.control.repositorio.mappers.TipoEnderecoRowMapper;
import br.com.control.vendas.cadastro.modelo.cliente.TipoEndereco;
  
@Repository
@Transactional
public class TipoEnderecoDao extends JdbcDao<TipoEndereco> {
	
	public List<TipoEndereco> ListarTipoEndereco() {
		String declare = "DECLARE set int @ATIVO = 1";
		getJdbcTemplate().update(declare);		
		return selectViewSemWhere(TabelasIntegracao.CADASTRO_TIPO_ENDERECO,
				new TipoEnderecoRowMapper());
	}
}
