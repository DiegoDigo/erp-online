package br.com.control.repositorio.mappers;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import br.com.control.vendas.cadastro.modelo.produto.Grupo;

@Component
public class GrupoRowMapper implements RowMapper<Grupo> {

    @Override
    public Grupo mapRow(ResultSet rs, int rowNum) throws SQLException {
    	Grupo grupo = new Grupo();
    	grupo.setDescricao(rs.getString("descricao").trim());
    	grupo.setCodigoErp(rs.getInt("codigo_grupo_produto_erp"));
        return grupo;
    }

}