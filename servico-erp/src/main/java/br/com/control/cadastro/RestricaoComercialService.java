package br.com.control.cadastro;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.control.dao.RestricaoComercialDao;
import br.com.control.integracao.TabelasIntegracao;
import br.com.control.repositorio.mappers.RestricaoComercialRowMapper;
import br.com.control.vendas.cadastro.modelo.RestricaoComercial;

@Service
public class RestricaoComercialService {

	@Autowired
	private RestricaoComercialDao restricaoComercialDao;

	public List<RestricaoComercial> listar() {
		return restricaoComercialDao.selectViewSemWhere(TabelasIntegracao.CADASTRO_RESTRICAO_COMERCIAL, new RestricaoComercialRowMapper());
	}

}