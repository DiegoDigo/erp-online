package br.com.control.cadastro;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.control.dao.PrecoDao;
import br.com.control.integracao.TabelasIntegracao;
import br.com.control.repositorio.mappers.PrecoRowMapper;
import br.com.control.vendas.cadastro.modelo.preco.Preco;

@Service
public class PrecoService {

	@Autowired
	private PrecoDao precoDao;

	public List<Preco> ListaPreco() {
		return precoDao.selectViewSemWhere(TabelasIntegracao.CADASTRO_PRECO, new PrecoRowMapper());
	}

}
