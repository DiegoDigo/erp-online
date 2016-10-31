package br.com.control.cadastro;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.control.repositorio.ClienteRepository;
import br.com.control.vendas.cadastro.modelo.cliente.Cliente;

@Service
@Transactional
public class ClienteService {
	
	@Autowired
	private ClienteRepository repositorioCliente;
	
	public Cliente salvar(Cliente cliente){
		Cliente clienteSalvo = repositorioCliente.save(cliente);
		return clienteSalvo;
	}

	public List<Cliente> listarTodos(){
		List<Cliente> listaClientes = new ArrayList<>();
		Iterable<Cliente> clientesIterable = repositorioCliente.findAll();
		clientesIterable.forEach(listaClientes::add);
		return listaClientes;
	}
}
