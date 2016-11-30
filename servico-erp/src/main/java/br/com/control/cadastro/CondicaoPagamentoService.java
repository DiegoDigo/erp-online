package br.com.control.cadastro;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.control.dao.CondicaoPagamentoDao;
import br.com.control.integracao.TabelasIntegracao;
import br.com.control.repositorio.mappers.CondicaoPagamentoRowMapper;
import br.com.control.vendas.cadastro.modelo.condicaoPagamento.CondicaoPagamento;

@Service
public class CondicaoPagamentoService {

	@Autowired
	private CondicaoPagamentoDao condicaoPagamentoDao;

	public List<CondicaoPagamento> listarCondicoes() {
		return condicaoPagamentoDao.selectViewSemWhere(TabelasIntegracao.CADASTRO_CONDICAO_PAGAMENTO,
				new CondicaoPagamentoRowMapper());
	}

}
