package br.com.control.interceptors;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import br.com.control.autenticacao.exceptions.IdentificacaoException;
import br.com.control.integracao.Identificacao;
import br.com.control.integracao.MensagemRecebida;

@Component
@Aspect
public class ValidadorIdentificacaoRestAop {

	@Before(value = "@within(org.springframework.web.bind.annotation.RequestMapping) || @annotation(org.springframework.web.bind.annotation.RequestMapping)")
	public void before(JoinPoint joinPoint) throws Throwable {
		validaObrigatoriedadesIdentificacao(joinPoint);
	}

	private void validaObrigatoriedadesIdentificacao(JoinPoint joinPoint) {
		Object[] argumentosServicoChamado = joinPoint.getArgs();
		for (Object argumentoServico : argumentosServicoChamado) {
			if (argumentoServico instanceof MensagemRecebida) {
				MensagemRecebida<?> msg = (MensagemRecebida<?>) argumentoServico;

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
	}

}
