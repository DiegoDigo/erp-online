package br.com.control.repositorio.mappers;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import br.com.control.portal.mensageria.to.NfeChaveTO;

@Component
public class NFEChaveRowMapper implements RowMapper<NfeChaveTO> {

	@Override
	public NfeChaveTO mapRow(ResultSet rs, int rowNum) throws SQLException {

		NfeChaveTO nfeChave = new NfeChaveTO();
		nfeChave.setNumeroNFE(rs.getString("VDFATNFR_NNF"));
		nfeChave.setChaveNFE(rs.getString("VDFATNFR_IDENT_NF"));
		return nfeChave;
	}
}
