package br.com.control.cadastro;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.control.dao.ClienteEnderecoDao;
import br.com.control.portal.integracao.TabelasIntegracao;
import br.com.control.repositorio.mappers.ClienteEnderecoRowMapper;
import br.com.control.vendas.cadastro.modelo.cliente.ClienteEndereco;

@Service
public class ClienteEnderecoService {

	@Autowired
	private ClienteEnderecoDao clienteEnderecoDao;

	public List<ClienteEndereco> listarEndereco() {
		return clienteEnderecoDao.selectViewSemWhere(TabelasIntegracao.CADASTRO_CLIENTE_ENDERECO, new ClienteEnderecoRowMapper());
	}

}
