package br.com.control.cadastro;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.control.dao.NFEChaveDao;
import br.com.control.portal.mensageria.to.NfeChaveTO;

@Service
public class NFEChaveService {

	@Autowired
	private NFEChaveDao nfeChaveDao;


	public List<NfeChaveTO> listarTodos() {
		return nfeChaveDao.listaTodos();

	}

	public NfeChaveTO recuperarPorNumeroNota(String numeroNota, String sequencia) {
		return nfeChaveDao.recuperaPorNumeroNota(numeroNota, sequencia);
	}

}
