package br.com.control.dao;

import br.com.control.portal.integracao.ViewsIntegracaoERP;
import br.com.control.repositorio.mappers.BoletoPedidoRowMapper;
import br.com.control.vendas.cadastro.modelo.pedido.pagamento.BoletoPedido;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@Transactional
public class BoletoPedidoDao extends JdbcDao<BoletoPedido> {

	public List<BoletoPedido> listarBoletoPedido(float numeroPedido, int codigoEmpresa) {

		getJdbcTemplate().update(String.format("DECLARE SET bigint @numero_pedido = %d;",Math.round(numeroPedido)));
		getJdbcTemplate().update(String.format("DECLARE SET smallint  @numero_empresa = %d;", codigoEmpresa));
		return selectViewSemWhere(ViewsIntegracaoERP.VW_BOLETO_POR_PEDIDO, new BoletoPedidoRowMapper());

	}



}
