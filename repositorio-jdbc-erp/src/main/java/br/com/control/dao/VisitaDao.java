package br.com.control.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import br.com.control.portal.integracao.TabelasIntegracao;
import br.com.control.repositorio.mappers.VisitaRowMapper;
import br.com.control.vendas.cadastro.modelo.cliente.Visita;

@Repository
@Transactional
public class VisitaDao extends JdbcDao<Visita> {

	public List<Visita> listaTodas() {
		return selectViewSemWhere(TabelasIntegracao.VISITAS, new VisitaRowMapper());
	}
}
