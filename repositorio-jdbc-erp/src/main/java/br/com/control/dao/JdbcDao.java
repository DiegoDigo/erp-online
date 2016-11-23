package br.com.control.dao;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import br.com.control.integracao.TabelasIntegracaoPortal;

public class JdbcDao<T> {
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
	
	public List<T> selectViewSemWhere(TabelasIntegracaoPortal tabela , RowMapper<T> rowMapper){
		String sql = "select * from " + tabela.getViewERP();
		List<T> dados = getJdbcTemplate().query(sql, rowMapper);
		return  dados;
		
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