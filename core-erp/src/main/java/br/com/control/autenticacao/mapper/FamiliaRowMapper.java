package br.com.control.autenticacao.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import br.com.control.vendas.cadastro.modelo.produto.Familia;

public class FamiliaRowMapper implements RowMapper<Familia> {

    @Override
    public Familia mapRow(ResultSet rs, int rowNum) throws SQLException {

    	Familia state = new Familia();

        state.setId(rs.getLong("ID"));
        state.setMatriculaAssociada(rs.getString("MATRICULA_ASSOCIADA"));
        state.setCodigoFamiliaProduto(rs.getString("CODIGO_FAMILIA_PRODUTO"));
        state.setCodigoFameb(rs.getString("CODIGO_FAMEB"));
        state.setDescricao(rs.getString("DESCRICAO"));
        state.setAtivo(rs.getBoolean("ATIVO"));

        return state;
    }

}