package br.com.control.globobroker;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.control.globobroker.dao.MovimentoFinanceiroGloboBrokerDao;
import br.com.control.globobroker.model.envio.MovimentoFinanceiroGloboBroker;

@Service
public class MovimentoFinanceiroGloboBrokerService {

	@Autowired
	private MovimentoFinanceiroGloboBrokerDao movimentoFinanceiroDao;

	public void gravarTitulo(MovimentoFinanceiroGloboBroker movimento) {
		if(movimento.isTituloBaixado()) {
			movimentoFinanceiroDao.gravaTituloBaixado(movimento);
		}else if(movimento.isTituloAberto()) {
			movimentoFinanceiroDao.gravaTituloAberto(movimento);
		}
	}

	public void gravaTituloBaixado(MovimentoFinanceiroGloboBroker movimento) {
		movimentoFinanceiroDao.gravaTituloBaixado(movimento);
	}

	public void gravaTituloAberto(MovimentoFinanceiroGloboBroker movimento) {
		movimentoFinanceiroDao.gravaTituloAberto(movimento);
	}
}
