package br.com.control.cadastro;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.control.dao.FamiliaProdutoDao;
import br.com.control.vendas.cadastro.modelo.produto.Familia;

@Service
public class FamiliaService {

	@Autowired
	private FamiliaProdutoDao familiaDao;

	public List<Familia> listarTodos() {
		return familiaDao.listaTodasAsFamiliasDaMatricula();
	}

	public Familia recuperaFamilia(String codigoErp) {
		return familiaDao.recuperaFamilia(codigoErp);
	}
	
	public Integer count() {
		return familiaDao.count();
	}
}
