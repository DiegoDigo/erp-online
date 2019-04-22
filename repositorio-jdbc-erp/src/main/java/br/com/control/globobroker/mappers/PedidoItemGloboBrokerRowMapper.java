package br.com.control.globobroker.mappers;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.jdbc.core.RowMapper;

import br.com.control.globobroker.model.envio.LoteGloboBroker;
import br.com.control.globobroker.model.envio.PedidoItemGloboBroker;

public class PedidoItemGloboBrokerRowMapper implements RowMapper<PedidoItemGloboBroker> {

	@Override
	public PedidoItemGloboBroker mapRow(ResultSet rs, int rowNum) throws SQLException {
		
		PedidoItemGloboBroker item = new PedidoItemGloboBroker();

		item.setRecId(rs.getString("ITEM"));
		item.setNumeroPedidoJcontrol(rs.getString("PEDIDO_JCONTROL"));
		item.setSequenciaItem(rs.getString("ITEM"));
		item.setCodigoOcorrencia(rs.getString("OCORRENCIA"));
		item.setCodigoProduto(rs.getString("CODIGO_PRODUTO").replaceAll("\\s+$", ""));
		item.setQuantidadeInteira(rs.getInt("QTDE_INTEIRA"));
		item.setValorInteiro(rs.getDouble("VALOR_INTEIRO"));
		item.setValorProdutoInteiro(rs.getDouble("VALOR_PRODUTO_INTEIRO"));
		item.setQuantidadeUnitaria(rs.getInt("QTDE_UNITARIA"));
		item.setValorunitario(rs.getDouble("VALOR_UNITARIO"));
		item.setValorProdutoUnitario(rs.getDouble("VALOR_PRODUTO_UNITARIO"));
		item.setValorDesconto(rs.getDouble("VALOR_DESCONTO"));
		item.setValorLiquido(rs.getDouble("VALOR_LIQUIDO"));
		item.setTipoDePedido(rs.getString("TIPODEPEDIDO"));
		
		List<LoteGloboBroker> lotes = new ArrayList<>();


		LoteGloboBroker lote = new LoteGloboBroker();
		lote.setNumero(rs.getString("LOT1"));
		lote.setQuantidade(rs.getString("QTDE1"));
		lotes.add(lote);

//		LoteGloboBroker lote2 = new LoteGloboBroker();
//		lote.setNumero("A576");//(rs.getString("'LOT2'"));
//		lote.setQuantidade(rs.getString("'QTDE2'"));
//		lotes.add(lote2);
//		
//		LoteGloboBroker lote3 = new LoteGloboBroker();
//		lote.setNumero("A576");//(rs.getString("'LOT3'"));
//		lote.setQuantidade(rs.getString("'QTDE3'"));
//		lotes.add(lote3);		
//
//		LoteGloboBroker lote4 = new LoteGloboBroker();
//		lote.setNumero("A576");//(rs.getString("'LOT4'"));
//		lote.setQuantidade(rs.getString("'QTDE4'"));
//		lotes.add(lote4);
		
		item.setLotes(lotes);
		

		return item;
	}
}
