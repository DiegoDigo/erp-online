package br.com.control.cadastro;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.control.dao.ParocoDao;
import br.com.control.vendas.cadastro.modelo.produto.Paroco;

@Service
public class ParocoService {

	@Autowired
	private ParocoDao parocoDao;

	public List<Paroco> listarTodos() {
		return parocoDao.listaTodas();
	}

	public Paroco recuperaParoco(String codigoParocoErp) {
		return parocoDao.recuperarParoco(codigoParocoErp);
	}

	public Integer count() {
		return parocoDao.count();
	}
}
