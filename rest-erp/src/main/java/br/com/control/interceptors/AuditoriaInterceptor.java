package br.com.control.interceptors;

import java.lang.reflect.Method;
import java.util.Calendar;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import br.com.control.auditoria.Auditoria;
import br.com.control.autenticacao.AuditoriaService;
import br.com.control.autenticacao.exceptions.IdentificacaoException;
import br.com.control.integracao.Identificacao;
import br.com.control.integracao.MensagemRecebida;
import br.com.control.integracao.TipoOperacao;

@Component
@Aspect
public class AuditoriaInterceptor {

	@Autowired
	private AuditoriaService auditoriaService;

	@Before(value = "@within(org.springframework.web.bind.annotation.RequestMapping) || @annotation(org.springframework.web.bind.annotation.RequestMapping)")
	public void before(JoinPoint joinPoint) throws Throwable {
		validaObrigatoriedadesIdentificacao(joinPoint);
		gravaLogParaAClasseAcionada(joinPoint);
	}
	
	@After(value = "@within(org.springframework.web.bind.annotation.RequestMapping) || @annotation(org.springframework.web.bind.annotation.RequestMapping)")
	public void after(JoinPoint joinPoint) throws Throwable {
		gravaLogParaAClasseAcionada(joinPoint);
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

	
	@SuppressWarnings("unchecked")
	private void gravaLogParaAClasseAcionada(JoinPoint joinPoint) {
		Object[] argumentosServicoChamado = joinPoint.getArgs();
		for (Object argumentoServico : argumentosServicoChamado) {
			if (argumentoServico instanceof MensagemRecebida) {
				MensagemRecebida<?> msg = (MensagemRecebida<?>) argumentoServico;
				
				MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();
				Method method = methodSignature.getMethod();
				RequestMethod methodHttp = method.getAnnotation(RequestMapping.class).method()[0];

				String servicoRaiz = ((RequestMapping)joinPoint.getSignature().getDeclaringType().getAnnotation(RequestMapping.class)).value()[0];
				String servicoAcessado = method.getAnnotation(RequestMapping.class).value()[0];
				            
				gravaLog(msg, methodHttp, servicoRaiz+servicoAcessado);
			}
		}
	}

	public void gravaLog(MensagemRecebida<?> msg, RequestMethod requestMethod, String servicoAcessado) {
		Auditoria auditoria = new Auditoria();
		auditoria.setDataInicioExecucaoServico(Calendar.getInstance());
		auditoria.setIdentificacao(msg.getIdentificacao());
		auditoria.getIdentificacao().setTipoOperacao(TipoOperacao.valueOf(requestMethod.toString()));
		auditoria.getIdentificacao().setServicoAcessado(servicoAcessado);
		auditoriaService.salvar(auditoria);
	}
}
