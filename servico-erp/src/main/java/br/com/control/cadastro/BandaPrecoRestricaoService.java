package br.com.control.cadastro;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.control.dao.BandaPrecoRestricaDao;
import br.com.control.portal.integracao.TabelasIntegracao;
import br.com.control.repositorio.mappers.BandaPrecoRestricaRowMapper;
import br.com.control.vendas.cadastro.modelo.preco.BandaPrecoRestricao;

@Service
public class BandaPrecoRestricaoService {

	@Autowired
	private BandaPrecoRestricaDao bandaPrecoRestricaDao;

	public List<BandaPrecoRestricao> listar() {
		return bandaPrecoRestricaDao.selectViewSemWhere(TabelasIntegracao.CADASTRO_BANDA_PRECO_RESTRICAO, new BandaPrecoRestricaRowMapper());
	}

}
