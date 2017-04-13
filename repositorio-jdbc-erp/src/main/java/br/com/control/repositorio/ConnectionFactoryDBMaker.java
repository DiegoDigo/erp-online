package br.com.control.repositorio;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ConnectionFactoryDBMaker {
	
	// --DBMAKER
	@Value("${spring.secondDatasource.database.driverClassName}")
	private String driverDbMaker;

	@Value("${spring.secondDatasource.url}")
	private String urlDbMaker;

	@Value("${spring.secondDatasource.username}")
	private String userDbMaker;

	@Value("${spring.secondDatasource.password}")
	private String passwordDbMaker;
	
	public Connection getConnection() {
		Connection connection;

		try {
			Class.forName(driverDbMaker);
			connection = DriverManager.getConnection(urlDbMaker, userDbMaker, passwordDbMaker);
			return connection;
		} catch (ClassNotFoundException | SQLException e) {
			throw new RuntimeException(e);
		}

	}
}
