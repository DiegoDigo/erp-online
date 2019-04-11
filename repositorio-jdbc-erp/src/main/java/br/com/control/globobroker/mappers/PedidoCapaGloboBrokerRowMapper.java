package br.com.control.globobroker.mappers;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import br.com.control.globobroker.model.envio.PedidoCapaGloboBroker;

public class PedidoCapaGloboBrokerRowMapper implements RowMapper<PedidoCapaGloboBroker> {

	@Override	
	public PedidoCapaGloboBroker mapRow(ResultSet rs, int rowNum) throws SQLException {

		PedidoCapaGloboBroker pedido = new PedidoCapaGloboBroker();
		pedido.setCpfcnpj(rs.getString("CPFCNPJ").replaceAll("\\s+$", ""));
		pedido.setRazaosocial(rs.getString("RAZAO").replaceAll("\\s+$", ""));
		pedido.setNomefantasia(rs.getString("NOME_FANTASIA").replaceAll("\\s+$", ""));
		pedido.setInscestadual(rs.getString("INSCRICAO_ESTADUAL").replaceAll("\\s+$", ""));
		pedido.setCEPFAT(rs.getString("CEP_FAT").replaceAll("\\s+$", ""));
		pedido.setTipo_logFat(rs.getString("tipo_logFat").replaceAll("\\s+$", ""));
		pedido.setLogradouroFat(rs.getString("logradouroFat").replaceAll("\\s+$", ""));
		pedido.setNum_logFat(rs.getString("num_logFat").replaceAll("\\s+$", ""));
		pedido.setComplementoFat(rs.getString("complemento_fat").replaceAll("\\s+$", ""));
		pedido.setBairroFat(rs.getString("bairro_fat").replaceAll("\\s+$", ""));
		pedido.setCidadeFat(rs.getString("cidade_fat").replaceAll("\\s+$", ""));
		pedido.setUFFat(rs.getString("UF_fat").replaceAll("\\s+$", ""));
		pedido.setCEPCob(rs.getString("CEP_COB").replaceAll("\\s+$", ""));
		pedido.setTipo_logCob(rs.getString("tipo_logCob").replaceAll("\\s+$", ""));
		pedido.setLogradouroCob(rs.getString("logradouroCob").replaceAll("\\s+$", ""));
		pedido.setNum_logCob(rs.getString("num_logCob").replaceAll("\\s+$", ""));
		pedido.setComplementoCob(rs.getString("complemento_cob").replaceAll("\\s+$", ""));
		pedido.setBairroCob(rs.getString("bairro_cob").replaceAll("\\s+$", ""));
		pedido.setCidadeCob(rs.getString("cidade_COB").replaceAll("\\s+$", ""));
		pedido.setUFCob(rs.getString("UF_COB").replaceAll("\\s+$", ""));
		pedido.setCEPEnt(rs.getString("CEP_ENT").replaceAll("\\s+$", ""));
		pedido.setTipo_logEnt(rs.getString("tipo_logEnt").replaceAll("\\s+$", ""));
		pedido.setLogradouroEnt(rs.getString("logradouroEnt").replaceAll("\\s+$", ""));
		pedido.setNum_logEnt(rs.getString("num_logEnt").replaceAll("\\s+$", ""));
		pedido.setComplementoEnt(rs.getString("complemento_ent").replaceAll("\\s+$", ""));
		pedido.setBairroEnt(rs.getString("bairro_ent").replaceAll("\\s+$", ""));
		pedido.setCidadeEnt(rs.getString("cidade_ent").replaceAll("\\s+$", ""));
		pedido.setUFEnt(rs.getString("UF_ent").replaceAll("\\s+$", ""));
		pedido.setDDD(rs.getString("DDD").replaceAll("\\s+$", ""));
		pedido.setContato(rs.getString("contato").replaceAll("\\s+$", ""));
		pedido.setTelefone(rs.getString("telefone").replaceAll("\\s+$", ""));
		pedido.setEmail(rs.getString("email").replaceAll("\\s+$", ""));
		pedido.setCnae(rs.getString("cnae").replaceAll("\\s+$", ""));
		pedido.setSegmento(rs.getString("segmento").replaceAll("\\s+$", ""));
		pedido.setCondicaofaturamento(rs.getString("CONDICAOFATURAMENTO").replaceAll("\\s+$", ""));
		pedido.setNumeroPedidoJcontrol(rs.getString("pedido_jcontrol").replaceAll("\\s+$", ""));
		pedido.setCodigoVendedor(rs.getString("codigo_vendedor").replaceAll("\\s+$", ""));
		pedido.setTipoCobranca(rs.getString("tipocobranca").replaceAll("\\s+$", ""));
		pedido.setCondicaoPagamento(rs.getString("condicao_pagamento").replaceAll("\\s+$", ""));
		pedido.setDataEmissao(rs.getString("data_emissao").replaceAll("\\s+$", ""));
		pedido.setDataVencimentoPrimeiraParcela(rs.getString("primeiro_vencimento").replaceAll("\\s+$", ""));
		pedido.setDataentrega(rs.getString("data_entrega").replaceAll("\\s+$", ""));
		pedido.setValorDesconto(rs.getDouble("valor_desconto"));
		pedido.setValorAcrescimo(rs.getDouble("valor_acrescimo"));
		pedido.setValorLiquido(rs.getDouble("valor_liquido"));
		pedido.setPlaca(rs.getString("placa").replaceAll("\\s+$", ""));
		pedido.setAtendente(rs.getString("atendente").replaceAll("\\s+$", ""));
		pedido.setAreaAtendente(rs.getString("area_atendente").replaceAll("\\s+$", ""));
		pedido.setTipodepedido(rs.getString("tipo_pedido").replaceAll("\\s+$", ""));
		pedido.setTipodefrete(rs.getString("tipo_frete").replaceAll("\\s+$", ""));
		pedido.setEnderecoWebService(rs.getString("ENDERECO_WEBSERVICE").replaceAll("\\s+$", ""));
		pedido.setUsuarioErpTerceiro(rs.getString("USUARIO_WEBSERVICE").replaceAll("\\s+$", ""));
		pedido.setSenhaErpTerceiro(rs.getString("SENHA_WEBSERVICE").replaceAll("\\s+$", ""));
		return pedido;
	}
}
