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
//    	grupo.setId(rs.getLong("ID"));
//    	grupo.setMatriculaAssociada(rs.getString("MATRICULA_ASSOCIADA"));
    	grupo.setDescricao(rs.getString("VDPRDGRP_DESCR").trim());
    	grupo.setCodigoGrupoProduto(rs.getString("VDPRDGRP_GRUPO").trim());
    	grupo.setAtivo(rs.getBoolean("VDPRDGRP_COTA"));
        return grupo;
    }

}