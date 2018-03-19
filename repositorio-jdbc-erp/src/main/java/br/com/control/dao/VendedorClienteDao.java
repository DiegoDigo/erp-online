package br.com.control.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import br.com.control.portal.integracao.ViewsIntegracaoERP;
import br.com.control.repositorio.mappers.VendedorClienteRowMapper;
import br.com.control.vendas.cadastro.modelo.vendedor.VendedorCliente;

@Repository
public class VendedorClienteDao extends JdbcDao<VendedorCliente> {

	public List<VendedorCliente> listar() {
		String declare = "DECLARE set varchar(20) @CODIGO_CLIENTE = '';";
		getJdbcTemplate().update(declare);
		return selectViewSemWhere(ViewsIntegracaoERP.VW_VENDEDOR_CLIENTE, new VendedorClienteRowMapper());
	}

	public List<VendedorCliente> recuperarClientesVendedor(String codigoErp) {
		String declare = String.format("DECLARE set varchar(20) @CODIGO_CLIENTE= '%s';", codigoErp);
		getJdbcTemplate().update(declare);
		return selectViewSemWhere(ViewsIntegracaoERP.VW_VENDEDOR_CLIENTE, new VendedorClienteRowMapper());
	}
	
	public Integer count() {
		String declare = "DECLARE set varchar(20) @CODIGO_CLIENTE = '';";
		getJdbcTemplate().update(declare);
		String sql = "select count(*) from "+ getSchemaDatabase() + "." + ViewsIntegracaoERP.VW_VENDEDOR_CLIENTE;
		return contaRegistros(sql);
	}
}
