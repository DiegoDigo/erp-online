package br.com.control.cadastro;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.control.dao.ComodatoDao;
import br.com.control.integracao.TabelasIntegracaoPortal;
import br.com.control.repositorio.mappers.ComodatoRowMapper;
import br.com.control.vendas.cadastro.modelo.Comodato;

@Service
public class ComodatoService {

	@Autowired
	private ComodatoDao comodatoDao;

	public List<Comodato> listarComodato() {
		return comodatoDao.selectViewSemWhere(TabelasIntegracaoPortal.COMODATO, new ComodatoRowMapper());
	}

}
