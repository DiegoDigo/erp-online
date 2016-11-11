package br.com.control.autenticacao.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import br.com.control.vendas.cadastro.modelo.produto.Grupo;

public class GrupoRowMapper implements RowMapper<Grupo> {

    @Override
    public Grupo mapRow(ResultSet rs, int rowNum) throws SQLException {

    	Grupo grupo = new Grupo();

//    	grupo.setId(rs.getLong("ID"));
//    	grupo.setMatriculaAssociada(rs.getString("MATRICULA_ASSOCIADA"));
    	grupo.setDescricao(rs.getString("DESCRICAO").trim());
    	grupo.setCodigoGrupoProduto(rs.getString("CODIGO_GRUPO_PRODUTO").trim());
//    	grupo.setAtivo(rs.getBoolean("ATIVO"));

        return grupo;
    }

}