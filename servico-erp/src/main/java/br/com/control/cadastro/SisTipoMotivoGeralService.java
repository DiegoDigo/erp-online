package br.com.control.cadastro;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.control.dao.SisTipoMotivoGeralDao;
import br.com.control.integracao.TabelasIntegracaoPortal;
import br.com.control.repositorio.mappers.SisTipoMotivoGeralRowMapper;
import br.com.control.vendas.cadastro.modelo.SisTipoMotivoGeral;

@Service
public class SisTipoMotivoGeralService {

	@Autowired
	private SisTipoMotivoGeralDao sisTipoMotivoGeralDao;

	public List<SisTipoMotivoGeral> listar() {
		return sisTipoMotivoGeralDao.selectViewSemWhere(TabelasIntegracaoPortal.SIS_CADASTRO_TIPO_MOTIVO_GERAL, new SisTipoMotivoGeralRowMapper());

	}

}
