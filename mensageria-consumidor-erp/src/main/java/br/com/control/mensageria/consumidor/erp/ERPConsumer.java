package br.com.control.mensageria.consumidor.erp;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import br.com.control.portal.enums.CadastrosEnum;
import br.com.control.portal.integracao.Identificacao;
import br.com.control.portal.integracao.Sistema;

@Component
public class ERPConsumer {

	@Value("${numero_matricula_empresa}")
	private String numeroMatriculaRevenda;
	
	public Identificacao criaIdentificacaoServico(CadastrosEnum cadastroASincronizar) {
		Identificacao identificacao = new Identificacao();
		identificacao.setOrigem(Sistema.ERP);
		identificacao.setDestino(Sistema.PORTAL_VENDAS);
		identificacao.setMatriculaAssociada(numeroMatriculaRevenda);
		identificacao.setServicoAcessado("SINCRONISMO DE "+cadastroASincronizar);
		identificacao.setUsuarioOrigemServico("USUARIO ERP");
		identificacao.setCadastroASincronizar(cadastroASincronizar);
		return identificacao;
	}

}