package br.com.control.dao;

import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import br.com.control.vendas.cadastro.modelo.MotivoGeral;

@Repository
@Transactional
public class MotivoGeralDao extends JdbcDao<MotivoGeral> {

}
