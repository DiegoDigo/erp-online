package br.com.control.cadastro;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.control.dao.TipoCobrancaClienteDao;
import br.com.control.integracao.TabelasIntegracaoPortal;
import br.com.control.repositorio.mappers.TipoCobrancaClienteRowMapper;
import br.com.control.vendas.cadastro.modelo.cliente.TipoCobrancaCliente;

@Service
public class TipoCobrancaClienteService {

	@Autowired
	private TipoCobrancaClienteDao tipoCobrancaClienteDao;

	public List<TipoCobrancaCliente> listarTiposCobranca() {
		return tipoCobrancaClienteDao.selectViewSemWhere(TabelasIntegracaoPortal.TIPO_COBRANCA_CLIENTE, new TipoCobrancaClienteRowMapper());
	}

}
