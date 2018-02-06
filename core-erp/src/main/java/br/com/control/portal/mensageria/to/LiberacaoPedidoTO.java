package br.com.control.portal.mensageria.to;

import java.io.Serializable;
import java.math.BigDecimal;

import br.com.control.annotation.SequenciaParametrosProcedure;

public class LiberacaoPedidoTO implements Serializable {
	private static final long serialVersionUID = 1L;

	@SequenciaParametrosProcedure(index = 1)
	private String codigoEmpresa;

	@SequenciaParametrosProcedure(index = 2)
	private BigDecimal numeroPedidoGestao;
	
	@SequenciaParametrosProcedure(index = 3)
	private String statusPedido;

	
	@SequenciaParametrosProcedure(index = 4, isRetornoProcedure = true)
	private int retorno;
	
	public String getCodigoEmpresa() {
		return codigoEmpresa;
	}

	public void setCodigoEmpresa(String codigoEmpresa) {
		this.codigoEmpresa = codigoEmpresa;
	}

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