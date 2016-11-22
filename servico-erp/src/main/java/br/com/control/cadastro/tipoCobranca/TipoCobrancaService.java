package br.com.control.cadastro.tipoCobranca;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.control.dao.TipoCobrancaDao;
import br.com.control.vendas.cadastro.modelo.tipoCobranca.TipoCobranca;

@Service
@Transactional
public class TipoCobrancaService {
	
	@Autowired
	private TipoCobrancaDao tipoCobrancaDao;
	
	public List<TipoCobranca> listarTiposCobrancas(){		
		List<TipoCobranca> tiposCobrancas = new ArrayList<>();
		Iterable<TipoCobranca> tipos = tipoCobrancaDao.listarTipoCobranca();
		tipos.forEach(tiposCobrancas::add);	
		return tiposCobrancas;
	}

}
