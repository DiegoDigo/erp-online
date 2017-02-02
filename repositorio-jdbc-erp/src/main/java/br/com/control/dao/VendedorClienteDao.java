package br.com.control.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import br.com.control.portal.integracao.TabelasIntegracao;
import br.com.control.repositorio.mappers.VendedorClienteRowMapper;
import br.com.control.vendas.cadastro.modelo.vendedor.VendedorCliente;

@Repository
public class VendedorClienteDao extends JdbcDao<VendedorCliente> {

	public List<VendedorCliente> recuperarClientesVendedor(String codigoErp) {
		String declare = String.format("DECLARE set char(3) @CODIGO_VENDEDOR = '%s' ;",  codigoErp );
		getJdbcTemplate().update(declare);
		return selectViewSemWhere(TabelasIntegracao.CADASTRO_VENDEDOR_CLIENTE, new VendedorClienteRowMapper());
	}
}
