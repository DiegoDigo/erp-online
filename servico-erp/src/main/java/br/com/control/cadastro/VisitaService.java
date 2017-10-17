package br.com.control.cadastro;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.control.dao.VisitaDao;
import br.com.control.portal.mensageria.to.VisitaTO;
import br.com.control.vendas.cadastro.modelo.cliente.Visita;

@Service
public class VisitaService {

	@Autowired
	private VisitaDao visitaDao;

	public List<Visita> listarTodos() {
		this.processarVisitas(90);
		return visitaDao.listaTodas();
	}

	public void processarVisitas(int numeroDias) {
		VisitaTO visita = new VisitaTO();
		visita.setNumeroDias(numeroDias);
		visitaDao.processarVisitas(visita);
	}
}
