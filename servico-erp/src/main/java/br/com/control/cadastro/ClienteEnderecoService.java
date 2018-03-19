package br.com.control.cadastro;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.control.dao.ClienteEnderecoDao;
import br.com.control.vendas.cadastro.modelo.cliente.ClienteEndereco;

@Service
public class ClienteEnderecoService {

	@Autowired
	private ClienteEnderecoDao clienteEnderecoDao;

	public List<ClienteEndereco> listarEndereco() {
		return clienteEnderecoDao.listarEnderecoCliente();
	}

	public List<ClienteEndereco> recuperarTipoEnderecoCodigoERP(String codigoTipoEnderecoERP) {
		return clienteEnderecoDao.recuperarTipoEndereco(codigoTipoEnderecoERP);
	}
	
	public void alterarDados(ClienteEndereco clienteEndereco) {
		clienteEnderecoDao.	alterarEndereco(clienteEndereco);
	}

	public Integer count() {
		return clienteEnderecoDao.count();
	}
	
	
}
