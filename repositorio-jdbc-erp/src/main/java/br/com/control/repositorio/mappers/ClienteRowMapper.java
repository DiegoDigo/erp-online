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
		cliente.setRecId(rs.getLong("rec_id"));
		cliente.setAbateIcms(rs.getBoolean("abate_icms"));
		cliente.setAtivo(rs.getBoolean("ativo"));
		cliente.setBonusDisponivel(rs.getFloat("bonus_disponivel"));		
		cliente.setClasse(rs.getString("classe"));
		cliente.setCodigoTabpreco(rs.getString("codigo_tabpreco"));		
		cliente.setContato(rs.getString("contato"));
		cliente.setCpfCnpj(rs.getString("cpf_cnpj"));
		cliente.setDesprezaTaxaFinanceira(rs.getBoolean("despreza_taxa_Financeira"));
		cliente.setDiaSemana(rs.getString("dia_semana"));
		cliente.setDiasEntrega(rs.getInt("dias_Entrega"));
		cliente.setEmail(rs.getString("email"));
		cliente.setIgnoraBandaPreco(rs.getBoolean("ignora_banda_preco"));
		cliente.setInconformidadeCadastro(rs.getString("inconformidade_cadastro"));
		cliente.setLimiteCredito(rs.getFloat("limite_credito"));
		cliente.setMotivoBloqClasse20(rs.getString("motivo_bloq_classe_20"));
		cliente.setMotivoBloqueioJuridico(rs.getString("motivo_bloqueio_juridico"));
		cliente.setNumeroCliente(rs.getString("numero_cliente"));
		cliente.setPasta(rs.getInt("pasta"));
		cliente.setRazaoSocial(rs.getString("razao_social"));
		cliente.setRegiaoCliente(rs.getString("REGIAO_CLIENTE"));
		cliente.setRegistroAlterado(rs.getInt("Registro_alterado"));
		cliente.setRestricaoComercial(rs.getBoolean("restricao_comercial"));
		cliente.setSigla(rs.getString("sigla"));
		cliente.setSubCanal(rs.getString("sub_canal"));
		cliente.setTelefoneDdd(rs.getString("telefone_ddd"));
		cliente.setTelefoneTronco(rs.getString("telefone_troco"));		
		cliente.setUsoVerbaRestritoProduto(rs.getInt("uso_verba_restrito_produto"));	
		cliente.setCondicaoPagamento(rs.getLong("codigo_condicao_pagamento_rec_id"));
		cliente.setCanalVenda(rs.getLong("codigo_canal_rec_id"));
		cliente.setTipoCobranca(rs.getLong("codigo_tipo_cobranca_rec_id"));
		return cliente;
		
	}
}
