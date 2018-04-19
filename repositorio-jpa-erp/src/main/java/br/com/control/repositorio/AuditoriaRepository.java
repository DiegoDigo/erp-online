package br.com.control.repositorio;

import java.util.Calendar;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

import br.com.control.auditoria.Auditoria;

public interface AuditoriaRepository extends PagingAndSortingRepository<Auditoria, Long>, CrudRepository<Auditoria, Long> {

	@Query("select a from Auditoria a where a.identificacao.matriculaAssociada = :matricula and a.dataInicioExecucaoServico between :inicio and :fim")
	public Page<Auditoria> retornaSolicitacoesPorMatricula(@Param("inicio") Calendar inicio,  @Param("fim") Calendar fim,  
			@Param("matricula") String matricula, Pageable pageable);
	
}
