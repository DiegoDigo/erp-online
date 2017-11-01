package br.com.control.cadastro;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.control.dao.RestricaoFinanceiraDao;
import br.com.control.vendas.cadastro.modelo.RestricaoFinanceira;

@Service
public class RestricaoFinanceiraService {

	@Autowired
	private RestricaoFinanceiraDao restricaoFinanceiraDao;

	public List<RestricaoFinanceira> listar() {
		return restricaoFinanceiraDao.listar();
	}

	public RestricaoFinanceira buscarPorCodigoErp(String codigoErp) {
		return restricaoFinanceiraDao.buscarPorCodigoErp(codigoErp);
	}

}
