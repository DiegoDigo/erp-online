package br.com.control.dao;

import br.com.control.annotation.SequenciaParametrosProcedure;
import br.com.control.portal.integracao.ProcedureIntegracao;
import br.com.control.portal.integracao.ViewsIntegracaoERP;
import net.gpedro.integrations.slack.SlackApi;
import net.gpedro.integrations.slack.SlackMessage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.math.BigDecimal;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Types;
import java.util.List;

@Repository
public class JdbcDao<T> {

	private static final Logger logger = LoggerFactory.getLogger(JdbcDao.class);

	private DataSource dataSource;

	private JdbcTemplate jdbcTemplate;

	private Connection connection;

	@Value("${spring.secondDatasource.database.driverClassName}")
	private String driverErp;

	@Value("${schema_database}")
	private String schemaDatabase;
	
	@Value("${numero_matricula_empresa}")
	private String matriculaAssociada;

	@Value("${url_slack}")
	private String url_slack;

	@Value("${channel_slack}")
	private String channel_slack;

	public Integer contaRegistros(String sql) {
		Integer count = 0;
		try {
			count = getJdbcTemplate().queryForObject(sql, new Object[]{}, Integer.class);
		}catch(RuntimeException e) {
			if(e.getMessage().contains("this view exists but it is invalid")) {
				count = -2;
			}else if(e.getMessage().contains("table or view does not exist")) {
				count = -3;
			}else {
				count = -1;
			}
		}
		return count;
	}
	
	public String getSchemaDatabase() {
		return schemaDatabase;
	}

	public void setSchemaDatabase(String schemaDatabase) {
		this.schemaDatabase = schemaDatabase;
	}

	@Autowired
	@Qualifier("dbmakerDataSource")
	public void setDataSource(DataSource dataSource) throws ClassNotFoundException {
		this.dataSource = dataSource;
		jdbcTemplate = new JdbcTemplate(dataSource);
		Class.forName(driverErp);
	}

	public List<T> selectViewSemWhere(ViewsIntegracaoERP tabela, RowMapper<T> rowMapper) {
		String sql = "select * from " + schemaDatabase + "." + tabela.getViewERP();
		List<T> dados = getJdbcTemplate().query(sql, rowMapper);
		logger.info("--> quantidade itens retornados: " + dados.size());
		return dados;
	}

	public List<T> selectViewSemWhere(String view, RowMapper<T> rowMapper) {
		String sql = "select * from " + schemaDatabase + "." + view;
		List<T> dados = getJdbcTemplate().query(sql, rowMapper);
		logger.info("--> quantidade itens retornados: " + dados.size());
		return dados;
	}

	public T selectViewSingle(ViewsIntegracaoERP tabela, RowMapper<T> rowMapper) {
		String sql = "select * from " + schemaDatabase + "." + tabela.getViewERP();
		List<T> dados = getJdbcTemplate().query(sql, rowMapper);
		if (!dados.isEmpty()) {
			logger.info("--> registro encontrado no DBMaker");
			return dados.get(0);
		}
		logger.info("--> registro não encontrado no DBMaker");
		return null;
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
		return this.dataSource;
	}

	// @Autowired
	// private ConnectionFactoryDBMaker connectionFactory;
	//
	// public ConnectionFactoryDBMaker getConnectionFactory() {
	// return connectionFactory;
	// }

	// public void setConnectionFactory(ConnectionFactoryDBMaker
	// connectionFactory) {
	// this.connectionFactory = connectionFactory;
	// }

	public CallableStatement preparaChamadaProcedure(ProcedureIntegracao procedure) {
		try {
			int cont = 0;
			Field[] atributos = procedure.getClasse().getDeclaredFields();
			for (int i = 0; i < atributos.length; i++) {
				if (atributos[i].getDeclaredAnnotationsByType(SequenciaParametrosProcedure.class).length > 0) {
					// System.out.println("atributo procedure: " +
					// atributos[i].getName());
					cont++;
				}
			}

			String call = "{call " + schemaDatabase + "." + procedure.getProcedure() + "(";
			for (int i = 0; i < cont; i++) {
				call += "?,";
			}
			call = call.substring(0, call.length() - 1);
			call += ")}";

			logger.info("Monta a chamada: " + call);

			connection = getDataSource().getConnection();

			return connection.prepareCall(call);
		} catch (SQLException e) {			
			logger.error("Erro ao executar chamada ao DBMAKER: " + e);

			// notifica via sendgrid que houve um erro de comunicação com o banco
			SlackApi api = new SlackApi(url_slack);
			api.call(new SlackMessage(channel_slack, matriculaAssociada, "Erro ao executar chamada ao DBMAKER: " + e.getMessage() + "-" + e.getSQLState()));

			throw new RuntimeException(e);
		}

	}
	
	public void closeConnection() {
		try {
			logger.info("ERP-ONLINE ***** FECHANDO A CONEXÃO COM O DBMAKER *****");
			connection.close();
		} catch (SQLException e) {
			logger.error("Erro ao Fechar a conexão com o BANCO: " + e);
			throw new RuntimeException("Erro ao Fechar a conexão com o BANCO: " + e);
		}
	}

