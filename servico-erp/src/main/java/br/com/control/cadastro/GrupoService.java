package br.com.control.cadastro;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.control.dao.GrupoProdutoDao;
import br.com.control.vendas.cadastro.modelo.produto.Grupo;

@Service
public class GrupoService {

	@Autowired
	private GrupoProdutoDao grupoDao;

	public List<Grupo> listarTodos() {		
		return grupoDao.listaTodasGrupos();
	}
}
