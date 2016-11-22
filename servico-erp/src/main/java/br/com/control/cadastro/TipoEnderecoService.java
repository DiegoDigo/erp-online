package br.com.control.cadastro;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.control.dao.TipoEnderecoDao;
import br.com.control.vendas.cadastro.modelo.cliente.TipoEndereco;

@Service
@Transactional
public class TipoEnderecoService {
	
	@Autowired
	private TipoEnderecoDao tipoEnderecoDao;
	
	
	public List<TipoEndereco> Listar(){
		List<TipoEndereco> tiposEndereco = new ArrayList<>();
		Iterable<TipoEndereco> iterableTiposEnderecos = tipoEnderecoDao.listarTiposEndereco();
		iterableTiposEnderecos.forEach(tiposEndereco::add);
		return tiposEndereco;
	}

}
