package br.com.control.cadastro;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.control.dao.RestricaoComercialDao;
import br.com.control.portal.integracao.ViewsIntegracaoERP;
import br.com.control.repositorio.mappers.RestricaoComercialRowMapper;
import br.com.control.vendas.cadastro.modelo.RestricaoComercial;

@Service
public class RestricaoComercialService {

	@Autowired
	private RestricaoComercialDao restricaoComercialDao;

	public List<RestricaoComercial> listar() {
		return restricaoComercialDao.selectViewSemWhere(ViewsIntegracaoERP.VW_CADASTRO_RESTRICAO_COMERCIAL, new RestricaoComercialRowMapper());
	}

}
