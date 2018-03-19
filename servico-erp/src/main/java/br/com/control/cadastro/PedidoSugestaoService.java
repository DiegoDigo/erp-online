package br.com.control.cadastro;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.control.dao.PedidoSugestaoDao;
import br.com.control.vendas.cadastro.modelo.pedido.PedidoSugestao;

@Service
public class PedidoSugestaoService {

	@Autowired
	private PedidoSugestaoDao pedidoSugestaoDao;

	public List<PedidoSugestao> listar() {
		return pedidoSugestaoDao.listarPedidosSugestao();
	}
	
	public Integer count() {
		return pedidoSugestaoDao.count();
	}


}
