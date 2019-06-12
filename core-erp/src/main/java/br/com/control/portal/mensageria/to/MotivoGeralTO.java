package br.com.control.portal.mensageria.to;

import br.com.control.vendas.cadastro.modelo.MotivoGeral;
import br.com.control.vendas.cadastro.modelo.produto.Marca;

import java.io.Serializable;

public class MotivoGeralTO implements Serializable {

	private static final long serialVersionUID = 1L;
	private Boolean ativo;
	private String codigoMotivoGeralERP;
	private String descricao;
	private String descricaoReduzida;
	private Boolean influiVenda;
	private Boolean permiteVenda;
	private String codigoTipoMotivoGeralERP;

	public MotivoGeralTO() {
	}

	public MotivoGeralTO(MotivoGeral motivoGeral) {
		this.ativo = motivoGeral.getAtivo();
		this.codigoMotivoGeralERP = motivoGeral.getCodigoMotivoGeralERP();
		this.descricao = motivoGeral.getDescricao();
		this.descricaoReduzida = motivoGeral.getDescricaoReduzida();
		this.influiVenda = motivoGeral.getInfluiVenda();
		this.permiteVenda = motivoGeral.getPermiteVenda();
		this.codigoTipoMotivoGeralERP = motivoGeral.getCodigoTipoMotivoGeralERP();
	}
}