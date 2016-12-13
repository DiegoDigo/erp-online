package br.com.control.rest.client;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;

import org.apache.commons.codec.binary.Base64;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponents;
import org.springframework.web.util.UriComponentsBuilder;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.ObjectMapper;



public class ClienteRestService {

	public void sinalizaPortalAcompanhamentoPedido(String conteudo) {
		System.out.println("ENTROU NO ClienteRestService");
		HttpHeaders headers = new HttpHeaders();
		headers.setAccept(Arrays.asList(org.springframework.http.MediaType.APPLICATION_JSON));

		ObjectMapper mapper = new ObjectMapper();
		mapper.configure(MapperFeature.DEFAULT_VIEW_INCLUSION, true);

		MensagemEnvio m = criaIdentificacaoServico(conteudo);
		
		try {
			String msgJson = mapper.writer().writeValueAsString(m);
			String url = getREST_SERVICE_URI() + "/servicos/b" + "?mensagem="
					+ msgJson;
			UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(url);
			UriComponents uriComponents = builder.build();
			URI uri = uriComponents.toUri();

			RestTemplate restTemplate = new RestTemplate();
			
			restTemplate.getForObject(uri, MensagemRetorno.class);
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}

		

	}

	
	private String REST_SERVICE_URI = "http://localhost:8282";

	private String AUTH_SERVER_URI = "http://localhost:8282/oauth/token";
	
	private String QPM_PASSWORD_GRANT = "?grant_type=password&username=portalvendas&password=123";
	
	private String QPM_ACCESS_TOKEN = "?access_token=";
	
	@SuppressWarnings({ "unchecked" })
	public AuthTokenInfo sendTokenRequest() {
		RestTemplate restTemplate = new RestTemplate();

		HttpEntity<String> request = new HttpEntity<String>(getHeadersWithClientCredentials());
		ResponseEntity<Object> response = restTemplate.exchange(AUTH_SERVER_URI + QPM_PASSWORD_GRANT, HttpMethod.POST,
				request, Object.class);
		LinkedHashMap<String, Object> map = (LinkedHashMap<String, Object>) response.getBody();
		AuthTokenInfo tokenInfo = null;

		if (map != null) {
			tokenInfo = new AuthTokenInfo();
			tokenInfo.setAccess_token((String) map.get("access_token"));
			tokenInfo.setToken_type((String) map.get("token_type"));
			tokenInfo.setRefresh_token((String) map.get("refresh_token"));
			tokenInfo.setExpires_in((int) map.get("expires_in"));
			tokenInfo.setScope((String) map.get("scope"));
			System.out.println(tokenInfo);
		} else {
			System.out.println("No user exist----------");

		}
		return tokenInfo;
	}
	
	public List<HttpMessageConverter<?>> getMessageConverters() {
		List<HttpMessageConverter<?>> converters = new ArrayList<HttpMessageConverter<?>>();
		converters.add(new MappingJackson2HttpMessageConverter());
		return converters;
	}

	public MensagemEnvio criaIdentificacaoServico(String conteudo) {
		Identificacao identificacao = new Identificacao();
		identificacao.setOrigem(Sistema.ERP);
		identificacao.setDestino(Sistema.PORTAL_VENDAS);
		identificacao.setMatriculaAssociada("1001");
		identificacao.setServicoAcessado("ACOMPANHAMENTO");
		identificacao.setUsuarioOrigemServico("CARLOS");
		MensagemEnvio m = new MensagemEnvio();
		m.setIdentificacao(identificacao);
//		m.setConteudo(criaConteudo(conteudo));
		return m;
	}

//	private AcompanhamentoPedidoTO criaConteudo(String conteudo) {
//		String[] split = conteudo.split("|");
//		AcompanhamentoPedidoTO to = new AcompanhamentoPedidoTO();
//		to.setRecId(Long.valueOf(split[1]));
//		to.setNumeroPedidoGestao(Long.valueOf(split[2]));
//		to.setStatusAcompanhamentoPedido(Long.valueOf(split[3]));
//		
//		return null;
//	}

	public HttpHeaders getHeadersWithClientCredentials() {
		String plainClientCredentials = "PORTAL_VENDAS:002";
		String base64ClientCredentials = new String(Base64.encodeBase64(plainClientCredentials.getBytes()));

		HttpHeaders headers = getHeaders();
		headers.add("Authorization", "Basic " + base64ClientCredentials);
		return headers;
	}

	private HttpHeaders getHeaders() {
		HttpHeaders headers = new HttpHeaders();
		headers.setAccept(Arrays.asList(org.springframework.http.MediaType.APPLICATION_JSON));
		return headers;
	}

	public String getREST_SERVICE_URI() {
		return REST_SERVICE_URI;
	}

	public void setREST_SERVICE_URI(String rEST_SERVICE_URI) {
		REST_SERVICE_URI = rEST_SERVICE_URI;
	}

	public String getAUTH_SERVER_URI() {
		return AUTH_SERVER_URI;
	}

	public void setAUTH_SERVER_URI(String aUTH_SERVER_URI) {
		AUTH_SERVER_URI = aUTH_SERVER_URI;
	}

	public String getQPM_PASSWORD_GRANT() {
		return QPM_PASSWORD_GRANT;
	}

	public void setQPM_PASSWORD_GRANT(String qPM_PASSWORD_GRANT) {
		QPM_PASSWORD_GRANT = qPM_PASSWORD_GRANT;
	}

	public String getQPM_ACCESS_TOKEN() {
		return QPM_ACCESS_TOKEN;
	}

	public void setQPM_ACCESS_TOKEN(String qPM_ACCESS_TOKEN) {
		QPM_ACCESS_TOKEN = qPM_ACCESS_TOKEN;
	}
	
	
	
	
	
	
	public static void TESTE(String[] args) {

		try {

			URL url = new URL("http://localhost:8282/servicos/acompanhamento/sinalizaPortal");
			HttpURLConnection conn = (HttpURLConnection) url.openConnection();
			conn.setRequestMethod("GET");
			conn.setRequestProperty("Accept", "application/json");

			if (conn.getResponseCode() != 200) {
				throw new RuntimeException("Failed : HTTP error code : " + conn.getResponseCode());
			}

			BufferedReader br = new BufferedReader(new InputStreamReader((conn.getInputStream())));

			String output;
			System.out.println("Output from Server .... \n");
			while ((output = br.readLine()) != null) {
				System.out.println(output);
			}

			conn.disconnect();

		} catch (MalformedURLException e) {

			e.printStackTrace();

		} catch (IOException e) {

			e.printStackTrace();

		}

	}

}