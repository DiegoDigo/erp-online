package br.com.control.autenticacao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.control.auditoria.Auditoria;
import br.com.control.repositorio.AuditoriaRepository;

@Service
public class AuditoriaService {

	@Autowired
	private AuditoriaRepository auditoriaRepository;

	public void salvar(Auditoria auditoria) {
		auditoriaRepository.save(auditoria);
	}

}
