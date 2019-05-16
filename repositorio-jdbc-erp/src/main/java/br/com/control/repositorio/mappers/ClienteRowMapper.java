package br.com.control.repositorio.mappers;

import java.io.Serializable;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import br.com.control.vendas.cadastro.modelo.cliente.Cliente;

@Component
public class ClienteRowMapper implements RowMapper<Cliente>, Serializable {

    @Override
    public Cliente mapRow(ResultSet rs, int rowNum) throws SQLException {

        Cliente cliente = new Cliente();
        cliente.setAbateIcms(rs.getBoolean(1));
        cliente.setAtivo(rs.getBoolean(2));
        cliente.setCodigoErp(rs.getString(3).trim());
        cliente.setBonusDisponivel(rs.getFloat(4));
        cliente.setClasse(rs.getString(5).trim());
        cliente.setCodigoTabpreco(rs.getString(6).trim());
        cliente.setContato(rs.getString(7).trim());
        cliente.setCpfCnpj(rs.getString(8).trim());
        cliente.setDesprezaTaxaFinanceira(rs.getBoolean(9));
        cliente.setDiaSemana(rs.getString(10));
        cliente.setDiasEntrega(rs.getInt(11));
        cliente.setEmail(rs.getString(12).trim());
        cliente.setIgnoraBandaPreco(rs.getBoolean(13));
        cliente.setInconformidadeCadastro(rs.getString(14) == null ? "1" : rs.getString(14));
        cliente.setLimiteCredito(rs.getFloat(15));
        cliente.setMotivoBloqClasse20(rs.getString(16).trim());
        cliente.setMotivoBloqueioJuridico(rs.getString(17).trim());
        cliente.setNumeroCliente(rs.getString(18).trim());
        cliente.setPasta(rs.getInt(19));
        cliente.setRazaoSocial(rs.getString(20).trim());
        cliente.setRegiaoCliente(rs.getString(21).trim());
        cliente.setRegistroAlterado(rs.getInt(22));
        cliente.setRestricaoComercial(rs.getBoolean(23));
        cliente.setSigla(rs.getString(24).trim());
        cliente.setSubCanal(rs.getString(25).trim());
        cliente.setTelefoneDdd(rs.getString(26).trim());
        cliente.setTelefoneTronco(rs.getString(27).trim());
        cliente.setUsoVerbaRestritoProduto(rs.getInt(28));
        cliente.setCodigoErpCanal(rs.getString(29).trim());
        cliente.setCodigoErpCondicaoPagamento(rs.getString(30).trim());
        cliente.setCodigoErpTipoCobranca(rs.getString(31).trim());
        cliente.setDisponivelPortal(rs.getBoolean(32));
        cliente.setCelular(rs.getString(33).trim());

        return cliente;
    }
}
