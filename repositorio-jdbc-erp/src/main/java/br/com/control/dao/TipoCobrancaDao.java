package br.com.control.dao;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import br.com.control.vendas.cadastro.modelo.tipoCobranca.TipoCobranca;

@Repository
@Transactional
public class TipoCobrancaDao extends JdbcDao<TipoCobranca> {

	
}
