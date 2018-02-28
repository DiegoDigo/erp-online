package br.com.control.cadastro;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.control.dao.PrePagamentoDao;
import br.com.control.portal.mensageria.to.PrePagamentoTO;

@Service
public class PrePagamentoService {

	@Autowired
	private PrePagamentoDao prePagamentoDao;

	public void salvarPrePagamento(PrePagamentoTO prePagamento) {
		prePagamentoDao.salvarPrePagamento(prePagamento);
	}

}
