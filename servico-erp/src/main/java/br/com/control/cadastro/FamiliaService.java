package br.com.control.cadastro;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.control.repositorio.FamiliaDao;
import br.com.control.vendas.cadastro.modelo.produto.Familia;

@Service
@Transactional
public class FamiliaService {
	
	@Autowired
	private FamiliaDao familiaDao;
	

	public List<Familia> listarTodos(String numeroMatricula){
		List<Familia> listaFamilias = new ArrayList<>();
		Iterable<Familia> familiasIterable = familiaDao.listaTodasAsFamiliasDaMatricula(numeroMatricula);
		familiasIterable.forEach(listaFamilias::add);
		return listaFamilias;
	}
}
