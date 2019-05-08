package br.com.control.globobroker;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.control.globobroker.dao.MovimentoFinanceiroGloboBrokerDao;
import br.com.control.globobroker.model.envio.MovimentoFinanceiroGloboBroker;

@Service
public class MovimentoFinanceiroGloboBrokerService {

	@Autowired
	private MovimentoFinanceiroGloboBrokerDao movimentoFinanceiroDao;

	public MovimentoFinanceiroGloboBroker gravarTitulo(MovimentoFinanceiroGloboBroker movimento) {
		return movimentoFinanceiroDao.gravaTituloBaixado(movimento);
	}
}