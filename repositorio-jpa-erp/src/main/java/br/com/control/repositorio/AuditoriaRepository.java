package br.com.control.repositorio;

import org.springframework.data.repository.CrudRepository;

import br.com.control.auditoria.Auditoria;

public interface AuditoriaRepository extends CrudRepository<Auditoria, Long> {

}
