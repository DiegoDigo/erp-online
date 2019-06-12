package br.com.control.dao;

import javax.transaction.Transactional;

import br.com.control.repositorio.mappers.MotivoGeralRowMapper;
import org.springframework.stereotype.Repository;

import br.com.control.portal.integracao.ViewsIntegracaoERP;
import br.com.control.vendas.cadastro.modelo.MotivoGeral;

import java.util.List;

@Repository
@Transactional
public class MotivoGeralDao extends JdbcDao<MotivoGeral> {
	public Integer count() {
		String sql = "select count(*) from "+ getSchemaDatabase() + "." + ViewsIntegracaoERP.VW_MOTIVO_GERAL;
		return contaRegistros(sql);
	}


	public MotivoGeral motivoGeralPorCodigoETipo(String codigoMotivoGeral, String tipoMotivo){
		String sql = String.format("select * from %s where codigo_motivo_geral = '%s' and tipo_motivo_geral_rec_id = '%s'",
				ViewsIntegracaoERP.VW_MOTIVO_GERAL, codigoMotivoGeral, tipoMotivo);
		try{
			return getJdbcTemplate().query(sql, new MotivoGeralRowMapper()).get(0);
		}catch (Exception e){
			return null;
		}

	}
}
