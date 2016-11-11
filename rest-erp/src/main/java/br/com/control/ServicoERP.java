package br.com.control;

import javax.sql.DataSource;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.Primary;
import org.springframework.jms.annotation.EnableJms;

import br.com.control.configuracao.ConfiguracaoWeb;

@SpringBootApplication
@Import({ ConfiguracaoWeb.class})
@EnableAspectJAutoProxy
@EnableJms
public class ServicoERP extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(ServicoERP.class, args);
	}
	
	
	@Bean
	@Primary
	@ConfigurationProperties(prefix="spring.datasource")
	public DataSource primaryDataSource() {
	    return DataSourceBuilder.create().build();
	}

	@Bean
	@ConfigurationProperties(prefix="spring.secondDatasource")
	public DataSource secondaryDataSource() {
	    return DataSourceBuilder.create().build();
	}
	
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(ServicoERP.class);
	}
}
