package br.com.control.autenticacao.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import br.com.control.vendas.cadastro.modelo.produto.Familia;

public class FamiliaRowMapper implements RowMapper<Familia> {

    @Override
    public Familia mapRow(ResultSet rs, int rowNum) throws SQLException {

    	Familia familia = new Familia();

        familia.setId(rs.getLong("ID"));
        familia.setMatriculaAssociada(rs.getString("MATRICULA_ASSOCIADA"));
        familia.setCodigoFamiliaProduto(rs.getString("CODIGO_FAMILIA_PRODUTO"));
        familia.setCodigoFameb(rs.getString("CODIGO_FAMEB"));
        familia.setDescricao(rs.getString("DESCRICAO"));
        familia.setAtivo(rs.getBoolean("ATIVO"));

        return familia;
    }

}