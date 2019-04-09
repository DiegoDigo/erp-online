package br.com.control.rest.client;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.util.Arrays;
import java.util.Properties;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponents;
import org.springframework.web.util.UriComponentsBuilder;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

import br.com.control.portal.enums.CadastrosEnum;



public abstract class ClienteRestSincronismo {
	
	Properties prop = new Properties();
	
	public void sinalizaErpOnline(String conteudo, CadastrosEnum cadastroASincronizar) {
//		System.out.println("--> Entrou no cliente rest para atualizar "+conteudo.split("\\|")[0]);
		HttpHeaders headers = new HttpHeaders();
		headers.setAccept(Arrays.asList(org.springframework.http.MediaType.APPLICATION_JSON));

		ObjectMapper mapper = new ObjectMapper();
		mapper.configure(MapperFeature.DEFAULT_VIEW_INCLUSION, true);

		MensagemEnvio m = criaIdentificacaoServico(conteudo, cadastroASincronizar);
		
		try {
			AutenticacaoRest autenticacaoRest = new AutenticacaoRest();
//			System.out.println("ENTROU NO TRY PARA PEGAR A AUTENTICACAO REST");
			AuthTokenInfo tokenInfo = autenticacaoRest.sendTokenRequest();
			String SERVICO = getServicoSincronismo();
			String AUTH = "?access_token=" + tokenInfo.getAccess_token();
			String msgJson = AUTH + "&mensagem=" + mapper.writer().writeValueAsString(m);
			String url = autenticacaoRest.getREST_SERVICE_URI()+ SERVICO + msgJson;
			
			
			UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(url);
			UriComponents uriComponents = builder.build();
			URI uri = uriComponents.toUri();

//			System.out.println("----> URI: "+uri);
			
			RestTemplate restTemplate = new RestTemplate();
			
			HttpEntity<String> request = new HttpEntity<String>(getHeaders());
			System.out.println("############### TOKEN DO POST: "+tokenInfo.getAccess_token());
			System.out.println("--> Chamando url rest: "+url);
			System.out.println("FAZENDO O POST");
			restTemplate.postForLocation(uri, request);
			System.out.println("FEZ O POST");
			
//			restTemplate.getForObject(uri, MensagemRetorno.class);
		} catch (JsonProcessingException e) {
			System.out.println("ERRO" + e.getMessage());
			System.out.println("ERRO" + e.getOriginalMessage());
			e.printStackTrace();
		}
//		System.out.println("### SAIU DO ClienteRestSincronismo::"+conteudo.split("\\|")[0]+" ###");
	}
	
	
	private HttpHeaders getHeaders() {
		HttpHeaders headers = new HttpHeaders();
		headers.setAccept(Arrays.asList(org.springframework.http.MediaType.APPLICATION_JSON));
		headers.setContentType(MediaType.APPLICATION_JSON);
		return headers;
	}
	
	public MensagemEnvio criaIdentificacaoServico(String conteudo, CadastrosEnum cadastroASincronizar) {
		Identificacao identificacao = new Identificacao();
		identificacao.setOrigem(Sistema.ERP);
		identificacao.setDestino(Sistema.PORTAL_VENDAS);
		atualizaValoresPropriedades(identificacao);
		
		if(cadastroASincronizar != null){
			identificacao.setCadastroASincronizar(cadastroASincronizar);
		}
		
		MensagemEnvio m = new MensagemEnvio();
		m.setIdentificacao(identificacao);
		m.setConteudo(defineCodigoErp(conteudo));
		return m;
	}
	
	
	
	/**
	 * @param identificacao
	 * 
	 * Le do arquivo de properties com as configurações da revenda
	 * 
	 */
	public void atualizaValoresPropriedades(Identificacao identificacao) {

		InputStream input = null;

		try {
			
//			System.out.println("ZZZZZZZZZZZZZZZZZZZZZ: " +getClass().getProtectionDomain().getCodeSource().getLocation().getPath());
			
			String pathComJar = getClass().getProtectionDomain().getCodeSource().getLocation().getPath();
        	String[] split = pathComJar.split("/");
			
			String caminho = "";
        	for(int i = 0; i<split.length - 1; i++){
        		caminho += "/"+split[i];
        	}
			
			input = new FileInputStream(caminho+"/integracao-is-cobol.properties");

			prop.load(input);
			System.out.println("--> Numero da Licença: "+prop.getProperty("matricula_revenda"));
			
			identificacao.setMatriculaAssociada(prop.getProperty("matricula_revenda"));
			identificacao.setServicoAcessado("SINCRONISMO CADASTRO");
			identificacao.setUsuarioOrigemServico("USUARIO ERP");
//			identificacao.setMatriculaAssociada(MATRICULA_EMPRESA);
//			identificacao.setServicoAcessado("SINCRONISMO");
//			identificacao.setUsuarioOrigemServico("USUARIO ERP");

		} catch (IOException ex) {
			ex.printStackTrace();
		} finally {
			if (input != null) {
				try {
					input.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}

	  }
	
	public abstract String defineCodigoErp(String conteudo);
	
	public abstract String getServicoSincronismo();
	

	
}