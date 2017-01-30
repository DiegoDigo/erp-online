package br.com.control.repositorio;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import br.com.control.auditoria.Auditoria;

public interface AuditoriaRepository extends CrudRepository<Auditoria, Long> {

	@Query("select a from Auditoria a where a.identificacao.matriculaAssociada = :matricula")
	public List<Auditoria> retornaSolicitacoesPorMatricula(@Param("matricula") String matricula);
	
}
