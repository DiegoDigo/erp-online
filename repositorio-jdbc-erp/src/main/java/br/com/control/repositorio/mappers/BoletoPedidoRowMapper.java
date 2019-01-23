package br.com.control.repositorio.mappers;

import br.com.control.vendas.cadastro.modelo.pedido.pagamento.BoletoPedido;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class BoletoPedidoRowMapper implements RowMapper<BoletoPedido> {

    @Override
    public BoletoPedido mapRow(ResultSet rs, int rowNum) throws SQLException {

        BoletoPedido boletoPedido = new BoletoPedido();
        boletoPedido.setCodigoBancoBoletoPedido(rs.getString("CODIGO_BANCO_BOLETO_POR_PEDIDO").trim());
        boletoPedido.setCodigoNossoNumeroBoletoPedido(rs.getString("CODIGO_NOSSO_NUMERO_BOLETO_POR_PEDIDO").trim());
        boletoPedido.setSequenciaBoletoPedido(rs.getString("SEQUENCIA_BOLETO_POR_PEDIDO").trim());
        boletoPedido.setNumeroPedidoBoletoPedido(rs.getString("NUMERO_PEDIDO_BOLETO_POR_PEDIDO").trim());
        boletoPedido.setNumeroNotaFiscalBoletoPedido(rs.getString("NUMERO_NOTA_FISCAL_BOLETO_POR_PEDIDO").trim());
        boletoPedido.setSerieNotaFiscalBoletoPedido(rs.getString("SERIE_NOTA_FISCAL_BOLETO_POR_PEDIDO").trim());
        boletoPedido.setCodigoClienteBoletoPedido(rs.getString("CODIGO_CLIENTE_BOLETO_POR_PEDIDO").trim());
        boletoPedido.setDataEmissaoBoletoPedido(rs.getString("DATA_EMISSAO_BOLETO_POR_PEDIDO").trim());
        boletoPedido.setDataVencimentoBoletoPedido(rs.getString("DATA_VENCIMENTO_BOLETO_POR_PEDIDO").trim());

        return boletoPedido;
    }


}
