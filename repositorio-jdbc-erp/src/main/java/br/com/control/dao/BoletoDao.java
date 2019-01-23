package br.com.control.dao;

import br.com.control.portal.integracao.ViewsIntegracaoERP;
import br.com.control.repositorio.mappers.BoletoRowMapper;
import br.com.control.vendas.cadastro.modelo.pedido.pagamento.Boleto;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public class BoletoDao extends JdbcDao<Boleto> {

	public List<Boleto> listarBoletoPor(int sequencia, int nossoNumero, int codigoBanco, int codigoEmpresa) {

		getJdbcTemplate().update(String.format("DECLARE SET integer @nosso_numero = %d;", nossoNumero));
		getJdbcTemplate().update(String.format("DECLARE SET smallint @sequencia_geracao = %d;", sequencia));
		getJdbcTemplate().update(String.format("DECLARE SET smallint @codigo_banco = %d;", codigoBanco));
		getJdbcTemplate().update(String.format("DECLARE SET smallint  @numero_empresa = %d;", codigoEmpresa));
		return selectViewSemWhere(ViewsIntegracaoERP.VW_BOLETO, new BoletoRowMapper());

	}

}
