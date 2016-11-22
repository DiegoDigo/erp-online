package br.com.control.dao;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.jdbc.core.JdbcTemplate;

public class JdbcDao {
	private DataSource dataSource;

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Value("${spring.secondDatasource.database.driverClassName}")
	private String driverErp;

	@Autowired
	@Qualifier("dbmakerDataSource")
	public void setDataSource(DataSource dataSource) throws ClassNotFoundException {
		this.dataSource = dataSource;
		jdbcTemplate = new JdbcTemplate(dataSource);
		Class.forName(driverErp);
	}

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public String getDriverErp() {
		return driverErp;
	}

	public void setDriverErp(String driverErp) {
		this.driverErp = driverErp;
	}

	public DataSource getDataSource() {
		return dataSource;
	}
}