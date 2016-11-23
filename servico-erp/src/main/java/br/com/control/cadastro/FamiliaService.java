package br.com.control.cadastro;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.control.dao.FamiliaProdutoDao;
import br.com.control.integracao.TabelasIntegracaoPortal;
import br.com.control.repositorio.mappers.FamiliaRowMapper;
import br.com.control.vendas.cadastro.modelo.produto.Familia;

@Service
@Transactional
public class FamiliaService {
	
	@Autowired
	private FamiliaProdutoDao familiaDao;

	public List<Familia> listarTodos(String numeroMatricula){
		return familiaDao.selectViewSemWhere(TabelasIntegracaoPortal.CADASTRO_FAMILIA_PRODUTO, new FamiliaRowMapper());
	}
}
