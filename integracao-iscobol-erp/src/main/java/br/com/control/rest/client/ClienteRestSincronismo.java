package br.com.control.rest.client;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.util.Arrays;
import java.util.Properties;

import org.springframework.http.HttpHeaders;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponents;
import org.springframework.web.util.UriComponentsBuilder;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

import br.com.control.portal.enums.CadastrosEnum;



public abstract class ClienteRestSincronismo {
	
	Properties prop = new Properties();
	
	
	public void sinalizaPortalAtualizacao(String conteudo, CadastrosEnum cadastroASincronizar) {
		System.out.println("### ENTROU NO ClienteRestSincronismo::"+conteudo.split("\\|")[0]+" ###");
		HttpHeaders headers = new HttpHeaders();
		headers.setAccept(Arrays.asList(org.springframework.http.MediaType.APPLICATION_JSON));

		ObjectMapper mapper = new ObjectMapper();
		mapper.configure(MapperFeature.DEFAULT_VIEW_INCLUSION, true);

		MensagemEnvio m = criaIdentificacaoServico(conteudo, cadastroASincronizar);
		
		try {
			AutenticacaoRest autenticacaoRest = new AutenticacaoRest();
			
			AuthTokenInfo tokenInfo = autenticacaoRest.sendTokenRequest();
			String SERVICO = getServicoSincronismo();
			String AUTH = "?access_token=" + tokenInfo.getAccess_token();
			String msgJson = AUTH + "&mensagem=" + mapper.writer().writeValueAsString(m);
			String url = autenticacaoRest.getREST_SERVICE_URI()+ SERVICO + msgJson;
			
			UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(url);
			UriComponents uriComponents = builder.build();
			URI uri = uriComponents.toUri();

			RestTemplate restTemplate = new RestTemplate();
			
			restTemplate.getForObject(uri, MensagemRetorno.class);
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
		System.out.println("### SAIU DO ClienteRestSincronismo::"+conteudo.split("\\|")[0]+" ###");
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

			input = new FileInputStream("integracao-is-cobol.properties");

			prop.load(input);
			identificacao.setMatriculaAssociada(prop.getProperty("matricula_revenda"));
			identificacao.setServicoAcessado(prop.getProperty("servico_acessado"));
			identificacao.setUsuarioOrigemServico(prop.getProperty("usuario_origem"));

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