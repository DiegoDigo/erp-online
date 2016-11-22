package br.com.control.repositorio.mappers;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import br.com.control.vendas.cadastro.modelo.produto.Familia;

@Component
public class FamiliaRowMapper implements RowMapper<Familia> {

    @Override
    public Familia mapRow(ResultSet rs, int rowNum) throws SQLException {

    	Familia familia = new Familia();

//        familia.setId(rs.getLong("ID"));
//        familia.setMatriculaAssociada(rs.getString("MATRICULA_ASSOCIADA"));
        familia.setCodigoFamiliaProduto(rs.getString("codigo_familia_produto").trim());
//        familia.setCodigoFameb(rs.getString("CODIGO_FAMEB"));
        familia.setDescricao(rs.getString("descricao").trim());
//        familia.setAtivo(rs.getBoolean("ATIVO"));

        return familia;
    }

}