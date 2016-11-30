package br.com.control;

import java.beans.PropertyVetoException;

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

import com.mchange.v2.c3p0.ComboPooledDataSource;

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
		ComboPooledDataSource cpds = new ComboPooledDataSource();
		try {
			cpds.setDriverClass("dbmaker.jdbc.ws.client.Driver");
		} catch (PropertyVetoException e) {
			e.printStackTrace();
		}
		cpds.setJdbcUrl("jdbc:dbmaker:type3://10.0.3.220:7777/DBCONTROL_1049_999");
		cpds.setUser("DBCONTROL1049999");
		cpds.setPassword("DB1049999");

		// Optional Settings
		cpds.setInitialPoolSize(1);
		cpds.setMinPoolSize(1);
		cpds.setAcquireIncrement(1);
		cpds.setMaxPoolSize(1);
		cpds.setMaxStatements(100);
		cpds.setAcquireIncrement(1);
		cpds.setMaxIdleTime(1800);

		return cpds;

		// DataSourceBuilder factory =
		// DataSourceBuilder.create().driverClassName("dbmaker.jdbc.ws.client.Driver")
		// .url("jdbc:dbmaker:type3://10.0.3.220:7777/DBCONTROL_1049_999").username("DBCONTROL1049999")
		// .password("db1049999");
		// return factory.build();
	}

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(ServicoERP.class);
	}
}