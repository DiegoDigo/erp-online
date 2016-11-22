package br.com.control;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;
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
@Import({ ConfiguracaoWeb.class })
@EnableAspectJAutoProxy
@EnableJms
public class ServicoERP extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(ServicoERP.class, args);
	}

	@Autowired
	private DataSourceProperties properties;

	@Bean
	@Primary
	@ConfigurationProperties(prefix = "spring.datasource")
	public DataSource postgresDataSource() {
		DataSourceBuilder factory = DataSourceBuilder.create(this.properties.getClassLoader())
				.driverClassName("org.postgresql.Driver").url(this.properties.getUrl())
				.username(this.properties.getUsername()).password(this.properties.getPassword());
		return factory.build();
	}

	@Bean
	@ConfigurationProperties(prefix = "spring.secondDatasource")
	public DataSource dbmakerDataSource() {
		DataSourceBuilder factory = DataSourceBuilder.create(this.properties.getClassLoader())
				.driverClassName("dbmaker.sql.JdbcOdbcDriver").url(this.properties.getUrl())
				.username(this.properties.getUsername()).password(this.properties.getPassword());
		return factory.build();
	}

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(ServicoERP.class);
	}
}