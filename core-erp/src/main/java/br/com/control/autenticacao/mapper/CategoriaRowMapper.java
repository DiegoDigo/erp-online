package br.com.control.autenticacao.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import br.com.control.vendas.cadastro.modelo.produto.Categoria;

public class CategoriaRowMapper implements RowMapper<Categoria> {

    @Override
    public Categoria mapRow(ResultSet rs, int rowNum) throws SQLException {

    	Categoria categoria = new Categoria();

    	categoria.setId(rs.getLong("ID"));
    	categoria.setMatriculaAssociada(rs.getString("MATRICULA_ASSOCIADA"));
    	categoria.setDescricao(rs.getString("DESCRICAO"));
    	categoria.setCodigoCategoriaProduto("CODIGO_CATEGORIA_PRODUTO");
    	categoria.setAtivo(rs.getBoolean("ATIVO"));

        return categoria;
    }

}