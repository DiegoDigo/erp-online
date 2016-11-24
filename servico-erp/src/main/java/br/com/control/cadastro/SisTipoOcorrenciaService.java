package br.com.control.cadastro;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.control.dao.SisTipoOcorrenciaDao;
import br.com.control.integracao.TabelasIntegracaoPortal;
import br.com.control.repositorio.mappers.SisTipoOcorrenciaRowMapper;
import br.com.control.vendas.cadastro.modelo.ocorrencia.SisTipoOCorrencia;

@Service
public class SisTipoOcorrenciaService {

	@Autowired
	private SisTipoOcorrenciaDao sisTipoOcorrenciaDao;

	public List<SisTipoOCorrencia> listarOcorrencia() {
		return sisTipoOcorrenciaDao.selectViewSemWhere(TabelasIntegracaoPortal.SIS_CADASTRO_TIPO_OCORRENCIA, new SisTipoOcorrenciaRowMapper());
	}

}
