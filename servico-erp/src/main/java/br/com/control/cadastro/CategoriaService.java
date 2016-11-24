package br.com.control.cadastro;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.control.dao.CategoriaProdutoDao;
import br.com.control.vendas.cadastro.modelo.produto.Categoria;

@Service
public class CategoriaService {

	@Autowired
	private CategoriaProdutoDao categoriaDao;

	public List<Categoria> listarTodos() {
		return categoriaDao.listaTodasACategoriasDaMatricula();
	}
}
