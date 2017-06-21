package br.com.control.cadastro;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.control.dao.ProdutoCanalDao;
import br.com.control.vendas.cadastro.modelo.produto.ProdutoCanal;

@Service
public class ProdutoCanalService {

	@Autowired
	private ProdutoCanalDao produtoCanalDao;

	public List<ProdutoCanal> listar() {
		return produtoCanalDao.listarProdutosCanal();
	}

}
