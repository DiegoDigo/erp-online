package br.com.control.cadastro;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.control.dao.VendedorDao;
import br.com.control.integracao.TabelasIntegracao;
import br.com.control.repositorio.mappers.VendedorRowMapper;
import br.com.control.vendas.cadastro.modelo.vendedor.Vendedor;

@Service
public class VendedorService {

	@Autowired
	private VendedorDao vendedorDao;

	public List<Vendedor> listar() {
		return vendedorDao.selectViewSemWhere(TabelasIntegracao.CADASTRO_VENDEDOR, new VendedorRowMapper());
	}

}
