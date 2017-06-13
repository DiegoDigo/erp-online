package br.com.control.rest.client;

import java.util.Arrays;
import java.util.LinkedHashMap;

import org.apache.commons.codec.binary.Base64;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

public class AutenticacaoRest {
	
//	private String REST_SERVICE_URI = "http://172.30.24.113:8282/";
//
//	private String AUTH_SERVER_URI = "http://172.30.24.113:8282/oauth/token";
//	
//	private String QPM_PASSWORD_GRANT = "?grant_type=password&username=portalvendas&password=123";
//	
	private String REST_SERVICE_URI = "http://linkedby-ecommerce.com.br:8282/api-servicos-erp-apresentacao";

	private String AUTH_SERVER_URI = "http://linkedby-ecommerce.com.br:8282/api-servicos-erp-apresentacao/oauth/token";
	
	private String QPM_PASSWORD_GRANT = "?grant_type=password&username=portalvendas&password=123";
	
//	private String REST_SERVICE_URI = "http://linkedby-ecommerce.com.br:8282/api-servicos-erp-homolog";
//
//	private String AUTH_SERVER_URI = "http://linkedby-ecommerce.com.br:8282/api-servicos-erp-homolog/oauth/token";
//	
//	private String QPM_PASSWORD_GRANT = "?grant_type=password&username=portalvendas&password=123";
//	
	
//	private String QPM_ACCESS_TOKEN = "?access_token=";
	
	
	@SuppressWarnings({ "unchecked" })
	public AuthTokenInfo sendTokenRequest() {
		RestTemplate restTemplate = new RestTemplate();

		System.out.println("AUTH_SERVER_URI: "+AUTH_SERVER_URI);
		System.out.println("QPM_PASSWORD_GRANT: "+QPM_PASSWORD_GRANT);
		
		AuthTokenInfo tokenInfo = null;
		try {
			HttpEntity<String> request = new HttpEntity<String>(getHeadersWithClientCredentials());
			System.out.println("REQUEST XXX: "+request);
			ResponseEntity<Object> response = restTemplate.exchange(AUTH_SERVER_URI + QPM_PASSWORD_GRANT, HttpMethod.POST,
					request, Object.class);
			System.out.println("RESPONSE XXX: "+response);
			LinkedHashMap<String, Object> map = (LinkedHashMap<String, Object>) response.getBody();

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
		} catch (Exception e) {
			System.out.println("MESSAGE XXX: "+e.getMessage());
			System.out.println("CAUSE XXX: "+e.getCause());
			e.printStackTrace();
		}
		
		return tokenInfo;
	}
	
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
		headers.setContentType(MediaType.APPLICATION_JSON);
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
	
}
