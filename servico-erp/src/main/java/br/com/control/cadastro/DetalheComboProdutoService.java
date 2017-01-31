package br.com.control.cadastro;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.control.dao.DetalheComboProdutoDao;
import br.com.control.portal.integracao.TabelasIntegracao;
import br.com.control.repositorio.mappers.DetalheComboProdutoRowMapper;
import br.com.control.vendas.cadastro.modelo.produto.DetalheComboProduto;

@Service
public class DetalheComboProdutoService {

	@Autowired
	private DetalheComboProdutoDao detalheComboProdutoDao;

	public List<DetalheComboProduto> detalhes() {
		return detalheComboProdutoDao.selectViewSemWhere(TabelasIntegracao.CADASTRO_DETALHE_PRODUTO_COMBO,
				new DetalheComboProdutoRowMapper());
	}

	public List<DetalheComboProduto> recuperarComboProduto(String codigoProdutoComboErp) {		
		return detalheComboProdutoDao.recuperarComboProduto(codigoProdutoComboErp);
	}

}
