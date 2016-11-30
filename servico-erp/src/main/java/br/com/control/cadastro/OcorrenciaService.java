package br.com.control.cadastro;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.control.dao.OcorrenciaDao;
import br.com.control.integracao.TabelasIntegracao;
import br.com.control.repositorio.mappers.OcorrenciaRowMapper;
import br.com.control.vendas.cadastro.modelo.ocorrencia.Ocorrencia;

@Service
public class OcorrenciaService {

	@Autowired
	private OcorrenciaDao ocorrenciaDao;

	public List<Ocorrencia> listarOcorrencias() {
		return ocorrenciaDao.selectViewSemWhere(TabelasIntegracao.CADASTRO_OCORRENCIA, new OcorrenciaRowMapper());
	}

}
