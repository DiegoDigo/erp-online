package br.com.control.cadastro;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.control.dao.BandaPrecoItemDao;
import br.com.control.integracao.TabelasIntegracaoPortal;
import br.com.control.repositorio.mappers.BandaPrecoItemRowMapper;
import br.com.control.vendas.cadastro.modelo.preco.BandaPrecoItem;

@Service
public class BandaPrecoItemService {

	@Autowired
	private BandaPrecoItemDao bandaPrecoItemDao;

	public List<BandaPrecoItem> listar() {
		return bandaPrecoItemDao.selectViewSemWhere(TabelasIntegracaoPortal.CADASTRO_BANDA_PRECO_ITEM, new BandaPrecoItemRowMapper());
	}

}
