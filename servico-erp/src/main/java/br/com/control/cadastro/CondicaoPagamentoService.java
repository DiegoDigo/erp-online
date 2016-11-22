package br.com.control.cadastro;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.control.dao.CondicaoPagamentoDao;
import br.com.control.vendas.cadastro.modelo.condicaoPagamento.CondicaoPagamento;

@Service
@Transactional
public class CondicaoPagamentoService {
	
	@Autowired
	private CondicaoPagamentoDao condicaoPagamentoDao;
	
	public List<CondicaoPagamento> listarCondicoes(){
		List<CondicaoPagamento> condicao = new ArrayList<>();
		Iterable<CondicaoPagamento> condicoes = condicaoPagamentoDao.listarCondicao();
		condicoes.forEach(condicao::add);		
		return condicao;
	}

}
