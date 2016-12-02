package br.com.control;

import java.beans.PropertyVetoException;

import javax.sql.DataSource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;

import com.mchange.v2.c3p0.ComboPooledDataSource;

@Configuration
public class ConexaoBanco {

	Logger logger = LoggerFactory.getLogger(ConexaoBanco.class);
	
	
	// --POSTGRE
	@Value("${spring.database.driverClassName}")
	private String driverPostgre;

	@Value("${spring.datasource.url}")
	private String urlPostgre;

	@Value("${spring.datasource.username}")
	private String userPostgre;

	@Value("${spring.datasource.password}")
	private String passwordPostgre;

	// --DBMAKER
	@Value("${spring.secondDatasource.database.driverClassName}")
	private String driverDbMaker;

	@Value("${spring.secondDatasource.url}")
	private String urlDbMaker;

	@Value("${spring.secondDatasource.username}")
	private String userDbMaker;

	@Value("${spring.secondDatasource.password}")
	private String passwordDbMaker;

	
	
	
	@Profile("dev")
	@Bean
	public DataSource teste() {
		logger.warn("############################################------> DEV" + passwordPostgre);
		return DataSourceBuilder.create().build();
	}

	@Profile("homolog")
	@Bean
	public DataSource teste2() {
		logger.warn("############################################------> HOMOLOG" + passwordPostgre);
		return DataSourceBuilder.create().build();
	}
	
	@Bean
	@Primary
	public DataSource postgresDataSource() {
		DataSourceBuilder factory = DataSourceBuilder.create()
				.driverClassName(driverPostgre)
				.url(urlPostgre)
				.username(userPostgre)
				.password(passwordPostgre);
		return factory.build();
	}

	@Bean
	public DataSource dbmakerDataSource() throws PropertyVetoException {
		ComboPooledDataSource cpds = new ComboPooledDataSource();
		cpds.setDriverClass(driverDbMaker);
		cpds.setJdbcUrl(urlDbMaker);
		cpds.setUser(userDbMaker);
		cpds.setPassword(passwordDbMaker);

		cpds.setInitialPoolSize(1);
		cpds.setMinPoolSize(1);
		cpds.setAcquireIncrement(1);
		cpds.setMaxPoolSize(1);
		cpds.setMaxStatements(100);
		cpds.setAcquireIncrement(1);
		cpds.setMaxIdleTime(1800);
		return cpds;
	}

}