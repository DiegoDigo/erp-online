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
		banda.setCodigoBandaPreco(rs.getString("codigo_banda_preco"));
		banda.setCodigoCanalRecId(rs.getLong("codigo_canal_rec_id"));
		banda.setCodigoCategoriaProdutoRecId(rs.getLong("codigo_categoria_produto_rec_id"));
		banda.setCodigoFameb(rs.getString("codigo_fameb"));
		banda.setCodigoFamiliaProdutoRecId(rs.getLong("codigo_familia_produto_rec_id"));
		banda.setCodigoGrupoAnaliseCli(rs.getString("codigo_grupo_analise_cli"));
		banda.setCodigoGrupoCanalCli(rs.getString("codigo_grupo_canal_cli"));
		banda.setCodigoMarcaProdutoRecId(rs.getLong("codigo_marca_produto_rec_id"));
		banda.setCodigoPastaCli(rs.getString("codigo_pasta_cli"));
		banda.setCodigoProdutoRecId(rs.getLong("codigo_produto_rec_id"));
		banda.setDescricao(rs.getString("descricao"));
		banda.setOrigemBanda(rs.getString("origem_banda"));
		banda.setRecId(rs.getLong("rec_id"));
		banda.setRegiaoCliente(rs.getString("regiao_cliente"));
		banda.setUnidade(rs.getInt("unidade"));
		banda.setCodigoGrupoProdutoRecId(rs.getLong("codigo_grupo_produto_rec_id"));
		return banda;
	}

}
