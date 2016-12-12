package br.com.control.cadastro;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.control.dao.SisOrigemLogradouroDao;
import br.com.control.integracao.TabelasIntegracao;
import br.com.control.repositorio.mappers.SisOrigemLogradouroRowMapper;
import br.com.control.vendas.cadastro.modelo.cliente.SisOrigemLogradouro;

@Service
public class SisOrigemLogradouroService {

	@Autowired
	private SisOrigemLogradouroDao sisOrigemLogradouroDao;

	public List<SisOrigemLogradouro> listarOrigemLogradouro() {
		return sisOrigemLogradouroDao.selectViewSemWhere(TabelasIntegracao.TESTE, new SisOrigemLogradouroRowMapper());
	}

}
