package br.com.control.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import br.com.control.integracao.TabelasIntegracaoPortal;
import br.com.control.repositorio.mappers.VendedorRowMapper;
import br.com.control.vendas.cadastro.modelo.vendedor.Vendedor;

@Repository
@Transactional
public class VendedorDao extends JdbcDao{
	
	public List<Vendedor> listarVendedor(){
		String sql = "Select * from " + TabelasIntegracaoPortal.CADASTRO_VENDEDOR.getViewERP();
		return getJdbcTemplate().query(sql, new VendedorRowMapper());
	}
	
}
