package br.com.control.repositorio;


import org.springframework.data.repository.CrudRepository;

import br.com.control.vendas.cadastro.modelo.clienteOld.Cliente;

public interface ClienteRepository extends CrudRepository<Cliente, Long> {

}
