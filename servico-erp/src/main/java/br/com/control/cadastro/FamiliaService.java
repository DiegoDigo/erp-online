package br.com.control.cadastro;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.control.dao.FamiliaProdutoDao;
import br.com.control.integracao.TabelasIntegracao;
import br.com.control.repositorio.mappers.FamiliaRowMapper;
import br.com.control.vendas.cadastro.modelo.produto.Familia;

@Service
public class FamiliaService {

	@Autowired
	private FamiliaProdutoDao familiaDao;

	public List<Familia> listarTodos(String numeroMatricula) {
		return familiaDao.selectViewSemWhere(TabelasIntegracao.CADASTRO_FAMILIA_PRODUTO, new FamiliaRowMapper());
	}
}
