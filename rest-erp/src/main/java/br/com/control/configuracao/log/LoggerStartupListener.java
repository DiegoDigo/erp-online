package br.com.control.configuracao.log;

import java.io.IOException;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Component;

import ch.qos.logback.classic.LoggerContext;
import ch.qos.logback.classic.joran.JoranConfigurator;
import ch.qos.logback.core.joran.spi.JoranException;
import ch.qos.logback.core.util.StatusPrinter;

@Component
public class LoggerStartupListener implements ApplicationListener<ContextRefreshedEvent> {


    @Value("${caminho_log}")
    private String caminhoLog;

	@Override
	public void onApplicationEvent(ContextRefreshedEvent event) {
		try {
            configureLogback();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    private void configureLogback() throws IOException {

        // assume SLF4J is bound to logback in the current environment
        LoggerContext context = (LoggerContext) LoggerFactory.getILoggerFactory();
        try {
            JoranConfigurator jc = new JoranConfigurator();
            jc.setContext(context);
            context.reset();
            context.putProperty("CAMINHO_LOG", caminhoLog);
            jc.doConfigure(new ClassPathResource("logback.xml").getInputStream());
        } catch (JoranException je) {
              // StatusPrinter will handle this
        }
        StatusPrinter.printInCaseOfErrorsOrWarnings(context);

    }
    
}