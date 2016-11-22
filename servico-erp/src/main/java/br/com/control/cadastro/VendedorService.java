package br.com.control.cadastro;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.control.dao.VendedorDao;
import br.com.control.vendas.cadastro.modelo.vendedor.Vendedor;

@Service
@Transactional
public class VendedorService {
	
	@Autowired
	private VendedorDao vendedorDao;
	
	
	public List<Vendedor> listar(){
		List<Vendedor> vendedores = new ArrayList<>();
		Iterable<Vendedor> iterableVendedor = vendedorDao.listarVendedor();
		iterableVendedor.forEach(vendedores::add);
		return vendedores;
	}

}
