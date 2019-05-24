package br.com.control.repositorio.mappers;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import br.com.control.vendas.cadastro.modelo.preco.BandaPreco;

public class BandaPrecoRowMapper implements RowMapper<BandaPreco> {

	@Override
	public BandaPreco mapRow(ResultSet rs, int rowNum) throws SQLException {
		BandaPreco banda = new BandaPreco();
		banda.setAtivo(rs.getBoolean("ativo"));
		banda.setCodigoFameb(rs.getString("codigo_fameb"));
		banda.setCodigoGrupoAnaliseCli(rs.getString("CODIGO_GRUPO_ANALISE_CLI"));
		banda.setCodigoPastaCli(rs.getString("CODIGO_PASTA_CLI"));
		banda.setDescricao(rs.getString("descricao"));
		banda.setOrigemBanda(rs.getString("origem_banda").trim());
		// banda.setRecId(rs.getLong("rec_id"));
		banda.setRegiaoCliente(rs.getString("regiao_cliente"));
		banda.setUnidade(rs.getInt("unidade"));
		banda.setCodigoErp(rs.getInt("CODIGO_BANDA_PRECO_ERP"));
		banda.setCodigoGrupoCanalCli(rs.getString("CODIGO_GRUPO_CANAL_CLI"));
		banda.setCodigoMarcaProdutoERP(rs.getString("CODIGO_MARCA_PRODUTO_ERP"));
		banda.setCodigoGrupoProdutoERP(rs.getString("CODIGO_GRUPO_PRODUTO_ERP"));
		banda.setCodigoCanalERP(rs.getString("CODIGO_CANAL_ERP"));
		banda.setCodigoCategoriaProdutoERP(rs.getString("CODIGO_CATEGORIA_PRODUTO_ERP"));
		banda.setCodigoProdutoERP(rs.getString("CODIGO_PRODUTO_ERP"));
		banda.setCodigoFamiliaProdutoERP(rs.getString("CODIGO_FAMILIA_PRODUTO_ERP"));
		banda.setCodigoCondicaoPagamentoERP(rs.getString("CODIGO_CONDICAO_PAGAMENTO_ERP"));

		// FIXME: mudar o valor abaixo quando inserirem este campo "ordem" e
		// "modo" na view
		banda.setOrdem(rs.getInt("SEQUENCIA"));
		banda.setModo(1);

		return banda;
	}

}
