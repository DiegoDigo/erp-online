package br.com.control;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.web.SpringBootServletInitializer;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.Import;

import br.com.control.configuracao.ConfiguracaoWeb;

@SpringBootApplication
@Import({ ConfiguracaoWeb.class})
@EnableAspectJAutoProxy
public class ServicoERP extends SpringBootServletInitializer {

	
	public static void main(String[] args) {
		SpringApplication.run(ServicoERP.class, args);
	}
	
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(ServicoERP.class);
	}
}
