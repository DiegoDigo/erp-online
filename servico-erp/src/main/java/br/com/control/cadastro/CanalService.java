package br.com.control.cadastro;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.control.dao.CanalDao;
import br.com.control.integracao.TabelasIntegracaoPortal;
import br.com.control.repositorio.mappers.CanalRowMapper;
import br.com.control.vendas.cadastro.modelo.canal.Canal;

@Service

public class CanalService {

	@Autowired
	private CanalDao canalDao;

	public List<Canal> listar() {
		return canalDao.selectViewSemWhere(TabelasIntegracaoPortal.CADASTRO_CANAL, new CanalRowMapper());
	}

}
