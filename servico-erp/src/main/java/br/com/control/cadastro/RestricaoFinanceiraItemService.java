package br.com.control.cadastro;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.control.dao.RestricaoFinanceiraItemDao;
import br.com.control.vendas.cadastro.modelo.RestricaoFinanceiraItem;

@Service
public class RestricaoFinanceiraItemService {

	@Autowired
	private RestricaoFinanceiraItemDao restricaoFinanceiraItemDao;

	public List<RestricaoFinanceiraItem> listar() {
		return restricaoFinanceiraItemDao.listar();
	}

	public List<RestricaoFinanceiraItem> buscarPorCodigoErp(String codigoRestricaoFinanceiraErp) {
		return restricaoFinanceiraItemDao.buscarPorCodigoErp(codigoRestricaoFinanceiraErp);
	}
	
	public Integer count() {
		return restricaoFinanceiraItemDao.count();
	}

}
