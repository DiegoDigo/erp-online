package br.com.control.repositorio.mappers;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import br.com.control.vendas.cadastro.modelo.cliente.Visita;

@Component
public class VisitaRowMapper implements RowMapper<Visita> {

	@Override
	public Visita mapRow(ResultSet rs, int rowNum) throws SQLException {
		Visita visita = new Visita();
		visita.setNumeroPasta(rs.getInt("numeropasta"));
		visita.setDiaVisita(rs.getString("diavisita").trim());
		return visita;
	}

}