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

}