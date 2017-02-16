package br.com.control.cadastro;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.control.dao.TipoCobrancaClienteDao;
import br.com.control.vendas.cadastro.modelo.cliente.TipoCobrancaCliente;

@Service
public class TipoCobrancaClienteService {

	@Autowired
	private TipoCobrancaClienteDao tipoCobrancaClienteDao;

	public List<TipoCobrancaCliente> listarTiposCobranca() {
		return tipoCobrancaClienteDao.retornaTodosTipoCobrancaCliente();
	}

	public TipoCobrancaCliente recuperarTipoCobrancaCliente(String retornaCodigoERP) {
		return tipoCobrancaClienteDao.recuperarTipoCobrancaCliente(retornaCodigoERP);
	}

}
