package br.com.control.rest.client;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Properties;

import org.apache.commons.codec.binary.Base64;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import br.com.control.portal.integracao.Sistema;

public class AutenticacaoRest {

	// GALANTE
	// private String REST_SERVICE_URI = "http://172.30.24.103:8282/";
	// private String AUTH_SERVER_URI = "http://172.30.24.103:8282/oauth/token";
	// private String QPM_PASSWORD_GRANT =
	// "?grant_type=password&username=portalvendas&password=123";

	// RASA
	// private String REST_SERVICE_URI = "http://172.30.24.113:8282/";
	// private String AUTH_SERVER_URI = "http://172.30.24.113:8282/oauth/token";
	// private String QPM_PASSWORD_GRANT =
	// "?grant_type=password&username=portalvendas&password=123";

	// APRESENTAÇÃO
	// private String REST_SERVICE_URI =
	// "http://linkedby-ecommerce.com.br:8282/api-servicos-erp-apresentacao";
	// private String AUTH_SERVER_URI =
	// "http://linkedby-ecommerce.com.br:8282/api-servicos-erp-apresentacao/oauth/token";
	// private String QPM_PASSWORD_GRANT =
	// "?grant_type=password&username=portalvendas&password=123";

	// HOMOLOGAÇÃO
	// private String REST_SERVICE_URI =
	// "http://linkedby-ecommerce.com.br:8282/api-servicos-erp-homolog";
	// private String AUTH_SERVER_URI =
	// "http://linkedby-ecommerce.com.br:8282/api-servicos-erp-homolog/oauth/token";
	// private String QPM_PASSWORD_GRANT =
	// "?grant_type=password&username=portalvendas&password=123";

	// DESENVOLVIMENTO
	// private String REST_SERVICE_URI =
	// "http://linkedby-ecommerce.com.br:8282/api-servicos-erp-dev";
	// private String AUTH_SERVER_URI =
	// "http://linkedby-ecommerce.com.br:8282/api-servicos-erp-dev/oauth/token";
	// private String QPM_PASSWORD_GRANT =
	// "?grant_type=password&username=portalvendas&password=123";

	// PRODUÇÃO
	// private String REST_SERVICE_URI =
	// "http://linkedby-ecommerce.com.br:8282/api-servicos-erp-prd";
	// private String AUTH_SERVER_URI =
	// "http://linkedby-ecommerce.com.br:8282/api-servicos-erp-prd/oauth/token";
	// private String QPM_PASSWORD_GRANT =
	// "?grant_type=password&username=portalvendas&password=123";

	// private String QPM_ACCESS_TOKEN = "?access_token=";

	private Properties prop = new Properties();

	public AutenticacaoRest() {
		loadArquivoPropriedades();
	}

	@SuppressWarnings({ "unchecked" })
	public AuthTokenInfo sendTokenRequest() {
		RestTemplate restTemplate = new RestTemplate();

//		System.out.println("AUTH_SERVER_URI: " + getAUTH_SERVER_URI());
//		System.out.println("QPM_PASSWORD_GRANT: " + getQPM_PASSWORD_GRANT());

		AuthTokenInfo tokenInfo = null;
		try {
			HttpEntity<String> request = new HttpEntity<String>(getHeadersWithClientCredentials());
			ResponseEntity<Object> response = restTemplate.exchange(getAUTH_SERVER_URI() + getQPM_PASSWORD_GRANT(),
					HttpMethod.POST, request, Object.class);
			LinkedHashMap<String, Object> map = (LinkedHashMap<String, Object>) response.getBody();

			if (map != null) {
				tokenInfo = new AuthTokenInfo();
				tokenInfo.setAccess_token((String) map.get("access_token"));
				tokenInfo.setToken_type((String) map.get("token_type"));
				tokenInfo.setRefresh_token((String) map.get("refresh_token"));
				tokenInfo.setExpires_in((int) map.get("expires_in"));
				tokenInfo.setScope((String) map.get("scope"));
//				System.out.println(tokenInfo);
			} else {
				System.out.println("Usuário não encontrado para o token----------");

			}
		} catch (Exception e) {
			System.out.println("MESSAGE XXX: " + e.getMessage());
			System.out.println("CAUSE XXX: " + e.getCause());
			e.printStackTrace();
		}

		return tokenInfo;
	}

	public HttpHeaders getHeadersWithClientCredentials() {
		String plainClientCredentials = Sistema.PORTAL_VENDAS + ":" + Sistema.PORTAL_VENDAS.getSegredo();
		String base64ClientCredentials = new String(Base64.encodeBase64(plainClientCredentials.getBytes()));

		HttpHeaders headers = getHeaders();
		headers.add("Authorization", "Basic " + base64ClientCredentials);
		return headers;
	}

	private HttpHeaders getHeaders() {
		HttpHeaders headers = new HttpHeaders();
		headers.setAccept(Arrays.asList(org.springframework.http.MediaType.APPLICATION_JSON));
		headers.setContentType(MediaType.APPLICATION_JSON);
		return headers;
	}

	private void loadArquivoPropriedades() {
		prop = new Properties();
		try {

			String pathComJar = getClass().getProtectionDomain().getCodeSource().getLocation().getPath();
			String[] split = pathComJar.split("/");

			String caminho = "";
			for (int i = 0; i < split.length - 1; i++) {
				caminho += "/" + split[i];
			}

			// System.out.println("WWWWWWWWWWWWWWWWWWWWWW: " +caminho);
			InputStream inputStream = new FileInputStream(caminho + "/integracao-is-cobol.properties");
			prop.load(inputStream);
		} catch (FileNotFoundException ex) {
			ex.printStackTrace();
		} catch (IOException ex) {
			ex.printStackTrace();
		}
	}

	public String getREST_SERVICE_URI() {
		String REST_SERVICE_URI = prop.getProperty("url_erp_online") + prop.getProperty("contexto_erp_online");
//		System.out.println("REST_SERVICE_URI: " + REST_SERVICE_URI);
		return REST_SERVICE_URI;
	}

	public String getAUTH_SERVER_URI() {
		String AUTH_SERVER_URI = prop.getProperty("url_erp_online") + prop.getProperty("contexto_erp_online")
				+ "/oauth/token";
//		System.out.println("AUTH_SERVER_URI: " + AUTH_SERVER_URI);
		return AUTH_SERVER_URI;
	}

	public String getQPM_PASSWORD_GRANT() {
		String QPM_PASSWORD_GRANT = "?grant_type=password&username=" + prop.getProperty("usuario_erp_online")
				+ "&password=" + prop.getProperty("senha_erp_online");
//		System.out.println("QPM_PASSWORD_GRANT: " + QPM_PASSWORD_GRANT);
		return QPM_PASSWORD_GRANT;
	}

}
