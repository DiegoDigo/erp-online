package br.com.control.globobroker.services;

import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import org.apache.commons.codec.binary.Base64;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;

@Service
public class AutenticacaoRestGloboBroker {

	public AuthTokenInfo sendTokenRequest(String url, String usuario, String senha) {
		RestTemplate restTemplate = new RestTemplate();

		AuthTokenInfo tokenInfo = null;
		try {
			LoginGloboBroker login = new LoginGloboBroker();
			login.setLogin(usuario);
			login.setSenha(senha);

			ObjectMapper mapper = new ObjectMapper();
			mapper.configure(MapperFeature.DEFAULT_VIEW_INCLUSION, true);
			mapper.enable(SerializationFeature.INDENT_OUTPUT);
			
			HttpEntity<String> request = new HttpEntity<String>(mapper.writeValueAsString(login), getHeadersWithClientCredentials(usuario, senha));
			System.out.println(" ---> TENTATIVA de recuperação de TOKEN");
			System.out.println(" ---> " + url + "/Logar");
			ResponseEntity<Object> response = restTemplate.exchange(
					//getAUTH_SERVER_URI(url), HttpMethod.POST, request,
					url + "/Logar", HttpMethod.POST, request,
					Object.class);
			
			tokenInfo = mapper.readValue((String)response.getBody(), AuthTokenInfo.class);
			System.out.println(" ---> " + tokenInfo);
			return tokenInfo;
		} catch (Exception e) {
			System.out.println("MESSAGE XXX: " + e.getMessage());
			System.out.println("CAUSE XXX: " + e.getCause());
			e.printStackTrace();
		}

		return tokenInfo;
	}

	public HttpHeaders getHeadersWithClientCredentials(String usuario, String senha) {
		String plainClientCredentials = usuario + ":" + senha;
		String base64ClientCredentials = new String(Base64.encodeBase64(plainClientCredentials.getBytes()));

		HttpHeaders headers = getHeaders();
		headers.add("Authorization", "Basic " + base64ClientCredentials);
		return headers;
	}

	private HttpHeaders getHeaders() {
		HttpHeaders headers = new HttpHeaders();
		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		headers.setContentType(MediaType.APPLICATION_JSON);
		return headers;
	}

	public String getAUTH_SERVER_URI(String url) {
		System.out.println(url + "/Logar");
		return url + "/Logar";
	}

	public String getQPM_PASSWORD_GRANT(String usuario, String senha) {
		return "?grant_type=password&username=" + usuario + "&password=" + senha;
	}

}
