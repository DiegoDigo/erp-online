package br.com.control.repositorio.mappers;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import br.com.control.vendas.cadastro.modelo.produto.Paroco;

@Component
public class ParocoRowMapper implements RowMapper<Paroco> {

	@Override
	public Paroco mapRow(ResultSet rs, int rowNum) throws SQLException {
		Paroco paroco = new Paroco();
		
		String mesTabela2Digitos = preparaZeroEsquerdaMesTabela(rs.getInt("MES_TABELA_CARGA"));
		String tabelaPreco = String.valueOf(rs.getInt("ANO_TABELA_CARGA") + mesTabela2Digitos);
		paroco.setCodigoTabelaPreco(tabelaPreco);
		paroco.setCodigoClienteErp(rs.getString("CODIGO_CLIENTE_ERP").trim());
		paroco.setCodigoEmpresaErp(rs.getString("CODIGO_EMPRESA").trim());
		paroco.setUsaBandaPreco(rs.getInt("USA_BANDEIRA"));
		paroco.setSenhaLiberacaoPedido(rs.getString("SENHA_LIB") == null ? "" : rs.getString("SENHA_LIB").trim());

//		System.out.println(" --> PAROCO");
//		System.out.println("CODIGO_TABELA_PRECO_ERP: " + rs.getString("CODIGO_TABELA_PRECO_ERP").trim());
//		System.out.println("CODIGO_CLIENTE_ERP: " + rs.getString("CODIGO_CLIENTE_ERP").trim());
//		System.out.println("CODIGO_EMPRESA: " + rs.getString("CODIGO_EMPRESA").trim());
//		System.out.println(" -------------------------------------------------- ");

		return paroco;
	}

	
	private String preparaZeroEsquerdaMesTabela(int mesTabela){
		String mesTabelaString = String.valueOf(mesTabela);
		if(mesTabelaString != null && mesTabelaString.length()==1){
			return "0"+mesTabelaString;
		}
		return mesTabelaString;
	}
}