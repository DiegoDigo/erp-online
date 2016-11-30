package br.com.control.cadastro.tipoCobranca;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.control.dao.TipoCobrancaDao;
import br.com.control.integracao.TabelasIntegracao;
import br.com.control.repositorio.mappers.TipoCobrancaRowMapper;
import br.com.control.vendas.cadastro.modelo.tipoCobranca.TipoCobranca;

@Service

public class TipoCobrancaService {

	@Autowired
	private TipoCobrancaDao tipoCobrancaDao;

	public List<TipoCobranca> listarTiposCobrancas() {
		return tipoCobrancaDao.selectViewSemWhere(TabelasIntegracao.CADASTRO_TIPO_COBRANCA,
				new TipoCobrancaRowMapper());
	}

}
