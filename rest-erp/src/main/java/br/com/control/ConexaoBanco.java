package br.com.control;

import java.beans.PropertyVetoException;

import javax.sql.DataSource;

import org.apache.commons.dbcp.BasicDataSource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;

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

	
	
	
	@Profile("local")
	@Bean
	public DataSource conexao0() {
		logger.warn("############################################------> LOCAL" + passwordPostgre);
		return DataSourceBuilder.create().build();
	}
	
	@Profile("dev")
	@Bean
	public DataSource conexao1() {
		logger.warn("############################################------> DEV" + passwordPostgre);
		return DataSourceBuilder.create().build();
	}

	@Profile("homolog")
	@Bean
	public DataSource conexao2() {
		logger.warn("############################################------> HOMOLOG" + passwordPostgre);
		return DataSourceBuilder.create().build();
	}
	
	@Profile("prd")
	@Bean
	public DataSource conexao3() {
		logger.warn("############################################------> PRD" + passwordPostgre);
		return DataSourceBuilder.create().build();
	}
	
	@Profile("apresentacao")
	@Bean
	public DataSource conexao4() {
		logger.warn("############################################------> APRESENTACAO" + passwordPostgre);
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
		BasicDataSource pool = new BasicDataSource();
		pool.setDriverClassName(driverDbMaker);
		pool.setUrl(urlDbMaker);
		pool.setUsername(userDbMaker);
		pool.setPassword(passwordDbMaker);
		pool.setInitialSize(1);
		pool.setMaxActive(1);
		pool.setRemoveAbandoned(true);
		return pool;
	}

}