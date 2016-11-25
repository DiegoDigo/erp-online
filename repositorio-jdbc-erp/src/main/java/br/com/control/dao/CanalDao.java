package br.com.control.dao;

import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import br.com.control.vendas.cadastro.modelo.canal.Canal;

@Repository
@Transactional
public class CanalDao extends JdbcDao<Canal> {

}
