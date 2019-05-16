package br.com.control;

import org.apache.commons.dbcp.BasicDataSource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

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

    @Profile("pre_producao")
    @Bean
    public DataSource conexao3() {
        logger.warn("############################################------> PRE PRODUCAO" + passwordPostgre);
        return DataSourceBuilder.create().build();
    }

    @Profile("2966-apresentacao")
    @Bean
    public DataSource conexao4() {
        logger.warn("############################################------> APRESENTACAO 2966" + passwordPostgre);
        return DataSourceBuilder.create().build();
    }

    @Profile("2016-apresentacao")
    @Bean
    public DataSource conexao5() {
        logger.warn("############################################------> APRESENTACAO 2016" + passwordPostgre);
        return DataSourceBuilder.create().build();
    }

    @Profile("6461-apresentacao")
    @Bean
    public DataSource conexao6() {
        logger.warn("############################################------> APRESENTACAO 6461" + passwordPostgre);
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
    public DataSource dbmakerDataSource() {
        DriverManagerDataSource pool = new DriverManagerDataSource();
        pool.setDriverClassName(driverDbMaker);
        pool.setUrl(urlDbMaker);
        pool.setUsername(userDbMaker);
        pool.setPassword(passwordDbMaker);
        return pool;

    }

}