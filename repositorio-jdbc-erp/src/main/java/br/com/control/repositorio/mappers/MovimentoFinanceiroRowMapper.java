package br.com.control.repositorio.mappers;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import br.com.control.vendas.cadastro.modelo.MovimentoFinanceiro;

public class MovimentoFinanceiroRowMapper implements RowMapper<MovimentoFinanceiro> {

	@Override
	public MovimentoFinanceiro mapRow(ResultSet rs, int rowNum) throws SQLException {
		MovimentoFinanceiro movimento = new MovimentoFinanceiro();
		movimento.setCadastroClienteRecId(rs.getLong("cadastro_cliente_rec_id"));
		movimento.setCodigoProduto(rs.getLong("codigo_produto"));
		movimento.setDataOperacao(rs.getTimestamp("data_operacao"));
		movimento.setDataVencimento(rs.getTimestamp("data_venciamento"));
		movimento.setMod(rs.getString("mod"));
		movimento.setNumeroDocumento(rs.getString("numero_documento"));
		movimento.setTipoRegistro(rs.getString("tipo_registro"));
		movimento.setValor(rs.getInt("valor"));
		return movimento;
	}

}
