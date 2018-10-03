package br.com.control.mensageria.configuracao;

import java.util.Arrays;

import javax.annotation.Resource;
import javax.jms.ConnectionFactory;

import org.apache.activemq.spring.ActiveMQConnectionFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.jms.DefaultJmsListenerContainerFactoryConfigurer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.jms.config.DefaultJmsListenerContainerFactory;
import org.springframework.jms.config.JmsListenerContainerFactory;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.transaction.PlatformTransactionManager;

@Configuration
public class MessagingConfiguration {

	@Value("${fila_portal_erp_online}")
	public String FILA_PORTAL;
	
	@Value("${fila_jcontrol_erp_online}")
	public String FILA_JCONTROL;
	
	@Value("${prefixo_ambiente_fila}")
	private String ambiente;

	@Value("${numero_matricula_empresa}")
	private String matricula;
	
	@Resource
	private PlatformTransactionManager transactionManager;
	
	

//    @Bean
//    public BrokerService brokerPortal() throws Exception {
//        final BrokerService broker = new BrokerService();
//        broker.addConnector(FILA_PORTAL);
//        broker.setBrokerName("brokerPortal");
//        broker.setUseJmx(false);
//        return broker;
//    }
//
//    @Bean
//    public BrokerService brokerJControl() throws Exception {
//        final BrokerService broker = new BrokerService();
//        broker.addConnector(FILA_JCONTROL);
//        broker.setBrokerName("brokerJControl");
//        broker.setUseJmx(false);
//        return broker;
//    }

//    @Bean
//    public ConnectionFactory jmsConnectionFactoryPortal() {
//        ActiveMQConnectionFactory connectionFactory = new ActiveMQConnectionFactory();
//        connectionFactory.setBrokerURL(FILA_PORTAL);
//        return connectionFactory;
//    }
//
//    @Bean
//    public QueueConnectionFactory jmsConnectionFactoryJControl() {
//        ActiveMQConnectionFactory connectionFactory = new ActiveMQConnectionFactory();
//        connectionFactory.setBrokerURL(FILA_JCONTROL);
//        return connectionFactory;
//    }

	@Bean
	@Primary
	public ActiveMQConnectionFactory connectionFactoryPortal() {
		ActiveMQConnectionFactory connectionFactory = new ActiveMQConnectionFactory();
		connectionFactory.setBrokerURL(FILA_PORTAL);
		connectionFactory.setTrustedPackages(Arrays.asList("br.com.control.portal.mensageria.to",
				"java.lang", "br.com.control.portal.filter",
				"java.util", "java.math"));
		System.setProperty("org.apache.activemq.SERIALIZABLE_PACKAGES", "*");
		return connectionFactory;
	}

	@Bean
	public ActiveMQConnectionFactory connectionFactoryJControl() {
		ActiveMQConnectionFactory connectionFactory = new ActiveMQConnectionFactory();
		connectionFactory.setBrokerURL(FILA_JCONTROL);
		connectionFactory.setTrustedPackages(Arrays.asList("br.com.control.portal.mensageria.to", "java.lang", "br.com.control.portal.filter",
				"java.util", "java.math", "java.sql"));
		System.setProperty("org.apache.activemq.SERIALIZABLE_PACKAGES", "*");
		
		return connectionFactory;
	}
	
	
    

    @Bean
    public JmsListenerContainerFactory<?> jmsListenerContainerFactoryPortal(ConnectionFactory connectionFactory,
    		 DefaultJmsListenerContainerFactoryConfigurer configurer) {
        DefaultJmsListenerContainerFactory factory = new DefaultJmsListenerContainerFactory();
        configurer.configure(factory, connectionFactory);
        
        factory.setSessionTransacted(true);
		factory.setTransactionManager(transactionManager);
        return factory;
    }

    @Bean
    public JmsListenerContainerFactory<?> jmsListenerContainerFactoryJControl(
            @Qualifier("connectionFactoryJControl") ConnectionFactory connectionFactory,
            DefaultJmsListenerContainerFactoryConfigurer configurer) {
        DefaultJmsListenerContainerFactory factory = new DefaultJmsListenerContainerFactory();
        configurer.configure(factory, connectionFactory);
        factory.setSessionTransacted(true);
		factory.setTransactionManager(transactionManager);
        return factory;
    }


	@Bean
	public JmsTemplate VW_CADASTRO_CLIENTE() {
		JmsTemplate template = new JmsTemplate();
		template.setConnectionFactory(connectionFactoryJControl());
		template.setDefaultDestinationName("VW_CADASTRO_CLIENTE");
		return template;
	}

	@Bean
	public JmsTemplate jmsTemplateFilaPedidos() {
		JmsTemplate template = new JmsTemplate();
		template.setConnectionFactory(connectionFactoryPortal());
		template.setDefaultDestinationName(ambiente+"_pedidos_" + matricula);
		return template;
	}

	@Bean
	public JmsTemplate jmsTemplateAcompanhamentoPedidos() {
		JmsTemplate template = new JmsTemplate();
		template.setConnectionFactory(connectionFactoryPortal());
		template.setDefaultDestinationName(ambiente+"_acompanhamento_" + matricula);
		return template;
	}

	@Bean
	public JmsTemplate jmsTemplateSincronismoCadastro() {
		JmsTemplate template = new JmsTemplate();
		template.setConnectionFactory(connectionFactoryPortal());
		template.setDefaultDestinationName(ambiente+"_sincronismo_cadastro_" + matricula);
		return template;
	}
	@Bean
	public JmsTemplate jmsTemplateLiberacaoPedido() {
		JmsTemplate template = new JmsTemplate();
		template.setConnectionFactory(connectionFactoryPortal());
		template.setDefaultDestinationName(ambiente+"_liberacao_pedido_" + matricula);
		return template;
	}
	@Bean
	public JmsTemplate jmsTemplateAlteracaoDadosCadastraisContato() {
		JmsTemplate template = new JmsTemplate();
		template.setConnectionFactory(connectionFactoryPortal());
		template.setDefaultDestinationName(ambiente+"_alteracao_dados_cadastrais_contato_" + matricula);
		return template;
	}
	@Bean
	public JmsTemplate jmsTemplateAlteracaoDadosCadastraisEndereco() {
		JmsTemplate template = new JmsTemplate();
		template.setConnectionFactory(connectionFactoryPortal());
		template.setDefaultDestinationName(ambiente+"_alteracao_dados_cadastrais_endereco_" + matricula);
		return template;
	}
	
	@Bean
	public JmsTemplate jmsTemplateSincronismoAgendado() {
		JmsTemplate template = new JmsTemplate();
		template.setConnectionFactory(connectionFactoryPortal());
		template.setDefaultDestinationName(ambiente+"_sincronismo_agendado_" + matricula);
		return template;
	}
	@Bean
	public JmsTemplate jmsTemplatePesquisaSfaMensal() {
		JmsTemplate template = new JmsTemplate();
		template.setConnectionFactory(connectionFactoryPortal());
		template.setDefaultDestinationName(ambiente+"_pesquisa_mensal_sfa_" + matricula);
		return template;
	}
}