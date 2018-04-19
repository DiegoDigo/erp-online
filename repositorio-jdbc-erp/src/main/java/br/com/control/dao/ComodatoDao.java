package br.com.control.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import br.com.control.portal.dto.ComodatoDTO;
import br.com.control.portal.integracao.ViewsIntegracaoERP;
import br.com.control.repositorio.mappers.ComodatoRowMapper;
import br.com.control.vendas.cadastro.modelo.Comodato;

@Repository
public class ComodatoDao extends JdbcDao<Comodato> {

	public Comodato buscarComodato(String codigoERP) {
		String declare = "DECLARE set Integer @CODIGO_CEV = " + Integer.valueOf(codigoERP) + ";";
		getJdbcTemplate().update(declare);		
		return selectViewSingle(ViewsIntegracaoERP.VW_COMODATO, new ComodatoRowMapper());
	}

	public List<Comodato> listar() {
		String declare = "DECLARE set Integer @CODIGO_CEV = 0 ";
		getJdbcTemplate().update(declare);
		return selectViewSemWhere(ViewsIntegracaoERP.VW_COMODATO, new ComodatoRowMapper());
	}
	
	public Integer count() {
		String declare = "DECLARE set Integer @CODIGO_CEV = 0 ";
		getJdbcTemplate().update(declare);
		String sql = "select count(*) from "+ getSchemaDatabase() + "." + ViewsIntegracaoERP.VW_COMODATO;
		return contaRegistros(sql);
	}

	public List<ComodatoDTO> retirarComodato(List<ComodatoDTO> comodatos) {
		// TODO Auto-generated method stub
		return comodatos;
	}

}
