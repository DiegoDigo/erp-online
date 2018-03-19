package br.com.control.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import br.com.control.portal.integracao.ViewsIntegracaoERP;
import br.com.control.repositorio.mappers.PedidoSugestaoRowMapper;
import br.com.control.vendas.cadastro.modelo.pedido.PedidoSugestao;

@Repository
@Transactional
public class PedidoSugestaoDao extends JdbcDao<PedidoSugestao> {

	public List<PedidoSugestao> listarPedidosSugestao() {
		return selectViewSemWhere(ViewsIntegracaoERP.VW_PEDIDO_SUGESTAO,
				new PedidoSugestaoRowMapper());
	}
	
	public Integer count() {
		String sql = "select count(*) from "+ getSchemaDatabase() + "." + ViewsIntegracaoERP.VW_PEDIDO_SUGESTAO;
		return contaRegistros(sql);
	}
	
}
