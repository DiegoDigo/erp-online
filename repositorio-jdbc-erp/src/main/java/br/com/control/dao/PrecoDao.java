package br.com.control.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import br.com.control.portal.integracao.TabelasIntegracao;
import br.com.control.repositorio.mappers.PrecoRowMapper;
import br.com.control.vendas.cadastro.modelo.preco.Preco;

@Repository
@Transactional
public class PrecoDao extends JdbcDao<Preco> {

	public List<Preco> listarPreco() {
		String codTab = "DECLARE set bigint @COD_TABELA = 0;";
		getJdbcTemplate().update(codTab);
		String codProd = "DECLARE set bigint @COD_PRODUTO = 0;";
		getJdbcTemplate().update(codProd);
		return selectViewSemWhere(TabelasIntegracao.CADASTRO_PRECO, new PrecoRowMapper());
	}
	
	public Preco recuperarPreco(String codigoPrecoProdutoErp) {
		String codTab = "DECLARE set bigint @COD_TABELA = "+codigoPrecoProdutoErp.substring(0, 8)+";";
		getJdbcTemplate().update(codTab);
		String codProd = "DECLARE set bigint @COD_PRODUTO = "+codigoPrecoProdutoErp.substring(8, codigoPrecoProdutoErp.length())+";";
		getJdbcTemplate().update(codProd);
		return selectViewSingle(TabelasIntegracao.CADASTRO_PRECO, new PrecoRowMapper());
	}

}
