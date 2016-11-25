package br.com.control.cadastro;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.control.dao.MovimentoFinanceiroDao;
import br.com.control.integracao.TabelasIntegracaoPortal;
import br.com.control.repositorio.mappers.MovimentoFinanceiroRowMapper;
import br.com.control.vendas.cadastro.modelo.MovimentoFinanceiro;

@Service
public class MovimentoFinanceiroService {

	@Autowired
	private MovimentoFinanceiroDao movimentoFinanceiroDao;

	public List<MovimentoFinanceiro> listar() {
		return movimentoFinanceiroDao.selectViewSemWhere(TabelasIntegracaoPortal.MOVIMENTO_FINANCEIRO, new MovimentoFinanceiroRowMapper());
	}

}
