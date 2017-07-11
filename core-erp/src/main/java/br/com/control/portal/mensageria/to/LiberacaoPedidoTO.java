package br.com.control.portal.mensageria.to;

import java.io.Serializable;
import java.math.BigDecimal;

import br.com.control.annotation.SequenciaParametrosProcedure;

public class LiberacaoPedidoTO implements Serializable {
	private static final long serialVersionUID = 1L;

	@SequenciaParametrosProcedure(index = 1)
	private BigDecimal numeroPedidoGestao;
	
	@SequenciaParametrosProcedure(index = 2)
	private String statusPedido;
	
	@SequenciaParametrosProcedure(index = 3, isRetornoProcedure = true)
	private int retorno;

	public BigDecimal getNumeroPedidoGestao() {
		return numeroPedidoGestao;
	}

	public void setNumeroPedidoGestao(BigDecimal numeroPedidoGestao) {
		this.numeroPedidoGestao = numeroPedidoGestao;
	}

	public String getStatusPedido() {
		return statusPedido;
	}

	public void setStatusPedido(String statusPedido) {
		this.statusPedido = statusPedido;
	}

	public int getRetorno() {
		return retorno;
	}

	public void setRetorno(int retorno) {
		this.retorno = retorno;
	}

}