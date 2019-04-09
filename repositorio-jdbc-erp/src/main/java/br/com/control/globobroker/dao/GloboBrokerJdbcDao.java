package br.com.control.globobroker.dao;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jdbc.core.RowMapper;

import br.com.control.dao.JdbcDao;
import br.com.control.globobroker.ViewsIntegracaoGloboBroker;

public class GloboBrokerJdbcDao<T> extends JdbcDao<T> {
	
	private static final Logger logger = LoggerFactory.getLogger(GloboBrokerJdbcDao.class);
	
	public List<T> selectViewSemWhere(ViewsIntegracaoGloboBroker tabela, RowMapper<T> rowMapper) {
		String sql = "select * from " + getSchemaDatabase() + "." + tabela.getViewERP();
		List<T> dados = getJdbcTemplate().query(sql, rowMapper);
		logger.info("--> quantidade itens retornados: " + dados.size());
		return dados;
	}
}
