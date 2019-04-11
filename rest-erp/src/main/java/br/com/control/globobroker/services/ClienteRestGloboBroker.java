package br.com.control.globobroker.services;

import java.io.IOException;
import java.net.URI;
import java.util.Arrays;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponents;
import org.springframework.web.util.UriComponentsBuilder;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import br.com.control.globobroker.PedidoCapaGloboBrokerService;
import br.com.control.globobroker.model.envio.ConfirmarEnvioErpTerceiroTO;
import br.com.control.globobroker.model.envio.PedidoCapaGloboBroker;
import br.com.control.globobroker.model.envio.RespostaErpTerceiroTO;

@Service
public class ClienteRestGloboBroker {

	@Autowired
	private PedidoCapaGloboBrokerService pedidoCapaGloboBrokerService;

	private static final Logger logger = LoggerFactory.getLogger(ClienteRestGloboBroker.class);

	public void sinalizaErpTerceiro(String url, String usuario, String senha, PedidoCapaGloboBroker pedido) {
		HttpHeaders headers = new HttpHeaders();
		headers.setAccept(Arrays.asList(org.springframework.http.MediaType.APPLICATION_JSON));
		headers.setContentType(MediaType.APPLICATION_JSON);
		ObjectMapper mapper = new ObjectMapper();
		mapper.configure(MapperFeature.DEFAULT_VIEW_INCLUSION, true);
		mapper.enable(SerializationFeature.INDENT_OUTPUT);

		AutenticacaoRestGloboBroker autenticacaoRest = new AutenticacaoRestGloboBroker();
		AuthTokenInfo tokenInfo = autenticacaoRest.sendTokenRequest(url, usuario, senha);

		headers.add("X-App-Token", tokenInfo.getToken());
		HttpEntity<String> request;
		try {
			request = new HttpEntity<String>(mapper.writeValueAsString(pedido), headers);
			RestTemplate restTemplate = new RestTemplate();
			UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(url);
			UriComponents uriComponents = builder.build();
			URI uri = uriComponents.toUri();
			ResponseEntity<Object> response = restTemplate.exchange(uri + "/pedido", HttpMethod.POST, request,
					Object.class);

			System.out.println(response.getBody());
			System.out.println(response.getStatusCodeValue());

			try {

				logger.info("Enviando objeto json para ERP Terceiros...");
				logger.info(mapper.writeValueAsString(pedido));
				System.out.println(mapper.writeValueAsString(pedido));

				//
				ObjectMapper objectMapper = new ObjectMapper();
				RespostaErpTerceiroTO resposta = objectMapper.readValue(response.getBody().toString(),
						RespostaErpTerceiroTO.class);

				logger.info("RESPOSTA da requisição...");
				logger.info(resposta.getMessage());
				System.out.println(resposta.getMessage());

				// Confirma o envio para o ERP terceiro
				if (resposta.getStatus().equals(true)) {
					
					System.out.println("Número do pedido ERP Terceiro: " + resposta.getMessage().replace("Número do pedido ERP Terceiro: ", ""));
					System.out.println("Número do pedido JControl: " + pedido.getNumeroPedidoJcontrol());
					
					this.execute(pedido.getNumeroPedidoJcontrol(), resposta.getMessage().replace("Número do pedido ERP Terceiro: ", ""), "");
				} else {
					this.execute(pedido.getNumeroPedidoJcontrol(), pedido.getNumeroPedidoJcontrol(), "");
				}

			} catch (JsonProcessingException e) {
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (JsonProcessingException e1) {
			e1.printStackTrace();
		}
	}

	// Envio a confirmação do pedido para o erp
	private void execute(String numeroPedidoJcontrol, String numeroPedidoErpTerceiro, String mensagem) {
		ConfirmarEnvioErpTerceiroTO pedidoTO = criaObjetoConfirmacaoEnvioErpTerceiro(numeroPedidoJcontrol,
				numeroPedidoErpTerceiro, mensagem);
		pedidoCapaGloboBrokerService.confirmarEnvio(pedidoTO);
	}

	private ConfirmarEnvioErpTerceiroTO criaObjetoConfirmacaoEnvioErpTerceiro(String numeroPedidoJcontrol,
			String numeroPedidoErpTerceiro, String mensagem) {
		ConfirmarEnvioErpTerceiroTO pedidoTO = new ConfirmarEnvioErpTerceiroTO();
		pedidoTO.setNumeroPedidoJcontrol(numeroPedidoJcontrol);
		pedidoTO.setNumeroPedidoErpTerc(numeroPedidoErpTerceiro);
		pedidoTO.setMensagemErro(mensagem);
		return pedidoTO;
	}
}