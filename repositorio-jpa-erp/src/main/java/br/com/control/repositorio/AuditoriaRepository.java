package br.com.control.repositorio;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

import br.com.control.auditoria.Auditoria;

public interface AuditoriaRepository extends PagingAndSortingRepository<Auditoria, Long>, CrudRepository<Auditoria, Long> {

	@Query("select a from Auditoria a where a.identificacao.matriculaAssociada = :matricula")
	public Page<Auditoria> retornaSolicitacoesPorMatricula(@Param("matricula") String matricula, Pageable pageable);
	
}
