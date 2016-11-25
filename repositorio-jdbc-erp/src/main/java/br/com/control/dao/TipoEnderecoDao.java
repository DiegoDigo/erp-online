package br.com.control.dao;

import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import br.com.control.vendas.cadastro.modelo.cliente.TipoEndereco;

@Repository
@Transactional
public class TipoEnderecoDao extends JdbcDao<TipoEndereco> {

}
