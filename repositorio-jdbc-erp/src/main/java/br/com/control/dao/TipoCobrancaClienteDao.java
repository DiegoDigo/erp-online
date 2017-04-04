package br.com.control.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import br.com.control.portal.integracao.TabelasIntegracao;
import br.com.control.repositorio.mappers.TipoCobrancaClienteRowMapper;
import br.com.control.vendas.cadastro.modelo.cliente.TipoCobrancaCliente;

@Repository
@Transactional
public class TipoCobrancaClienteDao extends JdbcDao<TipoCobrancaCliente> {

	
	public TipoCobrancaCliente recuperarTipoCobrancaCliente(String retornaCodigoERP) {
		String declare = "DECLARE set int @ATIVO = 1";
		getJdbcTemplate().update(declare);
		String declare2 = "DECLARE set VARCHAR(8) @codigoclienteerp = '"+ retornaCodigoERP+"'";
		getJdbcTemplate().update(declare2);
		return selectViewSingle(TabelasIntegracao.TIPO_COBRANCA_CLIENTE, new TipoCobrancaClienteRowMapper());

	}
	public List<TipoCobrancaCliente> retornaTodosTipoCobrancaCliente() {
		String declare = "DECLARE set int @ATIVO = 1";
		getJdbcTemplate().update(declare);
		String declare2 = "DECLARE set VARCHAR(8) @codigoclienteerp = ''";
		getJdbcTemplate().update(declare2);
		return selectViewSemWhere(TabelasIntegracao.TIPO_COBRANCA_CLIENTE,
				new TipoCobrancaClienteRowMapper());
	}

}
