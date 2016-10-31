package br.com.control.autenticacao.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import br.com.control.vendas.cadastro.modelo.produto.Marca;

public class MarcaRowMapper implements RowMapper<Marca> {

    @Override
    public Marca mapRow(ResultSet rs, int rowNum) throws SQLException {

    	Marca marca = new Marca();

    	marca.setId(rs.getLong("ID"));
    	marca.setMatriculaAssociada(rs.getString("MATRICULA_ASSOCIADA"));
    	marca.setDescricao(rs.getString("DESCRICAO"));
    	marca.setCodigoMarcaProduto("CODIGO_MARCA_PRODUTO");
    	marca.setAtivo(rs.getBoolean("ATIVO"));

        return marca;
    }

}