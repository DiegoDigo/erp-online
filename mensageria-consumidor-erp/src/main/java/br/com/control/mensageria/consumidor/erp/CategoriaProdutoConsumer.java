package br.com.control.mensageria.consumidor.erp;

import javax.jms.JMSException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Component;

import br.com.control.cadastro.CategoriaService;
import br.com.control.cadastro.sincronismo.SincronismoCadastroService;
import br.com.control.portal.enums.CadastrosEnum;
import br.com.control.portal.mensageria.to.CategoriaTO;
import br.com.control.vendas.cadastro.modelo.produto.Categoria;

@Component
public class CategoriaProdutoConsumer extends ERPConsumer{

	private static Logger log = LoggerFactory.getLogger(CategoriaProdutoConsumer.class);

	@Autowired
	private SincronismoCadastroService sincronismoCadastroService;
	
	@Autowired
	private CategoriaService categoriaService;

	@JmsListener(destination = "VW_CATEGORIA_PRODUTO", containerFactory = "jmsListenerContainerFactoryJControl")
	public void sinalizaStatusPedido(final Message<String> message) throws JMSException {
		String codigoErp = message.getPayload();
		log.info("### VW_CATEGORIA_PRODUTO: "+codigoErp);
		Categoria categoria = categoriaService.recuperaCategoria(codigoErp);
		if (categoria == null) {
			log.warn("--> Categoria com codigo: " + codigoErp + " nao encontrado no DBMaker!");
			return;
		}
		CategoriaTO categoriaTO = new CategoriaTO(categoria);
		sincronismoCadastroService.enviaParaOPortal(criaIdentificacaoServico(CadastrosEnum.CATEGORIA_PRODUTO), categoriaTO, "Categoria");
		log.info("--> Categoria com codigo: " + codigoErp + " enviada para o Portal!");
	}

}