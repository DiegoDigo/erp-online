package br.com.control.cadastro;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.control.dao.ProdutoDao;
import br.com.control.integracao.TabelasIntegracaoPortal;
import br.com.control.repositorio.mappers.ProdutoRowMapper;
import br.com.control.vendas.cadastro.modelo.produto.Produto;

@Service
@Transactional
public class ProdutoService {
	
	@Autowired
	private ProdutoDao produtoDao;
	
	public List<Produto> listarProdutos(){
		return produtoDao.selectViewSemWhere(TabelasIntegracaoPortal.CADASTRO_PRODUTO, new ProdutoRowMapper());
	}
}
