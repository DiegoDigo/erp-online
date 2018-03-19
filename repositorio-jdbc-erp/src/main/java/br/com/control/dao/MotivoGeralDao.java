package br.com.control.dao;

import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import br.com.control.portal.integracao.ViewsIntegracaoERP;
import br.com.control.vendas.cadastro.modelo.MotivoGeral;

@Repository
@Transactional
public class MotivoGeralDao extends JdbcDao<MotivoGeral> {
	public Integer count() {
		String sql = "select count(*) from "+ getSchemaDatabase() + "." + ViewsIntegracaoERP.VW_MOTIVO_GERAL;
		return contaRegistros(sql);
	}
}
