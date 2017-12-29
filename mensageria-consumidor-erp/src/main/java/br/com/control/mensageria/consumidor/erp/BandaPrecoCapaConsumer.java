package br.com.control.mensageria.consumidor.erp;

import java.util.ArrayList;
import java.util.List;

import javax.jms.JMSException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Component;

import br.com.control.cadastro.BandaPrecoItemService;
import br.com.control.cadastro.BandaPrecoService;
import br.com.control.cadastro.sincronismo.SincronismoCadastroService;
import br.com.control.portal.enums.CadastrosEnum;
import br.com.control.portal.mensageria.to.BandaPrecoItemTO;
import br.com.control.portal.mensageria.to.BandaPrecoTO;
import br.com.control.vendas.cadastro.modelo.preco.BandaPreco;
import br.com.control.vendas.cadastro.modelo.preco.BandaPrecoItem;

@Component
public class BandaPrecoCapaConsumer extends ERPConsumer{

	private static Logger log = LoggerFactory.getLogger(BandaPrecoCapaConsumer.class);

	@Autowired
	private SincronismoCadastroService sincronismoCadastroService;
	
	@Autowired
	private BandaPrecoService bandaPrecoService;

	@Autowired
	private BandaPrecoItemService bandaPrecoItemService;

	@JmsListener(destination = "VW_BANDA_PRECO_CAPA", containerFactory = "jmsListenerContainerFactoryJControl")
	public void sinalizaStatusPedido(final Message<String> message) throws JMSException {
		String codigoErp = message.getPayload();
		log.info("### VW_BANDA_PRECO_CAPA: "+codigoErp);
		

		BandaPreco bandaPreco = bandaPrecoService.buscarBanda(codigoErp);
		if (bandaPreco == null) {
			log.warn("Banda Preco com codigo: " + codigoErp + " nao encontrado no DBMaker!");
			return;
		}

		BandaPrecoTO bandaPrecoTo = new BandaPrecoTO(bandaPreco);
		if (codigoErp == null || codigoErp.isEmpty()) {
			log.warn("Banda Preco Item com codigo: " + codigoErp + " nao encontrado no DBMaker!");
		}else{
			List<BandaPrecoItem> bandaPrecoItens = bandaPrecoItemService.buscaBandaPrecoItem(Integer.parseInt(codigoErp));
			List<BandaPrecoItemTO> bandaPrecoItensTO = new ArrayList<>();
			for (BandaPrecoItem bandaPrecoItem : bandaPrecoItens) {
				BandaPrecoItemTO bandaPrecoItemTO = new BandaPrecoItemTO(bandaPrecoItem);
				bandaPrecoItensTO.add(bandaPrecoItemTO);
			}

			bandaPrecoTo.setBandaItens(bandaPrecoItensTO);
		}


		
		sincronismoCadastroService.enviaParaOPortal(criaIdentificacaoServico(CadastrosEnum.BANDA_PRECO), bandaPrecoTo, "Banda Preço");
		log.info("--> Banda Preço com codigo: " + codigoErp + " enviado para o Portal!");
	}

}