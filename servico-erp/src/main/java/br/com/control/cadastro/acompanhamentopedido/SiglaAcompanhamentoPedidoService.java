package br.com.control.cadastro.acompanhamentopedido;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.control.dao.SiglaAcompanhamentoPedidoDao;
import br.com.control.vendas.cadastro.modelo.pedido.acompanhemanto.SiglaAcompanhamentoPedido;

@Service
@Transactional
public class SiglaAcompanhamentoPedidoService {
	
	@Autowired
	private SiglaAcompanhamentoPedidoDao siglaAcompanhamentoPedidoDao;
	
	
	public List<SiglaAcompanhamentoPedido> listaSigla(String sigla){
		
		List<SiglaAcompanhamentoPedido> siglasAcompanhamento = new ArrayList<>();		
		Iterable<SiglaAcompanhamentoPedido> siglas = siglaAcompanhamentoPedidoDao.listarSiglaAcomapanhamentoPedio(sigla);
		siglas.forEach(siglasAcompanhamento::add);
		return siglasAcompanhamento;
	}

}
