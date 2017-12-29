package br.com.control.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import br.com.control.portal.integracao.ViewsIntegracaoERP;
import br.com.control.repositorio.mappers.VendedorRowMapper;
import br.com.control.vendas.cadastro.modelo.vendedor.Vendedor;

@Repository
@Transactional
public class VendedorDao extends JdbcDao<Vendedor> {

	public List<Vendedor> listarVendedores() {
		String declare = "DECLARE set char(3) @CODIGO_VENDEDOR = '';";
		getJdbcTemplate().update(declare);
		return selectViewSemWhere(ViewsIntegracaoERP.VW_VENDEDOR, new VendedorRowMapper());
	}

	public Vendedor recuperarVendedor(String codigoErp) {
		String declare = String.format("DECLARE set char(3) @CODIGO_VENDEDOR = '%s' ;",  codigoErp );
		getJdbcTemplate().update(declare);
		return selectViewSingle(ViewsIntegracaoERP.VW_VENDEDOR, new VendedorRowMapper());
	}

}
