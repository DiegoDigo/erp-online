package br.com.control.cadastro;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.control.dao.OcorrenciaDao;
import br.com.control.vendas.cadastro.modelo.ocorrencia.Ocorrencia;

@Service
public class OcorrenciaService {

	@Autowired
	private OcorrenciaDao ocorrenciaDao;

	public List<Ocorrencia> listarOcorrencias() {
		return ocorrenciaDao.listarOcorrencia();
	}

	public Ocorrencia recuperarOcorrencia(String codigoOcorrenciaErp) {
		return ocorrenciaDao.recuperarOcorrencia(codigoOcorrenciaErp);
	}

}
