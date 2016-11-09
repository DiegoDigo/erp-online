package br.com.control.interceptors;

import java.util.Map;
import java.util.Map.Entry;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import br.com.control.autenticacao.exceptions.IdentificacaoException;
import br.com.control.integracao.Identificacao;
import br.com.control.integracao.MensagemRecebida;

@Component
public class ValidacaoServicoInterceptor extends HandlerInterceptorAdapter {
	
	@Override
	public boolean preHandle(HttpServletRequest request,
			HttpServletResponse response, Object handler) throws Exception {
		
		Map<String, String[]> parametrosServico = request.getParameterMap();
		for (Entry<String, String[]> parametro : parametrosServico.entrySet()) {
			if (parametro instanceof MensagemRecebida) {
				MensagemRecebida<?> msg = (MensagemRecebida<?>) parametro;
				
				Identificacao identificacao = msg.getIdentificacao();
				if (identificacao.getOrigem() == null) {
					throw new IdentificacaoException("Sistema Origem não informado!");
				}
				if (identificacao.getDestino() == null) {
					throw new IdentificacaoException("Sistema Destino não informado!");
				}
				if (identificacao.getUsuarioOrigemServico() == null) {
					throw new IdentificacaoException("Usuário do sistema Origem não informado!");
				}
				if (identificacao.getMatriculaAssociada() == null) {
					throw new IdentificacaoException("Matrícula da revenda não foi informada!");
				}
			}
		}
		return true;
	}

}
