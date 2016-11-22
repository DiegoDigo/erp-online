package br.com.control.cadastro;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.control.dao.CanalDao;
import br.com.control.vendas.cadastro.modelo.canal.Canal;

@Service
@Transactional
public class CanalService {
	
	@Autowired
	private CanalDao canalDao;
	
	public List<Canal> listar(){
		List<Canal> listaCanal = new ArrayList<>();
		Iterable<Canal> canais = canalDao.listarCanais();
		canais.forEach(listaCanal::add);
		return listaCanal;
	}

}
