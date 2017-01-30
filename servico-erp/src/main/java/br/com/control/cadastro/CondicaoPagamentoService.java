package br.com.control.cadastro;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.control.dao.CondicaoPagamentoDao;
import br.com.control.vendas.cadastro.modelo.condicaoPagamento.CondicaoPagamento;

@Service
public class CondicaoPagamentoService {

	@Autowired
	private CondicaoPagamentoDao condicaoPagamentoDao;

	public List<CondicaoPagamento> listarCondicoes() {
		return condicaoPagamentoDao.listarCondicoesPagamento();
	}

	public CondicaoPagamento recuperarCondicaoPagamento(String codigoCondicaoPagamentoErp) {
		return condicaoPagamentoDao.recuperarCondicaoPagamento(codigoCondicaoPagamentoErp);
	}

}
