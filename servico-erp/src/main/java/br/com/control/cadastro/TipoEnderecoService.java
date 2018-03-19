package br.com.control.cadastro;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.control.dao.TipoEnderecoDao;
import br.com.control.vendas.cadastro.modelo.cliente.TipoEndereco;

@Service
public class TipoEnderecoService {

	@Autowired
	private TipoEnderecoDao tipoEnderecoDao;
	
	public List<TipoEndereco> Listar() {
		return tipoEnderecoDao.listarTipoEndereco();
	}

	public TipoEndereco recuperarTipoEndereco(String retornaCodigoERP) {
		return tipoEnderecoDao.recuperaTipoEndereco(retornaCodigoERP);
	}
	
	public Integer count() {
		return tipoEnderecoDao.count();
	}

}
