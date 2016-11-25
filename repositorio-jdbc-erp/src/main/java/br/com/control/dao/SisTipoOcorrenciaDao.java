package br.com.control.dao;

import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import br.com.control.vendas.cadastro.modelo.ocorrencia.SisTipoOCorrencia;

@Repository
@Transactional
public class SisTipoOcorrenciaDao extends JdbcDao<SisTipoOCorrencia> {

}
