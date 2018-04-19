package br.com.control.cadastro;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.control.dao.ComodatoDao;
import br.com.control.portal.dto.ComodatoDTO;
import br.com.control.vendas.cadastro.modelo.Comodato;

@Service
public class ComodatoService {

	@Autowired
	private ComodatoDao comodatoDao;

	public List<Comodato> listarComodato() {
		return comodatoDao.listar();
	}

	public Comodato listarComodato(String codigoERP) {
		return comodatoDao.buscarComodato(codigoERP);
	}
	
	public List<ComodatoDTO> retirarComodato(List<ComodatoDTO> comodatos) {
		return comodatoDao.retirarComodato(comodatos);
	}

	public Integer count() {
		return comodatoDao.count();
	}

}
