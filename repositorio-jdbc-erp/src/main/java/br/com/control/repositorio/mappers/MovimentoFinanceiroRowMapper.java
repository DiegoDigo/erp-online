package br.com.control.repositorio.mappers;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import org.springframework.jdbc.core.RowMapper;

import br.com.control.vendas.cadastro.modelo.MovimentoFinanceiro;

public class MovimentoFinanceiroRowMapper implements RowMapper<MovimentoFinanceiro> {

	@Override
	public MovimentoFinanceiro mapRow(ResultSet rs, int rowNum) throws SQLException {
		MovimentoFinanceiro movimento = new MovimentoFinanceiro();
		movimento.setCodigoClienteERP(rs.getString("CODIGO_CLIENTE_ERP"));
		movimento.setCodigoProdutoERP(rs.getString("codigo_produto_ERP") == null ? "" : rs.getString("codigo_produto_ERP"));
		movimento.setDataOperacao(converterStringTimeStamp(rs.getString("DATA_OPERACAO")));
		movimento.setDataVencimento(converterStringTimeStamp(rs.getString("DATA_VENCIMENTO")));
		movimento.setMod(rs.getString("MOD"));
		movimento.setNumeroDocumento(rs.getString("NUMERO_DOCUMENTO").trim());
		movimento.setNumeroPedido(rs.getString("NUMERO_PEDIDO").trim());
		movimento.setTipoRegistro(rs.getString("TIPO_REGISTRO"));
		movimento.setValor(rs.getFloat("VALOR"));
		// System.out.println("MOVIMENTO FINANCEIRO ROW MAPPER LINHA: "+rowNum);
		return movimento;
	}

	private Timestamp converterStringTimeStamp(String date) {
		if (date != null && !date.equals("0") && !date.equals("")) {
			try {
				SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMdd");
				java.util.Date parsedDate;
				parsedDate = dateFormat.parse(date);
				java.sql.Timestamp dataTimeStamp = new java.sql.Timestamp(parsedDate.getTime());
				return dataTimeStamp;
			} catch (ParseException e) {
				e.printStackTrace();
			}
		}
		return null;
	}

}
