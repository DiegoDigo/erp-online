package br.com.control;

import br.com.control.autenticacao.UsuarioService;
import br.com.control.autenticacao.modelo.Usuario;
import br.com.control.portal.integracao.Sistema;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataInitializer implements CommandLineRunner {

    @Value("${numero_matricula_empresa}")
    private String licenca;

    private static final Logger logger = LoggerFactory.getLogger(DataInitializer.class);

    private final UsuarioService usuarioService;

    public DataInitializer(UsuarioService usuarioService) {
        this.usuarioService = usuarioService;
    }

    @Override
    public void run(String... strings) throws Exception {
        Usuario usuario = usuarioService.buscarPorLogin("portalvendas");
        if (usuario == null) {
            logger.info("Criando o usuario default.");
            usuarioService.criarUsuario(
                    new Usuario("portal", "portalvendas", Sistema.PORTAL_VENDAS, String.format("@erponline%s", licenca)));
        }else {
            logger.info("Usuario portalvendas ja existe!.");
        }
    }
}
