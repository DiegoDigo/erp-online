package br.com.control.dao;

import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import br.com.control.vendas.cadastro.modelo.SisTipoMotivoGeral;

@Repository
@Transactional
public class SisTipoMotivoGeralDao extends JdbcDao<SisTipoMotivoGeral> {

}
