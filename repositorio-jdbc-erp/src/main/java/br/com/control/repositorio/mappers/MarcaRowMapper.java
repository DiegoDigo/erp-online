package br.com.control.repositorio.mappers;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import br.com.control.vendas.cadastro.modelo.produto.Marca;

@Component
public class MarcaRowMapper implements RowMapper<Marca> {

    @Override
    public Marca mapRow(ResultSet rs, int rowNum) throws SQLException {

    	Marca marca = new Marca();

//    	marca.setId(rs.getLong("ID"));
//    	marca.setMatriculaAssociada(rs.getString("MATRICULA_ASSOCIADA"));
    	marca.setDescricao(rs.getString("descricao").trim());
    	marca.setCodigoMarcaProduto(rs.getString("CODIGO_MARCA_PRODUTO").trim());
//    	marca.setAtivo(rs.getBoolean("ATIVO"));

        return marca;
    }

}