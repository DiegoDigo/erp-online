package br.com.control.cadastro;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.control.dao.DetalheComboProdutoDao;
import br.com.control.integracao.TabelasIntegracaoPortal;
import br.com.control.repositorio.mappers.DetalheComboProdutoRowMapper;
import br.com.control.vendas.cadastro.modelo.produto.DetalheComboProduto;

@Service
@Transactional
public class DetalheComboProdutoService {

	@Autowired
	private DetalheComboProdutoDao detalheComboProdutoDao;
	
	public List<DetalheComboProduto> detalhes(){
		return detalheComboProdutoDao.selectViewSemWhere(TabelasIntegracaoPortal.CADASTRO_DETALHE_PRODUTO_COMBO, new DetalheComboProdutoRowMapper());
	}
	
}
