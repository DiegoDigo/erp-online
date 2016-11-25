package br.com.control.dao;

import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import br.com.control.vendas.cadastro.modelo.tipoCobranca.TipoCobranca;

@Repository
@Transactional
public class TipoCobrancaDao extends JdbcDao<TipoCobranca> {

}
