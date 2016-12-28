package br.com.control.repositorio.mappers;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import br.com.control.vendas.cadastro.modelo.cliente.Cliente;

@Component
public class ClienteRowMapper implements RowMapper<Cliente> {
	
	@Override
	public Cliente mapRow(ResultSet rs, int rowNum) throws SQLException {
		
		Cliente cliente = new Cliente();
		cliente.setCodigoErp("codigo_cliente_erp");
		cliente.setAbateIcms(rs.getBoolean("abate_icms"));
		cliente.setAtivo(rs.getBoolean("ativo"));
		cliente.setBonusDisponivel(rs.getFloat("bonus_disponivel"));		
		cliente.setClasse(rs.getString("classe"));
		cliente.setCodigoTabpreco(rs.getString("codigo_tabpreco"));		
		cliente.setContato(rs.getString("contato").trim());
		cliente.setCpfCnpj(rs.getString("cpf_cnpj"));
		cliente.setDesprezaTaxaFinanceira(rs.getBoolean("despreza_taxa_Financeira"));
		//FIXME: rever este trecho quando realmente for utilizar o dia da semana a view deverá mandar
		cliente.setDiaSemana("1");
		cliente.setDiasEntrega(rs.getInt("dias_Entrega"));
		cliente.setEmail(rs.getString("email").trim());
		cliente.setIgnoraBandaPreco(rs.getBoolean("ignora_banda_preco"));
		//FIXME: rever este trecho quando realmente for utilizar o dia da semana a view deverá mandar
		cliente.setInconformidadeCadastro("1");
		cliente.setLimiteCredito(rs.getFloat("limite_credito"));
		cliente.setMotivoBloqClasse20(rs.getString("motivo_bloq_classe_20"));
		cliente.setMotivoBloqueioJuridico(rs.getString("motivo_bloqueio_juridico").trim());
		cliente.setNumeroCliente(rs.getString("numero_cliente"));
		cliente.setPasta(rs.getInt("pasta"));
		cliente.setRazaoSocial(rs.getString("razao_social").trim());
		cliente.setRegiaoCliente(rs.getString("REGIAO_CLIENTE"));
		cliente.setRegistroAlterado(rs.getInt("Registro_alterado"));
		cliente.setRestricaoComercial(rs.getBoolean("RESTIRCAO_COMERCIAL"));
		cliente.setSigla(rs.getString("sigla").trim());
		cliente.setSubCanal(rs.getString("sub_canal"));
		cliente.setTelefoneDdd(rs.getString("telefone_ddd"));
		cliente.setTelefoneTronco(rs.getString("telefone_tronco").trim());		
		cliente.setUsoVerbaRestritoProduto(rs.getInt("uso_verba_restrito_produto"));	
		cliente.setCodigoErpCondicaoPagamento(rs.getString("codigo_condicao_pagamento_erp"));
		cliente.setCodigoErpCanal(rs.getString("codigo_canal_erp"));
		cliente.setCodigoErpTipoCobranca(rs.getString("codigo_tipo_cobranca_erp"));
		return cliente;
	}
}
