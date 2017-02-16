package br.com.control.dao;

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
		return selectViewSingle(TabelasIntegracao.TIPO_COBRANCA_CLIENTE, new TipoCobrancaClienteRowMapper());

	}

}
