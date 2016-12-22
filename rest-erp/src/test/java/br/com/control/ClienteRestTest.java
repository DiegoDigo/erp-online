package br.com.control;


import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.greaterThan;
import static org.hamcrest.Matchers.hasSize;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.notNullValue;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.security.web.FilterChainProxy;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.util.Base64Utils;
import org.springframework.web.context.WebApplicationContext;

import br.com.control.autenticacao.modelo.Sistema;
import br.com.control.controllers.cadastros.ClienteController;

@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
//@SpringApplicationConfiguration(classes = ServicoERP.class)
public class ClienteRestTest {

	@Autowired
	WebApplicationContext context;

	@Autowired
	private FilterChainProxy springSecurityFilterChain;

	@InjectMocks
	ClienteController controller;

	private MockMvc mvc;

	@Before
	public void setUp() {
		MockitoAnnotations.initMocks(this);
		mvc = MockMvcBuilders.webAppContextSetup(context)
				.addFilter(springSecurityFilterChain).build();
	}

	@Test
	public void cadastroClienteUsuarioNaoAutorizado() throws Exception {
		mvc.perform(get("/cliente/salvar")
				.accept(MediaType.APPLICATION_JSON))
				.andExpect(status().isUnauthorized())
				.andExpect(jsonPath("$.error", is("unauthorized")));
	}


	@Test
	public void cadastroClienteUsuarioAutorizado() throws Exception {
		String accessToken = getAccessToken("rasa", "123");

		mvc.perform(get("/cliente/salvar")
				.header("Authorization", "Bearer " + accessToken))
				.andExpect(status().isOk())
				.andExpect(jsonPath("$.status", is(HttpStatus.OK.getReasonPhrase())));

		mvc.perform(get("/cliente/salvar")
				.header("Authorization", "Bearer " + accessToken))
				.andExpect(status().isOk())
				.andExpect(jsonPath("$.status", is(HttpStatus.OK.getReasonPhrase())));

		mvc.perform(get("/cliente/salvar")
				.header("Authorization", "Bearer " + accessToken))
				.andExpect(status().isOk())
				.andExpect(jsonPath("$.status", is(HttpStatus.OK.getReasonPhrase())));
	}

	@Test
	public void listaUsuariosApenasAdministradorAutorizado() throws Exception {
		mvc.perform(get("/users")
				.header("Authorization", "Bearer " + getAccessToken("rasa", "123")))
				.andExpect(status().isOk())
				.andExpect(jsonPath("$", hasSize(3)));
	}

	@Test
	public void listaUsuariosApenasAdministradorNaoAutorizado() throws Exception {
		mvc.perform(get("/users")
				.header("Authorization", "Bearer " + getAccessToken("rodrigo", "123")))
				.andExpect(status().is(403));
	}
	
	private String getAccessToken(String username, String password) throws Exception {
		String authorization = "Basic "
				+ new String(Base64Utils.encode((Sistema.PORTAL_VENDAS+":"+Sistema.PORTAL_VENDAS.getSegredo()).getBytes()));
		String contentType = MediaType.APPLICATION_JSON + ";charset=UTF-8";

		String content = mvc
				.perform(
						post("/oauth/token")
								.header("Authorization", authorization)
								.contentType(
										MediaType.APPLICATION_FORM_URLENCODED)
								.param("username", username)
								.param("password", password)
								.param("grant_type", "password")
								.param("scope", "read write")
								.param("client_id", Sistema.PORTAL_VENDAS.toString())
								.param("client_secret", Sistema.PORTAL_VENDAS.getSegredo()))
				.andExpect(status().isOk())
				.andExpect(content().contentType(contentType))
				.andExpect(jsonPath("$.access_token", is(notNullValue())))
				.andExpect(jsonPath("$.token_type", is(equalTo("bearer"))))
				.andExpect(jsonPath("$.refresh_token", is(notNullValue())))
				.andExpect(jsonPath("$.expires_in", is(greaterThan(4000))))
				.andExpect(jsonPath("$.scope", is(equalTo("read write"))))
				.andReturn().getResponse().getContentAsString();


		return content.substring(17, 53);
	}

}
