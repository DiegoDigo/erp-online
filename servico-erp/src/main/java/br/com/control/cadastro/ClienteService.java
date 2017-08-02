package br.com.control.cadastro;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.control.dao.ClienteDao;
import br.com.control.portal.mensageria.to.ClienteTO;
import br.com.control.vendas.cadastro.modelo.cliente.Cliente;

@Service
public class ClienteService {

	@Autowired
	private ClienteDao clienteDao;

	public void salvarOuAlterar(ClienteTO cliente) {
		clienteDao.salvarOuAlterar(cliente);
	}

	public List<Cliente> listarTodos() {
		return clienteDao.listaTodosClientesDaMatricula();

	}

	public Cliente recuperarCliente(int codigoClienteErp) {
		return clienteDao.recuperarCliente(codigoClienteErp);
	}

}
