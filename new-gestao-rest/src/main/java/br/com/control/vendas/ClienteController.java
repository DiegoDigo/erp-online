package br.com.control.vendas;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.control.modelo.Usuario;
import br.com.control.vo.ComunicacaoVO;

@RestController
public class ClienteController {

	private static final String template = "Olá, %s!";

	private final AtomicLong counter = new AtomicLong();

	@RequestMapping("/comunicacao")
	public ComunicacaoVO greeting(@AuthenticationPrincipal Usuario user) {
		return new ComunicacaoVO(counter.incrementAndGet(),
				String.format(template, user.getNome()));
	}

}
