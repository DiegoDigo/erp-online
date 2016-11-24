package br.com.control.repositorio.mappers;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import br.com.control.vendas.cadastro.modelo.preco.Preco;

public class PrecoRowMapper implements RowMapper<Preco> {

	@Override
	public Preco mapRow(ResultSet rs, int rowNum) throws SQLException {
		Preco preco = new Preco();
		preco.setRecId(rs.getLong("rec_id"));
		preco.setAliqPvv(rs.getInt("aliq_pvv"));
		preco.setAtivo(rs.getBoolean("ativo"));
		preco.setCodigoTabpreco(rs.getString("codigo_tabpreco"));
		preco.setDaIcmO(rs.getString("da_icm_o"));
		preco.setDesconto(rs.getFloat("desconto"));
		preco.setDescontoMaximo(rs.getBigDecimal("desconto_maximo"));
		preco.setDescontoVerba(rs.getFloat("desconto_verba"));
		preco.setDespac(rs.getFloat("despac"));
		preco.setOrigemTabela(rs.getString("origem_tabela"));
		preco.setParticipaBandaPreco(rs.getBoolean("participa_banda_preco"));
		preco.setPrecoCustoCaixa(rs.getFloat("preco_custo_caixa"));
		preco.setPrecoCustoUnitario(rs.getFloat("preco_custo_un"));
		preco.setPrecoPvv(rs.getFloat("preco_pvv"));
		preco.setPromocao(rs.getInt("promocao"));
		preco.setRestricao(rs.getInt("restricao"));
		preco.setSelo(rs.getFloat("selo"));
		preco.setTpCont(rs.getString("tp_cont"));
		preco.setUfTabelaPreco(rs.getString("UF_TABELA_PRECO"));
		preco.setValIcms(rs.getFloat("val_icms"));
		preco.setValIpi(rs.getFloat("val_ipi"));
		preco.setValor(rs.getBigDecimal("valor"));
		preco.setProduto(rs.getLong("codigo_produto_rec_id"));
		return preco;
	}

}
