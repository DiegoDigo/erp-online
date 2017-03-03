package br.com.control.cadastro;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.control.dao.BandaPrecoDao;
import br.com.control.vendas.cadastro.modelo.preco.BandaPreco;

@Service
public class BandaPrecoService {

	@Autowired
	private BandaPrecoDao bandaPrecoDao;

	public List<BandaPreco> listarBanda() {
		return bandaPrecoDao.listarBanda();
	}
	
	public BandaPreco buscarBanda(String codigoBanda) {
		return bandaPrecoDao.buscarBanda(codigoBanda);
	}

}
