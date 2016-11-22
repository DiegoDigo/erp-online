package br.com.control.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import br.com.control.integracao.TabelasIntegracaoPortal;
import br.com.control.repositorio.mappers.TipoEnderecoRowMapper;
import br.com.control.vendas.cadastro.modelo.cliente.TipoEndereco;

@Repository
@Transactional
public class TipoEnderecoDao extends JdbcDao {

	public List<TipoEndereco> listarTiposEndereco() {
		String sql = "select * from " + TabelasIntegracaoPortal.CADASTRO_TIPO_ENDERECO.getViewERP();
		return getJdbcTemplate().query(sql, new TipoEnderecoRowMapper());
	}

}
