package br.com.control.dao;

import java.util.List;

import br.com.control.portal.integracao.TabelasIntegracao;
import br.com.control.repositorio.mappers.PedidoBloqueadosRowMapper;
import br.com.control.vendas.cadastro.modelo.pedido.PedidoBloqueados;

public class PedidoBloqueadosDao extends JdbcDao<PedidoBloqueados> {

	//FIXE: CONFIGURAR O NOME DA VIEW E O NOME DA TABELA DO PEDIDO BLOQUEADO
	public List<PedidoBloqueados> listaTodosPedidoBloqueado() {
		String declare = "DECLARE set int @CODIGO_CLIENTE = 0";
		getJdbcTemplate().update(declare);
		return selectViewSemWhere(TabelasIntegracao.PEDIDO_BLOQUEADO, new PedidoBloqueadosRowMapper());
	}
	
}
