package br.com.control.repositorio.mappers;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import org.springframework.jdbc.core.RowMapper;

import br.com.control.vendas.cadastro.modelo.Comodato;

public class ComodatoRowMapper implements RowMapper<Comodato> {

	@Override
	public Comodato mapRow(ResultSet rs, int rowNum) throws SQLException {
		Comodato comodato = new Comodato();
		comodato.setCodigoClienteERP(rs.getString("codigo_cliente_erp"));
		comodato.setCodigoModelo(rs.getString("codigo_modelo"));
		comodato.setCodigoOcorrencia(rs.getString("codigo_ocorrencia"));
		comodato.setCodigoSituacao(rs.getString("codigo_situacao"));
		comodato.setDataCev(converterStringTimeStamp(rs.getString("data_cev")));
		comodato.setDataUltimaAuditoria(converterStringTimeStamp("20170102"));
		comodato.setDataVencimento(converterStringTimeStamp(rs.getString("data_vencimento")));
		comodato.setDescricaoModelo(rs.getString("descricao_modelo"));
		comodato.setFazInventario(rs.getBoolean("faz_inventario"));
		comodato.setNomeFabricante(rs.getString("nome_fabricante"));
		comodato.setNumeroAtivo(rs.getString("numero_ativo"));
		comodato.setNumeroCev(rs.getString("numero_cev"));
		comodato.setNumeroCevItem(rs.getString("numero_cev_item"));
		comodato.setPatrimonioDois(rs.getString("patrimonio_dois"));
		comodato.setCodigoProdutoERP(rs.getString("CODIGO_PRODUTO_ERP"));
		comodato.setTecnologiaUtilizada(rs.getString("Tecnologia_utilizada"));
		comodato.setTipoStatus(rs.getString("tipo_status"));
		comodato.setValorItem(rs.getInt("valor_item"));
		comodato.setQuantidade(rs.getInt("quantidade"));
		// comodato.setRecId(rs.getLong("red_id"));
		return comodato;
	}

	private Timestamp converterStringTimeStamp(String date) {
		try {
			SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMdd");
			java.util.Date parsedDate = dateFormat.parse(date);
			java.sql.Timestamp dataTimeStamp = new java.sql.Timestamp(parsedDate.getTime());
			return dataTimeStamp;
		} catch (ParseException e) {
			return null;
		}
	}

}
