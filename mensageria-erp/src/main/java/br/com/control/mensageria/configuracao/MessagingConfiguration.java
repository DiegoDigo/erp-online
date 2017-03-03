package br.com.control.mensageria.configuracao;

import java.util.Arrays;

import org.apache.activemq.spring.ActiveMQConnectionFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jms.core.JmsTemplate;

@Configuration
public class MessagingConfiguration {

	@Value("${default_url_broker}")
	public String DEFAULT_BROKER_URL;

	private static final String FILA_PEDIDOS = "pedidos";
	private static final String FILA_ACOMPANHAMENTO = "acompanhamento";
	private static final String FILA_SINCRONISMO_CADASTRO = "sincronismo_cadastro";
	private static final String FILA_LIBERACAO_PEDIDO = "liberacao_pedido";
	private static final String FILA_ALTERACAO_DADOS_CADASTRAIS_CONTATO = "alteracao_dados_cadastrais_contato";
	private static final String FILA_ALTERACAO_DADOS_CADASTRAIS_ENDERECO = "alteracao_dados_cadastrais_endereco";

	@Bean
	public ActiveMQConnectionFactory connectionFactory() {
		ActiveMQConnectionFactory connectionFactory = new ActiveMQConnectionFactory();
		connectionFactory.setBrokerURL(DEFAULT_BROKER_URL);
		connectionFactory.setTrustedPackages(Arrays.asList("br.com.control.portal.mensageria.to", "java.lang",
				"java.util", "java.math", "java.sql"));
		System.setProperty("org.apache.activemq.SERIALIZABLE_PACKAGES", "*");
		return connectionFactory;
	}

	@Bean
	public JmsTemplate jmsTemplateFilaPedidos() {
		JmsTemplate template = new JmsTemplate();
		template.setConnectionFactory(connectionFactory());
		template.setDefaultDestinationName(FILA_PEDIDOS);
		return template;
	}

	@Bean
	public JmsTemplate jmsTemplateAcompanhamentoPedidos() {
		JmsTemplate template = new JmsTemplate();
		template.setConnectionFactory(connectionFactory());
		template.setDefaultDestinationName(FILA_ACOMPANHAMENTO);
		return template;
	}

	@Bean
	public JmsTemplate jmsTemplateSincronismoCadastro() {
		JmsTemplate template = new JmsTemplate();
		template.setConnectionFactory(connectionFactory());
		template.setDefaultDestinationName(FILA_SINCRONISMO_CADASTRO);
		return template;
	}
	@Bean
	public JmsTemplate jmsTemplateLiberacaoPedido() {
		JmsTemplate template = new JmsTemplate();
		template.setConnectionFactory(connectionFactory());
		template.setDefaultDestinationName(FILA_LIBERACAO_PEDIDO);
		return template;
	}
	@Bean
	public JmsTemplate jmsTemplateAlteracaoDadosCadastraisContato() {
		JmsTemplate template = new JmsTemplate();
		template.setConnectionFactory(connectionFactory());
		template.setDefaultDestinationName(FILA_ALTERACAO_DADOS_CADASTRAIS_CONTATO);
		return template;
	}
	@Bean
	public JmsTemplate jmsTemplateAlteracaoDadosCadastraisEndereco() {
		JmsTemplate template = new JmsTemplate();
		template.setConnectionFactory(connectionFactory());
		template.setDefaultDestinationName(FILA_ALTERACAO_DADOS_CADASTRAIS_ENDERECO);
		return template;
	}

}