package br.com.control.repositorio.mappers;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import br.com.control.vendas.cadastro.modelo.Comodato;

public class ComodatoRowMapper implements RowMapper<Comodato> {

	@Override
	public Comodato mapRow(ResultSet rs, int rowNum) throws SQLException {
		Comodato comodato = new Comodato();
		comodato.setClienteRecId(rs.getLong("cliente_rec_id"));
		comodato.setCodigoModelo(rs.getString("codigo_modelo"));
		comodato.setCodigoOcorrencia(rs.getString("codigo_ocorrencia"));
		comodato.setCodigoSituacao(rs.getString("codigo_situacao"));
		comodato.setDataCev(rs.getTimestamp("data_cev"));
		comodato.setDataUltimaAuditoria(rs.getTimestamp("data_utilma_auditoria"));
		comodato.setDataVencimento(rs.getTimestamp("data_vencimento"));
		comodato.setDescricaoModelo(rs.getString("descricao_modelo"));
		comodato.setFazInventario(rs.getBoolean("faz_inventario"));
		comodato.setNomeFabricante(rs.getString("nome_fabricante"));
		comodato.setNumeroAtivo(rs.getString("numero_ativo"));
		comodato.setNumeroCev(rs.getString("numero_cev"));
		comodato.setNumeroCevItem(rs.getString("nuemro_cev_item"));
		comodato.setPatrimonioDois(rs.getString("patrimonio_dois"));
		comodato.setProdutoRecId(rs.getLong("produto_rec_id"));
		comodato.setTabelaPrecoRecId(rs.getLong("Tabela_preco_rec_id"));
		comodato.setTecnologiaUtilizada(rs.getString("Tecnologia_utilizada"));
		comodato.setTipoStatus(rs.getString("tipo_status"));
		comodato.setValorItem(rs.getInt("valor_item"));
		comodato.setQuantidade(rs.getInt("quantidade"));
		comodato.setRecId(rs.getLong("red_id"));
		return comodato;
	}

}
