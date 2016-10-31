package br.com.control.cadastro;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.control.dao.MarcaProdutoDao;
import br.com.control.vendas.cadastro.modelo.produto.Marca;

@Service
@Transactional
public class MarcaService {
	
	@Autowired
	private MarcaProdutoDao marcaDao;
	

	public List<Marca> listarTodos(String numeroMatricula){
		List<Marca> listaMarcas = new ArrayList<>();
		Iterable<Marca> marcasIterable = marcaDao.listaTodasAsFamiliasDaMatricula(numeroMatricula);
		marcasIterable.forEach(listaMarcas::add);
		return listaMarcas;
	}
}
