package br.com.control.cadastro.sincronismo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.control.mensageria.produtor.SincronismoCadastroProducer;
import br.com.control.portal.integracao.MensagemRetorno;

@Service
public class SincronismoCadastroService {


	@Autowired
	private SincronismoCadastroProducer sincronismoCadastroProducer;


	public void enviaParaOPortal(MensagemRetorno msg) {
		sincronismoCadastroProducer.sendMessage(msg);
	}

}
