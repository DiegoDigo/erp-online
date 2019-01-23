package br.com.control;

import br.com.control.dao.BoletoDao;
import br.com.control.dao.BoletoPedidoDao;
import br.com.control.vendas.cadastro.modelo.pedido.pagamento.Boleto;
import br.com.control.vendas.cadastro.modelo.pedido.pagamento.BoletoPedido;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BoletoService {

    @Autowired
    private BoletoDao boletoDao;

    @Autowired
    private BoletoPedidoDao boletoPedidoDao;

    @Value("${codigo_empresa}")
    private int codigoEmpresa;

    public List<Boleto> listar() {
        return boletoDao.listarBoletoPor(0,0,0, codigoEmpresa);
    }

    public List<BoletoPedido> listarBoletoPedido() {
        return boletoPedidoDao.listarBoletoPedido(0,codigoEmpresa);    }


}