	public void preparaExecucaoProcedure(Object obj, CallableStatement stmt) {
		try {

			Field[] atributos = obj.getClass().getDeclaredFields();
			for (int i = 0; i < atributos.length; i++) {
				if (atributos[i].getDeclaredAnnotationsByType(SequenciaParametrosProcedure.class).length > 0) {
					SequenciaParametrosProcedure sequencia = (atributos[i]
							.getDeclaredAnnotationsByType(SequenciaParametrosProcedure.class)[0]);

					Method metodoSetStatement = montaMetodoSetStatement(atributos, i, stmt,
							sequencia.isRetornoProcedure());

					Method metodoGetBean = montaMetodoGetBean(obj, atributos, i);

					Object invokeGetBean = metodoGetBean.invoke(obj);

					if (invokeGetBean == null) {
						logger.error("O campo " + atributos[i].getName()
								+ " veio nulo da Origem, não é possível realizar o processo");
						throw new RuntimeException("O campo " + atributos[i].getName()
								+ " veio nulo da Origem, não é possível realizar o processo");
					}

					// exibe o tipo, nome do campo e valor do campo da procedure
					// para debug em caso de problemas.
					// System.out.println(atributos[i].getType() + " - " +
					// atributos[i].getName() + " : "+ invokeGetBean);

					metodoSetStatement.setAccessible(true);

					if (sequencia.isRetornoProcedure()) {

						if (Integer.class.isAssignableFrom(invokeGetBean.getClass())) {
							metodoSetStatement.invoke(stmt, sequencia.index(), getSqlPrimitiveType("int"));
						} else if (Long.class.isAssignableFrom(invokeGetBean.getClass())) {
							metodoSetStatement.invoke(stmt, sequencia.index(), getSqlPrimitiveType("long"));
						} else if (String.class.isAssignableFrom(invokeGetBean.getClass())) {
							metodoSetStatement.invoke(stmt, sequencia.index(), getSqlPrimitiveType("string"));
						} else if (Float.class.isAssignableFrom(invokeGetBean.getClass())) {
							metodoSetStatement.invoke(stmt, sequencia.index(), getSqlPrimitiveType("float"));
						} else if (BigDecimal.class.isAssignableFrom(invokeGetBean.getClass())) {
							metodoSetStatement.invoke(stmt, sequencia.index(), getSqlPrimitiveType("bigdecimal"));
						}
					} else {

						if (Integer.class.isAssignableFrom(invokeGetBean.getClass())) {
							metodoSetStatement.invoke(stmt, sequencia.index(), invokeGetBean);
						} else if (Long.class.isAssignableFrom(invokeGetBean.getClass())) {
							metodoSetStatement.invoke(stmt, sequencia.index(), invokeGetBean);
						} else if (String.class.isAssignableFrom(invokeGetBean.getClass())) {
							metodoSetStatement.invoke(stmt, sequencia.index(), invokeGetBean);
						} else if (Float.class.isAssignableFrom(invokeGetBean.getClass())) {
							metodoSetStatement.invoke(stmt, sequencia.index(), invokeGetBean);
						} else if (BigDecimal.class.isAssignableFrom(invokeGetBean.getClass())) {
							metodoSetStatement.invoke(stmt, sequencia.index(), invokeGetBean);
						}
					}

				}
			}

			stmt.execute();

		} catch (NoSuchMethodException | SecurityException | IllegalAccessException | IllegalArgumentException
				| InvocationTargetException | SQLException e) {
			throw new RuntimeException(e);
		}

	}

	private Method montaMetodoGetBean(Object bean, Field[] atributos, int i) throws NoSuchMethodException {
		String nome = atributos[i].getName();
		String primeira = nome.substring(0, 1).toUpperCase();
		nome = nome.substring(1, nome.length());
		Method metodoGetBean = bean.getClass().getMethod("get" + primeira + nome);
		return metodoGetBean;
	}

	private Method montaMetodoSetStatement(Field[] atributos, int i, CallableStatement stmt, boolean isRetornoProcedure)
			throws NoSuchMethodException {

		Method metodoSetStatement;
		if (!isRetornoProcedure) {
			String nomeAtributo = atributos[i].getType().getSimpleName();
			String primeiraLetra = nomeAtributo.substring(0, 1).toUpperCase();
			nomeAtributo = nomeAtributo.substring(1, nomeAtributo.length());
			metodoSetStatement = stmt.getClass().getMethod("set" + primeiraLetra + nomeAtributo, Integer.TYPE,
					getType(atributos[i].getType().getName()));
		} else {
			metodoSetStatement = stmt.getClass().getMethod("registerOutParameter", Integer.TYPE, Integer.TYPE);
		}

		return metodoSetStatement;
	}

	private static final Class<?> getType(String tipo) {
		if (tipo.equals("byte"))
			return Byte.TYPE;
		if (tipo.equals("short"))
			return Short.TYPE;
		if (tipo.equals("int"))
			return Integer.TYPE;
		if (tipo.equals("long") || tipo.equals("java.lang.Long"))
			return Long.TYPE;
		if (tipo.equals("float") || tipo.equals("java.lang.Float"))
			return Float.TYPE;
		if (tipo.equals("double"))
			return Double.TYPE;
		if (tipo.equals("boolean") || tipo.equals("java.lang.Boolean"))
			return Boolean.TYPE;
		if (tipo.equals("java.math.BigDecimal"))
			return BigDecimal.class;
		if (tipo.equals("java.lang.String"))
			return String.class;

		throw new IllegalArgumentException("Não é um tipo primitivo : " + tipo);
	}

	private static final Integer getSqlPrimitiveType(String tipo) {
		if (tipo.equals("int"))
			return Types.INTEGER;
		if (tipo.equals("long"))
			return Types.BIGINT;
		if (tipo.equals("float"))
			return Types.FLOAT;
		if (tipo.equals("double"))
			return Types.DOUBLE;
		if (tipo.equals("boolean"))
			return Types.BOOLEAN;
		if (tipo.equals("string"))
			return Types.VARCHAR;
		if (tipo.equals("bigdecimal"))
			return Types.REAL;
		throw new IllegalArgumentException("Não é um tipo primitivo : " + tipo);
	}

}