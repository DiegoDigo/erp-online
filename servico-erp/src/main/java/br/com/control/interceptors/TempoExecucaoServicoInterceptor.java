//package br.com.control.interceptors;
//
//import java.util.Calendar;
//
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.core.MethodParameter;
//import org.springframework.stereotype.Component;
//import org.springframework.web.method.HandlerMethod;
//import org.springframework.web.servlet.ModelAndView;
//import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;
//
//import br.com.control.auditoria.Auditoria;
//import br.com.control.autenticacao.AuditoriaService;
//import br.com.control.integracao.MensagemRecebida;
//import br.com.control.integracao.TipoOperacao;
//
//@Component
//public class TempoExecucaoServicoInterceptor extends HandlerInterceptorAdapter {
//
//	
//	@Autowired
//	private AuditoriaService auditoriaService;
//	
//	@Override
//	public boolean preHandle(HttpServletRequest request,
//			HttpServletResponse response, Object handler) throws Exception {
//		
//		
//		return true;
//	}
//	
//	@Override
//	public void postHandle(HttpServletRequest request,
//			HttpServletResponse response, Object handler,
//			ModelAndView modelAndView) throws Exception {
//
//
//		 HandlerMethod method = (HandlerMethod) handler;
//		    System.out.println(method.getMethod());
//		
//		
//		for (MethodParameter parametro : method.getMethodParameters()) {
//			System.out.println(parametro.getClass());
//			if (MensagemRecebida.class.isAssignableFrom(parametro.getParameterType())) {
//				MensagemRecebida<?> msg = (MensagemRecebida<?>) parametro.getParameterType().get;
//				Auditoria auditoria = new Auditoria();
//				auditoria.setDataInicioExecucaoServico(Calendar.getInstance());
//				auditoria.setIdentificacao(msg.getIdentificacao());
//				auditoria.getIdentificacao().setTipoOperacao(TipoOperacao.valueOf(request.getMethod()));
//				auditoria.getIdentificacao().setServicoAcessado(request.getRequestURI());
//				auditoriaService.salvar(auditoria);
//				
//				request.setAttribute("auditoria", auditoria);
//			}
//		}
//		
//	}
//
//
//	@Override
//	public void afterCompletion(HttpServletRequest request,
//			HttpServletResponse response, Object handler, Exception ex)
//			throws Exception {
//		Auditoria auditoria = (Auditoria) request.getAttribute("auditoria");
//		
//		auditoria.setDataFimExecucaoServico(Calendar.getInstance());
//		auditoriaService.salvar(auditoria);
//	}
//
//}
