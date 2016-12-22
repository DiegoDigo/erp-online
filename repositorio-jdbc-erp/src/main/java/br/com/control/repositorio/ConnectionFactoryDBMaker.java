package br.com.control.repositorio;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.springframework.stereotype.Component;

@Component
public class ConnectionFactoryDBMaker {

	public Connection getConnection() {
		Connection connection;
		String driver = "dbmaker.jdbc.ws.client.Driver";
		String url = "jdbc:dbmaker:type3://10.0.3.220:7777/DBCONTROL_1049_999";
		String user = "DBCONTROL1049999";
		String senha = "DB1049999";

		try {
			Class.forName(driver);
			connection = DriverManager.getConnection(url, user, senha);
			return connection;
		} catch (ClassNotFoundException | SQLException e) {
			throw new RuntimeException(e);
		}

	}
}
