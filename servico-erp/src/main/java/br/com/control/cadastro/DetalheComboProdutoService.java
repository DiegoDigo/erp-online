package br.com.control.cadastro;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.control.dao.DetalheComboProdutoDao;
import br.com.control.vendas.cadastro.modelo.produto.DetalheComboProduto;

@Service
public class DetalheComboProdutoService {

	@Autowired
	private DetalheComboProdutoDao detalheComboProdutoDao;

	
	public List<DetalheComboProduto> listarTodos() {
		return detalheComboProdutoDao.listaTodosOsCombos();
	}
	

	public List<DetalheComboProduto> recuperarComboProduto(String codigoProdutoComboErp) {		
		return detalheComboProdutoDao.recuperarComboProduto(codigoProdutoComboErp);
	}

}
