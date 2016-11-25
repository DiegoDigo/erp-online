package br.com.control.cadastro;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.control.dao.RestricaoComercialItemDao;
import br.com.control.integracao.TabelasIntegracaoPortal;
import br.com.control.repositorio.mappers.RestricaoComercialItemRowMapper;
import br.com.control.vendas.cadastro.modelo.RestricaoComercialItem;

@Service
public class RestricaoComercialItemService {

	@Autowired
	private RestricaoComercialItemDao restricaoComercialItemDao;

	public List<RestricaoComercialItem> listar() {
		return restricaoComercialItemDao.selectViewSemWhere(TabelasIntegracaoPortal.CADASTRO_RESTRICAO_COMERCIAL_ITEM, new RestricaoComercialItemRowMapper());

	}

}
