package br.com.control.cadastro.tipoCobranca;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.control.dao.TipoCobrancaDao;
import br.com.control.integracao.TabelasIntegracaoPortal;
import br.com.control.repositorio.mappers.TipoCobrancaRowMapper;
import br.com.control.vendas.cadastro.modelo.tipoCobranca.TipoCobranca;

@Service
@Transactional
public class TipoCobrancaService {
	
	@Autowired
	private TipoCobrancaDao tipoCobrancaDao;
	
	public List<TipoCobranca> listarTiposCobrancas(){		
		return tipoCobrancaDao.selectViewSemWhere(TabelasIntegracaoPortal.CADASTRO_TIPO_COBRANCA, new TipoCobrancaRowMapper());
	}

}
