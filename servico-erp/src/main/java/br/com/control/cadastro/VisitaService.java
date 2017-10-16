package br.com.control.cadastro;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.control.dao.VisitaDao;
import br.com.control.vendas.cadastro.modelo.cliente.Visita;

@Service
public class VisitaService {

	@Autowired
	private VisitaDao visitaDao;

	public List<Visita> listarTodos() {
		return visitaDao.listaTodas();
	}
}
