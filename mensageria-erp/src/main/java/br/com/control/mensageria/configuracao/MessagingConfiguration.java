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
	
	@Value("${portal_ambiente}")
	private String ambiente;

	@Bean
	public ActiveMQConnectionFactory connectionFactory() {
		ActiveMQConnectionFactory connectionFactory = new ActiveMQConnectionFactory();
		connectionFactory.setBrokerURL(DEFAULT_BROKER_URL);
		connectionFactory.setTrustedPackages(Arrays.asList("br.com.control.portal.mensageria.to", "java.lang", "br.com.control.portal.filter",
				"java.util", "java.math", "java.sql"));
		System.setProperty("org.apache.activemq.SERIALIZABLE_PACKAGES", "*");
		return connectionFactory;
	}

	@Bean
	public JmsTemplate jmsTemplateFilaPedidos() {
		JmsTemplate template = new JmsTemplate();
		template.setConnectionFactory(connectionFactory());
		template.setDefaultDestinationName(ambiente+"_pedidos");
		return template;
	}

	@Bean
	public JmsTemplate jmsTemplateAcompanhamentoPedidos() {
		JmsTemplate template = new JmsTemplate();
		template.setConnectionFactory(connectionFactory());
		template.setDefaultDestinationName(ambiente+"_acompanhamento");
		return template;
	}

	@Bean
	public JmsTemplate jmsTemplateSincronismoCadastro() {
		JmsTemplate template = new JmsTemplate();
		template.setConnectionFactory(connectionFactory());
		template.setDefaultDestinationName(ambiente+"_sincronismo_cadastro");
		return template;
	}
	@Bean
	public JmsTemplate jmsTemplateLiberacaoPedido() {
		JmsTemplate template = new JmsTemplate();
		template.setConnectionFactory(connectionFactory());
		template.setDefaultDestinationName(ambiente+"_liberacao_pedido");
		return template;
	}
	@Bean
	public JmsTemplate jmsTemplateAlteracaoDadosCadastraisContato() {
		JmsTemplate template = new JmsTemplate();
		template.setConnectionFactory(connectionFactory());
		template.setDefaultDestinationName(ambiente+"_alteracao_dados_cadastrais_contato");
		return template;
	}
	@Bean
	public JmsTemplate jmsTemplateAlteracaoDadosCadastraisEndereco() {
		JmsTemplate template = new JmsTemplate();
		template.setConnectionFactory(connectionFactory());
		template.setDefaultDestinationName(ambiente+"_alteracao_dados_cadastrais_endereco");
		return template;
	}

}