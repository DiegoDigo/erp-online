package br.com.control.cadastro;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.control.dao.BandaPrecoItemDao;
import br.com.control.vendas.cadastro.modelo.preco.BandaPrecoItem;

@Service
public class BandaPrecoItemService {

	@Autowired
	private BandaPrecoItemDao bandaPrecoItemDao;

	public List<BandaPrecoItem> listar() {
		return bandaPrecoItemDao.listar();
	}

	public List<BandaPrecoItem> buscaBandaPrecoItem(Integer codigoBandaPreco) {
		return bandaPrecoItemDao.buscarBandaItem(codigoBandaPreco);
	}
	
	public Integer count() {
		return bandaPrecoItemDao.count();
	}

}
