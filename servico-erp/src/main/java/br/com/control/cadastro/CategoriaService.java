package br.com.control.cadastro;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.control.dao.CategoriaProdutoDao;
import br.com.control.vendas.cadastro.modelo.produto.Categoria;

@Service
@Transactional
public class CategoriaService {
	
	@Autowired
	private CategoriaProdutoDao categoriaDao;
	

	public List<Categoria> listarTodos(String numeroMatricula){
		List<Categoria> listaCategorias = new ArrayList<>();
		Iterable<Categoria> categoriasIterable = categoriaDao.listaTodasAsFamiliasDaMatricula(numeroMatricula);
		categoriasIterable.forEach(listaCategorias::add);
		return listaCategorias;
	}
}
