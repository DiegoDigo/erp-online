package br.com.control.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import br.com.control.portal.integracao.TabelasIntegracao;
import br.com.control.repositorio.mappers.VendedorRowMapper;
import br.com.control.vendas.cadastro.modelo.vendedor.Vendedor;

@Repository
@Transactional
public class VendedorDao extends JdbcDao<Vendedor> {

	public List<Vendedor> listarVendedores() {
		String declare = "DECLARE set char @CODIGO_VENDEDOR = '';";
		getJdbcTemplate().update(declare);
		return selectViewSemWhere(TabelasIntegracao.CADASTRO_VENDEDOR, new VendedorRowMapper());
	}

	public Vendedor recuperarVendedor(String codigoErp) {
		String declare = "DECLARE set char @CODIGO_VENDEDOR =" + codigoErp + ";";
		getJdbcTemplate().update(declare);
		return selectViewSingle(TabelasIntegracao.CADASTRO_VENDEDOR, new VendedorRowMapper());
	}

}
