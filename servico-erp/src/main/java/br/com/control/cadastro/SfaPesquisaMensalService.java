package br.com.control.cadastro;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.control.dao.SfaPesquisaMensalDao;
import br.com.control.portal.mensageria.to.SfaPesquisaMensalTO;

@Service
public class SfaPesquisaMensalService {

	@Autowired
	private SfaPesquisaMensalDao sfaPesquisaMensalDao;

	public void salvarPesquisaSfaMensal(SfaPesquisaMensalTO sfaPesquisaMensal) {
		sfaPesquisaMensal.setMsgRetorno("");
		if(sfaPesquisaMensal.getCodigoMotivo().isEmpty()) { 
			sfaPesquisaMensal.setCodigoMotivo("*");
		}
		sfaPesquisaMensalDao.salvarPesquisaMensalSfa(sfaPesquisaMensal);
	}

}
