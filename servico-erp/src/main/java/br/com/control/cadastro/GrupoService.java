package br.com.control.cadastro;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.control.dao.GrupoProdutoDao;
import br.com.control.vendas.cadastro.modelo.produto.Grupo;

@Service
@Transactional
public class GrupoService {
	
	@Autowired
	private GrupoProdutoDao grupoDao;
	

	public List<Grupo> listarTodos(String numeroMatricula){
		List<Grupo> listaGrupos = new ArrayList<>();
		Iterable<Grupo> gruposIterable = grupoDao.listaTodasAsFamiliasDaMatricula(numeroMatricula);
		gruposIterable.forEach(listaGrupos::add);
		return listaGrupos;
	}
}
