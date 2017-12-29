package br.com.control.cadastro;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.control.dao.MotivoGeralDao;
import br.com.control.portal.integracao.ViewsIntegracaoERP;
import br.com.control.repositorio.mappers.MotivoGeralRowMapper;
import br.com.control.vendas.cadastro.modelo.MotivoGeral;

@Service
public class MotivoGeralService {

	@Autowired
	private MotivoGeralDao motivoGeralDao;

	public List<MotivoGeral> listarMotivos() {
		return motivoGeralDao.selectViewSemWhere(ViewsIntegracaoERP.VW_MOTIVO_GERAL, new MotivoGeralRowMapper());
	}

}
