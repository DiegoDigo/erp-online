package br.com.control.cadastro.sincronismo;

import java.util.Calendar;
import java.util.TimeZone;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import br.com.control.auditoria.Auditoria;
import br.com.control.portal.filter.ResultadoPaginado;
import br.com.control.repositorio.AuditoriaRepository;

@Service
public class AuditoriaSincronismoService {
	
	@Autowired
	private AuditoriaRepository auditoriaRepository;
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public ResultadoPaginado<Auditoria>buscarAuditoriaPorMatricula(Calendar inicio, Calendar fim, String matricula, Pageable pageable){
		TimeZone tz = TimeZone.getTimeZone("America/Sao_Paulo");
		inicio.setTimeZone(tz);
		fim.setTimeZone(tz);
		return new ResultadoPaginado(auditoriaRepository.retornaSolicitacoesPorMatricula(inicio, fim, matricula, pageable));
	}

}
