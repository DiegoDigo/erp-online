package br.com.control.cadastro.sincronismo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.control.auditoria.Auditoria;
import br.com.control.repositorio.AuditoriaRepository;

@Service
public class AuditoriaSincronismoService {
	
	@Autowired
	private AuditoriaRepository auditoriaRepository;
	
	public List<Auditoria>buscarAuditoriaPorMatricula(String matricula){
		return auditoriaRepository.retornaSolicitacoesPorMatricula(matricula);
	}

}
