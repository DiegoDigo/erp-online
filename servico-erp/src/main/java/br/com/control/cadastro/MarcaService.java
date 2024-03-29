package br.com.control.cadastro;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.control.dao.MarcaProdutoDao;
import br.com.control.vendas.cadastro.modelo.produto.Marca;

@Service
public class MarcaService {

	@Autowired
	private MarcaProdutoDao marcaDao;

	public List<Marca> listarTodos() {
		return marcaDao.listaTodasAsMarcasDaMatricula();
	}

	public Marca recuperaMarca(String codigoMarcaErp) {
		return marcaDao.recuperarMarca(codigoMarcaErp);
	}
	
	public Integer count() {
		return marcaDao.count();
	}
}
