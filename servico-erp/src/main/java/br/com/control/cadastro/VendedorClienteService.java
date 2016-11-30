package br.com.control.cadastro;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.control.dao.VendedorClienteDao;
import br.com.control.integracao.TabelasIntegracao;
import br.com.control.repositorio.mappers.VendedorClienteRowMapper;
import br.com.control.vendas.cadastro.modelo.vendedor.VendedorCliente;

@Service
public class VendedorClienteService {

	@Autowired
	private VendedorClienteDao vendedorClienteDao;

	public List<VendedorCliente> listar() {
		return vendedorClienteDao.selectViewSemWhere(TabelasIntegracao.CADASTRO_VENDEDOR_CLIENTE, new VendedorClienteRowMapper());
	}

}
