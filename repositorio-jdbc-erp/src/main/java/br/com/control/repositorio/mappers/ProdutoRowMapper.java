package br.com.control.repositorio.mappers;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import br.com.control.util.FormatacaoUtil;
import br.com.control.vendas.cadastro.modelo.produto.Produto;

@Component
public class ProdutoRowMapper implements RowMapper<Produto>{
	
	@Override
	public Produto mapRow(ResultSet rs, int rowNum) throws SQLException {
		Produto produto = new Produto();
		produto.setAtivo(rs.getBoolean("ativo"));
		produto.setBonificaUnidade(rs.getBoolean("bonifica_unidade"));
		produto.setClassFiscal(rs.getInt("class_fiscal"));
		produto.setCodigoEanFab(rs.getString("codigo_ean_fab"));
		produto.setCodigoErp(rs.getString("codigo_produto_erp"));
		produto.setDescricao(rs.getString("descricao").trim());	
		produto.setDescricaoRed(rs.getString("descricao_red").trim());
		produto.setIpiPauta(FormatacaoUtil.converteSNParaBoolean(rs.getString("ipi_pauta")));
		produto.setLinha(rs.getString("linha"));
		produto.setLitragem(rs.getString("litragem"));
		produto.setPercentualBonusGera(rs.getFloat("percentual_bonus_gera"));
		produto.setPercentualBonusUsa(rs.getFloat("percentual_bonus_usa"));
		produto.setPermiteBonificacao(rs.getBoolean("permite_bonificacao"));
		produto.setPeso(rs.getFloat("peso"));
		produto.setPesoEmb(rs.getFloat("peso_emb"));
		produto.setQtdMinVendaAv(rs.getInt("qtd_min_venda_av"));
		produto.setQtdMinVendaCx(rs.getInt("qtd_min_venda_cx"));
		produto.setQuantidadeCx(rs.getInt("quantidade_cx"));
		produto.setTipoBanda(rs.getString("tipo_banda"));
		produto.setTipoProduto(rs.getString("tipo_produto"));
		produto.setUtilizaBandaPrecoTipo(rs.getInt("utiliza_banda_preco_tipo"));
		produto.setValorMinimoBonus(rs.getFloat("valor_minimo_bonus"));
		produto.setVendaMultiMinAv(rs.getInt("venda_multi_min_av"));
		produto.setVendaMultiMinCx(rs.getInt("venda_multi_min_cx"));
		produto.setVendeAvulso(rs.getBoolean("venda_avulso"));
		produto.setVisibilidadePortal(0);
		produto.setCodigoErpCategoria(rs.getString("CODIGO_CATEGORIA_PRODUTO_ERP"));
		produto.setCodigoErpGrupo(rs.getString("CODIGO_GRUPO_PRODUTO_ERP"));
		produto.setCodigoErpFamilia(rs.getString("CODIGO_FAMILIA_PRODUTO_ERP"));
		produto.setCodigoErpMarca(rs.getString("CODIGO_MARCA_PRODUTO_ERP"));
		return produto;
	}

}
