package br.com.control.cadastro;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.control.dao.PrecoDao;
import br.com.control.integracao.TabelasIntegracaoPortal;
import br.com.control.repositorio.mappers.PrecoRowMapper;
import br.com.control.vendas.cadastro.modelo.preco.Preco;

@Service
@Transactional
public class PrecoService {
	
	@Autowired
	private PrecoDao precoDao;
	
	public List<Preco> ListaPreco(){
		return precoDao.selectViewSemWhere(TabelasIntegracaoPortal.CADASTRO_PRECO, new PrecoRowMapper());		
	}

}
