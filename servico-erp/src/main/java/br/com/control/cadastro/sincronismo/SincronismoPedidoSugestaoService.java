package br.com.control.cadastro.sincronismo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import br.com.control.mensageria.produtor.SincronismoPedidoSugestaoProducer;
import br.com.control.portal.integracao.Identificacao;
import br.com.control.portal.integracao.MensagemRecebida;
import br.com.control.portal.integracao.MensagemRetorno;

@Service
public class SincronismoPedidoSugestaoService {

	@Autowired
	private SincronismoPedidoSugestaoProducer sincronismoPedidoSugestaoProducer;

	public <T> MensagemRetorno enviaParaOPortal(MensagemRecebida<String> mensagem, List<T> dadosEnvio,
			String nomeTabelaAlterada) {
		MensagemRetorno msg = new MensagemRetorno(HttpStatus.OK, "Pedido Sugestão " + nomeTabelaAlterada,
				dadosEnvio, mensagem.getIdentificacao());
		sincronismoPedidoSugestaoProducer.sendMessage(msg);
		return msg;
	}

	public MensagemRetorno enviaParaOPortal(MensagemRecebida<String> mensagem, Object dadosEnvio,
			String nomeTabelaAlterada) {
		MensagemRetorno msg = new MensagemRetorno(HttpStatus.OK, "Pedido Sugestão " + nomeTabelaAlterada,
				dadosEnvio, mensagem.getIdentificacao());
		sincronismoPedidoSugestaoProducer.sendMessage(msg);
		return msg;
	}

	public MensagemRetorno enviaParaOPortal(Identificacao identificacao, Object dadosEnvio,
			String nomeTabelaAlterada) {
		MensagemRetorno msg = new MensagemRetorno(HttpStatus.OK, "Pedido Sugestão " + nomeTabelaAlterada,
				dadosEnvio, identificacao);
		sincronismoPedidoSugestaoProducer.sendMessage(msg);
		return msg;
	}

}
